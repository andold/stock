package kr.andold.stock.crawler;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.Result;
import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class NaverTest {
	@Autowired private Naver service;

	@Test
	public void testPriceDate() {
		Result<ParserResult> result = service.price(null);
		log.info("{}", result);
		assertTrue(result.getResult().getItems().size() > 0);
	}

}
