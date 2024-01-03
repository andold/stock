package kr.andold.stock.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import kr.andold.stock.domain.DividendDomain;
import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.service.CommonBlockService.CrudList;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.stock.thread.CrawlItemDetailCompanyThread;
import kr.andold.stock.thread.CrawlDividendHistoryCompanyThread;
import kr.andold.stock.thread.CrawlPriceCompanyThread;
import kr.andold.stock.thread.CrawlPriceEtfThread;
import kr.andold.stock.thread.CrawlItemDetailEtfThread;
import kr.andold.stock.thread.CrawlDividendHistoryEtfThread;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CrawlerService {
	public static final String MARK_ANDOLD_SINCE = "\n andold \t since \t 2023-11-27 \n";
	private static final int TIMEOUT = 4000;

	@Autowired
	private ItemService stockItemService;

	@Autowired
	private DividendService stockDividendService;

	@Autowired
	private DividendHistoryService stockDividendHistoryService;

	@Autowired
	private PriceService stockPriceService;

	private static String webdriverPath;
	@Value("${data.webdriver.chrome.driver:C:/src/eclipse-workspace/stock/src/main/resources/bin/chromedriver.exe}")
	public void setWebdriverPath(String value) {
		log.info("{} INIT::CrawlerService.setWebdriverPath({})", Utility.indentMiddle(), value);
		webdriverPath = value;
	}

	public static Boolean debug = false;
	@Value("${app.crawler.debug:false}")
	public void setDegug(Boolean value) {
		log.info("{} INIT::CrawlerService.setDegug({})", Utility.indentMiddle(), value);
		debug = value;
	}

	@Getter private static String crawlerDateStart = "20231101";
	@Value("${app.crawler.date.start:20231101}")
	public void setCrawlerDateStart(String value) {
		log.info("{} INIT::CrawlerService.setCrawlerDateStart({})", Utility.indentMiddle(), value);
		crawlerDateStart = value;
	}

	public ParserResult crawlPriceCompany(Date start) {
		log.info("{} crawlPriceCompany({})", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		ParserResult container = new ParserResult().clear();;

		List<ItemDomain> items = stockItemService.search(null);
		List<ItemDomain> filtered = items.stream()
				.filter(item -> isPossibleCompany(item))
				.collect(Collectors.toList());
		List<List<ItemDomain>> partitions = Lists.partition(filtered, 128);
		for (List<ItemDomain> partition: partitions) {
			ParserResult result = CrawlPriceCompanyThread.crawl(partition, start);
			put(result);

			// 현재가 적용 to dividend
			List<DividendDomain> dividends = currentPriceFromPrices(result.getPrices());
			stockDividendService.put(dividends);

			container.addAll(result);
			container.getDividends().addAll(dividends);
		}

		log.info("{} {} crawlPriceCompany({}) - {}", Utility.indentEnd(), container, start, Utility.toStringPastTimeReadable(started));
		return container;
	}

	public ParserResult crawlPriceEtf(Date start) {
		log.info("{} crawlPriceEtf({})", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		ParserResult container = new ParserResult().clear();

		List<ItemDomain> items = stockItemService.search(null);
		List<ItemDomain> filtered = items.stream()
				.filter(item -> isPossibleEtf(item))
				.collect(Collectors.toList());
		List<List<ItemDomain>> partitions = Lists.partition(filtered, 128);
		for (List<ItemDomain> partition: partitions) {
			ParserResult result = CrawlPriceEtfThread.crawl(partition, start);
			put(result);

			// 현재가 적용 to dividend
			List<DividendDomain> dividends = currentPriceFromPrices(result.getPrices());
			stockDividendService.put(dividends);

			container.addAll(result);
			container.getDividends().addAll(dividends);
		}

		log.info("{} {} crawlPriceEtf({}) - {}", Utility.indentEnd(), container, start, Utility.toStringPastTimeReadable(started));
		return container;
	}

	private void put(ParserResult result) {
		log.debug("{} put({})", Utility.indentStart(), result);
		long started = System.currentTimeMillis();

		CrudList<ItemDomain> items = stockItemService.put(result.getItems());
		CrudList<DividendDomain> dividends = stockDividendService.put(result.getDividends());
		CrudList<DividendHistoryDomain> histories = stockDividendHistoryService.put(result.getHistories());
		CrudList<PriceDomain> prices = stockPriceService.put(result.getPrices());
		log.debug("{} put({}) - items:{}, dividends:{}, histories:{}, prices:{}", Utility.indentMiddle(), result, items, dividends, histories, prices);

		log.debug("{} put({}) - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
	}

	private List<DividendDomain> currentPriceFromPrices(List<PriceDomain> prices) {
		log.info("{} currentPriceFromPrices(#{})", Utility.indentStart(), Utility.size(prices));

		Map<String, PriceDomain> map = new HashMap<>();
		prices.forEach(price -> {
			String code = price.getCode();
			PriceDomain previous = map.get(code);
			if (previous == null) {
				map.put(code, price);
				return;
			}

			if (previous.getBase().before(price.getBase())) {
				map.put(code, price);
				return;
			}
		});
		List<DividendDomain> dividendsRecent = new ArrayList<>();
		map.forEach((code, price) -> {
			DividendDomain dividend = DividendDomain.builder().code(code).currentPrice(price.getClosing()).build();
			dividendsRecent.add(dividend);
		});

		log.info("{} #{} currentPriceFromPrices(#{})", Utility.indentEnd(), Utility.size(dividendsRecent), Utility.size(prices));
		return dividendsRecent;
	}

	// KSD증권정보포털(SEIBro) > 주식 > 배당정보 > 배당순위
	public ParserResult crawlItemDividendTopCompany() {
		log.info("{} crawlItemDividendTopCompany()", Utility.indentStart());
		long started = System.currentTimeMillis();

		String URL = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01042V.xml&menuNo=286";
		String MARK_START_END_POINT = String.format("KEYWORD\t%s\t%s\tURL\t%s\n", "crawlItemDividendTopCompany", "주식 상위 배당", URL);
		int YEARS = 3;

		StringBuffer sb = new StringBuffer();
		sb.append(MARK_START_END_POINT);
		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			driver.navigate().to(URL);
			driver.findElement(By.xpath("//a[@id='btn_wide']"), TIMEOUT * 4).click();
			driver.findElementIncludeText(By.xpath("//th"), TIMEOUT, "결산월");

			new Select(driver.findElement(By.xpath("//select[@id='select_marketKind_input_0']"), TIMEOUT)).selectByVisibleText("유가증권시장"); // 시장구분을 유가증권시장
			for (int cx = LocalDate.now().getYear() - 1, sizex = LocalDate.now().getYear() - YEARS; cx > sizex; cx--) {
				String year = String.format("%d년", cx);
				new Select(driver.findElement(By.xpath("//select[@id='selectbox2_input_0']"), TIMEOUT)).selectByVisibleText(year); // 2022년
				String previous = driver.getText(By.xpath("//table[@id='grid1_body_table']/tbody/tr[1]/td[2]"), TIMEOUT, "andold");
				driver.findElement(By.xpath("//a[@id='group57']"), 2000).click();
				driver.findElement(By.xpath("//table[@id='grid1_body_table']/tbody/tr[1]/td[2]"), TIMEOUT, previous);
				for (int cy = 1; cy < 5; cy++) {
					String pageString = String.format("%d", cy);
					log.debug("{} {} {} {} - crawlItemDividendTopCompany() - {}", Utility.indentMiddle(), "유가증권시장", year, cy, Utility.toStringPastTimeReadable(started));
					driver.findElementIncludeText(By.xpath("//div[@id='cntsPaging01']//a"), TIMEOUT, pageString).click();
					driver.findElementIncludeTextAndClass(By.xpath("//div[@id='cntsPaging01']//a"), TIMEOUT, pageString, "w2pageList_label_selected");
					WebElement table = driver.findElement(By.xpath("//table[@id='grid1_body_table']"), TIMEOUT);
					sb.append(driver.extractTextFromTableElement(table, "KOSPI\t"));
					sb.append(MARK_ANDOLD_SINCE);
				}
			}

			new Select(driver.findElement(By.xpath("//select[@id='select_marketKind_input_0']"), TIMEOUT)).selectByVisibleText("코스닥시장"); // 시장구분을 코스닥시장
			for (int cx = LocalDate.now().getYear() - 1, sizex = LocalDate.now().getYear() - YEARS; cx > sizex; cx--) {
				String year = String.format("%d년", cx);
				new Select(driver.findElement(By.xpath("//select[@id='selectbox2_input_0']"), TIMEOUT)).selectByVisibleText(year); // 2022년
				String previous = driver.getText(By.xpath("//table[@id='grid1_body_table']/tbody/tr[1]/td[2]"), TIMEOUT, "andold");
				driver.findElement(By.xpath("//a[@id='group57']"), 2000).click();
				driver.findElement(By.xpath("//table[@id='grid1_body_table']/tbody/tr[1]/td[2]"), TIMEOUT, previous);
				for (int cy = 1; cy < 5; cy++) {
					String pageString = String.format("%d", cy);
					log.debug("{} {} {} {} - crawlItemDividendTopCompany() - {}", Utility.indentMiddle(), "코스닥시장", year, cy, Utility.toStringPastTimeReadable(started));
					driver.findElementIncludeText(By.xpath("//div[@id='cntsPaging01']//a"), TIMEOUT, pageString).click();
					driver.findElementIncludeTextAndClass(By.xpath("//div[@id='cntsPaging01']//a"), TIMEOUT, pageString, "w2pageList_label_selected");
					WebElement table = driver.findElement(By.xpath("//table[@id='grid1_body_table']"), TIMEOUT);
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
		ParserResult result = ParserService.parse(text, false);
		put(result);

		log.info("{} {} crawlItemDividendTopCompany() - {}", Utility.indentMiddle(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	// KSD증권정보포털(SEIBro) > ETF > 종목발행현황
	public ParserResult crawlItemEtf() {
		log.info("{} crawlItemEtf()", Utility.indentStart());
		long started = System.currentTimeMillis();

		String URL = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06025V.xml&menuNo=174";
		String MARK_START_END_POINT = String.format( "KEYWORD\t%s\t%s\tURL\t%s\n", "crawlItemEtf", "ETF 종목 발행현황", URL);

		StringBuffer sb = new StringBuffer();
		sb.append(MARK_START_END_POINT);
		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			driver.navigate().to(URL);

			// 넓게보기 클릭
			driver.findElement(By.xpath("//a[@id='btn_wide']"), TIMEOUT * 4).click();

			// 조회 클릭
			By byMarkSearchDone = By.xpath(String.format("//table[@id='grid1_body_table']/tbody/tr[%d]/td[7]", driver.findElements(By.xpath("//table[@id='grid1_body_table']/tbody/tr"), TIMEOUT).size() - 1));
			String previousAmount = driver.getText(byMarkSearchDone, TIMEOUT, "andold");	//	이전거 마지막 거래량(3개월평균)
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='group115']"), false, TIMEOUT);
			driver.findElement(By.xpath("//a[@id='group133']"), TIMEOUT).click();

			//	이전거 지워져야지
			driver.waitUntilTextNotInclude(byMarkSearchDone, TIMEOUT, previousAmount);

			// 페이지 처리
			String XPATH_CURRENT_PAGE = "//div[@id='pageList1']/ul/li/a[@class='w2pageList_control_label w2pageList_label_selected']";
			String currentPage = driver.getText(By.xpath(XPATH_CURRENT_PAGE), TIMEOUT, "andold");	//	현재 페이지 번호
			
			for (int cx = 0, sizex = 128 / 32; cx < sizex; cx++) {
				// 숨겨진 코드 보이기		/html/body/div[1]/div[1]/div[2]/div[2]/div[5]/div[1]/div/table/tbody/tr[1]/td[3]/nobr
				driver.manage().timeouts().implicitlyWait(Duration.ofMillis(TIMEOUT));
				driver.executeScript("$(\"td[col_id='SHOTN_ISIN']\").css(\"overflow\", \"visible\")");
				driver.executeScript("$(\"td[col_id='SHOTN_ISIN'] nobr\").css(\"overflow\", \"visible\")");
				driver.waitUntilIsDisplayed(byMarkSearchDone, true, TIMEOUT);

				//	테이블
				WebElement table = driver.findElement(By.xpath("//table[@id='grid1_body_table']"), TIMEOUT);
				sb.append(driver.extractTextFromTableElement(table, "ETF\t"));
				sb.append(MARK_ANDOLD_SINCE);

				// 다음 페이지 클릭
				byMarkSearchDone = By.xpath(String.format("//table[@id='grid1_body_table']/tbody/tr[%d]/td[7]", driver.findElements(By.xpath("//table[@id='grid1_body_table']/tbody/tr"), TIMEOUT).size() - 1));
				previousAmount = driver.getText(byMarkSearchDone, TIMEOUT, "andold");	//	이전거 마지막 거래량(3개월평균)
				driver.clickIfExist(By.xpath("//li[@id='pageList1_next_btn']/a"));
				driver.waitUntilTextNotInclude(byMarkSearchDone, TIMEOUT, previousAmount);

				String nextPage = driver.getText(By.xpath(XPATH_CURRENT_PAGE), TIMEOUT, currentPage);
				if (currentPage.equalsIgnoreCase(nextPage)) {
					break;
				}
				
				log.info("{} 페이지:{} crawlItemEtf.extract() - {}", Utility.indentMiddle(), currentPage, Utility.toStringPastTimeReadable(started));
				currentPage = nextPage;
			}
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}
		driver.quit();

		sb.append(MARK_START_END_POINT);
		String text = new String(sb);
		ParserResult result = ParserService.parse(text, false);
		put(result);

		log.info("{} {} crawlItemEtf() - {}", Utility.indentMiddle(), result, Utility.toStringPastTimeReadable(started));
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

	// 주식=일반기업 배당금 내역 by KSD 증권정보포털 SEIBro
	public ParserResult crawlDividendHistoryCompany(Date start) {
		log.info("{} crawlDividendHistoryCompany()", Utility.indentStart());
		long started = System.currentTimeMillis();

		if (LocalDate.now().isAfter(LocalDate.of(2024,  1,  1))) {
			ParserResult result = CrawlDividendHistoryCompanyThread.crawl(start);
			put(result);

			log.info("{} {} crawlDividendHistoryCompany() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
			return result;
		}

		ParserResult container = new ParserResult().clear();
		/*
		List<ItemDomain> items = stockItemService.search(null);
		List<ItemDomain> filtered = items.stream()
				.filter(item -> isPossibleCompany(item))
				.collect(Collectors.toList());

		List<List<ItemDomain>> partitions = Lists.partition(filtered, 128);
		for (List<ItemDomain> partition: partitions) {
			ParserResult result = CrawlDividendHistoryCompanyThread.crawl(partition, start);
			container.addAll(result);
			put(result);
		}
		*/

		log.info("{} {} crawlDividendHistoryCompany() - {}", Utility.indentEnd(), container, Utility.toStringPastTimeReadable(started));
		return container;
	}

	private boolean isPossibleCompany(ItemDomain item) {
		String code = item.getCode();
		Boolean etf = item.getEtf();

		return (code != null && !code.isBlank() && (etf == null || !etf.booleanValue()));
	}

	// ETF 배당금 내역 by KSD 증권정보포털 SEIBro
	public ParserResult crawlDividendHistoryEtf(Date start) {
		log.info("{} crawlDividendHistoryEtf({})", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		ParserResult container = new ParserResult().clear();
		List<ItemDomain> items = stockItemService.search(null);
		List<ItemDomain> filtered = items.stream()
				.filter(item -> isPossibleEtf(item))			
				.collect(Collectors.toList());
		List<List<ItemDomain>> partitions = Lists.partition(filtered, 128);
		for (List<ItemDomain> partition: partitions) {
			ParserResult result = CrawlDividendHistoryEtfThread.crawl(partition, start);
			container.addAll(result);
			put(result);
		}

		log.info("{} {} crawlDividendHistoryEtf({}) - {}", Utility.indentEnd(), container, start, Utility.toStringPastTimeReadable(started));
		return container;
	}


	private boolean isPossibleEtf(ItemDomain item) {
		String code = item.getCode();
		Boolean etf = item.getEtf();

		return (code != null && !code.isBlank() && (etf == null || etf.booleanValue()));
	}

	// KSD증권정보포털(SEIBro) > ETF > ETF종합정보 > 종목상세
	public ParserResult crawlItemDetailEtf() {
		log.info("{} crawlItemDetailEtf()", Utility.indentStart());
		long started = System.currentTimeMillis();

		ParserResult container = new ParserResult().clear();
		List<ItemDomain> items = stockItemService.search(null);
		List<List<ItemDomain>> partitions = Lists.partition(items, 128);
		for (List<ItemDomain> partition: partitions) {
			ParserResult result = CrawlItemDetailEtfThread.crawl(partition);
			container.addAll(result);
			put(result);
		}

		log.info("{} {} crawlItemDetailEtf() - {}", Utility.indentEnd(), container, Utility.toStringPastTimeReadable(started));
		return container;
	}

	// KSD증권정보포털(SEIBro) > 주식 > 종목별상세정보 > 종목종합내역 (KSD증권정보포털(SEIBro) > 기업 > 기업기본정보와 동일)
	public ParserResult crawlItemDetailCompany() {
		log.info("{} crawlItemDetailCompany()", Utility.indentStart());
		long started = System.currentTimeMillis();

		ParserResult container = new ParserResult().clear();
		List<ItemDomain> items = stockItemService.search(null);
		List<List<ItemDomain>> partitions = Lists.partition(items, 128);
		for (List<ItemDomain> partition: partitions) {
			ParserResult result = CrawlItemDetailCompanyThread.crawl(partition);
			container.addAll(result);
			put(result);
		}

		log.info("{} {} crawlItemDetailCompany() - {}", Utility.indentEnd(), container, Utility.toStringPastTimeReadable(started));
		return container;
	}

	public static ChromeDriverWrapper defaultChromeDriver() {
		System.setProperty("webdriver.chrome.driver", webdriverPath);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--incognito");
		options.addArguments("--enable-gpu");
		options.addArguments("--verbose");
		if (debug) {
			options.addArguments("--window-size=2560,1080");
			options.addArguments("--window-position=-2560,0");
			options.addArguments("--start-fullscreen");
		} else {
			options.addArguments("--window-size=3840,4320");
			options.addArguments("--headless");
		}
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
