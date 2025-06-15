package kr.andold.stock.job;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
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
public class CrawlPriceLatestSeibroCompanyExcelJob implements Job {
	private static final int TIMEOUT = 8000;
	private static final int TIMEOUT_DOWNLOAD = 256;
	// SEIBro > 주식 > 종목전체검색 > 주식종목전체검색
	private static final String URL_PRICE_COMPANY_CURRENT = Seibro.URL_PRICE_COMPANY_CURRENT;
	private static final Duration DEFAULT_TIMEOUT_DURATION = Duration.ofSeconds(8);
	private static final Duration DEFAULT_TIMEOUT_DURATION_LONG = Duration.ofMinutes(1);

	@Builder.Default @Getter @Setter private Long timeout = 600L;

	@Autowired private PriceService priceService;
	
	@Override
	public STATUS call() throws Exception {
		log.debug("{} CrawlPriceLatestSeibroCompanyExcelJob::call()", Utility.indentStart());
		long started = System.currentTimeMillis();

		CrawlPriceLatestSeibroCompanyExcelJob that = (CrawlPriceLatestSeibroCompanyExcelJob) ApplicationContextProvider.getBean(CrawlPriceLatestSeibroCompanyExcelJob.class);
		STATUS result = that.main();

		log.debug("{} 『#{}』 CrawlPriceLatestSeibroCompanyExcelJob::call() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	// 주식종목전체검색
	protected STATUS main() {
		log.debug("{} CrawlPriceLatestSeibroCompanyExcelJob::main()", Utility.indentStart());
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			// navigate
			navigate(driver);
			inquire(driver);
			String date = baseDate(driver);
			String filename = downloadExcel(driver);
			String text = readExcel(filename);
			List<PriceDomain> prices = parseLines(date, text);
			CrudList<PriceDomain> crud = priceService.put(prices);
			propergate(date);
			driver.quit();

			log.debug("{} 『{}』 CrawlPriceLatestSeibroCompanyExcelJob::main() - {}", Utility.indentEnd(), crud, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		} catch (Exception e) {
			driver.quit();
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		log.debug("{} 『{}』 CrawlPriceLatestSeibroCompanyExcelJob::main() - {}", Utility.indentEnd(), STATUS.EXCEPTION, Utility.toStringPastTimeReadable(started));
		return STATUS.EXCEPTION;
	}

	private void propergate(String date) {
		log.debug("{} propergate(『{}』)", Utility.indentStart(), date);

		LocalDate start = Utility.parseDateTime(date).toInstant().atZone(Utility.ZONE_ID_KST).toLocalDate();
		JobService.getQueue2().addLast(StockCompileJob.builder().start(start).build());
		JobService.getQueue2().addLast(ItemCompilePriceEarningsRatioJob.builder().build());

		log.debug("{} propergate(『{}』)", Utility.indentEnd(), date);
	}

	private static final String DELEMETER = "[\t]";
	public static List<PriceDomain> parseLines(String date, String text) {
		log.debug("{} parseLines(『{}』, 『{}』)", Utility.indentStart(), date, Utility.ellipsisEscape(text, 64));

		List<PriceDomain> prices = new ArrayList<>();
		String[] lines = text.split("\n");
		if (lines == null || lines.length < 2) {
			log.debug("{} 『INVALID DATA::{}』 parseLines(『{}』, 『{}』)", Utility.indentEnd(), Utility.size(prices), Utility.ellipsis(text, 32));
			return prices;
		}

		String[] heads = lines[0].split(DELEMETER);
		int indexCode = 0;
		for (int cx = 0; cx < heads.length; cx++) {
			if (heads[cx].endsWith("종목코드")) {
				indexCode = cx;
				break;
			}
		}
		int indexPrice = 0;
		for (int cx = 0; cx < heads.length; cx++) {
			if ("종가".equalsIgnoreCase(heads[cx])) {
				indexPrice = cx;
				break;
			}
		}
		log.debug("{} 『{}』『{}』 parseLines(『{}』, 『{}』)", Utility.indentMiddle(), heads[indexCode], heads[indexPrice], date, Utility.ellipsisEscape(text, 64));

		Date base = Utility.parseDateTime(date);
		for (int cx = 1; cx < lines.length; cx++) {
			String[] words = lines[cx].split(DELEMETER);
			if (words == null || words.length <= indexPrice) {
				log.debug("{} 『INVALID::{}』 parseLines(『{}』, ...)", Utility.indentMiddle(), Utility.ellipsisEscape(lines[cx], 32), date);
				continue;
			}
			if (words[indexCode].isBlank()) {
				log.debug("{} 『BLANK::{}』 parseLines(『{}』, ...)", Utility.indentMiddle(), Utility.ellipsisEscape(lines[cx], 32), date);
				continue;
			}
			if (words[indexPrice].isBlank()) {
				log.trace("{} 『BLANK::{}』 parseLines(『{}』, ...)", Utility.indentMiddle(), Utility.ellipsisEscape(lines[cx], 32), date);
				continue;
			}
			log.debug("{} 『{}』『{}』 parseLines(『{}』, ...)", Utility.indentMiddle(), words[indexCode], words[indexPrice], date);

			PriceDomain price = PriceDomain.builder()
					.code(words[indexCode])
					.base(base)
					.closing(Integer.parseInt(words[indexPrice].replaceAll("(,)|(\\.[0-9]+)", "")))
					.build();
			prices.add(price);
			//log.debug("{} 『{}/{}』『{}』『{}』『{}』", Utility.indentMiddle(), cx, lines.length, date, price, lines[cx]);
		}

		log.debug("{} 『{}』 parseLines(『{}』, 『{}』)", Utility.indentEnd(), Utility.size(prices), date, Utility.ellipsis(text, 32));
		return prices;
	}

	@SuppressWarnings("resource")
	private String readExcel(String filename) throws IOException {
		log.debug("{} readExcel(『{}』)", Utility.indentStart(), filename);

		String fullPath = String.format("%s/Downloads/%s", System.getProperty("user.home"), filename);
		FileInputStream file = new FileInputStream(fullPath);

		// Create Workbook instance holding reference to .xlsx file
		Workbook workbook = null;

		workbook = new XSSFWorkbook(file);
//		if (filename.endsWith("xlsx")) {
//			workbook = new XSSFWorkbook(file);
//		} else if (filename.endsWith("xls")) {
//			workbook = new HSSFWorkbook(file);
//		}
		
		// Get first/desired sheet from the workbook
		Sheet sheet = workbook.getSheetAt(0);

		StringBuffer sb = new StringBuffer();
		// Iterate through each rows one by one
		Iterator<Row> rowIterator = sheet.iterator();
		while (rowIterator.hasNext()) {
			Row row = rowIterator.next();
			// For each row, iterate through all the columns
			Iterator<Cell> cellIterator = row.cellIterator();

			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				// Check the cell type and format accordingly
				switch (cell.getCellType()) {
				case NUMERIC:
					sb.append(cell.getNumericCellValue());
					sb.append("\t");
					break;
				case STRING:
					sb.append(cell.getStringCellValue());
					sb.append("\t");
					break;
				default:
					throw new IllegalStateException("Unexpected value: " + cell.getCellType());
				}
			}
			sb.append("\n");
		}
		file.close();
		
		String text = sb.toString();

		log.debug("{} 『{}』 readExcel(『{}』)", Utility.indentEnd(), Utility.ellipsis(text, 256, 256), filename);
		return text;
	}

	private String downloadExcel(ChromeDriverWrapper driver) throws Exception {
		log.debug("{} 주식종목전체검색:downloadExcel(...)", Utility.indentStart());

		Set<String> donwloadFiles = donwloadFiles(driver, null);
		log.debug("{} download(...) - 『{}』 『{}』", Utility.indentMiddle(), "donwloadFiles", donwloadFiles);

		// 엑셀 다운로드	//*[@id="ExcelDownload_a"]
		By BY_XPATH_EXCEL_DOWNLOAD = By.xpath("//*[@id='ExcelDownload_a']");
		log.debug("{} 주식종목전체검색:downloadExcel(...) - 『{}』 『{}』", Utility.indentMiddle(), "엑셀 다운로드", driver.getText(BY_XPATH_EXCEL_DOWNLOAD, Duration.ZERO));
		driver.presenceOfElementLocated(BY_XPATH_EXCEL_DOWNLOAD, DEFAULT_TIMEOUT_DURATION);
		driver.scrollTo(BY_XPATH_EXCEL_DOWNLOAD);
		Utility.sleep(1000);
		driver.clickIfExist(BY_XPATH_EXCEL_DOWNLOAD);
		log.debug("{} 주식종목전체검색:downloadExcel(...) - 『{}』 『{}』", Utility.indentMiddle(), "엑셀 다운로드", driver.getText(BY_XPATH_EXCEL_DOWNLOAD, Duration.ZERO));
		
		// FRAME	//*[@id="gridDownLoadLayer"]
		By BY_XPATH_FRAME_DOWNLOAD = By.xpath("//*[@id='gridDownLoadLayer']");
		driver.presenceOfElementLocated(BY_XPATH_FRAME_DOWNLOAD, DEFAULT_TIMEOUT_DURATION_LONG);
		driver.switchTo().frame(driver.findElement(BY_XPATH_FRAME_DOWNLOAD, DEFAULT_TIMEOUT_DURATION_LONG));
		log.debug("{} 주식종목전체검색:downloadExcel(...) - 『{}』 『{}』", Utility.indentMiddle(), "body", driver.getText(By.xpath("//body"), Duration.ZERO));

		// download button	//*[@id="downloadButton"]
		By BY_XPATH_DOWNLOAD_BUTTON = By.xpath("//*[@id='downloadButton']");
		log.debug("{} 주식종목전체검색:downloadExcel(...) - 『{}』 『{}』", Utility.indentMiddle(), "download", driver.getText(BY_XPATH_DOWNLOAD_BUTTON, Duration.ZERO));
		driver.presenceOfElementLocated(BY_XPATH_DOWNLOAD_BUTTON, DEFAULT_TIMEOUT_DURATION);
		driver.clickIfExist(BY_XPATH_DOWNLOAD_BUTTON);
		log.debug("{} 주식종목전체검색:downloadExcel(...) - 『{}』 『{}』", Utility.indentMiddle(), "download", driver.getText(BY_XPATH_DOWNLOAD_BUTTON, Duration.ZERO));

		log.debug("{} 주식종목전체검색:downloadExcel(...) - 『{}』 『{}』", Utility.indentMiddle(), "current window", driver.getWindowHandle());
		String filename = waitUntilDownloadComplete(driver, donwloadFiles);
		log.debug("{} 주식종목전체검색:downloadExcel(...) - 『{}』 『{}』", Utility.indentMiddle(), "filename", filename);

		driver.switchTo().defaultContent();

		log.debug("{} 『{}』 주식종목전체검색:downloadExcel(...)", Utility.indentEnd(), filename);
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
				if (filename.matches("((주식종목전체검색( \\([0-9]+\\))?\\.xlsx)|(download( \\([0-9]+\\))))")) {
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

	private String baseDate(ChromeDriverWrapper driver) {
		log.debug("{} baseDate(...)", Utility.indentStart());

		By BY_XPATH_BASE_DATE = By.xpath("//*[@id='D_day1']");
		String base = driver.getText(BY_XPATH_BASE_DATE).replaceAll("기준일 : ", "");
		log.debug("{} 주식종목전체검색:baseDate() - 『{}』 『{}』", Utility.indentMiddle(), "기준일", driver.getText(BY_XPATH_BASE_DATE, Duration.ZERO));

		log.debug("{} 『{}』 - baseDate(...)", Utility.indentEnd(), base);
		return base;
	}

	private void inquire(ChromeDriverWrapper driver) {
		log.debug("{} inquire(...)", Utility.indentStart());

		// option settings
		// 시장종류:전체	//*[@id='CHECKBOX_MART_TYPE']/li/label[text()='전체']
		By BY_XPATH_MARGET_ALL = By.xpath("//*[@id='CHECKBOX_MART_TYPE']/li/label[text()='전체']");
		log.debug("{} 주식종목전체검색:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "시장종류", driver.getText(BY_XPATH_MARGET_ALL, Duration.ZERO));
		driver.presenceOfElementLocated(BY_XPATH_MARGET_ALL, DEFAULT_TIMEOUT_DURATION);
		driver.clickIfExist(BY_XPATH_MARGET_ALL);
		
		// 주식종류: 전체
		By BY_XPATH_STOCK_TYPE_ALL = By.xpath("//*[@id='CHECKBOX_SECN_TYPE_input_0']");
		log.debug("{} 주식종목전체검색:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "주식종류", driver.getText(BY_XPATH_STOCK_TYPE_ALL, Duration.ZERO));
		driver.presenceOfElementLocated(BY_XPATH_STOCK_TYPE_ALL, DEFAULT_TIMEOUT_DURATION);
		driver.clickIfExist(BY_XPATH_STOCK_TYPE_ALL);
		log.debug("{} 주식종목전체검색:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "주식종류", driver.getText(BY_XPATH_STOCK_TYPE_ALL, Duration.ZERO));

		// 검색결과(15039건)	//*[@id="totalCnt"]
		By BY_XPATH_TOTAL_COUNT_SEARCHED = By.xpath("//*[@id='totalCnt']");
		log.debug("{} 주식종목전체검색:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "검색결과", driver.getText(BY_XPATH_TOTAL_COUNT_SEARCHED, Duration.ZERO));
		driver.setText(BY_XPATH_TOTAL_COUNT_SEARCHED, Double.toString(Math.random()), TIMEOUT);
		log.debug("{} 주식종목전체검색:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "검색결과", driver.getText(BY_XPATH_TOTAL_COUNT_SEARCHED, Duration.ZERO));

		// 조회	//*[@id="image4"]
		By BY_XPATH_INQUIRE = By.xpath("//*[@id='image4']");
		log.debug("{} 주식종목전체검색:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "조회", driver.getText(BY_XPATH_INQUIRE, Duration.ZERO));
		driver.presenceOfElementLocated(BY_XPATH_INQUIRE, DEFAULT_TIMEOUT_DURATION);
		driver.clickIfExist(BY_XPATH_INQUIRE);
		log.debug("{} 주식종목전체검색:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "조회", driver.getText(BY_XPATH_INQUIRE, Duration.ZERO));

		// 결과
		log.debug("{} 주식종목전체검색:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "검색결과", driver.getText(BY_XPATH_TOTAL_COUNT_SEARCHED, Duration.ZERO));
		driver.waitUntilTextMatch(BY_XPATH_TOTAL_COUNT_SEARCHED, "\\([ 0-9]+건\\)");
		log.debug("{} 주식종목전체검색:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "검색결과", driver.getText(BY_XPATH_TOTAL_COUNT_SEARCHED, Duration.ZERO));
		
		// LOADING //*[@id="___processbar2_i"]
		By BY_XPATH_LOADING = By.xpath("//*[@id='___processbar2_i']");
		log.debug("{} 주식종목전체검색:inquire(...) - 『{}』 『{}』", Utility.indentMiddle(), "LOADING", driver.getText(BY_XPATH_LOADING, Duration.ZERO));
		driver.waitUntilIsDisplayed(BY_XPATH_LOADING, false, TIMEOUT);

		log.debug("{} inquire(...)", Utility.indentEnd());
	}

	// 주식종목전체검색
	private void navigate(ChromeDriverWrapper driver) {
		log.debug("{} navigate(...)", Utility.indentStart());

		driver.manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT_DURATION_LONG);
		driver.navigate().to(URL_PRICE_COMPANY_CURRENT);

		// footer
		By BY_XPATH_MARK = By.xpath("//*[@id='footer']");
		log.debug("{} navigate(...) - 『{}』 『{}』", Utility.indentMiddle(), "footer", Utility.ellipsisEscape(driver.getText(BY_XPATH_MARK, Duration.ZERO), 32, 32));
		driver.presenceOfElementLocated(BY_XPATH_MARK, DEFAULT_TIMEOUT_DURATION);
		log.debug("{} navigate(...) - 『{}』 『{}』", Utility.indentMiddle(), "footer", Utility.ellipsisEscape(driver.getText(BY_XPATH_MARK, Duration.ZERO), 32, 32));

		log.debug("{} navigate(...)", Utility.indentEnd());
	}

}
