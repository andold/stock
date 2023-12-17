package kr.andold.stock.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.StockDividendDomain;
import kr.andold.stock.domain.StockItemDomain;
import kr.andold.stock.domain.StockPriceDomain;
import kr.andold.stock.service.StockParserService.StockParserResult;
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

	// 기업 상세 정보
	public StockParserResult crawlItemDetails() {
		log.info("{} crawlItemDetails()", Utility.indentStart());
		long started = System.currentTimeMillis();

		String textItemDetail = extractTextItemDetails();
		StockParserResult resultItemDetail = StockParserService.parse(textItemDetail, debug);
		put(resultItemDetail);

		log.info("{} {} crawlItemDetails() - {}", Utility.indentEnd(), resultItemDetail, Utility.toStringPastTimeReadable(started));
		return resultItemDetail;
	}

	// 개별 기업 상세 정보
	public StockItemDomain crawlItemDetail(StockItemDomain domain) {
		log.info("{} crawlItemDetail({})", Utility.indentStart(), domain);
		long started = System.currentTimeMillis();

		List<StockItemDomain> items = new ArrayList<StockItemDomain>();
		items.add(domain);
		String text = extractTextItemDetails(items);
		if (text.isBlank()) {
			log.warn("{} CANNOT crawl crawlItemDetail({})", Utility.indentMiddle(), domain);
			return null;
		}
		StockParserResult result = StockParserService.parse(text, debug);
		if (result.getItems().size() != 1) {
			return domain;
		}
		// ...우 의 경우, 코드가 본래 코드가 표시된다
		result.getItems().get(0).setCode(domain.getCode());

		List<StockItemDomain> befores = new ArrayList<StockItemDomain>() {
			private static final long serialVersionUID = 1L;
			{
				add(domain);
			}
		};
		List<StockItemDomain> creates = new ArrayList<StockItemDomain>();
		List<StockItemDomain> duplicates = new ArrayList<StockItemDomain>();
		List<StockItemDomain> updates = new ArrayList<StockItemDomain>();
		List<StockItemDomain> removes = new ArrayList<StockItemDomain>();
		stockItemService.differ(befores, result.getItems(), creates, duplicates, updates, removes);
		if (updates.isEmpty()) {
			return domain;
		}
		stockItemService.update(updates);
		StockItemDomain updated = updates.get(0);

		log.info("{} {} crawlItemDetail({}) - {}", Utility.indentEnd(), Utility.toStringJson(updated, 16), domain, Utility.toStringPastTimeReadable(started));
		return updated;
	}

	// 개별 기업 상세 정보
	public String extractTextItemDetails() {
		log.info("{} extractTextItemDetails()", Utility.indentStart());
		long started = System.currentTimeMillis();

		List<StockItemDomain> items = stockItemService.search(null);
		String result = extractTextItemDetails(items);

		log.info("{} {} extractTextItemDetails() - {}", Utility.indentEnd(), Utility.size(items), Utility.toStringPastTimeReadable(started));
		return result;
	}
	private String extractTextItemDetails(List<StockItemDomain> items) {
		log.info("{} extractTextItemDetails(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		String mark = "KEYWORD\t개별 기업 상세\tURL\thttps://finance.naver.com/item/coinfo.naver?code=\n";
		StringBuffer sb = new StringBuffer();
		sb.append(mark);

		int processors = Runtime.getRuntime().availableProcessors() - 1;
		ExecutorService service = Executors.newFixedThreadPool(processors);
		List<Future<String>> futureList = new ArrayList<>();
		List<List<StockItemDomain>> subSets = split(items, processors);
		subSets.forEach(list -> {
			CrawlItemDetailThread thread = new CrawlItemDetailThread(list);
			Future<String> future = service.submit(thread);
			futureList.add(future);
		});
		for (Future<String> task : futureList) {
			try {
				String result = task.get();
				sb.append(result);
			} catch (Exception e) {
			}
		}

		sb.append(mark);
		String result = new String(sb);
		log.info("{} {} extractTextItemDetails(#{}) - {}", Utility.indentEnd(), Utility.ellipsisEscape(result, 16, 8), Utility.size(items), Utility.toStringPastTimeReadable(started));
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
