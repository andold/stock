package kr.andold.stock.job;

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

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
public class CrawlItemDetailSeibroJob implements Job {
	@Getter private Long timeout = 300L;	//	TimeUnit.SECONDS
	@Getter private Map<String, ZonedDateTime> map = new HashMap<>();	//	Map<종목코드, 배당일>

	@Override
	public STATUS call() throws Exception {
		log.trace("{} call({})", Utility.indentStart(), Utility.size(map));
		long started = System.currentTimeMillis();

		STATUS result = main();
		
		log.trace("{} 『#{}』 call() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
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

		CrawlItemDetailSeibroJob job = (CrawlItemDetailSeibroJob) ApplicationContextProvider.getBean(CrawlItemDetailSeibroJob.class);
		job.containsOrModify(code);
		deque.addLast(job);
	}
	private static boolean containsOrModify(ConcurrentLinkedDeque<Job> deque, String code) {
		for (Job job : deque) {
			if (containsOrModify(job, code)) {
				return true;
			}
		}
		return false;
	}

	private static boolean containsOrModify(Job job, String code) {
		if (!(job instanceof CrawlItemDetailSeibroJob)) {
			return false;
		}

		CrawlItemDetailSeibroJob previous = (CrawlItemDetailSeibroJob) job;
		return previous.containsOrModify(code);
	}

	private boolean containsOrModify(String code) {
		if (code == null) {
			return true;
		}

		map.put(code, ZonedDateTime.now());
		return true;
	}

	private STATUS main() throws Exception {
		log.trace("{} main#{})", Utility.indentStart(), Utility.size(map));
		long started = System.currentTimeMillis();

		try {
			double threshold = 4.0 / map.size();
			for (String code : map.keySet()) {
				CrawlItemDetailSeibroCompanyJob.regist(JobService.getQueue3(), code);
				if (Math.random() < threshold) {
					log.debug("{} 『{}/{}』CrawlItemDetailSeibroJob::main() - 『{}』", Utility.indentMiddle(), threshold, map.size(), code);
				}

				log.trace("{} 『{}』 main() - {}", Utility.indentEnd(), STATUS.SUCCESS, Utility.toStringPastTimeReadable(started));
				return STATUS.SUCCESS;
			}
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		log.trace("{} 『{}』 main() - {}", Utility.indentEnd(), STATUS.SUCCESS, Utility.toStringPastTimeReadable(started));
		return STATUS.SUCCESS;
	}

}
