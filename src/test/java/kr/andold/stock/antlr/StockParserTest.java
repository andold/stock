package kr.andold.stock.antlr;


import org.junit.jupiter.api.Test;

import kr.andold.stock.service.StockParserService;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.StockParserService.StockParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StockParserTest {
	@Test
	public void testCrawlEtfDetailThread() {
		String filename = "sample/crawlEtfDetailThread.txt";
		String text = Utility.readClassPathFile(filename);
		StockParserResult result = StockParserService.parse(text, false);
		log.info("{}", result);
	}

}
