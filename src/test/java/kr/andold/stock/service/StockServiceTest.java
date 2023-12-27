package kr.andold.stock.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StockServiceTest {
	@Autowired
	private CrawlerService service;

	@Test
	public void testCrawlItems() {
		ParserResult result = service.crawlItems();
		log.info("result: {}", result);
	}

}
