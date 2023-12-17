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
import lombok.extern.slf4j.Slf4j;

// 기업 배당 내역 KSD 증권정보포털 SEIBro
@Slf4j
public class CrawlCompanyDividendHistoryThread implements Callable<StockParserResult> {
	private static final String URL = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01041V.xml&menuNo=285";
	private static final String MARK_END_POINT = "KEYWORD\t일반기업 배당금 내역\tURL\thttps://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01041V.xml&menuNo=285\n";
	private static final int JOB_SIZE = 4;
	private static final String MARK_ANDOLD_SINCE = StockCrawlerService.MARK_ANDOLD_SINCE;
	private static final Boolean debug = StockCrawlerService.debug;

	private ConcurrentLinkedQueue<StockItemDomain> items;
	private ChromeDriverWrapper driver;
	private String previous = "andold";

	public CrawlCompanyDividendHistoryThread(ConcurrentLinkedQueue<StockItemDomain> list) {
		this.items = list;
	}

	@Override
	public StockParserResult call() throws Exception {
		log.info("{} CrawlCompanyDividendHistoryThread(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		StockParserResult result = StockParserResult.builder().build();
		result.clear();
		driver = StockCrawlerService.defaultChromeDriver();

		try {
			driver.navigate().to(URL);
			new Select(driver.findElement(By.id("Com_ISIN_input_0"), 2000)).selectByVisibleText("종목"); // 검색항목을 code로
			driver.findElement(By.id("btn_wide_img")).click(); // 넓게 보기 아이콘 크릭

			WebElement start = driver.findElement(By.id("inputCalendar1_input"), 2000);
			start.clear();
			start.sendKeys("2010/01/01"); // 시작일 입력
			start.sendKeys(Keys.TAB); // 시작일 입력
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
				if (code == null || code.isBlank() || item.getEtf()) {
					log.info("{} {}/{} 대상아님 『{}』 CrawlCompanyDividendHistoryThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}


				if (debug && new Random().nextDouble() < 0.9) {
					log.trace("{} {}/{} 뽑기 제외 『{}』 CrawlEtfDividendHistoryThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}

				String text = extract(item);
				sb.append(text);
			}
			sb.append(MARK_END_POINT);

			String text = new String(sb);
			StockParserResult resultDividendHistory = StockParserService.parse(text, debug);
			result.addAll(resultDividendHistory);
			log.debug("{} #{} {} CrawlCompanyDividendHistoryThread() - {}", Utility.indentMiddle(), Utility.size(items), resultDividendHistory, Utility.toStringPastTimeReadable(started));
		}
		driver.quit();

		log.info("{} {} CrawlCompanyDividendHistoryThread(#{}) - {}", Utility.indentEnd(), result, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return result;
	}

	private String extract(StockItemDomain item) {
		log.info("{} CrawlCompanyDividendHistoryThread.extract({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		try {
			String code = item.getCode();

			driver.switchTo().defaultContent();
			driver.findElement(By.id("cc_group4")).click(); // 종목 검색 아이콘 크릭
			WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframe2']"), 4000);
			driver.switchTo().frame(frame);
			WebElement codeElement = driver.findElement(By.id("search_string"), 2000);
			codeElement.clear();
			codeElement.sendKeys(code); // 코드 입력
			driver.clear(By.xpath("//*[@id='P_isinList']/li"));
			driver.findElement(By.id("P_group100")).click(); // 코드 검색 아이콘 클릭
			Utility.sleep(1000); // //*[@id="P_isinList_none"]
			if (driver.findElement(By.id("P_isinList_none")).isDisplayed()) {
				driver.switchTo().defaultContent();
				driver.clickIfExist(By.xpath("//a[@id='anchor5']"));
				log.info("{} #{} 없는 종목 『{}』 CrawlDividendHistoryCompanyThread() - {}", Utility.indentMiddle(), Utility.size(items), item, Utility.toStringPastTimeReadable(started));
				return "";
			}

			List<WebElement> links = driver.findElements(By.xpath("//a[@class='w2group ']"), previous, 4000);
			previous = driver.toString(links);
			By xpath = null;
			if (links.size() == 1) {
				xpath = By.xpath("//a[@class='w2group ']/span");
			} else if (item.getType() == null || "KOSPI".contentEquals(item.getType())) {
				xpath = By.xpath("//a[@class='w2group ']/span[contains(text(),'(유)')]");
			} else {
				xpath = By.xpath("//a[@class='w2group ']/span[contains(text(),'(코)')]"); // KOSDAQ 종목 선택
			}
			if (driver.isEmpty(xpath)) {
				driver.switchTo().defaultContent();
				driver.clickIfExist(By.xpath("//a[@id='anchor5']"));
				log.info("{} #{} 결과 없음 『{}』 CrawlDividendHistoryCompanyThread() - {}", Utility.indentMiddle(), Utility.size(items), item, Utility.toStringPastTimeReadable(started));
				return "";
			}
			driver.findElements(xpath, 2000).get(0).click();
			driver.switchTo().defaultContent();
			driver.clickIfExist(By.xpath("//a[@id='anchor5']"));
			driver.findElement(By.id("group57")).click(); // 조회 클릭

			WebElement table = driver.findElement(By.xpath("//table[@id='grid1_body_table']"), 2000);

			StringBuffer sb = new StringBuffer();
			sb.append(String.format("KEYWORD\t%s\t%s\n", code, item.getSymbol()));
			sb.append(driver.extractTextFromTableElement(table));
			sb.append(MARK_ANDOLD_SINCE);
			String result = new String(sb);

			log.info("{} #{} 『{}』 CrawlCompanyDividendHistoryThread.extract({}) - {}", Utility.indentEnd(), Utility.size(items), Utility.ellipsisEscape(result, 16), item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
		}

		return "";
	}

	public static StockParserResult crawl(List<StockItemDomain> items) {
		int processors = Runtime.getRuntime().availableProcessors() - 1;
		processors = 1;
		ExecutorService service = Executors.newFixedThreadPool(processors);
		List<Future<StockParserResult>> futureList = new ArrayList<>();
		ConcurrentLinkedQueue<StockItemDomain> queue = new ConcurrentLinkedQueue<StockItemDomain>();
		queue.addAll(items);
		for (int cx = 0; cx < processors; cx++) {
			CrawlCompanyDividendHistoryThread thread = new CrawlCompanyDividendHistoryThread(queue);
			Future<StockParserResult> future = service.submit(thread);
			futureList.add(future);
		}
		StockParserResult container = StockParserResult.builder().build();
		container.clear();
		for (Future<StockParserResult> task : futureList) {
			try {
				StockParserResult result = task.get();
				container.addAll(result);
				log.info("{} 『{}』 CrawlCompanyDividendHistoryThread.crawl(#{})", Utility.indentMiddle(), result, Utility.size(items));
			} catch (Exception e) {
			}
		}
		return container;
	}

}
