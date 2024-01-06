package kr.andold.stock.thread;

import java.lang.management.ManagementFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import kr.andold.stock.crawler.ChromeDriverWrapper;
import kr.andold.stock.crawler.CrawlerService;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.service.ParserService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

// KSD증권정보포털(SEIBro) > 주식 > 종목별상세정보 > 종목종합내역 (KSD증권정보포털(SEIBro) > 기업 > 기업기본정보와 동일)
@Slf4j
public class CrawlItemDetailCompanyThread implements Callable<ParserResult> {
	private static final String URL = "https://seibro.or.kr/websquare/control.jsp?w2xPath=/IPORTAL/user/stock/BIP_CNTS02006V.xml&menuNo=44";
	private static String MARK_END_POINT = "KEYWORD\t주식 상세\tCrawlItemDetailCompanyThread\tURL\t" + URL + "\n";
	private static final int TIMEOUT = 8000;
	private static final int JOB_SIZE = 8;
	private static final String MARK_ANDOLD_SINCE = CrawlerService.MARK_ANDOLD_SINCE;
	@Setter private static Boolean debug = CrawlerService.debug;

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

		log.info("{} {} CrawlItemDetailCompanyThread(#{}) - {}", Utility.indentEnd(), container, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return container;
	}

	private String extract(ItemDomain item) {
		log.debug("{} CrawlItemDetailCompanyThread.extract({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		try {
			String code = item.getCode();

			driver.switchTo().defaultContent();

			// 종목 검색창이 만약 떠 있다면, 닫기 버튼이 있다면 눌려지겠지
			driver.clickIfExist(By.xpath("//a[@id='anchor2']"));
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
			if (clickSearchIconInPopup(driver) <= 0) {
				log.warn("{} 종목 없음 #{} 『{} {} {}』 CrawlItemDetailCompanyThread.extract(...) - {}", Utility.indentEnd()
						, Utility.size(items), item, item.getEtf(), item.getType(), Utility.toStringPastTimeReadable(started));
				return "";
			}

			//	검색 결과에서 선택
			if (!clickItemCode(driver, code)) {
				log.warn("{} 종목 없음 #{} 『{} {} {}』 CrawlItemDetailCompanyThread.extract(...) - {}", Utility.indentEnd()
						, Utility.size(items), item, item.getEtf(), item.getType(), Utility.toStringPastTimeReadable(started));
				return "";
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

	private int clickSearchIconInPopup(ChromeDriverWrapper driver2) {
		try {
			// 진행중 메시지가 없어질때까지
			driver.waitUntilIsDisplayed(By.xpath("//div[@id='___processbar2']"), false, TIMEOUT);

			By BY_SEARCH_RESULT_COUNT = By.xpath("//span[@id='P_ListCnt']");
			String INVALID_COUNT = "-1";
			driver.setText(BY_SEARCH_RESULT_COUNT, INVALID_COUNT, TIMEOUT);

			driver.findElement(By.xpath("//a[@id='P_group100']"), TIMEOUT).click(); // 종목명 검색 아이콘

			driver.waitUntilTextNotInclude(BY_SEARCH_RESULT_COUNT, TIMEOUT, INVALID_COUNT);
			return Utility.parseInteger(driver.findElement(BY_SEARCH_RESULT_COUNT).getText(), -1);
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}
		return -1;
	}

	private boolean clickItemCode(ChromeDriverWrapper driver, String code) {
		try {
			By BY_SEARCH_CODE_RESULT = By.xpath("//ul[@id='P_isinList']/li/a/span");
			driver.findElementIncludeText(BY_SEARCH_CODE_RESULT, TIMEOUT, code).click();
			return true;
		} catch (Exception e) {
		}
		return false;
	}

	public static ParserResult crawl(List<ItemDomain> items) {
		log.info("{} CrawlItemDetailCompanyThread.crawl(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		long freeMemorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getFreeMemorySize();
		int candidateProcessorsByFreeMemory = (int) (freeMemorySize / 512L / 1024L / 1024L);
		int processors = Math.min(Math.max(1, candidateProcessorsByFreeMemory), Runtime.getRuntime().availableProcessors() - 1);
		if (debug) {
			processors = 1;
		}

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

	public static ParserResult crawl(ItemDomain item) {
		ConcurrentLinkedQueue<ItemDomain> queue = new ConcurrentLinkedQueue<ItemDomain>();
		queue.add(item);
		CrawlItemDetailCompanyThread thread = new CrawlItemDetailCompanyThread(queue);
		setDebug(false);
		ExecutorService service = Executors.newFixedThreadPool(1);
		Future<ParserResult> future = service.submit(thread);
		try {
			return future.get();
		} catch (InterruptedException e) {
		} catch (ExecutionException e) {
		}
		return new ParserResult().clear();
	}

}
