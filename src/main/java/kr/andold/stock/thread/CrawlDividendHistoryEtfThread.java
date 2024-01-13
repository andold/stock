package kr.andold.stock.thread;

import java.lang.management.ManagementFactory;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import kr.andold.stock.crawler.ChromeDriverWrapper;
import kr.andold.stock.crawler.CrawlerService;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.param.ItemParam;
import kr.andold.stock.service.ParserService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CrawlDividendHistoryEtfThread implements Callable<ParserResult> {
	private static final String URL = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06030V.xml&menuNo=179";
	private static final String MARK_END_POINT = "KEYWORD\tETF 배당금 내역\tKSD 증권정보포털 SEIBro\tURL\thttps://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06030V.xml&menuNo=179\n";
	private static final int TIMEOUT = 4000;
	private static final int JOB_SIZE = 4;
	private static final String MARK_ANDOLD_SINCE = CrawlerService.MARK_ANDOLD_SINCE;

	private ConcurrentLinkedQueue<ItemDomain> items;
	private String startDate = null;;

	private ChromeDriverWrapper driver;
	private WebElement startDateElement; // 조회기간 시작일
	private WebElement popupCloseIconElement; // 검색결과창의 닫기 아이콘

	public CrawlDividendHistoryEtfThread(ConcurrentLinkedQueue<ItemDomain> list, Date start) {
		this.items = list;
		this.startDate = String.format("%1$tY%1$tm%1$td",
				(start == null)
					? Date.from(LocalDate.now().minusDays(7).atStartOfDay().toInstant(Utility.ZONE_OFFSET_KST))
					: start);
	}

	public ParserResult call() throws Exception {
		log.info("{} CrawlDividendHistoryEtfThread(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		ParserResult result = ParserResult.builder().build().clear();
		driver = CrawlerService.defaultChromeDriver();
		try {
			driver.navigate().to(URL);

			// 조회기간 시작일
			startDateElement = driver.findElement(By.xpath("//input[@id='sd1_inputCalendar1_input']"), TIMEOUT * 4);
			startDateElement.clear();
			startDateElement.sendKeys(startDate); // 조회기간 시작일
			startDateElement.sendKeys(Keys.TAB); // 시작일 입력

			// 검색결과창의 닫기 아이콘
			popupCloseIconElement = driver.findElement(By.xpath("//div[@id='group164']/a[@id='anchor3']"), TIMEOUT);
			
			// 넓게 보기 아이콘
			driver.findElement(By.id("btn_wide_img"), TIMEOUT).click();
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
			return result;
		}

		while (items.peek() != null) {
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_END_POINT);
			for (int cx = 0; cx < JOB_SIZE; cx++) {
				ItemDomain item = items.poll();
				if (item == null) {
					break;
				}
				
				String code = item.getCode();
				String symbol = item.getSymbol();
				String type = item.getType();
				if (code == null || code.isBlank() || symbol == null || symbol.isBlank() || (type != null && !type.equalsIgnoreCase("ETF"))) {
					log.trace("{} {}/{} 대상아님 『{}』 CrawlDividendHistoryEtfThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}
				
				if (CrawlerService.getDebug() && new Random().nextDouble() < 0.9) {
					log.trace("{} {}/{} 뽑기 제외 『{}』 CrawlDividendHistoryEtfThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}

				log.info("{} {}/{} 진행 『{}』 CrawlDividendHistoryEtfThread() - {}", Utility.indentMiddle(), cx, Utility.size(items), item, Utility.toStringPastTimeReadable(started));
				String text = extract(item);
				sb.append(text);
			}
			sb.append(MARK_END_POINT);
			String text = new String(sb);
			ParserResult resultDividendHistoryEtf = ParserService.parse(text, CrawlerService.getDebug());
			result.addAll(resultDividendHistoryEtf);
			log.debug("{} #{} {} CrawlDividendHistoryEtfThread() - {}", Utility.indentMiddle(), Utility.size(items), resultDividendHistoryEtf, Utility.toStringPastTimeReadable(started));
		}
		driver.quit();
		log.info("{} 『{}』 CrawlDividendHistoryEtfThread(#{}) - {}", Utility.indentEnd(), result, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return result;
	}

	private String extract(ItemDomain item) {
		log.debug("{} CrawlDividendHistoryEtfThread({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		try {
			String code = item.getCode();
			String symbol = item.getSymbol();

			driver.switchTo().defaultContent();
			
			// 종목명 검색 아이콘 클릭
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='group162']"), false, TIMEOUT);
			driver.findElement(By.xpath("//dd[@id='sn_group2']/a[@id='sn_group4']"), TIMEOUT).click();
			
			WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeEtfnm']"), TIMEOUT);
			driver.switchTo().frame(frame);

			// 종목명 입력
			WebElement keywordElement = driver.findElement(By.xpath("//input[@id='search_string']"), TIMEOUT); // 종목명 검색어 입력창
			By BY_MARK_CODE_SEARCH_DONE = By.xpath("//ul[@id='contentsList']/li");
			String textPrevious = driver.getText(BY_MARK_CODE_SEARCH_DONE, 1, "andold");
			keywordElement.clear();
			keywordElement.sendKeys(code);
			
			// 검색 아이콘 클릭
			driver.findElement(By.xpath("//div[@id='group252']/a[@id='group236']"), TIMEOUT).click();
			
			// 이전 내용이 지워질 때까지
			driver.waitUntilTextNotInclude(BY_MARK_CODE_SEARCH_DONE, TIMEOUT, textPrevious);

			// 검색 결과에서 선택
			String xpathSearchResult = "//ul[@id='contentsList']/li/a";
			List<WebElement> resultSearch = driver.findElements(By.xpath(xpathSearchResult), TIMEOUT);
			String oneXpathCandidate1 = String.format("//*[@id='contentsList']//a[contains(text(),'%s')]", symbol.strip());
			String oneXpathCandidate2 = String.format("//*[@id='contentsList']//a[contains(text(),'%s')]", symbol.replaceAll("[\s]+", ""));
			if (resultSearch.size() == 0) {
				driver.switchTo().defaultContent();
				popupCloseIconElement.click();
				log.info("{} #{} 없는 종목 『{}』 CrawlDividendHistoryEtfThread() - {}", Utility.indentEnd(), Utility.size(items), item, Utility.toStringPastTimeReadable(started));
				return "";
			} else if (resultSearch.size() == 1) {
				driver.findElement(By.xpath(xpathSearchResult)).click();
			} else if (!driver.isEmpty(By.xpath(oneXpathCandidate1))) {
				driver.clickIfExist(By.xpath(oneXpathCandidate1));
			} else if (!driver.isEmpty(By.xpath(oneXpathCandidate2))) {
				driver.clickIfExist(By.xpath(oneXpathCandidate2));
			} else {
				driver.switchTo().defaultContent();
				popupCloseIconElement.click();
				log.info("{} #{} 모호한 검색 결과 『{}』 CrawlDividendHistoryEtfThread() - {}", Utility.indentEnd(), Utility.size(items), item, Utility.toStringPastTimeReadable(started));
				return "";
			}

			driver.switchTo().defaultContent();
			
			// 조회 아이콘 클릭
			By BY_MARK_DIVIDEND_SEARCH_DONE = By.xpath("//*[@id='grid1_body_table']//td[3]");
			textPrevious = driver.getText(BY_MARK_DIVIDEND_SEARCH_DONE, 1, "andold");
			driver.findElement(By.xpath("//*[@id='image17']"), TIMEOUT).click();

			// 내용이 바뀔 때까지
			driver.waitUntilTextNotInclude(BY_MARK_DIVIDEND_SEARCH_DONE, TIMEOUT, textPrevious);

			// 내용 저장
			WebElement table = driver.findElement(By.xpath("//*[@id='grid1_body_table']"), TIMEOUT);
			StringBuffer sb = new StringBuffer();
			sb.append(String.format("KEYWORD\t%s\n", item.getCode()));
			sb.append(driver.extractTextContentFromTableElement(table));
			sb.append(MARK_ANDOLD_SINCE);

			String result = new String(sb);

			log.debug("{} #{} 『{}』 CrawlDividendHistoryEtfThread.extract({}) - {}", Utility.indentEnd(), Utility.size(items), Utility.ellipsisEscape(result, 16), item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
		}

		return "";
	}

	@Deprecated
	public static ParserResult crawl(List<ItemDomain> items, Date start) {
		log.info("{} CrawlDividendHistoryEtfThread.crawl(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		long freeMemorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getFreeMemorySize();
		int candidateProcessorsByFreeMemory = (int) (freeMemorySize / 512L / 1024L / 1024L);
		int processors = Math.min(Math.max(1, candidateProcessorsByFreeMemory), Runtime.getRuntime().availableProcessors() - 1);

		ExecutorService service = Executors.newFixedThreadPool(processors);
		List<Future<ParserResult>> futureList = new ArrayList<>();
		ConcurrentLinkedQueue<ItemDomain> queue = new ConcurrentLinkedQueue<ItemDomain>();
		queue.addAll(items);
		for (int cx = 0; cx < processors; cx++) {
			CrawlDividendHistoryEtfThread thread = new CrawlDividendHistoryEtfThread(queue, start);
			Future<ParserResult> future = service.submit(thread);
			futureList.add(future);
		}
		ParserResult container = ParserResult.builder().build();
		container.clear();
		for (Future<ParserResult> task : futureList) {
			try {
				ParserResult result = task.get();
				container.addAll(result);
				log.info("{} 『{}』 CrawlDividendHistoryEtfThread.crawl(#{})", Utility.indentMiddle(), result, Utility.size(items));
			} catch (Exception e) {
			}
		}

		log.info("{} 『{}』 CrawlDividendHistoryEtfThread.crawl(#{}) - {}", Utility.indentEnd(), container, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return container;
	}

	public static ParserResult crawl(ItemParam item) {
		ConcurrentLinkedQueue<ItemDomain> queue = new ConcurrentLinkedQueue<ItemDomain>();
		queue.add(item);
		CrawlDividendHistoryEtfThread thread = new CrawlDividendHistoryEtfThread(queue, item.getStart());
		boolean debug = CrawlerService.getDebug();
		CrawlerService.setDebug(false);
		ExecutorService service = Executors.newFixedThreadPool(1);
		Future<ParserResult> future = service.submit(thread);
		try {
			CrawlerService.setDebug(debug);
			return future.get();
		} catch (InterruptedException e) {
		} catch (ExecutionException e) {
		}
		CrawlerService.setDebug(debug);
		return new ParserResult().clear();
	}

}
