package kr.andold.stock.job;

import java.time.ZonedDateTime;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.stock.service.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CrawlItemIpoCloseKindJobTest {
	@Autowired private CrawlItemIpoCloseKindJob job;

	@Test
	public void itemIpoClose() {
		Result<ParserResult> result = job.itemIpoClose(ZonedDateTime.now().minusDays(7));
		log.info("{} kind() - {}", Utility.indentMiddle(), result);
	}

	@Test
	public void main() {
		job.setStart(ZonedDateTime.now().minusYears(1));
		STATUS result = job.main();
		log.info("{} kind() - {}", Utility.indentMiddle(), result);
	}

}
