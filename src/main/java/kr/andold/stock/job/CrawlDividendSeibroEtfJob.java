package kr.andold.stock.job;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.ApplicationContextProvider;
import kr.andold.stock.crawler.ConstantSeibro;
import kr.andold.stock.crawler.CrawlerService;
import kr.andold.stock.crawler.Seibro;
import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.JobService;
import kr.andold.stock.service.ParserService;
import kr.andold.stock.service.JobService.Job;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.utils.ChromeDriverWrapper;
import kr.andold.utils.Utility;
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
public class CrawlDividendSeibroEtfJob implements Job, ConstantSeibro {
	@Builder.Default @Getter @Setter private Long timeout = 1200L;
	@Getter @Setter private ZonedDateTime start;

	@Autowired private CrawlerService service;
	@Autowired private JobService jobService;

	@Override
	public STATUS call() throws Exception {
		log.debug("{} CrawlDividendSeibroEtfJob::call()", Utility.indentStart());
		long started = System.currentTimeMillis();

		jobService.status("┍ETF최근배당:SEIBRO");
		STATUS result = main();
		jobService.status("┕ETF최근배당:SEIBRO");

		log.debug("{} 『#{}』 CrawlPriceLatestSeibroEtfJob::call() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	public static void regist(ConcurrentLinkedDeque<Job> deque, ZonedDateTime date) {
		if (containsOrModify(date, JobService.getQueue0())) {
			return;
		}
		if (containsOrModify(date, JobService.getQueue1())) {
			return;
		}
		if (containsOrModify(date, JobService.getQueue2())) {
			return;
		}
		if (containsOrModify(date, JobService.getQueue3())) {
			return;
		}

		CrawlDividendSeibroEtfJob job = (CrawlDividendSeibroEtfJob) ApplicationContextProvider.getBean(CrawlDividendSeibroEtfJob.class);
		job.containsOrModify(date);
		deque.addLast(job);
	}

	public boolean containsOrModify(ZonedDateTime date) {
		if (start.isBefore(date)) {
			return true;
		}
		
		start = date;
		return true;
	}

	private static boolean containsOrModify(ZonedDateTime date, ConcurrentLinkedDeque<Job> deque) {
		for (Job job : deque) {
			if (containsOrModify(date, job)) {
				return true;
			}
		}
		return false;
	}

	private static boolean containsOrModify(ZonedDateTime date, Job job) {
		if (!(job instanceof CrawlDividendSeibroEtfJob)) {
			return false;
		}

		CrawlDividendSeibroEtfJob previous = (CrawlDividendSeibroEtfJob) job;
		return previous.containsOrModify(date);
	}

	protected STATUS main() {
		log.debug("{} CrawlDividendSeibroEtfJob::main()", Utility.indentStart());
		long started = System.currentTimeMillis();

		Result<ParserResult> result = dividendEtf(Date.from(start.toInstant()));
		if (result.getStatus() == STATUS.SUCCESS) {
			service.put(result.getResult());
		}
		
		log.debug("{} 『{}』 CrawlDividendSeibroEtfJob::main() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result.getStatus();
	}

	public Result<ParserResult> dividendEtf(Date start) {
		log.debug("{} dividendEtf({})", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = null;
		try {
			driver = CrawlerService.defaultChromeDriver();
			driver.navigate().to(URL_ETF);

			// 조회기간 시작일
			By BY_XPATH_START = By.xpath("//input[@id='sd1_inputCalendar1_input']");
			WebElement startDateElement = driver.findElement(BY_XPATH_START, Duration.ofMinutes(1));
			startDateElement.clear();
			startDateElement.sendKeys(String.format("%1$tY%1$tm%1$td", start)); // 조회기간 시작일
			startDateElement.sendKeys(Keys.TAB); // 시작일 입력
			log.debug("{} dividendEtf({}) - 『{}』『{}』", Utility.indentMiddle(), start, "시작일", driver.getText(BY_XPATH_START, Duration.ZERO));

			Seibro.clickShowWideIcon(driver);	// 넓게보기

			// 조회 아이콘 클릭
			By BY_MARK_DIVIDEND_SEARCH_DONE = By.xpath("//*[@id='grid1_cell_0_8']");
			driver.setText(BY_MARK_DIVIDEND_SEARCH_DONE, MARK_ANDOLD_SINCE, TIMEOUT);
			String textPrevious = driver.getText(BY_MARK_DIVIDEND_SEARCH_DONE, DEFAULT_DURATION, "andold");
			driver.waitUntilIsDisplayed(By.xpath("//*[@id='wframe46']"), false, TIMEOUT);
			driver.findElement(By.xpath("//*[@id='image17']"), DEFAULT_DURATION).click();
			// 내용이 바뀔 때까지
			driver.waitUntilTextNotInclude(BY_MARK_DIVIDEND_SEARCH_DONE, TIMEOUT, textPrevious);

			// 내용 저장
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT_ETF);

			// 페이징 처리 - 여기부터
			By BY_CURRENT_PAGE = By.xpath("//div[@id='pageList1']/ul/li/a[@class='w2pageList_control_label w2pageList_label_selected']");
			By BY_NEXT_PAGE_ICON = By.xpath("//*[@id='pageList1_next_btn']/a");
			By BY_TABLE_1ST_LINE = By.xpath("//table[@id='grid1_body_table']/tbody/tr[1]");
			String currentPage = driver.getText(BY_CURRENT_PAGE, DEFAULT_DURATION, "andold"); // 현재 페이지 번호
			for(String previous1stLine = driver.getText(BY_TABLE_1ST_LINE, DEFAULT_DURATION, MARK_ANDOLD_SINCE);;) {
				WebElement table = driver.findElement(By.xpath("//*[@id='grid1_body_table']"), DEFAULT_DURATION);
				String textByJsonp = ParserService.parseTable(table);
				sb.append(textByJsonp);
				sb.append(MARK_ANDOLD_SINCE);

				// 다음 페이지 클릭
				driver.clickIfExist(BY_NEXT_PAGE_ICON);

				// 변경 확인
				driver.waitUntilTextNotInclude(BY_TABLE_1ST_LINE, TIMEOUT, previous1stLine);
				previous1stLine = driver.getText(BY_TABLE_1ST_LINE, DEFAULT_DURATION, MARK_ANDOLD_SINCE);

				String nextPage = driver.getText(BY_CURRENT_PAGE, DEFAULT_DURATION, currentPage);
				if (currentPage.equalsIgnoreCase(nextPage) || (CrawlerService.getDebug() && currentPage.equalsIgnoreCase("3"))) {
					break;
				}

				log.debug("{} 쪽:{} dividendEtf({}) - {}", Utility.indentMiddle(), currentPage, start, Utility.toStringPastTimeReadable(started));
				currentPage = nextPage;
			}
			// 페이징 처리 - 여기까지

			sb.append(MARK_START_END_POINT_ETF);
			driver.quit();

			String text = new String(sb);
			ParserResult parserResult = ParserService.parse(text, CrawlerService.getDebug());
			log.debug("{} dividendEtf(『{}』) - 『{}』", Utility.indentMiddle(), start, parserResult);
			Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.SUCCESS).result(parserResult).build();

			log.debug("{} {} dividendEtf({}) - {}", Utility.indentEnd(), result, start, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
		}

		log.debug("{} {} dividendEtf({}) - {}", Utility.indentEnd(), STATUS.EXCEPTION, start, Utility.toStringPastTimeReadable(started));
		return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
	}


}
