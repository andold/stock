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
import org.openqa.selenium.WebElement;

import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.service.ChromeDriverWrapper;
import kr.andold.stock.service.CrawlerService;
import kr.andold.stock.service.ParserService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CrawlCompanyDetailThread implements Callable<ParserResult> {
	private static final String URL = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02006V.xml&menuNo=44";
	private static String MARK_END_POINT = "KEYWORD\t주식 상세\tCrawlCompanyDetailThread\tURL\t" + URL + "\n";
	private static final int TIMEOUT = 4000;
	private static final int JOB_SIZE = 4;
	private static final String MARK_ANDOLD_SINCE = CrawlerService.MARK_ANDOLD_SINCE;
	private static final Boolean debug = CrawlerService.debug && false;
	private static final String NEWLINE = "\n";

	private ConcurrentLinkedQueue<ItemDomain> items;
	private ChromeDriverWrapper driver;
	private WebElement popupCloseIconElement; // 검색결과창의 닫기 아이콘

	public CrawlCompanyDetailThread(ConcurrentLinkedQueue<ItemDomain> list) {
		this.items = list;
	}

	@Override
	public ParserResult call() throws Exception {
		log.info("{} CrawlCompanyDetailThread(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		ParserResult result = ParserResult.builder().build();
		result.clear();
		driver = CrawlerService.defaultChromeDriver();

		try {
			driver.navigate().to(URL);
			popupCloseIconElement = driver.findElement(By.xpath("//div[@id='group404']/a[@id='anchor2']"), TIMEOUT * 4); // 검색결과창의 닫기 아이콘
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
				if (code == null || code.isBlank() || (item.getEtf() != null && item.getEtf())) {
					log.trace("{} {}/{} 대상아님 『{}』 CrawlCompanyDetailThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}
				if (debug && new Random().nextDouble() < 0.90) {
					log.trace("{} {}/{} 뽑기 제외 『{}』 CrawlCompanyDetailThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}

				String text = extract(item);
				log.debug("{} {}/{} 『{}』 CrawlCompanyDetailThread() - {}", Utility.indentMiddle(), cx, Utility.size(items), item, text);
				sb.append(text);
			}
			sb.append(MARK_END_POINT);
			String text = new String(sb);
			ParserResult resultDividendHistoryEtf = ParserService.parse(text, true);
			result.addAll(resultDividendHistoryEtf);
			log.debug("{} 변경 필요 『{}』 CrawlCompanyDetailThread(#{}) - {}", Utility.indentMiddle(), resultDividendHistoryEtf, Utility.size(items), Utility.toStringPastTimeReadable(started));
		}
		driver.quit();
		log.info("{} {} CrawlCompanyDetailThread(#{}) - {}", Utility.indentMiddle(), result, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return result;
	}

	private String extract(ItemDomain item) {
		log.debug("{} CrawlCompanyDetailThread.extract({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		try {
			String code = item.getCode();
			String symbol = item.getSymbol();

			driver.switchTo().defaultContent();
			// 종목명 검색
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='___processbar2']"), false, TIMEOUT);
			driver.findElement(By.xpath("//img[@id='sn_image1']"), TIMEOUT).click(); // 종목명 검색 아이콘

			// 프래임
			WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframe1']"), 2000);
			driver.switchTo().frame(frame);

			//	코드입력
			WebElement inputSearchElement = driver.findElement(By.xpath("//input[@id='search_string']"), 2000);	// 입력창
			inputSearchElement.clear();
			inputSearchElement.sendKeys(code); // 코드 입력

			// 종목명 검색 아이콘
			driver.findElement(By.xpath("//a[@id='P_group100']"), TIMEOUT).click(); // 종목명 검색 아이콘

			//	검색 결과에서 선택
			driver.findElementIncludeText(By.xpath("//ul[@id='P_isinList']/li/a/span"), TIMEOUT, code).click();


			//	팝업이 닫혔다, 돌아간다
			driver.switchTo().defaultContent();

			// 조회 아이콘 클릭
			driver.findElement(By.xpath("//a[@id='group94']"), TIMEOUT).click();

			// 조회결과 바뀐거 확인
			driver.findElementIncludeText(By.xpath("//h3[@id='h3_tit_01']"), TIMEOUT, code);

			//	내용 저장
			StringBuffer sb = new StringBuffer();
			sb.append(String.format("KEYWORD\t%s\t%s\n", code, symbol));
			sb.append("KEYWORD\t");
			sb.append("\"");
			sb.append(driver.findElement(By.xpath("//dd[@id='item_add_info_left_01_dd']"), TIMEOUT).getText());	// 표준산업분류
			sb.append("\"");
			sb.append(NEWLINE);

			sb.append("KEYWORD\t");
			sb.append("\"");
			sb.append(driver.findElement(By.xpath("//dd[@id='FICS']"), TIMEOUT).getText());	// FICS
			sb.append("\"");
			sb.append(NEWLINE);

			sb.append("KEYWORD\t");
			sb.append(driver.findElement(By.xpath("//dd[@id='ISSU_SCHD_STKQTY']"), TIMEOUT).getText());	// 발행주식총수
			sb.append(NEWLINE);

			sb.append("KEYWORD\t");
			sb.append(driver.findElement(By.xpath("//dd[@id='APLI_DT']"), TIMEOUT).getText());	// 상장일
			sb.append(NEWLINE);

			sb.append(MARK_ANDOLD_SINCE);
			String result = new String(sb);

			log.debug("{} #{} 『{}』 CrawlCompanyDetailThread.extract({}) - {}", Utility.indentEnd(), Utility.size(items), Utility.ellipsisEscape(result, 16), item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
			driver.switchTo().defaultContent();
			popupCloseIconElement.click();
		}

		log.debug("{} #{} 『{}』 CrawlCompanyDetailThread.extract(#{}) - {}", Utility.indentEnd(), Utility.size(items), "", item, Utility.toStringPastTimeReadable(started));
		return "";
	}

	public static ParserResult crawl(List<ItemDomain> items) {
		log.info("{} CrawlCompanyDetailThread.crawl(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		int processors = Runtime.getRuntime().availableProcessors() - 1;
		if (debug) {
			processors = 1;
		}
		ExecutorService service = Executors.newFixedThreadPool(processors);
		List<Future<ParserResult>> futureList = new ArrayList<>();
		ConcurrentLinkedQueue<ItemDomain> queue = new ConcurrentLinkedQueue<ItemDomain>();
		queue.addAll(items);
		for (int cx = 0; cx < processors; cx++) {
			CrawlCompanyDetailThread thread = new CrawlCompanyDetailThread(queue);
			Future<ParserResult> future = service.submit(thread);
			futureList.add(future);
		}
		ParserResult container = new ParserResult();
		container.clear();
		for (Future<ParserResult> task : futureList) {
			try {
				ParserResult result = task.get();
				container.addAll(result);
				log.info("{} 『{}』 CrawlCompanyDetailThread.crawl(#{})", Utility.indentMiddle(), result, Utility.size(items));
			} catch (Exception e) {
			}
		}

		log.info("{} 『{}』 CrawlCompanyDetailThread.crawl(#{}) - {}", Utility.indentEnd(), container, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return container;
	}

}
