package kr.andold.stock;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.job.*;
import kr.andold.stock.service.ItemDetailJob;
import kr.andold.stock.service.ItemDividendJob;
import kr.andold.stock.service.JobService;
import kr.andold.stock.service.JobService.BackupJob;
import kr.andold.stock.service.JobService.DeduplicatePriceJob;
import kr.andold.stock.service.JobService.ItemIpoCloseRecentJob;
import kr.andold.stock.service.JobService.ItemPriceJob;
import kr.andold.stock.service.JobService.StockCompileJob;
import kr.andold.stock.service.ZookeeperClient;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableScheduling
public class ScheduledTasks {

    private final CrawlPriceLatestDataGoKrEtfJob crawlPriceLatestDataGoKrEtfJob;
	@Autowired private JobService jobService;
	@Autowired private ZookeeperClient zookeeperClient;

    ScheduledTasks(CrawlPriceLatestDataGoKrEtfJob crawlPriceLatestDataGoKrEtfJob) {
        this.crawlPriceLatestDataGoKrEtfJob = crawlPriceLatestDataGoKrEtfJob;
    }

	@Scheduled(initialDelay = 1000 * 8, fixedDelay = Long.MAX_VALUE)
	public void once() {
		log.info("{} once()", Utility.indentStart());
		long started = System.currentTimeMillis();

		zookeeperClient.run();
		Utility.sleep(1000 * 32);
		if (zookeeperClient.isMaster()) {
			JobService.getQueue3().offer(ItemDetailJob.builder().code(null).build());
			JobService.getQueue3().offer(ItemDividendJob.builder().code(null).build());
			JobService.getQueue3().offer(ItemPriceJob.builder().code(null).build());
			JobService.getQueue3().offer(BackupJob.builder().build());
			JobService.getQueue3().offer(DeduplicatePriceJob.builder().build());
		}

		log.info("{} once() - {}", Utility.indentEnd(), Utility.toStringPastTimeReadable(started));
	}
	
	// 1초쉬고
	@Scheduled(initialDelay = 1000 * 16, fixedDelay = 1000)
	public void secondly() {
		log.trace("{} secondly()", Utility.indentStart());
		long started = System.currentTimeMillis();

		STATUS result = jobService.run();

		log.trace("{} 『{}』 secondly() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
	}

	// 매분마다 - compile, purge
	@Scheduled(cron = "0 * * * * *")
	public void minutely() {
		log.debug("{} minutely()", Utility.indentStart());
		long started = System.currentTimeMillis();

		jobService.status(zookeeperClient.status(true));

		log.debug("{} minutely() - {}", Utility.indentEnd(), Utility.toStringPastTimeReadable(started));
	}

	// 매시마다 - compile, purge
	@Scheduled(cron = "0 0 * * * *")
	public void hourly() {
		log.info("{} hourly()", Utility.indentStart());
		long started = System.currentTimeMillis();

		log.info("{} hourly() - {}", Utility.indentEnd(), Utility.toStringPastTimeReadable(started));
	}

	// 평일 - price, compile
	@Scheduled(cron = "0 0 10 * * MON-SAT")
	public void daily() {
		log.info("{} daily()", Utility.indentStart());
		long started = System.currentTimeMillis();

		if (zookeeperClient.isMaster()) {
			ZonedDateTime oneWeekAgo = ZonedDateTime.now().minusWeeks(1);
			JobService.getQueue2().addLast(CrawlPriceLatestSeibroCompanyExcelJob.builder().build());
//			JobService.getQueue2().addLast(CrawlPriceLatestSeibroEtfJob.builder().build());
			JobService.getQueue2().addLast(CrawlPriceLatestDataGoKrEtfJob.builder().start(oneWeekAgo).build());
			JobService.getQueue2().offer(ItemDetailJob.builder().code(null).build());
			JobService.getQueue3().offer(BackupJob.builder().build());
			JobService.getQueue3().offer(DeduplicatePriceJob.builder().build());
		}

		log.info("{} daily() - {}", Utility.indentEnd(), Utility.toStringPastTimeReadable(started));
	}

	// 매주 일요일 - dividend
	@Scheduled(cron = "0 0 0 * * SUN")
	public void weekly() {
		log.info("{} weekly()", Utility.indentStart());
		long started = System.currentTimeMillis();

		if (zookeeperClient.isMaster()) {
			ZonedDateTime sixMonthAgo = ZonedDateTime.now().minusMonths(6);
			JobService.getQueue2().addLast(CrawlDividendSeibroCompanyExcelJob.builder().start(sixMonthAgo).build());
			JobService.getQueue2().addLast(CrawlDividendSeibroEtfJob.builder().start(sixMonthAgo).build());
//			JobService.getQueue2().offer(DividendAllRecentJob.builder().build());
			JobService.getQueue2().offer(ItemIpoCloseRecentJob.builder()
					.date(Date.from(LocalDate.now().minusMonths(12).atStartOfDay().toInstant(Utility.ZONE_OFFSET_KST)))
					.build());
			JobService.getQueue3().offer(BackupJob.builder().build());
			JobService.getQueue3().offer(DeduplicatePriceJob.builder().build());
			JobService.getQueue3().offer(StockCompileJob.builder().start(LocalDate.now().minusWeeks(2)).build());
		}

		log.info("{} weekly() - {}", Utility.indentEnd(), Utility.toStringPastTimeReadable(started));
	}

	// 매달
	@Scheduled(cron = "0 0 0 1 * *")
	public void monthly() {
		log.info("{} monthly()", Utility.indentStart());

		if (zookeeperClient.isMaster()) {
			JobService.getQueue3().offer(StockCompileJob.builder().start(LocalDate.now().minusMonths(2)).build());
		}

		log.info("{} monthly()", Utility.indentEnd());
	}

	// 매분기 첫달 첫번째 일요일 - items
	@Scheduled(cron = "0 0 0 1-7 1,4,7,10 SUN")
	public void quarterly() {
		log.info("{} quarterly()", Utility.indentStart());
		long started = System.currentTimeMillis();

		if (zookeeperClient.isMaster()) {
//			Result<ParserResult> result = crawlerService.crawlItemAll();
		}

		log.info("{} quarterly() - {}", Utility.indentEnd(), Utility.toStringPastTimeReadable(started));
	}

	// 매년
	@Scheduled(cron = "0 0 0 1 1 *")
	public void yearly() {
		log.info("{} yearly()", Utility.indentStart());

		if (zookeeperClient.isMaster()) {
			JobService.getQueue3().offer(StockCompileJob.builder().start(LocalDate.now().minusYears(2)).build());
		}

		log.info("{} yearly()", Utility.indentEnd());
	}

}
