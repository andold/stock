package kr.andold.stock.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.StockDividendDomain;
import kr.andold.stock.domain.StockDividendHistoryDomain;
import kr.andold.stock.domain.StockPriceDomain;
import kr.andold.stock.entity.StockDividendEntity;
import kr.andold.stock.param.StockDividendParam;
import kr.andold.stock.repository.StockRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StockService {

	@Autowired
	private StockDividendService stockDividendService;
	@Autowired
	private StockDividendHistoryService stockDividendHistoryService;
	@Autowired
	private StockPriceService stockPriceService;
	@Autowired
	private StockRepository repository;

	public String compile() {
		Calendar calendar = Calendar.getInstance();
		List<StockDividendHistoryDomain> histories = stockDividendHistoryService.search(null);
		List<StockPriceDomain> prices = stockPriceService.search(null);
		List<StockDividendDomain> dividends = stockDividendService.search(null);
		Map<String, StockDividendDomain> map = stockDividendService.makeMap(dividends);
		for (StockDividendDomain dividend : dividends) {
			dividend.setDividend(null);
			dividend.setDividend1YAgo(null);
			dividend.setDividend2YAgo(null);
			dividend.setDividend3YAgo(null);
		}
		for (StockPriceDomain price : prices) {
			Date base = price.getBase();
			String code = price.getCode();
			StockDividendDomain dividend = map.get(code);
			if (dividend == null) {
				dividend = StockDividendDomain.builder().code(code).build();
				map.put(code, dividend);
			}
			Date baseMonth = dividend.getBaseMonth();
			if (baseMonth == null || baseMonth.before(base)) {
				dividend.setBaseMonth(base);
				dividend.setCurrentPrice(price.getClosing());
			}
		}
		for (StockDividendHistoryDomain history : histories) {
			Date base = history.getBase();
			calendar.setTime(base);
			int index = LocalDate.now().getYear() - calendar.get(Calendar.YEAR);
			String code = history.getCode();
			Integer value = history.getDividend();
			if (value == null || value == 0) {
				continue;
			}

			StockDividendDomain dividend = map.get(code);
			if (dividend == null) {
				dividend = StockDividendDomain.builder().code(code).build();
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

	public List<StockDividendDomain> search(StockDividendDomain param) {
		List<StockDividendEntity> entities = repository.findAll();
		List<StockDividendDomain> domains = new ArrayList<StockDividendDomain>();
		for (StockDividendEntity entity : entities) {
			domains.add(StockDividendDomain.of(entity));
		}
		return domains;
	}

	private Map<String, StockDividendDomain> makeMap(List<StockDividendDomain> domains) {
		Map<String, StockDividendDomain> map = new HashMap<>();
		for (StockDividendDomain domain : domains) {
			map.put(domain.key(), domain);
		}
		return map;
	}

	public int batch(StockDividendParam param) {
		if (param == null) {
			return 0;
		}

		int count = 0;
		List<StockDividendDomain> creates = param.getCreates();
		List<StockDividendDomain> updates = param.getUpdates();
		List<StockDividendDomain> removes = param.getRemoves();

		if (creates != null) {
			List<StockDividendDomain> created = create(creates);
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

	private List<?> update(List<StockDividendDomain> domains) {
		List<StockDividendEntity> entities = toEntities(domains);
		List<StockDividendEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

	private int remove(List<StockDividendDomain> domains) {
		List<StockDividendEntity> entities = toEntities(domains);
		repository.deleteAll(entities);
		repository.flush();
		return entities.size();
	}

	private List<StockDividendDomain> create(List<StockDividendDomain> domains) {
		List<StockDividendEntity> entities = toEntities(domains);
		List<StockDividendEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

	private List<StockDividendEntity> toEntities(List<StockDividendDomain> domains) {
		List<StockDividendEntity> entities = new ArrayList<StockDividendEntity>();
		for (StockDividendDomain domain : domains) {
			entities.add(domain.toEntity());
		}
		return entities;
	}

	private List<StockDividendDomain> toDomains(List<StockDividendEntity> entities) {
		List<StockDividendDomain> domains = new ArrayList<StockDividendDomain>();
		for (StockDividendEntity entity : entities) {
			domains.add(StockDividendDomain.of(entity));
		}
		return domains;
	}

	public StockDividendParam deduplicate() {
		log.info("{} deduplicate()", Utility.indentStart());
		List<StockDividendDomain> domains = search(null);
		Map<String, StockDividendDomain> map = makeMap(domains);
		Map<String, StockDividendDomain> mapDuplicate = new HashMap<>();
		List<StockDividendDomain> removes = new ArrayList<StockDividendDomain>();
		for (StockDividendDomain domain : domains) {
			String key = domain.key();
			StockDividendDomain before = map.get(key);
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
		return StockDividendParam.builder().duplicates(new ArrayList<>(mapDuplicate.values())).removes(removes).build();
	}

	public String download() {
		List<StockDividendDomain> domains = search(StockDividendDomain.builder().build());
		return Utility.toStringJsonLine(domains);
	}

}
