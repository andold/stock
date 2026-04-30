package kr.andold.stock.job;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.HashMap;
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
public class CrawlItemDetailSeibroCompanyJob implements Job {
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

		CrawlItemDetailSeibroCompanyJob job = (CrawlItemDetailSeibroCompanyJob) ApplicationContextProvider.getBean(CrawlItemDetailSeibroCompanyJob.class);
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
		if (!(job instanceof CrawlItemDetailSeibroCompanyJob)) {
			return false;
		}

		CrawlItemDetailSeibroCompanyJob previous = (CrawlItemDetailSeibroCompanyJob) job;
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
		log.info("{} main(#{})", Utility.indentStart(), Utility.size(map));
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			double threshold = 128.0 / map.size();
			for (String code : map.keySet()) {
				if (Math.random() > threshold) {
					continue;
				}

				Result<ParserResult> itemResult = itemCompany(driver, code);
				if (itemResult.getStatus() == STATUS.SUCCESS) {
					itemService.put(itemResult.getResult().getItems());
					continue;
				}
				
				CrawlItemDetailSeibroEtfJob.regist(JobService.getQueue3(), code);
			}
			
			driver.quit();
			log.info("{} 『{}』 main() - {}", Utility.indentEnd(), STATUS.SUCCESS, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		driver.quit();
		log.info("{} 『{}』 main() - {}", Utility.indentEnd(), STATUS.EXCEPTION, Utility.toStringPastTimeReadable(started));
		return STATUS.EXCEPTION;
	}

	// SEIBro > 주식 > 종목별상세정보 > 종목종합내역
	protected Result<ParserResult> itemCompany(ChromeDriverWrapper driver, String code) {
		log.debug("{} 종목종합내역::itemCompany({})", Utility.indentStart(), code);
		long started = System.currentTimeMillis();

		if (code == null) {
			return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
		}

		try {
			driver.navigate().to(Seibro.URL_COMPANY_EACH_SUMMARY_INFO);

			// 진행중 화면이 없어지고
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='___processbar2']"), false, Seibro.TIMEOUT * 4);
			// 종목명 검색 아이콘이 보이고
			driver.waitUntilIsDisplayed(By.xpath("//img[@id='sn_image1']"), true, Seibro.TIMEOUT * 4);

			// 종목명 검색 클릭
			driver.findElement(By.xpath("//img[@id='sn_image1']"), Seibro.DEFAULT_DURATION).click(); // 종목명 검색 아이콘

			// 프래임
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframe1']"), Seibro.DEFAULT_DURATION));

			//	코드입력
			WebElement inputSearchElement = driver.findElement(By.xpath("//input[@id='search_string']"), Seibro.DEFAULT_DURATION);	// 입력창
			inputSearchElement.clear();
			inputSearchElement.sendKeys(code); // 코드 입력

			// 종목명 검색 아이콘 클릭
			// 진행중 메시지가 없어질때까지
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='___processbar2']"), false, Seibro.TIMEOUT);

			By BY_SEARCH_RESULT_COUNT = By.xpath("//span[@id='P_ListCnt']");
			String INVALID_COUNT = "-1";
			driver.setText(BY_SEARCH_RESULT_COUNT, INVALID_COUNT, Seibro.TIMEOUT);
			driver.findElement(By.xpath("//a[@id='P_group100']"), Seibro.DEFAULT_DURATION).click(); // 종목명 검색 아이콘
			driver.waitUntilTextNotInclude(BY_SEARCH_RESULT_COUNT, Seibro.TIMEOUT, INVALID_COUNT);

