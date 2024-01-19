package kr.andold.stock.crawler;

import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.service.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IdempotentServiceTest {
	@Autowired
	private IdempotentService service;

	@Test
	public void testOncse() {
		Date date = new Date();
		Date start = Date.from(LocalDate.ofInstant(date.toInstant(), Utility.ZONE_ID_KST).minusMonths(1).atStartOfDay().toInstant(Utility.ZONE_OFFSET_KST));
		log.info("{}", start);
	}

	@Test
	public void testOnce() {
		service.once();
		Utility.sleep(Integer.MAX_VALUE);
	}

}
