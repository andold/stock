package kr.andold.stock.job;

import java.io.File;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.ApplicationContextProvider;
import kr.andold.stock.crawler.CrawlerService;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.JobService;
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
public class CrawlItemIpoCloseKindJob  implements Job {
	private static final Duration DEFAULT_TIMEOUT_DURATION = Duration.ofSeconds(4);
	private static final Duration DEFAULT_TIMEOUT_DURATION_LONG = Duration.ofMinutes(1);
	// KIND > 투자유의사항 > 기타사항 > 상장폐지현황
	private static final String URL_COMPANY_EACH_SUMMARY_INFO = "https://kind.krx.co.kr/investwarn/delcompany.do?method=searchDelCompanyMain";

	@Builder.Default @Getter
	private Long timeout = 600L;
	@Getter @Setter
	private ZonedDateTime start;

	@Autowired private CrawlerService service;

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

		deque.addLast(CrawlItemIpoCloseKindJob.builder().start(date).build());
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
		if (!(job instanceof CrawlItemIpoCloseKindJob)) {
			return false;
		}

		CrawlItemIpoCloseKindJob previous = (CrawlItemIpoCloseKindJob) job;
		if (previous.getStart().isBefore(date)) {
			return true;
		}
		
		previous.setStart(date);
		return true;
	}

	@Override
	public STATUS call() throws Exception {
		log.debug("{} CrawlItemIpoCloseJob::call(『{}』)", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		CrawlItemIpoCloseKindJob that = (CrawlItemIpoCloseKindJob) ApplicationContextProvider.getBean(CrawlItemIpoCloseKindJob.class);
		that.setStart(start);
		STATUS result = that.main();

		log.debug("{} 『#{}』 CrawlItemIpoCloseJob::call() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	protected STATUS main() {
		log.debug("{} CrawlItemIpoCloseJob::main(『{}』)", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		Result<ParserResult> result = itemIpoClose(start);
		if (result.getStatus() != STATUS.SUCCESS) {
			log.debug("{} 『FAILURE::{}』 CrawlItemIpoCloseJob::main() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
			return result.getStatus();
		}

		service.put(result.getResult());

		log.debug("{} 『{}』 CrawlItemIpoCloseJob::main() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return STATUS.SUCCESS;
	}

	protected Result<ParserResult> itemIpoClose(ZonedDateTime date) {
		log.debug("{} itemIpoCloseAll()", Utility.indentStart());
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			driver.manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT_DURATION);
			driver.get(URL_COMPANY_EACH_SUMMARY_INFO);
			driver.switchTo().defaultContent();
			driver.manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT_DURATION);

			//	로딩		//*[@id="searchForm"]
			By BY_XPATH_LOADED = By.xpath("//*[@id='searchForm']");
			log.debug("{} kind(...) - 『{}』『{}』", Utility.indentMiddle(), "로딩", driver.getTextEscape(BY_XPATH_LOADED, Duration.ZERO));
			driver.findElement(BY_XPATH_LOADED, DEFAULT_TIMEOUT_DURATION_LONG);
			log.debug("{} kind(...) - 『{}』『{}』", Utility.indentMiddle(), "로딩", driver.getTextEscape(BY_XPATH_LOADED, Duration.ZERO));

			//	시작일	//*[@id="fromDate"]
			By BY_XPATH_FROM_DATE = By.xpath("//*[@id='fromDate']");
			log.debug("{} kind(...) - 『{}』『{}』", Utility.indentMiddle(), "시작일", driver.getText(BY_XPATH_FROM_DATE, Duration.ZERO));
			driver.sendKeys(BY_XPATH_FROM_DATE, Keys.chord(Keys.CONTROL, "a"));
			driver.sendKeys(BY_XPATH_FROM_DATE, date.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
			log.debug("{} kind(...) - 『{}』『{}』", Utility.indentMiddle(), "시작일", driver.getText(BY_XPATH_FROM_DATE, Duration.ZERO));

			// 전체 클릭
//			By BY_XPATH_ALL_BUTTON = By.xpath("//*[@id='search-btn-dates']/ul/li/a[@class='ord-07']");
//			log.debug("{} kind(...) - 『{}』『{}』", Utility.indentMiddle(), "전체", driver.getText(BY_XPATH_ALL_BUTTON, Duration.ZERO));
//			driver.findElement(BY_XPATH_ALL_BUTTON);
//			driver.click(BY_XPATH_ALL_BUTTON);
//			log.debug("{} kind(...) - 『{}』『{}』", Utility.indentMiddle(), "전체", driver.getText(BY_XPATH_ALL_BUTTON, Duration.ZERO));
			
			// 100건 선택, 화면 페이지를 줄이기 위해서 크게 잡는다
//			By BY_XPATH_100_SELECT = By.xpath("//select[@id='currentPageSize']");
//			log.debug("{} kind(...) - 『{}』『{}』", Utility.indentMiddle(), "100건", driver.getTextEscape(BY_XPATH_100_SELECT, Duration.ZERO));
//			new Select(driver.findElement(BY_XPATH_100_SELECT)).selectByVisibleText("100건");
//			log.debug("{} kind(...) - 『{}』『{}』", Utility.indentMiddle(), "100건", driver.getTextEscape(BY_XPATH_100_SELECT, Duration.ZERO));
			
			// 검색 클릭
			By BY_COUNT = By.xpath("//*[@id='main-contents']/section[@class='paging-group']/div[@class='info type-00']/em");
			log.debug("{} kind(...) - 『{}』『{}』", Utility.indentMiddle(), "32", driver.getText(BY_COUNT, Duration.ZERO));
			String count = driver.getText(BY_COUNT, DEFAULT_TIMEOUT_DURATION, "32");
			driver.findElement(By.xpath("//*[@id='searchForm']/section/div/div[@class='btn-group type-bt']/a[@title='검색']"), DEFAULT_TIMEOUT_DURATION).click();
			driver.waitUntilTextNotInclude(BY_COUNT, count, DEFAULT_TIMEOUT_DURATION);
			log.debug("{} kind(...) - 『{}』『{}』", Utility.indentMiddle(), "32", driver.getText(BY_COUNT, Duration.ZERO));

			Set<String> donwloadFiles = donwloadFiles(null);

			activateDownlowdExcel(driver);

			String filename = waitUntilDownloadComplete(donwloadFiles, Duration.ofSeconds(16));
			List<ItemDomain> items = parse(CrawlerService.readExcel(filename));
			ParserResult result = ParserResult.builder().items(items).build();

			driver.quit();

			log.debug("{} 『{}』 itemIpoCloseAll() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
			return Result.<ParserResult>builder().status(STATUS.SUCCESS).result(result).build();
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
		}

		Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
		log.warn("{} 『{}』 itemIpoCloseAll() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	private void activateDownlowdExcel(ChromeDriverWrapper driver) {
		//	엑셀다운로드 클릭	//*[@id="searchForm"]/section/div/div[3]/a[2]
		By BY_XPATH_EXEL_DOWNLOAD_BUTTON = By.xpath("//*[@id='searchForm']//a[@title='EXCEL']");
		log.debug("{} activateDownlowdExcel(...) - 『{}』『{}』", Utility.indentMiddle(), "엑셀다운로드", driver.getText(BY_XPATH_EXEL_DOWNLOAD_BUTTON, Duration.ZERO));
		driver.click(BY_XPATH_EXEL_DOWNLOAD_BUTTON);
//		WebElement downloadBtn = driver.findElement(BY_XPATH_EXEL_DOWNLOAD_BUTTON);
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", downloadBtn);
		
		// 개발자 도구(F12)에서 버튼의 href나 onclick에 적힌 함수 확인 후 실행
//		((JavascriptExecutor) driver).executeScript("fnDownload();");

		log.debug("{} activateDownlowdExcel(...) - 『{}』『{}』", Utility.indentMiddle(), "엑셀다운로드", driver.getText(BY_XPATH_EXEL_DOWNLOAD_BUTTON, Duration.ZERO));
	}

	private static final String DELEMETER = "[\t]";
	public static List<ItemDomain> parse(String text) {
		List<ItemDomain> list = new ArrayList<>();

		try {
			String[] lines = text.split("\n");
			if (lines == null || lines.length < 2) {
				return list;
			}

			for (int cx = 1; cx < lines.length; cx++) {
				String[] fields = lines[cx].split(DELEMETER);
				if (fields.length != 5) {
					log.info("{} INVALID::{} parse({})", Utility.indentMiddle(), fields, Utility.ellipsisEscape(lines[cx], 32, 32));
					continue;
				}

				ItemDomain item = ItemDomain.builder()
						.code(fields[2])
						.symbol(fields[1])
						.ipoClose(Utility.parseDateTime(fields[3]))
					.build();
				list.add(item);
				log.info("{} VALID::{} parse({})", Utility.indentMiddle(), fields, Utility.ellipsisEscape(lines[cx], 32, 32));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	private Set<String> donwloadFiles(Set<String> setPrevious) {
		log.trace("{} donwloadFiles({})", Utility.indentStart(), setPrevious);
		File fileLocation = new File(CrawlerService.getDownloadsDir());

		// Get the list of files in the directory
		File[] files = fileLocation.listFiles();
		if (setPrevious == null) {
			Set<String> set = new LinkedHashSet<>();
			for (File file : files) {
				set.add(file.getName());
			}

			log.trace("{} {} - donwloadFiles({})", Utility.indentEnd(), set, setPrevious);
			return set;
		}

		Set<String> set = new LinkedHashSet<>();
		for (File file : files) {
			if (setPrevious.contains(file.getName())) {
				continue;
			}
			
			set.add(file.getName());
		}

		log.trace("{} {} - donwloadFiles({})", Utility.indentEnd(), set, setPrevious);
		return set;
	}

	private String waitUntilDownloadComplete(Set<String> donwloadFiles, Duration duration) {
		log.info("{} waitUntilDownloadComplete(『{}』)", Utility.indentStart(), donwloadFiles);
		for (int cx = 0, sizex = (int) duration.toSeconds(); cx < sizex; cx++) {
			Set<String> neo  = donwloadFiles(donwloadFiles);
			
			for (String filename : neo) {
				if (filename.matches(".+\\.xls")) {
					log.info("{} 『{}』 waitUntilDownloadComplete(『{}』)", Utility.indentEnd(), filename, donwloadFiles);
					return filename;
				}
			}
			
			Utility.sleep(1000);
		}
		
		log.info("{} 『{}』 waitUntilDownloadComplete(『{}』)", Utility.indentEnd(), "", donwloadFiles);
		return "";
	}

}
