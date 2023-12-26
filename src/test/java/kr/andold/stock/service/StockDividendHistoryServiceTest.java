package kr.andold.stock.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.param.StockItemParam;
import kr.andold.stock.service.StockParserService.StockParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StockDividendHistoryServiceTest {
	@Autowired
	private StockDividendHistoryService service;

	@Test
	public void testCrawl() {
		StockParserResult result = service.crawl(StockItemParam.builder().code("168490").symbol("한국패러랠").etf(false).type("KOSPI").build());
		log.info("{}", Utility.toStringJson(result));
	}

}
