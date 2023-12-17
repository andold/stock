package kr.andold.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import kr.andold.stock.service.StockCrawlerService;

@Configuration
@EnableScheduling
@ConditionalOnProperty(value = "app.scheduling.enable", havingValue = "true", matchIfMissing = true)
public class ScheduledTasks {
	@Autowired
	private StockCrawlerService stockCrawlerService;

	// 매시마다
	@Scheduled(cron = "15 30 * * * *")
	public void scheduleTaskHourly() {
	}

	// 매일
	@Scheduled(cron = "15 30 22 * * *")
	public void scheduleTaskDaily() {
		stockCrawlerService.crawlPrices();
	}

	// 매주
	@Scheduled(cron = "15 30 22 * * SUN")
	public void scheduleTaskWeekly() {
		stockCrawlerService.crawlEtfDividendHistories();
		stockCrawlerService.crawlCompanyDividendHistories();
	}

	// 매월
	@Scheduled(cron = "15 30 23 1 * *")
	public void scheduleTaskMonthly() {
		stockCrawlerService.crawlItems();
		stockCrawlerService.crawlEtfDetails();
		stockCrawlerService.crawlItemDetails();
	}

	// 매년
	@Scheduled(cron = "15 30 20 1 1 *")
	public void scheduleTaskYearly() {
	}

}
