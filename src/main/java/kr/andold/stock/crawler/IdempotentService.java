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

	private ParserResult put(ParserResult result) {
		log.debug("{} put({})", Utility.indentStart(), result);
		long started = System.currentTimeMillis();

		CrudList<ItemDomain> items = itemService.put(result.getItems());
		CrudList<DividendHistoryDomain> histories = dividendHistoryService.put(result.getHistories());
		CrudList<PriceDomain> prices = priceService.put(result.getPrices());

		log.debug("{} 『items:{}, histories:{}, prices:{}』 put({}) - {}", Utility.indentEnd(), items, histories, prices, result, Utility.toStringPastTimeReadable(started));
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
				STATUS status = processDetailInfo(itemService.read(item0.getId()));
				switch (status) {
				case FAILURE:
				case SUCCESS:
					precessed++;
					Utility.sleep(PAUSE_MIN);
					log.info("{} 『#{}:#{}』『#{}:#{}:#{}:#{}』 『{} {}』 once() - {}/{}", Utility.indentMiddle(), cx, precessed, Utility.size(q0), Utility.size(q1), Utility.size(q2), Utility.size(q3), status, item0, Utility.toStringPastTimeReadable(forStarted), Utility.toStringPastTimeReadable(started));
					break;
				case ALEADY_DONE:
					break;
				default:
					log.info("{} 『#{}:#{}』『#{}:#{}:#{}:#{}』 『{} {}』 once() - {}/{}", Utility.indentMiddle(), cx, precessed, Utility.size(q0), Utility.size(q1), Utility.size(q2), Utility.size(q3), status, item0, Utility.toStringPastTimeReadable(forStarted), Utility.toStringPastTimeReadable(started));
					break;
				}
				continue;
			}
			
			ItemDomain item1 = q1.poll();
			if (item1 != null) {
				long forStarted = System.currentTimeMillis();
				STATUS status = processDividend(itemService.read(item1.getId()));
				switch (status) {
				case FAILURE:
				case SUCCESS:
					precessed++;
					Utility.sleep(PAUSE_MIN);
					log.info("{} 『#{}:#{}』『#{}:#{}:#{}:#{}』 『{} {}』 once() - {}/{}", Utility.indentMiddle(), cx, precessed, Utility.size(q0), Utility.size(q1), Utility.size(q2), Utility.size(q3), status, item1, Utility.toStringPastTimeReadable(forStarted), Utility.toStringPastTimeReadable(started));
					break;
				case ALEADY_DONE:
					break;
				default:
					log.debug("{} 『#{}:#{}』『#{}:#{}:#{}:#{}』 『{} {}』 once() - {}/{}", Utility.indentMiddle(), cx, precessed, Utility.size(q0), Utility.size(q1), Utility.size(q2), Utility.size(q3), status, item1, Utility.toStringPastTimeReadable(forStarted), Utility.toStringPastTimeReadable(started));
					break;
				}
				continue;
			}
			
			ItemDomain item2 = q2.poll();
			if (item2 != null) {
				long forStarted = System.currentTimeMillis();
				STATUS status = processPrice(itemService.read(item2.getId()));
				switch (status) {
				case FAILURE:
				case SUCCESS:
					precessed++;
					Utility.sleep(PAUSE_MIN);
					log.info("{} 『#{}:#{}』『#{}:#{}:#{}:#{}』 『{} {}』 once() - {}/{}", Utility.indentMiddle(), cx, precessed, Utility.size(q0), Utility.size(q1), Utility.size(q2), Utility.size(q3), status, item2, Utility.toStringPastTimeReadable(forStarted), Utility.toStringPastTimeReadable(started));
					break;
				case ALEADY_DONE:
					break;
				default:
					log.debug("{} 『#{}:#{}』『#{}:#{}:#{}:#{}』 『{} {}』 once() - {}/{}", Utility.indentMiddle(), cx, precessed, Utility.size(q0), Utility.size(q1), Utility.size(q2), Utility.size(q3), status, item2, Utility.toStringPastTimeReadable(forStarted), Utility.toStringPastTimeReadable(started));
					break;
				}
				continue;
			}
			
			ItemDomain item3 = q3.poll();
			if (item3 != null) {
				long forStarted = System.currentTimeMillis();
				STATUS status = processReserved(itemService.read(item3.getId()));
				switch (status) {
				case FAILURE:
				case SUCCESS:
					precessed++;
					Utility.sleep(PAUSE_MIN);
					log.info("{} 『#{}:#{}』『#{}:#{}:#{}:#{}』 『{} {}』 once() - {}/{}", Utility.indentMiddle(), cx, precessed, Utility.size(q0), Utility.size(q1), Utility.size(q2), Utility.size(q3), status, item3, Utility.toStringPastTimeReadable(forStarted), Utility.toStringPastTimeReadable(started));
					break;
				case ALEADY_DONE:
					break;
				default:
					log.debug("{} 『#{}:#{}』『#{}:#{}:#{}:#{}』 『{} {}』 once() - {}/{}", Utility.indentMiddle(), cx, precessed, Utility.size(q0), Utility.size(q1), Utility.size(q2), Utility.size(q3), status, item3, Utility.toStringPastTimeReadable(forStarted), Utility.toStringPastTimeReadable(started));
					break;
				}
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
				log.info("{} DO_ALL 『#{}:#{}』 #{} - once() - {}", Utility.indentMiddle(), cx, precessed, Utility.size(items), Utility.toStringPastTimeReadable(started));
				continue;
			}
			
			if (pause >= PAUSE_MAX) {
				List<ItemDomain> items = itemService.search(null);
				q0.addAll(items);
				q1.addAll(items);
				q2.addAll(items);
				q3.addAll(items);
				pause = PAUSE_MAX;
				log.info("{} NO_JOB_FINAL 『#{}:#{}』 #{} - once() - {}", Utility.indentMiddle(), cx, precessed, Utility.size(items), Utility.toStringPastTimeReadable(started));
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

	private STATUS processReserved(ItemDomain item) {
		return STATUS.RESERVED;
	}

	protected STATUS processPrice(ItemDomain item) {
		List<DividendHistoryDomain> histories = dividendHistoryService.search(DividendHistoryParam.builder().code(item.getCode()).build());
		Date date = priceService.dateCrawlRequireForDividend(item, histories);
		if (date == null) {
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
			return STATUS.SUCCESS;
		default:
			break;
		}
		return STATUS.FAILURE;
	}

	protected STATUS processDividend(ItemDomain item) {
		if (item == null) {
			return STATUS.INVALID;
		}

		String type = item.getType();
		if (type != null && (type.contains("기타비상장") || type.contains("코넥스"))) {
			return STATUS.INVALID;
		}
		
		Date ipoOpen = item.getIpoOpen();
		if (ipoOpen == null) {
			log.warn("{} 상장일이 없다 processDividend({})", Utility.indentMiddle(), Utility.toStringJson(item));
			return STATUS.INVALID;
		}

		Date today = new Date();
		Date ipoClose = item.getIpoClose();
		if (ipoClose != null && ipoClose.before(today)) {
			log.trace("{} 상장폐지 processDividend({})", Utility.indentMiddle(), Utility.toStringJson(item));
			return STATUS.INVALID;
		}

		ZonedDateTime ipoZonedDate = ZonedDateTime.ofInstant(ipoOpen.toInstant(), Utility.ZONE_ID_KST);
		List<DividendHistoryDomain> histories = dividendHistoryService.search(DividendHistoryParam.builder().code(item.getCode()).build());
		if (histories != null && !histories.isEmpty() && !ipoOpen.before(histories.get(histories.size() - 1).getBase())) {
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
			return STATUS.SUCCESS;
		default:
			break;
		}
		return STATUS.FAILURE;
	}

	protected STATUS processDetailInfo(ItemDomain item) {
		if (item == null) {
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
			return STATUS.ALEADY_DONE;
		}

		Result<ParserResult> itemResult = seibro.item(item.getCode());
		if (itemResult.getStatus() == STATUS.SUCCESS) {
			put(itemResult.getResult());
			return STATUS.SUCCESS;
		}

		return STATUS.FAILURE;
	}

}
