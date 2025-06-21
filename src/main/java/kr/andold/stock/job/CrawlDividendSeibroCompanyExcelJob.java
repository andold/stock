package kr.andold.stock.job;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.ApplicationContextProvider;
import kr.andold.stock.crawler.CrawlerService;
import kr.andold.stock.crawler.Seibro;
import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.DividendHistoryService;
import kr.andold.stock.service.JobService.Job;
import kr.andold.utils.ChromeDriverWrapper;
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
public class CrawlDividendSeibroCompanyExcelJob implements Job {
	private static final int TIMEOUT = 8000;
	private static final int TIMEOUT_DOWNLOAD = 256;
	// SEIBro > 주식 > 배당정보 > 배당내역전체검색
	private static final String URL_DIVIDEND_COMPANY = Seibro.URL_COMPANY;
	private static final Duration DEFAULT_TIMEOUT_DURATION = Duration.ofSeconds(8);
	private static final Duration DEFAULT_TIMEOUT_DURATION_LONG = Duration.ofMinutes(1);

	@Builder.Default @Getter @Setter private Long timeout = 600L;
	@Getter @Setter private ZonedDateTime start;

	@Autowired private DividendHistoryService service;
	
	@Override
	public STATUS call() throws Exception {
		log.debug("{} CrawlDividendSeibroCompanyExcelJob::call()", Utility.indentStart());
		long started = System.currentTimeMillis();

		CrawlDividendSeibroCompanyExcelJob that = (CrawlDividendSeibroCompanyExcelJob) ApplicationContextProvider.getBean(CrawlDividendSeibroCompanyExcelJob.class);
		that.setStart(start);
		STATUS result = that.main();

		log.debug("{} 『#{}』 CrawlDividendSeibroCompanyExcelJob::call() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	// 배당내역전체검색
	protected STATUS main() {
		log.debug("{} CrawlDividendSeibroCompanyExcelJob::main()", Utility.indentStart());
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			// navigate
			navigate(driver);
			inquire(driver);
			String filename = downloadExcel(driver);
			String text = readExcel(filename);
			List<DividendHistoryDomain> dividends = parseLines(text);
			CrudList<DividendHistoryDomain> crud = service.put(dividends);
			propergate(crud);
			driver.quit();

			log.debug("{} 『{}』 CrawlDividendSeibroCompanyExcelJob::main() - {}", Utility.indentEnd(), crud, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		} catch (Exception e) {
			driver.quit();
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		log.debug("{} 『{}』 CrawlDividendSeibroCompanyExcelJob::main() - {}", Utility.indentEnd(), STATUS.EXCEPTION, Utility.toStringPastTimeReadable(started));
		return STATUS.EXCEPTION;
	}

	private void propergate(CrudList<DividendHistoryDomain> crud) {
		log.debug("{} propergate(『{}』)", Utility.indentStart(), crud);

		log.debug("{} propergate(『{}』)", Utility.indentEnd(), crud);
	}

	private static final String DELEMETER = "[\t]";
	public static List<DividendHistoryDomain> parseLines(String text) {
		log.debug("{} parseLines(『{}』)", Utility.indentStart(), Utility.ellipsisEscape(text, 64));

		List<DividendHistoryDomain> dividends = new ArrayList<>();
		String[] lines = text.split("\n");
		if (lines == null || lines.length < 3) {
			log.debug("{} 『INVALID DATA::{}』 parseLines(『{}』, 『{}』)", Utility.indentEnd(), Utility.size(dividends), Utility.ellipsis(text, 32));
			return dividends;
		}

		String[] heads = lines[0].split("\t");
		int indexBase = 0;
		int indexPay = 1;
		int indexCode = 0;
		for (int cx = 0; cx < heads.length; cx++) {
			if (heads[cx].endsWith("종목코드")) {
				indexCode = cx;
				break;
			}
		}
		int indexDividend = 0;
		for (int cx = 0; cx < heads.length; cx++) {
			if ("주당배당금".equalsIgnoreCase(heads[cx])) {
				indexDividend = cx;
				break;
			}
		}
		log.debug("{} 『{}』『{}』 parseLines(『{}』)", Utility.indentMiddle(), heads[indexCode], heads[indexDividend], Utility.ellipsisEscape(text, 64));

		for (int cx = 2; cx < lines.length; cx++) {
			String[] words = lines[cx].split(DELEMETER);
			if (words == null || words.length <= indexDividend) {
				log.debug("{} 『INVALID::{}』 parseLines()", Utility.indentMiddle(), Utility.ellipsisEscape(lines[cx], 32));
				continue;
			}
			if (words[indexCode].isBlank()) {
				log.debug("{} 『BLANK::{}』 parseLines(『{}』)", Utility.indentMiddle(), Utility.ellipsisEscape(lines[cx], 32));
				continue;
			}
			if (words[indexDividend].isBlank()) {
				log.trace("{} 『BLANK::{}』 parseLines(『{}』)", Utility.indentMiddle(), Utility.ellipsisEscape(lines[cx], 32));
				continue;
			}
			log.debug("{} 『{}』『{}:{}』『{}』 parseLines()", Utility.indentMiddle(), words[indexCode], words[indexBase], words[indexPay], words[indexDividend]);

			DividendHistoryDomain dividend = DividendHistoryDomain.builder()
					.code(words[indexCode])
					.base(Utility.parseDateTime(words[indexBase]))
					.pay(Utility.parseDateTime(words[indexPay]))
					.dividend(Integer.parseInt(words[indexDividend].replaceAll("(,)|(\\.[0-9]+)", "")))
					.build();
			dividends.add(dividend);
			//log.debug("{} 『{}/{}』『{}』『{}』『{}』", Utility.indentMiddle(), cx, lines.length, date, price, lines[cx]);
		}

		log.debug("{} 『{}』 parseLines(『{}』)", Utility.indentEnd(), Utility.size(dividends), Utility.ellipsisEscape(text, 32));
		return dividends;
	}

	private String readExcel(String filename) throws IOException {
		log.debug("{} readExcel(『{}』)", Utility.indentStart(), filename);

		String fullPath = String.format("%s/Downloads/%s", System.getProperty("user.home"), filename);
		File file = new File(fullPath);
		Document doc = Jsoup.parse(file);
		String text = Utility.extractStringFromHtmlElement(doc);

		log.debug("{} 『{}』 readExcel(『{}』)", Utility.indentEnd(), Utility.ellipsisEscape(text, 256, 256), filename);
		return text;
	}

	private String downloadExcel(ChromeDriverWrapper driver) throws Exception {
		log.debug("{} 배당내역전체검색:downloadExcel(...)", Utility.indentStart());

		Set<String> donwloadFiles = donwloadFiles(driver, null);
		log.debug("{} download(...) - 『{}』 『{}』", Utility.indentMiddle(), "donwloadFiles", donwloadFiles);

		// 엑셀 다운로드	//*[@id="ExcelDownload_a"]
		By BY_XPATH_EXCEL_DOWNLOAD = By.xpath("//*[@id='ExcelDownload_a']");
		log.debug("{} 배당내역전체검색:downloadExcel(...) - 『{}』 『{}』", Utility.indentMiddle(), "엑셀 다운로드", driver.getText(BY_XPATH_EXCEL_DOWNLOAD, Duration.ZERO));
		driver.presenceOfElementLocated(BY_XPATH_EXCEL_DOWNLOAD, DEFAULT_TIMEOUT_DURATION);
		driver.scrollTo(BY_XPATH_EXCEL_DOWNLOAD);
		Utility.sleep(1000);
		driver.clickIfExist(BY_XPATH_EXCEL_DOWNLOAD);
		log.debug("{} 배당내역전체검색:downloadExcel(...) - 『{}』 『{}』", Utility.indentMiddle(), "엑셀 다운로드", driver.getText(BY_XPATH_EXCEL_DOWNLOAD, Duration.ZERO));
		
		log.debug("{} 배당내역전체검색:downloadExcel(...) - 『{}』 『{}』", Utility.indentMiddle(), "current window", driver.getWindowHandle());
		String filename = waitUntilDownloadComplete(driver, donwloadFiles);
		log.debug("{} 배당내역전체검색:downloadExcel(...) - 『{}』 『{}』", Utility.indentMiddle(), "filename", filename);

		driver.switchTo().defaultContent();

		log.debug("{} 『{}』 배당내역전체검색:downloadExcel(...)", Utility.indentEnd(), filename);
		return filename;
	}

	private String waitUntilDownloadComplete(ChromeDriverWrapper driver, Set<String> donwloadFiles) {
		log.info("{} waitUntilDownloadComplete(『{}』)", Utility.indentStart(), donwloadFiles);
		long started = System.currentTimeMillis();

		for (int cx = 0; cx < TIMEOUT_DOWNLOAD; cx++) {
			Set<String> neo = donwloadFiles(driver, donwloadFiles);
			if (cx % 8 == 0) {
				log.info("{} 『{}/{}:{}』 waitUntilDownloadComplete(『{}』) - {}", Utility.indentMiddle(), cx, TIMEOUT_DOWNLOAD, neo, donwloadFiles, Utility.toStringPastTimeReadable(started));
			}
			
			for (String filename : neo) {
				if (filename.matches("((.+(\\([0-9]+\\))?\\.xls)|(download( \\([0-9]+\\))?))")) {
					log.info("{} 『{}』 waitUntilDownloadComplete(『{}』) - {}", Utility.indentEnd(), filename, donwloadFiles, Utility.toStringPastTimeReadable(started));
					return filename;
				}
			}
			
			Utility.sleep(1000);
		}
		
		log.info("{} 『{}』 waitUntilDownloadComplete(『{}』) - {}", Utility.indentEnd(), "", donwloadFiles, Utility.toStringPastTimeReadable(started));
		return "";
	}

	private Set<String> donwloadFiles(ChromeDriverWrapper driver, Set<String> setPrevious) {
		log.trace("{} donwloadFiles(..., {})", Utility.indentStart(), setPrevious);
		File fileLocation = new File(String.format("%s/Downloads", System.getProperty("user.home")));

		// Get the list of files in the directory
		File[] files = fileLocation.listFiles();
		if (setPrevious == null) {
			Set<String> set = new LinkedHashSet<>();
			for (File file : files) {
				set.add(file.getName());
			}

			log.trace("{} {} - donwloadFiles(..., {})", Utility.indentEnd(), set, setPrevious);
			return set;
		}

		Set<String> set = new LinkedHashSet<>();
		for (File file : files) {
			if (setPrevious.contains(file.getName())) {
				continue;
			}
			
			set.add(file.getName());
		}

		log.trace("{} {} - donwloadFiles(..., {})", Utility.indentEnd(), set, setPrevious);
		return set;
	}

	private void inquire(ChromeDriverWrapper driver) throws Exception {
		log.debug("{} inquire(...)", Utility.indentStart());

		// option settings
		// 시작일 입력
		By BY_XPATH_START_DATE = By.xpath("//*[@id='inputCalendar1_input']");
		log.debug("{} 배당내역전체검색:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "시작일", driver.getText(BY_XPATH_START_DATE, Duration.ZERO));
		WebElement startElement = driver.findElement(BY_XPATH_START_DATE, DEFAULT_TIMEOUT_DURATION);
		startElement.clear();
		startElement.sendKeys(start.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
		startElement.sendKeys(Keys.TAB); // 시작일 입력
		log.debug("{} 배당내역전체검색:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "시작일", driver.getText(BY_XPATH_START_DATE, Duration.ZERO));

		// 검색결과 테이블 첫번째 셀	//*[@id="grid1_cell_0_0"]
		By BY_XPATH_FIRST_CELL_SEARCHED = By.xpath("//*[@id='grid1_cell_0_0']");
		log.debug("{} 배당내역전체검색:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "검색결과", driver.getText(BY_XPATH_FIRST_CELL_SEARCHED, Duration.ZERO));
		driver.setText(BY_XPATH_FIRST_CELL_SEARCHED, Double.toString(Math.random()), TIMEOUT);
		log.debug("{} 배당내역전체검색:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "검색결과", driver.getText(BY_XPATH_FIRST_CELL_SEARCHED, Duration.ZERO));

		// 조회	//*[@id="group57"]
		By BY_XPATH_INQUIRE = By.xpath("//*[@id='group57']");
		log.debug("{} 배당내역전체검색:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "조회", driver.getText(BY_XPATH_INQUIRE, Duration.ZERO));
		driver.presenceOfElementLocated(BY_XPATH_INQUIRE, DEFAULT_TIMEOUT_DURATION);
		driver.clickIfExist(BY_XPATH_INQUIRE);
		log.debug("{} 배당내역전체검색:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "조회", driver.getText(BY_XPATH_INQUIRE, Duration.ZERO));

		// 결과
		log.debug("{} 배당내역전체검색:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "검색결과", driver.getText(BY_XPATH_FIRST_CELL_SEARCHED, Duration.ZERO));
		driver.waitUntilTextMatch(BY_XPATH_FIRST_CELL_SEARCHED, "[0-9]+/[0-9]+/[0-9]+");
		log.debug("{} 배당내역전체검색:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "검색결과", driver.getText(BY_XPATH_FIRST_CELL_SEARCHED, Duration.ZERO));
		
		// LOADING //*[@id="___processbar2_i"]
		By BY_XPATH_LOADING = By.xpath("//*[@id='___processbar2_i']");
		log.debug("{} 배당내역전체검색:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "LOADING", driver.getText(BY_XPATH_LOADING, Duration.ZERO));
		driver.waitUntilIsDisplayed(BY_XPATH_LOADING, false, TIMEOUT);

		log.debug("{} inquire(...)", Utility.indentEnd());
	}

	private void navigate(ChromeDriverWrapper driver) {
		log.debug("{} navigate(...)", Utility.indentStart());

		driver.manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT_DURATION_LONG);
		driver.navigate().to(URL_DIVIDEND_COMPANY);

		// footer
		By BY_XPATH_MARK = By.xpath("//*[@id='footer']");
		log.debug("{} navigate(...) - 『{}』 『{}』", Utility.indentMiddle(), "footer", Utility.ellipsisEscape(driver.getText(BY_XPATH_MARK, Duration.ZERO), 32, 32));
		driver.presenceOfElementLocated(BY_XPATH_MARK, DEFAULT_TIMEOUT_DURATION);
		log.debug("{} navigate(...) - 『{}』 『{}』", Utility.indentMiddle(), "footer", Utility.ellipsisEscape(driver.getText(BY_XPATH_MARK, Duration.ZERO), 32, 32));

		log.debug("{} navigate(...)", Utility.indentEnd());
	}

}
