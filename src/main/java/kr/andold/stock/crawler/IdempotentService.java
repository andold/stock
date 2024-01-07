package kr.andold.stock.crawler;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired private ItemService itemService;
	@Autowired private DividendService dividendService;
	@Autowired private DividendHistoryService dividendHistoryService;
	@Autowired private PriceService priceService;

	private ConcurrentLinkedDeque<ItemDomain> queue = new ConcurrentLinkedDeque<>();
	private boolean running = false;

	public ParserResult run() {
		log.info("{} run()", Utility.indentStart());
		long started = System.currentTimeMillis();

		if (running) {
			log.info("{} #{}:{} run() - {}", Utility.indentEnd(), Utility.size(queue), "BUSY", Utility.toStringPastTimeReadable(started));
			return null;
		}

		running = true;
		boolean restarted = false;
		ParserResult parserResult = null;
		for (int cx = 0; cx < BATCH_SIZE; cx++) {
			if (queue.isEmpty()) {
				if (restarted) {
					log.info("{} {} run() - {}", Utility.indentMiddle(), "다시 해봤는데, 진짜 할게 없다", Utility.toStringPastTimeReadable(started));
					break;
				}
				List<ItemDomain> items = itemService.search(null);
				queue.addAll(items);
				log.info("{} #{}:{} run() - {}", Utility.indentMiddle(), Utility.size(queue), "다했네, 다시한다", Utility.toStringPastTimeReadable(started));
				cx--;
				continue;
			}
			
			ItemDomain item = queue.poll();
			if (item == null) {
				log.info("{} #{}:{}:{} run() - {}", Utility.indentMiddle(), Utility.size(queue), "공갈빵", item, Utility.toStringPastTimeReadable(started));
				cx--;
				continue;
			}
			
			ZonedDateTime startZonedDate = LocalDate.of(LocalDate.now().getYear() - 8, 1, 1).atStartOfDay(Utility.ZONE_ID_KST);
			Date start = Date.from(startZonedDate.toInstant());
			List<DividendHistoryDomain> histories = dividendHistoryService.search(DividendHistoryParam.builder().code(item.getCode()).build());
			if (histories != null && !histories.isEmpty() && histories.get(histories.size() - 1).getBase().before(start)) {
				log.info("{} #{}:{}:{} run() - {}", Utility.indentMiddle(), Utility.size(queue), "이미 한건데", item, Utility.toStringPastTimeReadable(started));
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
				log.info("{} #{}:{}:{} {} run() - {}", Utility.indentMiddle(), Utility.size(queue), "했어요", item, parserResult, Utility.toStringPastTimeReadable(started));
				break;
			default:
				log.warn("{} #{}:{}:{} {} run() - {}", Utility.indentMiddle(), Utility.size(queue), "오류났어요", item, result, Utility.toStringPastTimeReadable(started));
				break;
			}

		}

		running = false;
		log.info("{} #{}:{} run() - {}", Utility.indentEnd(), Utility.size(queue), parserResult, Utility.toStringPastTimeReadable(started));
		return parserResult;
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

}
