package kr.andold.stock.job;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.ApplicationContextProvider;
import kr.andold.stock.crawler.CrawlerService;
import kr.andold.stock.crawler.Seibro;
import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.JobService;
import kr.andold.stock.service.JobService.Job;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.utils.Utility;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@Service
public class CrawlDividendSeibroEtfJob implements Job {
	@Builder.Default @Getter @Setter private Long timeout = 1200L;
	@Getter @Setter private ZonedDateTime start;

	@Autowired private Seibro seibro;
	@Autowired private CrawlerService service;

	@Override
	public STATUS call() throws Exception {
		log.debug("{} CrawlDividendSeibroEtfJob::call()", Utility.indentStart());
		long started = System.currentTimeMillis();

		STATUS result = main();

		log.debug("{} 『#{}』 CrawlPriceLatestSeibroEtfJob::call() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
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

		CrawlDividendSeibroEtfJob job = (CrawlDividendSeibroEtfJob) ApplicationContextProvider.getBean(CrawlDividendSeibroEtfJob.class);
		job.containsOrModify(date);
		deque.addLast(job);
	}

	public boolean containsOrModify(ZonedDateTime date) {
		if (start.isBefore(date)) {
			return true;
		}
		
		start = date;
		return true;
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
		if (!(job instanceof CrawlDividendSeibroEtfJob)) {
			return false;
		}

		CrawlDividendSeibroEtfJob previous = (CrawlDividendSeibroEtfJob) job;
		return previous.containsOrModify(date);
	}

	protected STATUS main() {
		log.debug("{} CrawlDividendSeibroEtfJob::main()", Utility.indentStart());
		long started = System.currentTimeMillis();

		Result<ParserResult> result = seibro.dividendEtf(Date.from(start.toInstant()));
		if (result.getStatus() == STATUS.SUCCESS) {
			service.put(result.getResult());
		}
		
		log.debug("{} 『{}』 CrawlDividendSeibroEtfJob::main() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result.getStatus();
	}


}
