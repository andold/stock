package kr.andold.stock.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.ZonedDateTime;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.PriceDomain;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DataGoKrServiceTest {
	@Autowired private DataGoKrService service;

	@BeforeEach
	public void before() {
		log.info(Utility.HR);
		assertNotNull(service);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void getETFPriceInfo() {
		List<PriceDomain> result = service.getETFPriceInfo("441680", ZonedDateTime.now().minusDays(21));
		log.info("{}", Utility.toStringJson(result));
	}

	@Test
	public void getStockPriceInfo() {
		List<PriceDomain> result = service.getStockPriceInfo("496320", ZonedDateTime.now().minusDays(21));
		assertThat(result.size() > 0);
		log.info("{}", Utility.toStringJson(result));
	}

}
