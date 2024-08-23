package kr.andold.stock.thread;

import java.lang.management.ManagementFactory;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import kr.andold.stock.crawler.CrawlerService;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.param.ItemParam;
import kr.andold.stock.service.ParserService;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.utils.ChromeDriverWrapper;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

//KSD 증권정보포털 SEIBro > 주식 > 배당정보 > 배당내역전체검색:: 종목
//KSD 증권정보포털 SEIBro > 주식 > 배당정보 > 배당내역전체검색:: none
@Slf4j
public class CrawlDividendHistoryCompanyThread implements Callable<ParserResult> {
	private static final String URL = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01041V.xml&menuNo=285";
	private static final String MARK_START_END_POINT = String.format("KEYWORD\t%s\t%s\tURL\t%s\n", "CrawlDividendHistoryCompanyThread", "주식(기업) 배당금 내역", URL);
	private static final int TIMEOUT = 4000;
	private static final int JOB_SIZE = 4;
	private static final String MARK_ANDOLD_SINCE = CrawlerService.MARK_ANDOLD_SINCE;

	private ConcurrentLinkedQueue<ItemDomain> items;
	private String startDate = null;;

	public CrawlDividendHistoryCompanyThread(ConcurrentLinkedQueue<ItemDomain> list, Date start) {
		this.items = list;
		this.startDate = String.format("%1$tY%1$tm%1$td",
				(start == null)
					? Date.from(LocalDate.now().minusDays(7).atStartOfDay().toInstant(Utility.ZONE_OFFSET_KST))
					: start);
	}

