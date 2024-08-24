package kr.andold.stock.crawler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.Result;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class KindTest {
	@Autowired
	private Kind service;

	@Test
	public void testIpoCloseAll() {
		Result<ParserResult> result = service.itemIpoCloseAll();
		log.info("{}", result);
		assertEquals(result.getStatus(), STATUS.SUCCESS);
	}

	@Test
	public void testItemDate() {
		Result<ParserResult> result = service.item(Date.from(LocalDate.now().atStartOfDay().minusMonths(12).toInstant(Utility.ZONE_OFFSET_KST)));
		log.info("{}", result);
		assertEquals(result.getStatus(), STATUS.SUCCESS);
	}

}
