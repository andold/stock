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
import kr.andold.utils.Utility;
import kr.andold.utils.persist.CrudList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

// 주식시세 최근 회사
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@Service
public class CrawlPriceLatestDataGoKrCompanyJob implements Job {
	@Autowired private DataGoKrService dataGoKrService;

	@Builder.Default
	@Getter
	@Setter
	private Long timeout = 600L;
	@Getter
	@Setter
	private ZonedDateTime start;

	@Autowired
	private DataGoKrService service;

	@Override
	public STATUS call() throws Exception {
		log.debug("{} CrawlPriceLatestDataGoKrCompanyJob::call(『{}』)", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		CrawlPriceLatestDataGoKrCompanyJob that = (CrawlPriceLatestDataGoKrCompanyJob) ApplicationContextProvider.getBean(CrawlPriceLatestDataGoKrCompanyJob.class);
		that.setStart(start);
		STATUS result = that.main();

		log.debug("{} 『#{}』 CrawlPriceLatestDataGoKrCompanyJob::call() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
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

		deque.addLast(CrawlPriceLatestDataGoKrCompanyJob.builder().start(date).build());
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
		if (!(job instanceof CrawlPriceLatestDataGoKrCompanyJob)) {
			return false;
		}

		CrawlPriceLatestDataGoKrCompanyJob previous = (CrawlPriceLatestDataGoKrCompanyJob) job;
		if (previous.getStart().isBefore(date)) {
			return true;
		}
		
		previous.setStart(date);
		return true;
	}

	// 주식시세
	protected STATUS main() {
		log.debug("{} 주식시세최근회사::CrawlPriceLatestDataGoKrCompanyJob::main(『{}』)", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		List<PriceDomain> prices = dataGoKrService.getStockPriceInfo(null, start);
		CrudList<PriceDomain> crud = service.putPrice(prices);

		log.debug("{} 『{}』 주식시세최근회사::CrawlPriceLatestDataGoKrCompanyJob::main() - {}", Utility.indentEnd(), crud, Utility.toStringPastTimeReadable(started));
		return STATUS.SUCCESS;
	}

}
