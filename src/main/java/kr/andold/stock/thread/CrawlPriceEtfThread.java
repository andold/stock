package kr.andold.stock.thread;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.service.ChromeDriverWrapper;
import kr.andold.stock.service.CrawlerService;
import kr.andold.stock.service.ParserService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

// KSD 증권정보포털 SEIBro > ETF > ETF종합정보 > 기준가추이 :: 일별시세
@Slf4j
public class CrawlPriceEtfThread implements Callable<ParserResult> {
	private static final String URL = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06033V.xml&menuNo=182";
	private static String MARK_START_END_POINT = "KEYWORD\tETF 일별시세\tCrawlPriceEtfThread\tURL\t" + URL + "\n";
	private static final int TIMEOUT = 4000;
	private static final int JOB_SIZE = 8;
	private static final String MARK_ANDOLD_SINCE = CrawlerService.MARK_ANDOLD_SINCE;

	private String startDate = null;;
	private ConcurrentLinkedQueue<ItemDomain> items;
	private ChromeDriverWrapper driver;
	private WebElement frame;
	private WebElement iconClosePopupedElement; // 검색결과창의 닫기 아이콘
	@Setter private static Boolean debug = CrawlerService.debug;

	public CrawlPriceEtfThread(ConcurrentLinkedQueue<ItemDomain> list) {
		this.items = list;
	}

	public CrawlPriceEtfThread(ConcurrentLinkedQueue<ItemDomain> list, String startDate) {
		this.items = list;
		this.startDate = startDate;
	}

