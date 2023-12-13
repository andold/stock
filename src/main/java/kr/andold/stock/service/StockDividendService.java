package kr.andold.stock.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.StockDividendDomain;
import kr.andold.stock.entity.StockDividendEntity;
import kr.andold.stock.param.StockDividendParam;
import kr.andold.stock.repository.StockDividendRepository;

@Service
public class StockDividendService implements CommonBlockService<StockDividendParam, StockDividendDomain, StockDividendEntity> {
	@Autowired
	private StockDividendRepository repository;

	@Override
	public List<StockDividendDomain> update(List<StockDividendDomain> domains) {
		List<StockDividendEntity> entities = toEntities(domains);
		List<StockDividendEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

	@Override
	public StockDividendDomain toDomain(StockDividendEntity entity) {
		return StockDividendDomain.of(entity);
	}

	@Override
	public StockDividendEntity toEntity(StockDividendDomain domain) {
		return domain.toEntity();
	}

	@Override
	public int compare(StockDividendDomain after, StockDividendDomain before) {
		return after.compare(before);
	}

	@Override
	public void prepareCreate(StockDividendDomain domain) {
		domain.setId(null);
		Date now = new Date();
		domain.setCreated(now);
		domain.setUpdated(now);		
	}

	@Override
	public void prepareUpdate(StockDividendDomain before, StockDividendDomain after) {
		Utility.copyPropertiesNotNull(after, before);
		after.setUpdated(new Date());		
	}

	@Override
	public String key(StockDividendDomain domain) {
		return domain.key();
	}

	@Override
	public List<StockDividendDomain> search(StockDividendParam param) {
		List<StockDividendEntity> entities = param == null ? repository.findAll() : repository.findAll();
		List<StockDividendDomain> domains = new ArrayList<StockDividendDomain>();
		for (StockDividendEntity entity : entities) {
			domains.add(StockDividendDomain.of(entity));
		}
		return domains;
	}

	@Override
	public int remove(List<StockDividendDomain> domains) {
		return 0;
	}

	@Override
	public List<StockDividendDomain> create(List<StockDividendDomain> domains) {
		List<StockDividendEntity> entities = toEntities(domains);
		List<StockDividendEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

}
