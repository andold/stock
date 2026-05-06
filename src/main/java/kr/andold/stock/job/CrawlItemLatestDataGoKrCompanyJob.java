package kr.andold.stock.job;

import java.time.ZonedDateTime;
import java.util.List;
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
public class CrawlItemLatestDataGoKrCompanyJob implements Job {
	@Getter private Long timeout = 600L;
	@Getter private ZonedDateTime start;

	@Autowired private DataGoKrService service;

	@Override
	public STATUS call() throws Exception {
		log.debug("{} 상장종목::call(『{}』)", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		STATUS result = main();

		log.debug("{} 『#{}』 상장종목::call(『{}』) - {}", Utility.indentEnd(), result, start, Utility.toStringPastTimeReadable(started));
		return result;
	}

	public static void regist(ConcurrentLinkedDeque<Job> deque, ZonedDateTime zdt) {
		if (containsOrModify(zdt, JobService.getQueue0())) {
			return;
		}
		if (containsOrModify(zdt, JobService.getQueue1())) {
			return;
		}
		if (containsOrModify(zdt, JobService.getQueue2())) {
			return;
		}
		if (containsOrModify(zdt, JobService.getQueue3())) {
			return;
		}

		CrawlItemLatestDataGoKrCompanyJob job = (CrawlItemLatestDataGoKrCompanyJob) ApplicationContextProvider.getBean(CrawlItemLatestDataGoKrCompanyJob.class);
		job.containsOrModify(zdt);
		deque.addLast(job);
	}

	private static boolean containsOrModify(ZonedDateTime zdt, ConcurrentLinkedDeque<Job> deque) {
		for (Job job : deque) {
			if (containsOrModify(zdt, job)) {
				return true;
			}
		}
		return false;
	}

	private static boolean containsOrModify(ZonedDateTime zdt, Job job) {
		if (!(job instanceof CrawlItemLatestDataGoKrCompanyJob)) {
			return false;
		}

		CrawlItemLatestDataGoKrCompanyJob previous = (CrawlItemLatestDataGoKrCompanyJob) job;
		return previous.containsOrModify(zdt);
	}

	protected boolean containsOrModify(ZonedDateTime zdt) {
		if (start.isBefore(zdt)) {
			return true;
		}

		start = zdt;
		return true;
	}

	// KRX에 상장된 종목에 대한 정보조회
	protected STATUS main() {
		log.debug("{} 상장종목::main(『{}』)", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		List<ItemDomain> items = DataGoKrService.getItemInfo(null, null, start);
		CrudList<ItemDomain> crud = service.putItem(items);

		log.debug("{} 『{}』 상장종목::main(『{}』) - {}", Utility.indentEnd(), crud, start, Utility.toStringPastTimeReadable(started));
		return STATUS.SUCCESS;
	}

}
