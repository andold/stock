package kr.andold.stock.crawler;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.param.DividendHistoryParam;
import kr.andold.stock.service.DividendHistoryService;
import kr.andold.stock.service.ItemService;
import kr.andold.stock.service.PriceService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.CommonBlockService.CrudList;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class IdempotentService {
	@Autowired private Seibro seibro;
	@SuppressWarnings("unused") @Autowired private Krx krx;

	@Autowired private ItemService itemService;
	@Autowired private DividendHistoryService dividendHistoryService;
	@Autowired private PriceService priceService;

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
		CrudList<DividendHistoryDomain> histories = dividendHistoryService.put(result.getHistories());
		CrudList<PriceDomain> prices = priceService.put(result.getPrices());
		log.debug("{} put({}) - items:{}, histories:{}, prices:{}", Utility.indentMiddle(), result, items, histories, prices);

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
	public void once() {
		long started = System.currentTimeMillis();
		long pause = PAUSE_MAX;
		int precessed = 0;

		for (int cx = 0;; cx++) {

			ItemDomain item0 = q0.poll();
			if (item0 != null) {
				long forStarted = System.currentTimeMillis();
				IDEMPOTENT_STATUS status = processDetailInfo(item0);
				switch (status) {
				case FAILURE:
				case SUCCESS:
					precessed++;
					Utility.sleep(PAUSE_MIN);
					break;
				default:
					break;
				}
				log.info("{} 『#{}:#{}』『#{}:#{}:#{}:#{}』 『{} {}』 once() - {}/{}", Utility.indentMiddle(), cx, precessed, Utility.size(q0), Utility.size(q1), Utility.size(q2), Utility.size(q3), status, item0, Utility.toStringPastTimeReadable(forStarted), Utility.toStringPastTimeReadable(started));
				continue;
			}
			
			ItemDomain item1 = q1.poll();
			if (item1 != null) {
				long forStarted = System.currentTimeMillis();
				IDEMPOTENT_STATUS status = processDividend(item1);
				switch (status) {
				case FAILURE:
				case SUCCESS:
					precessed++;
					Utility.sleep(PAUSE_MIN);
					break;
				default:
					break;
				}
				log.info("{} 『#{}:#{}』『#{}:#{}:#{}:#{}』 『{} {}』 once() - {}/{}", Utility.indentMiddle(), cx, precessed, Utility.size(q0), Utility.size(q1), Utility.size(q2), Utility.size(q3), status, item1, Utility.toStringPastTimeReadable(forStarted), Utility.toStringPastTimeReadable(started));
				continue;
			}
			
			ItemDomain item2 = q2.poll();
			if (item2 != null) {
				long forStarted = System.currentTimeMillis();
				IDEMPOTENT_STATUS status = processPrice(item2);
				switch (status) {
				case FAILURE:
				case SUCCESS:
					precessed++;
					Utility.sleep(PAUSE_MIN);
					break;
				default:
					break;
				}
				log.info("{} 『#{}:#{}』『#{}:#{}:#{}:#{}』 『{} {}』 once() - {}/{}", Utility.indentMiddle(), cx, precessed, Utility.size(q0), Utility.size(q1), Utility.size(q2), Utility.size(q3), status, item2, Utility.toStringPastTimeReadable(forStarted), Utility.toStringPastTimeReadable(started));
				continue;
			}
			
			ItemDomain item3 = q3.poll();
			if (item3 != null) {
				long forStarted = System.currentTimeMillis();
				IDEMPOTENT_STATUS status = processReserved(item3);
				switch (status) {
				case FAILURE:
				case SUCCESS:
					precessed++;
					Utility.sleep(PAUSE_MIN);
					break;
				default:
					break;
				}
				log.info("{} 『#{}:#{}』『#{}:#{}:#{}:#{}』 『{} {}』 once() - {}/{}", Utility.indentMiddle(), cx, precessed, Utility.size(q0), Utility.size(q1), Utility.size(q2), Utility.size(q3), status, item3, Utility.toStringPastTimeReadable(forStarted), Utility.toStringPastTimeReadable(started));
				continue;
			}

			if (precessed > 0) {
				List<ItemDomain> items = itemService.search(null);
				q0.addAll(items);
				q1.addAll(items);
				q2.addAll(items);
				q3.addAll(items);
				pause = PAUSE_MIN;
				precessed = 0;
				log.info("{} DO_ALL 『#{}:#{}』 #{} - once() - {}", Utility.indentEnd(), cx, precessed, Utility.size(items), Utility.toStringPastTimeReadable(started));
				continue;
			}
			
			if (pause >= PAUSE_MAX) {
				List<ItemDomain> items = itemService.search(null);
				q0.addAll(items);
				q1.addAll(items);
				q2.addAll(items);
				q3.addAll(items);
				pause = PAUSE_MAX;
				log.info("{} NO_JOB_FINAL 『#{}:#{}』 #{} - once() - {}", Utility.indentEnd(), cx, precessed, Utility.size(items), Utility.toStringPastTimeReadable(started));
				continue;
			}

			List<ItemDomain> items = itemService.search(null);
			q0.addAll(items);
			q1.addAll(items);
			q2.addAll(items);
			q3.addAll(items);
			pause = Math.min(PAUSE_MAX, pause * 2);
			Utility.sleep(pause);
			log.info("{} NO_JOB 『#{}:#{}』『#{}:#{}:#{}:#{}』 once() - {}", Utility.indentMiddle(), cx, precessed, Utility.size(q0), Utility.size(q1), Utility.size(q2), Utility.size(q3), Utility.toStringPastTimeReadable(started));
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

		Result<ParserResult> result = seibro.price(item.getCode(), item.getIpoDate());
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
		if (item == null) {
			return IDEMPOTENT_STATUS.INVALID_JOB;
		}
		
		String symbol = item.getSymbol();
		Date ipoDate = item.getIpoDate();
		Integer volumeOfListedShares = item.getVolumeOfListedShares();
		String type = item.getType();
		String category = item.getCategory();

		if (!(symbol == null || symbol.isBlank() || volumeOfListedShares == null || type == null || type.isBlank() || category == null || category.isBlank() || ipoDate == null)) {
			return IDEMPOTENT_STATUS.ALEADY_DONE_JOB;
		}

		Result<ParserResult> itemResult = seibro.item(item.getCode());
		if (itemResult.getStatus() == STATUS.SUCCESS) {
			put(itemResult.getResult());
			return IDEMPOTENT_STATUS.SUCCESS;
		}

		return IDEMPOTENT_STATUS.FAILURE;
	}

}
