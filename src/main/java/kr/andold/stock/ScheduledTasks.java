package kr.andold.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import kr.andold.stock.service.CrawlerService;

@Configuration
@EnableScheduling
@ConditionalOnProperty(value = "app.scheduling.enable", havingValue = "true", matchIfMissing = true)
public class ScheduledTasks {
	@Autowired
	private CrawlerService stockCrawlerService;

	// 매시마다
	@Scheduled(cron = "15 30 8-16 * * *")
	public void scheduleTaskHourly() {
	}

	// 평일
	@Scheduled(cron = "15 30 22 * * MON-FRI")
	public void scheduleTaskDaily() {
		stockCrawlerService.crawlPriceCompany();	//	기업주가 시세
		stockCrawlerService.crawlPriceEtf();		//	ETF 주가 시세
	}

	// 매주 일요일
	@Scheduled(cron = "15 30 22 * * SUN")
	public void scheduleTaskWeekly() {
		stockCrawlerService.crawlDividendHistoryEtf();	//	ETF 배당 이력
		stockCrawlerService.crawlDividendHistoryCompany();	//	기업주식 배당 이력
	}

	// 매월 1일
	@Scheduled(cron = "15 30 23 1 * *")
	public void scheduleTaskMonthly() {
		stockCrawlerService.crawlItems();
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
