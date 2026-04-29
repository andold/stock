package kr.andold.stock.job;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.crawler.CrawlerService;
import kr.andold.stock.domain.Result;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.utils.ChromeDriverWrapper;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class CrawlItemDetailSeibroEtfJobTest {
	@Autowired private CrawlItemDetailSeibroEtfJob job;

	@BeforeEach
	public void before() {
		log.info(Utility.HR);
		assertNotNull(job);
	}

	@Test
	public void itemEtf() {
		ChromeDriverWrapper driver = CrawlerService.defaultChromeDriver();
		Result<ParserResult> result = job.itemEtf(driver, "001797");
		log.info("{}", Utility.toStringJson(result));
		driver.quit();
	}

}
