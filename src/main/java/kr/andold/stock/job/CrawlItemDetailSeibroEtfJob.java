package kr.andold.stock.job;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.ApplicationContextProvider;
import kr.andold.stock.crawler.CrawlerService;
import kr.andold.stock.crawler.Seibro;
import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.ItemService;
import kr.andold.stock.service.JobService;
import kr.andold.stock.service.ParserService;
import kr.andold.stock.service.JobService.Job;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.utils.ChromeDriverWrapper;
import kr.andold.utils.Utility;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CrawlItemDetailSeibroEtfJob implements Job {
	@Getter private Long timeout = 600L;	//	TimeUnit.SECONDS
	@Getter private Map<String, ZonedDateTime> map = new HashMap<>();	//	Map<종목코드, 배당일>

	@Autowired private ItemService itemService;

	@Override
	public STATUS call() throws Exception {
		log.trace("{} call({})", Utility.indentStart(), Utility.size(map));
		long started = System.currentTimeMillis();

		STATUS result = main();
		
		log.trace("{} 『#{}』 call() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	public static void regist(ConcurrentLinkedDeque<Job> deque, String code) {
		if (containsOrModify(JobService.getQueue0(), code)) {
			return;
		}
		if (containsOrModify(JobService.getQueue1(), code)) {
			return;
		}
		if (containsOrModify(JobService.getQueue2(), code)) {
			return;
		}
		if (containsOrModify(JobService.getQueue3(), code)) {
			return;
		}

		CrawlItemDetailSeibroEtfJob job = (CrawlItemDetailSeibroEtfJob) ApplicationContextProvider.getBean(CrawlItemDetailSeibroEtfJob.class);
		job.containsOrModify(code);
		deque.addLast(job);
	}

	private static boolean containsOrModify(ConcurrentLinkedDeque<Job> deque, String code) {
		for (Job job : deque) {
			if (containsOrModify(job, code)) {
				return true;
			}
		}
		return false;
	}

	private static boolean containsOrModify(Job job, String code) {
		if (!(job instanceof CrawlItemDetailSeibroEtfJob)) {
			return false;
		}

		CrawlItemDetailSeibroEtfJob previous = (CrawlItemDetailSeibroEtfJob) job;
		return previous.containsOrModify(code);
	}

	private boolean containsOrModify(String code) {
		if (code == null) {
			return true;
		}

		map.put(code, ZonedDateTime.now());
		return true;
	}

	private STATUS main() throws Exception {
		log.info("{} main#{})", Utility.indentStart(), Utility.size(map));
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = null;
		try {
			driver = CrawlerService.defaultChromeDriver();
			driver.manage().timeouts().implicitlyWait(Seibro.DEFAULT_DURATION);

			double threshold = 128.0 / map.size();
			for (String code : map.keySet()) {
				if (Math.random() > threshold) {
					continue;
				}

				Result<ParserResult> itemResult = itemEtf(driver, code);
				if (itemResult.getStatus() == STATUS.SUCCESS) {
					itemService.put(itemResult.getResult().getItems());
					continue;
				}
			}

			driver.quit();

			log.info("{} 『{}』 main() - {}", Utility.indentEnd(), STATUS.SUCCESS, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		if (driver != null) {
			driver.quit();
		}

		log.info("{} 『{}』 main() - {}", Utility.indentEnd(), STATUS.SUCCESS, Utility.toStringPastTimeReadable(started));
		return STATUS.SUCCESS;
	}

	// SEIBro > ETF > ETF종합정보 > 종목상세
	protected Result<ParserResult> itemEtf(ChromeDriverWrapper driver, String code) {
		log.debug("{} 종목상세::itemEtf({})", Utility.indentStart(), code);
		long started = System.currentTimeMillis();

		if (code == null) {
			return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
		}

		try {
			// 화면 열기
			driver.navigate().to(Seibro.URL_ETF_EACH_SUMMARY_INFO);
			
			// 화면이 표시될 때까지
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='___processbar2']"), false, Seibro.TIMEOUT * 4);	// 진행중 화면은 지워지고

			Seibro.clickShowWideIcon(driver);	// 넓게보기

			// 여러개의 검색결과일 경우에 하나씩 확인해 보기 위해서
			for (int cx = 0; cx < 4; cx++) {
				driver.switchTo().defaultContent();
				driver.mouseHover(By.xpath("//*[@id='common']"));

				// 종목명 검색 아이콘 클릭
				By BY_SEARCH_CODE_ICON = By.xpath("//div[@id='content']//a[@id='sn_group4']/img");
				log.debug("{} 종목상세::itemEtf(..., 『{}』) - 『{}』『{}』", Utility.indentMiddle(), code, "검색", driver.getText(BY_SEARCH_CODE_ICON, Duration.ZERO));
				driver.waitUntilIsDisplayed(By.xpath("//div[@id='group239']"), false, Seibro.TIMEOUT);
				driver.presenceOfElementLocated(BY_SEARCH_CODE_ICON);
				driver.click(BY_SEARCH_CODE_ICON);
				log.debug("{} 종목상세::itemEtf(..., 『{}』) - 『{}』『{}』", Utility.indentMiddle(), code, "검색", driver.getText(BY_SEARCH_CODE_ICON, Duration.ZERO));

				//	FRAME
				By BY_FRAME_ETF = By.xpath("//iframe[@id='iframeEtfnm']");
				log.debug("{} 종목상세::itemEtf(..., 『{}』) - 『{}』『{}』", Utility.indentMiddle(), code, "FRAME", driver.getText(BY_FRAME_ETF, Duration.ZERO));
				driver.waitUntilExist(BY_FRAME_ETF, true, Seibro.DEFAULT_DURATION);
				log.debug("{} 종목상세::itemEtf(..., 『{}』) - 『{}』『{}』", Utility.indentMiddle(), code, "FRAME", driver.getText(BY_FRAME_ETF, Duration.ZERO));

				driver.frame(BY_FRAME_ETF, Seibro.DEFAULT_DURATION);

				// 코드 입력
				By BY_SEARCH_STRING_INPUT = By.xpath("//input[@id='search_string']");
				log.debug("{} 종목상세::itemEtf(..., 『{}』) - 『{}』『{}』", Utility.indentMiddle(), code, "코드", driver.getText(BY_SEARCH_STRING_INPUT, Duration.ZERO));
				driver.presenceOfElementLocated(BY_SEARCH_STRING_INPUT);
				log.debug("{} 종목상세::itemEtf(..., 『{}』) - 『{}』『{}』", Utility.indentMiddle(), code, "코드", driver.getText(BY_SEARCH_STRING_INPUT, Duration.ZERO));

				WebElement inputSearchElement = driver.findElement(BY_SEARCH_STRING_INPUT);	// 입력창
				inputSearchElement.clear();
				inputSearchElement.sendKeys(code);
				log.debug("{} 종목상세::itemEtf({}) - 『{}』『{}』", Utility.indentMiddle(), code, "입력창", driver.getText(BY_SEARCH_STRING_INPUT, Duration.ZERO));

				// 검색 아이콘 클릭
				// 진행중 메시지가 없어질때까지
				By BY_SEARCH_RESULT_COUNT = By.xpath("//span[@id='P_ListCnt']");
				log.debug("{} 종목상세::itemEtf(..., 『{}』) - 『{}』『{}』", Utility.indentMiddle(), code, "검색COUNT", driver.getText(BY_SEARCH_RESULT_COUNT, Duration.ZERO));
				String INVALID_COUNT = "abc";
				driver.waitUntilIsDisplayed(By.xpath("//div[@id='___processbar2']"), false, Seibro.TIMEOUT);
				driver.setText(BY_SEARCH_RESULT_COUNT, INVALID_COUNT, Seibro.TIMEOUT);
				log.debug("{} 종목상세::itemEtf(..., 『{}』) - 『{}』『{}』", Utility.indentMiddle(), code, "검색COUNT", driver.getText(BY_SEARCH_RESULT_COUNT, Duration.ZERO));

				//	아이콘
				By BY_SEARCH_RESULT_ICON = By.xpath("//a[@id='group236']");
				log.debug("{} 종목상세::itemEtf(..., 『{}』) - 『{}』『{}』", Utility.indentMiddle(), code, "아이콘", driver.getText(BY_SEARCH_RESULT_ICON, Duration.ZERO));
				driver.click(BY_SEARCH_RESULT_ICON, Seibro.DEFAULT_DURATION);
				driver.waitUntilTextMatch(BY_SEARCH_RESULT_ICON, "[0-9]+", Seibro.DEFAULT_DURATION);
				log.debug("{} 종목상세::itemEtf(..., 『{}』) - 『{}』『{}』", Utility.indentMiddle(), code, "아이콘", driver.getText(BY_SEARCH_RESULT_ICON, Duration.ZERO));
				log.debug("{} 종목상세::itemEtf(..., 『{}』) - 『{}』『{}』", Utility.indentMiddle(), code, "검색COUNT", driver.getText(BY_SEARCH_RESULT_COUNT, Duration.ZERO));

				// 검색 결과
				By BY_CODE_SEARCH_RESULT = By.xpath("//ul[@id='contentsList']/li/a");
				log.debug("{} 종목상세::itemEtf(..., 『{}』) - 『{}』『{}』", Utility.indentMiddle(), code, "검색 결과", driver.getText(BY_CODE_SEARCH_RESULT, Duration.ZERO));
				List<WebElement> resultSearch = driver.findElements(BY_CODE_SEARCH_RESULT, Duration.ZERO);
				log.debug("{} 종목상세::itemEtf(..., 『{}』) - 『{}』『{}』", Utility.indentMiddle(), code, "검색 결과", driver.getText(BY_CODE_SEARCH_RESULT, Duration.ZERO));
				if (resultSearch.size() <= cx) {
					Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.FAIL_NO_RESULT).build();

					log.debug("{} 『{}』 종목상세::itemEtf({}) - {}", Utility.indentEnd(), result, code, Utility.toStringPastTimeReadable(started));
					return result;
				}
				
				// 선택
				resultSearch.get(cx).click();

				driver.switchTo().defaultContent();
				driver.mouseHover(By.xpath("//*[@id='common']"));

				// 조회	//*[@id="group137"]
				By BY_SHOW_DETAIL = By.xpath("//*[@id='group137']");
				log.debug("{} 종목상세::itemEtf(..., 『{}』) - 『{}』『{}』", Utility.indentMiddle(), code, "조회", driver.getText(BY_SHOW_DETAIL, Duration.ZERO));
				driver.presenceOfElementLocated(BY_SHOW_DETAIL, Seibro.DEFAULT_DURATION_LONG);
				driver.clickIfExist(BY_SHOW_DETAIL);
				log.debug("{} 종목상세::itemEtf(..., 『{}』) - 『{}』『{}』", Utility.indentMiddle(), code, "조회", driver.getText(BY_SHOW_DETAIL, Duration.ZERO));
				
				// 제목에 코드가 있으면, 성공
				By BY_KOR_SECN_NM = By.xpath("//h3[@id='KOR_SECN_NM']");
				log.debug("{} 종목상세::itemEtf(..., 『{}』) - 『{}』『{}』", Utility.indentMiddle(), code, "제목에 코드", driver.getText(BY_KOR_SECN_NM, Duration.ZERO));
				if (driver.waitUntilTextInclude(BY_KOR_SECN_NM, Seibro.TIMEOUT, code)) {
					log.debug("{} 종목상세::itemEtf(..., 『{}』) - 『{}』『{}』", Utility.indentMiddle(), code, "제목에 코드", driver.getText(BY_KOR_SECN_NM, Duration.ZERO));
					break;
				}
				log.debug("{} 종목상세::itemEtf(..., 『{}』) - 『{}』『{}』", Utility.indentMiddle(), code, "제목에 코드", driver.getText(BY_KOR_SECN_NM, Duration.ZERO));
			}

			StringBuffer sb = new StringBuffer();
			sb.append(Seibro.MARK_START_END_POINT_ETF_EACH_SUMMARY_INFO);

			sb.append(String.format("KEYWORD\t%s\t%s\n", code, driver.findElementIncludeText(By.xpath("//h3[@id='KOR_SECN_NM']"), Seibro.TIMEOUT, code).getText()));
			sb.append(String.format("%s\n", driver.findElementIncludeText(By.xpath("//h3[@id='KOR_SECN_NM']"), Seibro.TIMEOUT, code).getText()));	// symbol
			sb.append(String.format("%s\n", driver.findElement(By.xpath("//div[@id='ETF_BIG_SORT_NM']"), Seibro.DEFAULT_DURATION).getText()));	// 분류
			sb.append(String.format("%s\n", driver.findElement(By.xpath("//span[@id='SETUP_DT']"), Seibro.DEFAULT_DURATION).getText()));	// 설정일
			sb.append(String.format("%s\n", driver.getText(By.xpath("//*[@id='grid1_cell_0_3']/nobr"), Seibro.DEFAULT_DURATION, "-1")));	// 총발행주식수
			sb.append(String.format("%s\n", driver.findElement(By.xpath("//dd[@id='TOT_RECM_RATE']"), Seibro.DEFAULT_DURATION).getText()));	// 보수(%)

			sb.append(Seibro.MARK_ANDOLD_SINCE);
			sb.append(Seibro.MARK_START_END_POINT_ETF_EACH_SUMMARY_INFO);
			ParserResult result = ParserService.parse(sb.toString(), false);

			log.debug("{} 『{}』 종목상세::itemEtf(..., 『{}』) - {}", Utility.indentEnd(), result, code, Utility.toStringPastTimeReadable(started));
			return Result.<ParserResult>builder().status(STATUS.SUCCESS).result(result).build();
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
		log.warn("{} 『{}』 종목상세::itemEtf(..., 『{}』) - {}", Utility.indentEnd(), result, code, Utility.toStringPastTimeReadable(started));
		return result;
	}

}
