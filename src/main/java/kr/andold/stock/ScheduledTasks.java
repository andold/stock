package kr.andold.stock;

import java.time.LocalDate;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import kr.andold.stock.crawler.CrawlerService;
import kr.andold.stock.crawler.IdempotentService;
import kr.andold.stock.domain.Result;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.stock.service.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableScheduling
@ConditionalOnProperty(value = "app.scheduling.enable", havingValue = "true", matchIfMissing = true)
public class ScheduledTasks {
	@Autowired
	private CrawlerService crawlerService;

	@Autowired
	private IdempotentService idempotentService;

	@Scheduled(initialDelay = 1000 * 30, fixedDelay = Long.MAX_VALUE)
	public void scheduleTaskOnce() {
		log.trace("{} scheduleTaskOnce()", Utility.indentStart());
		long started = System.currentTimeMillis();

		idempotentService.once();

		log.trace("{} scheduleTaskOnce() - {}", Utility.indentEnd(), Utility.toStringPastTimeReadable(started));
	}
	
	// 매분마다
	@Scheduled(cron = "15 * * * * *")
	public void scheduleTaskMinutely() {
		log.trace("{} scheduleTaskMinutely()", Utility.indentStart());
		long started = System.currentTimeMillis();

//		idempotentService.run();

		log.trace("{} {} scheduleTaskMinutely() - {}", Utility.indentEnd(), "비동기", Utility.toStringPastTimeReadable(started));
	}

	// 매시마다
	@Scheduled(cron = "15 30 8-16 * * *")
	public void scheduleTaskHourly() {
	}

	// 평일
	@Scheduled(cron = "50 40 22 * * MON-FRI")
	public void scheduleTaskDaily() {
		crawlerService.crawlPrice(Date.from(LocalDate.now().atStartOfDay().toInstant(Utility.ZONE_OFFSET_KST)));
	}

	// 매주 일요일
	@Scheduled(cron = "02 24 23 * * SUN")
	public void scheduleTaskWeekly() {
		log.info("{} scheduleTaskWeekly()", Utility.indentStart());
		long started = System.currentTimeMillis();

		Result<ParserResult> result = crawlerService.crawlDividendAllRecent();

		log.info("{} {} scheduleTaskWeekly() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
	}

	// 매월 1일
	@Scheduled(cron = "15 30 23 1 * *")
	public void scheduleTaskMonthly() {
		crawlerService.crawlItemDetailEtf();			//	ETF 상세
		crawlerService.crawlItemDetailCompany();		//	기업주식 상세
	}

	// 매분기 첫달 첫번째 일요일
	@Scheduled(cron = "19 17 17 1-7 1,4,7,10 SUN")
	public void scheduleTaskQuarter() {
		log.info("{} scheduleTaskQuarter()", Utility.indentStart());
		long started = System.currentTimeMillis();

		Result<ParserResult> result = crawlerService.crawlItemAll();

		log.info("{} {} scheduleTaskQuarter() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
	}

	// 매년 1월 7일
	@Scheduled(cron = "15 30 3 7 1 *")
	public void scheduleTaskYearly() {
	}

}
