package kr.andold.stock.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.StockItemDomain;
import kr.andold.stock.service.StockParserService.StockParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StockCrawlerServiceTest {
	@Autowired
	private StockCrawlerService service;

	@Test
	public void testExtractTextItemDetails() {
		String text = service.extractTextItemDetails();
		StockParserResult result = StockParserService.parse(text, true);
		log.info("{}", result);
	}

	@Test
	public void testExtractAllEtfFromNaver() {
		String text = service.extractAllEtfFromNaver();
		StockParserResult result = StockParserService.parse(text, true);
		for (StockItemDomain item : result.getItems()) {
			log.info("{}", item);
		}
	}

	@Test
		public void testCrawlEtfDividendHistories() {
			StockParserResult result = service.crawlEtfDividendHistories();
			log.info("{}", result);
		}

	@Test
	public void testCrawlCompanyDividendHistories() {
		StockParserResult result = service.crawlCompanyDividendHistories();
		log.info("{}", result);
	}

	@Test
	public void testCrawlEtfDetails() {
		StockParserResult result = service.crawlEtfDetails();
		log.info("{}", result);
	}

	@Test
	public void testCrawlCompanyTopDividend() {
		StockParserResult result = service.crawlItemCompanyDividendTop();
		log.info("{}", result);
	}

}
