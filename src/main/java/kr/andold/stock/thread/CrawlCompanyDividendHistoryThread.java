package kr.andold.stock.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.service.ChromeDriverWrapper;
import kr.andold.stock.service.CrawlerService;
import kr.andold.stock.service.ParserService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

// KSD 증권정보포털 SEIBro > 주식 > 배당정보 > 배당내역전체검색
@Slf4j
public class CrawlCompanyDividendHistoryThread implements Callable<ParserResult> {
	private static final String URL = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/company/BIP_CNTS01041V.xml&menuNo=285";
	private static final String MARK_END_POINT = "KEYWORD\t주식(기업) 배당금 내역\tURL\t" + URL + "\n";
	private static final int TIMEOUT = 4000;
	private static final int JOB_SIZE = 4;
	private static final String MARK_ANDOLD_SINCE = CrawlerService.MARK_ANDOLD_SINCE;
	@Setter private static Boolean debug = CrawlerService.debug;

	private ConcurrentLinkedQueue<ItemDomain> items;
	private ChromeDriverWrapper driver;
	private String previous = "andold";

	public CrawlCompanyDividendHistoryThread(ConcurrentLinkedQueue<ItemDomain> list) {
		this.items = list;
	}

	@Override
	public ParserResult call() throws Exception {
		log.info("{} CrawlCompanyDividendHistoryThread(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		ParserResult result = ParserResult.builder().build();
		result.clear();
		driver = CrawlerService.defaultChromeDriver();

		try {
			driver.navigate().to(URL);
			new Select(driver.findElement(By.id("Com_ISIN_input_0"), TIMEOUT * 4)).selectByVisibleText("종목"); // 검색항목을 code로
			driver.findElement(By.id("btn_wide_img")).click(); // 넓게 보기 아이콘 크릭

			WebElement start = driver.findElement(By.id("inputCalendar1_input"), TIMEOUT);
			start.clear();
			start.sendKeys("2010/01/01"); // 시작일 입력
			start.sendKeys(Keys.TAB); // 시작일 입력
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
			return result;
		}

		while (items.peek() != null) {
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_END_POINT);
			for (int cx = 0; cx < JOB_SIZE; cx++) {
				ItemDomain item = items.poll();
				if (item == null) {
					break;
				}
				
				String code = item.getCode();
				if (code == null || code.isBlank() || item.getEtf()) {
					log.info("{} {}/{} 대상아님 『{}』 CrawlCompanyDividendHistoryThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}


				if (debug && new Random().nextDouble() < 0.9) {
					log.trace("{} {}/{} 뽑기 제외 『{}』 CrawlCompanyDividendHistoryThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}

				String text = extract(item);
				sb.append(text);
			}
			sb.append(MARK_END_POINT);

			String text = new String(sb);
			ParserResult resultDividendHistory = ParserService.parse(text, debug);
			result.addAll(resultDividendHistory);
			log.debug("{} #{} {} CrawlCompanyDividendHistoryThread() - {}", Utility.indentMiddle(), Utility.size(items), resultDividendHistory, Utility.toStringPastTimeReadable(started));
		}
		driver.quit();

		log.info("{} {} CrawlCompanyDividendHistoryThread(#{}) - {}", Utility.indentEnd(), result, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return result;
	}

	private String extract(ItemDomain item) {
		log.info("{} CrawlCompanyDividendHistoryThread.extract({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		try {
			String code = item.getCode();

			driver.switchTo().defaultContent();
			driver.findElement(By.id("cc_group4")).click(); // 종목 검색 아이콘 크릭
			WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframe2']"), TIMEOUT);
			driver.switchTo().frame(frame);
			WebElement codeElement = driver.findElement(By.id("search_string"), TIMEOUT);
			codeElement.clear();
			codeElement.sendKeys(code); // 코드 입력

			driver.clear(By.xpath("//*[@id='P_isinList']/li"));
			driver.findElement(By.id("P_group100")).click(); // 코드 검색 아이콘 클릭

			// 조회결과 확인
			WebElement targetElement = driver.findElementIncludeText(By.xpath("//ul[@id='P_isinList']/li/a/span[@class='w2textbox code']"), TIMEOUT, code);
			
			// 클릭
			targetElement.click();

			driver.switchTo().defaultContent();
			driver.clickIfExist(By.xpath("//a[@id='anchor5']"));
			driver.findElement(By.id("group57")).click(); // 조회 클릭

			// 조회결과 바뀐거 확인
			driver.findElementIncludeText(By.xpath("//table[@id='grid1_body_table']/tbody/tr[1]/td[4]"), TIMEOUT, code);

			// 시작 표시
			StringBuffer sb = new StringBuffer();
			sb.append(String.format("KEYWORD\t%s\t%s\n", code, item.getSymbol()));

			// 첫 페이지 결과 내용 저장
			WebElement table1st = driver.findElement(By.xpath("//table[@id='grid1_body_table']"), TIMEOUT);
			sb.append(driver.extractTextFromTableElement(table1st));

			// 페이징 처리 - 여기부터
			for (int cx = 2; cx <= 10; cx++) {
				// 변경전 내용 저장
				String prevText = driver.getText(By.xpath("//table[@id='grid1_body_table']/tbody/tr[1]/td[1]"), TIMEOUT, previous);
				if(!driver.clickIfExist(By.xpath(String.format("//div[@id='wframe22']/div/ul/li[@class='w2pageList_li_label']/a[contains(text(),'%d')]", cx)))) {
					break;
				}

				// 페이지 변경 확인
				driver.waitUntilTextNotInclude(By.xpath("//table[@id='grid1_body_table']/tbody/tr[1]/td[1]"), TIMEOUT, prevText);

				// 결과 내용 저장
				WebElement table = driver.findElement(By.xpath("//table[@id='grid1_body_table']"), TIMEOUT);
				sb.append(driver.extractTextFromTableElement(table));
			}
			// 페이징 처리 - 여기까지

			// 마지막 표시
			sb.append(MARK_ANDOLD_SINCE);
			String result = new String(sb);

			log.info("{} #{} 『{}』 CrawlCompanyDividendHistoryThread.extract({}) - {}", Utility.indentEnd(), Utility.size(items), Utility.ellipsisEscape(result, 16), item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
		}

		return "";
	}

	public static ParserResult crawl(List<ItemDomain> items) {
		int processors = Runtime.getRuntime().availableProcessors() - 1;
		if (debug) {
			processors = 1;
		}
		ExecutorService service = Executors.newFixedThreadPool(processors);
		List<Future<ParserResult>> futureList = new ArrayList<>();
		ConcurrentLinkedQueue<ItemDomain> queue = new ConcurrentLinkedQueue<ItemDomain>();
		queue.addAll(items);
		for (int cx = 0; cx < processors; cx++) {
			CrawlCompanyDividendHistoryThread thread = new CrawlCompanyDividendHistoryThread(queue);
			Future<ParserResult> future = service.submit(thread);
			futureList.add(future);
		}
		ParserResult container = ParserResult.builder().build();
		container.clear();
		for (Future<ParserResult> task : futureList) {
			try {
				ParserResult result = task.get();
				container.addAll(result);
				log.info("{} 『{}』 CrawlCompanyDividendHistoryThread.crawl(#{})", Utility.indentMiddle(), result, Utility.size(items));
			} catch (Exception e) {
			}
		}
		return container;
	}

	public static ParserResult crawl(ItemDomain item) {
		log.info("{} CrawlCompanyDividendHistoryThread.crawl({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		ConcurrentLinkedQueue<ItemDomain> queue = new ConcurrentLinkedQueue<ItemDomain>();
		queue.add(item);
		CrawlCompanyDividendHistoryThread thread = new CrawlCompanyDividendHistoryThread(queue);
		setDebug(false);
		ExecutorService service = Executors.newFixedThreadPool(1);
		Future<ParserResult> future = service.submit(thread);
		try {
			ParserResult result = future.get();

			log.info("{} {} CrawlCompanyDividendHistoryThread.crawl({}) - {}", Utility.indentEnd(), result, item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
		}

		log.info("{} EMPY CrawlCompanyDividendHistoryThread.crawl({}) - {}", Utility.indentEnd(), item, Utility.toStringPastTimeReadable(started));
		return new ParserResult().clear();
	}

}
