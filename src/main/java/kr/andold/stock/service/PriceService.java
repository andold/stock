package kr.andold.stock.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.entity.PriceEntity;
import kr.andold.stock.param.ItemParam;
import kr.andold.stock.param.PriceParam;
import kr.andold.stock.repository.PriceRepository;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.stock.thread.CrawlPriceCompanyThread;
import kr.andold.stock.thread.CrawlPriceEtfThread;

@Service
public class PriceService implements CommonBlockService<PriceParam, PriceDomain, PriceEntity> {
	@Autowired
	private PriceRepository repository;

	@CacheEvict(value = "prices")
	@Override
	public List<PriceDomain> update(List<PriceDomain> domains) {
		List<PriceEntity> entities = toEntities(domains);
		List<PriceEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

	@Override
	public PriceDomain toDomain(PriceEntity entity) {
		return PriceDomain.of(entity);
	}

	@Override
	public PriceEntity toEntity(PriceDomain domain) {
		return domain.toEntity();
	}

	@Override
	public int compare(PriceDomain after, PriceDomain before) {
		return after.compare(before);
	}

	@Override
	public void prepareCreate(PriceDomain domain) {
		domain.setId(null);
		Date now = new Date();
		domain.setCreated(now);
		domain.setUpdated(now);		
	}

	@Override
	public void prepareUpdate(PriceDomain before, PriceDomain after) {
		Utility.copyPropertiesNotNull(after, before);
		before.setUpdated(new Date());		
	}

	@Override
	public String key(PriceDomain domain) {
		return domain.key();
	}

	@Cacheable(value= "prices")
	@Override
	public List<PriceDomain> search(PriceParam param) {
		List<PriceEntity> entities;
		if (param == null) {
			entities = repository.findAll();
		} else {
			entities = repository.search(param);
		}
		List<PriceDomain> domains = new ArrayList<PriceDomain>();
		for (PriceEntity entity : entities) {
			domains.add(PriceDomain.of(entity));
		}
		return domains;
	}

	@CacheEvict(value = "prices")
	@Override
	public int remove(List<PriceDomain> domains) {
		return 0;
	}

	@CacheEvict(value = "prices")
	@Override
	public List<PriceDomain> create(List<PriceDomain> domains) {
		List<PriceEntity> entities = toEntities(domains);
		List<PriceEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

	public ParserResult crawl(ItemParam param) {
		Boolean etf = param.getEtf();
		ParserResult result = null;
		if (etf == null) {
			String type = param.getType();
			if (type == null) {
				result = CrawlPriceEtfThread.crawl(param);
				if (result.getPrices().isEmpty()) {
					result = CrawlPriceCompanyThread.crawl(param);
				}
			} else if ("KOSDAQ".equalsIgnoreCase(type)) {
				result = CrawlPriceCompanyThread.crawl(param);
			} else {
				result = CrawlPriceEtfThread.crawl(param);
				if (result.getPrices().isEmpty()) {
					result = CrawlPriceCompanyThread.crawl(param);
				}
			}
		} else if (etf) {
			result = CrawlPriceEtfThread.crawl(param);
		} else {
			result = CrawlPriceCompanyThread.crawl(param);
		}

		put(result.getPrices());
		return result;
	}

	public Map<String, PriceDomain> currentPrice(List<PriceDomain> prices) {
		Map<String, PriceDomain> map = new HashMap<>();

		for (PriceDomain price: prices) {
			String code = price.getCode();
			PriceDomain prev = map.get(code);
			if (prev == null) {
				map.put(code, price);
				continue;
			}

			Date prevBase = prev.getBase();
			if (prevBase.before(price.getBase())) {
				map.put(code, price);
				continue;
			}
		}

		return map;
	}

}
