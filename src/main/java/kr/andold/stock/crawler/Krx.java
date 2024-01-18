package kr.andold.stock.crawler;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
public class Krx implements Crawler {
	private static final String URL = "http://data.krx.co.kr/";
	private static final String MARK_START_END_POINT = String.format("KEYWORD\t%s\t%s\t%s\n", "주가일별시세", "KRX", URL);
	
	// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목시세 > 개별종목 시세 추이
	private static final String URL_PRICE_COMPANY_EACH = "http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020103";
	private static final String MARK_START_END_POINT_PRICE_COMPANY_EACH = String.format("KEYWORD\t%s\t%s\t%s\n", "KRX", "주식 > 종목시세 > 개별종목 시세 추이", URL_PRICE_COMPANY_EACH);

	// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 개별종목 시세 추이
	private static final String URL_PRICE_ETF_EACH = "http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201030103";
	private static final String MARK_START_END_POINT_PRICE_ETF_EACH = String.format("KEYWORD\t%s\t%s\t%s\n", "KRX", "증권상품 > ETF > 개별종목 시세 추이", URL_PRICE_ETF_EACH);

	// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목시세 > 전종목 시세
	private static final String URL_PRICE_COMPANY_ALL = "http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020101";
	private static final String MARK_START_END_POINT_PRICE_COMPANY_ALL = String.format("KEYWORD\t%s\t%s\t%s\n", "KRX", "주식 > 종목시세 > 전종목 시세", URL_PRICE_COMPANY_ALL);

	// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 전종목 시세
	private static final String URL_PRICE_ETF_ALL = "http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201030101";
	private static final String MARK_START_END_POINT_PRICE_ETF_ALL = String.format("KEYWORD\t%s\t%s\t%s\n", "KRX", "ETF > 전종목 시세", URL_PRICE_ETF_ALL);

	// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목정보 > 전종목 기본정보
	private static final String URL_COMPANY_BASIC_INFO_ALL = "http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020201";
	private static final String MARK_START_END_POINT_COMPANY_BASIC_INFO_ALL = String.format("KEYWORD\t%s\t%s\t%s\n", "KRX", "주식 > 종목정보 > 전종목 기본정보", URL_COMPANY_BASIC_INFO_ALL);

	// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 전종목 기본정보
	private static final String URL_ETF_BASIC_INFO_ALL = "http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201030104";
	private static final String MARK_START_END_POINT_ETF_BASIC_INFO_ALL = String.format("KEYWORD\t%s\t%s\t%s\n", "KRX", "증권상품 > ETF > 전종목 기본정보", URL_ETF_BASIC_INFO_ALL);

	// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목정보 > 개별정보 종합정보
	private static final String URL_COMPANY_EACH_SUMMARY_INFO = "http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020203";
	private static final String MARK_START_END_POINT_COMPANY_EACH_SUMMARY_INFO = String.format("KEYWORD\t%s\t%s\t%s\n", "KRX", "주식 > 종목정보 > 개별정보 종합정보", URL_COMPANY_EACH_SUMMARY_INFO);

	// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 개별종목 종합정보
	private static final String URL_ETF_EACH_SUMMARY_INFO = "http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201030105";
	private static final String MARK_START_END_POINT_ETF_EACH_SUMMARY_INFO = String.format("KEYWORD\t%s\t%s\t%s\n", "KRX", "증권상품 > ETF > 개별종목 종합정보", URL_ETF_EACH_SUMMARY_INFO);

	private static final String MARK_ANDOLD_SINCE = CrawlerService.MARK_ANDOLD_SINCE;
	private static final int TIMEOUT = 4000;

