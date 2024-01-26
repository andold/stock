package kr.andold.stock.service;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.param.DividendHistoryParam;
import kr.andold.stock.param.PriceParam;
import kr.andold.stock.param.StockParam;
import kr.andold.stock.param.StockParam.InnerDividendHistoryParam;
import kr.andold.stock.param.StockParam.InnerItemParam;
import kr.andold.stock.param.StockParam.InnerPriceParam;
import kr.andold.stock.service.CommonBlockService.CrudList;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StockService {
	@Autowired
	private ItemService itemService;
	@Autowired
	private DividendHistoryService dividendHistoryService;
	@Autowired
	private PriceService priceService;

	public boolean upload(MultipartFile file) {
		log.info("{} upload({})", Utility.indentStart(), Utility.toStringJson(file, 16));
		long started = System.currentTimeMillis();

		try {
			InputStream inputStream = file.getInputStream();
			String text = Utility.extractStringFromText(inputStream);
			StockParam param = StockParam.of(text);
			List<ItemDomain> items = new ArrayList<>();
			List<DividendHistoryDomain> histories = new ArrayList<>();
			List<PriceDomain> prices = new ArrayList<>();
			for (InnerItemParam x : param.getItems()) {
				items.add(x.toDomain());
			}
			for (InnerDividendHistoryParam x : param.getHistories()) {
				histories.add(x.toDomain());
			}
			for (InnerPriceParam x : param.getPrices()) {
				prices.add(x.toDomain());
			}

			CrudList<ItemDomain> crudItems = itemService.put(items);
			CrudList<DividendHistoryDomain> crudHistories = dividendHistoryService.put(histories);
			CrudList<PriceDomain> crudPrices = priceService.put(prices);

			log.info("{} {} items:{} histories:{} prices:{} upload({}) - {}", Utility.indentEnd(), true, crudItems, crudHistories, crudPrices, Utility.toStringJson(file, 16), Utility.toStringPastTimeReadable(started));
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}

		log.info("{} {} upload({}) - {}", Utility.indentEnd(), false, Utility.toStringJson(file, 16), Utility.toStringPastTimeReadable(started));
		return false;
	}

	public StockParam download() {
		List<ItemDomain> items = itemService.search(null);
		List<DividendHistoryDomain> histories = dividendHistoryService.search(null);
		List<PriceDomain> prices = priceService.search(null);
		return new StockParam(items, histories, prices);
	}

	public List<ItemDomain> compile() {
		log.info("{} compile()", Utility.indentStart());
		long started = System.currentTimeMillis();

		// 주가, 주간/월간/연간 대표 지정
		CrudList<PriceDomain> priceResult = priceService.compile();

		List<ItemDomain> items = itemService.search(null);
		Map<String, ItemDomain> mapItem = itemService.makeMap(items);
		List<DividendHistoryDomain> histories = dividendHistoryService.search(null);
		List<PriceDomain> prices = priceService.search(null);

		// 상장일, 배당일 대표 지정
		CrudList<PriceDomain> priceResult1 = priceService.compile(items, histories);

		// 최근 배당수익률 적용
		List<ItemDomain> perItems = compilePriceEarningsRatioByHistoriesAndPrices(histories, prices);
		CrudList<ItemDomain> crudItems = itemService.differ(items, perItems);
		List<ItemDomain> updated = itemService.update(crudItems.getUpdates());
		
		// 중복 삭제
		int removed = dividendHistoryService.dedup(histories);
		removed += dividendHistoryService.clean(mapItem, histories);
		
		log.info("{} 『{}』『{}』『±#{}』『-#{}』 compile() - {}", Utility.indentEnd(), priceResult, priceResult1, Utility.size(updated), removed, Utility.toStringPastTimeReadable(started));
		return updated;
	}

	private List<ItemDomain> compilePriceEarningsRatioByHistoriesAndPrices(List<DividendHistoryDomain> histories, List<PriceDomain> prices) {
		List<ItemDomain> items = new ArrayList<>();
		Map<String, Integer> mapHistory = dividendHistoryService.sumYearly(histories);
		Map<String, PriceDomain> mapPrice = priceService.currentPrice(prices);
		int thisYear = LocalDate.now().getYear();
		
		for (String code : mapPrice.keySet()) {
			Float max = null;
			for (int cx = thisYear - 2; cx <= thisYear; cx++) {
				String key = String.format("%s.%d", code, cx);
				Integer dividend = mapHistory.get(key);
				if (dividend == null) {
					continue;
				}

				PriceDomain price = mapPrice.get(code);
				if (price == null) {
					continue;
				}

				Integer currentPrice = price.getClosing();
				if (currentPrice == null) {
					continue;
				}
				
				float par = dividend * 100f / currentPrice;
				if (max == null) {
					max = par;
					continue;
				}

				max = Math.max(max, par);
			}
			
			if (max == null) {
				items.add(ItemDomain
						.builder()
						.code(code)
						.priceEarningsRatio(0f)
						.build());
				continue;
			}
			
			items.add(ItemDomain
					.builder()
					.code(code)
					.priceEarningsRatio(max)
					.build());
			
		}
		
		return items;
	}

	// 주간 대표일자 월간 대표일자 연간 대표일자 특수(현재는 배당일) 대표일자 지정
	public CrudList<DividendHistoryDomain> compile(ItemDomain param) {
		log.info("{} compile({})", Utility.indentStart(), param);
		long started = System.currentTimeMillis();

		List<DividendHistoryDomain> histories = dividendHistoryService.search(DividendHistoryParam.builder().code(param.getCode()).build());
		List<PriceDomain> prices = priceService.search(PriceParam.builder().code(param.getCode()).build());
		Map<String, PriceDomain> mapP = priceService.makeMap(prices);

		// 기간 추출
		Date start = new Date();
		Date end = new Date(0);
		for (PriceDomain price : prices) {
			Date base = price.getBase();
			if (start.after(base)) {
				start = base;
			}
			if (end.before(base)) {
				end = base;
			}
		}

		prices.sort((left, right) -> (int) (left.getBase().getTime() - right.getBase().getTime()));
		PriceDomain prevWeek = prices.get(0);
		prevWeek.setFlagWeek(true);
		PriceDomain prevMonth = prevWeek;
		prevMonth.setFlagMonth(true);
		PriceDomain prevYear = prevWeek;
		prevYear.setFlagYear(true);
		for (int cx = 1, sizex = prices.size(); cx < sizex; cx++) {
			PriceDomain price = prices.get(cx);
			//  주간 대표일자
			if (Utility.isSameWeek(prevWeek.getBase(), price.getBase())) {
				prevWeek.setFlagWeek(false);
				price.setFlagWeek(true);
				prevWeek = price;
			} else {
				prevWeek = price;
				prevWeek.setFlagWeek(true);
			}

			// 월간 대표일자
			if (Utility.isSameMonth(prevMonth.getBase(), price.getBase())) {
				prevMonth.setFlagMonth(false);
				price.setFlagMonth(true);
				prevMonth = price;
			} else {
				prevMonth = price;
				prevMonth.setFlagMonth(true);
			}
			// 연간 대표일자
			if (Utility.isSameYear(prevMonth.getBase(), price.getBase())) {
				prevYear.setFlagYear(false);
				price.setFlagYear(true);
				prevYear = price;
			} else {
				prevYear = price;
				prevYear.setFlagYear(true);
			}
		}
		
		// 특수(현재는 배당일) 대표일자
		dividendHistoryService.compile(histories, mapP);
		
		CrudList<DividendHistoryDomain> listHistories = dividendHistoryService.put(histories);
		CrudList<PriceDomain> listPrices = priceService.put(prices);

		log.info("{} DividendHistory:{} Price:{} compile({}) - {}", Utility.indentEnd(), listHistories, listPrices, param, Utility.toStringPastTimeReadable(started));
		return listHistories;
	}

}
