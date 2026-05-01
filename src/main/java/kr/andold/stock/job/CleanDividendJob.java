package kr.andold.stock.job;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.ApplicationContextProvider;
import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.param.DividendHistoryParam;
import kr.andold.stock.param.ItemParam;
import kr.andold.stock.service.DividendHistoryService;
import kr.andold.stock.service.ItemService;
import kr.andold.stock.service.JobService;
import kr.andold.stock.service.JobService.Job;
import kr.andold.utils.Utility;
import kr.andold.utils.persist.CrudList;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

//	배당 정보 청소. 상장일 이전의 배당정보 제거(상장일 이전의 주가 정보가 없다)
@Slf4j
@Service
public class CleanDividendJob implements Job {
	@Getter private Long timeout = 300L;	//	TimeUnit.SECONDS
	@Getter private Map<String, ZonedDateTime> map = new HashMap<>();	//	Map<종목코드, dummy>
	@Getter private Map<String, ZonedDateTime> mapIsinCode = new HashMap<>();	//	Map<IsinCode종목코드, dummy>

	@Autowired private ItemService itemService;
	@Autowired private DividendHistoryService dividendHistoryService;

	@Override
	public STATUS call() throws Exception {
		log.info("{} call()", Utility.indentStart());
		long started = System.currentTimeMillis();

		CrudList<DividendHistoryDomain> container = CrudList.<DividendHistoryDomain>builder().build();
		CrudList<DividendHistoryDomain> crudByCode = cleanDividendByCode(map);
		container.add(crudByCode);
		STATUS resultByIsInCode = cleanDividendByIsInCode(mapIsinCode);
		
		log.info("{} 『{}:{}:{}』 call() - {}", Utility.indentEnd(), container, crudByCode, resultByIsInCode, Utility.toStringPastTimeReadable(started));
		return STATUS.SUCCESS;
	}

	//	IsInCode를 이용한 배당 정보 청소. 상장일 이전의 배당정보 제거(상장일 이전의 주가 정보가 없다)
	private STATUS cleanDividendByIsInCode(Map<String, ZonedDateTime> map) {
		log.debug("{} cleanDividendByIsInCode(#{})", Utility.indentStart(), Utility.size(map));
		long started = System.currentTimeMillis();
		
		List<String> isinCodes = new ArrayList<>(map.keySet());
		for (int cx = 0, sizex = isinCodes.size(); cx < sizex; cx += 128) {
	        // 마지막 부분에서 인덱스 범위를 넘지 않도록 Math.min 사용
			List<String> isinCodes128 = isinCodes.subList(cx, Math.min(cx + 128, sizex));
			cleanDividendByIsInCode(isinCodes128);
	    }

		log.debug("{} 『{}』cleanDividendByIsInCode(#{}) - {}", Utility.indentEnd(), STATUS.SUCCESS, Utility.size(map), Utility.toStringPastTimeReadable(started));
		return STATUS.SUCCESS;
	}

	private CrudList<DividendHistoryDomain> cleanDividendByIsInCode(List<String> isinCodes) {
		log.debug("{} cleanDividendByIsInCode(#{})", Utility.indentStart(), Utility.size(isinCodes));

		CrudList<DividendHistoryDomain> container = CrudList.<DividendHistoryDomain>builder().build();
		List<DividendHistoryDomain> dividends = dividendHistoryService.search(DividendHistoryParam.builder().isinCodes(isinCodes).build());		if (dividends == null || dividends.isEmpty()) {
			log.debug("{} 『NULL_EMPTY_RESULT』cleanDividendByIsInCode(#{})", Utility.indentEnd(), Utility.size(isinCodes));
			return container;		}

		List<ItemDomain> items = itemService.search(ItemParam.builder().isinCodes(isinCodes).build());
		Map<String, ItemDomain> mapIsinCodeItem = new HashMap<>();
		for (ItemDomain item: items) {
			mapIsinCodeItem.put(item.getIsinCode(), item);
		}

		Map<String, List<DividendHistoryDomain>> mapIsinCodeDividend = new HashMap<>();
		for (DividendHistoryDomain dividend : dividends) {
			String isinCode = dividend.getIsinCode();
			List<DividendHistoryDomain> previous = mapIsinCodeDividend.get(isinCode);
			if (previous == null) {
				previous = new ArrayList<>();
				mapIsinCodeDividend.put(isinCode, previous);
			}
			
			previous.add(dividend);
		}
		
		for (String isinCode: isinCodes) {
			CrudList<DividendHistoryDomain> crud = cleanDividend(mapIsinCodeItem.get(isinCode), mapIsinCodeDividend.get(isinCode));
			container.add(crud);
		}

		log.debug("{} 『{}』cleanDividendByIsInCode(#{})", Utility.indentEnd(), container, Utility.size(isinCodes));
		return container;
	}

