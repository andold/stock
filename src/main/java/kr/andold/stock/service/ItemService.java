package kr.andold.stock.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.entity.ItemEntity;
import kr.andold.stock.param.ItemParam;
import kr.andold.stock.repository.ItemRepository;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.stock.thread.CrawlItemDetailCompanyThread;
import kr.andold.stock.thread.CrawlItemDetailEtfThread;

@Service
public class ItemService implements CommonBlockService<ItemParam, ItemDomain, ItemEntity> {
	@Autowired
	private ItemRepository repository;

	@Cacheable(value= "items")
	public ItemParam search(ItemParam param, Pageable pageable) {
		Page<ItemEntity> page = repository.search(param, pageable);
		param.setTotalPages(page.getTotalPages());
		param.setItems(page.get().map(entity -> ItemDomain.of(entity)).collect(Collectors.toList()));
		return param;
	}

	@Cacheable(value= "items")
	@Override
	public List<ItemDomain> search(ItemParam param) {
		if (param == null) {
			param = ItemParam.builder()
					.build();
		}

		List<ItemEntity> page = repository.search(param);
		return page
				.stream()
				.map(entity -> ItemDomain.of(entity))
				.collect(Collectors.toList());
	}

	@CacheEvict(value = "items")
	@Override
	public List<ItemDomain> update(List<ItemDomain> domains) {
		List<ItemEntity> entities = toEntities(domains);
		List<ItemEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

	@CacheEvict(value = "items")
	public ItemDomain update(ItemDomain domain) {
		Optional<ItemEntity> read = repository.findById(domain.getId());
		if (read.isEmpty()) {
			return null;
		}

		ItemDomain before = toDomain(read.get());
		prepareUpdate(before, domain);
		repository.saveAndFlush(before.toEntity());
		return domain;
	}

	@Override
	public ItemDomain toDomain(ItemEntity entity) {
		return ItemDomain.of(entity);
	}

	@Override
	public ItemEntity toEntity(ItemDomain domain) {
		return domain.toEntity();
	}

	@Override
	public int compare(ItemDomain after, ItemDomain before) {
		return after.compare(before);
	}

	@Override
	public String key(ItemDomain domain) {
		return domain.key();
	}

	@CacheEvict(value = "items")
	@Override
	public int remove(List<ItemDomain> domains) {
		return 0;
	}

	@CacheEvict(value = "items")
	@Override
	public List<ItemDomain> create(List<ItemDomain> domains) {
		List<ItemEntity> entities = toEntities(domains);
		List<ItemEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

	@Override
	public void prepareUpdate(ItemDomain before, ItemDomain after) {
		Utility.copyPropertiesNotNull(after, before);
		before.setUpdated(new Date());		
		if (before.getPriority() == null) {
			before.setPriority(8);
		}
	}

	@Override
	public void prepareCreate(ItemDomain domain) {
		domain.setId(null);
		if (domain.getPriority() == null)
			domain.setPriority(8);
		Date now = new Date();
		domain.setCreated(now);
		domain.setUpdated(now);
	}

	public ParserResult crawl(ItemParam param) {
		Boolean etf = param.getEtf();
		ParserResult result = null;
		if (etf == null) {
			String type = param.getType();
			if (type == null) {
				result = CrawlItemDetailEtfThread.crawl(param);
				if (result.getHistories().isEmpty()) {
					result = CrawlItemDetailCompanyThread.crawl(param);
				}
			} else if ("KOSDAQ".equalsIgnoreCase(type)) {
				result = CrawlItemDetailCompanyThread.crawl(param);
			} else {
				result = CrawlItemDetailEtfThread.crawl(param);
				if (result.getHistories().isEmpty()) {
					result = CrawlItemDetailCompanyThread.crawl(param);
				}
			}
		} else if (etf) {
			result = CrawlItemDetailEtfThread.crawl(param);
		} else {
			result = CrawlItemDetailCompanyThread.crawl(param);
		}

		put(result.getItems());
		return result;
	}

}
