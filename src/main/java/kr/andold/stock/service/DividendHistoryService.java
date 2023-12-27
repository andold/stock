package kr.andold.stock.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.DividendHistoryDomain;
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
		return CommonBlockService.super.put(domains.stream().filter(domain -> domain.getDividend() != null && domain.getDividend() > 0).collect(Collectors.toList()));
	}

	@Override
	public List<DividendHistoryDomain> update(List<DividendHistoryDomain> domains) {
		List<DividendHistoryEntity> entities = toEntities(domains);
		List<DividendHistoryEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

	@Override
	public int remove(List<DividendHistoryDomain> domains) {
		return 0;
	}

	@Override
	public List<DividendHistoryDomain> create(List<DividendHistoryDomain> domains) {
		List<DividendHistoryEntity> entities = toEntities(domains);
		List<DividendHistoryEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

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
		return after.compare(before);
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
		ParserResult result = param.getEtf() ? CrawlDividendHistoryEtfThread.crawl(param)
				: CrawlDividendHistoryCompanyThread.crawl(param);
		put(result.getHistories());
		return result;
	}

}
