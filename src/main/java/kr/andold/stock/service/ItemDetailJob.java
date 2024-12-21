package kr.andold.stock.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.ApplicationContextProvider;
import kr.andold.stock.crawler.Seibro;
import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.CommonBlockService.CrudList;
import kr.andold.stock.service.JobService.Job;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.utils.Utility;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@Service
public class ItemDetailJob implements Job {
	@Builder.Default @Getter @Setter private Long timeout = 300L;	//	TimeUnit.SECONDS
	@Getter @Setter private String code;

	@Autowired private DividendHistoryService dividendHistoryService;
	@Autowired private ItemService itemService;
	@Autowired private PriceService priceService;
	@Autowired private Seibro seibro;

	@Override
	public STATUS call() throws Exception {
		log.debug("{} call({})", Utility.indentStart(), code);
		long started = System.currentTimeMillis();

		ItemDetailJob that = (ItemDetailJob) ApplicationContextProvider.getBean(ItemDetailJob.class);
		that.setCode(getCode());
		that.setTimeout(getTimeout());
		STATUS result = that.main();
		
		log.debug("{} 『#{}』 call({}) - {}", Utility.indentEnd(), result, code, Utility.toStringPastTimeReadable(started));
		return result;
	}

	private STATUS main() throws Exception {
		log.debug("{} main({})", Utility.indentStart(), code);
		long started = System.currentTimeMillis();

		String code = getCode();
		if (code == null || code.isBlank()) {
			//	null is all
			List<ItemDomain> items = itemService.search(null);
			for (ItemDomain item: items) {
				JobService.getQueue2().offer(ItemDetailJob.builder().code(item.getCode()).build());
			}

			log.debug("{} 『{}:#{}』 main({}) - 『{}』 - {}", Utility.indentEnd(), STATUS.SUCCESS, Utility.size(items), code, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		}

		ItemDomain item = itemService.read(code);
		if (item == null) {
			log.debug("{} 『{}』 main() - 『{}』 - {}", Utility.indentEnd(), STATUS.INVALID, code, Utility.toStringPastTimeReadable(started));
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
			log.debug("{} 『{}』 main() - 『{}』 - {}", Utility.indentEnd(), STATUS.ALEADY_DONE, item, Utility.toStringPastTimeReadable(started));
			return STATUS.ALEADY_DONE;
		}

		Result<ParserResult> itemResult = seibro.item(item.getCode());
		if (itemResult.getStatus() == STATUS.SUCCESS) {
			put(itemResult.getResult());
			log.debug("{} 『{}:{}』 main() - 『{}』 - {}", Utility.indentEnd(), STATUS.SUCCESS, itemResult, item, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		}

		log.debug("{} 『{}』 main() - {}", Utility.indentEnd(), itemResult.getStatus(), Utility.toStringPastTimeReadable(started));
		return itemResult.getStatus();
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

	@Override
	public String toString() {
		return String.format("ItemDetailJob(timeout: %d, code: %s)", timeout, code);
	}

}
