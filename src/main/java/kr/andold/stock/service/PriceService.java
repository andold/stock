package kr.andold.stock.service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import kr.andold.stock.crawler.Seibro;
import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.domain.Result;
import kr.andold.stock.entity.PriceEntity;
import kr.andold.stock.param.ItemParam;
import kr.andold.stock.param.PriceParam;
import kr.andold.stock.repository.PriceRepository;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PriceService implements CommonBlockService<PriceParam, PriceDomain, PriceEntity> {
	@Autowired private PriceRepository repository;
	@Autowired private Seibro seibro;

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
		return after.compareIfNotNull(before);
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

	public CrudList<PriceDomain> crawl(ItemParam param) {
		Result<ParserResult> parserResult = seibro.price(param.getCode(), param.getIpoOpen());
		CrudList<PriceDomain> result = put(parserResult.getResult().getPrices());
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

	// 주가, 주간/월간/연간 대표 지정
	public CrudList<PriceDomain> compile() {
		log.info("{} compile()", Utility.indentStart());
		long started = System.currentTimeMillis();

		List<PriceDomain> after = search(null);
		CrudList<PriceDomain> result = compile(after, true);

		log.info("{} 『{}』 compile() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	public CrudList<PriceDomain> compile(List<PriceDomain> prices, boolean doWrite) {
		log.info("{} compile(#{}, {})", Utility.indentStart(), Utility.size(prices), doWrite);
		long started = System.currentTimeMillis();

		Map<String, List<PriceDomain>> map = makeMapByBase(prices);
		int count = compileWeek(map);
		count += compileMonth(map);
		count += compileYear(map);
		if (doWrite) {
			CrudList<PriceDomain> result = put(prices);
			log.info("{} 『{}』 compile(#{}, {}) - {}", Utility.indentEnd(), result, Utility.size(prices), doWrite, Utility.toStringPastTimeReadable(started));
			return result;
		}

		log.info("{} 『#{}』 compile(#{}, {}) - {}", Utility.indentEnd(), count, Utility.size(prices), doWrite, Utility.toStringPastTimeReadable(started));
		return CrudList.<PriceDomain>builder().build();
	}

	private int compileYear(Map<String, List<PriceDomain>> map) {
		LocalDate startEndDate = LocalDate.now().minusYears(16);
		int count = 0;
		for (LocalDate cx = LocalDate.now().minusYears(1).with(TemporalAdjusters.lastDayOfYear());
				cx.isAfter(startEndDate);
			cx = cx.minusYears(1).with(TemporalAdjusters.lastDayOfYear())) {
			LocalDate startEndDateOfYear = cx.minusWeeks(2);
			for (LocalDate cy = cx.plusDays(0); cy.isAfter(startEndDateOfYear); cy = cy.minusDays(1)) {
				List<PriceDomain> pricess = map.get(cy.format(DateTimeFormatter.BASIC_ISO_DATE));
				if (pricess == null) {
					continue;
				}
				
				for (PriceDomain price: pricess) {
					price.setFlagYear(true);
					count++;
				}
				break;
			}
		}
		return count;
	}

	private int compileMonth(Map<String, List<PriceDomain>> map) {
		LocalDate startEndDate = LocalDate.now().minusYears(2);
		int count = 0;
		for (LocalDate cx = LocalDate.now().minusMonths(1).with(TemporalAdjusters.lastDayOfMonth());
				cx.isAfter(startEndDate);
			cx = cx.minusMonths(1).with(TemporalAdjusters.lastDayOfMonth())) {
			LocalDate startEndDateOfYear = cx.minusWeeks(2);
			for (LocalDate cy = cx.plusDays(0); cy.isAfter(startEndDateOfYear); cy = cy.minusDays(1)) {
				List<PriceDomain> pricess = map.get(cy.format(DateTimeFormatter.BASIC_ISO_DATE));
				if (pricess == null) {
					continue;
				}
				
				for (PriceDomain price: pricess) {
					price.setFlagMonth(true);
					count++;
				}
				break;
			}
		}
		return count;
	}

	private int compileWeek(Map<String, List<PriceDomain>> map) {
		LocalDate startEndDate = LocalDate.now().minusYears(1);
		int count = 0;
		for (LocalDate cx = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
			cx.isAfter(startEndDate);
			cx = cx.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY))) {
			for (LocalDate cy = cx.plusDays(0); cy.getDayOfWeek() != DayOfWeek.SUNDAY; cy = cy.minusDays(1)) {
				List<PriceDomain> pricess = map.get(cy.format(DateTimeFormatter.BASIC_ISO_DATE));
				if (pricess == null) {
					continue;
				}
				
				for (PriceDomain price: pricess) {
					price.setFlagWeek(true);
					count++;
				}
				break;
			}
		}
		return count;
	}

	private Map<String, List<PriceDomain>> makeMapByBase(List<PriceDomain> prices) {
		Map<String, List<PriceDomain>> map = new HashMap<>();
		for (PriceDomain price: prices) {
			Date base = price.getBase();
			LocalDate localDate = LocalDate.ofInstant(base.toInstant(), Utility.ZONE_ID_KST);
			String key = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
			List<PriceDomain> previous = map.get(key);
			if (previous == null) {
				previous = new ArrayList<PriceDomain>();
				map.put(key, previous);
			}
			
			previous.add(price);
		}
		return map;
	}

	// 상장일, 배당일 대표 지정
	public CrudList<PriceDomain> compile(List<ItemDomain> items, List<DividendHistoryDomain> histories) {
		log.info("{} compile(#{}, #{})", Utility.indentStart(), Utility.size(items), Utility.size(histories));
		long started = System.currentTimeMillis();

		List<PriceDomain> prices = search(null);
		Map<String, PriceDomain> mapPrice = makeMap(prices);

		// 상장일 대표 지정
		Map<String, ItemDomain> mapItem =  makeMapItemByCodeAndIpoDate(items);
		for (String key: mapItem.keySet()) {
			ItemDomain item = mapItem.get(key);
			String code = item.getCode();
			Date date = item.getIpoOpen();
			if (code == null || date == null) {
				continue;
			}

			LocalDate localDate = LocalDate.ofInstant(date.toInstant(), Utility.ZONE_ID_KST);
			LocalDate startEndDate = localDate.plusWeeks(2);
			for (LocalDate cx = localDate.plusDays(0); cx.isAfter(startEndDate); cx = cx.plusDays(1)) {
				String keyPrice = String.format("%s.%s", code, cx.format(DateTimeFormatter.BASIC_ISO_DATE));
				PriceDomain price = mapPrice.get(keyPrice);
				if (price == null) {
					continue;
				}

				price.setFlagSpecial(true);
				break;
			}
		}

		// 배당일 대표 지정
		Map<String, DividendHistoryDomain> mapHistory = makeMapHistoryByCodeAndBase(histories);
		for (String key: mapHistory.keySet()) {
			DividendHistoryDomain history = mapHistory.get(key);
			String code = history.getCode();
			Date base = history.getBase();
			LocalDate localDate = LocalDate.ofInstant(base.toInstant(), Utility.ZONE_ID_KST);
			LocalDate startEndDate = localDate.minusWeeks(2);
			for (LocalDate cx = localDate.plusDays(0); cx.isAfter(startEndDate); cx = cx.minusDays(1)) {
				String keyPrice = String.format("%s.%s", code, cx.format(DateTimeFormatter.BASIC_ISO_DATE));
				PriceDomain price = mapPrice.get(keyPrice);
				if (price == null) {
					continue;
				}

				price.setFlagSpecial(true);
				break;
			}
		}
		
		CrudList<PriceDomain> result = put(prices);
		log.info("{} 『{}』 compile(#{}, #{}) - {}", Utility.indentEnd(), result, Utility.size(items), Utility.size(histories), Utility.toStringPastTimeReadable(started));
		return result;
	}

	private Map<String, ItemDomain> makeMapItemByCodeAndIpoDate(List<ItemDomain> items) {
		Map<String, ItemDomain> map = new HashMap<>();
		for (ItemDomain item: items) {
			String code = item.getCode();
			Date date = item.getIpoOpen();
			if (code == null || date == null) {
				continue;
			}

			String key = String.format("%s.%tF", code, date);
			map.put(key, item);
		}
		return map;
	}

	private Map<String, DividendHistoryDomain> makeMapHistoryByCodeAndBase(List<DividendHistoryDomain> histories) {
		Map<String, DividendHistoryDomain> map = new HashMap<>();
		for (DividendHistoryDomain history: histories) {
			String code = history.getCode();
			Date base = history.getBase();
			String key = String.format("%s.%tF", code, base);
			map.put(key, history);
		}
		return map;
	}


	@CacheEvict(value = "prices")
	@Transactional
	public int purge() {
		ZonedDateTime date = ZonedDateTime.now().minusMonths(1);
		int result = repository.purge(Date.from(date.toInstant()));
		return result;
	}

	@Override
	public PriceDomain toDomain(String line) {
		return Utility.parseJsonLine(line, PriceDomain.class);
	}

}
