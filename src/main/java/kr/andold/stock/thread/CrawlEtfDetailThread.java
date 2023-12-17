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
import kr.andold.stock.domain.StockItemDomain;
import kr.andold.stock.service.ChromeDriverWrapper;
import kr.andold.stock.service.StockCrawlerService;
import kr.andold.stock.service.StockParserService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.StockParserService.StockParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CrawlEtfDetailThread implements Callable<StockParserResult> {
	private static final String URL = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS906032V.xml&menuNo=514";
	private static String MARK_END_POINT = "KEYWORD\tETF 상세\tURL\t" + URL + "\n";
	private static final int JOB_SIZE = 8;
	private static final String MARK_ANDOLD_SINCE = StockCrawlerService.MARK_ANDOLD_SINCE;
	private static final Boolean debug = StockCrawlerService.debug;
	private static final String NEWLINE = "\n";

	private ConcurrentLinkedQueue<StockItemDomain> items;
	private ChromeDriverWrapper driver;
	private WebElement symbolSearchElement;
	private WebElement searchElement;
	private WebElement popupCloseIconElement; // 검색결과창의 닫기 아이콘

	public CrawlEtfDetailThread(ConcurrentLinkedQueue<StockItemDomain> list) {
		this.items = list;
	}

	@Override
	public StockParserResult call() throws Exception {
		log.info("{} CrawlEtfDetailThread(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		StockParserResult result = StockParserResult.builder().build();
		result.clear();
		driver = StockCrawlerService.defaultChromeDriver();

		try {
			driver.navigate().to(URL);
			symbolSearchElement = driver.findElement(By.xpath("//a[@id='sn_group4']"), 2000);	// 종목명 검색
			searchElement = driver.findElement(By.xpath("//a[@id='group137']"), 2000);	// 조회
			popupCloseIconElement = driver.findElement(By.xpath("//div[@id='group241']/a[@id='anchor2']"), 2000); // 검색결과창의 닫기 아이콘
			driver.findElement(By.xpath("//a[@id='btn_wide']"), 2000).click(); // 넓게 보기 아이콘 크릭
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
			return result;
		}

		while (items.peek() != null) {
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_END_POINT);
			for (int cx = 0; cx < JOB_SIZE; cx++) {
				StockItemDomain item = items.poll();
				if (item == null) {
					break;
				}

				String code = item.getCode();
				if (code == null || code.isBlank() || item.getEtf() == null || !item.getEtf()) {
					log.info("{} {}/{} 대상아님 『{}』 CrawlCompanyDividendHistoryThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}
				if (debug && new Random().nextDouble() < 0.9) {
					log.trace("{} {}/{} 뽑기 제외 『{}』 CrawlEtfDetailThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}

				log.debug("{} {}/{} 진행 『{}』 CrawlEtfDetailThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
				String text = extract(item);
				sb.append(text);
			}
			sb.append(MARK_END_POINT);
			String text = new String(sb);
			StockParserResult resultDividendHistoryEtf = StockParserService.parse(text, false);
			result.addAll(resultDividendHistoryEtf);
		}
		driver.quit();
		log.info("{} 『{}』 CrawlEtfDetailThread(#{}) - {}", Utility.indentEnd(), result, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return result;
	}

	private String extract(StockItemDomain item) {
		log.info("{} CrawlEtfDetailThread.extract({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		try {
			String code = item.getCode();
			String symbol = item.getSymbol();

			driver.switchTo().defaultContent();
			symbolSearchElement.click();
			WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeEtfnm']"), 2000);
			driver.switchTo().frame(frame);
			WebElement inputSearchElement = driver.findElement(By.xpath("//input[@id='search_string']"), 2000);	// 입력창
			WebElement searchSymbolIconElement = driver.findElement(By.xpath("//a[@id='group236']"), 2000);	// 검색 아이콘
			inputSearchElement.clear();
			inputSearchElement.sendKeys("andold"); // 코드 입력
			searchSymbolIconElement.click();
			inputSearchElement.clear();
			inputSearchElement.sendKeys(code); // 코드 입력
			searchSymbolIconElement.click();

			String xpathSearchResult = "//ul[@id='contentsList']/li/a";
			List<WebElement> resultSearch = driver.findElements(By.xpath(xpathSearchResult), 4000);
			String oneXpathCandidate1 = String.format("//*[@id='contentsList']//a[contains(text(),'%s']", symbol.strip());
			String oneXpathCandidate2 = String.format("//*[@id='contentsList']//a[contains(text(),'%s']", symbol.replaceAll("[\s]+", ""));
			if (resultSearch.size() == 0) {
				driver.switchTo().defaultContent();
				popupCloseIconElement.click();
				log.info("{} #{} 없는 종목 『{}』 CrawlEtfDividendHistoryThread() - {}", Utility.indentEnd(), Utility.size(items), item, Utility.toStringPastTimeReadable(started));
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
				log.info("{} #{} 모호한 검색 결과 『{}』 CrawlEtfDividendHistoryThread() - {}", Utility.indentEnd(), Utility.size(items), item, Utility.toStringPastTimeReadable(started));
				return "";
			}

			driver.switchTo().defaultContent();
			searchElement.click();
			Thread.sleep(100);

			StringBuffer sb = new StringBuffer();
			sb.append(String.format("KEYWORD\t%s\t%s\n", code, symbol));
			sb.append(driver.findElement(By.xpath("//h3[@id='KOR_SECN_NM']"), 2000).getText());	// symbol
			sb.append(NEWLINE);
			sb.append(driver.findElement(By.xpath("//div[@id='ETF_BIG_SORT_NM']"), 2000).getText());	// 분류
			sb.append(NEWLINE);
			sb.append(driver.findElement(By.xpath("//span[@id='SETUP_DT']"), 2000).getText());	// 설정일
			sb.append(NEWLINE);
			sb.append(driver.findElement(By.xpath("//dd[@id='TOT_RECM_RATE']"), 2000).getText());	// 보수(%)
			sb.append(NEWLINE);

			sb.append(MARK_ANDOLD_SINCE);
			String result = new String(sb);

			log.info("{} #{} 『{}』 CrawlEtfDetailThread.extract({}) - {}", Utility.indentEnd(), Utility.size(items), Utility.ellipsisEscape(result, 16), item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
		}

		log.info("{} #{} 『{}』 CrawlEtfDetailThread.extract(#{}) - {}", Utility.indentEnd(), Utility.size(items), "", item, Utility.toStringPastTimeReadable(started));
		return "";
	}

	public static StockParserResult crawl(List<StockItemDomain> items) {
		int processors = Runtime.getRuntime().availableProcessors() - 1;
		ExecutorService service = Executors.newFixedThreadPool(processors);
		List<Future<StockParserResult>> futureList = new ArrayList<>();
		ConcurrentLinkedQueue<StockItemDomain> queue = new ConcurrentLinkedQueue<StockItemDomain>();
		queue.addAll(items);
		for (int cx = 0; cx < processors; cx++) {
			CrawlEtfDetailThread thread = new CrawlEtfDetailThread(queue);
			Future<StockParserResult> future = service.submit(thread);
			futureList.add(future);
		}
		StockParserResult container = new StockParserResult();
		container.clear();
		for (Future<StockParserResult> task : futureList) {
			try {
				StockParserResult result = task.get();
				container.addAll(result);
				log.info("{} 『{}』 CrawlEtfDetailThread.crawl(#{})", Utility.indentMiddle(), result, Utility.size(items));
			} catch (Exception e) {
			}
		}
		return container;
	}

}
