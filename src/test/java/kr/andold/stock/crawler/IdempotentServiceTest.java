package kr.andold.stock.crawler;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.service.ParserService.ParserResult;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IdempotentServiceTest {
	@Autowired
	private IdempotentService service;

	@Test
	public void testRun() {
		for (int cx = 0; cx < 4; cx++) {
			ParserResult result = service.run();
			log.info("{}", result);
		}
	}

}
