package kr.andold.stock.crawler;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.ParserService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class Seibro implements Crawler {
	private static final String URL_COMPANY = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01041V.xml&menuNo=285";
	private static final String URL_ETF = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS06030V.xml&menuNo=179";
	private static final String MARK_START_END_POINT_COMPANY = String.format("KEYWORD\t%s\t%s\tURL\t%s\n", "CrawlDividendHistoryCompanyThread", "주식(기업) 배당금 내역", URL_COMPANY);
	private static final String MARK_START_END_POINT_ETF = String.format("KEYWORD\t%s\t%s\tURL\t%s\n", "ETF 배당금 내역", "KSD 증권정보포털 SEIBro", URL_ETF);
	private static final int TIMEOUT = 4000;
	private static final String MARK_ANDOLD_SINCE = CrawlerService.MARK_ANDOLD_SINCE;

	// SEIBro > 주식 > 종목별상세정보 > 종목종합내역
	private static final String URL_COMPANY_EACH_SUMMARY_INFO = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02006V.xml&menuNo=44";
	private static final String MARK_START_END_POINT_COMPANY_EACH_SUMMARY_INFO = String.format("KEYWORD\t%s\t%s\t%s\n", "SEIBro", "주식 > 종목별상세정보 > 종목종합내역", URL_COMPANY_EACH_SUMMARY_INFO);

	// SEIBro > ETF > ETF종합정보 > 종목상세
	private static final String URL_ETF_EACH_SUMMARY_INFO = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/etf/BIP_CNTS906032V.xml&menuNo=514";
	private static final String MARK_START_END_POINT_ETF_EACH_SUMMARY_INFO = String.format("KEYWORD\t%s\t%s\t%s\n", "SEIBro", "ETF > ETF종합정보 > 종목상세", URL_ETF_EACH_SUMMARY_INFO);

	private Integer count = 0;

	@Override
	public Result<ParserResult> dividend(ItemDomain item, Date start) {
		log.info("{} dividend({}, {})", Utility.indentStart(), item, start);
		long started = System.currentTimeMillis();

		Result<ParserResult> resultCompany = dividendAsCompany(item, start);
		if (resultCompany.getStatus().equals(STATUS.SUCCESS)) {
			log.info("{} 『{}』 dividend({}, {}) - {}", Utility.indentEnd(), resultCompany, item, start, Utility.toStringPastTimeReadable(started));
			return resultCompany;
		}

		Result<ParserResult> resultEtf = dividendAsEtf(item, start);

		log.info("{} 『{}』 dividend({}, {}) - {}", Utility.indentEnd(), resultEtf, item, start, Utility.toStringPastTimeReadable(started));
		return resultEtf;
	}

	private Result<ParserResult> dividendAsEtf(ItemDomain item, Date start) {
		log.debug("{} extractAsEtf({}, {})", Utility.indentStart(), item, start);
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = null;
		try {
			driver = openAsEtf(start);

			String code = item.getCode();

			driver.switchTo().defaultContent();

			Result<ParserResult> searchItemResult = searchItemByCodeInEtf(driver, code);
			switch (searchItemResult.getStatus()) {
			case SUCCESS:
				break;
			default:
				close(driver);
				log.debug("{} 『{}』 extractAsEtf({}, {}) - {}", Utility.indentEnd(), searchItemResult, item, start, Utility.toStringPastTimeReadable(started));
				return searchItemResult;
			
			}

			driver.switchTo().defaultContent();

			// 조회 아이콘 클릭
			By BY_MARK_DIVIDEND_SEARCH_DONE = By.xpath("//*[@id='grid1_body_table']//td[3]");
			String textPrevious = driver.getText(BY_MARK_DIVIDEND_SEARCH_DONE, 1, "andold");
			driver.findElement(By.xpath("//*[@id='image17']"), TIMEOUT).click();
			// 내용이 바뀔 때까지
			driver.waitUntilTextNotInclude(BY_MARK_DIVIDEND_SEARCH_DONE, TIMEOUT, textPrevious);

			// 내용 저장
			WebElement table = driver.findElement(By.xpath("//*[@id='grid1_body_table']"), TIMEOUT);

			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT_ETF);
			sb.append(driver.extractTextContentFromTableElement(table));
			sb.append(MARK_ANDOLD_SINCE);
			sb.append(MARK_START_END_POINT_ETF);
			close(driver);

			ParserResult parserResult = ParserService.parse(new String(sb), false);
			Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.SUCCESS).result(parserResult).build();

			log.debug("{} 『{}』 extractAsEtf({}, {}) - {}", Utility.indentEnd(), result, item, start, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			close(driver);
		}

		log.debug("{} 『{}』 extractAsEtf({}, {}) - {}", Utility.indentEnd(), "EXCEPTION", item, start, Utility.toStringPastTimeReadable(started));
		return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
	}

	private Result<ParserResult> searchItemByCodeInEtf(ChromeDriverWrapper driver, String code) {
		try {
			// 종목명 검색 아이콘 클릭
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='group162']"), false, TIMEOUT);
			driver.findElement(By.xpath("//dd[@id='sn_group2']/a[@id='sn_group4']"), TIMEOUT).click();
			
			WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframeEtfnm']"), TIMEOUT);
			driver.switchTo().frame(frame);
	
			// 종목명에 코드 입력
			WebElement keywordElement = driver.findElement(By.xpath("//input[@id='search_string']"), TIMEOUT);
			keywordElement.clear();
			keywordElement.sendKeys(code);
			
			// 종목명 검색 아이콘 클릭
			String MARK_COUNT = "-1";
			driver.setText(By.xpath("//*[@id='P_ListCnt']"), MARK_COUNT, TIMEOUT);
			driver.findElement(By.xpath("//div[@id='group252']/a[@id='group236']"), TIMEOUT).click();
			// 이전 내용이 지워질 때까지
			driver.waitUntilTextNotInclude(By.xpath("//*[@id='P_ListCnt']"), TIMEOUT, MARK_COUNT);
	
			// 검색 결과에서 선택
			switch (driver.getText(By.xpath("//*[@id='P_ListCnt']"), TIMEOUT, MARK_COUNT)) {
			case "0":
				driver.switchTo().defaultContent();
				driver.findElement(By.xpath("//div[@id='group164']/a[@id='anchor3']"), TIMEOUT).click();
				close(driver);
	
				Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.FAIL_NO_RESULT).build();
				return result;
			case "1":
				driver.findElement(By.xpath("//ul[@id='contentsList']/li/a")).click();
				return Result.<ParserResult>builder().status(STATUS.SUCCESS).build();
			default:
				break;
			}

			if (driver.clickIncludeTextInAttribute(By.xpath("//ul[@id='contentsList']/li/a"), TIMEOUT, "href", "KR7" + code)) {
				return Result.<ParserResult>builder().status(STATUS.SUCCESS).build();
			}

			driver.switchTo().defaultContent();
			driver.findElement(By.xpath("//div[@id='group164']/a[@id='anchor3']"), TIMEOUT).click();
			close(driver);
	
			Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.FAIL_MANY_DATA).build();
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}
		return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
	}

	private ChromeDriverWrapper openAsEtf(Date start) {
		ChromeDriverWrapper driver = null;
		try {
			count++;
			driver = CrawlerService.defaultChromeDriver();
			driver.navigate().to(URL_ETF);

			// 조회기간 시작일
			WebElement startDateElement = driver.findElement(By.xpath("//input[@id='sd1_inputCalendar1_input']"), TIMEOUT * 4);
			startDateElement.clear();
			startDateElement.sendKeys(String.format("%1$tY%1$tm%1$td", start)); // 조회기간 시작일
			startDateElement.sendKeys(Keys.TAB); // 시작일 입력

			// 넓게 보기 아이콘
			driver.findElement(By.xpath("//*[@id='btn_wide']"), TIMEOUT).click();
			return driver;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}
		return null;
	}

	private Result<ParserResult> dividendAsCompany(ItemDomain item, Date start) {
		log.debug("{} dividendAsCompany({}, {})", Utility.indentStart(), item, start);
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = null;
		try {
			driver = openAsCompany(start);
			driver.switchTo().defaultContent();

			Result<String> searched = searchItem(driver, item);
			switch (searched.getStatus()) {
			case SUCCESS:
				break;
			default:
				log.debug("{} 『{}』 dividendAsCompany({}, {}) - {}", Utility.indentEnd(), searched, item, start, Utility.toStringPastTimeReadable(started));
				searched.setResult("");

				close(driver);
				return Result.<ParserResult>builder().status(searched.getStatus()).build();
			}

			By BY_TABLE = By.xpath("//table[@id='grid1_body_table']");
			By BY_TABLE_1ST_LINE = By.xpath("//table[@id='grid1_body_table']/tbody/tr[1]");
			By BY_NEXT_PAGE_ICON = By.xpath("//div[@id='cntsPaging01']/ul/li[@id='cntsPaging01_next_btn']/a");
			By BY_CURRENT_PAGE = By.xpath("//div[@id='cntsPaging01']/ul/li/a[@class='w2pageList_control_label w2pageList_label_selected']");

			// 첫번째 라인 저장
			String previous1stLine = driver.getText(BY_TABLE_1ST_LINE, TIMEOUT, MARK_ANDOLD_SINCE);

			driver.switchTo().defaultContent();

			// 조회 클릭
			if (!clickSearchIconInCompany(driver)) {
				log.debug("{} {} dividendAsCompany({}, {}) - {}", Utility.indentEnd(), "FAILURE SEARH", item, start, Utility.toStringPastTimeReadable(started));
				close(driver);
				return Result.<ParserResult>builder().status(STATUS.FAIL).build();
			}

			// 시작 표시
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT_COMPANY);

			// 페이징 처리 - 여기부터
			String currentPage = driver.getText(BY_CURRENT_PAGE, TIMEOUT, "andold"); // 현재 페이지 번호
			while (true) {
				WebElement table = driver.findElement(BY_TABLE, TIMEOUT);
				sb.append(driver.extractTextFromTableElement(table));

				// 다음 페이지 클릭
				driver.clickIfExist(BY_NEXT_PAGE_ICON);

				// 변경 확인
				driver.waitUntilTextNotInclude(BY_TABLE_1ST_LINE, TIMEOUT, previous1stLine);
				previous1stLine = driver.getText(BY_TABLE_1ST_LINE, TIMEOUT, MARK_ANDOLD_SINCE);

				String nextPage = driver.getText(BY_CURRENT_PAGE, TIMEOUT, currentPage);
				if (currentPage.equalsIgnoreCase(nextPage)) {
					break;
				}

				log.debug("{} 쪽:{} dividendAsCompany(..., {}) - {}", Utility.indentMiddle(), currentPage, start, Utility.toStringPastTimeReadable(started));
				currentPage = nextPage;
			}
			// 페이징 처리 - 여기까지

			// 마지막 표시
			sb.append(MARK_ANDOLD_SINCE);
			sb.append(MARK_START_END_POINT_COMPANY);
			ParserResult result = ParserService.parse(new String(sb), false);

			log.debug("{} {} dividendAsCompany({}, {}) - {}", Utility.indentEnd(), result, item, start, Utility.toStringPastTimeReadable(started));
			close(driver);
			return Result.<ParserResult>builder().status(STATUS.SUCCESS).result(result).build();
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), start, e.getLocalizedMessage(), e);
			close(driver);
		}

		log.debug("{} {} dividendAsCompany({}, {}) - {}", Utility.indentEnd(), "EXCEPTION", item, start, Utility.toStringPastTimeReadable(started));
		return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
	}

	private boolean clickSearchIconInCompany(ChromeDriverWrapper driver) {
		try {
			String previousLastLineText = driver.getTextLast(By.xpath("//table[@id='grid1_body_table']/tbody/tr"), TIMEOUT, "andold");
			driver.findElement(By.xpath("//a[@id='group57']")).click();
			driver.waitUntilNotIncludeTextLast(By.xpath("//table[@id='grid1_body_table']/tbody/tr"), TIMEOUT, previousLastLineText);
			return true;
		} catch (Exception e) {
		}
		return false;
	}

	private ChromeDriverWrapper openAsCompany(Date start) {
		ChromeDriverWrapper driver = null;
		try {
			count++;
			driver = CrawlerService.defaultChromeDriver();
			driver.navigate().to(URL_COMPANY);

			// 검색항목을 code로
			new Select(driver.findElement(By.id("Com_ISIN_input_0"), TIMEOUT * 4)).selectByVisibleText("종목");

			// 넓게 보기 아이콘 크릭
			driver.findElement(By.id("btn_wide_img")).click();

			// 시작일 입력
			WebElement startElement = driver.findElement(By.id("inputCalendar1_input"), TIMEOUT);
			startElement.clear();
			startElement.sendKeys(String.format("%1$tY%1$tm%1$td", start));
			startElement.sendKeys(Keys.TAB); // 시작일 입력
			return driver;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			close(driver);
		}
		return null;
	}

	private void close(ChromeDriverWrapper driver) {
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	private Result<String> searchItem(ChromeDriverWrapper driver, ItemDomain item) {
		try {
			String code = item.getCode();

			// 종목 검색 아이콘 클릭
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='group83']"), false, TIMEOUT);
			driver.findElement(By.id("cc_group4")).click();

			WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframe2']"), TIMEOUT);

			driver.switchTo().frame(frame);
			WebElement codeElement = driver.findElement(By.id("search_string"), TIMEOUT);
			codeElement.clear();
			codeElement.sendKeys(code); // 코드 입력

			// 코드 검색 아이콘 클릭
			String MARK_COUNT = "-1";
			driver.setText(By.xpath("//*[@id='P_ListCnt']"), MARK_COUNT, TIMEOUT);
			driver.findElement(By.id("P_group100")).click();
			driver.waitUntilTextNotInclude(By.xpath("//*[@id='P_ListCnt']"), TIMEOUT, MARK_COUNT);

			// 조회결과 갯수 확인
			By BY_PROPER_RESULT = By.xpath("//ul[@id='P_isinList']/li/a/span[contains(text(),'" + item.getCode() + "')]");
			List<WebElement> result = driver.findElements(BY_PROPER_RESULT, TIMEOUT);
			switch (result.size()) {
			case 0:
				driver.switchTo().defaultContent();
				driver.clickIfExist(By.xpath("//*[@id='anchor3']"));
				close(driver);
				return Result.<String>builder().status(STATUS.FAIL_NO_RESULT).build();
			case 1:
				driver.clickIfExist(BY_PROPER_RESULT);
				return Result.<String>builder().status(STATUS.SUCCESS).build();
			default:
				break;
			}

			close(driver);
			return Result.<String>builder().status(STATUS.FAIL_MANY_DATA).build();
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
		}
		
		return Result.<String>builder().status(STATUS.EXCEPTION).build();
	}

	@Override
	public Result<ParserResult> price(ItemDomain item, List<DividendHistoryDomain> histories) {
		log.error("{} {} price({}, #{})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, item, Utility.size(histories));
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> price(Date date) {
		log.error("{} {} price({})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, date);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> basicInfoAll() {
		log.error("{} {} basicInfoAll()", Utility.indentMiddle(), STATUS.NOT_SUPPORT);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> dividend(Date start) {
		log.info("{} dividend({})", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		ParserResult container = new ParserResult().clear();
		Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.SUCCESS).result(container).build();
		Result<ParserResult> resultCompany = dividendCompany(start);
		if (resultCompany.getStatus().equals(STATUS.SUCCESS)) {
			container.addAll(resultCompany.getResult());
		} else {
			result.setStatus(resultCompany.getStatus());
		}

		Result<ParserResult> resultEtf = dividendEtf(start);
		if (resultEtf.getStatus().equals(STATUS.SUCCESS)) {
			container.addAll(resultEtf.getResult());
		} else {
			result.setStatus(resultEtf.getStatus());
		}

		log.info("{} 『{}』 dividend({}) - {}", Utility.indentEnd(), result, start, Utility.toStringPastTimeReadable(started));
		return result;
	}

	protected Result<ParserResult> dividendCompany(Date start) {
		log.debug("{} dividendCompany({})", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = null;
		try {
			driver = CrawlerService.defaultChromeDriver();
			driver.navigate().to(URL_COMPANY);

			// 넓게 보기 아이콘 크릭
			driver.findElement(By.xpath("//*[@id=\"btn_wide\"]"), TIMEOUT * 4).click();

			// 시작일 입력
			WebElement startElement = driver.findElement(By.id("inputCalendar1_input"), TIMEOUT);
			startElement.clear();
			startElement.sendKeys(String.format("%1$tY%1$tm%1$td", start));
			startElement.sendKeys(Keys.TAB); // 시작일 입력

			By BY_TABLE_1ST_LINE = By.xpath("//table[@id='grid1_body_table']/tbody/tr[1]");
			By BY_NEXT_PAGE_ICON = By.xpath("//div[@id='cntsPaging01']/ul/li[@id='cntsPaging01_next_btn']/a");
			By BY_CURRENT_PAGE = By.xpath("//div[@id='cntsPaging01']/ul/li/a[@class='w2pageList_control_label w2pageList_label_selected']");

			// 첫번째 라인 저장
			String previous1stLine = driver.getText(BY_TABLE_1ST_LINE, TIMEOUT, MARK_ANDOLD_SINCE);

			// 조회 클릭
			if (!clickSearchIconInCompany(driver)) {
				log.debug("{} {} dividendCompany({}) - {}", Utility.indentEnd(), "FAILURE SEARH", start, Utility.toStringPastTimeReadable(started));
				driver.quit();
				return Result.<ParserResult>builder().status(STATUS.FAIL).build();
			}

			// 시작 표시
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT_COMPANY);

			// 페이징 처리 - 여기부터
			String currentPage = driver.getText(BY_CURRENT_PAGE, TIMEOUT, "andold"); // 현재 페이지 번호
			while (true) {
				WebElement table = driver.findElement(By.xpath("//*[@id='grid1_body_table']"), TIMEOUT);
				sb.append(driver.extractTextFromTableElement(table));

				// 다음 페이지 클릭
				driver.clickIfExist(BY_NEXT_PAGE_ICON);

				// 변경 확인
				driver.waitUntilTextNotInclude(BY_TABLE_1ST_LINE, TIMEOUT, previous1stLine);
				previous1stLine = driver.getText(BY_TABLE_1ST_LINE, TIMEOUT, MARK_ANDOLD_SINCE);

				String nextPage = driver.getText(BY_CURRENT_PAGE, TIMEOUT, currentPage);
				if (currentPage.equalsIgnoreCase(nextPage)) {
					break;
				}

				log.debug("{} 쪽:{} dividendCompany({}) - {}", Utility.indentMiddle(), currentPage, start, Utility.toStringPastTimeReadable(started));
				currentPage = nextPage;
			}
			// 페이징 처리 - 여기까지

			// 마지막 표시
			sb.append(MARK_ANDOLD_SINCE);
			sb.append(MARK_START_END_POINT_COMPANY);
			ParserResult result = ParserService.parse(new String(sb), CrawlerService.getDebug());

			log.debug("{} {} dividendCompany({}) - {}", Utility.indentEnd(), result, start, Utility.toStringPastTimeReadable(started));
			driver.quit();
			return Result.<ParserResult>builder().status(STATUS.SUCCESS).result(result).build();
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
		}

		log.debug("{} {} dividendCompany({}) - {}", Utility.indentEnd(), STATUS.EXCEPTION, start, Utility.toStringPastTimeReadable(started));
		return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
	}

	protected Result<ParserResult> dividendEtf(Date start) {
		log.debug("{} dividendEtf({})", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = null;
		try {
			driver = CrawlerService.defaultChromeDriver();
			driver.navigate().to(URL_ETF);

			// 조회기간 시작일
			WebElement startDateElement = driver.findElement(By.xpath("//input[@id='sd1_inputCalendar1_input']"), TIMEOUT * 4);
			startDateElement.clear();
			startDateElement.sendKeys(String.format("%1$tY%1$tm%1$td", start)); // 조회기간 시작일
			startDateElement.sendKeys(Keys.TAB); // 시작일 입력

			// 넓게 보기 아이콘
			driver.findElement(By.id("btn_wide_img"), TIMEOUT).click();

			// 조회 아이콘 클릭
			By BY_MARK_DIVIDEND_SEARCH_DONE = By.xpath("//*[@id='grid1_cell_0_8']");
			driver.setText(BY_MARK_DIVIDEND_SEARCH_DONE, MARK_ANDOLD_SINCE, TIMEOUT);
			String textPrevious = driver.getText(BY_MARK_DIVIDEND_SEARCH_DONE, 1, "andold");
			driver.waitUntilIsDisplayed(By.xpath("//*[@id='wframe46']"), false, TIMEOUT);
			driver.findElement(By.xpath("//*[@id='image17']"), TIMEOUT).click();
			// 내용이 바뀔 때까지
			driver.waitUntilTextNotInclude(BY_MARK_DIVIDEND_SEARCH_DONE, TIMEOUT, textPrevious);

			// 내용 저장
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT_ETF);

			// 페이징 처리 - 여기부터
			By BY_CURRENT_PAGE = By.xpath("//div[@id='pageList1']/ul/li/a[@class='w2pageList_control_label w2pageList_label_selected']");
			By BY_NEXT_PAGE_ICON = By.xpath("//*[@id='pageList1_next_btn']/a");
			By BY_TABLE_1ST_LINE = By.xpath("//table[@id='grid1_body_table']/tbody/tr[1]");
			String currentPage = driver.getText(BY_CURRENT_PAGE, TIMEOUT, "andold"); // 현재 페이지 번호
			for(String previous1stLine = driver.getText(BY_TABLE_1ST_LINE, TIMEOUT, MARK_ANDOLD_SINCE);;) {
				WebElement table = driver.findElement(By.xpath("//*[@id='grid1_body_table']"), TIMEOUT);
				sb.append(driver.extractTextContentFromTableElement(table));
				sb.append(MARK_ANDOLD_SINCE);

				// 다음 페이지 클릭
				driver.clickIfExist(BY_NEXT_PAGE_ICON);

				// 변경 확인
				driver.waitUntilTextNotInclude(BY_TABLE_1ST_LINE, TIMEOUT, previous1stLine);
				previous1stLine = driver.getText(BY_TABLE_1ST_LINE, TIMEOUT, MARK_ANDOLD_SINCE);

				String nextPage = driver.getText(BY_CURRENT_PAGE, TIMEOUT, currentPage);
				if (currentPage.equalsIgnoreCase(nextPage)) {
					break;
				}

				log.debug("{} 쪽:{} dividendEtf({}) - {}", Utility.indentMiddle(), currentPage, start, Utility.toStringPastTimeReadable(started));
				currentPage = nextPage;
			}
			// 페이징 처리 - 여기까지

			sb.append(MARK_START_END_POINT_ETF);
			driver.quit();

			ParserResult parserResult = ParserService.parse(new String(sb), CrawlerService.getDebug());
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

	// KSD증권정보포털(SEIBro) > 주식 > 배당정보 > 배당순위
	@Deprecated
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
					sb.append(driver.extractTextContentFromTableElement(table, "KOSPI\t"));
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
					sb.append(driver.extractTextContentFromTableElement(table, "KOSDAQ\t"));
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

		log.info("{} {} crawlItemDividendTopCompany() - {}", Utility.indentMiddle(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	@Override
	public Result<ParserResult> item(String code) {
		log.info("{} item({})", Utility.indentStart(), code);
		long started = System.currentTimeMillis();

		Result<ParserResult> resultCompany = itemCompany(code);
		if (resultCompany.getStatus().equals(STATUS.SUCCESS)) {
			log.info("{} 『{}』 item({}) - {}", Utility.indentEnd(), resultCompany, code, Utility.toStringPastTimeReadable(started));
			return resultCompany;
		}

		Result<ParserResult> resultEtf = itemEtf(code);

		log.info("{} 『{}』 item({}) - {}", Utility.indentEnd(), resultEtf, code, Utility.toStringPastTimeReadable(started));
		return resultEtf;
	}

	// SEIBro > 주식 > 종목별상세정보 > 종목종합내역
	protected Result<ParserResult> itemCompany(String code) {
		log.debug("{} itemCompany({})", Utility.indentStart(), code);
		long started = System.currentTimeMillis();

		if (code == null) {
			return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
		}

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			driver.navigate().to(URL_COMPANY_EACH_SUMMARY_INFO);

			// 진행중 화면이 없어지고
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='___processbar2']"), false, TIMEOUT * 4);
			// 종목명 검색 아이콘이 보이고
			driver.waitUntilIsDisplayed(By.xpath("//img[@id='sn_image1']"), true, TIMEOUT * 4);

			// 종목명 검색 클릭
			driver.findElement(By.xpath("//img[@id='sn_image1']"), TIMEOUT).click(); // 종목명 검색 아이콘

			// 프래임
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframe1']"), TIMEOUT));

			//	코드입력
			WebElement inputSearchElement = driver.findElement(By.xpath("//input[@id='search_string']"), TIMEOUT);	// 입력창
			inputSearchElement.clear();
			inputSearchElement.sendKeys(code); // 코드 입력

			// 종목명 검색 아이콘 클릭
			// 진행중 메시지가 없어질때까지
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='___processbar2']"), false, TIMEOUT);

			By BY_SEARCH_RESULT_COUNT = By.xpath("//span[@id='P_ListCnt']");
			String INVALID_COUNT = "-1";
			driver.setText(BY_SEARCH_RESULT_COUNT, INVALID_COUNT, TIMEOUT);
			driver.findElement(By.xpath("//a[@id='P_group100']"), TIMEOUT).click(); // 종목명 검색 아이콘
			driver.waitUntilTextNotInclude(BY_SEARCH_RESULT_COUNT, TIMEOUT, INVALID_COUNT);

			//	검색 결과에서 선택
			String count = driver.getText(BY_SEARCH_RESULT_COUNT, TIMEOUT, "0");
			if ("0".contentEquals(count)) {
				driver.quit();
				Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.FAIL_NO_RESULT).build();
				log.debug("{} 『{}』 itemCompany({}) - {}", Utility.indentEnd(), result, code, Utility.toStringPastTimeReadable(started));
				return result;
			}

			By BY_SEARCH_CODE_RESULT = By.xpath("//ul[@id='P_isinList']/li/a");
			if ("1".contentEquals(count)) {
				driver.findElementIncludeText(BY_SEARCH_CODE_RESULT, TIMEOUT, code).click();
			} else {
				List<WebElement> candidates = driver.findElements(BY_SEARCH_CODE_RESULT, TIMEOUT);
				for (WebElement candidate : candidates) {
					String href = candidate.getAttribute("href");	// javascript:SelectedValueReturn( 'KR7391680006', '흥국HK하이볼액티브증권상장지수투자신탁[주식]' ) 
					if (href.matches(String.format(".+KR.%s.+", code))) {
						candidate.click();
						break;
					}
				}
				driver.quit();
				Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.FAIL_NO_RESULT).build();
				log.debug("{} 『{}』 itemCompany({}) - {}", Utility.indentEnd(), result, code, Utility.toStringPastTimeReadable(started));
				return result;
			}

			//	팝업이 닫혔다, 돌아간다
			driver.switchTo().defaultContent();

			// 조회 아이콘 클릭
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='group402']"), false, TIMEOUT * 4);
			driver.findElement(By.xpath("//a[@id='group94']"), TIMEOUT).click();

			// 조회결과 바뀐거 확인
			WebElement symbolElement = driver.findElementIncludeText(By.xpath("//h3[@id='h3_tit_01']"), TIMEOUT, code);

			//	내용 저장
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT_COMPANY_EACH_SUMMARY_INFO);

			sb.append(String.format("KEYWORD\t%s\t%s\t%s\n", code, driver.getText(By.xpath("//p[@id='btn_item']"), TIMEOUT, "모름"), symbolElement.getText()));	// 종목명
			sb.append(String.format("KEYWORD\t\"%s\"\n", driver.findElement(By.xpath("//dd[@id='item_add_info_left_01_dd']"), TIMEOUT).getText()));	// 표준산업분류
			sb.append(String.format("KEYWORD\t\"%s\"\n", driver.findElement(By.xpath("//dd[@id='FICS']"), TIMEOUT).getText()));	// FICS
			sb.append(String.format("KEYWORD\t%s\n", driver.findElement(By.xpath("//dd[@id='ISSU_SCHD_STKQTY']"), TIMEOUT).getText()));	//	// 발행주식총수
			sb.append(String.format("KEYWORD\t%s\n", driver.findElement(By.xpath("//dd[@id='APLI_DT']"), TIMEOUT).getText()));	// 상장일
			driver.quit();

			sb.append(MARK_ANDOLD_SINCE);
			sb.append(MARK_START_END_POINT_COMPANY_EACH_SUMMARY_INFO);
			ParserResult result = ParserService.parse(new String(sb), CrawlerService.getDebug());

			log.debug("{} 『{}』 itemCompany({}) - {}", Utility.indentEnd(), result, code, Utility.toStringPastTimeReadable(started));
			return Result.<ParserResult>builder().status(STATUS.SUCCESS).result(result).build();
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
		}

		Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
		log.warn("{} 『{}』 itemCompany({}) - {}", Utility.indentEnd(), result, code, Utility.toStringPastTimeReadable(started));
		return result;
	}

	// SEIBro > ETF > ETF종합정보 > 종목상세
	protected Result<ParserResult> itemEtf(String code) {
		log.debug("{} itemEtf({})", Utility.indentStart(), code);
		long started = System.currentTimeMillis();

		if (code == null) {
			return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
		}

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			// 화면 열기
			driver.navigate().to(URL_ETF_EACH_SUMMARY_INFO);
			
			// 화면이 표시될 때까지
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='___processbar2']"), false, TIMEOUT * 4);	// 진행중 화면은 지워지고
			driver.waitUntilIsDisplayed(By.xpath("//a[@id='btn_wide']"), true, TIMEOUT * 4);	//	넓게보기 아이콘은 보이고

			// 넓게 보기 아이콘 클릭
			driver.findElement(By.xpath("//a[@id='btn_wide']"), TIMEOUT).click();

			// 여러개의 검색결과일 경우에 하나씩 확인해 보기 위해서
			for (int cx = 0; cx < 4; cx++) {
				driver.switchTo().defaultContent();

				// 종목명 검색 아이콘 클릭
				By BY_SEARCH_CODE_ICON = By.xpath("//div[@id='content']//a[@id='sn_group4']/img");
				driver.waitUntilIsDisplayed(By.xpath("//div[@id='group239']"), false, TIMEOUT);
				driver.waitUntilIsDisplayed(BY_SEARCH_CODE_ICON, true, TIMEOUT);
				driver.clickIfExist(BY_SEARCH_CODE_ICON);

				driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeEtfnm']"), TIMEOUT));

				// 코드 입력
				WebElement inputSearchElement = driver.findElement(By.xpath("//input[@id='search_string']"), TIMEOUT);	// 입력창
				inputSearchElement.clear();
				inputSearchElement.sendKeys(code);

				// 검색 아이콘 클릭
				// 진행중 메시지가 없어질때까지
				By BY_SEARCH_RESULT_COUNT = By.xpath("//span[@id='P_ListCnt']");
				String INVALID_COUNT = "-1";
				driver.waitUntilIsDisplayed(By.xpath("//div[@id='___processbar2']"), false, TIMEOUT);
				driver.setText(BY_SEARCH_RESULT_COUNT, INVALID_COUNT, TIMEOUT);
				driver.findElement(By.xpath("//a[@id='group236']"), TIMEOUT).click();
				driver.waitUntilTextNotInclude(BY_SEARCH_RESULT_COUNT, TIMEOUT, INVALID_COUNT);

				// 검색 결과
				By BY_CODE_SEARCH_RESULT = By.xpath("//ul[@id='contentsList']/li/a");
				List<WebElement> resultSearch = driver.findElements(BY_CODE_SEARCH_RESULT, TIMEOUT);
				if (resultSearch.size() <= cx) {
					driver.quit();
					Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.FAIL_NO_RESULT).build();

					log.debug("{} 『{}』 itemEtf({}) - {}", Utility.indentEnd(), result, code, Utility.toStringPastTimeReadable(started));
					return result;
				}
				
				// 선택
				resultSearch.get(cx).click();

				// 조회 클릭
				driver.switchTo().defaultContent();
				driver.findElement(By.xpath("//a[@id='group137']"), TIMEOUT).click();
				
				// 제목에 코드가 있으면, 성공
				if (driver.waitUntilTextInclude(By.xpath("//h3[@id='KOR_SECN_NM']"), TIMEOUT, code)) {
					break;
				}

			}
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT_ETF_EACH_SUMMARY_INFO);

			sb.append(String.format("KEYWORD\t%s\t%s\n", code, driver.findElementIncludeText(By.xpath("//h3[@id='KOR_SECN_NM']"), TIMEOUT, code).getText()));
			sb.append(String.format("%s\n", driver.findElementIncludeText(By.xpath("//h3[@id='KOR_SECN_NM']"), TIMEOUT, code).getText()));	// symbol
			sb.append(String.format("%s\n", driver.findElement(By.xpath("//div[@id='ETF_BIG_SORT_NM']"), TIMEOUT).getText()));	// 분류
			sb.append(String.format("%s\n", driver.findElement(By.xpath("//span[@id='SETUP_DT']"), TIMEOUT).getText()));	// 설정일
			sb.append(String.format("%s\n", driver.getText(By.xpath("//*[@id='grid1_cell_0_3']/nobr"), TIMEOUT, "-1")));	// 총발행주식수
			sb.append(String.format("%s\n", driver.findElement(By.xpath("//dd[@id='TOT_RECM_RATE']"), TIMEOUT).getText()));	// 보수(%)

			sb.append(MARK_ANDOLD_SINCE);
			sb.append(MARK_START_END_POINT_ETF_EACH_SUMMARY_INFO);
			ParserResult result = ParserService.parse(sb.toString(), false);

			log.debug("{} 『{}』 itemEtf({}) - {}", Utility.indentEnd(), result, code, Utility.toStringPastTimeReadable(started));
			return Result.<ParserResult>builder().status(STATUS.SUCCESS).result(result).build();
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
		}

		Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
		log.warn("{} 『{}』 itemEtf({}) - {}", Utility.indentEnd(), result, code, Utility.toStringPastTimeReadable(started));
		return result;
	}

	@Override
	public Result<ParserResult> price(String code, Date start) {
		log.error("{} 『{}』 price({}, {})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, code, start);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

}
