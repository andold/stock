package kr.andold.stock.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.StockDividendHistoryDomain;
import kr.andold.stock.entity.StockDividendHistoryEntity;
import kr.andold.stock.param.StockDividendHistoryParam;
import kr.andold.stock.repository.StockDividendHistoryRepository;

@Service
public class StockDividendHistoryService implements CommonBlockService<StockDividendHistoryParam, StockDividendHistoryDomain, StockDividendHistoryEntity> {
	@Autowired
	private StockDividendHistoryRepository repository;
	
	@Override
	public String put(List<StockDividendHistoryDomain> domains) {
		return CommonBlockService.super.put(domains.stream().filter(t -> t.getDividend() > 0).collect(Collectors.toList()));
	}

	@Override
	public List<StockDividendHistoryDomain> update(List<StockDividendHistoryDomain> domains) {
		List<StockDividendHistoryEntity> entities = toEntities(domains);
		List<StockDividendHistoryEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

	@Override
	public int remove(List<StockDividendHistoryDomain> domains) {
		return 0;
	}

	@Override
	public List<StockDividendHistoryDomain> create(List<StockDividendHistoryDomain> domains) {
		List<StockDividendHistoryEntity> entities = toEntities(domains);
		List<StockDividendHistoryEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

	@Override
	public List<StockDividendHistoryDomain> search(StockDividendHistoryParam param) {
		List<StockDividendHistoryEntity> entities = param == null ? repository.findAll() : repository.search(param);
		List<StockDividendHistoryDomain> domains = new ArrayList<StockDividendHistoryDomain>();
		for (StockDividendHistoryEntity entity : entities) {
			domains.add(StockDividendHistoryDomain.of(entity));
		}
		return domains;
	}

	@Override
	public StockDividendHistoryDomain toDomain(StockDividendHistoryEntity entity) {
		return StockDividendHistoryDomain.of(entity);
	}

	@Override
	public StockDividendHistoryEntity toEntity(StockDividendHistoryDomain domain) {
		return domain.toEntity();
	}

	@Override
	public int compare(StockDividendHistoryDomain after, StockDividendHistoryDomain before) {
		return after.compare(before);
	}

	@Override
	public String key(StockDividendHistoryDomain domain) {
		return domain.key();
	}

	@Override
	public void prepareUpdate(StockDividendHistoryDomain source, StockDividendHistoryDomain target) {
		Utility.copyPropertiesNotNull(source, target);
		target.setUpdated(new Date());		
	}

	@Override
	public void prepareCreate(StockDividendHistoryDomain domain) {
		domain.setId(null);
		Date now = new Date();
		domain.setCreated(now);
		domain.setUpdated(now);		
	}

}
