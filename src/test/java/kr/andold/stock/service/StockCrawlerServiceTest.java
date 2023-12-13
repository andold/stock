package kr.andold.stock.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.StockItemDomain;
import kr.andold.stock.param.StockDividendHistoryParam;
import kr.andold.stock.param.StockPriceParam;
import kr.andold.stock.service.StockParserService.StockParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StockCrawlerServiceTest {
	@Autowired
	private StockCrawlerService service;

	@Test
	public void testCrawlDividendHistoryEtfMonthlyDividend() {
		String result = service.extractTextDividendHistoryEtfMonthly(StockDividendHistoryParam.builder().code("452360").etf(true).build());
		log.info(result);
	}

	@Test
	public void testExtractTextDividendHistoriesEtfMonthly() {
		String text = service.extractTextDividendHistoriesEtfMonthly();
		StockParserResult result = StockParserService.parse(text, true);
		log.info("{}", result);
	}

	@Test
	public void testExtractTextItemDetails() {
		String text = service.extractTextItemDetails();
		StockParserResult result = StockParserService.parse(text, true);
		log.info("{}", result);
	}

	@Test
	public void testExtractTextStockPrice() {
		String text = service.extractTextStockPrice();
		StockParserResult result = StockParserService.parse(text, true);
		log.info("{}", result);
	}

	@Test
	public void testExtractTextDividendHistoriesGeneralCompany() {
		String text = service.extractTextDividendHistoriesGeneralCompany();
		StockParserResult result = StockParserService.parse(text, true);
		log.info("{}", result);
	}

	@Test
	public void testCrawl() {
		StockParserResult result = service.crawl();
		log.info("{}", result);
	}

	@Test
	public void testCrawlPrice() {
		StockParserResult result = service.crawlPrice(StockPriceParam.builder().code("175330").build());
		log.info("{}", result);
	}

	@Test
	public void testExtractTextDividendHistoryEtf() {
		List<StockItemDomain> items = new ArrayList<>();
		items.add(StockItemDomain.builder()
				.code("446720")
				.symbol("SOL 미국배당다우존스")
				.build());
		String text = service.extractTextDividendHistoryEtf(items);
//		String text = service.extractTextDividendHistoryEtf();
		StockParserResult result = StockParserService.parse(text, true);
		log.info("{}", result);
	}

}
