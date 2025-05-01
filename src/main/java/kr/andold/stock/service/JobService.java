package kr.andold.stock.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.ApplicationContextProvider;
import kr.andold.stock.crawler.CrawlerService;
import kr.andold.stock.crawler.Seibro;
import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.param.DividendHistoryParam;
import kr.andold.stock.service.CommonBlockService.CrudList;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.utils.Utility;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class JobService {
	@Autowired private Seibro seibro;
	@Autowired private CrawlerService crawlerService;
	@Autowired private StockService stockService;
	@Autowired private ItemService itemService;
	@Autowired private DividendHistoryService dividendHistoryService;
	@Autowired private PriceService priceService;

	public static interface Job extends Callable<STATUS> {
		default Long getTimeout() {
			return 1L;
		}
		default STATUS call() throws Exception {
			return STATUS.NOT_SUPPORT;
		}
	}
	@Data
	@Builder
	public static class ItemPriceJob implements Job {
		private String code;
	}
	@Data
	@Builder
	public static class PriceLatestJob implements Job {
	}
	@Data
	@Builder
	public static class StockCompileJob implements Job {
		private LocalDate start;
	}
	@Builder
	public static class DividendAllRecentJob implements Job {
	}
	@Data
	@Builder
	public static class ItemIpoCloseRecentJob implements Job {
		private Date date;
	}
	@Builder
	public static class BackupJob implements Job {
	}
	@Builder
	public static class DeduplicatePriceJob implements Job {
	}

	@Getter private static ConcurrentLinkedDeque<Job> queue0 = new ConcurrentLinkedDeque<>();
	@Getter private static ConcurrentLinkedDeque<Job> queue1 = new ConcurrentLinkedDeque<>();
	@Getter private static ConcurrentLinkedDeque<Job> queue2 = new ConcurrentLinkedDeque<>();
	@Getter private static ConcurrentLinkedDeque<Job> queue3 = new ConcurrentLinkedDeque<>();

	public static class NetworkUsage {
		private LocalDateTime time;
		private int bytes;

		public NetworkUsage() {
			this.time = LocalDateTime.now();
			this.bytes = bytes();
		}

		private int bytes() {
			try {
				String filename = "/proc/net/dev";
				String content = new String(Files.readAllBytes(Paths.get(filename)));
				int bytes = 0;
				for (String line : content.split("\n")) {
					String normalized = line.strip().replaceAll("[\\s]+", "\t");
					String[] words = normalized.split("\t");
					try {
						bytes += Integer.parseInt(words[1]);
					} catch (Exception e) {
					}
				}

				return bytes;
			} catch (IOException e) {
			}

			return 0;
		}

		public int pause(int bps) {
			LocalDateTime currentTime = LocalDateTime.now();
			int currentBytes = bytes();
			int usage = (currentBytes - this.bytes) * 8;	//	unit: bits
			int seconds = (int) (currentTime.toEpochSecond(Utility.ZONE_OFFSET_KST) - this.time.toEpochSecond(Utility.ZONE_OFFSET_KST));
			int millis = (usage - bps * seconds) * 1000 / bps;
			return Math.max(millis, 0);
		}
	}

	public STATUS run() {
		log.trace("{} run()", Utility.indentStart());
		long started = System.currentTimeMillis();

		STATUS result = STATUS.FAILURE;
		try {
			NetworkUsage startedNetworkUsage = new NetworkUsage();

			if (queue0.peek() != null) {
				Job job = queue0.poll();
				result = run(job);
			} else if (queue1.peek() != null) {
				Job job = queue1.poll();
				result = run(job);
			} else if (queue2.peek() != null) {
				Job job = queue2.poll();
				result = run(job);
			} else if (queue3.peek() != null) {
				Job job = queue3.poll();
				result = run(job);
			} else {
				result = STATUS.SUCCESS;
			}

			int mills1MB = startedNetworkUsage.pause(1024 * 1024 * 8 / 60);
			int mills = Math.min(60 * 1000, mills1MB); // 1분(60초)에 1 Mbytes 트래픽
			if (mills > 1000) {
				log.info("{} 『{}:{}ms/MB』 run() - PAUSE {}", Utility.indentMiddle(), result, mills1MB, Utility.toStringTimeReadable(mills));
			}
			Utility.sleep(mills);
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			result = STATUS.EXCEPTION;
		}

		log.trace("{} 『{}』 run() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	private STATUS run(Job job) {
		log.trace("{} run({})", Utility.indentStart(), job);
		long started = System.currentTimeMillis();

		if (job == null) {
			log.trace("{} 『NULL::{}』 run({}) - {}", Utility.indentEnd(), STATUS.INVALID, job, Utility.toStringPastTimeReadable(started));
			return STATUS.INVALID;
		}
		
		if (job instanceof ItemCompilePriceEarningsRatioJob
				|| job instanceof ItemDetailJob) {
			ExecutorService executor = Executors.newSingleThreadExecutor();
	        Future<STATUS> future = executor.submit(job);
			STATUS result = STATUS.EXCEPTION;
			try {
		        result = future.get(job.getTimeout(), TimeUnit.SECONDS);
				executor.shutdown();
			} catch (Exception e) {
				log.error("{} run({}) - Exception::{}", Utility.indentMiddle(), job, e.getLocalizedMessage(), e);
				future.cancel(true);
				executor.shutdownNow();
			}

			log.trace("{} 『{}』 run({}) - {}", Utility.indentEnd(), result, job, Utility.toStringPastTimeReadable(started));
			return result;
		}

		if (job instanceof DeduplicatePriceJob) {
			STATUS result = deduplicatePrice((DeduplicatePriceJob) job);

			log.debug("{} 『{}』 run({}) - {}", Utility.indentEnd(), result, job, Utility.toStringPastTimeReadable(started));
			return result;
		}

		if (job instanceof BackupJob) {
			STATUS result = backup((BackupJob) job);

			log.debug("{} 『{}』 run({}) - {}", Utility.indentEnd(), result, job, Utility.toStringPastTimeReadable(started));
			return result;
		}

		if (job instanceof ItemPriceJob) {
			STATUS result = itemPrice((ItemPriceJob) job);

			log.debug("{} 『{}』 run({}) - {}", Utility.indentEnd(), result, job, Utility.toStringPastTimeReadable(started));
			return result;
		}

		if (job instanceof PriceLatestJob) {
			STATUS result = priceLatest((PriceLatestJob) job);

			log.debug("{} 『{}』 run({}) - {}", Utility.indentEnd(), result, job, Utility.toStringPastTimeReadable(started));
			return result;
		}

		if (job instanceof StockCompileJob) {
			STATUS result = stockCompile((StockCompileJob) job);

			log.debug("{} 『{}』 run({}) - {}", Utility.indentEnd(), result, job, Utility.toStringPastTimeReadable(started));
			return result;
		}

		if (job instanceof DividendAllRecentJob) {
			STATUS result = dividendAllRecent((DividendAllRecentJob) job);

			log.debug("{} 『{}』 run({}) - {}", Utility.indentEnd(), result, job, Utility.toStringPastTimeReadable(started));
			return result;
		}

		if (job instanceof ItemIpoCloseRecentJob) {
			STATUS result = itemIpoCloseRecent((ItemIpoCloseRecentJob) job);

			log.debug("{} 『{}』 run({}) - {}", Utility.indentEnd(), result, job, Utility.toStringPastTimeReadable(started));
			return result;
		}

		if (job instanceof ItemDividendJob) {
			STATUS result = itemDividend((ItemDividendJob) job);

			log.debug("{} 『{}』 run({}) - {}", Utility.indentEnd(), result, job, Utility.toStringPastTimeReadable(started));
			return result;
		}

		log.trace("{} 『{}』 run({}) - {}", Utility.indentEnd(), STATUS.NOT_SUPPORT, job, Utility.toStringPastTimeReadable(started));
		return STATUS.NOT_SUPPORT;
	}

	private STATUS itemPrice(ItemPriceJob job) {
		log.trace("{} itemPrice(『{}』)", Utility.indentStart(), job);
		long started = System.currentTimeMillis();

		String code = job.getCode();
		if (code == null || code.isBlank()) {
			//	null is all
			List<ItemDomain> items = itemService.search(null);
			for (ItemDomain item: items) {
				queue2.push(ItemPriceJob.builder().code(item.getCode()).build());
			}

			log.debug("{} 『{}:#{}』 itemPrice({}) - {}", Utility.indentEnd(), STATUS.SUCCESS, Utility.size(items), code, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		}

		ItemDomain item = itemService.read(code);
		if (item == null) {
			log.debug("{} 『NONE:{}』 itemPrice({}) - {}", Utility.indentEnd(), STATUS.INVALID, code, Utility.toStringPastTimeReadable(started));
			return STATUS.INVALID;
		}

		String type = item.getType();
		if (type != null && (type.contains("기타비상장") || type.contains("코넥스"))) {
			log.debug("{} 『{}:{}』 itemPrice({}) - {}", Utility.indentEnd(), STATUS.INVALID, item.getType(), code, Utility.toStringPastTimeReadable(started));
			return STATUS.INVALID;
		}
		
		List<DividendHistoryDomain> histories = dividendHistoryService.search(DividendHistoryParam.builder().code(item.getCode()).build());
		Date date = priceService.dateCrawlRequireForDividend(item, histories);
		if (date == null) {
			log.trace("{} 『{}:{}』 itemPrice({}) - {}", Utility.indentEnd(), STATUS.ALEADY_DONE, item, code, Utility.toStringPastTimeReadable(started));
			return STATUS.ALEADY_DONE;
		}

		Result<ParserResult> result = seibro.price(item, histories);
		switch (result.getStatus()) {
		case SUCCESS:
			ParserResult parserResult = result.getResult();
			parserResult.setHistories(histories);
			List<PriceDomain> prices = parserResult.getPrices();
			Map<String, PriceDomain> mapP = priceService.makeMap(prices);
			dividendHistoryService.compile(histories, mapP);
			priceService.compile(prices, false);
			put(parserResult);
			log.debug("{} 『{}:{}』 itemPrice({}) - 『{}』 - {}", Utility.indentEnd(), STATUS.SUCCESS, item, code, parserResult, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		default:
			break;
		}

		log.debug("{} 『{}:{}』 itemPrice({}) - {}", Utility.indentEnd(), STATUS.FAILURE, item, code, Utility.toStringPastTimeReadable(started));
		return STATUS.FAILURE;
	}

	private STATUS itemDividend(ItemDividendJob job) {
		log.trace("{} itemDividend(『{}』)", Utility.indentStart(), job);
		long started = System.currentTimeMillis();

		String code = job.getCode();
		if (code == null || code.isBlank()) {
			//	null is all
			List<ItemDomain> items = itemService.search(null);
			for (ItemDomain item: items) {
				queue2.push(ItemDividendJob.builder().code(item.getCode()).build());
			}

			log.debug("{} 『{}:#{}』 itemDividend({}) - 『{}』 - {}", Utility.indentEnd(), STATUS.SUCCESS, Utility.size(items), job, code, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		}

		ItemDomain item = itemService.read(code);
		if (item == null) {
			log.debug("{} 『{}』 itemDividend({}) - {}", Utility.indentEnd(), STATUS.INVALID, job, Utility.toStringPastTimeReadable(started));
			return STATUS.INVALID;
		}

		String type = item.getType();
		if (type != null && (type.contains("기타비상장") || type.contains("코넥스"))) {
			log.debug("{} 『{}:{}』 itemDividend({}) - 『{}』 - {}", Utility.indentEnd(), STATUS.INVALID, type, job, item, Utility.toStringPastTimeReadable(started));
			return STATUS.INVALID;
		}
		
		Date ipoOpen = item.getIpoOpen();
		if (ipoOpen == null) {
			log.debug("{} 『상장일이 없다:{}』 itemDividend({}) - 『{}』 - {}", Utility.indentEnd(), STATUS.INVALID, job, item, Utility.toStringPastTimeReadable(started));
			return STATUS.INVALID;
		}

		Date today = new Date();
		Date ipoClose = item.getIpoClose();
		if (ipoClose != null && ipoClose.before(today)) {
			log.debug("{} 『상장폐지:{}』 itemDividend({}) - {}", Utility.indentEnd(), STATUS.INVALID, item, job, Utility.toStringPastTimeReadable(started));
			return STATUS.INVALID;
		}

		ZonedDateTime ipoZonedDate = ZonedDateTime.ofInstant(ipoOpen.toInstant(), Utility.ZONE_ID_KST);
		List<DividendHistoryDomain> histories = dividendHistoryService.search(DividendHistoryParam.builder().code(item.getCode()).build());
		if (histories != null && !histories.isEmpty() && !ipoOpen.before(histories.get(histories.size() - 1).getBase())) {
			log.trace("{} 『{}』 itemDividend() - 『{}』 - {}", Utility.indentEnd(), STATUS.ALEADY_DONE, item, Utility.toStringPastTimeReadable(started));
			return STATUS.ALEADY_DONE;
		}

		Result<ParserResult> result = seibro.dividend(item.getCode(), Date.from(ipoZonedDate.toInstant()));
		switch (result.getStatus()) {
		case SUCCESS:
			ParserResult parserResult = result.getResult();
			List<DividendHistoryDomain> founds = parserResult.getHistories();
			founds.add(DividendHistoryDomain.builder()
					.code(item.getCode())
					.base(Date.from(ipoZonedDate.minusDays(1).toInstant()))
					.dividend(-1)
					.build());
			put(parserResult);
			log.debug("{} 『{}:{}』 itemDividend() - 『{}』 - {}", Utility.indentEnd(), STATUS.SUCCESS, parserResult, item, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		default:
			break;
		}

		log.debug("{} 『{}』 itemDividend() - 『{}』 - {}", Utility.indentEnd(), STATUS.FAILURE, item, Utility.toStringPastTimeReadable(started));
		return STATUS.FAILURE;
	}

	private STATUS itemIpoCloseRecent(ItemIpoCloseRecentJob job) {
		log.info("{} itemIpoCloseRecent({})", Utility.indentStart(), job);
		long started = System.currentTimeMillis();

		Result<ParserResult> result = crawlerService.crawlItemIpoCloseRecent(job.getDate());

		log.info("{} 『{}』 itemIpoCloseRecent({}) - {}", Utility.indentEnd(), result, job, Utility.toStringPastTimeReadable(started));
		return result.getStatus();
	}

	private STATUS dividendAllRecent(DividendAllRecentJob job) {
		log.info("{} dividendAll({})", Utility.indentStart(), job);
		long started = System.currentTimeMillis();

		Result<ParserResult> result = crawlerService.crawlDividendAllRecent();

		log.info("{} 『{}』 dividendAll({}) - {}", Utility.indentEnd(), result, job, Utility.toStringPastTimeReadable(started));
		return result.getStatus();
	}

	private STATUS stockCompile(StockCompileJob job) {
		log.info("{} stockCompile({})", Utility.indentStart(), job);
		long started = System.currentTimeMillis();

		List<ItemDomain> compileResult = stockService.compile(job.getStart());
		int purged = priceService.purge();

		log.info("{} 『{}/{}/{}/{}』『#{} #{}』 stockCompile({}) - {}", Utility.indentEnd()
				, Utility.size(queue0), Utility.size(queue1), Utility.size(queue2), Utility.size(queue3)
				, Utility.size(compileResult), purged
				, job, Utility.toStringPastTimeReadable(started));
		return STATUS.SUCCESS;
	}

	private STATUS priceLatest(PriceLatestJob job) {
		log.info("{} priceLatest()", Utility.indentStart());
		long started = System.currentTimeMillis();

		Result<ParserResult> crawlPriceResult = crawlerService.crawlPrice(Date.from(LocalDate.now().atStartOfDay().toInstant(Utility.ZONE_OFFSET_KST)));
		queue2.offer(StockCompileJob.builder().start(LocalDate.now().minusDays(7)).build());
		queue2.offer((Job)ApplicationContextProvider.getBean(ItemCompilePriceEarningsRatioJob.class));

		log.info("{} 『{}』 priceLatest() - 『{}』 - {}", Utility.indentEnd(), STATUS.SUCCESS, crawlPriceResult, Utility.toStringPastTimeReadable(started));
		return STATUS.SUCCESS;
	}

	private STATUS deduplicatePrice(DeduplicatePriceJob job) {
		log.info("{} deduplicatePrice({})", Utility.indentStart(), job);
		long started = System.currentTimeMillis();

		STATUS result = priceService.deduplicate();

		log.info("{} 『{}』 deduplicatePrice({}) - {}", Utility.indentEnd(), result, job, Utility.toStringPastTimeReadable(started));
		return result;
	}

	private STATUS backup(BackupJob job) {
		log.info("{} backup({})", Utility.indentStart(), job);
		long started = System.currentTimeMillis();

		String dir = CrawlerService.getBackupDir();
		String prices = priceService.download();
		Utility.write(String.format("%s/stock-prices.json", dir), prices);
		
		String items = itemService.download();
		Utility.write(String.format("%s/stock-items.json", dir), items);

		String dividends = dividendHistoryService.download();
		Utility.write(String.format("%s/stock-dividends.json", dir), dividends);

		STATUS result = STATUS.SUCCESS;

		log.info("{} 『{}』 backup({}) - {}", Utility.indentEnd(), result, job, Utility.toStringPastTimeReadable(started));
		return result;
	}

	private ParserResult put(ParserResult result) {
		log.debug("{} put({})", Utility.indentStart(), result);
		long started = System.currentTimeMillis();

		CrudList<ItemDomain> items = itemService.put(result.getItems());
		CrudList<DividendHistoryDomain> histories = dividendHistoryService.put(result.getHistories());
		CrudList<PriceDomain> prices = priceService.put(result.getPrices());

		log.debug("{} 『items:{}, histories:{}, prices:{}』 put({}) - {}", Utility.indentEnd(), items, histories, prices, result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	public void status() {
		Map<String, Integer> map = new HashMap<>();
		makeMap(map, queue0);
		makeMap(map, queue1);
		makeMap(map, queue2);
		makeMap(map, queue3);

		log.info("{} 『{}/{}/{}/{}』『master:{}』 status()", Utility.indentMiddle(), Utility.size(queue0), Utility.size(queue1), Utility.size(queue2), Utility.size(queue3), ZookeeperClient.isMaster());
		for (String key: map.keySet()) {
			log.debug("{} 『{}: {}』『master:{}』 status()", Utility.indentMiddle(), key, map.get(key), ZookeeperClient.isMaster());
		}
	}

	private void makeMap(Map<String, Integer> map, ConcurrentLinkedDeque<Job> queue) {
		for (Job job : queue) {
			String key = job.getClass().getName();
			Integer value = map.get(key);
			if (value == null) {
				value = 1;
			} else {
				value++;
			}
			
			map.put(key, value);
		}
	}

}
