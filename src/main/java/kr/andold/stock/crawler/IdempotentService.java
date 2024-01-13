package kr.andold.stock.crawler;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.DividendDomain;
import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.domain.Result;
import kr.andold.stock.param.DividendHistoryParam;
import kr.andold.stock.service.DividendHistoryService;
import kr.andold.stock.service.DividendService;
import kr.andold.stock.service.ItemService;
import kr.andold.stock.service.PriceService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.CommonBlockService.CrudList;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class IdempotentService {
	private static final int BATCH_SIZE = 1;

	@Autowired
	private Seibro seibro;
	@Autowired
	private Krx krx;

	@Autowired
	private ItemService itemService;
	@Autowired
	private DividendService dividendService;
	@Autowired
	private DividendHistoryService dividendHistoryService;
	@Autowired
	private PriceService priceService;

	public static enum IDEMPOTENT_STATUS {
		SUCCESS("성공")
		, FAILURE("실패")
		, BUSY("바쁘다")
		, NOTHING_TO_DO("다시해봐도 할게없다")
		, DONE_RESTART("할게 있을수 있다")
		, INVALID_JOB("뭬야")
		, ALEADY_DONE_JOB("한거다")
		, RESERVED("예약")
	;

		private String title;

		private IDEMPOTENT_STATUS(String string) {
			title = string;
		}

		public String get() {
			return title;
		}
	}

	private ConcurrentLinkedDeque<ItemDomain> qDividend = new ConcurrentLinkedDeque<>();
	private ConcurrentLinkedDeque<ItemDomain> qPrice = new ConcurrentLinkedDeque<>();
	private boolean running = false;

	@Async
	public Future<ParserResult> run() {
		log.info("{} run()", Utility.indentStart());
		long started = System.currentTimeMillis();

		if (running) {
			log.info("{} #{}:#{}:{} run() - {}", Utility.indentEnd(), Utility.size(qDividend), Utility.size(qPrice), IDEMPOTENT_STATUS.BUSY, Utility.toStringPastTimeReadable(started));
			return CompletableFuture.completedFuture(null);
		}

		running = true;
		boolean restarted = false;
		ParserResult parserResult = null;
		for (int cx = 0; cx < BATCH_SIZE; cx++) {
			if (qDividend.isEmpty() && qPrice.isEmpty()) {
				if (restarted) {
					log.info("{} {} run() - {}", Utility.indentMiddle(), IDEMPOTENT_STATUS.NOTHING_TO_DO, Utility.toStringPastTimeReadable(started));
					break;
				}

				List<ItemDomain> items = itemService.search(null);
				restarted = true;
				qDividend.addAll(items);
				qPrice.addAll(items);
				log.info("{} #{}:#{}:{} run() - {}", Utility.indentMiddle(), Utility.size(qDividend), Utility.size(qPrice), IDEMPOTENT_STATUS.DONE_RESTART, Utility.toStringPastTimeReadable(started));
				cx--;
				continue;
			}

			if (qDividend.isEmpty()) {
				// 배당일자 주가 수집
				ItemDomain item = qPrice.poll();
				if (item == null) {
					log.info("{} 배당주가 #{}:#{}:{}:{} run() - {}", Utility.indentMiddle(), Utility.size(qDividend), Utility.size(qPrice), IDEMPOTENT_STATUS.INVALID_JOB, item, Utility.toStringPastTimeReadable(started));
					cx--;
					continue;
				}

				List<DividendHistoryDomain> histories = dividendHistoryService.search(DividendHistoryParam.builder().code(item.getCode()).build());
				if (!isRequireCrawlPrice(histories)) {
					log.info("{} 배당주가 #{}:#{}:{}:{} run() - {}", Utility.indentMiddle(), Utility.size(qDividend), Utility.size(qPrice), IDEMPOTENT_STATUS.ALEADY_DONE_JOB, Utility.toStringPastTimeReadable(started));
					cx--;
					continue;
				}

				Result<ParserResult> result = krx.price(item, histories);
				switch (result.getStatus()) {
				case SUCCESS:
					parserResult = result.getResult();
					parserResult.setHistories(histories);
					List<PriceDomain> prices = parserResult.getPrices();
					Map<String, PriceDomain> mapP = priceService.makeMap(prices);
					dividendHistoryService.compile(histories, mapP);
					put(parserResult);
					log.info("{} 배당주가 #{}:#{}:{}:{} run() - {}", Utility.indentMiddle(), Utility.size(qDividend), Utility.size(qPrice), IDEMPOTENT_STATUS.SUCCESS, item, Utility.toStringPastTimeReadable(started));
					break;
				default:
					log.warn("{} 배당주가 #{}:#{}:{}:{} run() - {}", Utility.indentMiddle(), Utility.size(qDividend), Utility.size(qPrice), IDEMPOTENT_STATUS.FAILURE, item, Utility.toStringPastTimeReadable(started));
					break;
				}

				continue;
			}

			// 배당금 수집
			ItemDomain item = qDividend.poll();
			if (item == null) {
				log.info("{} 배당이력 #{}:#{}:{}:{} run() - {}", Utility.indentMiddle(), Utility.size(qDividend), Utility.size(qPrice), IDEMPOTENT_STATUS.INVALID_JOB, item, Utility.toStringPastTimeReadable(started));
				cx--;
				continue;
			}

			ZonedDateTime startZonedDate = LocalDate.of(LocalDate.now().getYear() - 8, 1, 1).atStartOfDay(Utility.ZONE_ID_KST);
			Date start = Date.from(startZonedDate.toInstant());
			List<DividendHistoryDomain> histories = dividendHistoryService.search(DividendHistoryParam.builder().code(item.getCode()).build());
			if (histories != null && !histories.isEmpty() && histories.get(histories.size() - 1).getBase().before(start)) {
				log.info("{} 배당이력 #{}:#{}:{}:{} run() - {}", Utility.indentMiddle(), Utility.size(qDividend), Utility.size(qPrice), IDEMPOTENT_STATUS.ALEADY_DONE_JOB, item, Utility.toStringPastTimeReadable(started));
				cx--;
				continue;
			}

			Result<ParserResult> result = seibro.dividend(item, start);
			switch (result.getStatus()) {
			case SUCCESS:
				parserResult = result.getResult();
				List<DividendHistoryDomain> founds = parserResult.getHistories();
				founds.add(DividendHistoryDomain.builder().code(item.getCode()).base(Date.from(startZonedDate.minusDays(1).toInstant())).dividend(-1).build());
				put(parserResult);
				log.info("{} 배당이력 #{}:#{}:{}:{} run() - {}", Utility.indentMiddle(), Utility.size(qDividend), Utility.size(qPrice), IDEMPOTENT_STATUS.SUCCESS, item, Utility.toStringPastTimeReadable(started));
				break;
			default:
				log.warn("{} 배당이력 #{}:#{}:{}:{} run() - {}", Utility.indentMiddle(), Utility.size(qDividend), Utility.size(qPrice), IDEMPOTENT_STATUS.FAILURE, item, Utility.toStringPastTimeReadable(started));
				break;
			}

			continue;
		}

		running = false;
		log.info("{} #{}:#{}:{} run() - {}", Utility.indentEnd(), Utility.size(qDividend), Utility.size(qPrice), parserResult, Utility.toStringPastTimeReadable(started));
		return CompletableFuture.completedFuture(parserResult);
	}

	private boolean isRequireCrawlPrice(List<DividendHistoryDomain> histories) {
		if (histories == null) {
			return false;
		}
		for (DividendHistoryDomain history : histories) {
			if (history == null) {
				continue;
			}

			Integer dividend = history.getDividend();

			if (dividend == null || dividend <= 0) {
				continue;
			}

			if (history.getPriceBase() == null || history.getPriceClosing() == null) {
				return true;
			}
		}
		return false;
	}

	private ParserResult put(ParserResult result) {
		log.debug("{} put({})", Utility.indentStart(), result);
		long started = System.currentTimeMillis();

		CrudList<ItemDomain> items = itemService.put(result.getItems());
		CrudList<DividendDomain> dividends = dividendService.put(result.getDividends());
		CrudList<DividendHistoryDomain> histories = dividendHistoryService.put(result.getHistories());
		CrudList<PriceDomain> prices = priceService.put(result.getPrices());
		log.debug("{} put({}) - items:{}, dividends:{}, histories:{}, prices:{}", Utility.indentMiddle(), result, items, dividends, histories, prices);

		log.debug("{} put({}) - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	private static final long PAUSE_MIN = 1000 * 1;
	private static final long PAUSE_MAX = 1000 * 60 * 60 * 2;
	ConcurrentLinkedDeque<ItemDomain> q0 = new ConcurrentLinkedDeque<>();	// 상세정보
	ConcurrentLinkedDeque<ItemDomain> q1 = new ConcurrentLinkedDeque<>();	// 배당정보
	ConcurrentLinkedDeque<ItemDomain> q2 = new ConcurrentLinkedDeque<>();	// 주가정보
	ConcurrentLinkedDeque<ItemDomain> q3 = new ConcurrentLinkedDeque<>();	// reserved
	@Async
	public synchronized void once() {
		long pause = PAUSE_MAX;

		for (int cx = 0;; cx++) {
			long started = System.currentTimeMillis();
			int precessed = 0;

			for (ItemDomain item = q0.poll(); item != null; item = q0.poll()) {
				long forStarted = System.currentTimeMillis();
				IDEMPOTENT_STATUS status = processDetailInfo(item);
				switch (status) {
				case FAILURE:
				case SUCCESS:
					precessed++;
					Utility.sleep(PAUSE_MIN);
					break;
				default:
					break;
				}
				log.info("{} 『#{}:#{}』『#{}:#{}:#{}:#{}』 『{} {}』 once() - {}/{}", Utility.indentMiddle(), cx, precessed, Utility.size(q0), Utility.size(q1), Utility.size(q2), Utility.size(q3), status, item, Utility.toStringPastTimeReadable(forStarted), Utility.toStringPastTimeReadable(started));
			}
			for (ItemDomain item = q1.poll(); item != null; item = q1.poll()) {
				long forStarted = System.currentTimeMillis();
				IDEMPOTENT_STATUS status = processDividend(item);
				switch (status) {
				case FAILURE:
				case SUCCESS:
					precessed++;
					Utility.sleep(PAUSE_MIN);
					break;
				default:
					break;
				}
				log.info("{} 『#{}:#{}』『#{}:#{}:#{}:#{}』 『{} {}』 once() - {}/{}", Utility.indentMiddle(), cx, precessed, Utility.size(q0), Utility.size(q1), Utility.size(q2), Utility.size(q3), status, item, Utility.toStringPastTimeReadable(forStarted), Utility.toStringPastTimeReadable(started));
			}
			for (ItemDomain item = q2.poll(); item != null; item = q2.poll()) {
				long forStarted = System.currentTimeMillis();
				IDEMPOTENT_STATUS status = processPrice(item);
				switch (status) {
				case FAILURE:
				case SUCCESS:
					precessed++;
					Utility.sleep(PAUSE_MIN);
					break;
				default:
					break;
				}
				log.info("{} 『#{}:#{}』『#{}:#{}:#{}:#{}』 『{} {}』 once() - {}/{}", Utility.indentMiddle(), cx, precessed, Utility.size(q0), Utility.size(q1), Utility.size(q2), Utility.size(q3), status, item, Utility.toStringPastTimeReadable(forStarted), Utility.toStringPastTimeReadable(started));
			}
			for (ItemDomain item = q3.poll(); item != null; item = q3.poll()) {
				long forStarted = System.currentTimeMillis();
				IDEMPOTENT_STATUS status = processReserved(item);
				switch (status) {
				case FAILURE:
				case SUCCESS:
					precessed++;
					Utility.sleep(PAUSE_MIN);
					break;
				default:
					break;
				}
				log.info("{} 『#{}:#{}』『#{}:#{}:#{}:#{}』 『{} {}』 once() - {}/{}", Utility.indentMiddle(), cx, precessed, Utility.size(q0), Utility.size(q1), Utility.size(q2), Utility.size(q3), status, item, Utility.toStringPastTimeReadable(forStarted), Utility.toStringPastTimeReadable(started));
			}

			if (precessed > 0) {
				List<ItemDomain> items = itemService.search(null);
				q0.addAll(items);
				q1.addAll(items);
				q2.addAll(items);
				q3.addAll(items);
				log.info("{} 『#{}:#{}』 #{} - once() - {}", Utility.indentEnd(), cx, precessed, Utility.size(items), Utility.toStringPastTimeReadable(started));
				pause = Math.max(PAUSE_MIN, pause / 2);
			} else if (pause >= PAUSE_MAX) {
				List<ItemDomain> items = itemService.search(null);
				q0.addAll(items);
				q1.addAll(items);
				q2.addAll(items);
				q3.addAll(items);
				log.info("{} 『#{}:#{}』 #{} - once() - {}", Utility.indentEnd(), cx, precessed, Utility.size(items), Utility.toStringPastTimeReadable(started));
				pause = PAUSE_MIN;
			} else {
				pause = Math.min(PAUSE_MAX, pause * 2);
			}
			
			Utility.sleep(pause);
			log.info("{} 『#{}:#{}』『#{}:#{}:#{}:#{}』 once() - {}", Utility.indentMiddle(), cx, precessed, Utility.size(q0), Utility.size(q1), Utility.size(q2), Utility.size(q3), Utility.toStringPastTimeReadable(started));
		}
	}

	private IDEMPOTENT_STATUS processReserved(ItemDomain item) {
		return IDEMPOTENT_STATUS.RESERVED;
	}

	private IDEMPOTENT_STATUS processPrice(ItemDomain item) {
		List<DividendHistoryDomain> histories = dividendHistoryService.search(DividendHistoryParam.builder().code(item.getCode()).build());
		if (!isRequireCrawlPrice(histories)) {
			return IDEMPOTENT_STATUS.ALEADY_DONE_JOB;
		}

		Result<ParserResult> result = krx.price(item.getCode(), item.getIpoDate());
		switch (result.getStatus()) {
		case SUCCESS:
			ParserResult parserResult = result.getResult();
			parserResult.setHistories(histories);
			List<PriceDomain> prices = parserResult.getPrices();
			Map<String, PriceDomain> mapP = priceService.makeMap(prices);
			dividendHistoryService.compile(histories, mapP);
			priceService.compile(prices, false);
			put(parserResult);
			return IDEMPOTENT_STATUS.SUCCESS;
		default:
			break;
		}
		return IDEMPOTENT_STATUS.FAILURE;
	}

	private IDEMPOTENT_STATUS processDividend(ItemDomain item) {
		if (item == null) {
			return IDEMPOTENT_STATUS.INVALID_JOB;
		}
		
		Date ipoDate = item.getIpoDate();
		if (ipoDate == null) {
			log.warn("{} 상장일이 없다 processDividend({})", Utility.indentMiddle(), Utility.toStringJson(item));
			return IDEMPOTENT_STATUS.INVALID_JOB;
		}

		ZonedDateTime ipoZonedDate = ZonedDateTime.ofInstant(ipoDate.toInstant(), Utility.ZONE_ID_KST);
		List<DividendHistoryDomain> histories = dividendHistoryService.search(DividendHistoryParam.builder().code(item.getCode()).build());
		if (histories != null && !histories.isEmpty() && histories.get(histories.size() - 1).getBase().before(ipoDate)) {
			return IDEMPOTENT_STATUS.ALEADY_DONE_JOB;
		}

		Result<ParserResult> result = seibro.dividend(item, Date.from(ipoZonedDate.toInstant()));
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
			return IDEMPOTENT_STATUS.SUCCESS;
		default:
			break;
		}
		return IDEMPOTENT_STATUS.FAILURE;
	}

	private IDEMPOTENT_STATUS processDetailInfo(ItemDomain item) {
		return IDEMPOTENT_STATUS.RESERVED;
	}

}
