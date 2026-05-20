package kr.andold.stock.job;

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.ApplicationContextProvider;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.DataGoKrService;
import kr.andold.stock.service.JobService;
import kr.andold.stock.service.JobService.Job;
import kr.andold.utils.Utility;
import kr.andold.utils.persist.CrudList;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CrawlItemDetailDataGoKrCompanyJob implements Job {
	@Getter private Long timeout = 600L;	//	TimeUnit.SECONDS
	@Getter private Map<String, ZonedDateTime> map = new HashMap<>();	//	Map<isinCode종목코드, 기준일>

	@Autowired private DataGoKrService service;
	@Autowired private JobService jobService;

	@Override
	public STATUS call() throws Exception {
		log.debug("{} CrawlItemDetailDataGoKrCompanyJob::call(『#{}』)", Utility.indentStart(), Utility.size(map));
		long started = System.currentTimeMillis();

		jobService.status("┍회사정보:공공데이타");
		STATUS result = main();
		jobService.status("┕회사정보:공공데이타");

		log.debug("{} 『#{}』 CrawlItemDetailDataGoKrCompanyJob::call(『#{}』) - {}", Utility.indentEnd(), result, Utility.size(map), Utility.toStringPastTimeReadable(started));
		return result;
	}

	public static void regist(ConcurrentLinkedDeque<Job> deque, String isinCode, ZonedDateTime baseDate) {
		if (containsOrModify(JobService.getQueue0(), isinCode, baseDate)) {
			return;
		}
		if (containsOrModify(JobService.getQueue1(), isinCode, baseDate)) {
			return;
		}
		if (containsOrModify(JobService.getQueue2(), isinCode, baseDate)) {
			return;
		}
		if (containsOrModify(JobService.getQueue3(), isinCode, baseDate)) {
			return;
		}

		CrawlItemDetailDataGoKrCompanyJob job = (CrawlItemDetailDataGoKrCompanyJob) ApplicationContextProvider.getBean(CrawlItemDetailDataGoKrCompanyJob.class);
		job.containsOrModify(isinCode, baseDate);
		deque.addLast(job);
	}
	public static void regist(ConcurrentLinkedDeque<Job> deque, String isinCode) {
		regist(deque, isinCode, ZonedDateTime.now().minusWeeks(1));
	}

	private static boolean containsOrModify(ConcurrentLinkedDeque<Job> deque, String isinCode, ZonedDateTime date) {
		for (Job job : deque) {
			if (containsOrModify(job, isinCode, date)) {
				return true;
			}
		}
		return false;
	}

	private static boolean containsOrModify(Job job, String isinCode, ZonedDateTime date) {
		if (!(job instanceof CrawlItemDetailDataGoKrCompanyJob)) {
			return false;
		}

		CrawlItemDetailDataGoKrCompanyJob previous = (CrawlItemDetailDataGoKrCompanyJob) job;
		return previous.containsOrModify(isinCode, date);
	}

	private boolean containsOrModify(String isinCode, ZonedDateTime date) {
		ZonedDateTime datePrevious = map.get(isinCode);
		if (datePrevious == null) {
			map.put(isinCode, date);
			return true;
		}

		if (date.isBefore(datePrevious)) {
			map.put(isinCode, date);
			return true;
		}

		return true;
	}

	// 종목기본정보조회
	protected STATUS main() {
		log.debug("{} 종목기본정보조회::main(『#{}』)", Utility.indentStart(), Utility.size(map));
		long started = System.currentTimeMillis();

		try {
			int size = map.size();
			double threshold = 128.0 / size;
			CrudList<ItemDomain> container = CrudList.<ItemDomain>builder().build();
			for (String isinCode : map.keySet()) {
				if (Math.random() > threshold) {
					continue;
				}

				log.debug("{} 『{}:{}/{}』 종목기본정보조회::main()", Utility.indentStart(), isinCode, threshold, size);
				ZonedDateTime baseDate = map.get(isinCode);

				List<ItemDomain> items = DataGoKrService.getItemInfo(null, isinCode, baseDate);
				CrudList<ItemDomain> crud = service.putItem(items);
				container.add(crud);

				log.debug("{} 『{}:{}/{}』 종목기본정보조회::main() - 『{}』『{}』", Utility.indentEnd(), isinCode, threshold, size, Utility.size(items), crud);
			}

			log.debug("{} 『{}』 종목기본정보조회::main(『#{}』) - {}", Utility.indentEnd(), container, Utility.size(map), Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		log.debug("{} 『{}』 종목기본정보조회::main(『#{}』) - {}", Utility.indentEnd(), STATUS.EXCEPTION, Utility.size(map), Utility.toStringPastTimeReadable(started));
		return STATUS.EXCEPTION;
	}

}