	@Override
	public Result<ParserResult> dividend(String code, Date start) {
		log.error("{} {} dividend({}, {})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, code, start);
		return  Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> price(ItemDomain item, List<DividendHistoryDomain> histories) {
		log.info("{} price({}, {})", Utility.indentStart(), item, Utility.size(histories));
		long started = System.currentTimeMillis();

		Result<ParserResult> resultCompany = priceAsCompany(item, histories);
		switch (resultCompany.getStatus()) {
		case SUCCESS:
			log.info("{} {} price({}, {}) - {}", Utility.indentEnd(), resultCompany, item, Utility.size(histories), Utility.toStringPastTimeReadable(started));
			return resultCompany;
		default:
			break;
		}

		Result<ParserResult> resultEtf = priceAsEtf(item, histories);

		log.info("{} {} price({}, {}) - {}", Utility.indentEnd(), resultEtf, item, Utility.size(histories), Utility.toStringPastTimeReadable(started));
		return resultEtf;
	}

	private Result<ParserResult> priceAsEtf(ItemDomain item, List<DividendHistoryDomain> histories) {
		log.debug("{} priceAsEtf({}, #{})", Utility.indentStart(), item, Utility.size(histories));
		long started = System.currentTimeMillis();

		List<DividendHistoryDomain> filtered = histories.stream().filter(history -> history.getDividend() > 0 && (history.getPriceBase() == null || history.getPriceClosing() == null)).toList();
		ParserResult container = new ParserResult().clear();
		Result<ParserResult> resultContainer = Result.<ParserResult>builder().status(STATUS.SUCCESS).result(container).build();
		Result<ChromeDriverWrapper> initResult = initPriceAsEtf(item);
		ChromeDriverWrapper driver;
		switch (initResult.getStatus()) {
		case SUCCESS:
			driver = initResult.getResult();
			break;
		default:
			resultContainer.setStatus(initResult.getStatus());
			log.warn("{} 『{}』 priceAsEtf({}, #{}) - {}", Utility.indentEnd(), resultContainer, item, Utility.size(histories), Utility.toStringPastTimeReadable(started));
			return resultContainer;
		}

		filtered.forEach(history -> {
			Result<ParserResult> result = priceAsEtf(driver, item, history);
			switch (result.getStatus()) {
			case SUCCESS:
				container.addAll(result.getResult());
				break;
			default:
				resultContainer.setStatus(result.getStatus());
				log.warn("{} 『{}』 priceAsEtf({}, #{}) - {}", Utility.indentEnd(), resultContainer, item, Utility.size(histories), Utility.toStringPastTimeReadable(started));
				break;
			}
		});

		driver.quit();
		log.debug("{} 『{}』 priceAsEtf({}, #{}) - {}", Utility.indentEnd(), resultContainer, item, Utility.size(histories), Utility.toStringPastTimeReadable(started));
		return resultContainer;
	}

	private Result<ChromeDriverWrapper> initPriceAsEtf(ItemDomain item) {
		log.trace("{} initPriceAsEtf({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			driver.navigate().to(URL);
			Actions actions = new Actions(driver);

			// 1. KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 개별종목 시세 추이
			driver.waitUntilTextInclude(By.xpath("/html/body/div[2]/section[2]/div[2]/div[1]/section/aside/ol[1]/li[3]/ol/li[1]/a"), TIMEOUT * 4, "ETF"); // ETF
			actions.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/section[2]/div[2]/div[1]/section/aside/ol[1]/li[3]/ol/li[1]/a"), TIMEOUT)); // ETF
			actions.moveToElement(driver.findElement(By.xpath("/html/body/div[2]/section[2]/div[2]/div[1]/section/aside/ol[1]/li[3]/ol/li[1]/div/ul/li[3]/a"), TIMEOUT)); // 개별종목 시세 추이
			actions.click().build().perform();

			// 종목명에 코드 검색 - 코드 입력
			WebElement keywordElement = driver.findElement(By.xpath("//*[@id='tboxisuCd_finder_secuprodisu1_0']"), TIMEOUT);
			keywordElement.clear();
			keywordElement.sendKeys(item.getCode());
			keywordElement.sendKeys(Keys.TAB);

			// 1. 종목명에 코드 검색 - 검색 아이콘 클릭
			driver.findElement(By.xpath("//*[@id='btnisuCd_finder_secuprodisu1_0']"), TIMEOUT).click();

			// 자동으로 갔다 와야하는데 ....
			if (!driver.waitUntilExist(By.xpath("//*[@id='jsLayer_finder_secuprodisu1_1']"), true, TIMEOUT)) {
				driver.quit();
				Result<ChromeDriverWrapper> result = Result.<ChromeDriverWrapper>builder().status(STATUS.FAIL_NO_RESULT).build();
				log.debug("{} 『{}』 initPriceAsEtf({}, #{}) - {}", Utility.indentEnd(), result, item, Utility.toStringPastTimeReadable(started));
				return result;
			}
			if (!driver.waitUntilExist(By.xpath("//div[@id='jsLayer_finder_secuprodisu1_1']"), false, TIMEOUT)) {
				driver.quit();
				Result<ChromeDriverWrapper> result = Result.<ChromeDriverWrapper>builder().status(STATUS.FAIL_NO_RESULT).build();
				log.debug("{} 『{}』 initPriceAsEtf({}, #{}) - {}", Utility.indentEnd(), result, item, Utility.toStringPastTimeReadable(started));
				return result;
			}

			return Result.<ChromeDriverWrapper>builder().status(STATUS.SUCCESS).result(driver).build();
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
		}

		Result<ChromeDriverWrapper> result = Result.<ChromeDriverWrapper>builder().status(STATUS.EXCEPTION).build();
		log.warn("{} 『{}』 initPriceAsEtf({}, #{}) - {}", Utility.indentEnd(), result, item, Utility.toStringPastTimeReadable(started));
		return result;
	}

	private Result<ParserResult> priceAsEtf(ChromeDriverWrapper driver, ItemDomain item, DividendHistoryDomain history) {
		log.debug("{} priceAsEtf(..., {}, {})", Utility.indentStart(), item, history);
		long started = System.currentTimeMillis();

		try {
			// 2. 조회기간 설정
			LocalDate date = Instant.ofEpochMilli(history.getBase().getTime()).atZone(Utility.ZONE_ID_KST).toLocalDate();
			String endDateString = date.format(DateTimeFormatter.BASIC_ISO_DATE);
			String startDateString = date.minusWeeks(2).format(DateTimeFormatter.BASIC_ISO_DATE);

			WebElement startDateElement = driver.findElement(By.xpath("//*[@id='strtDd']"), TIMEOUT);
			startDateElement.clear();
			startDateElement.sendKeys(startDateString); // 조회기간 시작일
			startDateElement.sendKeys(Keys.TAB); // 시작일 입력
	
			WebElement endDateElement = driver.findElement(By.xpath("//*[@id='endDd']"), TIMEOUT);
			endDateElement.clear();
			endDateElement.sendKeys(endDateString); // 조회기간 종료일
			endDateElement.sendKeys(Keys.TAB); // 종료일 입력
			
			// 조회 클릭
			driver.findElement(By.xpath("//*[@id='jsSearchButton']"), TIMEOUT).click();

			// 3. 내용 저장
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT);
			for (String prev = ""; true;) {
				long forStarted = System.currentTimeMillis();

				WebElement table = driver.findElement(By.xpath("//*[@id='jsMdiContent']/div/div[1]/div[1]/div[1]/div[2]/div/div/table"), TIMEOUT);
				sb.append(driver.extractTextContentFromTableElement(table, String.format("ETF\t%s\t", item.getCode())));
				sb.append(MARK_ANDOLD_SINCE);

				List<WebElement> trs = table.findElements(By.xpath("//tr"));
				WebElement lastTr = trs.get(trs.size() - 1);
				String curr = lastTr.getAttribute("textContent");
				if (prev.contentEquals(curr)) {
					break;
				}

				prev = curr;
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lastTr);
				driver.clickIfExist(By.xpath("//*[@id='jsViewSizeButton']"));

				log.debug("{} 『{}』 priceAsEtf(..., {}, {}) - {}", Utility.indentEnd(), Utility.ellipsisEscape(prev, 32), item, history, Utility.toStringPastTimeReadable(forStarted));
			}
			sb.append(MARK_START_END_POINT);
			ParserResult result = ParserService.parse(new String(sb), CrawlerService.getDebug());

			log.debug("{} 『{}』 priceAsEtf(..., {}, {}) - {}", Utility.indentEnd(), result, item, history, Utility.toStringPastTimeReadable(started));
			return Result.<ParserResult>builder().status(STATUS.SUCCESS).result(result).build();
		
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.switchTo().defaultContent();
		}

		log.debug("{} 『{}』 priceAsEtf(..., {}, {}) - {}", Utility.indentEnd(), STATUS.EXCEPTION, item, history, Utility.toStringPastTimeReadable(started));
		return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
	}

