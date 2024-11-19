package kr.andold.stock.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.param.ItemParam;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DividendHistoryServiceTest {
	@Autowired
	private DividendHistoryService service;

	@Test
	public void testCrawl() {
		ParserResult result = service.crawl(ItemParam.builder().code("168490").symbol("한국패러랠").type("KOSPI").build());
		log.info("{}", Utility.toStringJson(result));
	}

	@Test
	public void testCrawlEtf() {
		ParserResult result = service.crawl(ItemParam.builder().code("429740").symbol("ARIRANG K리츠Fn").type("ETF").build());
		log.info("{}", Utility.toStringJsonPretty(result));
	}

}
