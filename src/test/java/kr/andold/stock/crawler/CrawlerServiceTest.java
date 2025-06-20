package kr.andold.stock.crawler;

import java.sql.Date;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.Result;
import kr.andold.stock.param.ItemParam;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CrawlerServiceTest {
	@Autowired private CrawlerService service;

	@Test
	public void testCrawlPrice() {
		Result<ParserResult> result = service.crawlPrice(Date.valueOf("2010-01-01"));
		log.info("{}", result);
	}

	@Test
	public void test() {
		log.info("{}", String.format("%.0f", 123.465));
	}

	@Deprecated
	@Test
	public void testCrawlDividendAllRecent() {
		Result<ParserResult> result = service.crawlDividendAllRecent();
		log.info("{}", result);
	}

	@Test
	public void testCrawlItem() {
		Result<ParserResult> result = service.crawlItem(ItemParam.builder()
				.code("441680")
				.build());
		log.info("{}", result);
	}

}
