package kr.andold.stock.antlr;

import org.junit.jupiter.api.Test;

import kr.andold.stock.service.ParserService;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StockParserTest {
	@Test
	public void testCrawlEtfDetailThread() {
		String filename = "sample/crawlEtfDetailThread.txt";
		String text = Utility.readClassPathFile(filename);
		ParserResult result = ParserService.parse(text, false);
		log.info("{}", result);
	}

}
