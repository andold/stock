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
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.param.ItemParam;
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
	@Setter private static Boolean debug = CrawlerService.debug;

	public CrawlPriceEtfThread(ConcurrentLinkedQueue<ItemDomain> list) {
		this.items = list;
	}

	public CrawlPriceEtfThread(ConcurrentLinkedQueue<ItemDomain> list, Date start) {
		this.items = list;
		this.startDate = String.format("%1$tY%1$tm%1$td",
				(start == null)
					? Date.from(LocalDate.now().minusDays(7).atStartOfDay().toInstant(Utility.ZONE_OFFSET_KST))
					: start);
	}

	public ParserResult call() throws Exception {
		log.info("{} CrawlPriceEtfThread(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		ParserResult result = ParserResult.builder().build().clear();
		driver = CrawlerService.defaultChromeDriver();

		try {
			driver.navigate().to(URL);
			
			// 넓게 보기 아이콘 클릭
			By BY_SHOW_WIDE_ICON = By.xpath("//a[@id='btn_wide']");
			driver.waitUntilIsDisplayed(BY_SHOW_WIDE_ICON, true, TIMEOUT * 4);
			driver.findElement(BY_SHOW_WIDE_ICON, TIMEOUT).click();
			
			// 시작일 입력
			WebElement start = driver.findElement(By.xpath("//input[@id='inputCalendar1_input']"), TIMEOUT);
			start.clear();
			start.sendKeys(startDate);
			start.sendKeys(Keys.TAB); // 시작일 입력
			
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
			return result;
		}

		while (items.peek() != null) {
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT);
			for (int cx = 0; cx < JOB_SIZE; cx++) {
				long forStarted = System.currentTimeMillis();

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

				String text = extract(item);
				sb.append(text);

				log.info("{} {}/{}/{}:{} EXTRACTED 『{}』 CrawlPriceEtfThread.call({})", Utility.indentMiddle()
						, cx, JOB_SIZE, Utility.size(items), Utility.toStringPastTimeReadable(forStarted), item);
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
			driver.clickIfExist(By.xpath("//div[@id='group1520']/a[@id='anchor2']"));	// 검색결과창의 닫기 아이콘

			//	종목명 검색 링크 클릭
			driver.clickIfExist(By.xpath("//a[@id='sn_group4']"));

			//	떠 있는 팝업으로 이동
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeEtfnm']"), TIMEOUT));

			//	코드 입력
			WebElement inputSearchElement = driver.findElement(By.xpath("//input[@id='search_string']"), TIMEOUT);	// 입력창
			inputSearchElement.clear();
			inputSearchElement.sendKeys(code); // 코드 입력
			
			// 종목명 검색 아이콘 클릭
			if (!clickSearchItemCode(driver)) {
				log.warn("{} #{} 『{}』 CrawlPriceEtfThread.extract({}) - {}", Utility.indentEnd(), Utility.size(items), "", item, Utility.toStringPastTimeReadable(started));
				return "";
			}

			//	검색 결과 확인
			if (driver.findElements(By.xpath("//div[@id='group227']/ul[@id='contentsList']/li/a"), TIMEOUT).size() != 1) {
				log.warn("{} #{} 모호하다 『{}』 CrawlPriceEtfThread.extract({}) - {}", Utility.indentEnd(), Utility.size(items), "", item, Utility.toStringPastTimeReadable(started));
				return "";
			}
			
			//	검색 결과에서 선택
			driver.clickIfExist(By.xpath("//div[@id='group227']/ul[@id='contentsList']/li/a[1]"));

			//	팝업이 닫혔다, 돌아간다
			driver.switchTo().defaultContent();

			// 조회 아이콘 클릭
			if (!clickSearchPrice(driver)) {
				log.warn("{} #{} CrawlPriceEtfThread.extract({}) - {}", Utility.indentEnd()
						, Utility.size(items)
						, item
						, Utility.toStringPastTimeReadable(started));
				log.warn("{} #{} 『{}』 CrawlPriceEtfThread.extract({}) - {}", Utility.indentEnd(), Utility.size(items), "", item, Utility.toStringPastTimeReadable(started));
				return "";
			}

			// 첫번째 후보 선택
			driver.clickIfExist(By.xpath("//div[@id='group227']/ul[@id='contentsList']/li/a[1]"));

			//	내용 저장
			StringBuffer sb = new StringBuffer();
			sb.append(String.format("%s\t%s\n", code, item.getSymbol()));
			
			// 상세 정보
			extractItemDetail(driver, sb);

			while(true) {
				//	테이블
				WebElement table = driver.findElement(By.xpath("//table[@id='grid1_body_table']"), TIMEOUT);
				sb.append(driver.extractTextFromTableElement(table));

				if (isLastPage(driver, item.getIpoDate())) {
					break;
				}
				
				clickNextPage(driver);
				log.info("{} #{} 쪽:{} CrawlPriceEtfThread.extract({}) - {}", Utility.indentMiddle()
						, Utility.size(items)
						, driver.getText(By.xpath("//div[@id='pageList1']/ul/li/a[@class='w2pageList_control_label w2pageList_label_selected']"), TIMEOUT, "오류")
						, item
						, Utility.toStringPastTimeReadable(started));
			}
			sb.append(MARK_ANDOLD_SINCE);
			String result = new String(sb);

			log.debug("{} #{} 『{}』 CrawlPriceEtfThread.extract({}) - {}", Utility.indentEnd(), Utility.size(items), Utility.ellipsisEscape(result, 16), item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
			driver.switchTo().defaultContent();
		}

		log.debug("{} #{} 『{}』 CrawlPriceEtfThread.extract(#{}) - {}", Utility.indentEnd(), Utility.size(items), "", item, Utility.toStringPastTimeReadable(started));
		return "";
	}

	private boolean extractItemDetail(ChromeDriverWrapper driver, StringBuffer sb) {
		try {
			// 종목이름 - symbol[${code}] 형태로 추출된다 ex) TIGER 미국나스닥100커버드콜(합성)[441680]
			sb.append(String.format("KEYWORD\t%s\n", driver.findElement(By.xpath("//h3[@id='KOR_SECN_NM']"), TIMEOUT).getText()));
			
			// 분류 - ex) 파생상품/구조화
			sb.append(String.format("KEYWORD\t%s\n", driver.findElement(By.xpath("//div[@id='ETF_BIG_SORT_NM']"), TIMEOUT).getText()));
			
			// 전일발행주식수(주) - ex) 23,800,000
			sb.append(String.format("KEYWORD\t%s\n", driver.findElement(By.xpath("//dd[@id='TOT_ISSU_STKQTY']"), TIMEOUT).getText()));
			return true;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}
		return false;
	}

	private boolean clickSearchItemCode(ChromeDriverWrapper driver) {
		try {
			//	이전거 첫번째 종목 검색 결과
			String XPATH_MARK_CODE_SEARCH_DONE = "//div[@id='group227']/ul[@id='contentsList']/li/a[1]";
			String previousSymbol = driver.getText(By.xpath(XPATH_MARK_CODE_SEARCH_DONE), 1, XPATH_MARK_CODE_SEARCH_DONE);
			driver.clickIfExist(By.xpath("//div[@id='group252']/a[@id='group236']/img"));
			return driver.waitUntilTextNotInclude(By.xpath(XPATH_MARK_CODE_SEARCH_DONE), TIMEOUT, previousSymbol);
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}
		return false;
	}

	private boolean clickSearchPrice(ChromeDriverWrapper driver) {
		try {
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='group1500']"), false, TIMEOUT);

			By BY_TABLE_1ST_LINE = By.xpath("//table[@id='grid1_body_table']/tbody/tr[1]");
			String text1stLine = driver.getText(BY_TABLE_1ST_LINE, 1, MARK_ANDOLD_SINCE);
			driver.clickIfExist(By.xpath("//a[@id='group179']"));
			driver.waitUntilTextNotInclude(BY_TABLE_1ST_LINE, TIMEOUT, text1stLine);
			return true;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}
		return false;
	}

	private boolean clickNextPage(ChromeDriverWrapper driver) {
		try {
			By BY_TABLE_1ST_LINE = By.xpath("//table[@id='grid1_body_table']/tbody/tr[1]/");
			String text1stLine = driver.getText(BY_TABLE_1ST_LINE, 1, MARK_ANDOLD_SINCE);
			driver.clickIfExist(By.xpath("//li[@id='pageList1_next_btn']/a"));
			driver.waitUntilTextNotInclude(BY_TABLE_1ST_LINE, TIMEOUT, text1stLine);
			return true;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}
		return false;
	}

	private boolean isLastPage(ChromeDriverWrapper driver, Date start) {
		try {
			By BY_PAGES = By.xpath("//div[@id='pageList1']/ul/li[@class='w2pageList_li_label']/a");
			List<WebElement> pageElements = driver.findElements(BY_PAGES, 1);
			// 더이상 없으면
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

			// 모르겠다
			return false;
		}
		catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}
		return false;
	}

	public static ParserResult crawl(List<ItemDomain> items, Date start) {
		log.info("{} CrawlPriceEtfThread.crawl(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		long freeMemorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getFreeMemorySize();
		int candidateProcessorsByFreeMemory = (int) (freeMemorySize / 512L / 1024L / 1024L);
		int processors = Math.min(Math.max(1, candidateProcessorsByFreeMemory), Runtime.getRuntime().availableProcessors() - 1);
		if (debug) {
			processors = 1;
		}

		ExecutorService service = Executors.newFixedThreadPool(processors);
		List<Future<ParserResult>> futureList = new ArrayList<>();
		ConcurrentLinkedQueue<ItemDomain> queue = new ConcurrentLinkedQueue<ItemDomain>();
		queue.addAll(items);
		for (int cx = 0; cx < processors; cx++) {
			CrawlPriceEtfThread thread = new CrawlPriceEtfThread(queue, start);
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

	public static ParserResult crawl(ItemParam item) {
		log.info("{} CrawlPriceEtfThread.crawl({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		ConcurrentLinkedQueue<ItemDomain> queue = new ConcurrentLinkedQueue<ItemDomain>();
		queue.add(item);
		CrawlPriceEtfThread thread = new CrawlPriceEtfThread(queue, item.getStart());
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
