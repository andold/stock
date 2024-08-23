package kr.andold.stock;

import java.time.LocalDate;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import jakarta.annotation.PostConstruct;
import kr.andold.stock.crawler.CrawlerService;
import kr.andold.stock.crawler.IdempotentService;
import kr.andold.stock.domain.Result;
import kr.andold.stock.service.JobService;
import kr.andold.stock.service.JobService.ItemDetailJob;
import kr.andold.stock.service.JobService.PriceLatestJob;
import kr.andold.stock.service.JobService.StockCompileJob;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableScheduling
@ConditionalOnProperty(value = "app.scheduling.enable", havingValue = "true", matchIfMissing = true)
public class ScheduledTasks {
	@Autowired private CrawlerService crawlerService;
	@Autowired private IdempotentService idempotentService;
	@Autowired private JobService jobService;

	private static JobService staticJobService;
	@PostConstruct
	public void postConstruct() {
		staticJobService = jobService;
	}

	@Scheduled(initialDelay = 1000 * 30, fixedDelay = Long.MAX_VALUE)
	public void scheduleTaskOnce() {
		log.trace("{} scheduleTaskOnce()", Utility.indentStart());
		long started = System.currentTimeMillis();

		idempotentService.once();
		staticJobService.run();

		log.trace("{} scheduleTaskOnce() - {}", Utility.indentEnd(), Utility.toStringPastTimeReadable(started));
	}
	
	// 매시마다 - compile, purge
	@Scheduled(cron = "19 10 * * * *")
	public void scheduleTaskHourly() {
		log.info("{} scheduleTaskHourly()", Utility.indentStart());
		long started = System.currentTimeMillis();

//		List<ItemDomain> compileResult = stockService.compile();
//		int purged = priceService.purge();
//		log.info("{} 『#{} #{}』 scheduleTaskHourly() - {}", Utility.indentMiddle(), Utility.size(compileResult), purged, Utility.toStringPastTimeReadable(started));
		
		JobService.getQueue3().push(StockCompileJob.builder().build());

		log.info("{} scheduleTaskHourly() - {}", Utility.indentEnd(), Utility.toStringPastTimeReadable(started));
	}

	// 평일 - price, compile
	@Scheduled(cron = "50 40 08 * * MON-SAT")
	public void scheduleTaskDaily() {
		log.info("{} scheduleTaskDaily()", Utility.indentStart());
		long started = System.currentTimeMillis();

//		Result<ParserResult> crawlPriceResult = crawlerService.crawlPrice(Date.from(LocalDate.now().atStartOfDay().toInstant(Utility.ZONE_OFFSET_KST)));
//		List<ItemDomain> compileResult = stockService.compile();
//		log.info("{} 『{}』『#{}』 scheduleTaskDaily() - {}", Utility.indentEnd(), crawlPriceResult, Utility.size(compileResult), Utility.toStringPastTimeReadable(started));

		JobService.getQueue3().push(PriceLatestJob.builder().build());
		JobService.getQueue3().push(ItemDetailJob.builder().code(null).build());

		log.info("{} scheduleTaskDaily() - {}", Utility.indentEnd(), Utility.toStringPastTimeReadable(started));
	}

	// 매주 일요일 - dividend
	@Scheduled(cron = "02 24 3 * * SUN")
	public void scheduleTaskWeekly() {
		log.info("{} scheduleTaskWeekly()", Utility.indentStart());
		long started = System.currentTimeMillis();

		Result<ParserResult> resultDividendAllRecent = crawlerService.crawlDividendAllRecent();
		Result<ParserResult> resultItemIpoCloseRecent = crawlerService.crawlItemIpoCloseRecent(Date.from(LocalDate.now().minusMonths(12).atStartOfDay().toInstant(Utility.ZONE_OFFSET_KST)));

		log.info("{} 『{}』『{}』 scheduleTaskWeekly() - {}", Utility.indentEnd(), resultDividendAllRecent, resultItemIpoCloseRecent, Utility.toStringPastTimeReadable(started));
	}

	// 매분기 첫달 첫번째 일요일 - items
	@Scheduled(cron = "19 17 17 1-7 1,4,7,10 SUN")
	public void scheduleTaskQuarter() {
		log.info("{} scheduleTaskQuarter()", Utility.indentStart());
		long started = System.currentTimeMillis();

		Result<ParserResult> result = crawlerService.crawlItemAll();

		log.info("{} {} scheduleTaskQuarter() - {}", Utility.indentEnd(), result, Utility.toStringPastTimeReadable(started));
	}

}
