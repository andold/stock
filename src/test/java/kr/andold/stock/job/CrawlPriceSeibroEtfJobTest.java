package kr.andold.stock.job;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.Result.STATUS;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CrawlPriceSeibroEtfJobTest {
	@Autowired private CrawlPriceSeibroEtfJob job;

	@BeforeEach
	public void before() {
		log.info(Utility.HR);
		assertNotNull(job);
	}

	@Test
	public void main() {
		ZonedDateTime zdt = ZonedDateTime.now().minusMonths(2).truncatedTo(ChronoUnit.DAYS);
		job.getMap().put("498400", zdt);
		job.getMap().put("481060", zdt);
		job.getMap().put("453850", zdt);
		job.getMap().put("069500", zdt);
		job.getMap().put("175330", zdt);
		job.getMap().put("065710", zdt);
		job.getMap().put("093920", zdt);
		STATUS status = job.main();
		log.info("{}", status);
	}

}
