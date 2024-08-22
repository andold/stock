package kr.andold.stock.service;

import java.io.IOException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.Result.STATUS;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class JobServiceTest {
	@Autowired private JobService service;
	@Autowired private StockCompileJobService stockCompileJobService;

	@Test
	public void testRunInt() throws IOException {
		JobService.getQueue1().push(stockCompileJobService);
		service.run();
		for (int cx = 0; cx < 4; cx++) {
			STATUS result = service.run(0);
			log.info("{} 『{}』 testRunInt()", Utility.indentMiddle(), result);
		}
	}

}
