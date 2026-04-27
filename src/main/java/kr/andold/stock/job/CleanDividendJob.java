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
import kr.andold.stock.service.DividendHistoryService;
import kr.andold.stock.service.ItemService;
import kr.andold.stock.service.JobService;
import kr.andold.stock.service.JobService.Job;
import kr.andold.utils.Utility;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

//	배당 정보 청소. 상장일 이전의 배당정보 제거(상장일 이전의 주가 정보가 없다)
@Slf4j
@Service
public class CleanDividendJob implements Job {
	@Getter private Long timeout = 300L;	//	TimeUnit.SECONDS
	@Getter private Map<String, ZonedDateTime> map = new HashMap<>();	//	Map<종목코드, dummy>

	@Autowired private ItemService itemService;
	@Autowired private DividendHistoryService dividendHistoryService;

	@Override
	public STATUS call() throws Exception {
		log.info("{} call()", Utility.indentStart());
		long started = System.currentTimeMillis();

		STATUS result = main();
		
		log.info("{} 『#{}』 call() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return STATUS.SUCCESS;
	}

	public static void regist(ConcurrentLinkedDeque<Job> deque, String code) {
		if (containsOrModify(JobService.getQueue0(), code)) {
			return;
		}
		if (containsOrModify(JobService.getQueue1(), code)) {
			return;
		}
		if (containsOrModify(JobService.getQueue2(), code)) {
			return;
		}
		if (containsOrModify(JobService.getQueue3(), code)) {
			return;
		}

		CleanDividendJob job = (CleanDividendJob) ApplicationContextProvider.getBean(CleanDividendJob.class);
		job.containsOrModify(code);
		job.getMap().put(code, ZonedDateTime.now());
		deque.addLast(job);
	}

	private static boolean containsOrModify(ConcurrentLinkedDeque<Job> deque, String zdt) {
		for (Job job : deque) {
			if (containsOrModify(job, zdt)) {
				return true;
			}
		}
		return false;
	}

	private static boolean containsOrModify(Job job, String code) {
		if (!(job instanceof CleanDividendJob)) {
			return false;
		}

		CleanDividendJob previous = (CleanDividendJob) job;
		return previous.containsOrModify(code);
	}

	private boolean containsOrModify(String code) {
		ZonedDateTime datePrevious = map.get(code);
		if (datePrevious == null) {
			map.put(code, ZonedDateTime.now());
			return true;
		}

		return true;
	}

	//	배당 정보 청소. 상장일 이전의 배당정보 제거(상장일 이전의 주가 정보가 없다)
	protected STATUS main() {
		log.debug("{} CleanDividendJob::main()", Utility.indentStart());
		long started = System.currentTimeMillis();

		try {
			double threshold = 128.0 / map.size();
			List<DividendHistoryDomain> removes = new ArrayList<>();
			for (String code : map.keySet()) {
				if (Math.random() > threshold) {
					continue;
				}

				ZonedDateTime zdt = map.get(code);
				ItemDomain item = itemService.read(code);
				if (item == null) {
					log.debug("{} 『NULL::ITEM』 CleanDividendJob::main() - 『{}』『{}』『{}』", Utility.indentMiddle(), code, zdt, item);
					continue;
				}

				Date ipoOpen = item.getIpoOpen();
				if (ipoOpen == null) {
					log.debug("{} 『상장일::{}』 CleanDividendJob::main() - 『{}』『{}』『{}』", Utility.indentMiddle(), ipoOpen, code, zdt, item);
					continue;
				}

				DividendHistoryParam dividendHistoryParam = DividendHistoryParam.builder().code(code).build();
				List<DividendHistoryDomain> dividends = dividendHistoryService.search(dividendHistoryParam);
				for (DividendHistoryDomain dividend : dividends) {
					Date base = dividend.getBase();
					if (base.before(ipoOpen)) {
						removes.add(dividend);
						continue;
					}
				}
			}

			int removed = dividendHistoryService.remove(removes);

			log.debug("{} 『{}:{}/#{}』 CleanDividendJob::main() - {}", Utility.indentEnd()
					, STATUS.SUCCESS, removed, Utility.size(removes), Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		log.debug("{} 『{}』 CleanDividendJob::main() - {}", Utility.indentEnd(), STATUS.EXCEPTION, Utility.toStringPastTimeReadable(started));
		return STATUS.EXCEPTION;
	}
}
