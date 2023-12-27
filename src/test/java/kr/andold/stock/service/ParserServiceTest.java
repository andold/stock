package kr.andold.stock.service;

import org.junit.jupiter.api.Test;

import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ParserServiceTest {

	@Test
	public void testExtractPrice() {
		String text = Utility.readClassPathFile("sample/extractPrice.txt");
		ParserResult result = ParserService.parse(text, true);
		log.info("{}", result);
	}

	@Test
	public void testExtractItemDetails() {
		String text = Utility.readClassPathFile("sample/extractItemDetails.txt");
		ParserResult result = ParserService.parse(text, true);
		log.info("{}", result);
	}

	@Test
	public void testExtractTextDividendHistoryEtfMonthly() {
		String text = Utility.readClassPathFile("sample/extractTextDividendHistoryEtfMonthly.txt");
		ParserResult result = ParserService.parse(text, true);
		log.info("{}", result);
	}

	@Test
	public void testExtractTextDividendHistoriesGeneralCompany() {
		String text = Utility.readClassPathFile("sample/extractTextDividendHistoriesGeneralCompany.txt");
		ParserResult result = ParserService.parse(text, true);
		log.info("{}", result);
	}

	@Test
	public void testCrawlDividendHistoryEtfThread() {
		String text = Utility.readClassPathFile("sample/DividendHistoryEtf.txt");
		ParserResult result = ParserService.parse(text, false);
		log.info("{}", result);
	}

}
