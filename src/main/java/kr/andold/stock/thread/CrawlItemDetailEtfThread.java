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
import org.openqa.selenium.WebElement;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.service.ChromeDriverWrapper;
import kr.andold.stock.service.CrawlerService;
import kr.andold.stock.service.ParserService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CrawlItemDetailEtfThread implements Callable<ParserResult> {
	private static final String URL = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS906032V.xml&menuNo=514";
	private static String MARK_END_POINT = "KEYWORD\tETF 상세\tURL\t" + URL + "\n";
	private static final int TIMEOUT = 4000;
	private static final int JOB_SIZE = 8;
	private static final String MARK_ANDOLD_SINCE = CrawlerService.MARK_ANDOLD_SINCE;
	private static final Boolean debug = CrawlerService.debug;
	private static final String NEWLINE = "\n";

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

		ParserResult result = ParserResult.builder().build();
		result.clear();
		driver = CrawlerService.defaultChromeDriver();

		try {
			// 화면 열기
			driver.navigate().to(URL);
			
			// 화면이 표시될 때까지
			driver.waitUntilIsDisplayed(By.xpath("//a[@id='btn_wide']"), true, TIMEOUT * 4);

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

				String code = item.getCode();
				if (code == null || code.isBlank() || (item.getEtf() != null && !item.getEtf())) {
					log.trace("{} {}/{} 대상아님 『{}』 CrawlItemDetailEtfThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
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
		log.debug("{} CrawlItemDetailEtfThread.extract({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		try {
			String code = item.getCode();
			String symbol = item.getSymbol();

			driver.switchTo().defaultContent();
			
			// 종목명 검색 아이콘 클릭
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='group239']"), false, TIMEOUT);
			driver.findElement(By.xpath("//div[@id='content']//a[@id='sn_group4']/img"), TIMEOUT).click();

			WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeEtfnm']"), TIMEOUT);
			driver.switchTo().frame(frame);

			// 코드 입력
			WebElement inputSearchElement = driver.findElement(By.xpath("//input[@id='search_string']"), TIMEOUT);	// 입력창
			inputSearchElement.clear();
			inputSearchElement.sendKeys(code);

			// 검색 아이콘 클릭
			By BY_CODE_SEARCH_RESULT = By.xpath("//ul[@id='contentsList']/li/a");
			String previousSearchResultText = driver.getText(BY_CODE_SEARCH_RESULT, TIMEOUT, "andold");
			driver.findElement(By.xpath("//a[@id='group236']"), TIMEOUT).click();
			driver.waitUntilTextNotInclude(BY_CODE_SEARCH_RESULT, TIMEOUT, previousSearchResultText);

			// 검색 결과
			String xpathSearchResult = "//ul[@id='contentsList']/li/a";
			List<WebElement> resultSearch = driver.findElements(By.xpath(xpathSearchResult), TIMEOUT);
			if (resultSearch.size() == 0) {
				driver.switchTo().defaultContent();
				popupCloseIconElement.click();
				log.debug("{} #{} 없는 종목 『{}』 CrawlItemDetailEtfThread() - {}", Utility.indentEnd(), Utility.size(items), item, Utility.toStringPastTimeReadable(started));
				return "";
			} else if (resultSearch.size() == 1) {
				driver.findElement(By.xpath(xpathSearchResult), TIMEOUT).click();
			} else {
				driver.switchTo().defaultContent();
				popupCloseIconElement.click();
				log.debug("{} #{} 모호한 검색 결과 『{}』 CrawlItemDetailEtfThread() - {}", Utility.indentEnd(), Utility.size(items), item, Utility.toStringPastTimeReadable(started));
				return "";
			}

			// 조회 클릭
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//a[@id='group137']"), TIMEOUT).click();
			driver.findElementIncludeText(By.xpath("//h3[@id='KOR_SECN_NM']"), TIMEOUT, code);

			StringBuffer sb = new StringBuffer();
			sb.append(String.format("KEYWORD\t%s\t%s\n", code, symbol));
			sb.append(driver.findElementIncludeText(By.xpath("//h3[@id='KOR_SECN_NM']"), TIMEOUT, code).getText());	// symbol
			sb.append(NEWLINE);
			sb.append(driver.findElement(By.xpath("//div[@id='ETF_BIG_SORT_NM']"), TIMEOUT).getText());	// 분류
			sb.append(NEWLINE);
			sb.append(driver.findElement(By.xpath("//span[@id='SETUP_DT']"), TIMEOUT).getText());	// 설정일
			sb.append(NEWLINE);
			sb.append(driver.findElement(By.xpath("//dd[@id='TOT_RECM_RATE']"), TIMEOUT).getText());	// 보수(%)
			sb.append(NEWLINE);

			sb.append(MARK_ANDOLD_SINCE);
			String result = new String(sb);

			log.info("{} #{} 『{}』 CrawlItemDetailEtfThread.extract({}) - {}", Utility.indentEnd(), Utility.size(items), Utility.ellipsisEscape(result, 16), item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
		}

		log.debug("{} #{} 『{}』 CrawlItemDetailEtfThread.extract(#{}) - {}", Utility.indentEnd(), Utility.size(items), "", item, Utility.toStringPastTimeReadable(started));
		return "";
	}

	public static ParserResult crawl(List<ItemDomain> items) {
		log.info("{} CrawlItemDetailEtfThread.crawl(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		int processors = Runtime.getRuntime().availableProcessors() - 1;
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

}
