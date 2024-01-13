package kr.andold.stock.crawler;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.service.ParserService.ParserResult;
import kr.andold.stock.service.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class IdempotentServiceTest {
	@Autowired
	private IdempotentService service;

	@Test
	public void testRun() throws InterruptedException, ExecutionException {
		List<Future<ParserResult>> futures = new ArrayList<>();
		for (int cx = 0, sizex = 4; cx < sizex; cx++) {
			futures.add(service.run());
		}
		
		for (Future<ParserResult> future : futures) {
			ParserResult result = future.get();
			log.info("RESULT: {}", result);
		}
	}

	@Test
	public void testOnce() {
		CrawlerService.setDebug(false);
		service.once();
		Utility.sleep(Integer.MAX_VALUE);
	}

}