	private Result<ParserResult> priceAsCompany(ItemDomain item, List<DividendHistoryDomain> histories) {
		log.debug("{} priceAsCompany({}, #{})", Utility.indentStart(), item, Utility.size(histories));
		long started = System.currentTimeMillis();

		List<DividendHistoryDomain> filtered = histories.stream().filter(history -> history.getDividend() > 0 && (history.getPriceBase() == null || history.getPriceClosing() == null)).toList();
		ParserResult container = new ParserResult().clear();
		Result<ParserResult> resultContainer = Result.<ParserResult>builder().status(STATUS.SUCCESS).result(container).build();
		Result<ChromeDriverWrapper> initResult = initPriceAsCompany(item);
		ChromeDriverWrapper driver;
		switch (initResult.getStatus()) {
		case SUCCESS:
			driver = initResult.getResult();
			break;
		default:
			resultContainer.setStatus(initResult.getStatus());
			log.warn("{} 『{}』 priceAsCompany({}, #{}) - {}", Utility.indentEnd(), resultContainer, item, Utility.size(histories), Utility.toStringPastTimeReadable(started));
			return resultContainer;
			
		}

		filtered.forEach(history -> {
			Result<ParserResult> result = priceAsCompany(driver, item, history);
			switch (result.getStatus()) {
			case SUCCESS:
				container.addAll(result.getResult());
				break;
			default:
				resultContainer.setStatus(result.getStatus());
				break;
			}
		});

		driver.quit();
		log.debug("{} 『{}』 priceAsCompany({}, #{}) - {}", Utility.indentEnd(), resultContainer, item, Utility.size(histories), Utility.toStringPastTimeReadable(started));
		return resultContainer;
	}

	private Result<ChromeDriverWrapper> initPriceAsCompany(ItemDomain item) {
		log.trace("{} initPriceAsCompany({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			driver.navigate().to(URL_PRICE_COMPANY_EACH);

			// 종목명에 코드 검색 - 코드 입력
			WebElement keywordElement = driver.findElement(By.xpath("//*[@id='tboxisuCd_finder_stkisu0_0']"), TIMEOUT * 4);
			keywordElement.clear();
			keywordElement.sendKeys(item.getCode());
			keywordElement.sendKeys(Keys.TAB);

			// 1. 종목명에 코드 검색 - 검색 아이콘 클릭
			driver.findElement(By.xpath("//*[@id='btnisuCd_finder_stkisu0_0']"), TIMEOUT).click();

			// 자동으로 갔다 와야하는데 ....
			if (!driver.waitUntilExist(By.xpath("//div[@id='jsLayer_finder_stkisu0_0']"), true, TIMEOUT)) {
				driver.quit();
				Result<ChromeDriverWrapper> result = Result.<ChromeDriverWrapper>builder().status(STATUS.FAIL_NO_RESULT).build();
				log.debug("{} 『{}』 initPriceAsCompany({}, #{}) - {}", Utility.indentEnd(), result, item, Utility.toStringPastTimeReadable(started));
				return result;
			}
			if (!driver.waitUntilExist(By.xpath("//div[@id='jsLayer_finder_stkisu0_0']"), false, TIMEOUT)) {
				driver.quit();
				Result<ChromeDriverWrapper> result = Result.<ChromeDriverWrapper>builder().status(STATUS.FAIL_NO_RESULT).build();
				log.debug("{} 『{}』 initPriceAsCompany({}, #{}) - {}", Utility.indentEnd(), result, item, Utility.toStringPastTimeReadable(started));
				return result;
			}

			return Result.<ChromeDriverWrapper>builder().status(STATUS.SUCCESS).result(driver).build();
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
		}

		Result<ChromeDriverWrapper> result = Result.<ChromeDriverWrapper>builder().status(STATUS.EXCEPTION).build();
		log.warn("{} 『{}』 initPriceAsCompany({}, #{}) - {}", Utility.indentEnd(), result, item, Utility.toStringPastTimeReadable(started));
		return result;
	}

