package kr.andold.stock.crawler;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Date;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.Result.STATUS;
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

	@Test
	public void testProcessDetailInfo() {
		STATUS result = service.processDetailInfo(ItemDomain.builder()
				.code("000000")
				.type("기타비상장")
				.build());
		assertEquals(result, STATUS.ALEADY_DONE);

		result = service.processDetailInfo(ItemDomain.builder()
				.code("000000")
				.symbol(".")
				.type("KOSPI")
				.category(".")
				.volumeOfListedShares(1)
				.ipoOpen(new Date())
				.build());
		assertEquals(result, STATUS.ALEADY_DONE);
	}

	@Test
	public void testProcessDividend() {
		STATUS result = service.processDividend(ItemDomain.builder()
				.code("000000")
				.symbol(".")
				.type("기타비상장")
				.category(".")
				.volumeOfListedShares(1)
				.ipoOpen(new Date())
				.build());
		assertEquals(result, STATUS.INVALID);
	}

	@Test
	public void testProcessPrice() {
		STATUS result = service.processPrice(ItemDomain.builder()
				.code("000000")
				.symbol(".")
				.type("기타비상장")
				.category(".")
				.volumeOfListedShares(1)
				.ipoOpen(new Date())
				.build());
		assertEquals(result, STATUS.INVALID);
	}

	@Test
	public void testProcessPriceByHistories() {
		STATUS result = service.processPrice(ItemDomain.builder()
				.code("441680")
				.symbol(".")
				.type("ETF")
				.category(".")
				.volumeOfListedShares(1)
				.ipoOpen(Date.from(ZonedDateTime.parse("2018-01-25T00:00:00+09:00[Asia/Seoul]").toInstant()))
				.build());
		assertNotEquals(result, STATUS.FAILURE);
	}

}