	private CrudList<DividendHistoryDomain> cleanDividend(List<DividendHistoryDomain> dividends) {
		log.debug("{} cleanDividend(『#{}』)", Utility.indentStart(), Utility.size(dividends));

		CrudList<DividendHistoryDomain> crud = CrudList.<DividendHistoryDomain>builder().build();
		List<DividendHistoryDomain> removes = crud.getRemoves();
		if (dividends == null) {
			log.debug("{} 『NULL::dividends』 cleanDividend(『#{}』)", Utility.indentEnd(), Utility.size(dividends));
			return crud;
		}

		for (DividendHistoryDomain dividend : dividends) {
			if (dividend.getDividend() <= 0) {
				removes.add(dividend);
				continue;
			}
		}

		int removed = dividendHistoryService.remove(removes);
		log.debug("{} 『{}/{}』cleanDividend(『#{}』)", Utility.indentEnd(), removed, Utility.size(removes), Utility.size(dividends));
		return crud;
	}

	private void cleanDividend(ItemDomain item) {
		log.debug("{} cleanDividend(『{}』)", Utility.indentStart(), item);

		if (item == null) {
			log.debug("{} 『NULL::ITEM』 cleanDividend(『{}』)", Utility.indentEnd(), item);
			return;
		}

		Date ipoOpen = item.getIpoOpen();
		String type = item.getType();
		if (ipoOpen == null) {
			if (type == null || !type.equals("기타비상장")) {
				CrawlItemDetailJob.regist(JobService.getQueue3(), item.getCode());
			}
		}

		log.debug("{} cleanDividend(『{}』)", Utility.indentEnd(), item);
	}

	private CrudList<DividendHistoryDomain> cleanDividend(ItemDomain item, List<DividendHistoryDomain> dividends) {
		log.debug("{} cleanDividend(『{}』, 『#{}』)", Utility.indentStart(), item, Utility.size(dividends));

		cleanDividend(item);
		CrudList<DividendHistoryDomain> crud = cleanDividend(dividends);

		if (item == null || dividends == null) {
			log.debug("{} 『{}』 cleanDividend(『{}』, 『#{}』)", Utility.indentEnd(), crud, item, Utility.size(dividends));
			return crud;
		}

		Date ipoOpen = item.getIpoOpen();
		List<DividendHistoryDomain> removes = new ArrayList<>();
		List<DividendHistoryDomain> updates = new ArrayList<>();
		for (DividendHistoryDomain dividend : dividends) {
			Date base = dividend.getBase();
			if (base == null || (ipoOpen != null && base.before(ipoOpen))) {
				removes.add(dividend);
				continue;
			}

			String code = dividend.getCode();
			String isinCode = dividend.getIsinCode();
			if (isinCode != null && !isinCode.isBlank()) {
				if (code == null || code.isBlank()) {
					dividend.setCode(item.getCode());
					updates.add(dividend);
				}
			}

			if (code != null && !code.isBlank()) {
				if (isinCode == null || isinCode.isBlank()) {
					dividend.setIsinCode(item.getIsinCode());
					updates.add(dividend);
				}
			}
		}

		int removed = dividendHistoryService.remove(removes);
		List<DividendHistoryDomain> updated = dividendHistoryService.update(updates);
		crud.getUpdates().addAll(updates);
		crud.getRemoves().addAll(removes);
		
		log.debug("{} 『{}:{}:{}』cleanDividend(『{}』, 『#{}』)", Utility.indentEnd(), crud, removed, Utility.size(updated), item, Utility.size(dividends));
		return crud;
	}

