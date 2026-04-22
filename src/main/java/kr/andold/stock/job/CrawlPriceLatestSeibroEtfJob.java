package kr.andold.stock.job;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.ApplicationContextProvider;
import kr.andold.stock.crawler.CrawlerService;
import kr.andold.stock.crawler.Seibro;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.ItemCompilePriceEarningsRatioJob;
import kr.andold.stock.service.JobService;
import kr.andold.stock.service.PriceService;
import kr.andold.stock.service.JobService.Job;
import kr.andold.stock.service.JobService.StockCompileJob;
import kr.andold.utils.ChromeDriverWrapper;
import kr.andold.utils.Utility;
import kr.andold.utils.persist.CrudList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@Service
public class CrawlPriceLatestSeibroEtfJob implements Job {
	private static final int TIMEOUT = 8000;
	private static final String URL = Seibro.URL_PRICE_ETF_CURRENT;	// https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06025V.xml&menuNo=174
	private static final Duration DEFAULT_TIMEOUT_DURATION = Duration.ofSeconds(8);
	private static final Duration DEFAULT_TIMEOUT_DURATION_LONG = Duration.ofMinutes(1);

	@Builder.Default @Getter @Setter private Long timeout = 3600L;

	@Autowired private Seibro seibro;
	@Autowired private PriceService priceService;

