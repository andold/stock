package kr.andold.stock.crawler;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class Kind implements Crawler {
	private static final int TIMEOUT = 4000;

	// KIND > 투자유의사항 > 기타사항 > 상장폐지현황
	private static final String URL_COMPANY_EACH_SUMMARY_INFO = "https://kind.krx.co.kr/investwarn/delcompany.do?method=searchDelCompanyMain";

	// KIND > 투자유의사항 > 기타사항 > 상장폐지현황
	@Override
	public Result<ParserResult> basicInfoAll() {
		log.debug("{} basicInfoAll()", Utility.indentStart());
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			driver.navigate().to(URL_COMPANY_EACH_SUMMARY_INFO);
			String parent = driver.getWindowHandle();

			By BY_COUNT = By.xpath("//*[@id='main-contents']/section[@class='paging-group']/div[@class='info type-00']/em");
			driver.waitUntilTextNotInclude(BY_COUNT, TIMEOUT, "0");
			By BY_CURRENT_PAGE = By.xpath("//*[@id='main-contents']/section[@class='paging-group']/div[@class='paging type-00']/a[@class='active']");

			long pause = 4000;
			String previousCode = "-";
			ParserResult result = ParserResult.builder().build().clear();
			List<ItemDomain> items = new ArrayList<>();
			result.setItems(items);
			for(String cx = "0";;) {
				long forStarted = System.currentTimeMillis();

				List<WebElement> trs = driver.findElements(By.xpath("//*[@id='main-contents']/section[1]/table/tbody/tr"), TIMEOUT);
				for (WebElement tr : trs) {
					WebElement link = tr.findElement(By.xpath("td[2]/a"));
					String date = tr.findElement(By.xpath("td[3]")).getText();
					link.click();
					Set<String> handles = driver.getWindowHandles();
					for (String child : handles) {
						if (parent.equals(child)) {
							continue;
						}

						driver.switchTo().window(child);
						String content = driver.getText(By.xpath("/html/body/form/section/div/table[1]/tbody/tr[3]/td[2]/strong"), TIMEOUT, previousCode);
						if (content.strip().endsWith("상장폐지")) {
							String code = driver.getText(By.xpath("/html/body/form/section/div/table[1]/tbody/tr[2]/td[2]"), TIMEOUT, null);
							items.add(ItemDomain.builder().code(code).ipoClose(Utility.parseDateTime(date, null)).build());
							previousCode = code;
						}
						driver.close();

						if (System.currentTimeMillis() - forStarted > 1024 * 8) {
							pause = Math.max(32, pause / 2);
						} else {
							pause = Math.min(1024 * 8, pause * 2);
						}
						Utility.sleep(Math.round(pause * Math.random()));
					}
					driver.switchTo().window(parent);
				}
				
				// next
				driver.findElement(By.xpath("//*[@id='main-contents']/section[@class='paging-group']/div[@class='paging type-00']/a[@class='next']"), TIMEOUT).click();
				driver.waitUntilTextNotInclude(BY_CURRENT_PAGE, TIMEOUT, cx);

				String currentPage = driver.getText(BY_CURRENT_PAGE, TIMEOUT, "-1");
				if (currentPage.equalsIgnoreCase(cx)) {
					break;
				}
				cx = currentPage;

				log.debug("{} 『{}』 basicInfoAll() - {}", Utility.indentMiddle(), cx, Utility.toStringPastTimeReadable(forStarted));
			}
			driver.quit();

			log.debug("{} 『{}』 basicInfoAll() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
			return Result.<ParserResult>builder().status(STATUS.SUCCESS).result(result).build();
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
		}

		Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
		log.warn("{} 『{}』 basicInfoAll() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	@Override
	public Result<ParserResult> dividend(ItemDomain item, Date start) {
		log.error("{} 『{}』 dividend({}, {})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, item, start);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> price(Date date) {
		log.error("{} 『{}』 price({})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, date);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> price(String code, Date start) {
		log.error("{} 『{}』 price({}, {})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, code, start);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> dividend(Date start) {
		log.error("{} 『{}』 dividend({})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, start);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> item(String code) {
		log.error("{} 『{}』 item({}})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, code);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> price(ItemDomain item, List<DividendHistoryDomain> histories) {
		log.error("{} 『{}』 price({}, #{})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, item, Utility.size(histories));
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

}
