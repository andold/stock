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
public class CrawlCompanyDetailThread implements Callable<StockParserResult> {
	private static final String URL = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02006V.xml&menuNo=44";
	private static String MARK_END_POINT = "KEYWORD\t주식 상세\tCrawlCompanyDetailThread\tURL\t" + URL + "\n";
	private static final int JOB_SIZE = 8;
	private static final String MARK_ANDOLD_SINCE = StockCrawlerService.MARK_ANDOLD_SINCE;
	private static final Boolean debug = StockCrawlerService.debug;
	private static final String NEWLINE = "\n";

	private ConcurrentLinkedQueue<StockItemDomain> items;
	private ChromeDriverWrapper driver;
	private WebElement popupCloseIconElement; // 검색결과창의 닫기 아이콘

	public CrawlCompanyDetailThread(ConcurrentLinkedQueue<StockItemDomain> list) {
		this.items = list;
	}

	@Override
	public StockParserResult call() throws Exception {
		log.info("{} CrawlCompanyDetailThread(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		StockParserResult result = StockParserResult.builder().build();
		result.clear();
		driver = StockCrawlerService.defaultChromeDriver();

		try {
			driver.navigate().to(URL);
			popupCloseIconElement = driver.findElement(By.xpath("//div[@id='group404']/a[@id='anchor2']"), 8000); // 검색결과창의 닫기 아이콘
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
				if (code == null || code.isBlank() || (item.getEtf() != null && item.getEtf())) {
					log.debug("{} {}/{} 대상아님 『{}』 CrawlCompanyDetailThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}
				if (debug && new Random().nextDouble() < 0.90) {
					log.trace("{} {}/{} 뽑기 제외 『{}』 CrawlCompanyDetailThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}

				log.debug("{} {}/{} 진행 『{}』 CrawlCompanyDetailThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
				String text = extract(item);
				sb.append(text);
			}
			sb.append(MARK_END_POINT);
			String text = new String(sb);
			StockParserResult resultDividendHistoryEtf = StockParserService.parse(text, debug);
			result.addAll(resultDividendHistoryEtf);
			log.info("{} 수정되어야해 『{}』 CrawlCompanyDetailThread(#{}) - {}", Utility.indentMiddle(), resultDividendHistoryEtf, Utility.size(items), Utility.toStringPastTimeReadable(started));
		}
		driver.quit();
		log.info("{} {} CrawlCompanyDetailThread(#{}) - {}", Utility.indentMiddle(), result, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return result;
	}

	private String extract(StockItemDomain item) {
		log.debug("{} CrawlCompanyDetailThread.extract({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		try {
			String code = item.getCode();
			String symbol = item.getSymbol();

			driver.switchTo().defaultContent();
			// 종목명 검색
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='___processbar2']"), false, 2000);
//			driver.findElement(By.xpath("//a[@id='sn_group4']"), 8000).click(); // 종목명 검색 아이콘
			driver.findElement(By.xpath("//img[@id='sn_image1']"), 8000).click(); // 종목명 검색 아이콘
//			driver.findElement(By.xpath("//a[@id='sn_group4']"), 2000);
//			driver.findElement(By.xpath("//img[@id='sn_image1']"), 2000);
//			driver.clickIfExist(By.xpath("//a[@id='sn_group4']"));
//			driver.clickIfExist(By.xpath("//img[@id='sn_image1']"));
			// 프래임
			WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframe1']"), 2000);
			driver.switchTo().frame(frame);

			WebElement inputSearchElement = driver.findElement(By.xpath("//input[@id='search_string']"), 2000);	// 입력창
			inputSearchElement.clear();
			inputSearchElement.sendKeys("andold"); // 코드 입력
			driver.findElement(By.xpath("//a[@id='P_group100']"), 2000).click(); // 종목명 검색 아이콘

			inputSearchElement.clear();
			inputSearchElement.sendKeys(code); // 코드 입력
			driver.findElement(By.xpath("//a[@id='P_group100']"), 2000).click(); // 종목명 검색 아이콘

			String xpathSearchResult = "//ul[@id='P_isinList']/li/a";
			List<WebElement> resultSearch = driver.findElements(By.xpath(xpathSearchResult), 4000);
			String oneXpathCandidate1 = String.format("//*[@id='P_isinList']//a[contains(text(),'%s']", symbol.strip());
			String oneXpathCandidate2 = String.format("//*[@id='P_isinList']//a[contains(text(),'%s']", symbol.replaceAll("[\s]+", ""));
			if (resultSearch.size() == 0) {
				driver.switchTo().defaultContent();
				popupCloseIconElement.click();
				log.debug("{} #{} 없는 종목 『{}』 CrawlCompanyDetailThread() - {}", Utility.indentEnd(), Utility.size(items), item, Utility.toStringPastTimeReadable(started));
				return "";
			} else if (resultSearch.size() == 1) {
				driver.findElement(By.xpath(xpathSearchResult), 2000).click();
			} else if (!driver.isEmpty(By.xpath(oneXpathCandidate1))) {
				driver.clickIfExist(By.xpath(oneXpathCandidate1));
			} else if (!driver.isEmpty(By.xpath(oneXpathCandidate2))) {
				driver.clickIfExist(By.xpath(oneXpathCandidate2));
			} else {
				driver.switchTo().defaultContent();
				popupCloseIconElement.click();
				log.debug("{} #{} 모호한 검색 결과 『{}』 CrawlCompanyDetailThread() - {}", Utility.indentEnd(), Utility.size(items), item, Utility.toStringPastTimeReadable(started));
				return "";
			}
			Thread.sleep(100);

			// 조회 클릭
			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//a[@id='group94']"), 2000).click();
			driver.findElementIncludeText(By.xpath("//h3[@id='h3_tit_01']"), 8000, code);

			StringBuffer sb = new StringBuffer();
			sb.append(String.format("KEYWORD\t%s\t%s\n", code, symbol));
			sb.append("KEYWORD\t");
			sb.append(driver.findElement(By.xpath("//dd[@id='item_add_info_left_01_dd']"), 2000).getText());	// 표준산업분류
			sb.append(NEWLINE);

			sb.append("KEYWORD\t");
			sb.append(driver.findElement(By.xpath("//dd[@id='FICS']"), 2000).getText());	// FICS
			sb.append(NEWLINE);

			sb.append("KEYWORD\t");
			sb.append(driver.findElement(By.xpath("//dd[@id='ISSU_SCHD_STKQTY']"), 2000).getText());	// 발행주식총수
			sb.append(NEWLINE);

			sb.append("KEYWORD\t");
			sb.append(driver.findElement(By.xpath("//dd[@id='APLI_DT']"), 2000).getText());	// 상장일
			sb.append(NEWLINE);

			sb.append(MARK_ANDOLD_SINCE);
			String result = new String(sb);

			log.debug("{} #{} 『{}』 CrawlCompanyDetailThread.extract({}) - {}", Utility.indentEnd(), Utility.size(items), Utility.ellipsisEscape(result, 16), item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
		}

		log.debug("{} #{} 『{}』 CrawlCompanyDetailThread.extract(#{}) - {}", Utility.indentEnd(), Utility.size(items), "", item, Utility.toStringPastTimeReadable(started));
		return "";
	}

	public static StockParserResult crawl(List<StockItemDomain> items) {
		int processors = Runtime.getRuntime().availableProcessors() - 1;
//		processors = 1;
		ExecutorService service = Executors.newFixedThreadPool(processors);
		List<Future<StockParserResult>> futureList = new ArrayList<>();
		ConcurrentLinkedQueue<StockItemDomain> queue = new ConcurrentLinkedQueue<StockItemDomain>();
		queue.addAll(items);
		for (int cx = 0; cx < processors; cx++) {
			CrawlCompanyDetailThread thread = new CrawlCompanyDetailThread(queue);
			Future<StockParserResult> future = service.submit(thread);
			futureList.add(future);
		}
		StockParserResult container = new StockParserResult();
		container.clear();
		for (Future<StockParserResult> task : futureList) {
			try {
				StockParserResult result = task.get();
				container.addAll(result);
				log.info("{} 『{}』 CrawlCompanyDetailThread.crawl(#{})", Utility.indentMiddle(), result, Utility.size(items));
			} catch (Exception e) {
			}
		}
		return container;
	}

}