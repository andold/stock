package kr.andold.stock.crawler;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.ParserService;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.utils.ChromeDriverWrapper;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class Naver implements Crawler {
	private static final String MARK_ANDOLD_SINCE = CrawlerService.MARK_ANDOLD_SINCE;
	private static final Duration DEFAULT_TIMEOUT_DURATION = Duration.ofSeconds(4);
	private static final Duration DEFAULT_TIMEOUT_DURATION_LONG = Duration.ofMinutes(1);

	// Naver 증권 > 국내증시 > 주요시세정보 > ETF
	private static final String URL_PRICE_ETF_CURRENT = "https://finance.naver.com/sise/etf.naver";
	private static final String MARK_START_END_POINT_PRICE_ETF_CURRENT = String.format("KEYWORD\t%s\t%s\t%s\n", "Naver", "주식 > 종목전체검색 > 주식종목전체검색", URL_PRICE_ETF_CURRENT);

	@Override
	public Result<ParserResult> item(Date start) {
		log.error("{} 『{}』 item({})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, start);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> basicInfoAll() {
		log.error("{} {} basicInfoAll()", Utility.indentMiddle(), STATUS.NOT_SUPPORT);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> dividend(String code, Date start) {
		log.error("{} {} dividend({}, {})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, code, start);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> price(Date date) {
		log.info("{} price({})", Utility.indentStart(), date);
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		driver.manage().timeouts().implicitlyWait(DEFAULT_TIMEOUT_DURATION);
		try {
			driver.navigate().to(URL_PRICE_ETF_CURRENT);

			// 내용 저장
			String today = LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_START_END_POINT_PRICE_ETF_CURRENT);

			WebElement table = driver.findElement(By.xpath("//*[@id='contentarea']/div[3]/table"), DEFAULT_TIMEOUT_DURATION_LONG);
			List<WebElement> trs = table.findElements(By.tagName("tr"));
			for (WebElement tr: trs) {
				sb.append(today);
				sb.append("\t");
				List<WebElement> tds = tr.findElements(By.xpath("th | td"));
				for (WebElement td: tds) {
					List<WebElement> aElements = driver.findElements(td, By.tagName("a"));
					if (aElements != null) {
						for (WebElement e : aElements) {
							String href = e.getAttribute("href");
							String[] strings = href.split("=");
							if (strings.length > 1) {
								sb.append(strings[1]);
							} else {
								sb.append(href);
							}
							sb.append("\t");
						}
					}
					sb.append(td.getText());
					sb.append("\t");
				}
				sb.append("\n");
			}
			sb.append(MARK_ANDOLD_SINCE);
			driver.quit();
			sb.append(MARK_START_END_POINT_PRICE_ETF_CURRENT);

			ParserResult parserResult = ParserService.parse(new String(sb), CrawlerService.getDebug());
			Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.SUCCESS).result(parserResult).build();

			log.info("{} 『{}』 price({}) - {}", Utility.indentEnd(), result, date, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
		}

		log.warn("{} 『{}』 price({}) - {}", Utility.indentEnd(), STATUS.EXCEPTION, date, Utility.toStringPastTimeReadable(started));
		return Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
	}

	@Override
	public Result<ParserResult> price(String code, Date start) {
		log.error("{} {} price({}, {})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, code, start);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> dividend(Date start) {
		log.error("{} {} dividend({})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, start);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> item(String code) {
		log.error("{} {} item({})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, code);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> price(ItemDomain item, List<DividendHistoryDomain> histories) {
		log.error("{} {} price({}, #{})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, item, Utility.size(histories));
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

}
