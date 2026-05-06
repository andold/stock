package kr.andold.stock.job;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.ApplicationContextProvider;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.DataGoKrService;
import kr.andold.stock.service.JobService;
import kr.andold.stock.service.JobService.Job;
import kr.andold.stock.service.Utility;
import kr.andold.utils.persist.CrudList;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

//	최근주가ETF
@Slf4j
@Service
public class CrawlPriceLatestDataGoKrEtfJob implements Job {
	@Getter private Long timeout = 600L;
	@Getter private ZonedDateTime start = ZonedDateTime.now();

	@Autowired private DataGoKrService service;

	@Override
	public STATUS call() throws Exception {
		log.debug("{} CrawlPriceLatestDataGoKrEtfJob::call(『{}』)", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		STATUS result = main();

		log.debug("{} 『#{}』 CrawlPriceLatestDataGoKrEtfJob::call() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	public static void regist(ConcurrentLinkedDeque<Job> deque, ZonedDateTime date) {
		if (containsOrModify(date, JobService.getQueue0())) {
			return;
		}
		if (containsOrModify(date, JobService.getQueue1())) {
			return;
		}
		if (containsOrModify(date, JobService.getQueue2())) {
			return;
		}
		if (containsOrModify(date, JobService.getQueue3())) {
			return;
		}

		CrawlPriceLatestDataGoKrEtfJob job = (CrawlPriceLatestDataGoKrEtfJob) ApplicationContextProvider.getBean(CrawlPriceLatestDataGoKrEtfJob.class);
		job.containsOrModify(date);
		deque.addLast(job);
	}

	private static boolean containsOrModify(ZonedDateTime date, ConcurrentLinkedDeque<Job> deque) {
		for (Job job : deque) {
			if (containsOrModify(date, job)) {
				return true;
			}
		}
		return false;
	}

	private static boolean containsOrModify(ZonedDateTime date, Job job) {
		if (!(job instanceof CrawlPriceLatestDataGoKrEtfJob)) {
			return false;
		}

		CrawlPriceLatestDataGoKrEtfJob previous = (CrawlPriceLatestDataGoKrEtfJob) job;
		return previous.containsOrModify(date);
	}

	public boolean containsOrModify(ZonedDateTime date) {
		if (start.isBefore(date)) {
			return true;
		}
		
		start = date;
		return true;
	}

	// 최근주가ETF
	protected STATUS main() {
		log.debug("{} 최근주가ETF::main(『{}』)", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		try {
			List<PriceDomain> prices = DataGoKrService.getETFPriceInfo(null, start);
			CrudList<PriceDomain> crud = service.putPrice(prices);

			log.debug("{} 『{}』 최근주가ETF::main() - {}", Utility.indentEnd(), crud, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		log.debug("{} 『{}』 최근주가ETF::main() - {}", Utility.indentEnd(), STATUS.EXCEPTION, Utility.toStringPastTimeReadable(started));
		return STATUS.EXCEPTION;
	}

}
