package kr.andold.stock;

import java.time.LocalDate;
import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import kr.andold.stock.crawler.CrawlerService;
import kr.andold.stock.crawler.IdempotentService;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.stock.service.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableScheduling
@ConditionalOnProperty(value = "app.scheduling.enable", havingValue = "true", matchIfMissing = true)
public class ScheduledTasks {
	@Autowired
	private CrawlerService stockCrawlerService;

	@Autowired
	private IdempotentService idempotentService;

	// 매시마다
	@Scheduled(cron = "15 * * * * *")
	public void scheduleTaskMinutely() {
		log.info("{} scheduleTaskMinutely()", Utility.indentStart());
		long started = System.currentTimeMillis();

		try {
			Future<ParserResult> future = idempotentService.run();
			ParserResult result = future.get();
			log.info("{} {} scheduleTaskMinutely() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
		} catch (InterruptedException | ExecutionException e) {
		}

		log.info("{} {} scheduleTaskMinutely() - {}", Utility.indentEnd(), "비동기 실행 실패", Utility.toStringPastTimeReadable(started));
	}

	// 매시마다
	@Scheduled(cron = "15 30 8-16 * * *")
	public void scheduleTaskHourly() {
	}

	// 평일
	@Scheduled(cron = "15 30 22 * * MON-FRI")
	public void scheduleTaskDaily() {
		Date start = Date.from(LocalDate.now().minusMonths(1).atStartOfDay().toInstant(Utility.ZONE_OFFSET_KST));
		stockCrawlerService.crawlPrice(start);
	}

	// 매주 일요일
	@Scheduled(cron = "15 30 3 * * SUN")
	public void scheduleTaskWeekly() {
		// 3주전꺼부터 수집
		Date start = Date.from(LocalDate.now().minusWeeks(3).atStartOfDay().toInstant(Utility.ZONE_OFFSET_KST));
		stockCrawlerService.crawlDividendHistoryEtf(start);		//	ETF 배당 이력
		stockCrawlerService.crawlDividendHistoryCompany(start);	//	기업주식 배당 이력
	}

	// 매월 1일
	@Scheduled(cron = "15 30 23 1 * *")
	public void scheduleTaskMonthly() {
		stockCrawlerService.crawlItemDividendTopCompany();	// 기업 배당 상위
		stockCrawlerService.crawlItemDetailEtf();			//	ETF 상세
		stockCrawlerService.crawlItemDetailCompany();		//	기업주식 상세
	}

	// 매분기 첫달 8일
	@Scheduled(cron = "15 30 20 8 1,4,7,10 *")
	public void scheduleTaskQuarter() {
	}

	// 매년 1월 7일
	@Scheduled(cron = "15 30 3 7 1 *")
	public void scheduleTaskYearly() {
	}

}
