package kr.andold.stock.crawler;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
	//	KIND > 공시 > 상세검색
	private static final String URL_SEARCH_DETAIL = "https://kind.krx.co.kr/disclosure/details.do?method=searchDetailsMain";

	@Override
	public Result<ParserResult> item(Date start) {
		return itemBySearchDetail(start);
	}

	// KIND > 투자유의사항 > 기타사항 > 상장폐지현황
	protected Result<ParserResult> itemByIpoCloseStatus(Date start) {
		log.info("{} itemByIpoCloseStatus({})", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			driver.navigate().to(URL_COMPANY_EACH_SUMMARY_INFO);
			String parent = driver.getWindowHandle();
			
			//	footer	/html/body/footer
			By BY_FOOTER = By.xpath("/html/body/footer");
			driver.presenceOfElementLocated(BY_FOOTER, Duration.ofMinutes(1));
			log.info("{} itemByIpoCloseStatus({}) - 『{}』", Utility.indentMiddle(), start, Utility.ellipsisEscape(driver.getText(BY_FOOTER), 32, 32));
			
			//	기간 시작일	//*[@id="fromDate"]
			By BY_FROM_DATE = By.xpath("//*[@id='fromDate']");
			driver.presenceOfElementLocated(BY_FROM_DATE);
			driver.findElement(BY_FROM_DATE).clear();
			driver.findElement(BY_FROM_DATE).sendKeys(String.format("%1$tY%1$tm%1$td", start));
			log.info("{} itemByIpoCloseStatus({}) - 『{}』", Utility.indentMiddle(), start, driver.getText(BY_FROM_DATE));
			
			//	건수	//*[@id="main-contents"]/section[2]/div[2]	//*[@id="currentPageSize"]
			By BY_CURRENT_PAGE_SIZE = By.xpath("//*[@id='main-contents']/section[2]//*[@id='currentPageSize']");
			new Select(driver.findElement(BY_CURRENT_PAGE_SIZE)).selectByVisibleText("100건");
			log.info("{} itemByIpoCloseStatus({}) - 『{}』", Utility.indentMiddle(), start, Utility.ellipsisEscape(driver.getText(BY_CURRENT_PAGE_SIZE), 32, 32));
			
			//	검색	//*[@id="searchForm"]/section/div/div[3]/a[1]
			By BY_SEARCH = By.xpath("//*[@id='searchForm']/section/div/div[3]/a[@title='검색']");
			driver.elementToBeClickable(BY_SEARCH);
			driver.findElement(BY_SEARCH).click();
			log.info("{} itemByIpoCloseStatus({}) - 『{}』", Utility.indentMiddle(), start, driver.getText(BY_SEARCH));

			By BY_COUNT = By.xpath("//*[@id='main-contents']/section[@class='paging-group']/div[@class='info type-00']/em");
			driver.waitUntilTextNotInclude(BY_COUNT, TIMEOUT, "0");
			By BY_CURRENT_PAGE = By.xpath("//*[@id='main-contents']/section[@class='paging-group']/div[@class='paging type-00']/a[@class='active']");
			log.info("{} itemByIpoCloseStatus({}) - 『{}』『{}』", Utility.indentMiddle(), start, driver.getText(BY_COUNT), driver.getText(BY_CURRENT_PAGE));

			String previousCode = "-";
			long pause = 4000;
			ParserResult result = ParserResult.builder().build().clear();
			List<ItemDomain> items = new ArrayList<>();
			result.setItems(items);
			Date currentDate = new Date();;
			for(String cx = "0";;) {
				driver.switchTo().window(parent);
				String currentPage = driver.getText(BY_CURRENT_PAGE, TIMEOUT, cx);
				log.info("{} itemByIpoCloseStatus({}) - 『{}』", Utility.indentMiddle(), start, currentPage);
				if (currentPage.equalsIgnoreCase(cx) || start.after(currentDate)) {
					break;
				}
				cx = currentPage;

				List<WebElement> trs_ = driver.findElements(By.xpath("//*[@id='main-contents']/section[1]/table/tbody/tr"), TIMEOUT);
				for (int cy = 0, sizey = trs_.size(); cy < sizey; cy++) {
					long forStarted = System.currentTimeMillis();

					driver.switchTo().window(parent);
					List<WebElement> trs = driver.findElements(By.xpath("//*[@id='main-contents']/section[1]/table/tbody/tr"), TIMEOUT);
					WebElement tr = trs.get(cy);			
					WebElement link = tr.findElement(By.xpath("td[2]/a"));
					WebElement dateElement = driver.findElement(tr, By.xpath("td[3]"), TIMEOUT);
					if (dateElement == null) {
						break;
					}
					log.info("{} itemByIpoCloseStatus({}) - 『{}』", Utility.indentMiddle(), start, dateElement.getText());

					String date = dateElement.getText();
					currentDate = Utility.parseDateTime(date, null);
					if (start.after(currentDate)) {
						break;
					}

					String symbol = link.getText();
					log.info("{} itemByIpoCloseStatus({}) - 『{}』", Utility.indentMiddle(), start, symbol);
					link.click();
					Set<String> handles = driver.getWindowHandles();
					for (String child : handles) {

						if (parent.equals(child)) {
							continue;
						}

						driver.switchTo().window(child);
						String content = driver.getText(By.xpath("/html/body/form/section/div/table[1]/tbody/tr[3]/td[2]/strong"), TIMEOUT * 4, previousCode);
						if (content.strip().endsWith("상장폐지")) {
							String code = driver.getText(By.xpath("/html/body/form/section/div/table[1]/tbody/tr[2]/td[2]"), TIMEOUT, null);
							log.info("{} itemByIpoCloseStatus({}) - 『{}』", Utility.indentMiddle(), start, Utility.ellipsisEscape(code, 32, 32));
							items.add(ItemDomain.builder().code(code).ipoClose(Utility.parseDateTime(date, null)).build());
							previousCode = code;
						}
						if (System.currentTimeMillis() - forStarted > 1024 * 8) {
							pause = Math.max(32, pause / 2);
						} else {
							pause = Math.min(1024 * 8, pause * 2);
						}
						Utility.sleep(Math.round(pause * Math.random()));

						driver.close();
					}
					log.debug("{} 『{}/{}/{} {}』 itemByIpoCloseStatus({}) - {}", Utility.indentMiddle(), cx, cy, date, symbol, start, Utility.toStringPastTimeReadable(forStarted));
				}
				
				// next
				driver.switchTo().window(parent);
				driver.findElement(By.xpath("//*[@id='main-contents']/section[@class='paging-group']/div[@class='paging type-00']/a[@class='next']"), TIMEOUT).click();
				driver.waitUntilTextNotInclude(BY_CURRENT_PAGE, TIMEOUT, cx);

				log.debug("{} 『{}』 itemByIpoCloseStatus({}) - {}", Utility.indentMiddle(), cx, start, Utility.toStringPastTimeReadable(started));
			}
			driver.quit();

			log.debug("{} 『{}』 itemByIpoCloseStatus({}) - {}", Utility.indentEnd(), result, start, Utility.toStringPastTimeReadable(started));
			return Result.<ParserResult>builder().status(STATUS.SUCCESS).result(result).build();
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
		}

		Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
		log.warn("{} 『{}』 itemByIpoCloseStatus({}) - {}", Utility.indentEnd(), result, start, Utility.toStringPastTimeReadable(started));
		return result;
	}

	//	상세검색:: 홈 > 공시 > 상세검색	https://kind.krx.co.kr/disclosure/details.do?method=searchDetailsMain
	private Result<ParserResult> itemBySearchDetail(Date start) {
		log.info("{} itemBySearchDetail({})", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			driver.navigate().to(URL_SEARCH_DETAIL);
			String parent = driver.getWindowHandle();
			
			//	footer	/html/body/footer
			By BY_FOOTER = By.xpath("/html/body/footer");
			driver.presenceOfElementLocated(BY_FOOTER, Duration.ofMinutes(1));
			log.info("{} itemBySearchDetail({}) - 『{}』", Utility.indentMiddle(), start, Utility.ellipsisEscape(driver.getText(BY_FOOTER), 32, 32));

			//	기간 시작일	//*[@id="fromDate"]
			By BY_FROM_DATE = By.xpath("//*[@id='fromDate']");
			driver.presenceOfElementLocated(BY_FROM_DATE);
			driver.findElement(BY_FROM_DATE).clear();
//			driver.findElement(BY_FROM_DATE).sendKeys(String.format("%1$tY-%1$tm-%1$td", start));
//			driver.findElement(By.xpath("//body")).sendKeys("");
			driver.setInputValue(BY_FROM_DATE, String.format("%1$tY-%1$tm-%1$td", start));
			log.info("{} itemBySearchDetail({}) - 『{}』", Utility.indentMiddle(), start, driver.getText(BY_FROM_DATE));

			//	보고서명	//*[@id="reportNmTemp"]
			By BY_REPOTER_NAME = By.xpath("//*[@id='reportNmTemp']");
			driver.presenceOfElementLocated(BY_REPOTER_NAME);
			driver.findElement(BY_REPOTER_NAME).clear();
//			driver.findElement(BY_REPOTER_NAME).sendKeys("상장폐지");
			driver.setInputValue(BY_REPOTER_NAME, "상장폐지");
			log.info("{} itemBySearchDetail({}) - 『{}』", Utility.indentMiddle(), start, driver.getText(BY_REPOTER_NAME));

			//	건수	//*[@id="main-contents"]/section[2]/div[2]	//*[@id="currentPageSize"]
			By BY_CURRENT_PAGE_SIZE = By.xpath("//*[@id='main-contents']/section[2]//*[@id='currentPageSize']");
			driver.presenceOfElementLocated(BY_CURRENT_PAGE_SIZE);
			new Select(driver.findElement(BY_CURRENT_PAGE_SIZE)).selectByVisibleText("100건");
			log.info("{} itemBySearchDetail({}) - 『{}』", Utility.indentMiddle(), start, Utility.ellipsisEscape(driver.getText(BY_CURRENT_PAGE_SIZE), 32, 32));

			//	전체 n건	//*[@id="main-contents"]/section[2]/div[2]/em
			By BY_COUNT = By.xpath("//*[@id='main-contents']/section[@class='paging-group']/div[@class='info type-00']/em");
			String markOnCount = Double.toString(Math.random());
			driver.setText(BY_COUNT, markOnCount, 1000);

			//	검색	//*[@id="searchForm"]/section/div/div[3]/a[1]
			By BY_SEARCH = By.xpath("//*[@id='searchForm']/section/div/div[3]/a[@title='검색']");
			driver.elementToBeClickable(BY_SEARCH);
			driver.findElement(BY_SEARCH).click();
			log.info("{} itemBySearchDetail({}) - 『{}』", Utility.indentMiddle(), start, driver.getText(BY_SEARCH));

			//	자료를 조회 중입니다.	//*[@id="ui-id-1"]
//			By BY_SEARCH_PROGRESS = By.xpath("//*[@id='ui-id-1']");
			By BY_SEARCH_PROGRESS = By.xpath("//div[@aria-labelledby='ui-id-1']");
			driver.invisibilityOfElementLocated(BY_SEARCH_PROGRESS, Duration.ofMinutes(1));

			driver.waitUntilTextNotInclude(BY_COUNT, TIMEOUT, markOnCount);
			log.info("{} itemBySearchDetail({}) - 『{} vs {}』", Utility.indentMiddle(), start, markOnCount, driver.getText(BY_SEARCH));

			//	현재 페이지	//*[@id="main-contents"]/section[2]/div[1]/a[3]
			By BY_CURRENT_PAGE = By.xpath("//*[@id='main-contents']/section[@class='paging-group']/div[@class='paging type-00']/a[@class='active']");
			log.info("{} itemBySearchDetail({}) - 『{}』『{}』", Utility.indentMiddle(), start, driver.getText(BY_COUNT), driver.getText(BY_CURRENT_PAGE));

			Map<String, String> mapAlready = new HashMap<>();
			long pause = 4000;
			ParserResult result = ParserResult.builder().build().clear();
			List<ItemDomain> items = new ArrayList<>();
			result.setItems(items);
			Date currentDate = new Date();
			for(String cx = "0";;) {
				driver.switchTo().window(parent);
				String currentPage = driver.getText(BY_CURRENT_PAGE);
				log.info("{} itemBySearchDetail({}) - 『{} vs {}』", Utility.indentMiddle(), start, cx, currentPage);
				if (currentPage.equalsIgnoreCase(cx) || start.after(currentDate)) {
					break;
				}
				cx = currentPage;

				//	라인	//*[@id="main-contents"]/section[1]/table/tbody/tr[1]
				By BY_TRS = By.xpath("//*[@id='main-contents']/section[1]/table/tbody/tr");
				List<WebElement> trs_ = driver.findElements(BY_TRS);
				for (int cy = 0, sizey = trs_.size(); cy < sizey; cy++) {
					long forStarted = System.currentTimeMillis();

					driver.switchTo().window(parent);
					List<WebElement> trs = driver.findElements(BY_TRS);
					WebElement tr = trs.get(cy);
					
					//	상장폐지 아이콘	//*[@id="main-contents"]/section[1]/table/tbody/tr[40]/td[3]/img[2]
					By BY_IPO_CLOSE_ICON = By.xpath("td[3]/img[@alt='상장폐지']");
					if (!driver.isDisplayed(tr, BY_IPO_CLOSE_ICON)) {
						log.info("{} itemBySearchDetail({}) - 『{}』『{}/{}』『{}』", Utility.indentMiddle(), start, cx, cy, sizey, driver.getText(tr, BY_IPO_CLOSE_ICON));
						continue;
					}

					//	날짜
					By BY_DATE = By.xpath("td[2]");
					WebElement dateElement = tr.findElement(BY_DATE);
					if (dateElement == null) {
						log.info("{} itemBySearchDetail({}) - 『{}』『{}/{}』『{}』", Utility.indentMiddle(), start, cx, cy, sizey, driver.getText(tr, BY_DATE));
						break;
					}

					String date = dateElement.getText();
					currentDate = Utility.parseDateTime(date, null);
					if (start.after(currentDate)) {
						log.info("{} itemBySearchDetail({}) - 『{}』『{}/{}』『{} vs {}』 {}", Utility.indentMiddle(), start, cx, cy, sizey, start, currentDate, date);
						break;
					}

					//	링크
					By BY_LINK = By.xpath("td[3]/a");
					WebElement link = tr.findElement(BY_LINK);
					String symbol = link.getText();
					if (mapAlready.get(symbol) != null) {
						// 이미 처리한 내용
						log.info("{} itemBySearchDetail({}) - 『이미 처리한 내용』『{}』『{}/{}』『{}』", Utility.indentMiddle(), start, cx, cy, sizey, symbol);
						continue;
					}
					link.click();	//	new popup window
					Set<String> handles = driver.getWindowHandles();
					for (int cz = 0; cz < 8; cz++) {
						if (handles.size() > 1) {
							break;
						}

						Utility.sleep(1000);
						handles = driver.getWindowHandles();
					}

					for (String child : handles) {
						if (parent.equals(child)) {
							continue;
						}

						driver.switchTo().window(child);

						//	시장구분
						By BY_CLASS_MARKET = By.xpath("/html/body/form/section/div/table[1]/tbody/tr[3]/td[2]/strong");
						driver.visibilityOfElementLocated(BY_CLASS_MARKET, Duration.ofMinutes(1));
						String content = driver.getText(BY_CLASS_MARKET);
						log.info("{} itemBySearchDetail({}) - 『{}』『{}/{}』『{} {} {}』", Utility.indentMiddle(), start, cx, cy, sizey, symbol, date, content);

						if (content.strip().endsWith("상장폐지")) {
							//	코드
							By BY_CODE = By.xpath("//div[@id='tab-contents']/table[1]/tbody/tr[2]/td[2]");
							driver.presenceOfElementLocated(BY_CODE, Duration.ofMinutes(1));
							String code = driver.getText(BY_CODE);
							log.info("{} itemBySearchDetail({}) - 『{}』『{}/{}』『{} {} {}』", Utility.indentMiddle(), start, cx, cy, sizey, symbol, code, date);

							//	상장일	///*[@id="tab-contents"]/table[1]/tbody/tr[4]/td[2]	//*[@id="tab-contents"]/table[1]/tbody/tr[4]/td[2]
							By BY_IPO_OPEN = By.xpath("//div[@id='tab-contents']/table[1]/tbody/tr[4]/td[2]");
							driver.presenceOfElementLocated(BY_IPO_OPEN, Duration.ofMinutes(1));
							String ipoOpen = driver.getText(BY_IPO_OPEN);
							log.info("{} itemBySearchDetail({}) - 『{}』『{}/{}』『{} {} {} {}』", Utility.indentMiddle(), start, cx, cy, sizey, symbol, code, date, ipoOpen);

							ItemDomain creating = ItemDomain.builder()
									.code(code)
									.ipoClose(Utility.parseDateTime(date, null))
									.ipoOpen(Utility.parseDateTime(ipoOpen, null))
									.build();
							items.add(creating);
							mapAlready.put(symbol, code);
							log.info("{} itemBySearchDetail({}) - 『{}』『{}/{}』『{} {} {}』『{}』", Utility.indentMiddle(), start, cx, cy, sizey, symbol, code, date, Utility.toStringJson(creating));
						}
						Utility.sleep(Math.round(pause * Math.random()));

						//	닫기	/html/body/footer/div/a/span
						By BY_CLOSE = By.xpath("/html/body/footer/div/a/span");
						driver.elementToBeClickable(BY_CLOSE, Duration.ofMinutes(1));
						log.info("{} itemBySearchDetail({}) - 『{}』『{}/{}』『{} {} {}』", Utility.indentMiddle(), start, cx, cy, sizey, symbol, date, driver.getText(BY_CLOSE));
					}
					log.debug("{} 『{}/{}/{} {}』 item({}) - {}", Utility.indentMiddle(), cx, cy, date, symbol, start, Utility.toStringPastTimeReadable(forStarted));
				}
				
				// next
				driver.switchTo().window(parent);
				driver.findElement(By.xpath("//*[@id='main-contents']/section[@class='paging-group']/div[@class='paging type-00']/a[@class='next']"), TIMEOUT).click();
				driver.waitUntilTextNotInclude(BY_CURRENT_PAGE, TIMEOUT, cx);

				log.info("{} 『{}』 item({}) - {}", Utility.indentMiddle(), cx, start, Utility.toStringPastTimeReadable(started));
			}
			driver.quit();

			log.info("{} 『{}』 item({}) - {}", Utility.indentEnd(), result, start, Utility.toStringPastTimeReadable(started));
			return Result.<ParserResult>builder().status(STATUS.SUCCESS).result(result).build();
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			Utility.sleep(10000);
			driver.quit();
		}

		Result<ParserResult> result = Result.<ParserResult>builder().status(STATUS.EXCEPTION).build();
		log.warn("{} 『{}』 item({}) - {}", Utility.indentEnd(), result, start, Utility.toStringPastTimeReadable(started));
		return result;
	}

	@Override
	public Result<ParserResult> basicInfoAll() {
		log.error("{} 『{}』 basicInfoAll()", Utility.indentMiddle(), STATUS.NOT_SUPPORT);
		return Result.<ParserResult>builder().status(STATUS.NOT_SUPPORT).build();
	}

	@Override
	public Result<ParserResult> dividend(String code, Date start) {
		log.error("{} 『{}』 dividend({}, {})", Utility.indentMiddle(), STATUS.NOT_SUPPORT, code, start);
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

	// 상장폐지현황 전체 읽기 - 한번은 해야 하니까
	public Result<ParserResult> itemIpoCloseAll() {
		log.debug("{} itemIpoCloseAll()", Utility.indentStart());
		long started = System.currentTimeMillis();

		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		try {
			driver.navigate().to(URL_COMPANY_EACH_SUMMARY_INFO);
			String parent = driver.getWindowHandle();

			// 전체 클릭
			driver.findElement(By.xpath("//*[@id='search-btn-dates']/ul/li/a[@class='ord-07']"), TIMEOUT * 4).click();
			
			// 100건 선택, 화면 페이지를 줄이기 위해서 크게 잡는다
			new Select(driver.findElement(By.xpath("//select[@id='currentPageSize']"), TIMEOUT * 4)).selectByVisibleText("100건");
			
			// 검색 클릭
			By BY_COUNT = By.xpath("//*[@id='main-contents']/section[@class='paging-group']/div[@class='info type-00']/em");
			String count = driver.getText(BY_COUNT, TIMEOUT, "32");
			driver.findElement(By.xpath("//*[@id='searchForm']/section/div/div[@class='btn-group type-bt']/a[@title='검색']"), TIMEOUT).click();
			driver.waitUntilTextNotInclude(BY_COUNT, TIMEOUT, count);

			By BY_CURRENT_PAGE = By.xpath("//*[@id='main-contents']/section[@class='paging-group']/div[@class='paging type-00']/a[@class='active']");
			String previousCode = "-";
			long pause = 4000;
			ParserResult result = ParserResult.builder().build().clear();
			List<ItemDomain> items = new ArrayList<>();
			result.setItems(items);
			for(String cx = "0";;) {
				driver.switchTo().window(parent);
				String currentPage = driver.getText(BY_CURRENT_PAGE, TIMEOUT, cx);
				if (currentPage.equalsIgnoreCase(cx)) {
					break;
				}
				cx = currentPage;

				List<WebElement> trs_ = driver.findElements(By.xpath("//*[@id='main-contents']/section[1]/table/tbody/tr"), TIMEOUT);
				for (int cy = 0, sizey = trs_.size(); cy < sizey; cy++) {
					long forStarted = System.currentTimeMillis();

					driver.switchTo().window(parent);
					List<WebElement> trs = driver.findElements(By.xpath("//*[@id='main-contents']/section[1]/table/tbody/tr"), TIMEOUT);
					WebElement tr = trs.get(cy);			
					WebElement link = tr.findElement(By.xpath("td[2]/a"));
					WebElement dateElement = driver.findElement(tr, By.xpath("td[3]"), TIMEOUT);
					if (dateElement == null) {
						break;
					}

					String date = dateElement.getText();
					String symbol = link.getText();
					link.click();
					Set<String> handles = driver.getWindowHandles();
					for (String child : handles) {

						if (parent.equals(child)) {
							continue;
						}

						driver.switchTo().window(child);
						String content = driver.getText(By.xpath("/html/body/form/section/div/table[1]/tbody/tr[3]/td[2]/strong"), TIMEOUT * 4, previousCode);
						if (content.strip().endsWith("상장폐지")) {
							String code = driver.getText(By.xpath("/html/body/form/section/div/table[1]/tbody/tr[2]/td[2]"), TIMEOUT, null);
							items.add(ItemDomain.builder().code(code).ipoClose(Utility.parseDateTime(date, null)).build());
							previousCode = code;
						}
						if (System.currentTimeMillis() - forStarted > 1024 * 8) {
							pause = Math.max(32, pause / 2);
						} else {
							pause = Math.min(1024 * 8, pause * 2);
						}
						Utility.sleep(Math.round(pause * Math.random()));

						driver.close();
					}
					log.debug("{} 『{}/{}/{} {}』 itemIpoCloseAll() - {}", Utility.indentMiddle(), cx, cy, date, symbol, Utility.toStringPastTimeReadable(forStarted));
				}
				
				// next
				driver.switchTo().window(parent);
				driver.findElement(By.xpath("//*[@id='main-contents']/section[@class='paging-group']/div[@class='paging type-00']/a[@class='next']"), TIMEOUT).click();
				driver.waitUntilTextNotInclude(BY_CURRENT_PAGE, TIMEOUT, cx);

				log.debug("{} 『{}』 itemIpoCloseAll() - {}", Utility.indentMiddle(), cx, Utility.toStringPastTimeReadable(started));
			}
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

}
