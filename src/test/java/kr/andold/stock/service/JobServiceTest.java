package kr.andold.stock.service;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.andold.stock.Application;
import kr.andold.stock.domain.Result.STATUS;
import kr.andold.stock.service.JobService.StockCompileJob;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class JobServiceTest {
	@Autowired private JobService service;

	@Test
	public void test() {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
		assertNotEquals(applicationContext, null);
		log.info("{} {}", Utility.indentMiddle(), applicationContext);
	}

	@Test
	public void testRunInt() throws IOException {
		JobService.getQueue1().offer(StockCompileJob.builder().build());
		service.run();
		for (int cx = 0; cx < 4; cx++) {
			STATUS result = service.run(0);
			log.info("{} 『{}』 testRunInt()", Utility.indentMiddle(), result);
		}
	}

}
