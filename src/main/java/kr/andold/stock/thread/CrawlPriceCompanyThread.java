package kr.andold.stock.thread;

import java.lang.management.ManagementFactory;
import java.time.LocalDate;
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

//	KSD 증권정보포털 SEIBro > 주식 > 종목별상세정보 > 일자별시세
@Slf4j
public class CrawlPriceCompanyThread implements Callable<ParserResult> {
	private static final String URL = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02007V.xml&menuNo=45";
	private static String MARK_START_END_POINT = "KEYWORD\t주식 일자별시세\tCrawlPriceCompanyThread\tURL\t" + URL + "\n";
	private static final int TIMEOUT = 4000;
	private static final int JOB_SIZE = 8;
	private static final String MARK_ANDOLD_SINCE = CrawlerService.MARK_ANDOLD_SINCE;

	private String startDate = null;;
	private ConcurrentLinkedQueue<ItemDomain> items;
	private ChromeDriverWrapper driver;
	private WebElement frame;
	private WebElement iconClosePopupedElement; // 검색결과창의 닫기 아이콘

	public CrawlPriceCompanyThread(ConcurrentLinkedQueue<ItemDomain> list) {
		this.items = list;
	}

	public CrawlPriceCompanyThread(ConcurrentLinkedQueue<ItemDomain> list, Date start) {
		this.items = list;
		this.startDate = String.format("%1$tY%1$tm%1$td",
				(start == null)
					? Date.from(LocalDate.now().minusDays(7 * 4).atStartOfDay().toInstant(Utility.ZONE_OFFSET_KST))
					: start);
	}

