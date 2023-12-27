package kr.andold.stock.service;

import java.io.IOException;
import java.io.InputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import kr.andold.stock.domain.DividendDomain;
import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.entity.DividendEntity;
import kr.andold.stock.param.DividendParam;
import kr.andold.stock.param.StockParam;
import kr.andold.stock.param.StockParam.InnerDividendHistoryParam;
import kr.andold.stock.param.StockParam.InnerDividendParam;
import kr.andold.stock.param.StockParam.InnerItemParam;
import kr.andold.stock.param.StockParam.InnerPriceParam;
import kr.andold.stock.repository.StockRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StockService {
	@Autowired
	private ItemService stockItemService;
	@Autowired
	private DividendService stockDividendService;
	@Autowired
	private DividendHistoryService stockDividendHistoryService;
	@Autowired
	private PriceService stockPriceService;
	@Autowired
	private StockRepository repository;

	public boolean upload(MultipartFile file) {
		try {
			InputStream inputStream = file.getInputStream();
			String text = Utility.extractStringFromText(inputStream);
			StockParam param = StockParam.of(text);
			List<ItemDomain> items = new ArrayList<>();
			List<DividendDomain> dividends = new ArrayList<>();
			List<DividendHistoryDomain> histories = new ArrayList<>();
			List<PriceDomain> prices = new ArrayList<>();
			for (InnerItemParam x : param.getItems()) {
				items.add(x.toDomain());
			}
			for (InnerDividendParam x : param.getDividends()) {
				dividends.add(x.toDomain());
			}
			for (InnerDividendHistoryParam x : param.getHistories()) {
				histories.add(x.toDomain());
			}
			for (InnerPriceParam x : param.getPrices()) {
				prices.add(x.toDomain());
			}
			stockItemService.put(items);
			stockDividendService.put(dividends);
			stockDividendHistoryService.put(histories);
			stockPriceService.put(prices);
			return true;
		} catch (IOException e) {
			e.printStackTrace();
		}

		return false;
	}

	public StockParam download() {
		List<ItemDomain> items = stockItemService.search(null);
		List<DividendHistoryDomain> histories = stockDividendHistoryService.search(null);
		List<PriceDomain> prices = stockPriceService.search(null);
		List<DividendDomain> dividends = stockDividendService.search(null);
		return new StockParam(items, dividends, histories, prices);
	}

	public String compile() {
		Calendar calendar = Calendar.getInstance();
		List<DividendHistoryDomain> histories = stockDividendHistoryService.search(null);
		List<PriceDomain> prices = stockPriceService.search(null);
		List<DividendDomain> dividends = stockDividendService.search(null);
		Map<String, DividendDomain> map = stockDividendService.makeMap(dividends);
		for (DividendDomain dividend : dividends) {
			dividend.setDividend(null);
			dividend.setDividend1YAgo(null);
			dividend.setDividend2YAgo(null);
			dividend.setDividend3YAgo(null);
		}
		for (PriceDomain price : prices) {
			Date base = price.getBase();
			String code = price.getCode();
			DividendDomain dividend = map.get(code);
			if (dividend == null) {
				dividend = DividendDomain.builder().code(code).build();
				map.put(code, dividend);
			}
			Date baseMonth = dividend.getBaseMonth();
			if (baseMonth == null || baseMonth.before(base)) {
				dividend.setBaseMonth(base);
				dividend.setCurrentPrice(price.getClosing());
			}
		}
		for (DividendHistoryDomain history : histories) {
			Date base = history.getBase();
			calendar.setTime(base);
			int index = LocalDate.now().getYear() - calendar.get(Calendar.YEAR);
			String code = history.getCode();
			Integer value = history.getDividend();
			if (value == null || value == 0) {
				continue;
			}

			DividendDomain dividend = map.get(code);
			if (dividend == null) {
				dividend = DividendDomain.builder().code(code).build();
				map.put(code, dividend);
			}
			Integer currentPrice = dividend.getCurrentPrice();
			switch (index) {
			case 0:
				if (dividend.getDividend() == null) {
					dividend.setDividend(value);
				} else {
					dividend.setDividend(value + dividend.getDividend());
				}
				if (currentPrice == null) {
					log.warn("{}", dividend);
					break;
				}
				dividend.setPriceEarningsRatio(dividend.getDividend() * 100f / currentPrice);
				break;
			case 1:
				if (dividend.getDividend1YAgo() == null) {
					dividend.setDividend1YAgo(value);
				} else {
					dividend.setDividend1YAgo(value + dividend.getDividend1YAgo());
				}
				if (currentPrice == null) {
					log.warn("{}", dividend);
					break;
				}
				if (dividend.getDividend() == null) {
					dividend.setPriceEarningsRatio(dividend.getDividend1YAgo() * 100f / currentPrice);
				}
				break;
			case 2:
				if (dividend.getDividend2YAgo() == null) {
					dividend.setDividend2YAgo(value);
				} else {
					dividend.setDividend2YAgo(value + dividend.getDividend2YAgo());
				}
				break;
			case 3:
				if (dividend.getDividend3YAgo() == null) {
					dividend.setDividend3YAgo(value);
				} else {
					dividend.setDividend3YAgo(value + dividend.getDividend3YAgo());
				}
				break;
			}
		}

		String result = stockDividendService.put(dividends);
		return result;
	}

	public List<DividendDomain> search(DividendDomain param) {
		List<DividendEntity> entities = repository.findAll();
		List<DividendDomain> domains = new ArrayList<DividendDomain>();
		for (DividendEntity entity : entities) {
			domains.add(DividendDomain.of(entity));
		}
		return domains;
	}

	private Map<String, DividendDomain> makeMap(List<DividendDomain> domains) {
		Map<String, DividendDomain> map = new HashMap<>();
		for (DividendDomain domain : domains) {
			map.put(domain.key(), domain);
		}
		return map;
	}

	public int batch(DividendParam param) {
		if (param == null) {
			return 0;
		}

		int count = 0;
		List<DividendDomain> creates = param.getCreates();
		List<DividendDomain> updates = param.getUpdates();
		List<DividendDomain> removes = param.getRemoves();

		if (creates != null) {
			List<DividendDomain> created = create(creates);
			count += Utility.size(created);
		}
		if (removes != null) {
			count += remove(removes);
		}
		if (updates != null) {
			count += Utility.size(update(updates));
		}

		return count;
	}

	private List<?> update(List<DividendDomain> domains) {
		List<DividendEntity> entities = toEntities(domains);
		List<DividendEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

	private int remove(List<DividendDomain> domains) {
		List<DividendEntity> entities = toEntities(domains);
		repository.deleteAll(entities);
		repository.flush();
		return entities.size();
	}

	private List<DividendDomain> create(List<DividendDomain> domains) {
		List<DividendEntity> entities = toEntities(domains);
		List<DividendEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

	private List<DividendEntity> toEntities(List<DividendDomain> domains) {
		List<DividendEntity> entities = new ArrayList<DividendEntity>();
		for (DividendDomain domain : domains) {
			entities.add(domain.toEntity());
		}
		return entities;
	}

	private List<DividendDomain> toDomains(List<DividendEntity> entities) {
		List<DividendDomain> domains = new ArrayList<DividendDomain>();
		for (DividendEntity entity : entities) {
			domains.add(DividendDomain.of(entity));
		}
		return domains;
	}

	public DividendParam deduplicate() {
		log.info("{} deduplicate()", Utility.indentStart());
		List<DividendDomain> domains = search(null);
		Map<String, DividendDomain> map = makeMap(domains);
		Map<String, DividendDomain> mapDuplicate = new HashMap<>();
		List<DividendDomain> removes = new ArrayList<DividendDomain>();
		for (DividendDomain domain : domains) {
			String key = domain.key();
			DividendDomain before = map.get(key);
			if (before == null) {
				map.put(key, domain);
				continue;
			}

			Date currentLastModified = domain.getUpdated();
			Date beforeLastModified = before.getUpdated();
			int compared = Utility.compare(currentLastModified, beforeLastModified);
			if (compared < 0) {
				removes.add(domain);
				mapDuplicate.put(key, before);
				continue;
			}
			if (compared > 0) {
				removes.add(before);
				map.put(key, domain);
				mapDuplicate.put(key, domain);
				continue;
			}
		}

		log.info("{} deduplicate()", Utility.indentEnd());
		return DividendParam.builder().duplicates(new ArrayList<>(mapDuplicate.values())).removes(removes).build();
	}

}
