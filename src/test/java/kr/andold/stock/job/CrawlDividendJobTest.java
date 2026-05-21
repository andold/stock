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
class CrawlDividendJobTest {
	@Autowired private CrawlDividendJob job;

	@BeforeEach
	protected void setUp() throws Exception {
		log.info(Utility.HR);
		assertNotNull(job);
	}

	@Test
	public void main() {
		job.containsOrModify(Utility.BLANK, ZonedDateTime.now().truncatedTo(ChronoUnit.DAYS).minusDays(7));
		STATUS result = job.main();
		log.info("{}", Utility.toStringJson(result));
	}

}