	public ParserResult call() throws Exception {
		log.info("{} CrawlPriceEtfThread(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		ParserResult result = ParserResult.builder().build();
		result.clear();
		driver = CrawlerService.defaultChromeDriver();

		try {
			driver.navigate().to(URL);
			driver.findElement(By.xpath("//a[@id='btn_wide']"), TIMEOUT * 4).click(); // 넓게 보기 아이콘 크릭
			if (startDate == null) {
				new Select(driver.findElement(By.xpath("//select[@id='selectbox1_input_0']"), TIMEOUT)).selectByVisibleText("1주"); // 검색항목을 『1주』로
			} else {
				WebElement start = driver.findElement(By.xpath("//input[@id='inputCalendar1_input']"), TIMEOUT);
				start.clear();
				start.sendKeys(startDate); // 시작일 입력
				start.sendKeys(Keys.TAB); // 시작일 입력
			}
			iconClosePopupedElement = driver.findElement(By.xpath("//div[@id='group1520']/a[@id='anchor2']"), TIMEOUT); // 검색결과창의 닫기 아이콘
			frame = driver.findElement(By.xpath("//iframe[@id='iframeEtfnm']"), TIMEOUT);
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
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
				if (code == null || code.isBlank() || (item.getEtf() != null && !item.getEtf())) {
					log.trace("{} {}/{} 대상아님 『{}』 CrawlPriceEtfThread.extract()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}
				if (debug && new Random().nextDouble() < 0.95) {
					log.trace("{} {}/{} 테스트 뽑기 제외 『{}』 CrawlPriceEtfThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}

				log.info("{} {}/{} 진행 『{}』 CrawlPriceEtfThread() - {}", Utility.indentMiddle(), cx, Utility.size(items), item, Utility.toStringPastTimeReadable(started));
				String text = extract(item);
				sb.append(text);
			}
			sb.append(MARK_START_END_POINT);
			String text = new String(sb);
			ParserResult resultParsed = ParserService.parse(text, debug);
			result.addAll(resultParsed);
		}
		driver.quit();
		log.info("{} 『{}』 CrawlPriceEtfThread(#{}) - {}", Utility.indentEnd(), result, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return result;
	}

	private String extract(ItemDomain item) {
		log.debug("{} CrawlPriceEtfThread.extract({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		try {
			//	자주 사용 변수
			String code = item.getCode();

			//	멱등 초기화
			driver.switchTo().defaultContent();

			//	종목명 검색 링크 클릭
			driver.clickIfExist(By.xpath("//a[@id='sn_group4']"));

			//	떠 있는 팝업으로 이동
			driver.switchTo().frame(frame);

			//	코드 입력
			WebElement inputSearchElement = driver.findElement(By.xpath("//input[@id='search_string']"), TIMEOUT);	// 입력창
			inputSearchElement.clear();
			inputSearchElement.sendKeys(code); // 코드 입력
			
			// 종목명 검색 아이콘
			String XPATH_MARK_CODE_SEARCH_DONE = "//ul[@id='contentsList']/li/a";
			String previousSymbol = driver.getText(By.xpath(XPATH_MARK_CODE_SEARCH_DONE), 1, "andold");	//	이전거 첫번째 종목 검색 결과
			driver.clickIfExist(By.xpath("//a[@id='group236']/img"));
			//	이전거 지워져야지
			driver.waitUntilTextNotInclude(By.xpath(XPATH_MARK_CODE_SEARCH_DONE), TIMEOUT, previousSymbol);

			//	검색 결과에서 선택
			driver.clickIfExist(By.xpath(XPATH_MARK_CODE_SEARCH_DONE));

			//	팝업이 닫혔다, 돌아간다
			driver.switchTo().defaultContent();

			// 조회 아이콘 클릭
			String XPATH_MARK_TABLE_CLOSING_READ_DONE = "//table[@id='grid1_body_table']/tbody/tr[1]/td[2]";	//	2nd: 종가
			String previousTableClosingMark = driver.getText(By.xpath(XPATH_MARK_TABLE_CLOSING_READ_DONE), 1, "andold");	//	이전거 첫번째 종가
			String XPATH_MARK_TABLE_AMOUNT_READ_DONE = "//table[@id='grid1_body_table']/tbody/tr[1]/td[7]";	//	7th: 거래량
			String previousTableAmountMark = driver.getText(By.xpath(XPATH_MARK_TABLE_AMOUNT_READ_DONE), 1, "andold");	//	이전거 첫번째 거래량
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='group1500']"), false, TIMEOUT);
			driver.clickIfExist(By.xpath("//a[@id='group155']"));
			//	이전거 지워져야지
			driver.waitUntilTextNotInclude(By.xpath(XPATH_MARK_TABLE_CLOSING_READ_DONE), TIMEOUT, previousTableClosingMark, "");
			driver.waitUntilTextNotInclude(By.xpath(XPATH_MARK_TABLE_AMOUNT_READ_DONE), TIMEOUT, previousTableAmountMark, "");

			//	내용 저장
			StringBuffer sb = new StringBuffer();
			sb.append(String.format("%s\t%s\n", code, item.getSymbol()));

			// 페이지 처리
			String XPATH_CURRENT_PAGE = "//div[@id='pageList1']/ul/li/a[@class='w2pageList_control_label w2pageList_label_selected']";
			String currentPage = driver.getText(By.xpath(XPATH_CURRENT_PAGE), TIMEOUT, "andold");	//	현재 페이지 번호
			
			while(true) {
				//	테이블
				WebElement table = driver.findElement(By.xpath("//table[@id='grid1_body_table']"), TIMEOUT);
				sb.append(driver.extractTextFromTableElement(table));

				previousTableAmountMark = driver.getText(By.xpath(XPATH_MARK_TABLE_AMOUNT_READ_DONE), 1, "andold");	//	이전거 첫번째 거래량
				driver.clickIfExist(By.xpath("//li[@id='pageList1_next_btn']/a"));
				driver.waitUntilTextNotInclude(By.xpath(XPATH_MARK_TABLE_AMOUNT_READ_DONE), TIMEOUT, previousTableAmountMark, "");
				String nextPage = driver.getText(By.xpath(XPATH_CURRENT_PAGE), TIMEOUT, currentPage);
				if (currentPage.equalsIgnoreCase(nextPage)) {
					break;
				}
				
				log.info("{} #{} 쪽:{} CrawlPriceEtfThread.extract({}) - {}", Utility.indentMiddle(), Utility.size(items), currentPage, item, Utility.toStringPastTimeReadable(started));
				currentPage = nextPage;
			}

			sb.append(MARK_ANDOLD_SINCE);

			String result = new String(sb);

			log.debug("{} #{} 『{}』 CrawlPriceEtfThread.extract({}) - {}", Utility.indentEnd(), Utility.size(items), Utility.ellipsisEscape(result, 16), item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
			driver.switchTo().defaultContent();
			iconClosePopupedElement.click();
		}

		log.debug("{} #{} 『{}』 CrawlPriceEtfThread.extract(#{}) - {}", Utility.indentEnd(), Utility.size(items), "", item, Utility.toStringPastTimeReadable(started));
		return "";
	}

	public static ParserResult crawl(List<ItemDomain> items) {
		log.info("{} CrawlPriceEtfThread.crawl(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		long freeMemorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getFreeMemorySize();
		int candidateProcessorsByFreeMemory = (int) (freeMemorySize / 512L / 1024L / 1024L);
		int processors = Math.min(Math.max(1, candidateProcessorsByFreeMemory), Runtime.getRuntime().availableProcessors() - 1);

		ExecutorService service = Executors.newFixedThreadPool(processors);
		List<Future<ParserResult>> futureList = new ArrayList<>();
		ConcurrentLinkedQueue<ItemDomain> queue = new ConcurrentLinkedQueue<ItemDomain>();
		queue.addAll(items);
		for (int cx = 0; cx < processors; cx++) {
			CrawlPriceEtfThread thread = new CrawlPriceEtfThread(queue);
			Future<ParserResult> future = service.submit(thread);
			futureList.add(future);
		}
		ParserResult container = ParserResult.builder().build();
		container.clear();
		for (Future<ParserResult> task : futureList) {
			try {
				ParserResult result = task.get();
				container.addAll(result);
				log.info("{} 『{}』 CrawlPriceEtfThread.crawl(#{})", Utility.indentMiddle(), result, Utility.size(items));
			} catch (Exception e) {
			}
		}

		log.info("{} 『{}』 CrawlPriceEtfThread.crawl(#{}) - {}", Utility.indentEnd(), container, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return container;
	}

	public static ParserResult crawl(ItemDomain item) {
		log.info("{} CrawlPriceEtfThread.crawl({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		ConcurrentLinkedQueue<ItemDomain> queue = new ConcurrentLinkedQueue<ItemDomain>();
		queue.add(item);
		CrawlPriceEtfThread thread = new CrawlPriceEtfThread(queue, CrawlerService.getCrawlerDateStart());
		setDebug(false);
		ExecutorService service = Executors.newFixedThreadPool(1);
		Future<ParserResult> future = service.submit(thread);
		try {
			ParserResult result = future.get();

			log.info("{} {} CrawlPriceEtfThread.crawl({}) - {}", Utility.indentEnd(), result, item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
		}

		log.info("{} EMPY CrawlPriceEtfThread.crawl({}) - {}", Utility.indentEnd(), item, Utility.toStringPastTimeReadable(started));
		return new ParserResult().clear();
	}

}
