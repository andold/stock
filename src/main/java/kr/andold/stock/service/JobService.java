package kr.andold.stock.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

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

	static interface Job {
		default STATUS run() {
			return STATUS.NOT_SUPPORT;
		}
	}
	@Data
	@Builder
	public static class ItemDetailJob implements Job {
		private String code;
	}
	@Data
	@Builder
	public static class ItemDividendJob implements Job {
		private String code;
	}
	@Data
	@Builder
	public static class PriceLatestJob implements Job {
	}
	@Data
	@Builder
	public static class StockCompileJob implements Job {
	}
	@Builder
	public static class DividendAllRecentJob implements Job {
	}
	@Data
	@Builder
	public static class ItemIpoCloseRecentJob implements Job {
		private Date date;
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

	@Async
	public void run() {
		log.info("{} run() ------------------------------------------------------------------------------------------------", Utility.indentStart());
		long started = System.currentTimeMillis();

		for (int cx = 0;; cx++) {
			try {
				NetworkUsage startedNetworkUsage = new NetworkUsage();

				STATUS result = run(cx);

				int mills = startedNetworkUsage.pause(1024 * 1024 * 8 / 60); // 1분(60초)에 1 Mbytes 트래픽
				if (size(queue0) == 0 && size(queue1) == 0 && size(queue2) == 0 && size(queue3) == 0) {
					mills = 60000;
				}
				if (!result.equals(STATUS.SUCCESS) || cx % 512 == 0) {
					log.info("{} run() - 『{}』『{}/{}/{}/{}』『{}』『{} ms』 - {}", Utility.indentMiddle()
							, cx, size(queue0), size(queue1), size(queue2), size(queue3)
							, result, mills, Utility.toStringPastTimeReadable(started));
				}

				mills = Math.max(Math.min(mills, 60000), 32);
				Utility.sleep(mills);
				continue;
			} catch (Exception e) {
				log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
			}

			Utility.sleep(1000);
			log.info("{} run() - 『{}』『{} {}』 - {}", Utility.indentMiddle(), cx, size(queue0), size(queue1),
					Utility.toStringPastTimeReadable(started));
		}
	}

	protected STATUS run(int count) {
		log.trace("{} run({})", Utility.indentStart(), count);
		long started = System.currentTimeMillis();

		if (queue0.peek() != null) {
			Job job = queue0.poll();
			STATUS result = run(count, job);

			log.trace("{} run({}) - 『{} {}』 - {}", Utility.indentEnd(), result, count, size(queue0), size(queue1), Utility.toStringPastTimeReadable(started));
			return result;
		}

		if (queue1.peek() != null) {
			Job job = queue1.poll();
			STATUS result = run(count, job);

			log.trace("{} run({}) - 『{} {}』 - {}", Utility.indentEnd(), result, count, size(queue0), size(queue1), Utility.toStringPastTimeReadable(started));
			return result;
		}
		
		if (queue2.peek() != null) {
			Job job = queue2.poll();
			STATUS result = run(count, job);

			log.trace("{} run({}) - 『{} {}』 - {}", Utility.indentEnd(), result, count, size(queue0), size(queue1), Utility.toStringPastTimeReadable(started));
			return result;
		}
		
		if (queue3.peek() != null) {
			Job job = queue3.poll();
			STATUS result = run(count, job);

			log.trace("{} run({}) - 『{} {}』 - {}", Utility.indentEnd(), result, count, size(queue0), size(queue1), Utility.toStringPastTimeReadable(started));
			return result;
		}
		
		log.trace("{} 『{}』 run({}) - 『{} {}』 - {}", Utility.indentEnd(), STATUS.SUCCESS, count, size(queue0), size(queue1), Utility.toStringPastTimeReadable(started));
		return STATUS.SUCCESS;
	}

	private STATUS run(int count, Job job) {
		log.trace("{} run({}, {})", Utility.indentStart(), count, job);
		long started = System.currentTimeMillis();

		if (job == null) {
			log.trace("{} 『NULL{}』 run({}, {}) - {}", Utility.indentEnd(), STATUS.INVALID, count, job, Utility.toStringPastTimeReadable(started));
			return STATUS.INVALID;
		}
		
		if (job instanceof ItemDetailJob) {
			STATUS result = itemDetail((ItemDetailJob) job);

			log.trace("{} 『{}』 run({}, {}) - {}", Utility.indentEnd(), result, count, job, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		}

		if (job instanceof PriceLatestJob) {
			STATUS result = priceLatest((PriceLatestJob) job);

			log.trace("{} 『{}』 run({}, {}) - {}", Utility.indentEnd(), result, count, job, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		}

		if (job instanceof StockCompileJob) {
			STATUS result = stockCompile((StockCompileJob) job);

			log.trace("{} 『{}』 run({}, {}) - {}", Utility.indentEnd(), result, count, job, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		}

		if (job instanceof DividendAllRecentJob) {
			STATUS result = dividendAllRecent((DividendAllRecentJob) job);

			log.trace("{} 『{}』 run({}, {}) - {}", Utility.indentEnd(), result, count, job, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		}

		if (job instanceof ItemIpoCloseRecentJob) {
			STATUS result = itemIpoCloseRecent((ItemIpoCloseRecentJob) job);

			log.trace("{} 『{}』 run({}, {}) - {}", Utility.indentEnd(), result, count, job, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		}

		if (job instanceof ItemDividendJob) {
			STATUS result = itemDividend((ItemDividendJob) job);

			log.trace("{} 『{}』 run({}, {}) - {}", Utility.indentEnd(), result, count, job, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		}

		log.trace("{} 『{}』 run({}, {}) - {}", Utility.indentEnd(), STATUS.NOT_SUPPORT, count, job, Utility.toStringPastTimeReadable(started));
		return STATUS.NOT_SUPPORT;
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

			log.debug("{} 『{}:#{}』 itemDividend() - 『{}』 - {}", Utility.indentEnd(), STATUS.SUCCESS, Utility.size(items), code, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		}

		ItemDomain item = itemService.read(code);
		if (item == null) {
			log.debug("{} 『{}』 itemDividend() - 『{}』 - {}", Utility.indentEnd(), STATUS.INVALID, code, Utility.toStringPastTimeReadable(started));
			return STATUS.INVALID;
		}

		String type = item.getType();
		if (type != null && (type.contains("기타비상장") || type.contains("코넥스"))) {
			log.debug("{} 『{}』 itemDividend() - 『{}』 - {}", Utility.indentEnd(), STATUS.INVALID, item, Utility.toStringPastTimeReadable(started));
			return STATUS.INVALID;
		}
		
		Date ipoOpen = item.getIpoOpen();
		if (ipoOpen == null) {
			log.debug("{} 『상장일이 없다:{}』 itemDividend() - 『{}』 - {}", Utility.indentEnd(), STATUS.INVALID, item, Utility.toStringPastTimeReadable(started));
			return STATUS.INVALID;
		}

		Date today = new Date();
		Date ipoClose = item.getIpoClose();
		if (ipoClose != null && ipoClose.before(today)) {
			log.debug("{} 『상장폐지:{}』 itemDividend() - 『{}』 - {}", Utility.indentEnd(), STATUS.INVALID, item, Utility.toStringPastTimeReadable(started));
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
		log.info("{} stockCompile()", Utility.indentStart());
		long started = System.currentTimeMillis();

		List<ItemDomain> compileResult = stockService.compile();
		int purged = priceService.purge();

		log.info("{} 『#{} #{}』 stockCompile() - {}", Utility.indentEnd(), Utility.size(compileResult), purged, Utility.toStringPastTimeReadable(started));
		return STATUS.SUCCESS;
	}

	private STATUS priceLatest(PriceLatestJob job) {
		log.info("{} priceLatest()", Utility.indentStart());
		long started = System.currentTimeMillis();

		Result<ParserResult> crawlPriceResult = crawlerService.crawlPrice(Date.from(LocalDate.now().atStartOfDay().toInstant(Utility.ZONE_OFFSET_KST)));
		queue2.offer(StockCompileJob.builder().build());

		log.info("{} 『{}』 priceLatest() - 『{}』 - {}", Utility.indentEnd(), STATUS.SUCCESS, crawlPriceResult, Utility.toStringPastTimeReadable(started));
		return STATUS.SUCCESS;
	}

	private STATUS itemDetail(ItemDetailJob job) {
		log.trace("{} itemDetail(『{}』)", Utility.indentStart(), job);
		long started = System.currentTimeMillis();

		String code = job.getCode();
		if (code == null || code.isBlank()) {
			//	null is all
			List<ItemDomain> items = itemService.search(null);
			for (ItemDomain item: items) {
				queue2.offer(ItemDetailJob.builder().code(item.getCode()).build());
			}

			log.debug("{} 『{}:#{}』 run() - 『{}』 - {}", Utility.indentEnd(), STATUS.SUCCESS, Utility.size(items), code, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		}

		ItemDomain item = itemService.read(code);
		if (item == null) {
			log.debug("{} 『{}』 run() - 『{}』 - {}", Utility.indentEnd(), STATUS.INVALID, code, Utility.toStringPastTimeReadable(started));
			return STATUS.INVALID;
		}

		String symbol = item.getSymbol();
		Date ipoOpen = item.getIpoOpen();
		Date ipoClose = item.getIpoClose();
		Integer volumeOfListedShares = item.getVolumeOfListedShares();
		String type = item.getType();
		String category = item.getCategory();
		Date today = new Date();

		if (!(symbol == null || symbol.isBlank()
					|| volumeOfListedShares == null
					|| type == null || type.isBlank()
					|| category == null || category.isBlank()
					|| ipoOpen == null
				)
				|| (ipoClose != null && ipoClose.before(today))
				|| (type != null && (type.contains("비상장") || type.contains("코넥스")))
			) {
			log.trace("{} 『{}』 run() - 『{}』 - {}", Utility.indentEnd(), STATUS.ALEADY_DONE, item, Utility.toStringPastTimeReadable(started));
			return STATUS.ALEADY_DONE;
		}

		Result<ParserResult> itemResult = seibro.item(item.getCode());
		if (itemResult.getStatus() == STATUS.SUCCESS) {
			put(itemResult.getResult());
			log.debug("{} 『{}:{}』 run() - 『{}』 - {}", Utility.indentEnd(), STATUS.SUCCESS, itemResult, item, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		}

		log.debug("{} 『{}:{}』 run() - 『{}』 - {}", Utility.indentEnd(), STATUS.FAILURE, itemResult, item, Utility.toStringPastTimeReadable(started));
		return STATUS.FAILURE;
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

	private int size(ConcurrentLinkedDeque<?> q) {
		return (q == null) ? -1 : q.size();
	}

}
