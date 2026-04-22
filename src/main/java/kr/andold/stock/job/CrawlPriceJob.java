package kr.andold.stock.job;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.ApplicationContextProvider;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.ItemService;
import kr.andold.stock.service.JobService;
import kr.andold.stock.service.JobService.Job;
import kr.andold.stock.service.Utility;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

//	주식시세 수집
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@Service
public class CrawlPriceJob implements Job {
	@Builder.Default @Getter @Setter private Long timeout = 60L;
	@Builder.Default @Getter @Setter private Map<String, ZonedDateTime> map = new HashMap<>();	//	Map<종목코드, 배당일>
	@Autowired private ItemService itemService;

	@Override
	public STATUS call() throws Exception {
		log.debug("{} CrawlPriceJob::call()", Utility.indentStart());
		long started = System.currentTimeMillis();

		CrawlPriceJob that = (CrawlPriceJob) ApplicationContextProvider.getBean(CrawlPriceJob.class);
		that.setMap(map);
		STATUS result = that.main();

		log.debug("{} 『#{}』 CrawlPriceJob::call() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	public static void regist(ConcurrentLinkedDeque<Job> deque, String code, Date date, int daysago) {
		ZonedDateTime zdt = (date == null) ? ZonedDateTime.of(2000, 1, 1, 0, 0, 0, 0, Utility.ZONE_ID_KST) : date.toInstant().atZone(Utility.ZONE_ID_KST).minusDays(daysago);
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

		CrawlPriceJob job = CrawlPriceJob.builder().build();
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
		if (!(job instanceof CrawlPriceJob)) {
			return false;
		}

		CrawlPriceJob previous = (CrawlPriceJob) job;
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
		log.debug("{} CrawlPriceJob::main()", Utility.indentStart());
		long started = System.currentTimeMillis();

		try {
			double threshold = 8.0 / map.size();
			for (String code : map.keySet()) {
				ZonedDateTime zdt = map.get(code);
				ItemDomain item = itemService.read(code);
				if (item == null) {
					log.debug("{} 『NULL::ITEM』 CrawlPriceJob::main() - 『{}』『{}』『{}』", Utility.indentMiddle(), code, zdt, item);
					continue;
				}

				Date ipoClose = item.getIpoClose();
				if (ipoClose != null) {
					log.debug("{} 『상장폐지::{}』 CrawlPriceJob::main() - 『{}』『{}』『{}』", Utility.indentMiddle(), ipoClose, code, zdt, item);
					continue;
				}

				String type = item.getType();
				if (type == null) {
					log.debug("{} 『NULL::TYPE』 CrawlPriceJob::main() - 『{}』『{}』『{}』", Utility.indentMiddle(), code, zdt, item);
					continue;
				}

				switch (type) {
				case "KOSPI", "KOSDAQ":
				case "KONEX", "코넥스":
					CrawlPriceDataGoKrCompanyJob.regist(JobService.getQueue3(), code, zdt);
					if (Math.random() < threshold) {
						log.debug("{} 『{}』 CrawlPriceJob::main() - 『{}』『{}』『{}』『{}』", Utility.indentMiddle(), type, code, zdt, item, type);
					}
					break;

				case "ETF":
//					CrawlPriceSeibroEtfJob.regist(JobService.getQueue3(), code, zdt);
					CrawlPriceDataGoKrEtfJob.regist(JobService.getQueue3(), code, zdt);
					if (Math.random() < threshold) {
						log.debug("{} 『ETF』 CrawlPriceJob::main() - 『{}』『{}』『{}』『{}』", Utility.indentMiddle(), code, zdt, item, type);
					}
					break;

				case "K-OTC", "기타비상장":
				default:
					break;
				}
			}

			log.debug("{} 『{}』 CrawlPriceJob::main() - {}", Utility.indentEnd(), STATUS.SUCCESS, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		log.debug("{} 『{}』 CrawlPriceJob::main() - {}", Utility.indentEnd(), STATUS.EXCEPTION, Utility.toStringPastTimeReadable(started));
		return STATUS.EXCEPTION;
	}

}
