package kr.andold.stock.service;

import java.sql.Date;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CrawlerServiceTest {
	@Autowired
	private CrawlerService service;

	@Test
	public void testCrawlDividendHistoryEtf() {
		ParserResult result = service.crawlDividendHistoryEtf(null);
		log.info("{}", result);
	}

	@Test
	public void testCrawlDividendHistoryCompany() {
		ParserResult result = service.crawlDividendHistoryCompany(null);
		log.info("{}", result);
	}

	@Test
	public void testCrawlItemDetailEtf() {
		ParserResult result = service.crawlItemDetailEtf();
		log.info("{}", result);
	}

	@Test
	public void testCrawlCompanyTopDividend() {
		ParserResult result = service.crawlItemDividendTopCompany();
		log.info("{}", result);
	}

	@Test
	public void testCrawllItemDetailCompany() {
		ParserResult result = service.crawlItemDetailCompany();
		log.info("{}", result);
	}

	@Test
	public void testCrawlPriceCompany() {
		ParserResult result = service.crawlPriceCompany(null);
		log.info("{}", result);
	}

	@Test
	public void testCrawlPriceCompanyMultiPage() {
		ParserResult result = service.crawlPriceCompany(Date.valueOf(LocalDate.now().minusMonths(1)));
		log.info("{}", result);
	}

	@Test
	public void testCrawlPriceEtfMultiPage() {
		ParserResult result = service.crawlPriceEtf(Date.valueOf(LocalDate.now().minusMonths(1)));
		log.info("{}", result);
	}

	@Test
	public void testCrawlPriceEtf() {
		ParserResult result = service.crawlPriceEtf(null);
		log.info("{}", result);
	}

	@Test
	public void testCrawlItemEtf() {
		ParserResult result = service.crawlItemEtf();
		log.info("{}", result);
	}

	@Test
	public void testCrawlPrice() {
		ParserResult result = service.crawlPrice(Date.valueOf("2010-01-01"));
		log.info("{}", result);
	}

}
