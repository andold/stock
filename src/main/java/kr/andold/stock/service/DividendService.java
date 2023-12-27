package kr.andold.stock.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.DividendDomain;
import kr.andold.stock.entity.DividendEntity;
import kr.andold.stock.param.DividendParam;
import kr.andold.stock.repository.DividendRepository;

@Service
public class DividendService implements CommonBlockService<DividendParam, DividendDomain, DividendEntity> {
	@Autowired
	private DividendRepository repository;

	@Override
	public List<DividendDomain> update(List<DividendDomain> domains) {
		List<DividendEntity> entities = toEntities(domains);
		List<DividendEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

	@Override
	public DividendDomain toDomain(DividendEntity entity) {
		return DividendDomain.of(entity);
	}

	@Override
	public DividendEntity toEntity(DividendDomain domain) {
		return domain.toEntity();
	}

	@Override
	public int compare(DividendDomain after, DividendDomain before) {
		return after.compare(before);
	}

	@Override
	public void prepareCreate(DividendDomain domain) {
		domain.setId(null);
		Date now = new Date();
		domain.setCreated(now);
		domain.setUpdated(now);		
	}

	@Override
	public void prepareUpdate(DividendDomain before, DividendDomain after) {
		Utility.copyPropertiesNotNull(after, before);
		after.setUpdated(new Date());		
	}

	@Override
	public String key(DividendDomain domain) {
		return domain.key();
	}

	@Override
	public List<DividendDomain> search(DividendParam param) {
		List<DividendEntity> entities = param == null ? repository.findAll() : repository.search(param);
		List<DividendDomain> domains = new ArrayList<DividendDomain>();
		for (DividendEntity entity : entities) {
			domains.add(DividendDomain.of(entity));
		}
		return domains;
	}

	@Override
	public int remove(List<DividendDomain> domains) {
		return 0;
	}

	@Override
	public List<DividendDomain> create(List<DividendDomain> domains) {
		List<DividendEntity> entities = toEntities(domains);
		List<DividendEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

}
