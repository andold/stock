package kr.andold.stock.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.StockDividendDomain;
import kr.andold.stock.entity.StockDividendEntity;
import kr.andold.stock.param.StockDividendParam;
import kr.andold.stock.repository.StockRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StockService {

	@Autowired
	private StockRepository repository;

	@Autowired
	private StockCrawlerService stockCrawlerService;

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

	public void scheduleTaskEveryDays() {
		stockCrawlerService.scheduleTaskEveryDays();
	}

}
