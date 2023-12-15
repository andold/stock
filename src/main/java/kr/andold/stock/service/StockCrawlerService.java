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
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.StockDividendDomain;
import kr.andold.stock.domain.StockItemDomain;
import kr.andold.stock.domain.StockPriceDomain;
import kr.andold.stock.param.StockDividendHistoryParam;
import kr.andold.stock.service.StockParserService.StockParserResult;
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

	private boolean debug = false;

	static public class CralerItemThread {
	}

	public StockParserResult crawl() {
		log.info("{} crawl()", Utility.indentStart());
		long started = System.currentTimeMillis();

		StockParserResult all = StockParserResult.builder().items(new ArrayList<>()).dividends(new ArrayList<>()).histories(new ArrayList<>()).prices(new ArrayList<>()).build();

		StockParserResult resultItems = crawlItems();
		all.addAll(resultItems);

		StockParserResult resultHistories = crawlDividendHistory();
		all.addAll(resultHistories);

		StockParserResult resultDetails = crawlItemDetails();
		all.addAll(resultDetails);

		StockParserResult resultPrices = crawlPrices();
		all.addAll(resultPrices);

		log.info("{} {} crawl() - {}", Utility.indentEnd(), all, Utility.toStringPastTimeReadable(started));
		return all;
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

	// ETF 월배당 배당금 내역 자동 입력
	public String crawlDividendHistoryEtfMonthly(StockDividendHistoryParam param) {
		log.info("{} crawlDividendHistoryEtfMonthly({})", Utility.indentStart(), param);

		String text = extractTextDividendHistoryEtfMonthly(param);
		StockParserResult result = StockParserService.parse(text, debug);
		stockItemService.put(result.getItems());
		stockDividendService.put(result.getDividends());
		stockDividendHistoryService.put(result.getHistories());

		log.info("{} {} crawlDividendHistoryEtfMonthly({})", Utility.indentEnd(), result, param);
		return "";
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

	// 배당금 내역
	private StockParserResult crawlDividendHistory() {
		log.info("{} crawlDividendHistories()", Utility.indentStart());
		long started = System.currentTimeMillis();

		StockParserResult all = StockParserResult.builder().items(new ArrayList<>()).dividends(new ArrayList<>()).histories(new ArrayList<>()).prices(new ArrayList<>()).build();

		// 일반기업 배당금 내역
		String textDividendHistories = extractTextDividendHistoriesGeneralCompany();
		StockParserResult resultDividendHistories = StockParserService.parse(textDividendHistories, debug);
		all.addAll(resultDividendHistories);

		// ETF 배당금 내역 by KSD 증권정보포털 SEIBro
		StockParserResult resultDividendHistoryEtf = crawlDividendHistoryEtf();

		put(all);
		all.addAll(resultDividendHistoryEtf);

		log.info("{} {} crawlDividendHistories({})", Utility.indentEnd(), all, Utility.toStringPastTimeReadable(started));
		return all;
	}

	// ETF 배당금 내역 by KSD 증권정보포털 SEIBro
	public StockParserResult crawlDividendHistoryEtf() {
		log.info("{} crawlDividendHistoryEtf()", Utility.indentStart());
		long started = System.currentTimeMillis();

		StockParserResult resultDividendHistoryEtf = CrawlEtfDividendHistoryThread.crawl(stockItemService.search(null));
		put(resultDividendHistoryEtf);

		log.info("{} {} crawlDividendHistoryEtf() - {}", Utility.indentEnd(), resultDividendHistoryEtf, Utility.toStringPastTimeReadable(started));
		return resultDividendHistoryEtf;
	}
	public StockParserResult crawlDividendHistoryEtfDeprecating() {
		log.info("{} crawlDividendHistoryEtf()", Utility.indentStart());
		long started = System.currentTimeMillis();

		String textDividendHistoryEtf = extractTextDividendHistoryEtf();
		StockParserResult resultDividendHistoryEtf = StockParserService.parse(textDividendHistoryEtf, debug);
		put(resultDividendHistoryEtf);

		log.info("{} {} crawlDividendHistoryEtf() - {}", Utility.indentEnd(), resultDividendHistoryEtf, Utility.toStringPastTimeReadable(started));
		return resultDividendHistoryEtf;
	}

	// 일반기업 배당금 내역 전체
	public String extractTextDividendHistoriesGeneralCompany() {
		log.info("{} extractlDividendHistory()", Utility.indentStart());
		long started = System.currentTimeMillis();

		String mark = "KEYWORD\t일반기업 배당금 내역\tURL\thttps://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01041V.xml&menuNo=285\n";
		List<StockItemDomain> items = stockItemService.search(null);
		StringBuffer sb = new StringBuffer();
		sb.append(mark);

		int processors = Runtime.getRuntime().availableProcessors() - 1;
		ExecutorService service = Executors.newFixedThreadPool(processors);
		List<Future<String>> futureList = new ArrayList<>();
		List<List<StockItemDomain>> subSets = split(items, processors);
		subSets.forEach(list -> {
			CrawlDividendHistoryCompanyThread thread = new CrawlDividendHistoryCompanyThread(list);
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
		log.info("{} {} extractlDividendHistory() - {}", Utility.indentEnd(), Utility.size(items), Utility.toStringPastTimeReadable(started));
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

	// ETF 배당금 내역 by KSD 증권정보포털 SEIBro
	protected String extractTextDividendHistoryEtf() {
		log.info("{} extractTextDividendHistoryEtf()", Utility.indentStart());
		long started = System.currentTimeMillis();

		List<StockItemDomain> items = stockItemService.search(null);
		String result = extractTextDividendHistoryEtf(items);

		log.info("{} {} extractTextDividendHistoryEtf() - {}", Utility.indentEnd(), Utility.size(items), Utility.toStringPastTimeReadable(started));
		return result;
	}
	protected String extractTextDividendHistoryEtf(List<StockItemDomain> items) {
		log.info("{} extractTextDividendHistoryEtf(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		String mark = "KEYWORD\tETF 배당금 내역\tKSD 증권정보포털 SEIBro\tURL\thttps://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06030V.xml&menuNo=179\n";
		StringBuffer sb = new StringBuffer();
		sb.append(mark);

		int processors = Runtime.getRuntime().availableProcessors() - 1;
		ExecutorService service = Executors.newFixedThreadPool(processors);
		List<Future<String>> futureList = new ArrayList<>();
		List<List<StockItemDomain>> subSets = split(items, processors);
		subSets.forEach(list -> {
			CrawlDividendHistoryEtfThread thread = new CrawlDividendHistoryEtfThread(list);
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
		log.info("{} {} extractTextDividendHistoryEtf(#{}) - {}", Utility.indentEnd(), Utility.ellipsisEscape(result, 16), Utility.size(items), Utility.toStringPastTimeReadable(started));
		return result;
	}

	// 국내상장 월배당ETF 조회, https://search-etf.com/ > 국내 월배당 ETF 전체
	public String extractTextDividendHistoriesEtfMonthly() {
		log.info("{} extractTextDividendHistoryEtfMonthly()", Utility.indentStart());
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = defaultChromeDriver();
		String url = "https://search-etf.com/month-divi.html";
		try {
			StringBuffer sb = new StringBuffer();

			driver.navigate().to(url);
			WebElement listTableElement = driver.findElement(By.xpath("//*[@id='monthDivi_info_table']//table"), 4000);
			String starting = String.format("KEYWORD\t국내상장 월배당ETF 조회\tURL\t%s\n", url);
			log.info("{} extractTextDividendHistoryEtfMonthly() - {} - {}", Utility.indentMiddle(), starting.strip(), Utility.toStringPastTimeReadable(started));
			sb.append(String.format(starting));
			sb.append(driver.extractTextFromTableElement(listTableElement));
			sb.append(MARK_ANDOLD_SINCE);

			List<WebElement> linkElements = listTableElement.findElements(By.tagName("a"));
			for (int cx = 0, sizex = linkElements.size(); cx < sizex; cx++) {
				WebElement linkElement = linkElements.get(cx);
				String code = linkElement.getText();

				linkElement.click();
				Utility.sleep(1000);

				WebElement symbolElement = driver.findElement(By.xpath("//*[@id='monthDivi_name']"));
				String symbol = symbolElement.getText();
				WebElement dividendTableElement = driver.findElement(By.xpath("//*[@id=\"The_table\"]"));

				sb.append(String.format("KEYWORD\tCODE\t%s\tSYMBOL\t%s\n", code, symbol));
				sb.append(driver.extractTextFromTableElement(dividendTableElement));
				sb.append(MARK_ANDOLD_SINCE);
				log.info("{} #{}/{} extractTextDividendHistoryEtfMonthly() - {} {} - {}", Utility.indentMiddle(), cx, sizex, code, symbol, Utility.toStringPastTimeReadable(started));
			}
			;
			driver.quit();

			sb.append(MARK_ANDOLD_SINCE);
			String text = new String(sb);

			log.info("{} #{}:{} extractTextDividendHistoryEtfMonthly() - {}", Utility.indentEnd(), text.length(), Utility.ellipsisEscape(text, 8), Utility.toStringPastTimeReadable(started));
			return text;
		} catch (Exception e) {
			driver.quit();
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}
		log.info("{} FAIL extractTextDividendHistoryEtfMonthly() - {}", Utility.indentEnd(), Utility.toStringPastTimeReadable(started));
		return "";
	}

	// 국내상장 월배당ETF 조회, https://search-etf.com/ > 국내 월배당 ETF
	public String extractTextDividendHistoryEtfMonthly(StockDividendHistoryParam param) {
		log.info("{} extractTextDividendHistoryEtfMonthly({})", Utility.indentStart(), param);
		long started = System.currentTimeMillis();

		if (param == null || param.getCode().isBlank() || !param.getEtf()) {
			log.info("{} PARAMETER extractlDividendHistory({}) - {}", Utility.indentEnd(), param, Utility.toStringPastTimeReadable(started));
			return "";
		}

		ChromeDriverWrapper driver = defaultChromeDriver();
		try {
			StringBuffer sb = new StringBuffer();

			driver.navigate().to("https://search-etf.com/month-divi.html");
			WebElement list = driver.findElement(By.xpath("//*[@id='monthDivi_info_table']//table"), 2000);
			sb.append(driver.extractTextFromTableElement(list));
			sb.append(MARK_ANDOLD_SINCE);

			// List<WebElement> links = list.findElements(By.tagName("a"));
			List<WebElement> links = list.findElements(By.xpath("//a[contains(text(),'" + param.getCode() + "')]"));
			links.forEach(link -> {
				String code = link.getText();
				sb.append(code);
				sb.append("\n");
				link.click();
				Utility.sleep(1000);
				WebElement dividends = driver.findElement(By.xpath("//*[@id='The_table']"));
				sb.append(driver.extractTextFromTableElement(dividends));
				sb.append(MARK_ANDOLD_SINCE);
			});

			sb.append(MARK_ANDOLD_SINCE);
			driver.quit();

			String text = new String(sb);

			log.info("{} #{}:{} extractlDividendHistory({}) - {}", Utility.indentEnd(), text.length(), Utility.ellipsis(text, 4), param, Utility.toStringPastTimeReadable(started));
			return text;
		} catch (Exception e) {
			driver.quit();
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}
		log.info("{} FAIL extractlDividendHistory({}) - {}", Utility.indentEnd(), param, Utility.toStringPastTimeReadable(started));
		return "";
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

	public void scheduleTaskEveryDays() {
		crawl();
	}

	// 기업 배당 내역 seibro
	public static class CrawlDividendHistoryCompanyThread implements Callable<String> {
		private List<StockItemDomain> items;

		public CrawlDividendHistoryCompanyThread(List<StockItemDomain> list) {
			this.items = list;
		}

		public String call() throws Exception {
			log.info("{} CrawlDividendHistoryCompanyThread(#{})", Utility.indentStart(), Utility.size(items));
			long started = System.currentTimeMillis();

			StringBuffer sb = new StringBuffer();
			ChromeDriverWrapper driver = StockCrawlerService.defaultChromeDriver();
			final String url = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01041V.xml&menuNo=285";
			try {
				driver.navigate().to(url);
				new Select(driver.findElement(By.id("Com_ISIN_input_0"), 2000)).selectByVisibleText("종목"); // 검색항목을 code로
				driver.findElement(By.id("btn_wide_img")).click(); // 넓게 보기 아이콘 크릭

				WebElement start = driver.findElement(By.id("inputCalendar1_input"), 2000);
				start.clear();
				start.sendKeys("2010/01/01"); // 시작일 입력
				start.sendKeys(Keys.TAB); // 시작일 입력

				String previous = "andold";
				for (int cx = 0, sizex = items.size(); cx < sizex; cx++) {
					long loopStarted = System.currentTimeMillis();
					StockItemDomain item = items.get(cx);
					String code = item.getCode();
					if (code == null || code.isBlank() || item.getEtf()) {
						log.info("{} {}/{} SKIP 『{}』 CrawlDividendHistoryCompanyThread() - {}", Utility.indentMiddle(), cx, sizex, item.getSymbol(), Utility.toStringPastTimeReadable(loopStarted));
						continue;
					}

					try {
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
							log.info("{} {}/{} NO CODE 『{}』 CrawlDividendHistoryCompanyThread() - {}", Utility.indentMiddle(), cx, sizex, item.getSymbol(), Utility.toStringPastTimeReadable(loopStarted));
							continue;
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
							log.info("{} {}/{} NO RESULT 『{}』 CrawlDividendHistoryCompanyThread() - {}", Utility.indentMiddle(), cx, sizex, item.getSymbol(), Utility.toStringPastTimeReadable(loopStarted));
							continue;
						}
						driver.findElements(xpath, 2000).get(0).click();
						driver.switchTo().defaultContent();
						driver.clickIfExist(By.xpath("//a[@id='anchor5']"));
						driver.findElement(By.id("group57")).click(); // 조회 클릭

						List<WebElement> tables = driver.findElements(By.tagName("table"), 2000);
						sb.append(String.format("KEYWORD\t%s\t%s\n", code, item.getSymbol()));
						tables.forEach(table -> {
							sb.append(driver.extractTextFromTableElement(table));
							sb.append(StockCrawlerService.MARK_ANDOLD_SINCE);
						});
						sb.append(StockCrawlerService.MARK_ANDOLD_SINCE);
					} catch (Exception e) {
						driver.switchTo().defaultContent();
						driver.clickIfExist(By.xpath("//a[@id='anchor5']"));
						log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
					}
					log.info("{} {}/{} 『{}』 CrawlDividendHistoryCompanyThread() - {}", Utility.indentMiddle(), cx, sizex, item, Utility.toStringPastTimeReadable(loopStarted));
				}
			} catch (Exception e) {
				log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			}
			driver.quit();

			String result = new String(sb);
			log.info("{} 『{}』 CrawlDividendHistoryCompanyThread(#{}) - {}", Utility.indentEnd(), Utility.ellipsisEscape(result, 16, 8), Utility.size(items), Utility.toStringPastTimeReadable(started));
			return result;
		}
	}

	// ETF 배당 내역 KSD 증권정보포털 SEIBro
	public static class CrawlDividendHistoryEtfThread implements Callable<String> {
		private List<StockItemDomain> items;

		public CrawlDividendHistoryEtfThread(List<StockItemDomain> list) {
			this.items = list;
		}

		public String call() throws Exception {
			log.info("{} CrawlDividendHistoryEtfThread(#{})", Utility.indentStart(), Utility.size(items));
			long started = System.currentTimeMillis();

			StringBuffer sb = new StringBuffer();
			ChromeDriverWrapper driver = StockCrawlerService.defaultChromeDriver();
			final String url = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06030V.xml&menuNo=179";
			try {
				driver.navigate().to(url);
				WebElement startDateElement = driver.findElement(By.xpath("//input[@id='sd1_inputCalendar1_input']"), 2000); // 조회기간 시작일
				WebElement searchSymbolIconElement = driver.findElement(By.xpath("//dd[@id='sn_group2']/a[@id='sn_group4']"), 2000); // 종목명 검색 아이콘
				WebElement seachButton = driver.findElement(By.xpath("//*[@id='image17']"), 2000); // 조회 버튼
				WebElement popupCloseIconElement = driver.findElement(By.xpath("//div[@id='group164']/a[@id='anchor3']"), 2000); // 검색결과창의 닫기 아이콘

				startDateElement.clear();
				startDateElement.sendKeys("2010/01/01"); // 조회기간 시작일
				startDateElement.sendKeys(Keys.TAB); // 시작일 입력
				driver.findElement(By.id("btn_wide_img")).click(); // 넓게 보기 아이콘
				for (int cx = 0, sizex = items.size(); cx < sizex; cx++) {
					long loopStarted = System.currentTimeMillis();
					StockItemDomain item = items.get(cx);
					log.trace("{} {}/{} 『{}』 CrawlDividendHistoryEtfThread() - {}", Utility.indentStart(), cx, sizex, item, Utility.toStringPastTimeReadable(loopStarted));

					String code = item.getCode();
					String symbol = item.getSymbol();
					if (code == null || code.isBlank() || symbol == null || symbol.isBlank() || (item.getEtf() != null && !item.getEtf())) {
						log.trace("{} {}/{} 대상아님 『{}』 CrawlDividendHistoryEtfThread() - {}", Utility.indentMiddle(), cx, sizex, item, Utility.toStringPastTimeReadable(loopStarted));
						continue;
					}

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
					String oneXpath = String.format("//*[@id='contentsList']//a[contains(text(),'%s']", symbol.replaceAll("[ ]+", ""));
					
					if (resultSearch.size() == 0) {
						driver.switchTo().defaultContent();
						popupCloseIconElement.click();
						log.debug("{} {}/{} 없는 종목 『{}』 CrawlDividendHistoryEtfThread() - {}", Utility.indentMiddle(), cx, sizex, item, Utility.toStringPastTimeReadable(loopStarted));
						continue;
					} else if (resultSearch.size() == 1) {
						driver.findElement(By.xpath(xpathSearchResult)).click();
					} else if (!driver.isEmpty(By.xpath(oneXpath))) {
						driver.clickIfExist(By.xpath(oneXpath));
					} else {
						driver.switchTo().defaultContent();
						popupCloseIconElement.click();
						log.debug("{} {}/{} 모호한 검색 결과 『{}』 CrawlDividendHistoryEtfThread() - {}", Utility.indentMiddle(), cx, sizex, item, Utility.toStringPastTimeReadable(loopStarted));
						continue;
					}

					driver.switchTo().defaultContent();
					seachButton.click();
					WebElement table = driver.findElement(By.xpath("//*[@id='grid1_body_table']"), 2000);

					sb.append(String.format("KEYWORD\t%s\n",  item.getCode()));
					sb.append(driver.extractTextFromTableElement(table));
					sb.append(MARK_ANDOLD_SINCE);

					log.debug("{} {}/{} 『{}』 CrawlDividendHistoryEtfThread() - {}", Utility.indentMiddle(), cx, sizex, item, Utility.toStringPastTimeReadable(loopStarted));
				}
			} catch (Exception e) {
				log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			}
			driver.quit();

			String result = new String(sb);
			log.info("{} 『{}』 CrawlDividendHistoryEtfThread(#{}) - {}", Utility.indentEnd(), Utility.ellipsisEscape(result, 16, 8), Utility.size(items), Utility.toStringPastTimeReadable(started));
			return result;
		}
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