			//	검색 결과에서 선택
			String count = driver.getText(BY_SEARCH_RESULT_COUNT, Seibro.DEFAULT_DURATION, "0");
			if ("0".contentEquals(count)) {
				Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.FAIL_NO_RESULT).build();
				log.debug("{} 『{}』 종목종합내역::itemCompany({}) - {}", Utility.indentEnd(), result, code, Utility.toStringPastTimeReadable(started));
				return result;
			}

			//	검색 결과에서 선택
			By BY_SEARCH_CODE_RESULT = By.xpath("//ul[@id='P_isinList']/li/a/span[text()='" + code + "']");
			log.debug("{} 종목종합내역::itemCompany(..., 『{}』) - 『{}』『{}』", Utility.indentMiddle(), code, "검색 결과", driver.getText(BY_SEARCH_CODE_RESULT, Duration.ZERO));
			if (!driver.isPresence(BY_SEARCH_CODE_RESULT, Seibro.DEFAULT_DURATION)) {
				Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.FAIL_NO_RESULT).build();
				log.debug("{} 『NO_CODE::{}』 종목종합내역::itemCompany({}) - {}", Utility.indentEnd(), result, code, Utility.toStringPastTimeReadable(started));
				return result;
			}
			driver.click(BY_SEARCH_CODE_RESULT);
			log.debug("{} 종목종합내역::itemCompany(..., 『{}』) - 『{}』『{}』", Utility.indentMiddle(), code, "검색 결과", driver.getText(BY_SEARCH_CODE_RESULT, Duration.ZERO));

			//	팝업이 닫혔다, 돌아간다
			driver.switchTo().defaultContent();

			// 조회	//*[@id="group94"]
			By BY_SHOW_DETAIL = By.xpath("//*[@id='group94']");
			log.debug("{} 종목종합내역::itemCompany({}) - {}", Utility.indentMiddle(), code, "조회", driver.getText(BY_SHOW_DETAIL, Duration.ZERO));
			driver.presenceOfElementLocated(BY_SHOW_DETAIL, Seibro.DEFAULT_DURATION_LONG);
			driver.click(BY_SHOW_DETAIL);
			log.debug("{} 종목종합내역::itemCompany({}) - {}", Utility.indentMiddle(), code, "조회", driver.getText(BY_SHOW_DETAIL, Duration.ZERO));

			// 조회결과 바뀐거 확인
			driver.waitUntilTextInclude(By.xpath("//h3[@id='h3_tit_01']"), Seibro.TIMEOUT * 4, code);

			//	내용 저장
			StringBuffer sb = new StringBuffer();
			sb.append(Seibro.MARK_START_END_POINT_COMPANY_EACH_SUMMARY_INFO);

			sb.append(String.format("KEYWORD\t%s\t%s\t%s\n", code, driver.getText(By.xpath("//p[@id='btn_item']"), Seibro.DEFAULT_DURATION, "모름"), driver.getText(By.xpath("//h3[@id='h3_tit_01']"), Seibro.DEFAULT_DURATION, "종목명")));	// 종목명
			String category = driver.findElement(By.xpath("//dd[@id='item_add_info_left_01_dd']"), Seibro.DEFAULT_DURATION).getText();
			if (category.isBlank()) {
				sb.append(String.format("KEYWORD\t\"%s\"\n", "미분류"));	// 표준산업분류
			} else {
				sb.append(String.format("KEYWORD\t\"%s\"\n", category));	// 표준산업분류
			}
			String fics = driver.findElement(By.xpath("//dd[@id='FICS']"), Seibro.DEFAULT_DURATION).getText();
			if (fics.isBlank()) {
				sb.append(String.format("KEYWORD\t\"%s\"\n", "미분류"));	// FICS
			} else {
				sb.append(String.format("KEYWORD\t\"%s\"\n", fics));	// FICS
			}
			sb.append(String.format("KEYWORD\t%s\n", driver.findElement(By.xpath("//dd[@id='ISSU_SCHD_STKQTY']"), Seibro.DEFAULT_DURATION).getText()));	//	// 발행주식총수
			sb.append(String.format("KEYWORD\t%s\n", driver.findElement(By.xpath("//dd[@id='APLI_DT']"), Seibro.DEFAULT_DURATION).getText()));	// 상장일
			sb.append(String.format("KEYWORD\t%s\n", driver.findElement(By.xpath("//dd[@id='DLIST_DT']"), Seibro.DEFAULT_DURATION).getText()));	// 상장폐지일

			sb.append(Seibro.MARK_ANDOLD_SINCE);
			sb.append(Seibro.MARK_START_END_POINT_COMPANY_EACH_SUMMARY_INFO);
			ParserResult result = ParserService.parse(new String(sb), CrawlerService.getDebug());

			log.debug("{} 『{}』 종목종합내역::itemCompany({}) - {}", Utility.indentEnd(), result, code, Utility.toStringPastTimeReadable(started));
			return Result.<ParserResult>builder().status(STATUS.SUCCESS).result(result).build();
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
		log.warn("{} 『{}』 종목종합내역::itemCompany({}) - {}", Utility.indentEnd(), result, code, Utility.toStringPastTimeReadable(started));
		return result;
	}

}