	public ParserResult call() throws Exception {
		log.info("{} CrawlPriceCompanyThread(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		ParserResult result = ParserResult.builder().build();
		result.clear();
		driver = CrawlerService.defaultChromeDriver();

		try {
			driver.navigate().to(URL);
			
			// 넓게 보기 아이콘 크릭, 처음은 좀더 오래 기다려 준다
			driver.findElement(By.xpath("//a[@id='btn_wide']"), TIMEOUT * 4).click();
			
			// 시작일 입력
			WebElement start = driver.findElement(By.xpath("//input[@id='sd1_inputCalendar1_input']"), TIMEOUT);
			start.clear();
			start.sendKeys(startDate);
			start.sendKeys(Keys.TAB); // 시작일 입력
			
			// 검색결과창의 닫기 아이콘
			iconClosePopupedElement = driver.findElement(By.xpath("//div[@id='group58']/a[@id='anchor2']"), TIMEOUT);
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
				ItemDomain item = items.poll();
				if (item == null) {
					break;
				}
				
				String code = item.getCode();
				if (code == null || code.isBlank() || (item.getEtf() != null && item.getEtf())) {
					log.trace("{} {}/{} 대상아님 『{}』 CrawlPriceCompanyThread.extract()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}
				if (CrawlerService.getDebug() && new Random().nextDouble() < 0.9) {
					log.trace("{} {}/{} 테스트 뽑기 제외 『{}』 CrawlPriceCompanyThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}

				log.info("{} {}/{} 진행 『{}』 CrawlPriceCompanyThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
				String text = extract(item);
				sb.append(text);
			}
			sb.append(MARK_START_END_POINT);
			String text = new String(sb);
			ParserResult resultDividendHistoryEtf = ParserService.parse(text, CrawlerService.getDebug());
			result.addAll(resultDividendHistoryEtf);
		}
		driver.quit();
		log.info("{} 『{}』 CrawlPriceCompanyThread(#{}) - {}", Utility.indentEnd(), result, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return result;
	}

	private String extract(ItemDomain item) {
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
			By BY_TABLE_1ST_LINE = By.xpath("//table/tbody/tr[1]");
			String previous1stLine = driver.getText(BY_TABLE_1ST_LINE, 1, "andold");	//	이전거
			driver.findElement(By.xpath("//a[@id='group44']"), TIMEOUT).click();
			driver.waitUntilTextNotInclude(BY_TABLE_1ST_LINE, TIMEOUT, previous1stLine);	//	이전거

			//	내용 저장
			StringBuffer sb = new StringBuffer();
			sb.append(String.format("%s\t%s\n", code, item.getSymbol()));
			while(true) {
				//	테이블
				WebElement table = driver.findElement(By.xpath("//table[@id='grid1_body_table']"), TIMEOUT);
				sb.append(driver.extractTextContentFromTableElement(table));

				if (isLastPage(driver, item.getIpoDate())) {
					break;
				}

				//	다음 페이지
				previous1stLine = driver.getText(BY_TABLE_1ST_LINE, 1, "andold");	//	이전거 첫번째 거래양
				driver.clickIfExist(By.xpath("//li[@id='cntsPaging01_next_btn']/a"));
				driver.waitUntilTextNotInclude(BY_TABLE_1ST_LINE, TIMEOUT, previous1stLine);

				log.info("{} #{} 쪽:{} CrawlPriceCompanyThread.extract({}) - {}", Utility.indentMiddle()
						, Utility.size(items)
						, driver.getText(By.xpath("//div[@id='cntsPaging01']/ul/li/a[@class='w2pageList_control_label w2pageList_label_selected']"), TIMEOUT, "못찾음")
						, item
						, Utility.toStringPastTimeReadable(started));
			}
			sb.append(MARK_ANDOLD_SINCE);
			String result = new String(sb);

			log.debug("{} #{} 『{}』 CrawlPriceCompanyThread.extract({}) - {}", Utility.indentEnd(), Utility.size(items), Utility.ellipsisEscape(result, 16), item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
			driver.switchTo().defaultContent();
			iconClosePopupedElement.click();
		}

		log.debug("{} #{} 『{}』 CrawlPriceCompanyThread.extract(#{}) - {}", Utility.indentEnd(), Utility.size(items), "", item, Utility.toStringPastTimeReadable(started));
		return "";
	}

	private boolean isLastPage(ChromeDriverWrapper driver, Date start) {
		try {
			// 페이지 번호가 없으면
			By BY_PAGES = By.xpath("//div[@id='cntsPaging01']/ul/li[@class='w2pageList_li_label']/a");
			List<WebElement> pageElements = driver.findElements(BY_PAGES, 1);
			if (pageElements == null || pageElements.isEmpty()) {
				return true;
			}

			WebElement lastPage = pageElements.get(pageElements.size() - 1);
			String clazz = lastPage.getAttribute("class");
			// 선택된게 마지막이 아니면
			if (!clazz.contains("w2pageList_label_selected")) {
				return false;
			}
			
			// 10단위 페이지 번호가 아니면
			int pageNumber = Utility.parseInteger(lastPage.getText(), 1);
			if (pageNumber % 10 != 0) {
				return true;
			}
			
			// 테이블 마지막 행이 보여지지 않으면
			WebElement lastTr = driver.lastElement(By.xpath("//table[@id='grid1_body_table']/tbody/tr"), TIMEOUT);
			if (!lastTr.isDisplayed()) {
				return true;
			}

			// 상장일과 같은달에 있으면
			Date last = Utility.parseDateTime(lastTr.findElement(By.xpath("td[1]")).getText(), null);
			if (LocalDate.ofInstant(start.toInstant(), Utility.ZONE_ID_KST).plusMonths(1).isAfter(LocalDate.ofInstant(last.toInstant(), Utility.ZONE_ID_KST))) {
				return true;
			}

			// 2010년이후꺼만 수집한다
			if (LocalDate.ofInstant(last.toInstant(), Utility.ZONE_ID_KST).getYear() == 2010) {
				return true;
			}

			// 모르겠다, 여기까지 오면 무한 루프다
			return false;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}
		return false;
	}

	public static ParserResult crawl(List<ItemDomain> items, Date start) {
		log.info("{} CrawlPriceCompanyThread.crawl(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		long freeMemorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getFreeMemorySize();
		int candidateProcessorsByFreeMemory = (int) (freeMemorySize / 512L / 1024L / 1024L);
		int processors = Math.min(Math.max(1, candidateProcessorsByFreeMemory), Runtime.getRuntime().availableProcessors() - 1);

		ExecutorService service = Executors.newFixedThreadPool(processors);
		List<Future<ParserResult>> futureList = new ArrayList<>();
		ConcurrentLinkedQueue<ItemDomain> queue = new ConcurrentLinkedQueue<ItemDomain>();
		queue.addAll(items);
		for (int cx = 0; cx < processors; cx++) {
			CrawlPriceCompanyThread thread = new CrawlPriceCompanyThread(queue, start);
			Future<ParserResult> future = service.submit(thread);
			futureList.add(future);
		}
		ParserResult container = ParserResult.builder().build();
		container.clear();
		for (Future<ParserResult> task : futureList) {
			try {
				ParserResult result = task.get();
				container.addAll(result);
				log.info("{} 『{}』 CrawlPriceCompanyThread.crawl(#{})", Utility.indentMiddle(), result, Utility.size(items));
			} catch (Exception e) {
			}
		}

		log.info("{} 『{}』 CrawlPriceCompanyThread.crawl(#{}) - {}", Utility.indentEnd(), container, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return container;
	}

	public static ParserResult crawl(ItemParam item) {
		log.info("{} CrawlPriceCompanyThread.crawl({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		ConcurrentLinkedQueue<ItemDomain> queue = new ConcurrentLinkedQueue<ItemDomain>();
		queue.add(item);
		CrawlPriceCompanyThread thread = new CrawlPriceCompanyThread(queue, item.getStart());
		boolean debug = CrawlerService.getDebug();
		CrawlerService.setDebug(false);
		ExecutorService service = Executors.newFixedThreadPool(1);
		Future<ParserResult> future = service.submit(thread);
		try {
			ParserResult result = future.get();
			CrawlerService.setDebug(debug);

			log.info("{} {} CrawlPriceCompanyThread.crawl({}) - {}", Utility.indentEnd(), result, item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
		}

		CrawlerService.setDebug(debug);
		log.info("{} EMPY CrawlPriceCompanyThread.crawl({}) - {}", Utility.indentEnd(), item, Utility.toStringPastTimeReadable(started));
		return new ParserResult().clear();
	}

}
