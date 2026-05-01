package kr.andold.stock.job;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class CrawlItemDetailDataGoKrCompanyJob implements Job {
	@Getter private Long timeout = 600L;	//	TimeUnit.SECONDS
	@Getter private Map<String, ZonedDateTime> map = new HashMap<>();	//	Map<isinCode종목코드, 기준일>

	// 종목기본정보조회
	public static final String URL = "http://apis.data.go.kr/1160100/service/GetStocIssuInfoService_V2/getItemBasiInfo_V2?resultType=json";

	private static final int NUMBER_OF_ROWS = 1024 * 1;
	private static final int NUMBER_OF_PAGES = 4;

	@Autowired private DataGoKrService service;

	@Override
	public STATUS call() throws Exception {
		log.debug("{} CrawlItemDetailDataGoKrCompanyJob::call(『#{}』)", Utility.indentStart(), Utility.size(map));
		long started = System.currentTimeMillis();

		STATUS result = main();

		log.debug("{} 『#{}』 CrawlItemDetailDataGoKrCompanyJob::call(『#{}』) - {}", Utility.indentEnd(), result, Utility.size(map), Utility.toStringPastTimeReadable(started));
		return result;
	}

	public static void regist(ConcurrentLinkedDeque<Job> deque, String isinCode, ZonedDateTime baseDate) {
		if (containsOrModify(JobService.getQueue0(), isinCode, baseDate)) {
			return;
		}
		if (containsOrModify(JobService.getQueue1(), isinCode, baseDate)) {
			return;
		}
		if (containsOrModify(JobService.getQueue2(), isinCode, baseDate)) {
			return;
		}
		if (containsOrModify(JobService.getQueue3(), isinCode, baseDate)) {
			return;
		}

		CrawlItemDetailDataGoKrCompanyJob job = (CrawlItemDetailDataGoKrCompanyJob) ApplicationContextProvider.getBean(CrawlItemDetailDataGoKrCompanyJob.class);
		job.containsOrModify(isinCode, baseDate);
		deque.addLast(job);
	}
	public static void regist(ConcurrentLinkedDeque<Job> deque, String isinCode) {
		regist(deque, isinCode, ZonedDateTime.now().minusWeeks(1));
	}

	private static boolean containsOrModify(ConcurrentLinkedDeque<Job> deque, String isinCode, ZonedDateTime date) {
		for (Job job : deque) {
			if (containsOrModify(job, isinCode, date)) {
				return true;
			}
		}
		return false;
	}

	private static boolean containsOrModify(Job job, String isinCode, ZonedDateTime date) {
		if (!(job instanceof CrawlItemDetailDataGoKrCompanyJob)) {
			return false;
		}

		CrawlItemDetailDataGoKrCompanyJob previous = (CrawlItemDetailDataGoKrCompanyJob) job;
		return previous.containsOrModify(isinCode, date);
	}

	private boolean containsOrModify(String isinCode, ZonedDateTime date) {
		ZonedDateTime datePrevious = map.get(isinCode);
		if (datePrevious == null) {
			map.put(isinCode, date);
			return true;
		}

		if (date.isBefore(datePrevious)) {
			map.put(isinCode, date);
			return true;
		}

		return true;
	}

	// 종목기본정보조회
	protected STATUS main() {
		log.debug("{} CrawlItemDetailDataGoKrCompanyJob::main(『#{}』)", Utility.indentStart(), Utility.size(map));
		long started = System.currentTimeMillis();

		try {
			int size = map.size();
			double threshold = 128.0 / size;
			CrudList<ItemDomain> container = CrudList.<ItemDomain>builder().build();
			for (String isinCode : map.keySet()) {
				if (Math.random() > threshold) {
					continue;
				}

				log.debug("{} 『{}:{}/{}』 CrawlItemDetailDataGoKrCompanyJob::main()", Utility.indentStart(), isinCode, threshold, size);

				ZonedDateTime baseDate = map.get(isinCode);
				List<ItemDomain> items = new ArrayList<>();
				for (int cx = 0; cx < NUMBER_OF_PAGES; cx++) {
					String url = String.format("%s&serviceKey=%s&numOfRows=%d&pageNo=%d&isinCd=%s&basDt=%s"
							, URL, DataGoKrService.getServiceKey(), NUMBER_OF_ROWS, cx + 1, isinCode, baseDate.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
					String html = service.read(url);
					log.trace("{} CrawlItemDetailDataGoKrCompanyJob::main(『{}』, 『{}』) - 『{}』", Utility.indentMiddle(), isinCode, baseDate, Utility.ellipsis(html, 128, 64));
					ResultDataGoKr.ResultItemDetail result = Utility.parseJsonLine(html, ResultDataGoKr.ResultItemDetail.class);
					List<ResultDataGoKr.ItemDetailDomain> list = result.getResponse().getBody().getItems().getItem();
					if (list == null || list.isEmpty()) {
						break;
					}
					for (int cy = 0, sizey = list.size(); cy < sizey; cy++) {
						ResultDataGoKr.ItemDetailDomain item = list.get(cy);
						ItemDomain domain = DataGoKrService.toItemDomain(item);
						items.add(domain);
						log.debug("{} 『{}:{}/{}』CrawlItemDetailDataGoKrCompanyJob::main(#{}) - 『{}』", Utility.indentMiddle()
								, isinCode, cy, sizey, Utility.size(map), item);
					}
				}
				
				CrudList<ItemDomain> crud = service.putItem(items);
				container.add(crud);

				log.debug("{} 『{}:{}/{}』 CrawlItemDetailDataGoKrCompanyJob::main() - 『{}』『{}』", Utility.indentEnd(), isinCode, threshold, size, Utility.size(items), crud);
			}

			log.debug("{} 『{}』 CrawlItemDetailDataGoKrCompanyJob::main(『#{}』) - {}", Utility.indentEnd(), container, Utility.size(map), Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		log.debug("{} 『{}』 CrawlItemDetailDataGoKrCompanyJob::main(『#{}』) - {}", Utility.indentEnd(), STATUS.EXCEPTION, Utility.size(map), Utility.toStringPastTimeReadable(started));
		return STATUS.EXCEPTION;
	}

}
