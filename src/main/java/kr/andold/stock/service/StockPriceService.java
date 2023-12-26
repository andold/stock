package kr.andold.stock.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.StockPriceDomain;
import kr.andold.stock.entity.StockPriceEntity;
import kr.andold.stock.param.StockItemParam;
import kr.andold.stock.param.StockPriceParam;
import kr.andold.stock.repository.StockPriceRepository;
import kr.andold.stock.service.StockParserService.StockParserResult;
import kr.andold.stock.thread.CrawlPriceCompanyThread;
import kr.andold.stock.thread.CrawlPriceEtfThread;

@Service
public class StockPriceService implements CommonBlockService<StockPriceParam, StockPriceDomain, StockPriceEntity> {
	@Autowired
	private StockPriceRepository repository;

	@Override
	public List<StockPriceDomain> update(List<StockPriceDomain> domains) {
		List<StockPriceEntity> entities = toEntities(domains);
		List<StockPriceEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

	@Override
	public StockPriceDomain toDomain(StockPriceEntity entity) {
		return StockPriceDomain.of(entity);
	}

	@Override
	public StockPriceEntity toEntity(StockPriceDomain domain) {
		return domain.toEntity();
	}

	@Override
	public int compare(StockPriceDomain after, StockPriceDomain before) {
		return after.compare(before);
	}

	@Override
	public void prepareCreate(StockPriceDomain domain) {
		domain.setId(null);
		Date now = new Date();
		domain.setCreated(now);
		domain.setUpdated(now);		
	}

	@Override
	public void prepareUpdate(StockPriceDomain before, StockPriceDomain after) {
		Utility.copyPropertiesNotNull(after, before);
		before.setUpdated(new Date());		
	}

	@Override
	public String key(StockPriceDomain domain) {
		return domain.key();
	}

	@Override
	public List<StockPriceDomain> search(StockPriceParam param) {
		List<StockPriceEntity> entities;
		if (param == null) {
			entities = repository.findAll();
		} else {
			entities = repository.search(param);
		}
		List<StockPriceDomain> domains = new ArrayList<StockPriceDomain>();
		for (StockPriceEntity entity : entities) {
			domains.add(StockPriceDomain.of(entity));
		}
		return domains;
	}

	@Override
	public int remove(List<StockPriceDomain> domains) {
		return 0;
	}

	@Override
	public List<StockPriceDomain> create(List<StockPriceDomain> domains) {
		List<StockPriceEntity> entities = toEntities(domains);
		List<StockPriceEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

	public StockParserResult crawl(StockItemParam param) {
		StockParserResult result = param.getEtf() ? CrawlPriceEtfThread.crawl(param)
				: CrawlPriceCompanyThread.crawl(param);
		put(result.getPrices());
		return result;
	}

}
