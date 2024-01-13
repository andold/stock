package kr.andold.stock.thread;

import java.lang.management.ManagementFactory;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import kr.andold.stock.crawler.ChromeDriverWrapper;
import kr.andold.stock.crawler.CrawlerService;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.ParserService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CrawlPriceThread implements Callable<ParserResult> {
	private static final String URL = "http://data.krx.co.kr/";
	private static final String MARK_START_END_POINT = String.format("KEYWORD\t%s\t%s\t%s\n", "주가일별시세", "CrawlPriceThread", URL);
	private static final String MARK_ANDOLD_SINCE = CrawlerService.MARK_ANDOLD_SINCE;
	private static final int TIMEOUT = 4000;
	private static final int JOB_SIZE = 8;

	private ConcurrentLinkedQueue<JobControl> jobs;
	private Date start;

	public CrawlPriceThread(List<ItemDomain> items, Date start) {
		jobs = new ConcurrentLinkedQueue<>();
		items.forEach(item -> jobs.add(new JobControl(item)));
		if (start == null) {
			start = Date.from(LocalDate.of(LocalDate.now().getYear() - 8, 1, 1).atStartOfDay(Utility.ZONE_ID_KST).toInstant());
		}
		this.start = start;
	}

	@Data
	public static class JobControl {
		private Boolean companyFail;
		private Boolean etfFail;
		private ItemDomain item;

		public JobControl(ItemDomain item) {
			this.item = item;
			companyFail = false;
			etfFail = false;
		}
	}

	@Override
	public ParserResult call() throws Exception {
		log.info("{} CrawlPriceThread(#{})", Utility.indentStart(), Utility.size(jobs));
		long started = System.currentTimeMillis();

		ParserResult result = ParserResult.builder().build().clear();

		KrxCompany company = new KrxCompany(jobs, start);
		KrxEtf etf = new KrxEtf(jobs, start);
		while (jobs.peek() != null) {
			long forStarted = System.currentTimeMillis();

			JobControl job = jobs.poll();
			String type = job.getItem().getType();
			if (CrawlerService.getDebug() && new Random().nextDouble() < 0.99) {
				continue;
			} else if (job.getCompanyFail() && job.getEtfFail()) {
				log.error("{}", job);
			} else  if (job.getCompanyFail()) {
				result.addAll(etf.extract(job));
			} else  if (job.getEtfFail()) {
				result.addAll(company.extract(job));
			} else  if (type != null && type.equalsIgnoreCase("ETF")) {
				result.addAll(etf.extract(job));
			} else {
				result.addAll(company.extract(job));
			}

			log.info("{} #『{}』 CrawlPriceThread(#{}) - {}", Utility.indentMiddle(), result, Utility.size(jobs), Utility.toStringPastTimeReadable(forStarted));
		}
		company.close();
		etf.close();

		log.info("{} 『{}』 CrawlPriceThread(#{}) - {}", Utility.indentEnd(), result, Utility.size(jobs), Utility.toStringPastTimeReadable(started));
		return result;
	}

	@Deprecated
	public static ParserResult crawl(List<ItemDomain> items, Date start) {
		log.info("{} CrawlPriceThread.crawl(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		long freeMemorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getFreeMemorySize();
		int candidateProcessorsByFreeMemory = (int) (freeMemorySize / 512L / 1024L / 1024L);
		int processors = Math.min(Math.max(1, candidateProcessorsByFreeMemory), Runtime.getRuntime().availableProcessors() - 1);
		if (CrawlerService.getDebug()) {
			processors = 1;
		}

		ExecutorService service = Executors.newFixedThreadPool(processors);
		List<Future<ParserResult>> futureList = new ArrayList<>();
		ConcurrentLinkedQueue<ItemDomain> queue = new ConcurrentLinkedQueue<ItemDomain>();
		queue.addAll(items);
		for (int cx = 0; cx < processors; cx++) {
			CrawlPriceThread thread = new CrawlPriceThread(items, start);
			Future<ParserResult> future = service.submit(thread);
			futureList.add(future);
		}
		ParserResult container = ParserResult.builder().build();
		container.clear();
		for (Future<ParserResult> task : futureList) {
			try {
				ParserResult result = task.get();
				container.addAll(result);
				log.info("{} 『{}』 CrawlPriceThread.crawl(#{})", Utility.indentMiddle(), result, Utility.size(items));
			} catch (Exception e) {
			}
		}

		log.info("{} 『{}』 CrawlPriceThread.crawl(#{}) - {}", Utility.indentEnd(), container, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return container;
	}

	public static class KrxCompany {
		private static final ParserResult PARSER_RESULT_EMPTY = ParserResult.builder().build().clear();
		private ConcurrentLinkedQueue<JobControl> jobs;
		private Date start;;
		private Integer count;
		private ChromeDriverWrapper driver;;
		private Actions actions;

		public KrxCompany(ConcurrentLinkedQueue<JobControl> jobs, Date start) {
			count = 1;
			this.jobs = jobs;
			this.start = start;
			init();
		}

		public ParserResult extract(JobControl job) {
			log.info("{} extract(#{})", Utility.indentStart(), job);
			long started = System.currentTimeMillis();

			if (count++ % JOB_SIZE == 0) {
				close();
				init();
			}

			ItemDomain item = job.getItem();
			try {
				/*
				 * 1. 지수명 검색 2. 조회 클릭 3. 내용 저장
				 */
				// 1. 종목명 검색 - 코드 입력
				WebElement keywordElement = driver.findElement(By.xpath("//input[@id='tboxisuCd_finder_stkisu0_0']"), TIMEOUT);
				keywordElement.clear();
				keywordElement.sendKeys(item.getCode());
				keywordElement.sendKeys(Keys.TAB);

				// 1. 종목명 검색 - 검색 아이콘 클릭
				driver.findElement(By.xpath("//img[@id='btnisuCd_finder_stkisu0_0']"), TIMEOUT).click();

				// 자동으로 갔다 와야하는데 ....
				if (!driver.waitUntilExist(By.xpath("//div[@id='jsLayer_finder_stkisu0_0']"), true, TIMEOUT)) {
					driver.clickIfExist(By.xpath("//div[@id='jsLayer_finder_stkisu0_0']/div[1]/button[@title='Close']"));
					job.setCompanyFail(true);
					jobs.add(job);
					return PARSER_RESULT_EMPTY;
				}
				if (!driver.waitUntilExist(By.xpath("//div[@id='jsLayer_finder_stkisu0_0']"), false, TIMEOUT)) {
					driver.clickIfExist(By.xpath("//div[@id='jsLayer_finder_stkisu0_0']/div[1]/button[@title='Close']"));
					job.setCompanyFail(true);
					jobs.add(job);
					return PARSER_RESULT_EMPTY;
				}

				// 2. 자동으로 갔다 와서 조회 클릭
				driver.findElement(By.xpath("//a[@id='jsSearchButton']"), TIMEOUT).click();

				// 3. 내용 저장
				StringBuffer sb = new StringBuffer();
				sb.append(MARK_START_END_POINT);
				for (String prev = ""; true;) {
					long forStarted = System.currentTimeMillis();

					WebElement table = driver.findElement(By.xpath("/html/body/div[2]/section[2]/section/section/div/div/div[1]/div[1]/div[1]/div[2]/div/div/table"), TIMEOUT);
					sb.append(driver.extractTextContentFromTableElement(table, String.format("주식\t%s\t", item.getCode())));
					sb.append(MARK_ANDOLD_SINCE);

					List<WebElement> trs = table.findElements(By.xpath("//tr"));
					WebElement lastTr = trs.get(trs.size() - 1);
					String curr = lastTr.getAttribute("textContent");
					if (prev.contentEquals(curr)) {
						break;
					}

					prev = curr;
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lastTr);
					driver.clickIfExist(By.xpath("//button[@id='jsViewSizeButton']"));

					log.info("{} {} {} COMPANY - {}", Utility.indentMiddle(), Utility.ellipsisEscape(curr, 32), item, Utility.toStringPastTimeReadable(forStarted));
				}
				sb.append(MARK_START_END_POINT);
				ParserResult result = ParserService.parse(new String(sb), CrawlerService.getDebug());
				log.debug("{} 『{}』 extract({}) - {}", Utility.indentEnd(), result, job, Utility.toStringPastTimeReadable(started));
				return result;
			} catch (Exception e) {
				log.error("{} Exception:: {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
				driver.switchTo().defaultContent();
			}

			return PARSER_RESULT_EMPTY;
		}

		private boolean init() {
			driver = CrawlerService.defaultChromeDriver();
			actions = new Actions(driver);

			try {
				driver.navigate().to(URL);

				// 1. KRX 정보데이터시스템 > 기본통계 > 주식 > 종목시세 > 개별종목 시세 추이 클릭
				driver.waitUntilTextInclude(By.xpath("//aside[@id='jsMainLnbWrap']/ol/li/ol/li/a"), TIMEOUT * 4, "종목시세");
				actions.moveToElement(driver.findElement(By.xpath("//aside[@id='jsMainLnbWrap']/ol/li/ol/li/a[contains(text(),'종목시세')]"), TIMEOUT));
				actions.moveToElement(driver.findElement(By.xpath("//aside[@id='jsMainLnbWrap']/ol/li/ol/li/div/ul/li/a[contains(text(),'개별종목 시세 추이')]"), TIMEOUT));
				actions.click().build().perform();

				// 2. 조회기간 설정
				WebElement startDateElement = driver.findElement(By.xpath("//input[@id='strdDd']"), TIMEOUT);
				startDateElement.clear();
				startDateElement.sendKeys(Instant.ofEpochMilli(start.getTime()).atZone(Utility.ZONE_ID_KST).toLocalDate().format(DateTimeFormatter.BASIC_ISO_DATE)); // 조회기간 시작일
				startDateElement.sendKeys(Keys.TAB); // 시작일 입력
				return true;
			} catch (Exception e) {
				log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
				driver.quit();
			}

			return false;
		}

		private void close() {
			driver.quit();
		}
	}

	public static class KrxEtf {
		private static final ParserResult PARSER_RESULT_EMPTY = ParserResult.builder().build().clear();
		private ConcurrentLinkedQueue<JobControl> jobs;
		private Date start;
		private Integer count;
		private ChromeDriverWrapper driver;;
		private Actions actions;

		public KrxEtf(ConcurrentLinkedQueue<JobControl> jobs, Date start) {
			count = 1;
			this.jobs = jobs;
			this.start = start;

			init();
		}

		public ParserResult extract(JobControl job) {
			if (count++ % JOB_SIZE == 0) {
				close();
				init();
			}

			ParserResult container = ParserResult.builder().build().clear();
			LocalDate start = Instant.ofEpochMilli(this.start.getTime()).atZone(Utility.ZONE_ID_KST).toLocalDate();
			ItemDomain item = job.getItem();
			try {
				for (LocalDate cx = LocalDate.now(); cx.isAfter(start); cx = cx.minusYears(2)) {
					long started = System.currentTimeMillis();

					// 2. 조회기간 설정
					WebElement startDateElement = driver.findElement(By.xpath("//*[@id='strtDd']"), TIMEOUT);
					startDateElement.clear();
					String startDateString = cx.minusYears(2).plusDays(1).format(DateTimeFormatter.BASIC_ISO_DATE);
					startDateElement.sendKeys(startDateString); // 조회기간 시작일
					startDateElement.sendKeys(Keys.TAB); // 시작일 입력

					WebElement endDateElement = driver.findElement(By.xpath("//*[@id='endDd']"), TIMEOUT);
					endDateElement.clear();
					String endDateString = cx.format(DateTimeFormatter.BASIC_ISO_DATE);
					endDateElement.sendKeys(endDateString); // 조회기간 종료일
					endDateElement.sendKeys(Keys.TAB); // 종료일 입력
					
					log.info("{} {} {}", startDateString, endDateString, cx);

					Result<ParserResult> result = extract(item);
					switch (result.getStatus()) {
					case EXCEPTION:
						break;
					case FAIL:
						driver.clickIfExist(By.xpath("//*[@id='jsLayer_finder_secuprodisu1_0']/div[1]/button"));
						job.setEtfFail(true);
						jobs.add(job);
						break;
					case NO_MORE_DATA:
						cx = start.plusDays(0);
						break;
					case SUCCESS:
						container.addAll(result.getResult());
						break;
					default:
						break;
					}
					container.addAll(result.getResult());

					log.info("{} {} ~ {} {} - {}", Utility.indentMiddle(), startDateString, endDateString, item, Utility.toStringPastTimeReadable(started));
				}
				return container;
			} catch (Exception e) {
				log.error("{} Exception:: {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
				driver.switchTo().defaultContent();
			}

			return PARSER_RESULT_EMPTY;
		}

		private Result<ParserResult> extract(ItemDomain item) {
			log.info("{} extract(#{})", Utility.indentStart(), item);
			long started = System.currentTimeMillis();

			try {
				/*
				 * 1. 종목명 검색 2. 조회 클릭 3. 내용 저장
				 */
				// 1. 종목명 검색 - 코드 입력
				WebElement keywordElement = driver.findElement(By.xpath("//input[@id='tboxisuCd_finder_secuprodisu1_0']"), TIMEOUT);
				keywordElement.clear();
				keywordElement.sendKeys(item.getCode());
				keywordElement.sendKeys(Keys.TAB);

				// 1. 종목명 검색 - 검색 아이콘 클릭
				driver.findElement(By.xpath("//img[@id='btnisuCd_finder_secuprodisu1_0']"), TIMEOUT).click();

				// 자동으로 갔다 와야하는데 ....
				if (!driver.waitUntilExist(By.xpath("//div[@id='jsLayer_finder_secuprodisu1_0']"), true, TIMEOUT)) {
					return Result.<ParserResult>builder().status(STATUS.FAIL_NO_RESULT).result(PARSER_RESULT_EMPTY).build();
				}
				if (!driver.waitUntilExist(By.xpath("//div[@id='jsLayer_finder_secuprodisu1_0']"), false, TIMEOUT)) {
					return Result.<ParserResult>builder().status(STATUS.FAIL_NO_RESULT).result(PARSER_RESULT_EMPTY).build();
				}

				// 2. 자동으로 갔다 와서 조회 클릭
				driver.findElement(By.xpath("//*[@id='jsSearchButton']"), TIMEOUT).click();

				/*
				// 더이상 데이터가 없는 경우
				WebElement nodata = driver.findElement(By.xpath("//*[@id='jsMdiContent']/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/table/tbody/tr/td"), TIMEOUT * 4);
				if ("데이터가 없습니다.".contentEquals(nodata.getText())) {
					return Result.<ParserResult>builder().status(Result.NO_MORE_DATA).build();
				}
				*/

				// 3. 내용 저장
				StringBuffer sb = new StringBuffer();
				sb.append(MARK_START_END_POINT);
				for (String prev = ""; true;) {
					long forStarted = System.currentTimeMillis();

					WebElement table = driver.findElement(By.xpath("//*[@id='jsMdiContent']/div/div[1]/div[1]/div[1]/div[2]/div/div/table"), TIMEOUT);
					sb.append(driver.extractTextContentFromTableElement(table, String.format("ETF\t%s\t", item.getCode())));
					sb.append(MARK_ANDOLD_SINCE);

					List<WebElement> trs = table.findElements(By.xpath("//tr"));
					WebElement lastTr = trs.get(trs.size() - 1);
					String curr = lastTr.getAttribute("textContent");
					if (prev.contentEquals(curr)) {
						break;
					}

					prev = curr;
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lastTr);
					driver.clickIfExist(By.xpath("//*[@id='jsViewSizeButton']"));

					log.info("{} {} {} ETF - {}", Utility.indentMiddle(), Utility.ellipsisEscape(prev, 32), item, Utility.toStringPastTimeReadable(forStarted));
				}
				sb.append(MARK_START_END_POINT);
				ParserResult result = ParserService.parse(new String(sb), CrawlerService.getDebug());
				log.debug("{} 『{}』 extract({}) - {}", Utility.indentEnd(), result, item, Utility.toStringPastTimeReadable(started));
				return Result.<ParserResult>builder().status(STATUS.SUCCESS).result(result).build();
			} catch (Exception e) {
				log.error("{} Exception:: {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
				driver.switchTo().defaultContent();
			}

			return Result.<ParserResult>builder().status(STATUS.EXCEPTION).result(PARSER_RESULT_EMPTY).build();
		}

		private boolean init() {
			driver = CrawlerService.defaultChromeDriver();
			actions = new Actions(driver);

			try {
				driver.navigate().to(URL);

				// 1. KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 개별종목 시세 추이
				driver.waitUntilTextInclude(By.xpath("/html/body/div[2]/section[2]/div[2]/div[1]/section/aside/ol[1]/li[3]/ol/li[1]/a"), TIMEOUT * 4, "ETF"); // ETF
				actions.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/section[2]/div[2]/div[1]/section/aside/ol[1]/li[3]/ol/li[1]/a"), TIMEOUT)); // ETF
				actions.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/section[2]/div[2]/div[1]/section/aside/ol[1]/li[3]/ol/li[1]/div/ul/li[3]/a"), TIMEOUT)); // 개별종목 시세 추이
				actions.click().build().perform();

				return true;
			} catch (Exception e) {
				log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
				driver.quit();
			}

			return false;
		}

		private void close() {
			driver.quit();
		}
	}

}
