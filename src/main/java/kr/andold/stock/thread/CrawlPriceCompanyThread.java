package kr.andold.stock.thread;

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

import kr.andold.stock.domain.StockItemDomain;
import kr.andold.stock.service.ChromeDriverWrapper;
import kr.andold.stock.service.StockCrawlerService;
import kr.andold.stock.service.StockParserService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.StockParserService.StockParserResult;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

//	KSD 증권정보포털 SEIBro > 주식 > 종목별상세정보 > 일자별시세
@Slf4j
public class CrawlPriceCompanyThread implements Callable<StockParserResult> {
	private static final String URL = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02007V.xml&menuNo=45";
	private static String MARK_START_END_POINT = "KEYWORD\t주식 일자별시세\tCrawlPriceCompanyThread\tURL\t" + URL + "\n";
	private static final int TIMEOUT = 4000;
	private static final int JOB_SIZE = 8;
	private static final String MARK_ANDOLD_SINCE = StockCrawlerService.MARK_ANDOLD_SINCE;

	private String startDate = null;;
	private ConcurrentLinkedQueue<StockItemDomain> items;
	private ChromeDriverWrapper driver;
	private WebElement frame;
	private WebElement iconClosePopupedElement; // 검색결과창의 닫기 아이콘
	@Setter private static Boolean debug = StockCrawlerService.debug;

	public CrawlPriceCompanyThread(ConcurrentLinkedQueue<StockItemDomain> list) {
		this.items = list;
	}

	public CrawlPriceCompanyThread(ConcurrentLinkedQueue<StockItemDomain> list, String startDate) {
		this.items = list;
		this.startDate = startDate;
	}

