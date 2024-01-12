package kr.andold.stock.crawler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.ZonedDateTime;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class KrxTest {
	@Autowired
	private Krx krx;

	@Test
	public void testPriceDate() {
		Result<ParserResult> result = krx.price(new Date());
		log.info("{}", result);
	}

	@Test
	public void testBasicInfoAll() {
		Result<ParserResult> result = krx.basicInfoAll();
		log.info("{}", result);
	}

	@Test
	public void testBasicInfoAllEtf() {
		Result<ParserResult> result = krx.basicInfoAllEtf();
		log.info("{}", result);
	}

	@Test
	public void testItemEtf() {
		Result<ParserResult> result = krx.itemEtf("441680");
		log.info("{}", result);
		assertEquals(result.getResult().getItems().size(), 1);
	}

	@Test
	public void testItemCompany() {
		Result<ParserResult> result = krx.itemCompany("175330");
		log.info("{}", result);
		assertEquals(result.getResult().getItems().size(), 1);
	}

	@Test
	public void testPriceCompanyStringDate() {
		Result<ParserResult> result = krx.priceCompany("175330", Date.from(ZonedDateTime.now().minusDays(7).toInstant()));
		log.info("{}", result);
		assertEquals(result.getStatus(), STATUS.SUCCESS);
	}

	@Test
	public void testPriceEtfStringDate() {
//		Result<ParserResult> resultInvalid = krx.priceEtf("001680", Date.from(ZonedDateTime.now().minusDays(7).toInstant()));
		Result<ParserResult> result = krx.priceEtf("441680", Date.from(ZonedDateTime.now().minusDays(7).toInstant()));
		log.info("{}", result);
		assertEquals(result.getStatus(), STATUS.SUCCESS);
	}

}
