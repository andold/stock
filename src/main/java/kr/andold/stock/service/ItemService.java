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
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import kr.andold.stock.crawler.Seibro;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.Result;
import kr.andold.stock.entity.ItemEntity;
import kr.andold.stock.param.ItemParam;
import kr.andold.stock.repository.ItemRepository;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ItemService implements CommonBlockService<ItemParam, ItemDomain, ItemEntity> {
	@Autowired private ItemRepository repository;
	@Autowired private Seibro seibro;

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

	@Modifying
	@CacheEvict(value = "items")
	@Override
	public List<ItemDomain> update(List<ItemDomain> domains) {
		List<ItemEntity> entities = toEntities(domains);
		List<ItemEntity> result = repository.saveAllAndFlush(entities);
		return toDomains(result);
	}

	@Modifying
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
		return after.compareIfNotNull(before);
	}

	@Override
	public String key(ItemDomain domain) {
		return domain.key();
	}

	@Modifying
	@CacheEvict(value = "items")
	@Override
	public int remove(List<ItemDomain> domains) {
		List<ItemEntity> entities = toEntities(domains);
		repository.deleteAll(entities);
		repository.flush();
		return Utility.size(entities);
	}

	@Modifying
	@CacheEvict(value = "items")
	@Override
	public List<ItemDomain> create(List<ItemDomain> domains) {
		log.info("{} create(#{})", Utility.indentStart(), Utility.size(domains));
		long started = System.currentTimeMillis();

		List<ItemEntity> entities = toEntities(domains);
		List<ItemEntity> created = repository.saveAllAndFlush(entities);
		List<ItemDomain> result = toDomains(created);

		for (ItemDomain item : result) {
			log.info("{} 『{}』 create(...)", Utility.indentMiddle(), Utility.toStringJson(item));
		}
		log.info("{} 『#{}』 create(#{}) - {}", Utility.indentEnd(), Utility.size(result), Utility.size(domains), Utility.toStringPastTimeReadable(started));
		return result;
	}

	@Override
	public void prepareUpdate(ItemDomain before, ItemDomain after) {
		Utility.copyPropertiesNotNull(after, before, "id", "updated", "created");
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

	public CrudList<ItemDomain> crawl(ItemParam param) {
		Result<ParserResult> parserResult = seibro.item(param.getCode());
		CrudList<ItemDomain> result = put(parserResult.getResult().getItems());
		return result;
	}

	@Override
	public ItemDomain toDomain(String line) {
		return Utility.parseJsonLine(line, ItemDomain.class);
	}

	@Cacheable(value= "items")
	public ItemDomain read(Integer id) {
		Optional<ItemEntity> op = repository.findById(id);
		if (op.isPresent()) {
			return toDomain(op.get());
		}

		return null; 
	}

	public ItemDomain read(String code) {
		Optional<ItemEntity> op = repository.findOneByCode(code);
		if (op.isPresent()) {
			return toDomain(op.get());
		}

		return null; 
	}

}
