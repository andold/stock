package kr.andold.stock.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.crawler.Seibro;
import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.Job;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.CommonBlockService.CrudList;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.utils.Utility;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ItemDetailJobService implements Job {
	@Autowired private Seibro seibro;
	@Autowired private ItemService itemService;
	@Autowired private DividendHistoryService dividendHistoryService;
	@Autowired private PriceService priceService;

	@Setter private ItemDomain item;

	@Override
	public STATUS run() {
		log.info("{} run()", Utility.indentStart());
		long started = System.currentTimeMillis();

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

		log.debug("{} 『{}』 run() - {}", Utility.indentEnd(), STATUS.FAILURE, Utility.toStringPastTimeReadable(started));
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

}
