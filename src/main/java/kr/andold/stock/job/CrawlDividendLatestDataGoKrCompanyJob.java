package kr.andold.stock.job;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.ApplicationContextProvider;
import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ResultDataGoKr;
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

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@Service
public class CrawlDividendLatestDataGoKrCompanyJob implements Job {
	// 배당정보조회
	public static final String URL = "http://apis.data.go.kr/1160100/service/GetStocDiviInfoService/getDiviInfo?resultType=json";

	private static final int NUMBER_OF_ROWS = 1024 * 8;
	private static final int NUMBER_OF_PAGES = 16;

	@Builder.Default
	@Getter
	@Setter
	private Long timeout = 600L;

	@Autowired
	private DataGoKrService service;

	@Override
	public STATUS call() throws Exception {
		log.debug("{} CrawlDividendLatestDataGoKrCompanyJob::call()", Utility.indentStart());
		long started = System.currentTimeMillis();

		CrawlDividendLatestDataGoKrCompanyJob that = (CrawlDividendLatestDataGoKrCompanyJob) ApplicationContextProvider.getBean(CrawlDividendLatestDataGoKrCompanyJob.class);
		STATUS result = that.main();

		log.debug("{} 『#{}』 CrawlDividendLatestDataGoKrCompanyJob::call() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		return result;
	}

	public static void regist(ConcurrentLinkedDeque<Job> deque) {
		if (containsOrModify(JobService.getQueue0())) {
			return;
		}
		if (containsOrModify(JobService.getQueue1())) {
			return;
		}
		if (containsOrModify(JobService.getQueue2())) {
			return;
		}
		if (containsOrModify(JobService.getQueue3())) {
			return;
		}

		deque.addLast(CrawlDividendLatestDataGoKrCompanyJob.builder().build());
	}

	private static boolean containsOrModify(ConcurrentLinkedDeque<Job> deque) {
		for (Job job : deque) {
			if (containsOrModify(job)) {
				return true;
			}
		}
		return false;
	}

	private static boolean containsOrModify(Job job) {
		if (!(job instanceof CrawlDividendLatestDataGoKrCompanyJob)) {
			return false;
		}

		return true;
	}

	// 배당정보조회
	protected STATUS main() {
		log.debug("{} CrawlDividendLatestDataGoKrCompanyJob::main(『{}』)", Utility.indentStart());
		long started = System.currentTimeMillis();

		try {
			CrudList<DividendHistoryDomain> container = CrudList.<DividendHistoryDomain>builder().build();
			for (int cx = 0; cx < NUMBER_OF_PAGES; cx++) {
				String url = String.format("%s&serviceKey=%s&numOfRows=%d&pageNo=%d", URL, DataGoKrService.getServiceKey(), NUMBER_OF_ROWS, cx + 1);
				log.debug("{} CrawlDividendLatestDataGoKrCompanyJob::main()- 『{}』", Utility.indentMiddle(), url);
				String html = service.read(url);
				log.debug("{} CrawlDividendLatestDataGoKrCompanyJob::main()- 『{}』", Utility.indentMiddle(), Utility.ellipsis(html, 128, 64));
				ResultDataGoKr.ResultDividend result = Utility.parseJsonLine(html, ResultDataGoKr.ResultDividend.class);
				List<ResultDataGoKr.DividendDomain> list = result.getResponse().getBody().getItems().getItem();
				if (list == null || list.isEmpty()) {
					break;
				}
				List<DividendHistoryDomain> domains = new ArrayList<>();
				for (int cy = 0, sizex = list.size(); cy < sizex; cy++) {
					ResultDataGoKr.DividendDomain item = list.get(cy);
					DividendHistoryDomain domain = DataGoKrService.toDividendHistoryDomain(item);
					domains.add(domain);
					log.trace("{} CrawlDividendLatestDataGoKrCompanyJob::main()- 『{}/{}』『{}』", Utility.indentMiddle(), cy, sizex, item);
				}

				CrudList<DividendHistoryDomain> crud = service.putDividendHistoryDomain(domains);
				log.debug("{} CrawlDividendLatestDataGoKrCompanyJob::main() - 『{}』『{}』", Utility.indentMiddle(), cx, crud);
				container.add(crud);
			}

			log.debug("{} 『{}』 CrawlDividendLatestDataGoKrCompanyJob::main() - {}", Utility.indentEnd(), container, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		log.debug("{} 『{}』 CrawlDividendLatestDataGoKrCompanyJob::main() - {}", Utility.indentEnd(), STATUS.EXCEPTION, Utility.toStringPastTimeReadable(started));
		return STATUS.EXCEPTION;
	}

}
