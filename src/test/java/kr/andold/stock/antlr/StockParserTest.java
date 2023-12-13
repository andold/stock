package kr.andold.stock.antlr;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

import kr.andold.stock.domain.StockDividendDomain;
import kr.andold.stock.domain.StockDividendHistoryDomain;
import kr.andold.stock.service.StockParserService;
import kr.andold.stock.service.StockParserService.StockParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StockParserTest {
	@Test
	public void testSeibro() {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("a", true);
		StockParserResult result = StockParserService.testHtmlFile("stock/seibro.html", map);
		
		for (StockDividendDomain domain : result.getDividends()) {
			log.info(domain.toString());
		}
		for (StockDividendHistoryDomain domain : result.getHistories()) {
			log.info(domain.toString());
		}
	}

	@Test
	public void testNaverStock() {
		StockParserResult result = StockParserService.testHtmlFile("stock/naver.html");
		assertEquals(50, result.getDividends().size());
		
		for (StockDividendDomain domain : result.getDividends()) {
			log.info(domain.toString());
		}
	}

	@Test
	public void testNaverStockWithHref() {
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		map.put("a", true);
		StockParserResult result = StockParserService.testHtmlFile("stock/naver.html", map);
		assertEquals(50, result.getDividends().size());
		
		for (StockDividendDomain domain : result.getDividends()) {
			log.info(domain.toString());
		}
	}

}
