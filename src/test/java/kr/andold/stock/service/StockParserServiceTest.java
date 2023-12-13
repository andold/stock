package kr.andold.stock.service;

import org.junit.jupiter.api.Test;

import kr.andold.stock.service.StockParserService.StockParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StockParserServiceTest {

	@Test
	public void testExtractPrice() {
		String text = Utility.readClassPathFile("stock/extractPrice.txt");
		StockParserResult result = StockParserService.parse(text, true);
		log.info("{}", result);
	}

	@Test
	public void testExtractItemDetails() {
		String text = Utility.readClassPathFile("stock/extractItemDetails.txt");
		StockParserResult result = StockParserService.parse(text, true);
		log.info("{}", result);
	}

	@Test
	public void testExtractTextDividendHistoryEtfMonthly() {
		String text = Utility.readClassPathFile("stock/extractTextDividendHistoryEtfMonthly.txt");
		StockParserResult result = StockParserService.parse(text, true);
		log.info("{}", result);
	}

	@Test
	public void testExtractTextDividendHistoriesGeneralCompany() {
		String text = Utility.readClassPathFile("stock/extractTextDividendHistoriesGeneralCompany.txt");
		StockParserResult result = StockParserService.parse(text, true);
		log.info("{}", result);
	}

	@Test
	public void testCrawlDividendHistoryEtfThread() {
		String text = Utility.readClassPathFile("stock/DividendHistoryEtf.txt");
		StockParserResult result = StockParserService.parse(text, true);
		log.info("{}", result);
	}

}
