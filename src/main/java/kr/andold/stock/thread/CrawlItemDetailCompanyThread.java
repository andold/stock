package kr.andold.stock.thread;

import java.lang.management.ManagementFactory;
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

// KSD증권정보포털(SEIBro) > 주식 > 종목별상세정보 > 종목종합내역 (KSD증권정보포털(SEIBro) > 기업 > 기업기본정보와 동일)
@Slf4j
public class CrawlItemDetailCompanyThread implements Callable<ParserResult> {
	private static final String URL = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02006V.xml&menuNo=44";
	private static String MARK_END_POINT = "KEYWORD\t주식 상세\tCrawlItemDetailCompanyThread\tURL\t" + URL + "\n";
	private static final int TIMEOUT = 4000;
	private static final int JOB_SIZE = 4;
	private static final String MARK_ANDOLD_SINCE = CrawlerService.MARK_ANDOLD_SINCE;
	private static final Boolean debug = CrawlerService.debug;

	private ConcurrentLinkedQueue<ItemDomain> items;
	private ChromeDriverWrapper driver;

	public CrawlItemDetailCompanyThread(ConcurrentLinkedQueue<ItemDomain> list) {
		this.items = list;
	}

	@Override
	public ParserResult call() throws Exception {
		log.info("{} CrawlItemDetailCompanyThread(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		ParserResult container = ParserResult.builder().build().clear();
		driver = CrawlerService.defaultChromeDriver();

		try {
			driver.navigate().to(URL);
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			driver.quit();
			return container;
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
					log.trace("{} {}/{} 대상아님 『{}』 CrawlItemDetailCompanyThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}
				if (debug && new Random().nextDouble() < 0.90) {
					log.trace("{} {}/{} 뽑기 제외 『{}』 CrawlItemDetailCompanyThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}

				String text = extract(item);
				log.info("{} {}/{} 『{}』 CrawlItemDetailCompanyThread() - {}", Utility.indentMiddle(), cx, Utility.size(items), item, Utility.ellipsisEscape(text, 32));
				sb.append(text);
			}
			sb.append(MARK_END_POINT);
			String text = new String(sb);
			ParserResult result = ParserService.parse(text, false);
			container.addAll(result);
			log.debug("{} 수집중 『{}』 CrawlItemDetailCompanyThread(#{}) - {}", Utility.indentMiddle(), result, Utility.size(items), Utility.toStringPastTimeReadable(started));
		}
		driver.quit();

		log.info("{} {} CrawlItemDetailCompanyThread(#{}) - {}", Utility.indentMiddle(), container, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return container;
	}

	private String extract(ItemDomain item) {
		log.debug("{} CrawlItemDetailCompanyThread.extract({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		try {
			String code = item.getCode();

			driver.switchTo().defaultContent();
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='___processbar2']"), false, TIMEOUT * 4);

			// 종목명 검색
			driver.waitUntilIsDisplayed(By.xpath("//img[@id='sn_image1']"), true, TIMEOUT * 4);
			driver.findElement(By.xpath("//img[@id='sn_image1']"), TIMEOUT).click(); // 종목명 검색 아이콘

			// 프래임
			WebElement frame = driver.findElement(By.xpath("//iframe[@id='iframe1']"), TIMEOUT);
			driver.switchTo().frame(frame);

			//	코드입력
			WebElement inputSearchElement = driver.findElement(By.xpath("//input[@id='search_string']"), TIMEOUT);	// 입력창
			inputSearchElement.clear();
			inputSearchElement.sendKeys(code); // 코드 입력

			// 종목명 검색 아이콘
			driver.findElement(By.xpath("//a[@id='P_group100']"), TIMEOUT).click(); // 종목명 검색 아이콘

			//	검색 결과에서 선택
			driver.findElementIncludeText(By.xpath("//ul[@id='P_isinList']/li/a/span"), TIMEOUT, code).click();


			//	팝업이 닫혔다, 돌아간다
			driver.switchTo().defaultContent();

			// 조회 아이콘 클릭
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='group402']"), false, TIMEOUT * 4);
			driver.findElement(By.xpath("//a[@id='group94']"), TIMEOUT).click();

			// 조회결과 바뀐거 확인
			WebElement symbolElement = driver.findElementIncludeText(By.xpath("//h3[@id='h3_tit_01']"), TIMEOUT, code);

			//	내용 저장
			StringBuffer sb = new StringBuffer();
			// 종목명
			sb.append(String.format("KEYWORD\t%s\t%s\t%s\n", code, driver.getText(By.xpath("//p[@id='btn_item']"), TIMEOUT, "모름"), symbolElement.getText()));
			
			// 표준산업분류
			sb.append(String.format("KEYWORD\t\"%s\"\n", driver.findElement(By.xpath("//dd[@id='item_add_info_left_01_dd']"), TIMEOUT).getText()));

			// FICS
			sb.append(String.format("KEYWORD\t\"%s\"\n", driver.findElement(By.xpath("//dd[@id='FICS']"), TIMEOUT).getText()));

			// 발행주식총수
			sb.append(String.format("KEYWORD\t%s\n", driver.findElement(By.xpath("//dd[@id='ISSU_SCHD_STKQTY']"), TIMEOUT).getText()));

			// 상장일
			sb.append(String.format("KEYWORD\t%s\n", driver.findElement(By.xpath("//dd[@id='APLI_DT']"), TIMEOUT).getText()));

			// 마자막 표시
			sb.append(MARK_ANDOLD_SINCE);
			String result = new String(sb);

			log.debug("{} #{} 『{}』 CrawlItemDetailCompanyThread.extract({}) - {}", Utility.indentEnd(), Utility.size(items), Utility.ellipsisEscape(result, 16), item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
			driver.switchTo().defaultContent();
			// 검색결과창의 닫기 아이콘
			driver.clickIfExist(By.xpath("//div[@id='group404']/a[@id='anchor2']"));
		}

		log.trace("{} #{} 『{}』 CrawlItemDetailCompanyThread.extract(#{}) - {}", Utility.indentEnd(), Utility.size(items), "", item, Utility.toStringPastTimeReadable(started));
		return "";
	}

	public static ParserResult crawl(List<ItemDomain> items) {
		log.info("{} CrawlItemDetailCompanyThread.crawl(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		int processors = Runtime.getRuntime().availableProcessors() - 1;
		if (debug) {
			processors = 1;
		}
		long freeMemorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getFreeMemorySize();
		int candidateProcessorsByFreeMemory = (int) (freeMemorySize / 512L / 1024L / 1024L);
		processors = Math.min(Math.max(1, candidateProcessorsByFreeMemory), Runtime.getRuntime().availableProcessors() - 1);

		ExecutorService service = Executors.newFixedThreadPool(processors);
		List<Future<ParserResult>> futureList = new ArrayList<>();
		ConcurrentLinkedQueue<ItemDomain> queue = new ConcurrentLinkedQueue<ItemDomain>();
		queue.addAll(items);
		for (int cx = 0; cx < processors; cx++) {
			CrawlItemDetailCompanyThread thread = new CrawlItemDetailCompanyThread(queue);
			Future<ParserResult> future = service.submit(thread);
			futureList.add(future);
		}
		ParserResult container = new ParserResult();
		container.clear();
		for (Future<ParserResult> task : futureList) {
			try {
				ParserResult result = task.get();
				container.addAll(result);
				log.info("{} 『{}』 CrawlItemDetailCompanyThread.crawl(#{})", Utility.indentMiddle(), result, Utility.size(items));
			} catch (Exception e) {
			}
		}

		log.info("{} 『{}』 CrawlItemDetailCompanyThread.crawl(#{}) - {}", Utility.indentEnd(), container, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return container;
	}

}
