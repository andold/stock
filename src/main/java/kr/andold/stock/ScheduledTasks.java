package kr.andold.stock;

import java.time.LocalDate;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import kr.andold.stock.service.JobService;
import kr.andold.stock.service.JobService.BackupJob;
import kr.andold.stock.service.JobService.DividendAllRecentJob;
import kr.andold.stock.service.JobService.ItemDetailJob;
import kr.andold.stock.service.JobService.ItemDividendJob;
import kr.andold.stock.service.JobService.ItemIpoCloseRecentJob;
import kr.andold.stock.service.JobService.ItemPriceJob;
import kr.andold.stock.service.JobService.PriceLatestJob;
import kr.andold.stock.service.JobService.StockCompileJob;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableScheduling
@ConditionalOnProperty(value = "app.scheduling.enable", havingValue = "true", matchIfMissing = true)
public class ScheduledTasks {
	@Autowired private JobService jobService;

	@Scheduled(initialDelay = 1000 * 30, fixedDelay = Long.MAX_VALUE)
	public void scheduleTaskOnce() {
		log.trace("{} scheduleTaskOnce()", Utility.indentStart());
		long started = System.currentTimeMillis();

		JobService.getQueue3().offer(ItemDetailJob.builder().code(null).build());
		JobService.getQueue3().offer(ItemDividendJob.builder().code(null).build());
		JobService.getQueue3().offer(ItemPriceJob.builder().code(null).build());
		JobService.getQueue3().offer(BackupJob.builder().build());
		jobService.run();

		log.trace("{} scheduleTaskOnce() - {}", Utility.indentEnd(), Utility.toStringPastTimeReadable(started));
	}
	
	// 매분마다 - compile, purge
	@Scheduled(cron = "0 * * * * *")
	public void scheduleTaskMinutely() {
		log.info("{} scheduleTaskMinutely()", Utility.indentStart());
		long started = System.currentTimeMillis();

		jobService.status();

		log.info("{} scheduleTaskMinutely() - {}", Utility.indentEnd(), Utility.toStringPastTimeReadable(started));
	}

	// 매시마다 - compile, purge
	@Scheduled(cron = "19 10 * * * *")
	public void scheduleTaskHourly() {
		log.info("{} scheduleTaskHourly()", Utility.indentStart());
		long started = System.currentTimeMillis();

		JobService.getQueue2().offer(StockCompileJob.builder().build());

		log.info("{} scheduleTaskHourly() - {}", Utility.indentEnd(), Utility.toStringPastTimeReadable(started));
	}

	// 평일 - price, compile
	@Scheduled(cron = "50 40 08 * * MON-SAT")
	public void scheduleTaskDaily() {
		log.info("{} scheduleTaskDaily()", Utility.indentStart());
		long started = System.currentTimeMillis();

		JobService.getQueue2().offer(PriceLatestJob.builder().build());
		JobService.getQueue2().offer(ItemDetailJob.builder().code(null).build());
		JobService.getQueue3().offer(BackupJob.builder().build());

		log.info("{} scheduleTaskDaily() - {}", Utility.indentEnd(), Utility.toStringPastTimeReadable(started));
	}

	// 매주 일요일 - dividend
	@Scheduled(cron = "02 24 3 * * SUN")
	public void scheduleTaskWeekly() {
		log.info("{} scheduleTaskWeekly()", Utility.indentStart());
		long started = System.currentTimeMillis();

		JobService.getQueue2().offer(DividendAllRecentJob.builder().build());
		JobService.getQueue2().offer(ItemIpoCloseRecentJob.builder()
				.date(Date.from(LocalDate.now().minusMonths(12).atStartOfDay().toInstant(Utility.ZONE_OFFSET_KST)))
				.build());
		JobService.getQueue3().offer(BackupJob.builder().build());

		log.info("{} scheduleTaskWeekly() - {}", Utility.indentEnd(), Utility.toStringPastTimeReadable(started));
	}

	// 매분기 첫달 첫번째 일요일 - items
	@Scheduled(cron = "19 17 17 1-7 1,4,7,10 SUN")
	public void scheduleTaskQuarter() {
		log.info("{} scheduleTaskQuarter()", Utility.indentStart());
		long started = System.currentTimeMillis();

//		Result<ParserResult> result = crawlerService.crawlItemAll();

		log.info("{} scheduleTaskQuarter() - {}", Utility.indentEnd(), Utility.toStringPastTimeReadable(started));
	}

}
