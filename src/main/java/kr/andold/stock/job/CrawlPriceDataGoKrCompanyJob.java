package kr.andold.stock.job;

import java.time.ZonedDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.ApplicationContextProvider;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.DataGoKrService;
import kr.andold.stock.service.JobService;
import kr.andold.stock.service.PriceService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.JobService.Job;
import kr.andold.utils.persist.CrudList;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

// 주식 시세 수집, 회사
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@Service
public class CrawlPriceDataGoKrCompanyJob implements Job {
	@Builder.Default @Getter @Setter private Long timeout = 600L;
	@Builder.Default @Getter @Setter private Map<String, ZonedDateTime> map = new HashMap<>();	//	Map<종목코드, 배당일>
	@Autowired private DataGoKrService dataGoKrService;

	@Override
	public STATUS call() throws Exception {
		log.debug("{} 주식시세수집회사::CrawlPriceDataGoKrCompanyJob::call()", Utility.indentStart());
		long started = System.currentTimeMillis();

		CrawlPriceDataGoKrCompanyJob that = (CrawlPriceDataGoKrCompanyJob) ApplicationContextProvider.getBean(CrawlPriceDataGoKrCompanyJob.class);
		that.setMap(map);
		STATUS result = that.main();

		log.debug("{} 『#{}』 주식시세수집회사::CrawlPriceDataGoKrCompanyJob::call() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	public static void regist(ConcurrentLinkedDeque<Job> deque, String code, ZonedDateTime zdt) {
		if (zdt == null || zdt.isBefore(PriceService.PRICE_BASE_DATE_START)) {
			zdt = PriceService.PRICE_BASE_DATE_START;
		}

		if (containsOrModify(JobService.getQueue0(), code, zdt)) {
			return;
		}
		if (containsOrModify(JobService.getQueue1(), code, zdt)) {
			return;
		}
		if (containsOrModify(JobService.getQueue2(), code, zdt)) {
			return;
		}
		if (containsOrModify(JobService.getQueue3(), code, zdt)) {
			return;
		}

		CrawlPriceDataGoKrCompanyJob job = CrawlPriceDataGoKrCompanyJob.builder().build();
		job.getMap().put(code, zdt);
		deque.addLast(job);
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
		if (!(job instanceof CrawlPriceDataGoKrCompanyJob)) {
			return false;
		}

		CrawlPriceDataGoKrCompanyJob previous = (CrawlPriceDataGoKrCompanyJob) job;
		return previous.containsOrModify(code, date);
	}

	private boolean containsOrModify(String code, ZonedDateTime date) {
		ZonedDateTime datePrevious = map.get(code);
		if (datePrevious == null) {
			map.put(code, date);
			return true;
		}

		if (date.isBefore(datePrevious)) {
			map.put(code, date);
			return true;
		}

		return true;
	}

	// 주식시세
	protected STATUS main() {
		log.debug("{} 주식시세수집회사::CrawlPriceDataGoKrCompanyJob::main()", Utility.indentStart());
		long started = System.currentTimeMillis();

		try {
			int size = map.size();
			double threshold = 128.0 / size;
			for (String code : map.keySet()) {
				if (Math.random() > threshold) {
					continue;
				}
				
				ZonedDateTime zdt = map.get(code);
				List<PriceDomain> prices = dataGoKrService.getStockPriceInfo(code, zdt);
				CrudList<PriceDomain> crud = dataGoKrService.putPrice(prices);
				log.debug("{} 『{}/{}』 주식시세수집회사::CrawlPriceDataGoKrCompanyJob::main() - 『{}』『{}』『#{}』『{}』", Utility.indentMiddle()
						, size, threshold, code, map.get(code), Utility.size(prices), crud);
			}

			log.debug("{} 『{}』 주식시세수집회사::CrawlPriceDataGoKrCompanyJob::main() - {}", Utility.indentEnd(), STATUS.SUCCESS, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		log.debug("{} 『{}』 주식시세수집회사::CrawlPriceDataGoKrCompanyJob::main() - {}", Utility.indentEnd(), STATUS.EXCEPTION, Utility.toStringPastTimeReadable(started));
		return STATUS.EXCEPTION;
	}

}