	@Override
	public STATUS call() throws Exception {
		log.debug("{} CrawlPriceLatestSeibroEtfJob::call()", Utility.indentStart());
		long started = System.currentTimeMillis();

		CrawlPriceLatestSeibroEtfJob that = (CrawlPriceLatestSeibroEtfJob) ApplicationContextProvider.getBean(CrawlPriceLatestSeibroEtfJob.class);
		STATUS result = that.main();

		log.debug("{} 『#{}』 CrawlPriceLatestSeibroEtfJob::call() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	public static void regist(ConcurrentLinkedDeque<Job> deque) {
		if (containsOrModify(JobService.getQueue0())) {
			return;
		}
		if (containsOrModify(JobService.getQueue1())) {
			return;
		}
		if (containsOrModify(JobService.getQueue2())) {
			return;
		}
		if (containsOrModify(JobService.getQueue3())) {
			return;
		}

		deque.addLast(CrawlPriceLatestSeibroEtfJob.builder().build());
	}

	private static boolean containsOrModify(ConcurrentLinkedDeque<Job> deque) {
		for (Job job : deque) {
			if (containsOrModify(job)) {
				return true;
			}
		}
		return false;
	}

	private static boolean containsOrModify(Job job) {
		if (!(job instanceof CrawlPriceLatestSeibroEtfJob)) {
			return false;
		}

		return true;
	}

	// SEIBro > ETF > 종목발행현황
	protected STATUS main() {
		log.debug("{} CrawlPriceLatestSeibroEtfJob::main()", Utility.indentStart());
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			navigate(driver);
			inquire(driver);
			String date = baseDate(driver);
			CrudList<PriceDomain> crud = pages(date, driver);
			propergate(date);
			driver.quit();

			log.debug("{} 『{}』 CrawlPriceLatestSeibroEtfJob::main() - {}", Utility.indentEnd(), crud, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		} catch (Exception e) {
			driver.quit();
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		log.debug("{} 『{}』 CrawlPriceLatestSeibroEtfJob::main() - {}", Utility.indentEnd(), STATUS.EXCEPTION, Utility.toStringPastTimeReadable(started));
		return STATUS.EXCEPTION;
	}

	private void propergate(String date) {
		log.debug("{} propergate(『{}』)", Utility.indentStart(), date);

		LocalDate start = Utility.parseDateTime(date).toInstant().atZone(Utility.ZONE_ID_KST).toLocalDate();
		JobService.getQueue2().addLast(StockCompileJob.builder().start(start).build());
		ItemCompilePriceEarningsRatioJob.regist(JobService.getQueue2());

		log.debug("{} propergate(『{}』)", Utility.indentEnd(), date);
	}

	private CrudList<PriceDomain> pages(String base, ChromeDriverWrapper driver) throws Exception {
		// 페이지마다 - 테이블 내용 저장
		By BY_CURRENT_PAGE = By.xpath("//div[@id='pageList1']/ul/li/a[@class='w2pageList_control_label w2pageList_label_selected']");
		log.debug("{} 종목발행현황:pages() - 『{}』 『{}』", Utility.indentMiddle(), "BY_CURRENT_PAGE", driver.getText(BY_CURRENT_PAGE, Duration.ZERO));
		CrudList<PriceDomain> container = CrudList.<PriceDomain>builder().build();
		for (String pageNumber = "1";;) {
			long forStarted = System.currentTimeMillis();

			// 테이블
			By BY_TABLE = By.xpath("//table[@id='grid1_body_table']");
			log.debug("{} 『{}』종목발행현황:pages() - 『{}』 『{}』", Utility.indentMiddle(), pageNumber, "테이블", Utility.ellipsisEscape(driver.getText(BY_TABLE, Duration.ZERO), 32, 16));
			WebElement table = driver.findElement(BY_TABLE, DEFAULT_TIMEOUT_DURATION);
			// width inherit
			((JavascriptExecutor) driver).executeScript("arguments[0].style.removeProperty('width')", table);


//			List<PriceDomain> pricesByRare = extractParseByRare(driver, base);
			List<PriceDomain> pricesByRare = extractParseByTd(driver, base);
			CrudList<PriceDomain> crudByRare = priceService.put(pricesByRare);
			container.add(crudByRare);

			navigateNextPage(driver, pageNumber);

			String currentPageNumber = driver.getText(BY_CURRENT_PAGE, DEFAULT_TIMEOUT_DURATION, "-1");
			// 다음 페이지가 갔는데...
			if (pageNumber.equalsIgnoreCase(currentPageNumber)) {
				break;
			}

			pageNumber = currentPageNumber;
			log.debug("{} 『{}』 종목발행현황:pages({}, ...) - {}", Utility.indentMiddle(), pageNumber, base, Utility.toStringPastTimeReadable(forStarted));
		}
		driver.quit();

		return container;
	}

	private List<PriceDomain> extractParseByTd(ChromeDriverWrapper driver, String date) {
		log.debug("{} extractParseByTd(..., {})", Utility.indentStart(), date);
		long started = System.currentTimeMillis();

		//	//*[@id="grid1_body_tbody"]
		By BY_TABLE_TR = By.xpath("//*[@id='grid1_body_tbody']/tr");
		log.debug("{} extractParseByTd(...) - 『{}』 『{}』", Utility.indentMiddle(), "TR", driver.getTextEscape(BY_TABLE_TR, Duration.ZERO, 32, 16));
		List<WebElement> trs = driver.findElements(BY_TABLE_TR);
		log.debug("{} extractParseByTd(...) - 『{}』 『{}』『{}』", Utility.indentMiddle(), "TR", driver.getTextEscape(BY_TABLE_TR, Duration.ZERO, 32, 16), Utility.toStringPastTimeReadable(started));

		Date base = Utility.parseDateTime(date);
		List<PriceDomain> prices = new ArrayList<>();
		for (int cx = 0, sizex = trs.size(); cx < sizex; cx++) {
			WebElement tr = trs.get(cx);
			List<WebElement> tds = tr.findElements(By.tagName("td"));
			if (tds.isEmpty() || tds.size() < 8) {
				log.debug("{} 『INVALID::{}/{}』extractParseByTd(...) - 『{}』 『{}』", Utility.indentMiddle(), cx, sizex, "TR", tr.getText());
				continue;
			}

			String code = tds.get(2).getText();
			Integer closing = Utility.parseInteger(tds.get(5).getText(), null);
			if (code.isBlank() || closing == null) {
				log.debug("{} 『INVALID::{}/{}』extractParseByTd(...) - 『{}』 『{}』『{}』『{}』", Utility.indentMiddle(), cx, sizex, "TR", tr.getText(), code, closing);
				continue;
			}
			PriceDomain price = PriceDomain.builder()
					.code(code)
					.base(base)
					.closing(closing)
					.build();
				prices.add(price);
		}

		log.debug("{} 『#{}』 extractParseByTd(...) - {}", Utility.indentEnd(), Utility.size(prices), Utility.toStringPastTimeReadable(started));
		return prices;
	}

	@SuppressWarnings("unused")
	private List<PriceDomain> extractParseByRare(ChromeDriverWrapper driver, String date) {
		log.debug("{} extractParseByRare(...)", Utility.indentStart());
		long started = System.currentTimeMillis();

		By BY_TABLE = By.xpath("//table[@id='grid1_body_table']");
		log.debug("{} extractParseByRare(...) - 『{}』 『{}』", Utility.indentMiddle(), "table", driver.getTextEscape(BY_TABLE, Duration.ZERO, 32, 32));
		String text = driver.getText(BY_TABLE);
		log.debug("{} extractParseByRare(...) - 『{}』 『{}』", Utility.indentMiddle(), "table", driver.getTextEscape(BY_TABLE, Duration.ZERO, 32, 32));

		log.debug("{} 『{}』 extractParseByRare(...) - {}", Utility.indentEnd(), Utility.ellipsisEscape(text, 16, 16), Utility.toStringPastTimeReadable(started));

		List<PriceDomain> prices = new ArrayList<>();
		String[] lines = text.split("\n");
		Date base = Utility.parseDateTime(date);
		String code = "";
		Integer closing = 0;
		for (int cx = 2; cx < lines.length; cx++) {
			log.trace("{} 『{}/{}』 extractParseByRare(『{}』, ...) - 『{}』{}", Utility.indentMiddle(), Utility.size(prices), cx, date, lines[cx], Utility.toStringPastTimeReadable(started));
			switch (cx % 15) {
				case 3:
					code = lines[cx];
					break;
				case 5:
					closing = Integer.parseInt(lines[cx].replaceAll("([,\\t])|(\\.[0-9]+)", ""));
					break;
				case 1:
					if (code.isBlank() || closing == null) {
						break;
					}

					PriceDomain price = PriceDomain.builder()
						.code(code)
						.base(base)
						.closing(closing)
						.build();
					prices.add(price);
					code = "";
					closing = null;
					break;
				default:
					break;
			}
		}

		log.debug("{} 『{}』 extractParseByRare(『{}』, 『{}』) - {}", Utility.indentEnd(), Utility.size(prices), date, Utility.ellipsisEscape(text, 64), Utility.toStringPastTimeReadable(started));
		return prices;
	}

	private void navigateNextPage(ChromeDriverWrapper driver, String pageNumber) {
		log.debug("{} navigateNextPage(..., {})", Utility.indentStart(), pageNumber);
		long started = System.currentTimeMillis();

		//	표식
		By BY_MARK_PAGE_CHANGE = By.xpath("//*[@id='grid1_cell_0_6']/nobr");
		log.debug("{} navigateNextPage(..., {}) - 『{}』 『{}』", Utility.indentMiddle(), pageNumber, "표식", driver.getText(BY_MARK_PAGE_CHANGE, Duration.ZERO));
		String markPageChange = Double.toString(Math.random());
		driver.setText(BY_MARK_PAGE_CHANGE, markPageChange, TIMEOUT);
		log.debug("{} navigateNextPage(..., {}) - 『{}』 『{}』", Utility.indentMiddle(), pageNumber, "표식", driver.getText(BY_MARK_PAGE_CHANGE, Duration.ZERO));

		// 다음 페이지
		log.trace("{} navigateNextPage(..., {}) - 『{}』 『{}』", Utility.indentMiddle(), pageNumber, "표식", driver.getText(BY_MARK_PAGE_CHANGE, Duration.ZERO));
		markPageChange = driver.getText(BY_MARK_PAGE_CHANGE, DEFAULT_TIMEOUT_DURATION, "-");
		if (CrawlerService.getDebug()) {
			driver.click(By.xpath("//*[@id='pageList1_nextPage_btn']/a"));
		} else {
			driver.click(By.xpath("//*[@id='pageList1_next_btn']/a"));
		}

		//	다음 페이지 로딩 완료
		log.trace("{} navigateNextPage(..., {}) - 『{}』 『{}』", Utility.indentMiddle(), pageNumber, "페이지", driver.getText(BY_MARK_PAGE_CHANGE, Duration.ZERO));
		driver.waitUntilIsDisplayed(By.xpath("//*[@id='___processbar2_i']"), false, DEFAULT_TIMEOUT_DURATION);
		log.trace("{} navigateNextPage(..., {}) - {} {}", Utility.indentMiddle(), pageNumber, "페이지", Utility.toStringPastTimeReadable(started));
		driver.waitUntilTextNotInclude(BY_MARK_PAGE_CHANGE, markPageChange, DEFAULT_TIMEOUT_DURATION);
		log.trace("{} navigateNextPage(..., {}) - {} {}", Utility.indentMiddle(), pageNumber, "페이지", Utility.toStringPastTimeReadable(started));
		driver.waitUntilIsDisplayed(BY_MARK_PAGE_CHANGE, true, DEFAULT_TIMEOUT_DURATION);
		log.trace("{} navigateNextPage(..., {}) - 『{}』 『{}』", Utility.indentMiddle(), pageNumber, "페이지", driver.getText(BY_MARK_PAGE_CHANGE, Duration.ZERO));
		//	첫번째	//*[@id="grid1_body_tbody"]/tr[1]
		By BY_FIRST_ROW = By.xpath("//*[@id='grid1_body_tbody']/tr[1]");
		log.trace("{} navigateNextPage(..., {}) - 『{}』 『{}』", Utility.indentMiddle(), pageNumber, "첫번째", driver.getTextEscape(BY_FIRST_ROW, Duration.ZERO));
		driver.waitUntilIsDisplayed(BY_FIRST_ROW, true, DEFAULT_TIMEOUT_DURATION);
		log.trace("{} navigateNextPage(..., {}) - 『{}』 『{}』", Utility.indentMiddle(), pageNumber, "첫번째", driver.getTextEscape(BY_FIRST_ROW, Duration.ZERO));
		//	첫번째 마지막 칼럼	//*[@id="grid1_cell_0_16"]/nobr
		By BY_FIRST_ROW_LAST_COLUMN = By.xpath("//*[@id='grid1_cell_0_16']/nobr");
		log.trace("{} navigateNextPage(..., {}) - 『{}』 『{}』 {}", Utility.indentMiddle(), pageNumber, "마지막항", driver.getTextEscape(BY_FIRST_ROW_LAST_COLUMN, Duration.ZERO), Utility.toStringPastTimeReadable(started));
		driver.waitUntilIsDisplayed(BY_FIRST_ROW_LAST_COLUMN, true, DEFAULT_TIMEOUT_DURATION);
		driver.waitUntilTextNotBlank(BY_FIRST_ROW_LAST_COLUMN, (int) (DEFAULT_TIMEOUT_DURATION.getSeconds() * 1000));
		log.trace("{} navigateNextPage(..., {}) - 『{}』 『{}』 {}", Utility.indentMiddle(), pageNumber, "마지막항", driver.getTextEscape(BY_FIRST_ROW_LAST_COLUMN, Duration.ZERO), Utility.toStringPastTimeReadable(started));

		log.debug("{} navigateNextPage(..., {}) - {}", Utility.indentEnd(), pageNumber, Utility.toStringPastTimeReadable(started));
	}

	@SuppressWarnings("unused")
	private String extractFromTable(ChromeDriverWrapper driver) {
		log.debug("{} extract(...)", Utility.indentStart());
		long started = System.currentTimeMillis();

		By BY_TABLE_TR = By.xpath("//table[@id='grid1_body_table']//tr");
		log.debug("{} extract(...) - 『{}』 『{}』", Utility.indentMiddle(), "TR", driver.getTextEscape(BY_TABLE_TR, Duration.ZERO, 32, 32));
		List<WebElement> trs = driver.findElements(BY_TABLE_TR);
		log.debug("{} extract(...) - 『{}』 『{}』", Utility.indentMiddle(), "TR", driver.getTextEscape(BY_TABLE_TR, Duration.ZERO, 32, 32));
		log.debug("{} extract(...) - {}", Utility.indentMiddle(), Utility.toStringPastTimeReadable(started));

		StringBuffer sb = new StringBuffer();
		for (WebElement tr : trs) {
			List<WebElement> ths = tr.findElements(By.cssSelector("th, td"));
			if (ths.isEmpty()) {
				continue;
			}

			for (WebElement th : ths) {
				sb.append(th.getText().replaceAll("[ \t\n]+", ""));
				sb.append("\t");
			}
			sb.append("\n");
			log.debug("{} 『{}』 extract(...) - {}", Utility.indentMiddle(), Utility.ellipsisEscape(sb.toString(), 8, 32), Utility.toStringPastTimeReadable(started));
		}

		String text = new String(sb);
		log.debug("{} 『{}』 extract(...) - {}", Utility.indentEnd(), Utility.ellipsisEscape(text, 16, 16), Utility.toStringPastTimeReadable(started));
		return text;
	}
	@SuppressWarnings("unused")
	private String extractFromTable1(WebElement table) {
		log.debug("{} extractFromTable(...)", Utility.indentStart());
		long started = System.currentTimeMillis();

		StringBuffer sb = new StringBuffer();
		List<WebElement> theads = table.findElements(By.tagName("thead"));
		for (WebElement thead : theads) {
			List<WebElement> trs = thead.findElements(By.tagName("tr"));
			for (WebElement tr : trs) {
				List<WebElement> ths = tr.findElements(By.tagName("th"));
				if (ths.isEmpty()) {
					continue;
				}

				for (WebElement th : ths) {
					sb.append(th.getText().replaceAll("[ \t\n]+", ""));
					sb.append("\t");
				}
				sb.append("\n");
			}
		}
		
		List<WebElement> trs = table.findElement(By.tagName("tbody")).findElements(By.tagName("tr"));
		for (WebElement tr : trs) {
			List<WebElement> tds = tr.findElements(By.tagName("td"));
			if (tds.isEmpty()) {
				continue;
			}

			for (WebElement td : tds) {
				sb.append(td.getText().replaceAll("[ \t\n]+", ""));
				sb.append("\t");
			}
			sb.append("\n");
		}

		String text = new String(sb);
		log.debug("{} 『{}』 extractFromTable(...) - {}", Utility.indentEnd(), Utility.ellipsisEscape(text, 16, 16), Utility.toStringPastTimeReadable(started));
		return text;
	}

	private String baseDate(ChromeDriverWrapper driver) {
		log.debug("{} baseDate(...)", Utility.indentStart());

		By BY_XPATH_BASE_DATE = By.xpath("//*[@id='STD_DT']");
		String base = driver.getText(BY_XPATH_BASE_DATE).replaceAll("기준일: ", "");
		log.debug("{} 종목발행현황:baseDate() - 『{}』 『{}』", Utility.indentMiddle(), "기준일", driver.getText(BY_XPATH_BASE_DATE, Duration.ZERO));

		log.debug("{} 『{}』 - baseDate(...)", Utility.indentEnd(), base);
		return base;
	}

	private void inquire(ChromeDriverWrapper driver) {
		log.debug("{} inquire(...)", Utility.indentStart());

		// 검색결과(15039건)	//*[@id="LIST_CNT"]
		By BY_XPATH_TOTAL_COUNT_SEARCHED = By.xpath("//*[@id='LIST_CNT']");
		log.debug("{} 종목발행현황:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "검색결과", driver.getText(BY_XPATH_TOTAL_COUNT_SEARCHED, Duration.ZERO));
		driver.setText(BY_XPATH_TOTAL_COUNT_SEARCHED, Double.toString(Math.random()), TIMEOUT);

		//	넓게보기		//*[@id="wide"]/div/div
		By BY_XPATH_SHOW_WIDE = By.xpath("//*[@id='wide']div/div");
		log.debug("{} 종목발행현황:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "넓게보기", driver.getText(BY_XPATH_SHOW_WIDE, Duration.ZERO));
		driver.click(BY_XPATH_SHOW_WIDE);
		log.debug("{} 종목발행현황:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "넓게보기", driver.getText(BY_XPATH_SHOW_WIDE, Duration.ZERO));
		
		// 조회	//*[@id="group133"]
		By BY_XPATH_INQUIRE = By.xpath("//*[@id='group133']");
		log.debug("{} 종목발행현황:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "조회", driver.getText(BY_XPATH_INQUIRE, Duration.ZERO));
		driver.presenceOfElementLocated(BY_XPATH_INQUIRE, DEFAULT_TIMEOUT_DURATION);
		driver.clickIfExist(BY_XPATH_INQUIRE);
		log.debug("{} 종목발행현황:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "조회", driver.getText(BY_XPATH_INQUIRE, Duration.ZERO));

		// 결과
		log.debug("{} 종목발행현황:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "검색결과", driver.getText(BY_XPATH_TOTAL_COUNT_SEARCHED, Duration.ZERO));
		driver.waitUntilTextMatch(BY_XPATH_TOTAL_COUNT_SEARCHED, "\\([ 0-9]+\\)건");
		log.debug("{} 종목발행현황:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "검색결과", driver.getText(BY_XPATH_TOTAL_COUNT_SEARCHED, Duration.ZERO));

		// LOADING //*[@id="___processbar2_i"]
		By BY_XPATH_LOADING = By.xpath("//*[@id='___processbar2_i']");
		log.debug("{} 종목발행현황:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "LOADING", driver.getText(BY_XPATH_LOADING, Duration.ZERO));
		driver.waitUntilIsDisplayed(BY_XPATH_LOADING, false, DEFAULT_TIMEOUT_DURATION);

		log.debug("{} inquire(...)", Utility.indentEnd());
	}

	private void navigate(ChromeDriverWrapper driver) {
		driver.manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT_DURATION_LONG);
		driver.navigate().to(URL);

		driver.manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT_DURATION);
		seibro.clickShowWideIcon(driver);
	}

}
