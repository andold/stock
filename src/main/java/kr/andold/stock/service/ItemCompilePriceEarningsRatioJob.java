package kr.andold.stock.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.ApplicationContextProvider;
import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.param.DividendHistoryParam;
import kr.andold.stock.param.PriceParam;
import kr.andold.stock.service.CommonBlockService.CrudList;
import kr.andold.stock.service.JobService.Job;
import kr.andold.utils.Utility;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ItemCompilePriceEarningsRatioJob implements Job {
	@Autowired
	private ItemService itemService;
	@Autowired
	private DividendHistoryService dividendHistoryService;
	@Autowired
	private PriceService priceService;

	private List<DividendHistoryDomain> dividends;
	private List<PriceDomain> prices;

	@Getter private Long timeout = 240L;	//	TimeUnit.SECONDS
	
	@Override
	public STATUS call() throws Exception {
		log.info("{} call()", Utility.indentStart());
		long started = System.currentTimeMillis();

		ItemCompilePriceEarningsRatioJob that = (ItemCompilePriceEarningsRatioJob) ApplicationContextProvider.getBean(ItemCompilePriceEarningsRatioJob.class);
		STATUS result = that.main();
		
		log.info("{} 『#{}』 call() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return STATUS.SUCCESS;
	}

	private STATUS main() throws Exception {
		log.info("{} main()", Utility.indentStart());
		long started = System.currentTimeMillis();

		ItemCompilePriceEarningsRatioJob that = (ItemCompilePriceEarningsRatioJob) ApplicationContextProvider.getBean(ItemCompilePriceEarningsRatioJob.class);
		Map<String, Float> map = that.compileByCurrentPrice();
		that.compileByThenPrice(map);
		List<ItemDomain> items = new ArrayList<>();
		for (String code : map.keySet()) {
			ItemDomain item = ItemDomain.builder().code(code).priceEarningsRatio(map.get(code)).build();
			items.add(item);
		}
		CrudList<ItemDomain> result = itemService.put(items);

		log.info("{} 『#{}』 main() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return STATUS.SUCCESS;
	}

	private Map<String, Float> compileByThenPrice(Map<String, Float> mapMaxRecent) {
		log.info("{} compileByThenPrice()", Utility.indentStart());
		long started = System.currentTimeMillis();

		Map<String, PriceDomain> mapThenPrice = new HashMap<>();	//	당시 주식 가격
		for (PriceDomain price : prices) {
			String key = String.format("%s.%tF", price.getCode(), price.getBase());
			mapThenPrice.put(key, price);
		}

		Map<String, Float> mapYearlySummaryRatio = new HashMap<>();	//	연간 배당금 합계
		for (DividendHistoryDomain dividend : dividends) {
			if (dividend.getDividend() < 0) {
				continue;
			}

			PriceDomain price = candidate(mapThenPrice, dividend.getCode(), dividend.getBase());
			if (price == null) {
				log.debug("{} NO-PRICE compileByThenPrice() - 『{}』", Utility.indentMiddle(), dividend);
				continue;
			}

			Float priceEarningsRatio = dividend.getDividend().floatValue() / price.getClosing().floatValue() * 100f;
			String key = String.format("%s.%d", dividend.getCode(), LocalDate.ofInstant(dividend.getBase().toInstant(), Utility.ZONE_ID_KST).getYear());
			Float before = mapYearlySummaryRatio.get(key);
			if (before == null) {
				mapYearlySummaryRatio.put(key, priceEarningsRatio);
				continue;
			}
			mapYearlySummaryRatio.put(key, priceEarningsRatio + before);
		}

		for (String key : mapYearlySummaryRatio.keySet()) {
			String code = key.replaceAll("\\.[0-9]+", "");
			Float priceEarningsRatio = mapYearlySummaryRatio.get(key);
			Float before = mapMaxRecent.get(code);
			if (before == null) {
				mapMaxRecent.put(code, priceEarningsRatio);
				continue;
			}
			
			if (before < priceEarningsRatio) {
				mapMaxRecent.put(code, priceEarningsRatio);
				continue;
			}
		}
		
		log.info("{} 『#{}』 compileByThenPrice() - {}", Utility.indentEnd(), Utility.size(mapMaxRecent), Utility.toStringPastTimeReadable(started));
		return mapMaxRecent;
	}

	private PriceDomain candidate(Map<String, PriceDomain> map, String code, Date base) {
		for (int cx = 0, sizex = 14; cx < sizex; cx++) {
			String key = String.format("%s.%s", code, LocalDate.ofInstant(base.toInstant(), Utility.ZONE_ID_KST).minusDays(cx).format(DateTimeFormatter.ISO_LOCAL_DATE));
			PriceDomain price = map.get(key);
			if (price == null) {
				continue;
			}
			
			return price;
		}

		return null;
	}

	// 현재 주식 가격을 기준으로 배당율, 최근 최대 배당
	private Map<String, Float> compileByCurrentPrice() {
		log.info("{} compileByCurrentPrice()", Utility.indentStart());
		long started = System.currentTimeMillis();

		Date yearsAgo = Date.from(LocalDate.of(LocalDate.now().getYear() - 3, 1, 1).atStartOfDay(Utility.ZONE_ID_KST).toInstant());

		DividendHistoryParam dividendHistoryParam = DividendHistoryParam.builder().start(yearsAgo).build();
		dividends = dividendHistoryService.search(dividendHistoryParam);

		PriceParam priceParam = PriceParam.builder().start(yearsAgo).build();
		prices = priceService.search(priceParam);
		
		Map<String, PriceDomain> mapCurrentPrice = new HashMap<>();	//	현재 주식 가격
		for (PriceDomain price : prices) {
			PriceDomain before = mapCurrentPrice.get(price.getCode());
			if (before == null) {
				mapCurrentPrice.put(price.getCode(), price);
				continue;
			}
			
			if (before.getBase().before(price.getBase())) {
				mapCurrentPrice.put(price.getCode(), price);
				continue;
			}
		}
		log.info("{} 『현재 주식 가격:#{}』 compileByCurrentPrice() - {}", Utility.indentMiddle(), Utility.size(mapCurrentPrice), Utility.toStringPastTimeReadable(started));

		Map<String, Integer> mapYearlySummaryDividend = new HashMap<>();	//	연간 배당금 합계
		for (DividendHistoryDomain dividend : dividends) {
			if (dividend.getDividend() < 0) {
				continue;
			}

			String key = String.format("%s.%d", dividend.getCode(), LocalDate.ofInstant(dividend.getBase().toInstant(), Utility.ZONE_ID_KST).getYear());
			Integer before = mapYearlySummaryDividend.get(key);
			if (before == null) {
				mapYearlySummaryDividend.put(key, dividend.getDividend());
				continue;
			}
			mapYearlySummaryDividend.put(key, dividend.getDividend() + before);
		}
		log.info("{} 『연간 배당금 합계:#{}』 compileByCurrentPrice() - {}", Utility.indentMiddle(), Utility.size(mapYearlySummaryDividend), Utility.toStringPastTimeReadable(started));

		Map<String, Float> mapMaxRecent = new HashMap<>();	//	최대 배당
		for (String key : mapYearlySummaryDividend.keySet()) {
			String code = key.replaceAll("\\.[0-9]+", "");
			PriceDomain price = mapCurrentPrice.get(code);
			if (price == null || price.getClosing() == null) {
				continue;
			}

			Integer dividend = mapYearlySummaryDividend.get(key);
			Float priceEarningsRatio = dividend.floatValue() / price.getClosing().floatValue() * 100f;
			Float before = mapMaxRecent.get(code);
			if (before == null) {
				mapMaxRecent.put(code, priceEarningsRatio);
				continue;
			}
			
			if (before < priceEarningsRatio) {
				mapMaxRecent.put(code, priceEarningsRatio);
				continue;
			}
		}
		
		log.info("{} 『#{}』 compileByCurrentPrice() - {}", Utility.indentEnd(), Utility.size(mapMaxRecent), Utility.toStringPastTimeReadable(started));
		return mapMaxRecent;
	}

}
