package kr.andold.stock.crawler;

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
import lombok.Setter;
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
	@Setter private static Boolean debug = CrawlerService.debug;

	private Integer count = 0;

	@Override
	public Result<ParserResult> dividend(ItemDomain item, Date start) {
		log.info("{} dividend({}, {})", Utility.indentStart(), item, start);
		long started = System.currentTimeMillis();

		Result<ParserResult> resultCompany = dividendAsCompany(item, start);
		switch (resultCompany.getStatus()) {
		case SUCCESS:
			log.info("{} {} dividend({}, {}) - {}", Utility.indentEnd(), resultCompany, item, start, Utility.toStringPastTimeReadable(started));
			return resultCompany;
		default:
			break;
		}

		Result<ParserResult> resultEtf = dividendAsEtf(item, start);

		log.info("{} {} dividend({}, {}) - {}", Utility.indentEnd(), resultEtf, item, start, Utility.toStringPastTimeReadable(started));
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
				log.warn("{} 『{}』 extractAsEtf({}, {}) - {}", Utility.indentEnd(), searchItemResult, item, start, Utility.toStringPastTimeReadable(started));
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
			sb.append(String.format("KEYWORD\t%s\n", item.getCode()));
			sb.append(driver.extractTextFromTableElement(table));
			sb.append(MARK_ANDOLD_SINCE);
			sb.append(MARK_START_END_POINT_ETF);
			close(driver);

			ParserResult parserResult = ParserService.parse(new String(sb), false);
			Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.SUCCESS).result(parserResult).build();

			log.debug("{} {} extractAsEtf({}, {}) - {}", Utility.indentEnd(), result, item, start, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			close(driver);
		}

		log.debug("{} {} extractAsEtf({}, {}) - {}", Utility.indentEnd(), "EXCEPTION", item, start, Utility.toStringPastTimeReadable(started));
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
			driver.findElement(By.id("btn_wide_img"), TIMEOUT).click();
			return driver;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
//			close(driver);
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

				log.info("{} 쪽:{} dividendAsCompany(..., {}) - {}", Utility.indentMiddle(), currentPage, start, Utility.toStringPastTimeReadable(started));
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
				log.warn("{} FAIL_MANY_DATA count:{}, item:{}, {}", Utility.indentMiddle(), count, item, driver.getText(result));
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
		log.error("{} {} price({}, #{})", Utility.indentMiddle(), "NOT SUPPORTED", item, Utility.size(histories));
		return null;
	}


	@Override
	public Result<ParserResult> price(Date date) {
		// TODO Auto-generated method stub
		return null;
	}

}
