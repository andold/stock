package kr.andold.stock.service;

import java.lang.management.ManagementFactory;

import org.junit.jupiter.api.Test;

import kr.andold.stock.dummy.Utility;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ParserServiceTest {
	@Test
	public void testSystemRamSize() {
		@SuppressWarnings("deprecation")
		long totalPhysicalMemorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getTotalPhysicalMemorySize();
		long freeMemorySize = ((com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean()).getFreeMemorySize();
		log.info("{} MB vs {} MB", totalPhysicalMemorySize / 1024 / 1024, freeMemorySize / 1024 / 1024);
	}


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


	@Test
	public void testItem() {
		String symbol = "TIGER 미국나스닥100커버드콜(합성)[441680]";
		log.info(symbol);
		log.info(symbol.split("[\\(\\[][0-9]+[\\)\\]]")[0].strip());
		symbol = "TIGER 미국나스닥100커버드콜(441680)[]";
		log.info(symbol);
		log.info(symbol.split("[\\(\\[][0-9]+[\\)\\]]")[0].strip());
	}

}
