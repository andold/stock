package kr.andold.stock;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import kr.andold.stock.service.StockService;
import kr.andold.stock.service.Utility;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableScheduling
@ConditionalOnProperty(value = "app.scheduling.enable", havingValue = "true", matchIfMissing = true)
public class ScheduledTasks {
	public static final long PERIOD_PROCESS_CHECK_MIN = 1000L * 60L * 10L;
	@SuppressWarnings("unused")
	private static final long PERIOD_PROCESS_CHECK_MAX = 1000L * 60L * 60L;

	@Autowired
	private StockService stockService;

	@Setter
	private static long triggerTime = System.currentTimeMillis() + PERIOD_PROCESS_CHECK_MIN;

	private long delayProcess = PERIOD_PROCESS_CHECK_MIN;

	// 주기적으로 최근 자료가 있는지 검사하여, 통계를 정리한다. h2가 초기화가 완료되기 전에 실행되는 것 같다. 초기 지연 시간이 필요하다.
	@Scheduled(fixedDelay = PERIOD_PROCESS_CHECK_MIN, initialDelay = PERIOD_PROCESS_CHECK_MIN * 4L)
	public void scheduleTaskEveryMinutes() {
		log.info("{} {}:{} scheduleTaskEveryMinutes()", Utility.indentStart(), Utility.toStringTimestamp(triggerTime), Utility.toStringTimeReadable(delayProcess));
		long started = System.currentTimeMillis();

		log.info("{} {}:{} - scheduleTaskEveryMinutes() - {}", Utility.indentEnd(), Utility.toStringTimestamp(triggerTime), Utility.toStringTimeReadable(delayProcess), Utility.toStringPastTimeReadable(started));
	}

	// 매시마다
	@Scheduled(fixedDelay = 3600000, initialDelay = 60000 * 30)
	public void scheduleTaskEveryHours() {
	}

	// 매일
	@Scheduled(fixedDelay = 1000 * 60 * 60 * 24, initialDelay = 1000 * 60 * 60)
	public void scheduleTaskEveryDays() {
		stockService.scheduleTaskEveryDays();
	}

}
