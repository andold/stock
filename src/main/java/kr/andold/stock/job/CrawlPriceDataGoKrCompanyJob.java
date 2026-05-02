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
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

// 주식 시세 수집, 회사
@Slf4j
@Service
public class CrawlPriceDataGoKrCompanyJob implements Job {
	@Getter private Long timeout = 600L;
	@Getter private Map<String, ZonedDateTime> map = new HashMap<>();	//	Map<종목코드, 배당일>
	@Autowired private DataGoKrService dataGoKrService;

	@Override
	public STATUS call() throws Exception {
		log.debug("{} 주식시세수집회사::CrawlPriceDataGoKrCompanyJob::call(#{})", Utility.indentStart(), map.size());
		long started = System.currentTimeMillis();

		STATUS result = main();

		log.debug("{} 『#{}』 주식시세수집회사::CrawlPriceDataGoKrCompanyJob::call(#{}) - {}", Utility.indentEnd(), result, map.size(), Utility.toStringPastTimeReadable(started));
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

		CrawlPriceDataGoKrCompanyJob job = (CrawlPriceDataGoKrCompanyJob) ApplicationContextProvider.getBean(CrawlPriceDataGoKrCompanyJob.class);
		job.containsOrModify(code, zdt);
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
		log.debug("{} 주식시세수집회사::CrawlPriceDataGoKrCompanyJob::main(#{})", Utility.indentStart(), map.size());
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
				if(crud.getCreates().isEmpty() && crud.getUpdates().isEmpty() && crud.getRemoves().isEmpty()) {
					//	배당수익율계산작업 => 배당일의 주가없음 => 주가수집 => 주가변화없음::배당일이상검사
					CleanDividendJob.regist(JobService.getQueue3(), code, null);
				}
				log.debug("{} 『{}/{}』 주식시세수집회사::CrawlPriceDataGoKrCompanyJob::main(#{}) - 『{}』『{}』『#{}』『{}』", Utility.indentMiddle()
						, size, threshold, map.size(), code, map.get(code), Utility.size(prices), crud);
			}

			log.debug("{} 『{}』 주식시세수집회사::CrawlPriceDataGoKrCompanyJob::main(#{}) - {}", Utility.indentEnd(), STATUS.SUCCESS, map.size(), Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		log.debug("{} 『{}』 주식시세수집회사::CrawlPriceDataGoKrCompanyJob::main(#{}) - {}", Utility.indentEnd(), STATUS.EXCEPTION, map.size(), Utility.toStringPastTimeReadable(started));
		return STATUS.EXCEPTION;
	}

}
