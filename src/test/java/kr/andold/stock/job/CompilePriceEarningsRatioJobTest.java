package kr.andold.stock.job;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.JobService.JobHistory;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CompilePriceEarningsRatioJobTest {
	@Autowired private CompilePriceEarningsRatioJob job;

	@BeforeEach
	public void before() {
		log.info(Utility.HR);
		assertNotNull(job);
	}

	@Test
	public void classNameTest() {
		boolean isCircular = job.tag(this);
		List<JobHistory> histories = job.getHistories();
		log.info("histories:: {}", histories);
		log.info("isCircular:: {}", isCircular);
		isCircular = job.tag(this);
		log.info("histories:: {}", histories);
		log.info("isCircular:: {}", isCircular);
	}

	@Test
	public void main() throws Exception {
		STATUS result = job.call();
		log.info("{}", Utility.toStringJson(result));
	}

}
