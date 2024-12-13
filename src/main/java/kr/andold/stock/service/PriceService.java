package kr.andold.stock.service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import jakarta.transaction.Transactional;
import kr.andold.stock.crawler.Seibro;
import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.entity.PriceEntity;
import kr.andold.stock.param.ItemParam;
import kr.andold.stock.param.PriceParam;
import kr.andold.stock.repository.PriceRepository;
import kr.andold.stock.repository.PriceSpecification;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PriceService implements CommonBlockService<PriceParam, PriceDomain, PriceEntity> {
	@Autowired private PriceRepository repository;
	@Autowired private Seibro seibro;

	@Override
	public int batch(CrudList<PriceDomain> list) {
		log.info("{} batch(『{}』)", Utility.indentStart(), list);
		long started = System.currentTimeMillis();

		int result = CommonBlockService.super.batch(list);

		log.info("{} 『{}』 batch(『{}』) - {}", Utility.indentEnd(), result, list, Utility.toStringPastTimeReadable(started));
		return result;
	}

	@Override
	public CrudList<PriceDomain> differ(List<PriceDomain> befores, List<PriceDomain> afters) {
		log.info("{} differ(『#{}』, 『#{}』)", Utility.indentStart(), Utility.size(befores), Utility.size(afters));
		long started = System.currentTimeMillis();

		CrudList<PriceDomain> result = CommonBlockService.super.differ(befores, afters);

		log.info("{} 『{}』 differ(『#{}』, 『#{}』) - {}", Utility.indentEnd(), result, Utility.size(befores), Utility.size(afters), Utility.toStringPastTimeReadable(started));
		return result;
	}

	@Override
	public CrudList<PriceDomain> upload(MultipartFile file) {
		log.info("{} upload(...)", Utility.indentStart());
		long started = System.currentTimeMillis();

		CrudList<PriceDomain> result = CommonBlockService.super.upload(file);

		log.info("{} 『{}』 upload(...) - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	@Override
	public CrudList<PriceDomain> put(List<PriceDomain> afters) {
		log.info("{} put(『#{}』)", Utility.indentStart(), Utility.size(afters));
		long started = System.currentTimeMillis();

		CrudList<PriceDomain> result = CommonBlockService.super.put(afters);

		log.info("{} 『{}』 put(『#{}』) - {}", Utility.indentEnd(), result, Utility.size(afters), Utility.toStringPastTimeReadable(started));
		return result;
	}

	@Modifying
	@CacheEvict(value = "prices")
	@Override
	public List<PriceDomain> update(List<PriceDomain> domains) {
		log.info("{} update(『#{}』)", Utility.indentStart(), Utility.size(domains));
		long started = System.currentTimeMillis();

		List<PriceEntity> entities = toEntities(domains);
		List<PriceEntity> updated = repository.saveAllAndFlush(entities);
		List<PriceDomain> result = toDomains(updated);

		log.info("{} 『#{}』 update(『#{}』) - {}", Utility.indentEnd(), Utility.size(result), Utility.size(domains), Utility.toStringPastTimeReadable(started));
		return result;
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
		Utility.copyPropertiesNotNull(after, before, "id", "updated", "created");
		before.setUpdated(new Date());		
	}

	@Override
	public String key(PriceDomain domain) {
		return domain.key();
	}

	@Cacheable(value= "prices")
	@Override
	public List<PriceDomain> search(PriceParam param) {
		log.info("{} search({})", Utility.indentStart(), param);
		long started = System.currentTimeMillis();

		List<PriceEntity> entities;
		if (param == null) {
			entities = repository.findAll();
		} else {
//			entities = repository.search(param);
			entities = repository.findAll(PriceSpecification.searchWith(param), Sort.by(Direction.ASC, "code", "base"));
		}
		List<PriceDomain> domains = new ArrayList<PriceDomain>();
		for (PriceEntity entity : entities) {
			domains.add(PriceDomain.of(entity));
		}

		log.info("{} #{} prices({}) - {}", Utility.indentEnd(), Utility.size(domains), param, Utility.toStringPastTimeReadable(started));
		return domains;
	}

	@Modifying
	@Cacheable(value= "prices")
	@Override
	public int remove(List<PriceDomain> domains) {
		List<PriceEntity> entities = toEntities(domains);
		repository.deleteAll(entities);
		repository.flush();
		return Utility.size(entities);
	}

	@Modifying
	@CacheEvict(value = "prices")
	@Override
	public List<PriceDomain> create(List<PriceDomain> domains) {
		log.info("{} create(『#{}』)", Utility.indentStart(), Utility.size(domains));
		long started = System.currentTimeMillis();

		List<PriceEntity> entities = toEntities(domains);
		List<PriceDomain> container = new ArrayList<>();
		for (int cx = 0, sizex = entities.size(), window = 1024; cx < sizex; cx += window) {
			List<PriceEntity> subList = entities.subList(cx, Math.min(cx + window, sizex));
			List<PriceEntity> created = repository.saveAllAndFlush(subList);
			List<PriceDomain> result = toDomains(created);
			container.addAll(result);
			log.info("{} 『{}/{}』 create(『#{}』)", Utility.indentMiddle(), cx, sizex, Utility.size(domains));
		}

		log.info("{} 『#{}』 create(『#{}』) - {}", Utility.indentEnd(), Utility.size(container), Utility.size(domains), Utility.toStringPastTimeReadable(started));
		return container;
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
	public CrudList<PriceDomain> compile(LocalDate start) {
		log.info("{} compile(『{}』)", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		PriceParam param = PriceParam.builder().start(Date.from(start.atStartOfDay(Utility.ZONE_ID_KST).toInstant())).build();
		List<PriceDomain> after = search(param);
		CrudList<PriceDomain> result = compile(after, true);

		log.info("{} 『{}』 compile(『{}』) - {}", Utility.indentEnd(), result, start, Utility.toStringPastTimeReadable(started));
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

	//	zone offset garbage
	public STATUS deduplicate() {
		log.info("{} deduplicate()", Utility.indentStart());
		long started = System.currentTimeMillis();

		List<PriceDomain> prices = search(null);
		Map<String, List<PriceDomain>> map = makeMapByCode(prices);
		List<PriceDomain> removes = new ArrayList<>();
		for (List<PriceDomain> list: map.values()) {
			if (list.size() < 2) {
				continue;
			}

			Collections.sort(list, (a, b) -> a.getBase().compareTo(b.getBase()));
			PriceDomain previous = list.get(0);
			for (int cx = 1, sizex = list.size(); cx < sizex; cx++) {
				PriceDomain price = list.get(cx);
				if (Utility.isSameDay(previous.getBase(), price.getBase())) {
					removes.add(price);
				}
				
				previous = price;
			}
		}

		int removed = remove(removes);
		int dedups = dedup(prices);
		STATUS result = STATUS.SUCCESS;

		log.info("{} 『{}/{}:{}/{}』 deduplicate() - {}", Utility.indentMiddle(), result, removed, dedups, Utility.size(prices), Utility.toStringPastTimeReadable(started));
		return result;
	}

	private Map<String, List<PriceDomain>> makeMapByCode(List<PriceDomain> prices) {
		Map<String, List<PriceDomain>> map = new HashMap<>();
		for (PriceDomain price: prices) {
			String code = price.getCode();
			if (code == null) {
				continue;
			}

			List<PriceDomain> list = map.get(code);
			if (list == null) {
				list = new ArrayList<>();
				map.put(code, list);
			}
			list.add(price);
		}

		return map;
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
	public CrudList<PriceDomain> compile(List<PriceDomain> prices, List<ItemDomain> items, List<DividendHistoryDomain> histories) {
		log.info("{} compile(#{}, #{})", Utility.indentStart(), Utility.size(items), Utility.size(histories));
		long started = System.currentTimeMillis();

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


	@Modifying
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

	// null이면 이미 수집 완료되었거나, 수집이 무효하다
	public Date dateCrawlRequireForDividend(ItemDomain item, List<DividendHistoryDomain> histories) {
		if (item == null || histories == null || histories.isEmpty()) {
			return null;
		}

		Date ipoOpen = item.getIpoOpen();
		Date ipoClose = item.getIpoClose();
		String type = item.getType();
		Date today = new Date();
		if (ipoOpen == null || (ipoClose != null && ipoClose.before(today)) || (type != null && type.contains("비상장"))) {
			return null;
		}

		Date date = null;
		for (DividendHistoryDomain history : histories) {
			if (history == null) {
				continue;
			}

			Integer dividend = history.getDividend();

			if (dividend == null || dividend <= 0) {
				continue;
			}

			if (history.getPriceBase() == null || history.getPriceClosing() == null) {
				if (date == null) {
					date = history.getBase();
				} else if (date.after(history.getBase())) {
					date = history.getBase();
				}
			}
		}
		return date;
	}

	// 상장폐지일 이후의 주가시세는 지운다
	public int clean(Map<String, ItemDomain> mapItem, List<PriceDomain> prices) {
		List<PriceDomain> removes = new ArrayList<>();
		if (mapItem == null || prices == null) {
			return 0;
		}

		for (PriceDomain price: prices) {
			ItemDomain item = mapItem.get(price.getCode());
			if (item == null) {
				continue;
			}
			
			Date ipoClose = item.getIpoClose();
			if (ipoClose == null) {
				continue;
			}
			
			Date base = price.getBase();			
			if (base.after(ipoClose)) {
				removes.add(price);
			}
		}
		return remove(removes);
	}

}
