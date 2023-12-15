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

import kr.andold.stock.domain.StockItemDomain;
import kr.andold.stock.service.ChromeDriverWrapper;
import kr.andold.stock.service.StockCrawlerService;
import kr.andold.stock.service.StockParserService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.StockParserService.StockParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CrawlEtfDividendHistoryThread implements Callable<StockParserResult> {
	private static final int JOB_SIZE = 4;
	private static final String MARK_ANDOLD_SINCE = StockCrawlerService.MARK_ANDOLD_SINCE;
	private static final String mark = "KEYWORD\tETF 배당금 내역\tKSD 증권정보포털 SEIBro\tURL\thttps://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06030V.xml&menuNo=179\n";

	private boolean debug = true;
	private ConcurrentLinkedQueue<StockItemDomain> items;

	private ChromeDriverWrapper driver;
	private WebElement startDateElement; // 조회기간 시작일
	private WebElement searchSymbolIconElement; // 종목명 검색 아이콘
	private WebElement seachButton; // 조회 버튼
	private WebElement popupCloseIconElement; // 검색결과창의 닫기 아이콘

	public CrawlEtfDividendHistoryThread(ConcurrentLinkedQueue<StockItemDomain> list) {
		this.items = list;
	}

	public StockParserResult call() throws Exception {
		log.info("{} CrawlEtfDividendHistoryThread(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		StockParserResult result = StockParserResult.builder().build();
		result.clear();
		driver = StockCrawlerService.defaultChromeDriver();
		final String url = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06030V.xml&menuNo=179";
		try {
			driver.navigate().to(url);
			startDateElement = driver.findElement(By.xpath("//input[@id='sd1_inputCalendar1_input']"), 2000); // 조회기간 시작일
			searchSymbolIconElement = driver.findElement(By.xpath("//dd[@id='sn_group2']/a[@id='sn_group4']"), 2000); // 종목명 검색 아이콘
			seachButton = driver.findElement(By.xpath("//*[@id='image17']"), 2000); // 조회 버튼
			popupCloseIconElement = driver.findElement(By.xpath("//div[@id='group164']/a[@id='anchor3']"), 2000); // 검색결과창의 닫기 아이콘

			startDateElement.clear();
			startDateElement.sendKeys("2010/01/01"); // 조회기간 시작일
			startDateElement.sendKeys(Keys.TAB); // 시작일 입력
			driver.findElement(By.id("btn_wide_img"), 2000).click(); // 넓게 보기 아이콘
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
			return result;
		}

		while (items.peek() != null) {
			StringBuffer sb = new StringBuffer();
			sb.append(mark);
			for (int cx = 0; cx < JOB_SIZE; cx++) {
				StockItemDomain item = items.poll();
				if (item == null) {
					break;
				}
				
				String code = item.getCode();
				String symbol = item.getSymbol();
				if (code == null || code.isBlank() || symbol == null || symbol.isBlank() || (item.getEtf() != null && !item.getEtf())) {
					log.debug("{} {}/{} 대상아님 『{}』 CrawlDividendHistoryEtfThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}
				
				if (debug && new Random().nextDouble() < 0.9) {
					log.debug("{} {}/{} 뽑기 제외 『{}』 CrawlEtfDividendHistoryThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}

				String text = extract(item);
				sb.append(text);
			}
			sb.append(mark);
			String text = new String(sb);
			StockParserResult resultDividendHistoryEtf = StockParserService.parse(text, false);
			result.addAll(resultDividendHistoryEtf);
			log.debug("{} #{} {} CrawlEtfDividendHistoryThread() - {}", Utility.indentMiddle(), Utility.size(items), resultDividendHistoryEtf, Utility.toStringPastTimeReadable(started));
		}
		driver.quit();
		log.info("{} 『{}』 CrawlEtfDividendHistoryThread(#{}) - {}", Utility.indentEnd(), result, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return result;
	}

	private String extract(StockItemDomain item) {
		log.info("{} CrawlEtfDividendHistoryThread({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		try {
			String code = item.getCode();
			String symbol = item.getSymbol();

			driver.switchTo().defaultContent();
			searchSymbolIconElement.click(); // 종목명 검색 아이콘
			
			WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeEtfnm']"), 4000);
			driver.switchTo().frame(frame);

			WebElement keywordElement = driver.findElement(By.xpath("//input[@id='search_string']"), 4000); // 종목명 검색어 입력창
			WebElement searchSymbolIconInnerFrameElement = driver.findElement(By.xpath("//div[@id='group252']/a[@id='group236']"), 2000); // 종목명 검색 아이콘
			driver.clear(By.xpath("//ul[@id='contentsList']/li"));
			keywordElement.clear();
			keywordElement.sendKeys("andold");
			searchSymbolIconInnerFrameElement.click();
			keywordElement.clear();
			keywordElement.sendKeys(code);
			searchSymbolIconInnerFrameElement.click();

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
			seachButton.click();
			Thread.sleep(100);
			WebElement table = driver.findElement(By.xpath("//*[@id='grid1_body_table']"), 2000);


			StringBuffer sb = new StringBuffer();
			sb.append(String.format("KEYWORD\t%s\n",  item.getCode()));
			sb.append(driver.extractTextFromTableElement(table));
			sb.append(MARK_ANDOLD_SINCE);

			String result = new String(sb);

			log.info("{} #{} 『{}』 CrawlEtfDividendHistoryThread({}) - {}", Utility.indentEnd(), Utility.size(items), Utility.ellipsisEscape(result, 16), item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
		}

		return "";
	}


	public static StockParserResult crawl(List<StockItemDomain> items) {
		int processors = Runtime.getRuntime().availableProcessors() - 1;
		ExecutorService service = Executors.newFixedThreadPool(processors);
		List<Future<StockParserResult>> futureList = new ArrayList<>();
		ConcurrentLinkedQueue<StockItemDomain> queue = new ConcurrentLinkedQueue<StockItemDomain>();
		queue.addAll(items);
		for (int cx = 0; cx < processors; cx++) {
			CrawlEtfDividendHistoryThread thread = new CrawlEtfDividendHistoryThread(queue);
			Future<StockParserResult> future = service.submit(thread);
			futureList.add(future);
		}
		StockParserResult container = StockParserResult.builder().build();
		container.clear();
		for (Future<StockParserResult> task : futureList) {
			try {
				StockParserResult result = task.get();
				container.addAll(result);
				log.info("{} 『{}』 crawl(#{})", Utility.indentMiddle(), result, Utility.size(items));
			} catch (Exception e) {
			}
		}
		return container;
	}

}
