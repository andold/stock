package kr.andold.stock.crawler;

import java.time.ZonedDateTime;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.Result;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SeibroTest {
	@Autowired
	private Seibro seibro;

	@Test
	public void testDividendEtf() {
		Result<ParserResult> result = seibro.dividendEtf(Date.from(ZonedDateTime.now().minusMonths(1).toInstant()));
		log.info("{}", result);
	}

	@Test
	public void testDividendCompany() {
		Result<ParserResult> result = seibro.dividendCompany(Date.from(ZonedDateTime.now().minusMonths(1).toInstant()));
		log.info("{}", result);
	}

}
