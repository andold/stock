package kr.andold.stock.job;

import java.time.Duration;
import java.time.LocalDate;
import java.util.List;

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

@Deprecated
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

	@Builder.Default @Getter @Setter private Long timeout = 600L;

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
		JobService.getQueue2().addLast(ItemCompilePriceEarningsRatioJob.builder().build());

		log.debug("{} propergate(『{}』)", Utility.indentEnd(), date);
	}

	private CrudList<PriceDomain> pages(String base, ChromeDriverWrapper driver) throws Exception {
		By BY_MARK_PAGE_CHANGE = By.xpath("//*[@id='grid1_cell_0_6']/nobr");
		log.debug("{} 종목발행현황:pages() - 『{}』 『{}』", Utility.indentMiddle(), "페이지", driver.getText(BY_MARK_PAGE_CHANGE, Duration.ZERO));
		String markPageChange = driver.getText(BY_MARK_PAGE_CHANGE, DEFAULT_TIMEOUT_DURATION, "");
		log.debug("{} 종목발행현황:pages() - 『{}』 『{}』", Utility.indentMiddle(), "페이지", driver.getText(BY_MARK_PAGE_CHANGE, Duration.ZERO));

		// 페이지마다 - 테이블 내용 저장
		By BY_CURRENT_PAGE = By.xpath("//div[@id='pageList1']/ul/li/a[@class='w2pageList_control_label w2pageList_label_selected']");
		log.debug("{} 종목발행현황:pages() - 『{}』 『{}』", Utility.indentMiddle(), "BY_CURRENT_PAGE", driver.getText(BY_CURRENT_PAGE, Duration.ZERO));
		long pause = 1000;
		CrudList<PriceDomain> container = CrudList.<PriceDomain>builder().build();
		for (String pageNumber = "1";;) {
			long forStarted = System.currentTimeMillis();

			// 테이블
			By BY_TABLE = By.xpath("//table[@id='grid1_body_table']");
			log.debug("{} 종목발행현황:pages() - 『{}』 『{}』", Utility.indentMiddle(), "테이블", Utility.ellipsisEscape(driver.getText(BY_TABLE, Duration.ZERO), 32, 32));
			WebElement table = driver.findElement(BY_TABLE, DEFAULT_TIMEOUT_DURATION);
			// width inherit
			((JavascriptExecutor) driver).executeScript("arguments[0].style.removeProperty('width')", table);
			String text = extractFromTable(table);
			List<PriceDomain> prices = CrawlPriceLatestSeibroCompanyExcelJob.parseLines(base, text);
			CrudList<PriceDomain> crud = priceService.put(prices);
			container.add(crud);

			// 다음 페이지
			log.debug("{} 종목발행현황:pages() - 『{}』 『{}』", Utility.indentMiddle(), "페이지", driver.getText(BY_MARK_PAGE_CHANGE, Duration.ZERO));
			markPageChange = driver.getText(BY_MARK_PAGE_CHANGE, DEFAULT_TIMEOUT_DURATION, "-");
			if (CrawlerService.getDebug()) {
				driver.clickIfExist(By.xpath("//*[@id='pageList1_nextPage_btn']/a"));
			} else {
				driver.clickIfExist(By.xpath("//*[@id='pageList1_next_btn']/a"));
			}
			log.debug("{} 종목발행현황:pages() - 『{}』 『{}』", Utility.indentMiddle(), "페이지", driver.getText(BY_MARK_PAGE_CHANGE, Duration.ZERO));
			driver.waitUntilIsDisplayed(By.xpath("//*[@id='___processbar2_i']"), false, TIMEOUT);
			driver.waitUntilTextNotInclude(BY_MARK_PAGE_CHANGE, TIMEOUT, markPageChange);
			String currentPageNumber = driver.getText(BY_CURRENT_PAGE, DEFAULT_TIMEOUT_DURATION, "-1");
			log.debug("{} 종목발행현황:pages() - 『{}』 『{}』", Utility.indentMiddle(), "페이지", driver.getText(BY_MARK_PAGE_CHANGE, Duration.ZERO));
			
			// 다음 페이지가 갔는데...
			if (pageNumber.equalsIgnoreCase(currentPageNumber)) {
				break;
			}

			pageNumber = currentPageNumber;
			if (System.currentTimeMillis() - forStarted > 1024 * 4) {
				pause = Math.max(32, pause / 2);
			} else {
				pause = Math.min(1024 * 4, pause * 2);
			}
			Utility.sleep(Math.round(pause * Math.random()));

			log.debug("{} 『{}』 priceCurrentEtf({}) - {}", Utility.indentMiddle(), pageNumber, base, Utility.toStringPastTimeReadable(forStarted));
		}
		driver.quit();

		return container;
	}

	private String extractFromTable(WebElement table) {
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

		return sb.toString();
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
		driver.waitUntilIsDisplayed(BY_XPATH_LOADING, false, TIMEOUT);

		log.debug("{} inquire(...)", Utility.indentEnd());
	}

	private void navigate(ChromeDriverWrapper driver) {
		driver.manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT_DURATION_LONG);
		driver.navigate().to(URL);

		driver.manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT_DURATION);
		seibro.clickShowWideIcon(driver);
	}

}