	private Result<ParserResult> priceAsCompany(ChromeDriverWrapper driver, ItemDomain item, DividendHistoryDomain history) {
		log.debug("{} priceAsCompany(..., {}, {})", Utility.indentStart(), item, history);
		long started = System.currentTimeMillis();

		try {
			// 2. 조회기간 설정
			LocalDate date = Instant.ofEpochMilli(history.getBase().getTime()).atZone(Utility.ZONE_ID_KST).toLocalDate();
			String endDateString = date.minusWeeks(0).format(DateTimeFormatter.BASIC_ISO_DATE);
			String startDateString = date.minusWeeks(2).format(DateTimeFormatter.BASIC_ISO_DATE);

			WebElement startDateElement = driver.findElement(By.xpath("//*[@id='strdDd']"), TIMEOUT);
			startDateElement.clear();
			startDateElement.sendKeys(startDateString); // 조회기간 시작일
			startDateElement.sendKeys(Keys.TAB); // 시작일 입력
	
			WebElement endDateElement = driver.findElement(By.xpath("//*[@id='endDd']"), TIMEOUT);
			endDateElement.clear();
			endDateElement.sendKeys(endDateString); // 조회기간 종료일
			endDateElement.sendKeys(Keys.TAB); // 종료일 입력
			
			// 조회 클릭
			driver.findElement(By.xpath("//*[@id='jsSearchButton']"), TIMEOUT).click();

			// 3. 내용 저장
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT);
			for (String prev = ""; true;) {
				long forStarted = System.currentTimeMillis();

				WebElement table = driver.findElement(By.xpath("//*[@id='jsMdiContent']/div/div[1]/div[1]/div[1]/div[2]/div/div/table"), TIMEOUT);
				sb.append(driver.extractTextContentFromTableElement(table, String.format("ETF\t%s\t", item.getCode())));
				sb.append(MARK_ANDOLD_SINCE);

				List<WebElement> trs = table.findElements(By.xpath("//tr"));
				WebElement lastTr = trs.get(trs.size() - 1);
				String curr = lastTr.getAttribute("textContent");
				if (prev.contentEquals(curr)) {
					break;
				}

				prev = curr;
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lastTr);
				driver.clickIfExist(By.xpath("//*[@id='jsViewSizeButton']"));

				log.debug("{} 『{}』 priceAsCompany(..., {}, {}) - {}", Utility.indentMiddle(), Utility.ellipsisEscape(prev, 32), item, history, Utility.toStringPastTimeReadable(forStarted));
			}
			sb.append(MARK_START_END_POINT);
			ParserResult result = ParserService.parse(new String(sb), CrawlerService.getDebug());

