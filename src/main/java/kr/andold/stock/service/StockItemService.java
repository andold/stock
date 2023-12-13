package kr.andold.stock.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.StockItemDomain;
import kr.andold.stock.entity.StockItemEntity;
import kr.andold.stock.param.StockItemParam;
import kr.andold.stock.repository.StockItemRepository;

@Service
public class StockItemService implements CommonBlockService<StockItemParam, StockItemDomain, StockItemEntity> {
	@Autowired
	private StockItemRepository repository;

	@Override
	public List<StockItemDomain> search(StockItemParam param) {
		List<StockItemEntity> entities = param == null ? repository.findAll() : repository.search(param);
		List<StockItemDomain> domains = new ArrayList<StockItemDomain>();
		for (StockItemEntity entity : entities) {
			domains.add(StockItemDomain.of(entity));
		}
		return domains;
	}

	@Override
	public List<StockItemDomain> update(List<StockItemDomain> domains) {
		List<StockItemEntity> entities = toEntities(domains);
		List<StockItemEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

	public StockItemDomain update(StockItemDomain domain) {
		Optional<StockItemEntity> read = repository.findById(domain.getId());
		if (read.isEmpty()) {
			return null;
		}

		StockItemDomain before = toDomain(read.get());
		prepareUpdate(before, domain);
		repository.saveAndFlush(before.toEntity());
		return domain;
	}

	@Override
	public StockItemDomain toDomain(StockItemEntity entity) {
		return StockItemDomain.of(entity);
	}

	@Override
	public StockItemEntity toEntity(StockItemDomain domain) {
		return domain.toEntity();
	}

	@Override
	public int compare(StockItemDomain after, StockItemDomain before) {
		return after.compare(before);
	}

	@Override
	public String key(StockItemDomain domain) {
		return domain.key();
	}

	@Override
	public int remove(List<StockItemDomain> domains) {
		return 0;
	}

	@Override
	public List<StockItemDomain> create(List<StockItemDomain> domains) {
		List<StockItemEntity> entities = toEntities(domains);
		List<StockItemEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

	@Override
	public void prepareUpdate(StockItemDomain before, StockItemDomain after) {
		Utility.copyPropertiesNotNull(after, before);
		before.setUpdated(new Date());		
		if (before.getPriority() == null) {
			before.setPriority(8);
		}
	}

	@Override
	public void prepareCreate(StockItemDomain domain) {
		domain.setId(null);
		if (domain.getPriority() == null)
			domain.setPriority(8);
		Date now = new Date();
		domain.setCreated(now);
		domain.setUpdated(now);
	}

}