	public StockParserResult call() throws Exception {
		log.info("{} CrawlPriceCompanyThread(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		StockParserResult result = StockParserResult.builder().build();
		result.clear();
		driver = StockCrawlerService.defaultChromeDriver();

		try {
			driver.navigate().to(URL);
			driver.findElement(By.xpath("//a[@id='btn_wide']"), TIMEOUT * 4).click(); // 넓게 보기 아이콘 크릭, 처음은 좀더 오래 기다려 준다
			if (startDate == null) {
				new Select(driver.findElement(By.xpath("//select[@id='sd1_selectbox1_input_0']"), TIMEOUT)).selectByVisibleText("1주"); // 검색항목을 『1주』로
			} else {
				WebElement start = driver.findElement(By.xpath("//input[@id='sd1_inputCalendar1_input']"), TIMEOUT);
				start.clear();
				start.sendKeys(startDate); // 시작일 입력
				start.sendKeys(Keys.TAB); // 시작일 입력
			}
			iconClosePopupedElement = driver.findElement(By.xpath("//div[@id='group58']/a[@id='anchor2']"), TIMEOUT); // 검색결과창의 닫기 아이콘
			frame = driver.findElement(By.xpath("//iframe[@id='iframe1']"), TIMEOUT);
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
			return result;
		}

		while (items.peek() != null) {
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT);
			for (int cx = 0; cx < JOB_SIZE; cx++) {
				StockItemDomain item = items.poll();
				if (item == null) {
					break;
				}
				
				String code = item.getCode();
				if (code == null || code.isBlank() || (item.getEtf() != null && item.getEtf())) {
					log.trace("{} {}/{} 대상아님 『{}』 CrawlPriceCompanyThread.extract()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}
				if (debug && new Random().nextDouble() < 0.9) {
					log.trace("{} {}/{} 테스트 뽑기 제외 『{}』 CrawlPriceCompanyThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}

				log.debug("{} {}/{} 진행 『{}』 CrawlPriceCompanyThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
				String text = extract(item);
				sb.append(text);
			}
			sb.append(MARK_START_END_POINT);
			String text = new String(sb);
			StockParserResult resultDividendHistoryEtf = StockParserService.parse(text, debug);
			result.addAll(resultDividendHistoryEtf);
		}
		driver.quit();
		log.info("{} 『{}』 CrawlPriceCompanyThread(#{}) - {}", Utility.indentEnd(), result, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return result;
	}

	private String extract(StockItemDomain item) {
		log.debug("{} CrawlPriceCompanyThread.extract({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		try {
			//	자주 사용 변수
			String code = item.getCode();

			//	멱등 초기화
			driver.switchTo().defaultContent();

			//	종목명 검색 링크 클릭
			driver.findElement(By.xpath("//a[@id='sn_group4']"), TIMEOUT).click();

			//	떠 있는 팝업으로 이동
			driver.switchTo().frame(frame);

			//	코드 입력
			WebElement inputSearchElement = driver.findElement(By.xpath("//input[@id='search_string']"), TIMEOUT);	// 입력창
			inputSearchElement.clear();
			inputSearchElement.sendKeys(code); // 코드 입력
			
			// 종목명 검색 아이콘
			driver.findElement(By.xpath("//a[@id='P_group100']/img"), TIMEOUT).click();

			//	검색 결과에서 선택
			driver.findElementIncludeText(By.xpath("//ul[@id='P_isinList']/li/a/span"), TIMEOUT, code).click();

			//	팝업이 닫혔다, 돌아간다
			driver.switchTo().defaultContent();

			// 조회 아이콘 클릭
			String XPATH_MARK_SEARCH_DONE = "//table/tbody/tr[1]/td[7]";
			String previousAmount = driver.getText(By.xpath(XPATH_MARK_SEARCH_DONE), TIMEOUT, "andold");	//	이전거 첫번째 거래양
			driver.findElement(By.xpath("//a[@id='group44']"), TIMEOUT).click();

			//	이전거 지워져야지
			driver.waitUntilTextNotInclude(By.xpath(XPATH_MARK_SEARCH_DONE), TIMEOUT, previousAmount);

			//	내용 저장
			StringBuffer sb = new StringBuffer();
			sb.append(String.format("%s\t%s\n", code, item.getSymbol()));

			
			// 페이지 처리
			String XPATH_CURRENT_PAGE = "//div[@id='cntsPaging01']/ul/li/a[@class='w2pageList_control_label w2pageList_label_selected']";
			String currentPage = driver.getText(By.xpath(XPATH_CURRENT_PAGE), TIMEOUT, "andold");	//	현재 페이지 번호
			
			while(true) {
				//	테이블
				WebElement table = driver.findElement(By.xpath("//table[@id='grid1_body_table']"), TIMEOUT);
				sb.append(driver.extractTextFromTableElement(table));


				previousAmount = driver.getText(By.xpath(XPATH_MARK_SEARCH_DONE), TIMEOUT, "andold");	//	이전거 첫번째 거래양
				driver.clickIfExist(By.xpath("//li[@id='cntsPaging01_next_btn']/a"));
				driver.waitUntilTextNotInclude(By.xpath(XPATH_MARK_SEARCH_DONE), TIMEOUT, previousAmount, "");

				String nextPage = driver.getText(By.xpath(XPATH_CURRENT_PAGE), TIMEOUT, currentPage);
				if (currentPage.equalsIgnoreCase(nextPage)) {
					break;
				}
				
				log.debug("{} #{} 쪽:{} CrawlPriceCompanyThread.extract({}) - {}", Utility.indentMiddle(), Utility.size(items), currentPage, item, Utility.toStringPastTimeReadable(started));
				currentPage = nextPage;
			}

			sb.append(MARK_ANDOLD_SINCE);

			String result = new String(sb);

			log.debug("{} #{} 『{}』 CrawlPriceCompanyThread.extract({}) - {}", Utility.indentEnd(), Utility.size(items), Utility.ellipsisEscape(result, 16), item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
			driver.switchTo().defaultContent();
			iconClosePopupedElement.click();
		}

		log.debug("{} #{} 『{}』 CrawlPriceCompanyThread.extract(#{}) - {}", Utility.indentEnd(), Utility.size(items), "", item, Utility.toStringPastTimeReadable(started));
		return "";
	}

	public static StockParserResult crawl(List<StockItemDomain> items) {
		log.info("{} CrawlPriceCompanyThread.crawl(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		int processors = Runtime.getRuntime().availableProcessors() - 1;
		if (debug) {
			processors = 1;
		}
		ExecutorService service = Executors.newFixedThreadPool(processors);
		List<Future<StockParserResult>> futureList = new ArrayList<>();
		ConcurrentLinkedQueue<StockItemDomain> queue = new ConcurrentLinkedQueue<StockItemDomain>();
		queue.addAll(items);
		for (int cx = 0; cx < processors; cx++) {
			CrawlPriceCompanyThread thread = new CrawlPriceCompanyThread(queue);
			Future<StockParserResult> future = service.submit(thread);
			futureList.add(future);
		}
		StockParserResult container = StockParserResult.builder().build();
		container.clear();
		for (Future<StockParserResult> task : futureList) {
			try {
				StockParserResult result = task.get();
				container.addAll(result);
				log.info("{} 『{}』 CrawlPriceCompanyThread.crawl(#{})", Utility.indentMiddle(), result, Utility.size(items));
			} catch (Exception e) {
			}
		}

		log.info("{} 『{}』 CrawlPriceCompanyThread.crawl(#{}) - {}", Utility.indentEnd(), container, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return container;
	}

	public static StockParserResult crawl(StockItemDomain item) {
		log.info("{} CrawlPriceCompanyThread.crawl({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		ConcurrentLinkedQueue<StockItemDomain> queue = new ConcurrentLinkedQueue<StockItemDomain>();
		queue.add(item);
		CrawlPriceCompanyThread thread = new CrawlPriceCompanyThread(queue, StockCrawlerService.getCrawlerDateStart());
		setDebug(false);
		ExecutorService service = Executors.newFixedThreadPool(1);
		Future<StockParserResult> future = service.submit(thread);
		try {
			StockParserResult result = future.get();

			log.info("{} {} CrawlPriceCompanyThread.crawl({}) - {}", Utility.indentEnd(), result, item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
		}

		log.info("{} EMPY CrawlPriceCompanyThread.crawl({}) - {}", Utility.indentEnd(), item, Utility.toStringPastTimeReadable(started));
		return new StockParserResult().clear();
	}

}