	//	배당 정보 청소. 상장일 이전의 배당정보 제거(상장일 이전의 주가 정보가 없다)
	private CrudList<DividendHistoryDomain> cleanDividendByCode(Map<String, ZonedDateTime> map) {
		log.debug("{} cleanDividendByCode(#{})", Utility.indentStart(), Utility.size(map));
		long started = System.currentTimeMillis();

		//	전체에서 적절한 크기로 분할하여 처리한다.
		CrudList<DividendHistoryDomain> container = CrudList.<DividendHistoryDomain>builder().build();
		List<String> codes = new ArrayList<>(map.keySet());
		for (int cx = 0, sizex = codes.size(); cx < sizex; cx += 128) {
	        // 마지막 부분에서 인덱스 범위를 넘지 않도록 Math.min 사용
			List<String> codes128 = codes.subList(cx, Math.min(cx + 128, sizex));
			CrudList<DividendHistoryDomain> crud = cleanDividendByCode(codes128);
			container.add(crud);
	    }

		log.debug("{} 『{}』 cleanDividendByCode(#{}) - {}", Utility.indentEnd(), container, Utility.size(map), Utility.toStringPastTimeReadable(started));
		return container;
	}

	private CrudList<DividendHistoryDomain> cleanDividendByCode(List<String> codes) {
		log.debug("{} cleanDividendByCode(#{})", Utility.indentStart(), Utility.size(codes));

		CrudList<DividendHistoryDomain> container = CrudList.<DividendHistoryDomain>builder().build();
		List<DividendHistoryDomain> dividends = dividendHistoryService.search(DividendHistoryParam.builder().codes(codes).build());
		if (dividends == null || dividends.isEmpty()) {
			log.debug("{} 『NULL_EMPTY_RESULT:{}』cleanDividendByCode(#{})", Utility.indentEnd(), container, Utility.size(codes));
			return container;
		}

		List<ItemDomain> items = itemService.search(ItemParam.builder().codes(codes).build());
		Map<String, ItemDomain> mapCodeItem = new HashMap<>();
		for (ItemDomain item: items) {
			mapCodeItem.put(item.getCode(), item);
		}

		Map<String, List<DividendHistoryDomain>> mapCodeDividend = new HashMap<>();
		for (DividendHistoryDomain dividend : dividends) {
			String code = dividend.getCode();
			List<DividendHistoryDomain> previous = mapCodeDividend.get(code);
			if (previous == null) {
				previous = new ArrayList<>();
				mapCodeDividend.put(code, previous);
			}
			
			previous.add(dividend);
		}
		
		for (String code: codes) {
			CrudList<DividendHistoryDomain> crud = cleanDividend(mapCodeItem.get(code), mapCodeDividend.get(code));
			container.add(crud);
		}

		log.debug("{} 『{}』cleanDividendByCode(#{})", Utility.indentEnd(), container, Utility.size(codes));
		return container;
	}

	public static void regist(ConcurrentLinkedDeque<Job> deque, String code, String isinCode) {
		if (containsOrModify(JobService.getQueue0(), code, isinCode)) {
			return;
		}
		if (containsOrModify(JobService.getQueue1(), code, isinCode)) {
			return;
		}
		if (containsOrModify(JobService.getQueue2(), code, isinCode)) {
			return;
		}
		if (containsOrModify(JobService.getQueue3(), code, isinCode)) {
			return;
		}

		CleanDividendJob job = (CleanDividendJob) ApplicationContextProvider.getBean(CleanDividendJob.class);
		job.containsOrModify(code, isinCode);
		if (code != null) {
			job.getMap().put(code, ZonedDateTime.now());
		}
		if (isinCode != null) {
			job.getMapIsinCode().put(isinCode, ZonedDateTime.now());
		}
		deque.addLast(job);
	}

	private static boolean containsOrModify(ConcurrentLinkedDeque<Job> deque, String code, String isinCode) {
		for (Job job : deque) {
			if (containsOrModify(job, code, isinCode)) {
				return true;
			}
		}
		return false;
	}

	private static boolean containsOrModify(Job job, String code, String isinCode) {
		if (!(job instanceof CleanDividendJob)) {
			return false;
		}

		CleanDividendJob previous = (CleanDividendJob) job;
		return previous.containsOrModify(code, isinCode);
	}

	private boolean containsOrModify(String code, String isinCode) {
		if (code != null) {
			map.put(code, ZonedDateTime.now());
		}
		if (isinCode != null) {
			mapIsinCode.put(isinCode, ZonedDateTime.now());
		}

		return true;
	}

}
