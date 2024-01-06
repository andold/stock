package kr.andold.stock.thread;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import kr.andold.stock.crawler.ChromeDriverWrapper;
import kr.andold.stock.crawler.CrawlerService;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.service.ParserService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

//KSD증권정보포털(SEIBro) > ETF > ETF종합정보 > 종목상세
@Slf4j
public class CrawlItemDetailEtfThread implements Callable<ParserResult> {
	private static final String URL = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS906032V.xml&menuNo=514";
	private static String MARK_END_POINT = String.format("KEYWORD\t%s\tURL\t%s\n", "ETF 상세", URL);
	private static final int TIMEOUT = 4000;
	private static final int JOB_SIZE = 8;
	private static final String MARK_ANDOLD_SINCE = CrawlerService.MARK_ANDOLD_SINCE;
	@Setter private static  Boolean debug = CrawlerService.debug;

	private ConcurrentLinkedQueue<ItemDomain> items;
	private ChromeDriverWrapper driver;
	private WebElement popupCloseIconElement; // 검색결과창의 닫기 아이콘

	public CrawlItemDetailEtfThread(ConcurrentLinkedQueue<ItemDomain> list) {
		this.items = list;
	}

	@Override
	public ParserResult call() throws Exception {
		log.info("{} CrawlItemDetailEtfThread(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		ParserResult result = ParserResult.builder().build().clear();
		driver = CrawlerService.defaultChromeDriver();

		try {
			// 화면 열기
			driver.navigate().to(URL);
			
			// 화면이 표시될 때까지
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='___processbar2']"), false, TIMEOUT * 4);	// 진행중 화면은 지워지고
			driver.waitUntilIsDisplayed(By.xpath("//a[@id='btn_wide']"), true, TIMEOUT * 4);	//	넓게보기 아이콘은 보이고

			popupCloseIconElement = driver.findElement(By.xpath("//div[@id='group241']/a[@id='anchor2']"), TIMEOUT); // 검색결과창의 닫기 아이콘
			
			// 넓게 보기 아이콘 클릭
			driver.findElement(By.xpath("//a[@id='btn_wide']"), TIMEOUT).click();
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

				if (debug && new Random().nextDouble() < 0.95) {
					log.trace("{} {}/{} 뽑기 제외 『{}』 CrawlItemDetailEtfThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}

				log.info("{} {}/{} 진행 『{}』 CrawlItemDetailEtfThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
				String text = extract(item);
				sb.append(text);
			}
			sb.append(MARK_END_POINT);
			String text = new String(sb);
			ParserResult resultDividendHistoryEtf = ParserService.parse(text, false);
			result.addAll(resultDividendHistoryEtf);
			log.info("{} 수정되어야해 『{}』 CrawlItemDetailEtfThread(#{}) - {}", Utility.indentMiddle(), resultDividendHistoryEtf, Utility.size(items), Utility.toStringPastTimeReadable(started));
		}
		driver.quit();
		log.info("{} {} CrawlItemDetailEtfThread(#{}) - {}", Utility.indentMiddle(), result, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return result;
	}

	private String extract(ItemDomain item) {
		log.debug("{} CrawlItemDetailEtfThread.extract({} {} {})", Utility.indentStart(), item, item.getEtf(), item.getType());
		long started = System.currentTimeMillis();

		try {
			String code = item.getCode();
			String symbol = item.getSymbol();

			// 여러개의 검색결과일 경우에 하나씩 확인해 보기 위해서
			for (int cx = 0; cx < 4; cx++) {
				driver.switchTo().defaultContent();

				// 종목명 검색 아이콘 클릭
				if (!clickSearchCodeIconInMain(driver)) {
					log.warn("{} #{} 『{}』 INVALID CrawlItemDetailEtfThread.extract({}) - {}", Utility.indentEnd(), Utility.size(items), "", item, Utility.toStringPastTimeReadable(started));
					break;
				}

				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeEtfnm']"), TIMEOUT));

				// 코드 입력
				WebElement inputSearchElement = driver.findElement(By.xpath("//input[@id='search_string']"), TIMEOUT);	// 입력창
				inputSearchElement.clear();
				inputSearchElement.sendKeys(code);

				// 검색 아이콘 클릭
				if (!clickSearchCodeIconInPopup(driver)) {
					log.warn("{} #{} 『{}』 INVALID CrawlItemDetailEtfThread.extract({}) - {}", Utility.indentEnd(), Utility.size(items), "", item, Utility.toStringPastTimeReadable(started));
					break;
				}

				// 검색 결과
				By BY_CODE_SEARCH_RESULT = By.xpath("//ul[@id='contentsList']/li/a");
				List<WebElement> resultSearch = driver.findElements(BY_CODE_SEARCH_RESULT, TIMEOUT);
				if (resultSearch.size() <= cx) {
					driver.switchTo().defaultContent();
					popupCloseIconElement.click();
					log.warn("{} #{} 없는 종목 『{}, eft:{}, type: {}』 CrawlItemDetailEtfThread.extract() - {}", Utility.indentEnd()
							, Utility.size(items), item, item.getEtf(), item.getType(), Utility.toStringPastTimeReadable(started));
					return "";
				}
				
				// 선택
				resultSearch.get(cx).click();

				// 조회 클릭
				driver.switchTo().defaultContent();
				driver.findElement(By.xpath("//a[@id='group137']"), TIMEOUT).click();
				
				// 제목에 코드가 있으면, 성공
				if (driver.waitUntilTextInclude(By.xpath("//h3[@id='KOR_SECN_NM']"), TIMEOUT, code)) {
					break;
				}

			}
			StringBuffer sb = new StringBuffer();
			sb.append(String.format("KEYWORD\t%s\t%s\n", code, symbol));
			sb.append(String.format("%s\n", driver.findElementIncludeText(By.xpath("//h3[@id='KOR_SECN_NM']"), TIMEOUT, code).getText()));	// symbol
			sb.append(String.format("%s\n", driver.findElement(By.xpath("//div[@id='ETF_BIG_SORT_NM']"), TIMEOUT).getText()));	// 분류
			sb.append(String.format("%s\n", driver.findElement(By.xpath("//span[@id='SETUP_DT']"), TIMEOUT).getText()));	// 설정일
			sb.append(String.format("%s\n", driver.findElement(By.xpath("//dd[@id='TOT_RECM_RATE']"), TIMEOUT).getText()));	// 보수(%)
			sb.append(MARK_ANDOLD_SINCE);
			String result = new String(sb);

			log.debug("{} #{} 『{}』 CrawlItemDetailEtfThread.extract({}) - {}", Utility.indentEnd(), Utility.size(items), Utility.ellipsisEscape(result, 16), item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
		}

		log.debug("{} #{} 『{}』 CrawlItemDetailEtfThread.extract(#{}) - {}", Utility.indentEnd(), Utility.size(items), "", item, Utility.toStringPastTimeReadable(started));
		return "";
	}

	private boolean clickSearchCodeIconInPopup(ChromeDriverWrapper driver) {
		try {
			// 진행중 메시지가 없어질때까지
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='___processbar2']"), false, TIMEOUT);

			By BY_SEARCH_RESULT_COUNT = By.xpath("//span[@id='P_ListCnt']");
			String INVALID_COUNT = "-1";
			driver.setText(BY_SEARCH_RESULT_COUNT, INVALID_COUNT, TIMEOUT);

			driver.findElement(By.xpath("//a[@id='group236']"), TIMEOUT).click();

			driver.waitUntilTextNotInclude(BY_SEARCH_RESULT_COUNT, TIMEOUT, INVALID_COUNT);
			return true;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}
		return false;
	}

	private boolean clickSearchCodeIconInMain(ChromeDriverWrapper driver) {
		try {
			By BY_SEARCH_CODE_ICON = By.xpath("//div[@id='content']//a[@id='sn_group4']/img");
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='group239']"), false, TIMEOUT);
			driver.waitUntilIsDisplayed(BY_SEARCH_CODE_ICON, true, TIMEOUT);
			driver.clickIfExist(BY_SEARCH_CODE_ICON);
			return true;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}
		return false;
	}

	public static ParserResult crawl(List<ItemDomain> items) {
		log.info("{} CrawlItemDetailEtfThread.crawl(#{})", Utility.indentStart(), Utility.size(items));
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
			CrawlItemDetailEtfThread thread = new CrawlItemDetailEtfThread(queue);
			Future<ParserResult> future = service.submit(thread);
			futureList.add(future);
		}
		ParserResult container = new ParserResult();
		container.clear();
		for (Future<ParserResult> task : futureList) {
			try {
				ParserResult result = task.get();
				container.addAll(result);
				log.info("{} 『{}』 CrawlItemDetailEtfThread.crawl(#{})", Utility.indentMiddle(), result, Utility.size(items));
			} catch (Exception e) {
			}
		}

		log.info("{} 『{}』 CrawlItemDetailEtfThread.crawl(#{}) - {}", Utility.indentEnd(), container, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return container;
	}

	public static ParserResult crawl(ItemDomain item) {
		ConcurrentLinkedQueue<ItemDomain> queue = new ConcurrentLinkedQueue<ItemDomain>();
		queue.add(item);
		CrawlItemDetailEtfThread thread = new CrawlItemDetailEtfThread(queue);
		setDebug(false);
		ExecutorService service = Executors.newFixedThreadPool(1);
		Future<ParserResult> future = service.submit(thread);
		try {
			return future.get();
		} catch (InterruptedException e) {
		} catch (ExecutionException e) {
		}
		return new ParserResult().clear();
	}

}
