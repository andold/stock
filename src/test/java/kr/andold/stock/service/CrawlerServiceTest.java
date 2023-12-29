package kr.andold.stock.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CrawlerServiceTest {
	@Autowired
	private CrawlerService service;

	@Test
	public void testExtractAllEtfFromNaver() {
		String text = service.extractAllEtfFromNaver();
		ParserResult result = ParserService.parse(text, true);
		for (ItemDomain item : result.getItems()) {
			log.info("{}", item);
		}
	}

	@Test
	public void testCrawlDividendHistoryEtf() {
		ParserResult result = service.crawlDividendHistoryEtf();
		log.info("{}", result);
	}

	@Test
	public void testCrawlDividendHistoryCompany() {
		ParserResult result = service.crawlDividendHistoryCompany();
		log.info("{}", result);
	}

	@Test
	public void testCrawlItemDetailEtf() {
		ParserResult result = service.crawlItemDetailEtf();
		log.info("{}", result);
	}

	@Test
	public void testCrawlCompanyTopDividend() {
		ParserResult result = service.crawlItemCompanyDividendTop();
		log.info("{}", result);
	}

	@Test
	public void testCrawllItemDetailCompany() {
		ParserResult result = service.crawlItemDetailCompany();
		log.info("{}", result);
	}

	@Test
	public void testCrawlPriceCompany() {
		ParserResult result = service.crawlPriceCompany();
		log.info("{}", result);
	}

	@Test
	public void testCrawlPriceEtf() {
		ParserResult result = service.crawlPriceEtf();
		log.info("{}", result);
	}

}
