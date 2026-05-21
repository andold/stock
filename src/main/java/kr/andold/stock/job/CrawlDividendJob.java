package kr.andold.stock.job;

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.ApplicationContextProvider;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.JobService;
import kr.andold.stock.service.JobService.Job;
import kr.andold.utils.Utility;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CrawlDividendJob implements Job {
	@Getter private Long timeout = 60L;
	@Getter private Map<String, ZonedDateTime> map = new HashMap<>();	//	Map<종목코드, 배당일>
	
	@Autowired private JobService jobService;

	@Override
	public STATUS call() throws Exception {
		log.debug("{} CrawlDividendJob::call(『#{}』)", Utility.indentStart(), Utility.size(map));

		jobService.status("┍회사최근배당");
		STATUS result = main();
		jobService.status("┕회사최근배당");

		log.debug("{} 『{}』 CrawlDividendJob::call(『#{}』)", Utility.indentEnd(), result, Utility.size(map));
		return result;
	}

	public static void regist(ConcurrentLinkedDeque<Job> deque, String code, ZonedDateTime date) {
		log.debug("{} regist(..., 『{}』, 『{}』)", Utility.indentStart(), code, date);

		if (containsOrModify(JobService.getQueue0(), code, date)) {
			log.debug("{} 『0』regist(..., 『{}』, 『{}』)", Utility.indentEnd(), code, date);
			return;
		}
		if (containsOrModify(JobService.getQueue1(), code, date)) {
			log.debug("{} 『1』regist(..., 『{}』, 『{}』)", Utility.indentEnd(), code, date);
			return;
		}
		if (containsOrModify(JobService.getQueue2(), code, date)) {
			log.debug("{} 『2』regist(..., 『{}』, 『{}』)", Utility.indentEnd(), code, date);
			return;
		}
		if (containsOrModify(JobService.getQueue3(), code, date)) {
			log.debug("{} 『3』regist(..., 『{}』, 『{}』)", Utility.indentEnd(), code, date);
			return;
		}

		CrawlDividendJob job = (CrawlDividendJob) ApplicationContextProvider.getBean(CrawlDividendJob.class);
		job.containsOrModify(code, date);
		deque.addLast(job);
		log.debug("{} 『NEW』regist(..., 『{}』)", Utility.indentEnd(), date);
	}

	public boolean containsOrModify(String code, ZonedDateTime date) {
		if (code == null || code.isBlank()) {
			map.put(Utility.BLANK, date.plusDays(0));
			return true;
		}

		map.put(code, date.plusDays(0));
		return true;
	}

	private static boolean containsOrModify(ConcurrentLinkedDeque<Job> deque, String code, ZonedDateTime date) {
		for (Job job : deque) {
			if (containsOrModify(job, code, date)) {
				return true;
			}
		}
		return false;
	}

	private static boolean containsOrModify(Job job, String code, ZonedDateTime date) {
		if (!(job instanceof CrawlDividendJob)) {
			return false;
		}

		CrawlDividendJob previous = (CrawlDividendJob) job;
		return previous.containsOrModify(code, date);
	}

	protected STATUS main() {
		log.debug("{} CrawlDividendJob::main(『#{}』)", Utility.indentStart(), Utility.size(map));
		jobService.status("┍ 최근배당");

		for (String code : map.keySet()) {
			ZonedDateTime date = map.get(code);
			if (code.isBlank()) {
				CrawlDividendLatestDataGoKrCompanyJob.regist(JobService.getQueue3());
				CrawlDividendSeibroEtfJob.regist(JobService.getQueue3(), date);
				continue;
			}
			
			log.warn("{} 『NOT SUPPORT::{}:{}』 CrawlDividendJob::main(『#{}』)", Utility.indentMiddle(), code, date, Utility.size(map));
		}
		
		jobService.status("┕ 최근배당");
		log.debug("{} 『{}』 CrawlDividendJob::main(『#{}』)", Utility.indentEnd(), STATUS.SUCCESS, Utility.size(map));
		return STATUS.SUCCESS;
	}

}
