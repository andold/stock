package kr.andold.stock.service;

import java.time.ZonedDateTime;
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
import kr.andold.stock.param.DividendHistoryParam;
import kr.andold.stock.service.JobService.Job;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.utils.Utility;
import kr.andold.utils.persist.CrudList;
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
public class ItemDividendJob implements Job {
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

		ItemDividendJob that = (ItemDividendJob) ApplicationContextProvider.getBean(ItemDividendJob.class);
		that.setCode(getCode());
		that.setTimeout(getTimeout());
		STATUS result = that.main();
		
		log.debug("{} 『#{}』 call({}) - {}", Utility.indentEnd(), result, code, Utility.toStringPastTimeReadable(started));
		return result;
	}

	private STATUS main() throws Exception {
		log.debug("{} main(『{}』)", Utility.indentStart(), code);
		long started = System.currentTimeMillis();

		String code = getCode();
		if (code == null || code.isBlank()) {
			//	null is all
			List<ItemDomain> items = itemService.search(null);
			for (ItemDomain item: items) {
				JobService.getQueue2().offer(ItemDividendJob.builder().code(item.getCode()).build());
			}

			log.debug("{} 『{}:#{}』 main({}) - {}", Utility.indentEnd(), STATUS.SUCCESS, Utility.size(items), code, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		}

		ItemDomain item = itemService.read(code);
		if (item == null) {
			log.debug("{} 『{}』 main({}) - {}", Utility.indentEnd(), STATUS.INVALID, code, Utility.toStringPastTimeReadable(started));
			return STATUS.INVALID;
		}

		String type = item.getType();
		if (type != null && (type.contains("기타비상장") || type.contains("코넥스"))) {
			log.debug("{} 『{}:{}』 main({}) - 『{}』 - {}", Utility.indentEnd(), STATUS.INVALID, type, code, item, Utility.toStringPastTimeReadable(started));
			return STATUS.INVALID;
		}
		
		Date ipoOpen = item.getIpoOpen();
		if (ipoOpen == null) {
			log.debug("{} 『상장일이 없다:{}』 main({}) - 『{}』 - {}", Utility.indentEnd(), STATUS.INVALID, code, item, Utility.toStringPastTimeReadable(started));
			return STATUS.INVALID;
		}

		Date today = new Date();
		Date ipoClose = item.getIpoClose();
		if (ipoClose != null && ipoClose.before(today)) {
			log.debug("{} 『상장폐지:{}』 main({}) - {}", Utility.indentEnd(), STATUS.INVALID, item, code, Utility.toStringPastTimeReadable(started));
			return STATUS.INVALID;
		}

		ZonedDateTime ipoZonedDate = ZonedDateTime.ofInstant(ipoOpen.toInstant(), Utility.ZONE_ID_KST);
		List<DividendHistoryDomain> histories = dividendHistoryService.search(DividendHistoryParam.builder().code(item.getCode()).build());
		if (histories != null && !histories.isEmpty() && !ipoOpen.before(histories.get(histories.size() - 1).getBase())) {
			log.trace("{} 『{}』 main({}) - 『{}』 - {}", Utility.indentEnd(), STATUS.ALEADY_DONE, code, item, Utility.toStringPastTimeReadable(started));
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
			log.debug("{} 『{}:{}』 main({}) - 『{}』 - {}", Utility.indentEnd(), STATUS.SUCCESS, parserResult, code, item, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		default:
			break;
		}

		log.debug("{} 『{}』 main({}) - 『{}』 - {}", Utility.indentEnd(), STATUS.FAILURE, code, item, Utility.toStringPastTimeReadable(started));
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

	@Override
	public String toString() {
		return String.format("ItemDividendJob(timeout: %d, code: %s)", timeout, code);
	}

}
