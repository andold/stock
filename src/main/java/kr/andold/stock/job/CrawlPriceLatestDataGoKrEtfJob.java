package kr.andold.stock.job;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.ApplicationContextProvider;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.domain.ResultDataGoKr;
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
	//	주가 ETF
	private static final String URL = DataGoKrService.URL_GET_ETF_PRICE_INFO;
	private static final int NUMBER_OF_ROWS = 1024 * 8;
	private static final int NUMBER_OF_PAGES = 4;

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
			CrudList<PriceDomain> container = CrudList.<PriceDomain>builder().build();
			for (int cx = 0; cx < NUMBER_OF_PAGES; cx++) {
				String url = String.format("%s&serviceKey=%s&numOfRows=%d&pageNo=%d&beginBasDt=%s", URL, DataGoKrService.getServiceKey(), NUMBER_OF_ROWS, cx + 1, start.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
				log.debug("{} 『{}/{}』최근주가ETF::main(『{}』) - 『{}』", Utility.indentMiddle(), cx, NUMBER_OF_PAGES, start, url);

				String html = service.read(url);
				log.debug("{} 『{}/{}』최근주가ETF::main(『{}』) - 『{}』", Utility.indentMiddle(), cx, NUMBER_OF_PAGES, start, Utility.ellipsis(html, 128, 32));
				ResultDataGoKr.ResultPriceEtf result = Utility.parseJsonLine(html, ResultDataGoKr.ResultPriceEtf.class);
				if (result == null) {
					log.debug("{} 『NULL_RESULT:{}/{}』최근주가ETF::main(『{}』)", Utility.indentMiddle(), cx, NUMBER_OF_PAGES, start);
					break;
				}

				List<ResultDataGoKr.PriceEtfDomain> list = result.getResponse().getBody().getItems().getItem();
				if (list == null || list.isEmpty()) {
					log.debug("{} 『EMPTY:{}/{}』최근주가ETF::main(『{}』)", Utility.indentMiddle(), cx, NUMBER_OF_PAGES, start);
					break;
				}
				List<PriceDomain> prices = new ArrayList<>();
				for (int cy = 0, sizey = list.size(); cy < sizey; cy++) {
					ResultDataGoKr.PriceEtfDomain item = list.get(cy);
					PriceDomain price = DataGoKrService.toPriceDomain(item);
					prices.add(price);
					if (Utility.samples(cy, sizey, 6)) {
						log.debug("{} 『{}/{}:{}/{}:{}』최근주가ETF::main(『{}』)", Utility.indentMiddle(), cy, sizey, cx, NUMBER_OF_PAGES, item, start);
					}
				}

				CrudList<PriceDomain> crud = service.putPrice(prices);
				log.debug("{} 『{}/{}:{}』최근주가ETF::main(『{}』)", Utility.indentMiddle(), cx, NUMBER_OF_PAGES, crud, start);
				container.add(crud);
			}
			
			if (container.isEmpty()) {
				CrawlPriceLatestSeibroEtfJob.regist(JobService.getQueue3());
				log.debug("{} 『EMPTY_CONTAINER』최근주가ETF::main(『{}』)", Utility.indentMiddle(), start);
			}

			log.debug("{} 『{}』 최근주가ETF::main() - {}", Utility.indentEnd(), container, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		log.debug("{} 『{}』 최근주가ETF::main() - {}", Utility.indentEnd(), STATUS.EXCEPTION, Utility.toStringPastTimeReadable(started));
		return STATUS.EXCEPTION;
	}

}
