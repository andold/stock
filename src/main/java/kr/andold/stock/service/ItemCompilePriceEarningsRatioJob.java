package kr.andold.stock.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.param.DividendHistoryParam;
import kr.andold.stock.param.PriceParam;
import kr.andold.stock.service.CommonBlockService.CrudList;
import kr.andold.stock.service.JobService.Job;
import kr.andold.utils.Utility;
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

	@Override
	public STATUS run() {
		log.info("{} run()", Utility.indentStart());
		long started = System.currentTimeMillis();

		Map<String, Float> map = compileByCurrentPrice();
		compileByThenPrice(map);
		List<ItemDomain> items = new ArrayList<>();
		for (String code : map.keySet()) {
			ItemDomain item = ItemDomain.builder().code(code).priceEarningsRatio(map.get(code)).build();
			items.add(item);
		}
		CrudList<ItemDomain> result = itemService.put(items);

		log.info("{} 『#{}』 run() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return STATUS.SUCCESS;
	}

	private void compileByThenPrice(Map<String, Float> map) {
		// TODO Auto-generated method stub
		
	}

	// 현재 주식 가격을 기준으로 배당율, 최근 최대 배당
	private Map<String, Float> compileByCurrentPrice() {
		log.info("{} compileByCurrentPrice()", Utility.indentStart());
		long started = System.currentTimeMillis();

		Date yearsAgo = Date.from(LocalDate.of(LocalDate.now().getYear() - 3, 1, 1).atStartOfDay(Utility.ZONE_ID_KST).toInstant());
		DividendHistoryParam dividendHistoryParam = DividendHistoryParam.builder().start(yearsAgo).build();
		List<DividendHistoryDomain> dividends = dividendHistoryService.search(dividendHistoryParam);

		Date weeksAgo = Date.from(LocalDate.now().minusWeeks(2).atStartOfDay(Utility.ZONE_ID_KST).toInstant());
		PriceParam priceParam = PriceParam.builder().start(weeksAgo).build();
		List<PriceDomain> prices = priceService.search(priceParam);
		
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
			Float priceEarningsRatio = dividend.floatValue() / price.getClosing().floatValue() * 100;
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
