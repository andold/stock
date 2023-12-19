package kr.andold.stock.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.StockDividendDomain;
import kr.andold.stock.domain.StockItemDomain;
import kr.andold.stock.domain.StockPriceDomain;
import kr.andold.stock.service.StockParserService.StockParserResult;
import kr.andold.stock.thread.CrawlCompanyDetailThread;
import kr.andold.stock.thread.CrawlCompanyDividendHistoryThread;
import kr.andold.stock.thread.CrawlEtfDetailThread;
import kr.andold.stock.thread.CrawlEtfDividendHistoryThread;
import kr.andold.stock.thread.CrawlPriceThread;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StockCrawlerService {
	public static final String MARK_ANDOLD_SINCE = "\n andold \t since \t 2023-11-27 \n";

	@Autowired
	private StockItemService stockItemService;

	@Autowired
	private StockDividendService stockDividendService;

	@Autowired
	private StockDividendHistoryService stockDividendHistoryService;

	@Autowired
	private StockPriceService stockPriceService;

	private static String webdriverPath;
	@Value("${data.webdriver.chrome.driver:C:/src/eclipse-workspace/stock/src/main/resources/bin/chromedriver.exe}")
	public void setWebdriverPath(String value) {
		webdriverPath = value;
	}

	public static Boolean debug = false;
	@Value("${app.crawler.debug:false}")
	public void setDegug(Boolean value) {
		debug = value;
	}

	public StockParserResult crawlPrices() {
		log.info("{} crawlPrices()", Utility.indentStart());
		long started = System.currentTimeMillis();

		StockParserResult all = StockParserResult.builder().items(new ArrayList<>()).dividends(new ArrayList<>()).histories(new ArrayList<>()).prices(new ArrayList<>()).build();

		StockParserResult resultPrices = CrawlPriceThread.crawl(stockItemService.search(null));
		all.addAll(resultPrices);
		put(resultPrices);

		// 현재가 적용 to dividend
		List<StockDividendDomain> resultRecent = currentPriceFromPrices(resultPrices.getPrices());
		stockDividendService.put(resultRecent);
		all.addAll(resultPrices);

		log.info("{} {} crawlPrices() - {}", Utility.indentEnd(), all, Utility.toStringPastTimeReadable(started));
		return all;
	}

	private void put(StockParserResult result) {
		if (debug) {
			result.getItems().forEach(x -> log.info("{} item: {}", Utility.indentMiddle(), x));
			result.getDividends().forEach(x -> log.info("{} dividend: {}", Utility.indentMiddle(), x));
			result.getHistories().forEach(x -> log.info("{} history: {}", Utility.indentMiddle(), x));
			result.getPrices().forEach(x -> log.info("{} price: {}", Utility.indentMiddle(), x));
		}

		stockItemService.put(result.getItems());
		stockDividendService.put(result.getDividends());
		stockDividendHistoryService.put(result.getHistories());
		stockPriceService.put(result.getPrices());
	}

	private List<StockDividendDomain> currentPriceFromPrices(List<StockPriceDomain> prices) {
		log.info("{} currentPriceFromPrices(#{})", Utility.indentStart(), Utility.size(prices));

		Map<String, StockPriceDomain> map = new HashMap<>();
		prices.forEach(price -> {
			String code = price.getCode();
			StockPriceDomain previous = map.get(code);
			if (previous == null) {
				map.put(code, price);
				return;
			}

			if (previous.getBase().before(price.getBase())) {
				map.put(code, price);
				return;
			}
		});
		List<StockDividendDomain> dividendsRecent = new ArrayList<>();
		map.forEach((code, price) -> {
			StockDividendDomain dividend = StockDividendDomain.builder().code(code).currentPrice(price.getClosing()).build();
			dividendsRecent.add(dividend);
		});

		log.info("{} #{} currentPriceFromPrices(#{})", Utility.indentEnd(), Utility.size(dividendsRecent), Utility.size(prices));
		return dividendsRecent;
	}

	// 네이버 배당 top 50 + 월배당 ETF
	public StockParserResult crawlItems() {
		log.info("{} crawlItems()", Utility.indentStart());
		long started = System.currentTimeMillis();

		Map<String, Boolean> mapWithHref = new HashMap<>();
		mapWithHref.put("a", true);
		StockParserResult all = StockParserResult.builder().items(new ArrayList<>()).dividends(new ArrayList<>()).histories(new ArrayList<>()).prices(new ArrayList<>()).build();

		String textFromUrl = extractTextFromUrl("https://finance.naver.com/sise/dividend_list.naver?sosok=KOSPI", mapWithHref);
		StockParserResult result = StockParserService.parse(textFromUrl, debug);
		for (StockItemDomain domain : result.getItems()) {
			domain.setType("KOSPI");
			domain.setEtf(false);
		}
		all.addAll(result);

		textFromUrl = extractTextFromUrl("https://finance.naver.com/sise/dividend_list.naver?sosok=KOSDAQ", mapWithHref);
		result = StockParserService.parse(textFromUrl, debug);
		for (StockItemDomain domain : result.getItems()) {
			domain.setType("KOSDAQ");
			domain.setEtf(false);
		}
		all.addAll(result);

		String textFromNaverAllEtf = extractAllEtfFromNaver();
		StockParserResult resultNaverAllEtf = StockParserService.parse(textFromNaverAllEtf, debug);
		all.addAll(resultNaverAllEtf);
		put(all);

		log.info("{} {} crawlItems() - {}", Utility.indentEnd(), all, Utility.toStringPastTimeReadable(started));
		return all;
	}

	public StockParserResult crawlItemCompanyDividendTop() {
		log.info("{} crawlItemCompanyDividendTop()", Utility.indentStart());
		long started = System.currentTimeMillis();

		String URL = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01042V.xml&menuNo=286";
		String MARK_START_END_POINT = "KEYWORD\tcrawlItemCompanyDividendTop\t주식 상위 배당\tURL\t" + URL + "\n";
		int YEARS = 3;

		StringBuffer sb = new StringBuffer();
		sb.append(MARK_START_END_POINT);
		ChromeDriverWrapper driver = StockCrawlerService.defaultChromeDriver();
		try {
			driver.navigate().to(URL);
			driver.findElement(By.xpath("//a[@id='btn_wide']"), 2000).click();
			driver.findElementIncludeText(By.xpath("//th"), 8000, "결산월");

			new Select(driver.findElement(By.xpath("//select[@id='select_marketKind_input_0']"), 2000)).selectByVisibleText("유가증권시장"); // 시장구분을 유가증권시장
			for (int cx = LocalDate.now().getYear() - 1, sizex = LocalDate.now().getYear() - YEARS; cx > sizex; cx--) {
				String year = String.format("%d년", cx);
				new Select(driver.findElement(By.xpath("//select[@id='selectbox2_input_0']"), 2000)).selectByVisibleText(year); // 2022년
				String previous = driver.getText(By.xpath("//table[@id='grid1_body_table']/tbody/tr[1]/td[2]"), 8000, "andold");
				driver.findElement(By.xpath("//a[@id='group57']"), 2000).click();
				driver.findElement(By.xpath("//table[@id='grid1_body_table']/tbody/tr[1]/td[2]"), 8000, previous);
				for (int cy = 1; cy < 5; cy++) {
					String pageString = String.format("%d", cy);
					log.debug("{} {} {} {} - crawlItemCompanyDividendTop() - {}", Utility.indentMiddle(), "유가증권시장", year, cy, Utility.toStringPastTimeReadable(started));
					driver.findElementIncludeText(By.xpath("//div[@id='cntsPaging01']//a"), 8000, pageString).click();
					driver.findElementIncludeTextAndClass(By.xpath("//div[@id='cntsPaging01']//a"), 2000, pageString, "w2pageList_label_selected");
					WebElement table = driver.findElement(By.xpath("//table[@id='grid1_body_table']"), 2000);
					sb.append(driver.extractTextFromTableElement(table, "KOSPI\t"));
					sb.append(MARK_ANDOLD_SINCE);
				}
			}

			new Select(driver.findElement(By.xpath("//select[@id='select_marketKind_input_0']"), 2000)).selectByVisibleText("코스닥시장"); // 시장구분을 코스닥시장
			for (int cx = LocalDate.now().getYear() - 1, sizex = LocalDate.now().getYear() - YEARS; cx > sizex; cx--) {
				String year = String.format("%d년", cx);
				new Select(driver.findElement(By.xpath("//select[@id='selectbox2_input_0']"), 2000)).selectByVisibleText(year); // 2022년
				String previous = driver.getText(By.xpath("//table[@id='grid1_body_table']/tbody/tr[1]/td[2]"), 8000, "andold");
				driver.findElement(By.xpath("//a[@id='group57']"), 2000).click();
				driver.findElement(By.xpath("//table[@id='grid1_body_table']/tbody/tr[1]/td[2]"), 8000, previous);
				for (int cy = 1; cy < 5; cy++) {
					String pageString = String.format("%d", cy);
					log.debug("{} {} {} {} - crawlItemCompanyDividendTop() - {}", Utility.indentMiddle(), "코스닥시장", year, cy, Utility.toStringPastTimeReadable(started));
					driver.findElementIncludeText(By.xpath("//div[@id='cntsPaging01']//a"), 4000, pageString).click();
					driver.findElementIncludeTextAndClass(By.xpath("//div[@id='cntsPaging01']//a"), 2000, pageString, "w2pageList_label_selected");
					WebElement table = driver.findElement(By.xpath("//table[@id='grid1_body_table']"), 2000);
					sb.append(driver.extractTextFromTableElement(table, "KOSDAQ\t"));
					sb.append(MARK_ANDOLD_SINCE);
				}
			}
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}
		driver.quit();

		sb.append(MARK_START_END_POINT);
		String text = new String(sb);
		StockParserResult result = StockParserService.parse(text, debug);

		log.info("{} {} crawlItemCompanyDividendTop() - {}", Utility.indentMiddle(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	public static String extractTextFromUrl(String link, Map<String, Boolean> map) {
		log.info("{} extractTextFromUrl({}, #{})", Utility.indentStart(), link, Utility.size(map));

		StringBuffer sb;
		try {
			URL url = new URL(link);
			URLConnection conn = url.openConnection();

			// open the stream and put it into BufferedReader
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(), "euc-kr"));
			sb = new StringBuffer();

			String inputLine;
			while ((inputLine = br.readLine()) != null) {
				sb.append(inputLine);
			}
			br.close();
			String result = HtmlParserService.extractTextFromHtml(new String(sb), map);

			log.info("{} {} extractTextFromUrl({}, #{})", Utility.indentEnd(), Utility.ellipsis(result, 16), link, Utility.size(map));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage());
		}

		log.info("{} FAIL extractTextFromUrl({}, #{})", Utility.indentEnd(), link, Utility.size(map));
		return "";
	}

	protected String extractAllEtfFromNaver() {
		log.info("{} extractAllEtfFromNaver()", Utility.indentStart());
		long started = System.currentTimeMillis();

		StringBuffer sb = new StringBuffer();
		ChromeDriverWrapper driver = StockCrawlerService.defaultChromeDriver();
		final String url = "https://finance.naver.com/sise/etf.naver";
		try {
			driver.navigate().to(url);
			List<WebElement> hyperlinkElement = driver.findElements(By.xpath("//div[@id='contentarea']/div[@class='box_type_l']/table//td[@class='ctg']/a"), 4000);
			for (int cx = 0, sizex = hyperlinkElement.size(); cx < sizex; cx++) {
				WebElement e = hyperlinkElement.get(cx);
				
				sb.append(String.format("KEYWORD\t%s\t%s\n", e.getAttribute("href"), e.getText()));
			}
		}
		catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}
		driver.quit();
		sb.append(MARK_ANDOLD_SINCE);

		String result = new String(sb);
		log.info("{} 『{}』 extractAllEtfFromNaver() - {}", Utility.indentEnd(), Utility.ellipsisEscape(result, 16), Utility.toStringPastTimeReadable(started));
		return result;
	}

	// 주식=일반기업 배당금 내역 by KSD 증권정보포털 SEIBro
	public StockParserResult crawlCompanyDividendHistories() {
		log.info("{} crawlCompanyDividendHistories()", Utility.indentStart());
		long started = System.currentTimeMillis();

		StockParserResult result = CrawlCompanyDividendHistoryThread.crawl(stockItemService.search(null));
		put(result);

		log.info("{} {} crawlCompanyDividendHistories() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	// ETF 배당금 내역 by KSD 증권정보포털 SEIBro
	public StockParserResult crawlEtfDividendHistories() {
		log.info("{} crawlEtfDividendHistories()", Utility.indentStart());
		long started = System.currentTimeMillis();

		StockParserResult result = CrawlEtfDividendHistoryThread.crawl(stockItemService.search(null));
		put(result);

		log.info("{} {} crawlEtfDividendHistories() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	// ETF 상세 by KSD 증권정보포털 SEIBro
	public StockParserResult crawlEtfDetails() {
		log.info("{} crawlEtfDetails()", Utility.indentStart());
		long started = System.currentTimeMillis();

		StockParserResult result = CrawlEtfDetailThread.crawl(stockItemService.search(null));
		put(result);

		log.info("{} {} crawlEtfDetails() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	// 주식 상세 by KSD 증권정보포털 SEIBro
	public StockParserResult crawlItemCompanyDetails() {
		log.info("{} crawlItemCompanyDetails()", Utility.indentStart());
		long started = System.currentTimeMillis();

		StockParserResult result = CrawlCompanyDetailThread.crawl(stockItemService.search(null));
		put(result);

		log.info("{} {} crawlItemCompanyDetails() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	public static List<List<StockItemDomain>> split(List<StockItemDomain> items, int count) {
		List<List<StockItemDomain>> container = new ArrayList<>();
		for (int cx = 0; cx < count; cx++) {
			container.add(new ArrayList<>());
		}
		for (int cx = 0, sizex = items.size(); cx < sizex; cx++) {
			container.get(cx % count).add(items.get(cx));
		}
		return container;
	}

	public static ChromeDriverWrapper defaultChromeDriver() {
		System.setProperty("webdriver.chrome.driver", webdriverPath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--incognito");
		options.addArguments("--disable-gpu");
		options.addArguments("--verbose");
		options.addArguments("--headless");
		options.addArguments("--window-size=3840,4320");
		ChromeDriverWrapper driver = new ChromeDriverWrapper(options);
		return driver;
	}

	// 종목 상세 네이버
	public static class CrawlItemDetailThread implements Callable<String> {
		private List<StockItemDomain> items;

		public CrawlItemDetailThread(List<StockItemDomain> list) {
			this.items = list;
		}

		public String call() throws Exception {
			log.info("{} CrawlItemDetailThread(#{})", Utility.indentStart(), Utility.size(items));
			long started = System.currentTimeMillis();

			StringBuffer sb = new StringBuffer();
			ChromeDriverWrapper driver = defaultChromeDriver();
			for (int cx = 0, sizex = items.size(); cx < sizex; cx++) {
				long loopStarted = System.currentTimeMillis();
				StockItemDomain item = items.get(cx);
				try {
					String url = String.format("%s%s", "https://finance.naver.com/item/coinfo.naver?code=", item.getCode());
					driver.navigate().to(url);

					if (item.getEtf()) {
						driver.findElement(By.xpath("//a/span[contains(text(),'ETF분석')]"), 2000).click(); // ETF분석
					} else if (!driver.isEmpty(By.xpath("//a/span[contains(text(),'종목분석')]"), 2000)) { // null case support
						driver.findElement(By.xpath("//a/span[contains(text(),'종목분석')]")).click(); // 종목분석
					} else {
						driver.findElement(By.xpath("//a/span[contains(text(),'ETF분석')]")).click(); // ETF분석
					}

					// coinfo_cp
					WebElement frame = driver.findElement(By.xpath("//iframe[@id='coinfo_cp']"), 2000);
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
					sb.append(driver.extractTextFromTrElement(price));
					// coinfo_cp

					driver.switchTo().defaultContent();
					driver.findElement(By.xpath("//*[@id=\"tab_invest\"]/a[1]")).click(); // 투자정보 선택
					driver.findElements(By.xpath("//table[@summary='시가총액 정보']//tr")).forEach(tr -> {
						String text = driver.extractTextFromTrElement(tr);
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

}
