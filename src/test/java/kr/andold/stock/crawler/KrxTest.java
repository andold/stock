package kr.andold.stock.crawler;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.Result;
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

}