			log.debug("{} 『{}』 priceAsCompany(..., {}, {}) - {}", Utility.indentEnd(), result, item, history, Utility.toStringPastTimeReadable(started));
			return Result.<ParserResult>builder().status(STATUS.SUCCESS).result(result).build();
		
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.switchTo().defaultContent();
		}

		log.debug("{} 『{}』 priceAsCompany(..., {}, {}) - {}", Utility.indentEnd(), STATUS.EXCEPTION, item, history, Utility.toStringPastTimeReadable(started));
		return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
	}

	@Override
	public Result<ParserResult> price(Date date) {
		log.info("{} price({})", Utility.indentStart(), date);
		long started = System.currentTimeMillis();

		ParserResult resultContainer = new ParserResult().clear();
		Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.SUCCESS).result(resultContainer).build();

		Result<ParserResult> resultCompany = priceCompany(date);
		if (resultCompany.getStatus() == STATUS.SUCCESS) {
			resultContainer.addAll(resultCompany.getResult());
		} else {
			result.setStatus(resultCompany.getStatus());
		}			

		Result<ParserResult> resultEtf = priceEtf(date);
		if (resultEtf.getStatus() == STATUS.SUCCESS) {
			resultContainer.addAll(resultEtf.getResult());
		} else {
			result.setStatus(resultEtf.getStatus());
		}			

		log.info("{} {} price({}) - {}", Utility.indentEnd(), result, date, Utility.toStringPastTimeReadable(started));
		return result;
	}

	private Result<ParserResult> priceEtf(Date date) {
		log.debug("{} priceEtf({})", Utility.indentStart(), date);
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			driver.navigate().to(URL_PRICE_ETF_ALL);

			// 기본 일자 수집 = 오늘
			WebElement dateElement = driver.findElement(By.xpath("//*[@id='trdDd']"), TIMEOUT);
			if (date == null) {
				date = Utility.parseDateTime(dateElement.getAttribute("value"));
			} else {
//				dateElement.clear();
				dateElement.sendKeys(String.format("%1$tY%1$tm%1$td\t", date));
			}

			// 조회 클릭
			driver.findElement(By.xpath("//*[@id='jsSearchButton']"), TIMEOUT).click();

			// 3. 내용 저장
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT_PRICE_ETF_ALL);
			for (String prev = ""; true;) {
				long forStarted = System.currentTimeMillis();

				WebElement tableElement = driver.findElement(By.xpath("//*[@id='jsMdiContent']/div/div[1]/div[1]/div[1]/div[2]/div/div/table"), TIMEOUT);
				sb.append(driver.getAttribute(tableElement, "textContent", String.format("ETF\t%1$tY-%1$tm-%1$td\t", date)));
				sb.append(MARK_ANDOLD_SINCE);

				List<WebElement> trs = tableElement.findElements(By.xpath("//tr"));
				WebElement lastTr = trs.get(trs.size() - 1);
				String curr = lastTr.getAttribute("textContent");
				if (prev.contentEquals(curr)) {
					break;
				}

				prev = curr;

				// 표 마지막줄까지 스크롤한다
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lastTr);
				// 확대/축소를 하면 화면이 바뀌면서 테이블 내용도 바뀐다
				driver.clickIfExist(By.xpath("//*[@id='jsViewSizeButton']"));

				log.debug("{} 『{}』 priceEtf({}) - {}", Utility.indentMiddle(), Utility.ellipsisEscape(prev, 32), date, Utility.toStringPastTimeReadable(forStarted));
			}
			driver.quit();
			sb.append(MARK_START_END_POINT_PRICE_ETF_ALL);

			ParserResult parserResult = ParserService.parse(new String(sb), CrawlerService.getDebug());
			Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.SUCCESS).result(parserResult).build();

			log.debug("{} 『{}』 priceEtf({}) - {}", Utility.indentEnd(), result, date, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
		}

		log.warn("{} 『{}』 priceEtf({}) - {}", Utility.indentEnd(), STATUS.EXCEPTION, date, Utility.toStringPastTimeReadable(started));
		return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
	}

	private Result<ParserResult> priceCompany(Date date) {
		log.debug("{} priceCompany({})", Utility.indentStart(), date);
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			driver.navigate().to(URL_PRICE_COMPANY_ALL);

			// 기본 일자 수집 = 오늘
			WebElement dateElement = driver.findElement(By.xpath("//*[@id='trdDd']"), TIMEOUT);
			if (date == null) {
				date = Utility.parseDateTime(dateElement.getAttribute("value"));
			} else {
				String dateString = String.format("%1$tY%1$tm%1$td\t", date);
				dateElement.sendKeys(dateString);
			}

			// 조회 클릭
			driver.findElement(By.xpath("//*[@id='jsSearchButton']"), TIMEOUT).click();

			// 3. 내용 저장
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT_PRICE_COMPANY_ALL);
			for (String prev = ""; true;) {
				long forStarted = System.currentTimeMillis();

				WebElement tableElement = driver.findElement(By.xpath("//*[@id='jsMdiContent']/div/div[1]/div[1]/div[1]/div[2]/div/div/table"), TIMEOUT);
				sb.append(driver.getAttribute(tableElement, "textContent", String.format("COMPANY\t%1$tY-%1$tm-%1$td\t", date)));
				sb.append(MARK_ANDOLD_SINCE);

				List<WebElement> trs = tableElement.findElements(By.xpath("//tr"));
				WebElement lastTr = trs.get(trs.size() - 1);
				String curr = lastTr.getAttribute("textContent");
				if (prev.contentEquals(curr)) {
					break;
				}

				prev = curr;

				// 표 마지막줄까지 스크롤한다
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lastTr);
				// 확대/축소를 하면 화면이 바뀌면서 테이블 내용도 바뀐다
				driver.clickIfExist(By.xpath("//*[@id='jsViewSizeButton']"));

				log.debug("{} 『{}』 priceCompany({}) - {}", Utility.indentMiddle(), Utility.ellipsisEscape(prev, 32), date, Utility.toStringPastTimeReadable(forStarted));
			}
			driver.quit();
			sb.append(MARK_START_END_POINT_PRICE_COMPANY_ALL);

			ParserResult parserResult = ParserService.parse(new String(sb), CrawlerService.getDebug());
			Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.SUCCESS).result(parserResult).build();

			log.debug("{} 『{}』 priceCompany({}) - {}", Utility.indentEnd(), result, date, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
		}

		log.warn("{} 『{}』 priceCompany({}) - {}", Utility.indentEnd(), STATUS.EXCEPTION, date, Utility.toStringPastTimeReadable(started));
		return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
	}

	@Override
	public Result<ParserResult> basicInfoAll() {
		log.trace("{} basicInfoAll()", Utility.indentStart());
		long started = System.currentTimeMillis();

		ParserResult container = new ParserResult().clear();
		Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.SUCCESS).result(container).build();
		Result<ParserResult> resultCompany = basicInfoAllCompany();
		if (resultCompany.getStatus().equals(STATUS.SUCCESS)) {
			container.addAll(resultCompany.getResult());
		} else {
			result.setStatus(resultCompany.getStatus());
		}

		Result<ParserResult> resultEtf = basicInfoAllEtf();
		if (resultEtf.getStatus().equals(STATUS.SUCCESS)) {
			container.addAll(resultEtf.getResult());
		} else {
			result.setStatus(resultEtf.getStatus());
		}

		log.warn("{} 『{}』 basicInfoAll({}, #{}) - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목정보 > 전종목 기본정보
	private Result<ParserResult> basicInfoAllCompany() {
		log.debug("{} basicInfoAllCompany()", Utility.indentStart());
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			driver.navigate().to(URL_COMPANY_BASIC_INFO_ALL);

			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT_COMPANY_BASIC_INFO_ALL);
			for (String prev = ""; true;) {
				long forStarted = System.currentTimeMillis();

				WebElement tableElement = driver.findElement(By.xpath("//*[@id='jsMdiContent']/div/div[1]/div[1]/div[1]/div[2]/div/div/table"), TIMEOUT);
				sb.append(driver.getAttribute(tableElement, "textContent", "KEYWORD\t"));
				sb.append(MARK_ANDOLD_SINCE);

				List<WebElement> trs = tableElement.findElements(By.xpath("//tr"));
				WebElement lastTr = trs.get(trs.size() - 1);
				String curr = lastTr.getAttribute("textContent");
				if (prev.contentEquals(curr)) {
					break;
				}

				prev = curr;
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lastTr);
				driver.clickIfExist(By.xpath("//*[@id='jsViewSizeButton']"));

				log.debug("{} 『{}』 basicInfoAllCompany() - {}", Utility.indentMiddle(), Utility.ellipsisEscape(prev, 32), Utility.toStringPastTimeReadable(forStarted));
			}
			driver.quit();

			sb.append(MARK_START_END_POINT_COMPANY_BASIC_INFO_ALL);
			ParserResult result = ParserService.parse(new String(sb), CrawlerService.getDebug());

			log.debug("{} 『{}』 basicInfoAll() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
			return Result.<ParserResult>builder().status(STATUS.SUCCESS).result(result).build();
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
		}

		Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
		log.warn("{} 『{}』 basicInfoAllCompany() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 전종목 기본정보
	protected Result<ParserResult> basicInfoAllEtf() {
		log.debug("{} basicInfoAllEtf()", Utility.indentStart());
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			driver.navigate().to(URL_ETF_BASIC_INFO_ALL);

			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT_ETF_BASIC_INFO_ALL);
			for (String prev = ""; true;) {
				long forStarted = System.currentTimeMillis();

				WebElement tableElement = driver.findElement(By.xpath("//*[@id='jsMdiContent']/div/div[1]/div[1]/div[1]/div[2]/div/div/table"), TIMEOUT);
				sb.append(driver.getAttribute(tableElement, "textContent", "ETF\t"));
				sb.append(MARK_ANDOLD_SINCE);

				List<WebElement> trs = tableElement.findElements(By.xpath("//tr"));
				WebElement lastTr = trs.get(trs.size() - 1);
				String curr = lastTr.getAttribute("textContent");
				if (prev.contentEquals(curr)) {
					break;
				}

				prev = curr;
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lastTr);
				driver.clickIfExist(By.xpath("//*[@id='jsViewSizeButton']"));

				log.debug("{} 『{}』 basicInfoAllEtf() - {}", Utility.indentMiddle(), Utility.ellipsisEscape(prev, 32), Utility.toStringPastTimeReadable(forStarted));
			}
			driver.quit();

			sb.append(MARK_START_END_POINT_ETF_BASIC_INFO_ALL);
			ParserResult result = ParserService.parse(new String(sb), CrawlerService.getDebug());

			log.debug("{} 『{}』 basicInfoAllEtf() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
			return Result.<ParserResult>builder().status(STATUS.SUCCESS).result(result).build();
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
		}

		Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
		log.warn("{} 『{}』 basicInfoAllEtf() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> dividend(Date start) {
		log.error("{} 『{}』 dividend({})", Utility.indentMiddle(), "NOT SUPPORTED", start);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
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

	// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목정보 > 개별정보 종합정보
	protected Result<ParserResult> itemCompany(String code) {
		log.debug("{} itemCompany({})", Utility.indentStart(), code);
		long started = System.currentTimeMillis();

		if (code == null) {
			return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
		}

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			driver.navigate().to(URL_COMPANY_EACH_SUMMARY_INFO);

			// 종목명에 코드 검색 - 코드 입력
			WebElement keywordElement = driver.findElement(By.xpath("//*[@id='tboxisuCd_finder_stkisu0_0']"), TIMEOUT * 4);
			keywordElement.clear();
			keywordElement.sendKeys(code);
			keywordElement.sendKeys(Keys.TAB);

			// 1. 종목명에 코드 검색 - 검색 아이콘 클릭
			driver.findElement(By.xpath("//*[@id='btnisuCd_finder_stkisu0_0']"), TIMEOUT).click();

			// 자동으로 갔다 와야하는데 ....
			if (!driver.waitUntilExist(By.xpath("//div[@id='jsLayer_finder_stkisu0_0']"), true, TIMEOUT)) {
				driver.quit();
				Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.FAIL_NO_RESULT).build();
				log.debug("{} 『{}』 itemCompany({}) - {}", Utility.indentEnd(), result, code, Utility.toStringPastTimeReadable(started));
				return result;
			}
			if (!driver.waitUntilExist(By.xpath("//div[@id='jsLayer_finder_stkisu0_0']"), false, TIMEOUT)) {
				driver.quit();
				Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.FAIL_NO_RESULT).build();
				log.debug("{} 『{}』 itemCompany({}) - {}", Utility.indentEnd(), result, code, Utility.toStringPastTimeReadable(started));
				return result;
			}

			// 조회 클릭
			By BY_STANDARD_CODE = By.xpath("//*[@id='ovrvwGenBind']/tbody/tr[2]/td[1]/text()");	// 표준코드
			String previousStandardCode = driver.getText(BY_STANDARD_CODE, TIMEOUT, URL_COMPANY_EACH_SUMMARY_INFO);
			driver.findElement(By.xpath("//*[@id='jsSearchButton']"), TIMEOUT).click();
			driver.waitUntilTextNotInclude(BY_STANDARD_CODE, TIMEOUT, previousStandardCode);
			
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT_COMPANY_EACH_SUMMARY_INFO);
			
			// 타입	ex)  | KOSDAQ
			sb.append(String.format("KEYWORD\t%s\n", driver.getText(By.xpath("//*[@id='isuInfoTitle']/text()"), TIMEOUT, "-").replaceAll("[ \\|]+", "")));
			
			// 정보 테이블 출력
			WebElement tableElement = driver.findElement(By.xpath("//*[@id='ovrvwGenBind']"), TIMEOUT);
			sb.append(driver.extractTextContentFromTableElement(tableElement));
			sb.append(MARK_ANDOLD_SINCE);
			driver.quit();

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

	// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 개별종목 종합정보
	protected Result<ParserResult> itemEtf(String code) {
		log.debug("{} itemEtf({})", Utility.indentStart(), code);
		long started = System.currentTimeMillis();

		if (code == null) {
			return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
		}

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			driver.navigate().to(URL_ETF_EACH_SUMMARY_INFO);

			// 종목명에 코드 검색 - 코드 입력
			WebElement keywordElement = driver.findElement(By.xpath("//*[@id='tboxisuCd_finder_secuprodisu1_0']"), TIMEOUT * 4);
			keywordElement.clear();
			keywordElement.sendKeys(code);
			keywordElement.sendKeys(Keys.TAB);

			// 1. 종목명에 코드 검색 - 검색 아이콘 클릭
			driver.findElement(By.xpath("//*[@id='btnisuCd_finder_secuprodisu1_0']"), TIMEOUT).click();

			// 자동으로 갔다 와야하는데 ....
			if (!driver.waitUntilExist(By.xpath("//*[@id='jsLayer_finder_secuprodisu1_0']"), true, TIMEOUT)) {
				driver.quit();
				Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.FAIL_NO_RESULT).build();
				log.debug("{} 『{}』 itemEtf({}) - {}", Utility.indentEnd(), result, code, Utility.toStringPastTimeReadable(started));
				return result;
			}
			if (!driver.waitUntilExist(By.xpath("//div[@id='jsLayer_finder_secuprodisu1_0']"), false, TIMEOUT)) {
				driver.quit();
				Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.FAIL_NO_RESULT).build();
				log.debug("{} 『{}』 itemEtf({}) - {}", Utility.indentEnd(), result, code, Utility.toStringPastTimeReadable(started));
				return result;
			}

			// 조회 클릭
			By BY_STANDARD_CODE = By.xpath("//*[@id='jsGrid_MDCSTAT047_1']/tbody/tr[3]/td[1]/text()");	// 표준코드
			String previousStandardCode = driver.getText(BY_STANDARD_CODE, TIMEOUT, URL_ETF_EACH_SUMMARY_INFO);
			driver.findElement(By.xpath("//*[@id='jsSearchButton']"), TIMEOUT).click();
			driver.waitUntilTextNotInclude(BY_STANDARD_CODE, TIMEOUT, previousStandardCode);
			
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT_ETF_EACH_SUMMARY_INFO);

			// 종목명 약어 ex) TIGER 미국나스닥100커버드콜(합성) (441680)
			sb.append(String.format("KEYWORD\t%s\n", driver.getText(By.xpath("//*[@id='jsIdxInfo']/p/label"), TIMEOUT, "-")));

			// 테이블 전체 출력
			WebElement tableElement = driver.findElement(By.xpath("//*[@id='jsGrid_MDCSTAT047_1']"), TIMEOUT);
			sb.append(driver.extractTextContentFromTableElement(tableElement));
			driver.quit();

			sb.append(MARK_ANDOLD_SINCE);
			sb.append(MARK_START_END_POINT_ETF_EACH_SUMMARY_INFO);
			ParserResult result = ParserService.parse(new String(sb), CrawlerService.getDebug());

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
		log.info("{} price({}, {})", Utility.indentStart(), code, start);
		long started = System.currentTimeMillis();

		if (code == null || start == null) {
			log.warn("{} 『{}』 price({}, {}) - {}", Utility.indentEnd(), STATUS.EXCEPTION, code, start, Utility.toStringPastTimeReadable(started));
			return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
		}

		Result<ParserResult> resultCompany = priceCompany(code, start);
		if (resultCompany.getStatus().equals(STATUS.SUCCESS)) {
			log.info("{} 『{} price({}, {}) - {}", Utility.indentEnd(), resultCompany, code, start, Utility.toStringPastTimeReadable(started));
			return resultCompany;
		}

		Result<ParserResult> resultEtf = priceEtf(code, start);

		log.info("{} 『{} price({}, {}) - {}", Utility.indentEnd(), resultEtf, code, start, Utility.toStringPastTimeReadable(started));
		return resultEtf;
	}

	// KRX 정보데이터시스템 > 기본통계 > 주식 > 종목시세 > 개별종목 시세 추이 클릭
	protected Result<ParserResult> priceCompany(String code, Date start) {
		log.debug("{} priceCompany({}, {})", Utility.indentStart(), code, start);
		long started = System.currentTimeMillis();

		if (code == null || start == null) {
			log.debug("{} 『{}』 priceEtf({}, {}) - {}", Utility.indentEnd(), STATUS.EXCEPTION, code, start, Utility.toStringPastTimeReadable(started));
			return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
		}

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			driver.navigate().to(URL_PRICE_COMPANY_EACH);

			// 종목명에 코드 검색 - 코드 입력
			WebElement keywordElement = driver.findElement(By.xpath("//*[@id='tboxisuCd_finder_stkisu0_0']"), TIMEOUT * 4);
			keywordElement.clear();
			keywordElement.sendKeys(code);
			keywordElement.sendKeys(Keys.TAB);

			// 1. 종목명에 코드 검색 - 검색 아이콘 클릭
			driver.findElement(By.xpath("//*[@id='btnisuCd_finder_stkisu0_0']"), TIMEOUT).click();

			// 자동으로 갔다 와야하는데 ....
			if (!driver.waitUntilExist(By.xpath("//div[@id='jsLayer_finder_stkisu0_0']"), true, TIMEOUT)) {
				driver.quit();
				Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.FAIL_NO_RESULT).build();
				log.debug("{} 『{}』 priceCompany({}, {}) - {}", Utility.indentEnd(), result, code, start, Utility.toStringPastTimeReadable(started));
				return result;
			}
			if (!driver.waitUntilExist(By.xpath("//div[@id='jsLayer_finder_stkisu0_0']"), false, TIMEOUT)) {
				driver.quit();
				Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.FAIL_NO_RESULT).build();
				log.debug("{} 『{}』 priceCompany({}, {}) - {}", Utility.indentEnd(), result, code, start, Utility.toStringPastTimeReadable(started));
				return result;
			}

			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT_PRICE_COMPANY_EACH);

			// 2. 조회기간 설정, 2년 기간 제한이 없다, ETF만 있다
			WebElement startDateElement = driver.findElement(By.xpath("//*[@id='strdDd']"), TIMEOUT);
			startDateElement.clear();
			startDateElement.sendKeys(LocalDate.ofInstant(start.toInstant(), Utility.ZONE_ID_KST).format(DateTimeFormatter.BASIC_ISO_DATE)); // 조회기간 시작일
			startDateElement.sendKeys(Keys.TAB); // 시작일 입력
			
			// 조회 클릭
			driver.findElement(By.xpath("//*[@id='jsSearchButton']"), TIMEOUT).click();

			for (String prev = "";;) {
				long forStarted = System.currentTimeMillis();

				WebElement table = driver.findElement(By.xpath("//*[@id='jsMdiContent']/div/div[1]/div[1]/div[1]/div[2]/div/div/table"), TIMEOUT);
				sb.append(driver.getAttribute(table, "textContent", String.format("%s\t", code)));
				sb.append(MARK_ANDOLD_SINCE);

				List<WebElement> trs = table.findElements(By.xpath("//tr"));
				WebElement lastTr = trs.get(trs.size() - 1);
				String curr = lastTr.getAttribute("textContent");
				if (prev.contentEquals(curr)) {
					break;
				}

				prev = curr;
				((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lastTr);
				driver.clickIfExist(By.xpath("//*[@id='jsViewSizeButton']"));

				log.debug("{} 『{}』 priceCompany({}, {}) - {}", Utility.indentMiddle(), Utility.ellipsisEscape(prev, 32), code, start, Utility.toStringPastTimeReadable(forStarted));
			}
			driver.quit();
			
			sb.append(MARK_START_END_POINT_PRICE_COMPANY_EACH);
			ParserResult result = ParserService.parse(new String(sb), CrawlerService.getDebug());

			log.debug("{} 『{}』 priceCompany({}, {}) - {}", Utility.indentEnd(), result, code, start, Utility.toStringPastTimeReadable(started));
			return Result.<ParserResult>builder().status(STATUS.SUCCESS).result(result).build();
		
		} catch (Exception e) {
			driver.quit();
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		log.debug("{} 『{}』 priceCompany({}, {}) - {}", Utility.indentEnd(), STATUS.EXCEPTION, code, start, Utility.toStringPastTimeReadable(started));
		return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
	}

	// KRX 정보데이터시스템 > 기본통계 > 증권상품 > ETF > 개별종목 시세 추이
	protected Result<ParserResult> priceEtf(String code, Date start) {
		log.debug("{} priceEtf({}, {})", Utility.indentStart(), code, start);
		long started = System.currentTimeMillis();

		if (code == null || start == null) {
			log.debug("{} 『{}』 priceEtf({}, {}) - {}", Utility.indentEnd(), STATUS.EXCEPTION, code, start, Utility.toStringPastTimeReadable(started));
			return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
		}

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			driver.navigate().to(URL_PRICE_ETF_EACH);

			// 종목명에 코드 검색 - 코드 입력
			WebElement keywordElement = driver.findElement(By.xpath("//*[@id='tboxisuCd_finder_secuprodisu1_0']"), TIMEOUT);
			keywordElement.clear();
			keywordElement.sendKeys(code);
			keywordElement.sendKeys(Keys.TAB);

			// 1. 종목명에 코드 검색 - 검색 아이콘 클릭
			driver.findElement(By.xpath("//*[@id='btnisuCd_finder_secuprodisu1_0']"), TIMEOUT).click();

			// 자동으로 갔다 와야하는데 ....
			if (!driver.waitUntilExist(By.xpath("//*[@id='jsLayer_finder_secuprodisu1_0']"), true, TIMEOUT)) {
				driver.quit();
				Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.FAIL_NO_RESULT).build();
				log.debug("{} 『{}』 priceEtf({}, {}) - {}", Utility.indentEnd(), result, code, start, Utility.toStringPastTimeReadable(started));
				return result;
			}
			if (!driver.waitUntilExist(By.xpath("//div[@id='jsLayer_finder_secuprodisu1_0']"), false, TIMEOUT)) {
				driver.quit();
				Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.FAIL_NO_RESULT).build();
				log.debug("{} 『{}』 priceEtf({}, {}) - {}", Utility.indentEnd(), result, code, start, Utility.toStringPastTimeReadable(started));
				return result;
			}

			// 2. 조회기간 설정, 2년 기간 제한이 있다 ETF만 있다
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT_PRICE_ETF_EACH);
			for (LocalDate cx = LocalDate.now(), startLocalDate = LocalDate.ofInstant(start.toInstant(), Utility.ZONE_ID_KST);
					cx.isAfter(startLocalDate);
					cx = cx.minusYears(2)) {

				String endDateString = cx.format(DateTimeFormatter.BASIC_ISO_DATE);
				String startDateString = cx.minusYears(2).plusDays(1).format(DateTimeFormatter.BASIC_ISO_DATE);
				WebElement startDateElement = driver.findElement(By.xpath("//*[@id='strtDd']"), TIMEOUT);

				startDateElement.clear();
				startDateElement.sendKeys(startDateString); // 조회기간 시작일
				startDateElement.sendKeys(Keys.TAB); // 시작일 입력
		
				WebElement endDateElement = driver.findElement(By.xpath("//*[@id='endDd']"), TIMEOUT);
				endDateElement.clear();
				endDateElement.sendKeys(endDateString); // 조회기간 종료일
				endDateElement.sendKeys(Keys.TAB); // 종료일 입력
				
				// 조회 클릭
				driver.findElement(By.xpath("//*[@id='jsSearchButton']"), TIMEOUT).click();

				for (String prev = "";;) {
					long forStarted = System.currentTimeMillis();

					WebElement table = driver.findElement(By.xpath("//*[@id='jsMdiContent']/div/div[1]/div[1]/div[1]/div[2]/div/div/table"), TIMEOUT);
					sb.append(driver.getAttribute(table, "textContent", String.format("%s\t", code)));
					sb.append(MARK_ANDOLD_SINCE);

					String curr = driver.getAttributeLast(By.xpath("//*[@id='jsMdiContent']/div/div[1]/div[1]/div[1]/div[2]/div/div/table//tr"), "textContent", TIMEOUT, "");
					if (prev.contentEquals(curr)) {
						break;
					}

					prev = curr;

					List<WebElement> trs = table.findElements(By.xpath("//tr"));
					WebElement lastTr = trs.get(trs.size() - 1);
					((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lastTr);
					driver.clickIfExist(By.xpath("//*[@id='jsViewSizeButton']"));

					log.debug("{} 『{}』 priceEtf({}, {}) - {}", Utility.indentEnd(), Utility.ellipsisEscape(prev, 32), code, start, Utility.toStringPastTimeReadable(forStarted));
				}
			}
			driver.quit();

			sb.append(MARK_START_END_POINT_PRICE_ETF_EACH);
			ParserResult result = ParserService.parse(new String(sb), CrawlerService.getDebug());

			log.debug("{} 『{}』 priceEtf({}, {}) - {}", Utility.indentEnd(), result, code, start, Utility.toStringPastTimeReadable(started));
			return Result.<ParserResult>builder().status(STATUS.SUCCESS).result(result).build();
		
		} catch (Exception e) {
			driver.quit();
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		log.debug("{} 『{}』 priceEtf({}, {}) - {}", Utility.indentEnd(), STATUS.EXCEPTION, code, start, Utility.toStringPastTimeReadable(started));
		return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
	}

}
