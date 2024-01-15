package kr.andold.stock.crawler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.ZonedDateTime;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.Utility;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SeibroTest {
	@Autowired
	private Seibro service;

	@Test
	public void testDividendEtf() {
		Result<ParserResult> result = service.dividendEtf(Date.from(ZonedDateTime.now().minusMonths(1).toInstant()));
		log.info("{}", result);
	}

	@Test
	public void testDividendCompany() {
		Result<ParserResult> result = service.dividendCompany(Date.from(ZonedDateTime.now().minusMonths(1).toInstant()));
		log.info("{}", result);
	}

	@Test
	public void testItem() {
		Result<ParserResult> result = service.item("003540");
		log.info("{}", result);
		assertEquals(result.getResult().getItems().size(), 1);
	}

	@Test
	public void testItemEtf() {
		Result<ParserResult> result = service.itemEtf("441680");
		log.info("{}", result);
		assertEquals(result.getResult().getItems().size(), 1);
	}

	@Test
	public void testItemCompany() {
		Result<ParserResult> result = service.itemCompany("175330");
		log.info("{}", result);
		assertEquals(result.getResult().getItems().size(), 1);
	}

	@Test
	public void testPriceCompanyStringDate() {
		Result<ParserResult> result = service.priceCompany("017860", Date.from(ZonedDateTime.now().minusYears(3).toInstant()));
		log.info("{}", result);
		assertEquals(result.getStatus(), STATUS.SUCCESS);
	}

	@Test
	public void testPriceEtfStringDate() {
		Result<ParserResult> result = service.priceEtf("473590", Date.from(ZonedDateTime.now().minusYears(3).toInstant()));
		log.info("{}", result);
		assertEquals(result.getStatus(), STATUS.SUCCESS);
	}

	@Test
	public void testPriceStringDate() {
		Result<ParserResult> result = service.price("473590", Date.from(ZonedDateTime.of(2017, 3, 21, 0, 0, 0, 0, Utility.ZONE_ID_KST).toInstant()));
		log.info("{}", result);
		assertEquals(result.getStatus(), STATUS.SUCCESS);
	}

}
