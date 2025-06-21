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
class CrawlItemDetailDataGoKrCompanyJobTest {
	@Autowired private CrawlItemDetailDataGoKrCompanyJob job;

	@BeforeEach
	public void before() {
		log.info(Utility.HR);
		assertNotNull(job);
	}

	@Test
	public void main() {
		job.setIsinCode("KR7015060007");
		job.setBaseDate(ZonedDateTime.now().minusWeeks(1));
		STATUS status = job.main();
		log.info("{}", status);
	}

}
