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
	@Autowired
	private Seibro seibro;

	@Autowired private ItemService itemService;
	@Autowired private DividendService dividendService;
	@Autowired private DividendHistoryService dividendHistoryService;
	@Autowired private PriceService priceService;

	private ConcurrentLinkedDeque<ItemDomain> queue = new ConcurrentLinkedDeque<>();

	public ParserResult run() {
		log.info("{} run()", Utility.indentStart());
		long started = System.currentTimeMillis();

		ParserResult parserResult = null;
		while (true) {
			if (queue.isEmpty()) {
				List<ItemDomain> items = itemService.search(null);
				queue.addAll(items);
				log.info("{} {} run() - {}", Utility.indentMiddle(), "NO JOB, RESTART", Utility.toStringPastTimeReadable(started));
				continue;
			}
			
			ItemDomain item = queue.poll();
			if (item == null) {
				log.info("{} {} run() - {}", Utility.indentMiddle(), "INVALID JOB", Utility.toStringPastTimeReadable(started));
				continue;
			}
			
			ZonedDateTime startZonedDate = LocalDate.of(LocalDate.now().getYear() - 8, 1, 1).atStartOfDay(Utility.ZONE_ID_KST);
			Date start = Date.from(startZonedDate.toInstant());
			List<DividendHistoryDomain> histories = dividendHistoryService.search(DividendHistoryParam.builder().code(item.getCode()).build());
			if (histories != null && !histories.isEmpty() && histories.get(histories.size() - 1).getBase().before(start)) {
				log.info("{} {} run() - {}", Utility.indentMiddle(), "NOTHING TO DO JOB", Utility.toStringPastTimeReadable(started));
				continue;
			}
			
			Result<ParserResult> result = seibro.dividend(item, start);
			switch (result.getStatus()) {
			case EXCEPTION:
			case FAIL:
			case NO_MORE_DATA:
				break;
			case SUCCESS:
			default:
				parserResult = result.getResult();
				List<DividendHistoryDomain> founds = parserResult.getHistories();
				founds.add(DividendHistoryDomain.builder().code(item.getCode()).base(Date.from(startZonedDate.minusDays(1).toInstant())).dividend(-1).build());
				put(parserResult);
				break;
			}
			break;
		}

		log.info("{} {} run() - {}", Utility.indentEnd(), parserResult, Utility.toStringPastTimeReadable(started));
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
