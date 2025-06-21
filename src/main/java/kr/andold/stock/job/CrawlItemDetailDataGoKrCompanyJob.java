package kr.andold.stock.job;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
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
public class CrawlItemDetailDataGoKrCompanyJob implements Job {
	// 종목기본정보조회
	public static final String URL = "http://apis.data.go.kr/1160100/service/GetStocIssuInfoService_V2/getItemBasiInfo_V2?resultType=json";

	private static final int NUMBER_OF_ROWS = 1024 * 1;
	private static final int NUMBER_OF_PAGES = 4;

	@Builder.Default @Getter @Setter private Long timeout = 16L;
	@Getter @Setter private String isinCode;
	@Getter @Setter private ZonedDateTime baseDate;

	@Autowired private DataGoKrService service;

	@Override
	public STATUS call() throws Exception {
		log.debug("{} CrawlItemDetailDataGoKrCompanyJob::call(『{}』, 『{}』)", Utility.indentStart(), isinCode, baseDate);
		long started = System.currentTimeMillis();

		CrawlItemDetailDataGoKrCompanyJob that = (CrawlItemDetailDataGoKrCompanyJob) ApplicationContextProvider.getBean(CrawlItemDetailDataGoKrCompanyJob.class);
		that.setIsinCode(isinCode);
		that.setBaseDate(baseDate);
		STATUS result = that.main();

		log.debug("{} 『#{}』 CrawlItemDetailDataGoKrCompanyJob::call(『{}』, 『{}』) - {}", Utility.indentEnd(), result, isinCode, baseDate, Utility.toStringPastTimeReadable(started));
		return result;
	}

	public static void regist(ConcurrentLinkedDeque<Job> deque, String isinCode, ZonedDateTime baseDate) {
		if (containsOrModify(isinCode, baseDate, JobService.getQueue0())) {
			return;
		}
		if (containsOrModify(isinCode, baseDate, JobService.getQueue1())) {
			return;
		}
		if (containsOrModify(isinCode, baseDate, JobService.getQueue2())) {
			return;
		}
		if (containsOrModify(isinCode, baseDate, JobService.getQueue3())) {
			return;
		}

		deque.addLast(CrawlItemDetailDataGoKrCompanyJob.builder().isinCode(isinCode).baseDate(baseDate).build());
	}
	public static void regist(ConcurrentLinkedDeque<Job> deque, String isinCode, Date base) {
		regist(deque, isinCode, ZonedDateTime.ofInstant(base.toInstant(), Utility.ZONE_ID_KST));
	}
	public static void regist(ConcurrentLinkedDeque<Job> deque, String isinCode) {
		regist(deque, isinCode, ZonedDateTime.now().minusWeeks(1));
	}

	private static boolean containsOrModify(String isinCode, ZonedDateTime baseDate, ConcurrentLinkedDeque<Job> deque) {
		for (Job job : deque) {
			if (containsOrModify(isinCode, baseDate, job)) {
				return true;
			}
		}
		return false;
	}

	private static boolean containsOrModify(String isinCode, ZonedDateTime baseDate, Job job) {
		if (!(job instanceof CrawlItemDetailDataGoKrCompanyJob)) {
			return false;
		}

		CrawlItemDetailDataGoKrCompanyJob previous = (CrawlItemDetailDataGoKrCompanyJob) job;
		if (!previous.getIsinCode().equals(isinCode)) {
			return false;
		}

		if (previous.getBaseDate().isAfter(baseDate)) {
			return true;
		}

		previous.setBaseDate(baseDate);
		return true;
	}

	// 종목기본정보조회
	protected STATUS main() {
		log.debug("{} CrawlItemDetailDataGoKrCompanyJob::main(『{}』, 『{}』)", Utility.indentStart(), isinCode, baseDate);
		long started = System.currentTimeMillis();

		try {
			CrudList<ItemDomain> container = CrudList.<ItemDomain>builder().build();
			for (int cx = 0; cx < NUMBER_OF_PAGES; cx++) {
				String url = String.format("%s&serviceKey=%s&numOfRows=%d&pageNo=%d&isinCd=%s&basDt=%s"
						, URL, DataGoKrService.getServiceKey(), NUMBER_OF_ROWS, cx + 1, isinCode, baseDate.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
				log.debug("{} 『{}』 CrawlItemDetailDataGoKrCompanyJob::main(『{}』, 『{}』)- 『{}』", Utility.indentMiddle(), cx, isinCode, baseDate, url);
				String html = service.read(url);
				log.debug("{} CrawlItemDetailDataGoKrCompanyJob::main(『{}』, 『{}』)- 『{}』", Utility.indentMiddle(), isinCode, baseDate, Utility.ellipsis(html, 128, 64));
				ResultDataGoKr.ResultItemDetail result = Utility.parseJsonLine(html, ResultDataGoKr.ResultItemDetail.class);
				List<ResultDataGoKr.ItemDetailDomain> list = result.getResponse().getBody().getItems().getItem();
				if (list == null || list.isEmpty()) {
					break;
				}
				List<ItemDomain> items = new ArrayList<>();
				for (int cy = 0, sizex = list.size(); cy < sizex; cy++) {
					ResultDataGoKr.ItemDetailDomain item = list.get(cy);
					ItemDomain domain = DataGoKrService.toItemDomain(item);
					items.add(domain);
					log.trace("{} CrawlItemDetailDataGoKrCompanyJob::main(『{}』, 『{}』)- 『{}/{}』『{}』", Utility.indentMiddle(), isinCode, baseDate, cy, sizex, item);
				}

				CrudList<ItemDomain> crud = service.putItem(items);
				log.debug("{} CrawlItemDetailDataGoKrCompanyJob::main(『{}』, 『{}』) - 『{}』『{}』", Utility.indentMiddle(), isinCode, baseDate, cx, crud);
				container.add(crud);
			}

			log.debug("{} 『{}』 CrawlItemDetailDataGoKrCompanyJob::main(『{}』, 『{}』) - {}", Utility.indentEnd(), container, isinCode, baseDate, Utility.toStringPastTimeReadable(started));
			return STATUS.SUCCESS;
		} catch (Exception e) {
			log.error("{} Exception:: {}", Utility.indentMiddle(), e.getLocalizedMessage(), e);
		}

		log.debug("{} 『{}』 CrawlItemDetailDataGoKrCompanyJob::main(『{}』, 『{}』) - {}", Utility.indentEnd(), STATUS.EXCEPTION, isinCode, baseDate, Utility.toStringPastTimeReadable(started));
		return STATUS.EXCEPTION;
	}

}
