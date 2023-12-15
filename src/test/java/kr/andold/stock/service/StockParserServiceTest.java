package kr.andold.stock.service;

import org.junit.jupiter.api.Test;

import kr.andold.stock.service.StockParserService.StockParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StockParserServiceTest {

	@Test
	public void testExtractPrice() {
		String text = Utility.readClassPathFile("sample/extractPrice.txt");
		StockParserResult result = StockParserService.parse(text, true);
		log.info("{}", result);
	}

	@Test
	public void testExtractItemDetails() {
		String text = Utility.readClassPathFile("sample/extractItemDetails.txt");
		StockParserResult result = StockParserService.parse(text, true);
		log.info("{}", result);
	}

	@Test
	public void testExtractTextDividendHistoryEtfMonthly() {
		String text = Utility.readClassPathFile("sample/extractTextDividendHistoryEtfMonthly.txt");
		StockParserResult result = StockParserService.parse(text, true);
		log.info("{}", result);
	}

	@Test
	public void testExtractTextDividendHistoriesGeneralCompany() {
		String text = Utility.readClassPathFile("sample/extractTextDividendHistoriesGeneralCompany.txt");
		StockParserResult result = StockParserService.parse(text, true);
		log.info("{}", result);
	}

	@Test
	public void testCrawlDividendHistoryEtfThread() {
		String text = Utility.readClassPathFile("sample/DividendHistoryEtf.txt");
		StockParserResult result = StockParserService.parse(text, false);
		log.info("{}", result);
	}

}
