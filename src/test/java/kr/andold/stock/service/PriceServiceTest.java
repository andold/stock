package kr.andold.stock.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.param.ItemParam;
import kr.andold.stock.service.CommonBlockService.CrudList;
import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class PriceServiceTest {
	@Autowired private PriceService service;

	@BeforeEach
	public void before() {
		log.info(Utility.HR);
		assertNotNull(service);
	}

	@Test
	public void testCrawlCompany() {
		CrudList<PriceDomain> result = service.crawl(ItemParam.builder().code("168490").symbol("한국패러랠").type("KOSPI").build());
		log.info("{}", Utility.toStringJson(result));
	}

	@Test
	public void testCrawlEtf() {
		CrudList<PriceDomain> result = service.crawl(ItemParam.builder().code("441680").symbol("TIGER 미국나스닥100커버드콜(합성)").type("ETF").build());
		log.info("{}", Utility.toStringJson(result));
	}

	@Test
	public void testCompileLocalDate() {
		LocalDate start = LocalDate.now().minusDays(10);
		CrudList<PriceDomain> result = service.compile(start);
		assertNotNull(result);
		log.info("{}", result);
	}

}
