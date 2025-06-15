package kr.andold.stock.crawler;

import java.io.File;
import java.time.Duration;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.param.DividendHistoryParam;
import kr.andold.stock.param.ItemParam;
import kr.andold.stock.service.DividendHistoryService;
import kr.andold.stock.service.ItemService;
import kr.andold.stock.service.PriceService;
import kr.andold.utils.ChromeDriverWrapper;
import kr.andold.utils.Utility;
import kr.andold.utils.persist.CrudList;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CrawlerService {
	public static final String MARK_ANDOLD_SINCE = "\n andold \t since \t 2023-11-27 \n";

	@Autowired private Krx krx;
	@Autowired private Seibro seibro;
	@Autowired private Kind kind;
	@SuppressWarnings("unused") @Autowired private Naver naver;

	@Autowired private ItemService itemService;

	@Autowired private DividendHistoryService dividendHistoryService;

	@Autowired
	private PriceService stockPriceService;

	private static String webdriverPath;
	@Value("${application.selenium.webdriver.chrome.driver}")
	public void setWebdriverPath(String value) {
		log.info("{} INIT::CrawlerService.setWebdriverPath({})", Utility.indentMiddle(), value);
		webdriverPath = value;
	}

	@Getter private static String backupDir;
	@Value("${application.bacukp.dir}")
	public void setBackupDir(String value) {
		log.info("{} INIT::CrawlerService.setBackupDir({})", Utility.indentMiddle(), value);
		backupDir = value;
	}

	@Getter private static String userDataDir;
	@Value("${application.selenium.user.data.dir}")
	public void setUserDataDir(String value) {
		log.info("{} INIT::CrawlerService.setUserDataDir({})", Utility.indentMiddle(), value);
		userDataDir = value;
		clearFolder(value);
	}

	@Getter private static Boolean debug = false;
	@Value("${application.crawler.debug}")
	public void setDebug(Boolean value) {
		log.info("{} INIT::CrawlerService.setDegug({})", Utility.indentMiddle(), value);
		debug = value;
	}

	@Getter private static String crawlerDateStart = "20231101";
	@Value("${application.crawler.date.start}")
	public void setCrawlerDateStart(String value) {
		log.info("{} INIT::CrawlerService.setCrawlerDateStart({})", Utility.indentMiddle(), value);
		crawlerDateStart = value;
	}

	public static void clearFolder(String path) {
		File folder = new File(path);
		File[] files = folder.listFiles();
		if (files != null) { // some JVMs return null for empty dirs
			for (File f : files) {
				if (f.isDirectory()) {
					deleteFolder(f);
				} else {
					f.delete();
				}
			}
		}
	}

	public static void deleteFolder(File folder) {
		File[] files = folder.listFiles();
		if (files != null) { // some JVMs return null for empty dirs
			for (File f : files) {
				if (f.isDirectory()) {
					deleteFolder(f);
				} else {
					f.delete();
				}
			}
		}
		folder.delete();
	}
	
	public Result<ParserResult> crawlPrice(Date date) {
		log.info("{} crawlPrice({})", Utility.indentStart(), date);
		long started = System.currentTimeMillis();

		Result<ParserResult> resultSeibro = seibro.price(date);	// 주식
		if (resultSeibro.getStatus() == STATUS.SUCCESS) {
			put(resultSeibro.getResult());
		}

		/*
		Result<ParserResult> resultNaver = naver.price(date);	// ETF
		if (resultNaver.getStatus() == STATUS.SUCCESS) {
			put(resultNaver.getResult());
		}
		*/

		log.info("{} {} crawlPrice({}) - {}", Utility.indentEnd(), resultSeibro, date, Utility.toStringPastTimeReadable(started));
		return resultSeibro;
	}

	public void put(ParserResult result) {
		log.debug("{} put({})", Utility.indentStart(), result);
		long started = System.currentTimeMillis();

		CrudList<ItemDomain> items = itemService.put(result.getItems());
		CrudList<DividendHistoryDomain> histories = dividendHistoryService.put(result.getHistories());
		CrudList<PriceDomain> prices = stockPriceService.put(result.getPrices());
		log.debug("{} put({}) - items:{}, histories:{}, prices:{}", Utility.indentMiddle(), result, items, histories, prices);

		log.debug("{} put({}) - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
	}

	public static ChromeDriverWrapper defaultChromeDriver() {
		System.setProperty("webdriver.chrome.driver", webdriverPath);

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-blink-features=AutomationControlled");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--disable-infobars");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("--remote-allow-origins=*");
		options.addArguments(String.format("--user-data-dir=%s", getUserDataDir()));
		options.addArguments(String.format("--window-size=%d,%d", 1920 * 1, 1090 * 1 - 256));
		options.addArguments("--window-position=0,0");
//		options.addArguments("--headless");
		options.setPageLoadStrategy(PageLoadStrategy.NONE);
		ChromeDriverWrapper driver = new ChromeDriverWrapper(options);
		return driver;
	}

	// 종목 상세 네이버
	public static class CrawlItemDetailThread implements Callable<String> {
		private List<ItemDomain> items;

		public CrawlItemDetailThread(List<ItemDomain> list) {
			this.items = list;
		}

		public String call() throws Exception {
			log.info("{} CrawlItemDetailThread(#{})", Utility.indentStart(), Utility.size(items));
			long started = System.currentTimeMillis();

			StringBuffer sb = new StringBuffer();
			ChromeDriverWrapper driver = defaultChromeDriver();
			for (int cx = 0, sizex = items.size(); cx < sizex; cx++) {
				long loopStarted = System.currentTimeMillis();
				ItemDomain item = items.get(cx);
				try {
					String url = String.format("%s%s", "https://finance.naver.com/item/coinfo.naver?code=", item.getCode());
					driver.navigate().to(url);

					String type = item.getType();
					if (type != null && type.equalsIgnoreCase("ETF")) {
						driver.findElement(By.xpath("//a/span[contains(text(),'ETF분석')]"), Duration.ofSeconds(2)).click(); // ETF분석
					} else if (!driver.isEmpty(By.xpath("//a/span[contains(text(),'종목분석')]"), 2000)) { // null case support
						driver.findElement(By.xpath("//a/span[contains(text(),'종목분석')]")).click(); // 종목분석
					} else {
						driver.findElement(By.xpath("//a/span[contains(text(),'ETF분석')]")).click(); // ETF분석
					}

					// coinfo_cp
					WebElement frame = driver.findElement(By.xpath("//iframe[@id='coinfo_cp']"), Duration.ofSeconds(2));
					driver.switchTo().frame(frame);
					sb.append(driver.findElement(By.xpath("//*[@id='pArea']//table//dt[1]")).getText());
					sb.append("\n");
					driver.findElements(By.xpath("//*[@id='pArea']//table//dt")).forEach(dt -> {
						String text = dt.getText();
						if (text.contains("KOSPI") || text.contains("KOSDAQ") || text.contains("WICS") || text.contains("분류") || text.contains("현금배당수익률")) {
							sb.append(text);
							sb.append("\t");
						}
					}); // 분류
					sb.append("\n");

					//// *[@id="cTB11"]
					WebElement price = driver.findElement(By.xpath("//*[@id='cTB11']//tr[1]")); // 시세 및 주주현황
					sb.append(driver.extractTextContentFromTrElement(price));
					// coinfo_cp

					driver.switchTo().defaultContent();
					driver.findElement(By.xpath("//*[@id=\"tab_invest\"]/a[1]")).click(); // 투자정보 선택
					driver.findElements(By.xpath("//table[@summary='시가총액 정보']//tr")).forEach(tr -> {
						String text = driver.extractTextContentFromTrElement(tr);
						if (text.contains("상장주식수")) {
							sb.append(text);
						}
					});
				} catch (Exception e) {
					log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
				}
				log.info("{} {}/{} 『{}』 CrawlItemDetailThread() - {}", Utility.indentMiddle(), cx, sizex, item.getSymbol(), Utility.toStringPastTimeReadable(loopStarted));
			}
			driver.quit();

			String result = new String(sb);
			log.info("{} 『{}』 CrawlItemDetailThread(#{}) - {}", Utility.indentEnd(), Utility.ellipsisEscape(result, 16, 8), Utility.size(items), Utility.toStringPastTimeReadable(started));
			return result;
		}
	}

	public Result<ParserResult> crawlItemAll() {
		log.info("{} crawlItemAll()", Utility.indentStart());
		long started = System.currentTimeMillis();

		Result<ParserResult> result = krx.basicInfoAll();
		if (result.getStatus() == STATUS.SUCCESS) {
			put(result.getResult());
		}

		log.info("{} 『{}』 crawlItemAll() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	public Result<ParserResult> crawlDividendAllRecent() {
		log.info("{} crawlDividendAllRecent()", Utility.indentStart());
		long started = System.currentTimeMillis();

		Result<ParserResult> result = seibro.dividend(Date.from(ZonedDateTime.now().minusMonths(6).toInstant()));
		if (result.getStatus() == STATUS.SUCCESS) {
			put(result.getResult());
		}

		log.info("{} 『{}』 crawlDividendAllRecent() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	public Result<ParserResult> crawlItem(ItemParam itemParam) {
		log.info("{} crawlItem({})", Utility.indentStart(), itemParam);
		long started = System.currentTimeMillis();

		ParserResult container = new ParserResult().clear();
		Result<ParserResult> result = Result.<ParserResult>builder().result(container).build();

		Result<ParserResult> itemResult = seibro.item(itemParam.getCode());
		if (itemResult.getStatus() == STATUS.SUCCESS) {
			put(itemResult.getResult());
			container.addAll(itemResult.getResult());
		} else {
			result.setStatus(itemResult.getStatus());
		}
	
		ItemDomain item = itemService.read(itemParam.getCode());
		Result<ParserResult> dividendResult = seibro.dividend(item.getCode(), item.getIpoOpen());
		if (dividendResult.getStatus() == STATUS.SUCCESS) {
			put(dividendResult.getResult());
			container.addAll(dividendResult.getResult());
		} else {
			result.setStatus(dividendResult.getStatus());
		}
	
		List<DividendHistoryDomain> histories = dividendHistoryService.search(DividendHistoryParam.builder().code(item.getCode()).build());
		Result<ParserResult> priceResult = seibro.price(item, histories);
		if (priceResult.getStatus() == STATUS.SUCCESS) {
			put(priceResult.getResult());
			container.addAll(priceResult.getResult());
		} else {
			result.setStatus(priceResult.getStatus());
		}

		log.info("{} 『{}』『{}:{}』 crawlItem({}) - {}", Utility.indentEnd(), result, itemResult, dividendResult, itemParam, Utility.toStringPastTimeReadable(started));
		return result;
	}

	public Result<ParserResult> crawlItemIpoCloseRecent(Date start) {
		if (start == null) {
			start = Date.from(LocalDate.now().minusMonths(1).atStartOfDay().toInstant(Utility.ZONE_OFFSET_KST));
		}

		Result<ParserResult> result = kind.item(start);
		if (result.getStatus() == STATUS.SUCCESS) {
			put(result.getResult());
		}

		return result;
	}

	public Result<ParserResult> crawlItemIpoCloseAll() {
		log.info("{} crawlItemIpoCloseAll()", Utility.indentStart());
		long started = System.currentTimeMillis();

		Result<ParserResult> result = kind.itemIpoCloseAll();
		if (result.getStatus() == STATUS.SUCCESS) {
			put(result.getResult());
		}

		log.info("{} 『{}』 crawlItemIpoCloseAll() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

}
