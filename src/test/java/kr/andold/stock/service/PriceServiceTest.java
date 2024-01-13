package kr.andold.stock.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.param.ItemParam;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PriceServiceTest {
	@Autowired
	private PriceService service;

	@Test
	public void testCrawlCompany() {
		ParserResult result = service.crawl(ItemParam.builder().code("168490").symbol("한국패러랠").type("KOSPI").build());
		log.info("{}", Utility.toStringJson(result));
	}

	@Test
	public void testCrawlEtf() {
		ParserResult result = service.crawl(ItemParam.builder().code("441680").symbol("TIGER 미국나스닥100커버드콜(합성)").type("ETF").build());
		log.info("{}", Utility.toStringJson(result));
	}

}
