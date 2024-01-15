package kr.andold.stock.crawler;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.service.Utility;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IdempotentServiceTest {
	@Autowired
	private IdempotentService service;

	@Test
	public void testOnce() {
		service.once();
		Utility.sleep(Integer.MAX_VALUE);
	}

}
