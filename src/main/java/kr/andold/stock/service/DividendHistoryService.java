package kr.andold.stock.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.entity.DividendHistoryEntity;
import kr.andold.stock.param.DividendHistoryParam;
import kr.andold.stock.param.ItemParam;
import kr.andold.stock.repository.DividendHistoryRepository;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.stock.thread.CrawlDividendHistoryCompanyThread;
import kr.andold.stock.thread.CrawlDividendHistoryEtfThread;

@Service
public class DividendHistoryService implements CommonBlockService<DividendHistoryParam, DividendHistoryDomain, DividendHistoryEntity> {
	@Autowired
	private DividendHistoryRepository repository;
	
	@Override
	public CrudList<DividendHistoryDomain> put(List<DividendHistoryDomain> domains) {
		return CommonBlockService.super.put(domains.stream().filter(domain -> domain.getDividend() != null).collect(Collectors.toList()));
	}

	@CacheEvict(value = "histories")
	@Override
	public List<DividendHistoryDomain> update(List<DividendHistoryDomain> domains) {
		List<DividendHistoryEntity> entities = toEntities(domains);
		List<DividendHistoryEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

	@CacheEvict(value = "histories")
	@Override
	public int remove(List<DividendHistoryDomain> domains) {
		return 0;
	}

	@CacheEvict(value = "histories")
	@Override
	public List<DividendHistoryDomain> create(List<DividendHistoryDomain> domains) {
		List<DividendHistoryEntity> entities = toEntities(domains);
		List<DividendHistoryEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

	@Cacheable(value= "histories")
	@Override
	public List<DividendHistoryDomain> search(DividendHistoryParam param) {
		List<DividendHistoryEntity> entities = param == null ? repository.findAll() : repository.search(param);
		List<DividendHistoryDomain> domains = new ArrayList<DividendHistoryDomain>();
		for (DividendHistoryEntity entity : entities) {
			domains.add(DividendHistoryDomain.of(entity));
		}
		return domains;
	}

	@Override
	public DividendHistoryDomain toDomain(DividendHistoryEntity entity) {
		return DividendHistoryDomain.of(entity);
	}

	@Override
	public DividendHistoryEntity toEntity(DividendHistoryDomain domain) {
		return domain.toEntity();
	}

	@Override
	public int compare(DividendHistoryDomain after, DividendHistoryDomain before) {
		return after.compareIfNotNull(before);
	}

	@Override
	public String key(DividendHistoryDomain domain) {
		return domain.key();
	}

	@Override
	public void prepareUpdate(DividendHistoryDomain before, DividendHistoryDomain after) {
		Utility.copyPropertiesNotNull(after, before);
		before.setUpdated(new Date());		
	}

	@Override
	public void prepareCreate(DividendHistoryDomain domain) {
		domain.setId(null);
		Date now = new Date();
		domain.setCreated(now);
		domain.setUpdated(now);		
	}

	public ParserResult crawl(ItemParam param) {
		String type = param.getType();
		ParserResult result = null;
		if (type == null) {
			result = CrawlDividendHistoryEtfThread.crawl(param);
			if (result.getHistories().isEmpty()) {
				result = CrawlDividendHistoryCompanyThread.crawl(param);
			}
		} else if (type.equalsIgnoreCase("ETF")) {
			result = CrawlDividendHistoryEtfThread.crawl(param);
		} else {
			result = CrawlDividendHistoryCompanyThread.crawl(param);
		}

		put(result.getHistories());
		return result;
	}

	public Map<String, Integer> sumYearly(List<DividendHistoryDomain> histories) {
		Map<String, Integer> map = new HashMap<>();
		
		for (DividendHistoryDomain history: histories) {
			String code = history.getCode();
			Integer year = LocalDate.ofInstant(history.getBase().toInstant(), Utility.ZONE_ID_KST).getYear();
			Integer devidend = history.getDividend();
			if (devidend > 0) {
				String key = String.format("%s.%d", code, year);
				Integer prev = map.get(key);
				if (prev == null) {
					map.put(key, devidend);
				} else {
					map.put(key, prev + devidend);
				}
			}
		}

		return map;
	}

	public void compile(List<DividendHistoryDomain> histories, Map<String, PriceDomain> mapP) {
		// 특수(현재는 배당일) 대표일자
		for (DividendHistoryDomain history : histories) {
			LocalDate base = LocalDate.ofInstant(history.getBase().toInstant(), Utility.ZONE_ID_KST);
			for (LocalDate cx = base.plusDays(0), sizex = base.minusDays(7); cx.isAfter(sizex); cx = cx.minusDays(1)) {
				String key = String.format("%s.%s", history.getCode(), cx.format(DateTimeFormatter.ISO_LOCAL_DATE));
				PriceDomain price = mapP.get(key);
				if (price == null) {
					continue;
				}
				
				price.setFlagSpecial(true);
				history.setPriceBase(price.getBase());
				history.setPriceClosing(price.getClosing());
				break;
			}
		}
	}

}
