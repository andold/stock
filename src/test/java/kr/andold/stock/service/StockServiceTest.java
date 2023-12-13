package kr.andold.stock.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.param.StockDividendHistoryParam;
import kr.andold.stock.param.StockPriceParam;
import kr.andold.stock.service.StockParserService.StockParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StockServiceTest {
	@Autowired
	private StockCrawlerService service;

	@Test
	public void testCrawlItems() {
		StockParserResult result = service.crawlItems();
		log.info("result: {}", result);
	}

	@Test
	public void testCrawlItemsDividendHistoryEtfMonthly() {
		String result = service.crawlDividendHistoryEtfMonthly(StockDividendHistoryParam.builder().code("452360").etf(true).build());
		log.info(result);
	}

	@Test
	public void testCrawlPrice() {
		StockParserResult result = service.crawlPrice(StockPriceParam.builder().code("452360").build());
		log.info("{}", result);
	}

}
