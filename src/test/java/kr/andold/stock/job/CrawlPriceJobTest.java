package kr.andold.stock.job;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.ZonedDateTime;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.Result.STATUS;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CrawlPriceJobTest {
	@Autowired private CrawlPriceJob job;

	@BeforeEach
	public void before() {
		log.info(Utility.HR);
		assertNotNull(job);
	}

	@Test
	public void main() {
		job.getMap().put("498400", ZonedDateTime.now().minusMonths(1));
		job.getMap().put("481060", ZonedDateTime.now().minusMonths(1));
		job.getMap().put("453850", ZonedDateTime.now().minusMonths(1));
		job.getMap().put("069500", ZonedDateTime.now().minusMonths(1));
		job.getMap().put("175330", ZonedDateTime.now().minusMonths(1));
		job.getMap().put("065710", ZonedDateTime.now().minusMonths(1));
		job.getMap().put("093920", ZonedDateTime.now().minusMonths(1));
		STATUS status = job.main();
		log.info("{}", status);
	}

}
