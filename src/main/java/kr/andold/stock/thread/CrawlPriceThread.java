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

import kr.andold.stock.domain.StockItemDomain;
import kr.andold.stock.service.ChromeDriverWrapper;
import kr.andold.stock.service.StockCrawlerService;
import kr.andold.stock.service.StockParserService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.StockParserService.StockParserResult;
import lombok.extern.slf4j.Slf4j;

// 종목 시세 이력 네이버
// 네이버 > 증권홈 > 국내증시 > 배당 > 코스피 > 종목클릭 > 시세
@Slf4j
public class CrawlPriceThread implements Callable<StockParserResult> {
	private static final String URL_PREFIX = "https://finance.naver.com/item/sise.naver";
	private static String MARK_END_POINT = "KEYWORD\t주식 시세 이력\tURL\thttps://finance.naver.com/item/sise.naver?code=\n";
	private static final int JOB_SIZE = 4;
	private static final String MARK_ANDOLD_SINCE = StockCrawlerService.MARK_ANDOLD_SINCE;
	private static final Boolean debug = StockCrawlerService.debug;

	private ConcurrentLinkedQueue<StockItemDomain> items;
	private ChromeDriverWrapper driver;

	public CrawlPriceThread(ConcurrentLinkedQueue<StockItemDomain> list) {
		this.items = list;
	}

	public StockParserResult call() throws Exception {
		log.info("{} CrawlPriceThread(#{})", Utility.indentStart(), Utility.size(items));
		long started = System.currentTimeMillis();

		StockParserResult result = StockParserResult.builder().build();
		result.clear();
		driver = StockCrawlerService.defaultChromeDriver();
		while (items.peek() != null) {
			StringBuffer sb = new StringBuffer();
			sb.append(MARK_END_POINT);
			for (int cx = 0; cx < JOB_SIZE; cx++) {
				StockItemDomain item = items.poll();
				if (item == null) {
					break;
				}
				
				if (debug && new Random().nextDouble() < 0.9) {
					log.debug("{} {}/{} 뽑기 제외 『{}』 CrawlPriceThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
					cx--;
					continue;
				}

				log.debug("{} {}/{} 진행 『{}』 CrawlPriceThread()", Utility.indentMiddle(), cx, Utility.size(items), item);
				String text = extract(item);
				sb.append(text);
			}
			sb.append(MARK_END_POINT);
			String text = new String(sb);
			StockParserResult resultDividendHistoryEtf = StockParserService.parse(text, false);
			result.addAll(resultDividendHistoryEtf);
		}
		driver.quit();
		log.info("{} 『{}』 CrawlPriceThread(#{}) - {}", Utility.indentEnd(), result, Utility.size(items), Utility.toStringPastTimeReadable(started));
		return result;
	}

	private String extract(StockItemDomain item) {
		log.info("{} CrawlPriceThread.extract({})", Utility.indentStart(), item);
		long started = System.currentTimeMillis();

		try {
			String code = item.getCode();
			String url = String.format("%s?code=%s", URL_PREFIX, code);
			driver.navigate().to(url);

			WebElement frame = driver.findElement(By.xpath("//*[@id='content']//iframe[@title='일별 시세']"), 2000);
			driver.switchTo().frame(frame);
			WebElement table = driver.findElement(By.xpath("//table[@class='type2']"));

			StringBuffer sb = new StringBuffer();
			sb.append(String.format("%s\t%s\n", code, item.getSymbol()));
			sb.append(driver.extractTextFromTableElement(table));
			sb.append(MARK_ANDOLD_SINCE);

			String result = new String(sb);

			log.info("{} #{} 『{}』 CrawlPriceThread.extract({}) - {}", Utility.indentEnd(), Utility.size(items), Utility.ellipsisEscape(result, 16), item, Utility.toStringPastTimeReadable(started));
			return result;
		} catch (Exception e) {
			log.error("{} Exception:: {} - {}", Utility.indentMiddle(), item, e.getLocalizedMessage(), e);
		}

		log.info("{} #{} 『{}』 CrawlPriceThread.extract(#{}) - {}", Utility.indentEnd(), Utility.size(items), "", item, Utility.toStringPastTimeReadable(started));
		return "";
	}

	public static StockParserResult crawl(List<StockItemDomain> items) {
		int processors = Runtime.getRuntime().availableProcessors() - 1;
		ExecutorService service = Executors.newFixedThreadPool(processors);
		List<Future<StockParserResult>> futureList = new ArrayList<>();
		ConcurrentLinkedQueue<StockItemDomain> queue = new ConcurrentLinkedQueue<StockItemDomain>();
		queue.addAll(items);
		for (int cx = 0; cx < processors; cx++) {
			CrawlPriceThread thread = new CrawlPriceThread(queue);
			Future<StockParserResult> future = service.submit(thread);
			futureList.add(future);
		}
		StockParserResult container = StockParserResult.builder().build();
		container.clear();
		for (Future<StockParserResult> task : futureList) {
			try {
				StockParserResult result = task.get();
				container.addAll(result);
				log.info("{} 『{}』 CrawlPriceThread.crawl(#{})", Utility.indentMiddle(), result, Utility.size(items));
			} catch (Exception e) {
			}
		}
		return container;
	}

}
