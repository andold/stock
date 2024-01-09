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

	private static final String URL_PRICE_COMPANY_ALL = "http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201020101";
	private static final String URL_PRICE_ETF_ALL = "http://data.krx.co.kr/contents/MDC/MDI/mdiLoader/index.cmd?menuId=MDC0201030101";
	private static final String MARK_START_END_POINT_PRICE_COMPANY_ALL = String.format("KEYWORD\t%s\t%s\t%s\n", "KRX", "주식 > 종목시세 > 전종목 시세", URL_PRICE_COMPANY_ALL);
	private static final String MARK_START_END_POINT_PRICE_ETF_ALL = String.format("KEYWORD\t%s\t%s\t%s\n", "KRX", "ETF > 전종목 시세", URL_PRICE_ETF_ALL);

	private static final String MARK_ANDOLD_SINCE = CrawlerService.MARK_ANDOLD_SINCE;
	private static final int TIMEOUT = 4000;
	private static final Boolean debug = CrawlerService.debug;

	@Override
	public Result<ParserResult> dividend(ItemDomain item, Date start) {
		log.error("{} {} dividend({}, {})", Utility.indentMiddle(), "NOT SUPPORTED", item, start);
		return null;
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
				log.warn("{} 『{}』 initPriceAsEtf({}, #{}) - {}", Utility.indentEnd(), result, item, Utility.toStringPastTimeReadable(started));
				return result;
			}
			if (!driver.waitUntilExist(By.xpath("//div[@id='jsLayer_finder_secuprodisu1_1']"), false, TIMEOUT)) {
				driver.quit();
				Result<ChromeDriverWrapper> result = Result.<ChromeDriverWrapper>builder().status(STATUS.FAIL_NO_RESULT).build();
				log.warn("{} 『{}』 initPriceAsEtf({}, #{}) - {}", Utility.indentEnd(), result, item, Utility.toStringPastTimeReadable(started));
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

			WebElement startDateElement = driver.findElement(By.xpath("//*[@id='strtDd']"), TIMEOUT);
			startDateElement.clear();
			String startDateString = date.minusWeeks(2).format(DateTimeFormatter.ofPattern("YYYYMMdd"));
			startDateElement.sendKeys(startDateString); // 조회기간 시작일
			startDateElement.sendKeys(Keys.TAB); // 시작일 입력
	
			WebElement endDateElement = driver.findElement(By.xpath("//*[@id='endDd']"), TIMEOUT);
			endDateElement.clear();
			String endDateString = date.format(DateTimeFormatter.ofPattern("YYYYMMdd"));
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
			ParserResult result = ParserService.parse(new String(sb), debug);

			log.debug("{} 『{}』 priceAsEtf(..., {}, {}) - {}", Utility.indentEnd(), result, item, history, Utility.toStringPastTimeReadable(started));
			return Result.<ParserResult>builder().status(STATUS.SUCCESS).result(result).build();
		
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.switchTo().defaultContent();
		}

		log.debug("{} 『{}』 priceAsEtf(..., {}, {}) - {}", Utility.indentEnd(), "EXCEPTION", item, history, Utility.toStringPastTimeReadable(started));
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
			driver.navigate().to(URL);
			Actions actions = new Actions(driver);

			// 1. KRX 정보데이터시스템 > 기본통계 > 주식 > 종목시세 > 개별종목 시세 추이 클릭
			driver.waitUntilTextInclude(By.xpath("//*[@id='jsMainLnbWrap']/ol[1]/li[2]/ol/li[1]/a"), TIMEOUT * 4, "종목시세");
			actions.moveToElement(driver.findElement(By.xpath("//aside[@id='jsMainLnbWrap']/ol/li/ol/li/a[contains(text(),'종목시세')]"), TIMEOUT));
			actions.moveToElement(driver.findElement(By.xpath("//aside[@id='jsMainLnbWrap']/ol/li/ol/li/div/ul/li/a[contains(text(),'개별종목 시세 추이')]"), TIMEOUT));
			actions.click().build().perform();
			
			// 종목명에 코드 검색 - 코드 입력
			WebElement keywordElement = driver.findElement(By.xpath("//*[@id='tboxisuCd_finder_stkisu0_0']"), TIMEOUT);
			keywordElement.clear();
			keywordElement.sendKeys(item.getCode());
			keywordElement.sendKeys(Keys.TAB);

			// 1. 종목명에 코드 검색 - 검색 아이콘 클릭
			driver.findElement(By.xpath("//*[@id='btnisuCd_finder_stkisu0_0']"), TIMEOUT).click();

			// 자동으로 갔다 와야하는데 ....
			if (!driver.waitUntilExist(By.xpath("//div[@id='jsLayer_finder_stkisu0_0']"), true, TIMEOUT)) {
				driver.quit();
				Result<ChromeDriverWrapper> result = Result.<ChromeDriverWrapper>builder().status(STATUS.FAIL_NO_RESULT).build();
				log.warn("{} 『{}』 initPriceAsCompany({}, #{}) - {}", Utility.indentEnd(), result, item, Utility.toStringPastTimeReadable(started));
				return result;
			}
			if (!driver.waitUntilExist(By.xpath("//div[@id='jsLayer_finder_stkisu0_0']"), false, TIMEOUT)) {
				driver.quit();
				Result<ChromeDriverWrapper> result = Result.<ChromeDriverWrapper>builder().status(STATUS.FAIL_NO_RESULT).build();
				log.warn("{} 『{}』 initPriceAsCompany({}, #{}) - {}", Utility.indentEnd(), result, item, Utility.toStringPastTimeReadable(started));
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

			WebElement startDateElement = driver.findElement(By.xpath("//*[@id='strdDd']"), TIMEOUT);
			startDateElement.clear();
			String startDateString = date.minusWeeks(2).format(DateTimeFormatter.ofPattern("YYYYMMdd"));
			startDateElement.sendKeys(startDateString); // 조회기간 시작일
			startDateElement.sendKeys(Keys.TAB); // 시작일 입력
	
			WebElement endDateElement = driver.findElement(By.xpath("//*[@id='endDd']"), TIMEOUT);
			endDateElement.clear();
			String endDateString = date.format(DateTimeFormatter.ofPattern("YYYYMMdd"));
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
			ParserResult result = ParserService.parse(new String(sb), debug);

			log.debug("{} 『{}』 priceAsCompany(..., {}, {}) - {}", Utility.indentEnd(), result, item, history, Utility.toStringPastTimeReadable(started));
			return Result.<ParserResult>builder().status(STATUS.SUCCESS).result(result).build();
		
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.switchTo().defaultContent();
		}

		log.debug("{} 『{}』 priceAsCompany(..., {}, {}) - {}", Utility.indentEnd(), "EXCEPTION", item, history, Utility.toStringPastTimeReadable(started));
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
				dateElement.clear();
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

			ParserResult parserResult = ParserService.parse(new String(sb), debug);
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
				dateElement.clear();
				dateElement.sendKeys(String.format("%1$tY%1$tm%1$td\t", date));
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

			ParserResult parserResult = ParserService.parse(new String(sb), debug);
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

}
