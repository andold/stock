package kr.andold.stock.job;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.andold.stock.ApplicationContextProvider;
import kr.andold.stock.domain.ItemDomain;
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
public class CrawlItemLatestDataGoKrCompanyJob implements Job {
	// KRX에 상장된 종목에 대한 정보조회
	public static final String URL = "https://apis.data.go.kr/1160100/service/GetKrxListedInfoService/getItemInfo?resultType=json";

	private static final int NUMBER_OF_ROWS = 1024 * 8;
	private static final int NUMBER_OF_PAGES = 16;

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
		log.debug("{} CrawlItemLatestDataGoKrCompanyJob::call(『{}』)", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		CrawlItemLatestDataGoKrCompanyJob that = (CrawlItemLatestDataGoKrCompanyJob) ApplicationContextProvider.getBean(CrawlItemLatestDataGoKrCompanyJob.class);
		that.setStart(start);
		STATUS result = that.main();

		log.debug("{} 『#{}』 CrawlItemLatestDataGoKrCompanyJob::call() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
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

		deque.addLast(CrawlItemLatestDataGoKrCompanyJob.builder().start(date).build());
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
		if (!(job instanceof CrawlItemLatestDataGoKrCompanyJob)) {
			return false;
		}

		CrawlItemLatestDataGoKrCompanyJob previous = (CrawlItemLatestDataGoKrCompanyJob) job;
		if (previous.getStart().isBefore(date)) {
			return true;
		}
		
		previous.setStart(date);
		return true;
	}

	// KRX에 상장된 종목에 대한 정보조회
	protected STATUS main() {
		log.debug("{} CrawlItemLatestDataGoKrCompanyJob::main(『{}』)", Utility.indentStart(), start);
		long started = System.currentTimeMillis();

		try {
			CrudList<ItemDomain> container = CrudList.<ItemDomain>builder().build();
			for (int cx = 0; cx < NUMBER_OF_PAGES; cx++) {
				String url = String.format("%s&serviceKey=%s&numOfRows=%d&pageNo=%d&beginBasDt=%s", URL, DataGoKrService.getServiceKey(), NUMBER_OF_ROWS, cx + 1, start.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
				log.debug("{} 『{}』 CrawlItemLatestDataGoKrCompanyJob::main(『{}』)- 『{}』", Utility.indentMiddle(), cx, start, url);
				String html = service.read(url);
				log.debug("{} CrawlItemLatestDataGoKrCompanyJob::main(『{}』)- 『{}』", Utility.indentMiddle(), start, Utility.ellipsis(html, 128, 64));
				ResultDataGoKr.ResultItem result = Utility.parseJsonLine(html, ResultDataGoKr.ResultItem.class);
				List<ResultDataGoKr.ItemDomain> list = result.getResponse().getBody().getItems().getItem();
				if (list == null || list.isEmpty()) {
					break;
				}
				List<ItemDomain> items = new ArrayList<>();
				for (int cy = 0, sizex = list.size(); cy < sizex; cy++) {
					ResultDataGoKr.ItemDomain item = list.get(cy);
					ItemDomain domain = DataGoKrService.toItemDomain(item);
					items.add(domain);
					log.trace("{} CrawlItemLatestDataGoKrCompanyJob::main(『{}』)- 『{}/{}』『{}』", Utility.indentMiddle(), start, cy, sizex, item);
				}

				CrudList<ItemDomain> crud = service.putItem(items);
				log.debug("{} CrawlItemLatestDataGoKrCompanyJob::main() - 『{}』『{}』", Utility.indentMiddle(), cx, crud);
				container.add(crud);
			}

			log.debug("{} 『{}』 CrawlItemLatestDataGoKrCompanyJob::main() - {}", Utility.indentEnd(), container, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		log.debug("{} 『{}』 CrawlItemLatestDataGoKrCompanyJob::main() - {}", Utility.indentEnd(), STATUS.EXCEPTION, Utility.toStringPastTimeReadable(started));
		return STATUS.EXCEPTION;
	}

}
