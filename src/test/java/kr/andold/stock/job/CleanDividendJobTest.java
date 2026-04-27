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
class CleanDividendJobTest {
	@Autowired private CleanDividendJob job;

	@BeforeEach
	public void before() {
		log.info(Utility.HR);
		assertNotNull(job);
	}

	@Test
	public void main() throws Exception {
		job.getMap().put("482630", ZonedDateTime.now());
		STATUS result = job.call();
		log.info("{}", Utility.toStringJson(result));
	}

}
