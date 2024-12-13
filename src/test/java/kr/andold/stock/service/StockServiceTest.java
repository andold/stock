package kr.andold.stock.service;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.ItemDomain;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StockServiceTest {
	@Autowired private StockService service;

	@Test
	public void testCompile() {
		List<ItemDomain> result = service.compile(LocalDate.now().minusDays(7));
		log.info("{}", Utility.toStringJson(result));
		assertNotEquals(result, null);
	}

}