	@Override
	public ParserResult call() throws Exception {
		log.info("{} CrawlDividendHistoryCompanyThread(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		ParserResult result = ParserResult.builder().build().clear();
		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();

		if (!init(driver, startDate)) {
			log.info("{} {} CrawlDividendHistoryCompanyThread(#{}) - {}", Utility.indentEnd(), result, Utility.size(items), Utility.toStringPastTimeReadable(started));
			return result;
		}

		while (items.peek() != null) {
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT);
			for (int cx = 0; cx < JOB_SIZE; cx++) {
				ItemDomain item = items.poll();
				if (item == null) {
					break;
				}
				
				String code = item.getCode();
				String type = item.getType();
				if (code == null || code.isBlank() || (type != null && type.equalsIgnoreCase("ETF"))) {
					log.info("{} {}/{} 대상아님 『{}』 CrawlDividendHistoryCompanyThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}


				log.info("{} {}/{} 진행 『{}』 CrawlDividendHistoryCompanyThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
				String text = extract(driver, item);
				sb.append(text);
			}
			sb.append(MARK_START_END_POINT);

			String text = new String(sb);
			ParserResult resultDividendHistory = ParserService.parse(text, false);
			result.addAll(resultDividendHistory);
			log.debug("{} #{} {} CrawlDividendHistoryCompanyThread() - {}", Utility.indentMiddle(), Utility.size(items), resultDividendHistory, Utility.toStringPastTimeReadable(started));
		}
		driver.quit();

		log.info("{} {} CrawlDividendHistoryCompanyThread(#{}) - {}", Utility.indentEnd(), result, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return result;
	}

	private static boolean init(ChromeDriverWrapper chromeDriver, String startDateString) {
		try {
			chromeDriver.navigate().to(URL);
			
			// 검색항목을 code로
			new Select(chromeDriver.findElement(By.id("Com_ISIN_input_0"), TIMEOUT * 4)).selectByVisibleText("종목");
			
			// 넓게 보기 아이콘 크릭
			chromeDriver.findElement(By.id("btn_wide_img")).click();

			// 시작일 입력
			WebElement start = chromeDriver.findElement(By.id("inputCalendar1_input"), TIMEOUT);
			start.clear();
			start.sendKeys(startDateString);
			start.sendKeys(Keys.TAB); // 시작일 입력
			return true;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			chromeDriver.quit();
		}
		return false;
	}

	private static String extract(ChromeDriverWrapper chromeDriver, ItemDomain item) {
		log.debug("{} CrawlDividendHistoryCompanyThread.extract({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		try {
			chromeDriver.switchTo().defaultContent();

			if (!searchItem(chromeDriver, item)) {
				log.debug("{} 『{}』 CrawlDividendHistoryCompanyThread.extract({}) - {}", Utility.indentEnd(), "", item, Utility.toStringPastTimeReadable(started));
				return "";
			}

			By BY_TABLE = By.xpath("//table[@id='grid1_body_table']");
			By BY_TABLE_1ST_LINE = By.xpath("//table[@id='grid1_body_table']/tbody/tr[1]");
			By BY_NEXT_PAGE_ICON = By.xpath("//div[@id='cntsPaging01']/ul/li[@id='cntsPaging01_next_btn']/a");
			By BY_CURRENT_PAGE = By.xpath("//div[@id='cntsPaging01']/ul/li/a[@class='w2pageList_control_label w2pageList_label_selected']");

			// 첫번째 라인 저장
			String previous1stLine = chromeDriver.getText(BY_TABLE_1ST_LINE, TIMEOUT, MARK_ANDOLD_SINCE);

			// 혹시 몰라 닫기 클릭
			chromeDriver.switchTo().defaultContent();
			chromeDriver.clickIfExist(By.xpath("//a[@id='anchor3']"));

			// 조회 클릭
			chromeDriver.findElement(By.xpath("//a[@id='group57']")).click();

			// 조회결과 바뀐거 확인 - 첫번째 라인
			chromeDriver.waitUntilTextNotInclude(BY_TABLE_1ST_LINE, TIMEOUT, previous1stLine);

			// 시작 표시
			StringBuffer sb = new StringBuffer();

			// 페이징 처리 - 여기부터
			String currentPage = chromeDriver.getText(BY_CURRENT_PAGE, TIMEOUT, "andold");	//	현재 페이지 번호
			while(true) {
				WebElement table = chromeDriver.findElement(BY_TABLE, TIMEOUT);
				sb.append(chromeDriver.extractTextContentFromTableElement(table));

				// 다음 페이지 클릭
				chromeDriver.clickIfExist(BY_NEXT_PAGE_ICON);
				
				// 변경 확인
				chromeDriver.waitUntilTextNotInclude(BY_TABLE_1ST_LINE, TIMEOUT, previous1stLine);
				previous1stLine = chromeDriver.getText(BY_TABLE_1ST_LINE, TIMEOUT, MARK_ANDOLD_SINCE);

				String nextPage = chromeDriver.getText(BY_CURRENT_PAGE, TIMEOUT, currentPage);
				if (currentPage.equalsIgnoreCase(nextPage)) {
					break;
				}
				
				log.info("{} 쪽:{} CrawlDividendHistoryCompanyThread.extract(..., {}) - {}", Utility.indentMiddle(), currentPage, item, Utility.toStringPastTimeReadable(started));
				currentPage = nextPage;
			}
			// 페이징 처리 - 여기까지

			// 마지막 표시
			sb.append(MARK_ANDOLD_SINCE);
			String result = new String(sb);

			log.debug("{} 쪽:{} CrawlDividendHistoryCompanyThread.extract(..., {}) - {}", Utility.indentEnd(), currentPage, item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
		}

		return "";
	}

	private static boolean searchItem(ChromeDriverWrapper chromeDriver, ItemDomain item) {
		if (item == null) {
			return true;
		}

		try {
			String code = item.getCode();

			// 종목 검색 아이콘 클릭
			chromeDriver.waitUntilIsDisplayed(By.xpath("//div[@id='group83']"), false, TIMEOUT);
			chromeDriver.findElement(By.id("cc_group4")).click();

			WebElement frame = chromeDriver.findElement(By.xpath("//iframe[@id='iframe2']"), TIMEOUT);

			chromeDriver.switchTo().frame(frame);
			WebElement codeElement = chromeDriver.findElement(By.id("search_string"), TIMEOUT);
			codeElement.clear();
			codeElement.sendKeys(code); // 코드 입력

			chromeDriver.clear(By.xpath("//*[@id='P_isinList']/li"));
			chromeDriver.findElement(By.id("P_group100")).click(); // 코드 검색 아이콘 클릭

			// 조회결과 확인
			WebElement targetElement = chromeDriver.findElementIncludeText(By.xpath("//ul[@id='P_isinList']/li/a/span[@class='w2textbox code']"), TIMEOUT, code);
			
			// 클릭
			targetElement.click();
			return true;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
		}
		
		return false;
	}

	@Deprecated
	public static ParserResult crawl(List<ItemDomain> items, Date start) {
		long freeMemorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getFreeMemorySize();
		int candidateProcessorsByFreeMemory = (int) (freeMemorySize / 512L / 1024L / 1024L);
		int processors = Math.min(Math.max(1, candidateProcessorsByFreeMemory), Runtime.getRuntime().availableProcessors() - 1);

		ExecutorService service = Executors.newFixedThreadPool(processors);
		List<Future<ParserResult>> futureList = new ArrayList<>();
		ConcurrentLinkedQueue<ItemDomain> queue = new ConcurrentLinkedQueue<ItemDomain>();
		queue.addAll(items);
		for (int cx = 0; cx < processors; cx++) {
			CrawlDividendHistoryCompanyThread thread = new CrawlDividendHistoryCompanyThread(queue, start);
			Future<ParserResult> future = service.submit(thread);
			futureList.add(future);
		}
		ParserResult container = ParserResult.builder().build();
		container.clear();
		for (Future<ParserResult> task : futureList) {
			try {
				ParserResult result = task.get();
				container.addAll(result);
				log.info("{} 『{}』 CrawlDividendHistoryCompanyThread.crawl(#{})", Utility.indentMiddle(), result, Utility.size(items));
			} catch (Exception e) {
			}
		}
		return container;
	}

	public static ParserResult crawl(ItemParam item) {
		log.info("{} CrawlDividendHistoryCompanyThread.crawl({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		ConcurrentLinkedQueue<ItemDomain> queue = new ConcurrentLinkedQueue<ItemDomain>();
		queue.add(item);
		CrawlDividendHistoryCompanyThread thread = new CrawlDividendHistoryCompanyThread(queue, item.getStart());
		ExecutorService service = Executors.newFixedThreadPool(1);
		Future<ParserResult> future = service.submit(thread);
		try {
			ParserResult result = future.get();

			log.info("{} {} CrawlDividendHistoryCompanyThread.crawl({}) - {}", Utility.indentEnd(), result, item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
		}

		log.info("{} EMPY CrawlDividendHistoryCompanyThread.crawl({}) - {}", Utility.indentEnd(), item, Utility.toStringPastTimeReadable(started));
		return new ParserResult().clear();
	}

	//KSD 증권정보포털 SEIBro > 주식 > 배당정보 > 배당내역전체검색:: none
	public static ParserResult crawl(Date start) {
		log.info("{} crawl(#{})", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		String startDate = String.format("%1$tY%1$tm%1$td",
				(start == null)
					? Date.from(LocalDate.now().minusMonths(1).atStartOfDay().toInstant(Utility.ZONE_OFFSET_KST))
					: start);

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();

		if (!init(driver, startDate)) {
			log.warn("{} {} crawl({}) - {}", Utility.indentEnd(), "EMPTY", start, Utility.toStringPastTimeReadable(started));
			return new ParserResult().clear();
		}
		
		StringBuffer sb = new StringBuffer();
		sb.append(MARK_START_END_POINT);
		String extracted = extract(driver, null);
		driver.quit();
		sb.append(extracted);
		sb.append(MARK_START_END_POINT);

		String text = new String(sb);
		ParserResult result = ParserService.parse(text, false);

		log.info("{} {} crawl({}) - {}", Utility.indentEnd(), result, start, Utility.toStringPastTimeReadable(started));
		return result;
	}

}
