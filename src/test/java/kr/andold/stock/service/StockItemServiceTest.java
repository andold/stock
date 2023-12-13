package kr.andold.stock.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.StockItemDomain;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class StockItemServiceTest {
	@Autowired
	private StockItemService service;

	@Test
	public void testPrepareUpdate() {
		StockItemDomain before = StockItemDomain.builder().code("before").category("before").build();
		StockItemDomain after = StockItemDomain.builder().code("after").category("after").build();
		service.prepareUpdate(before, after);
		log.info("{} {}", before, after);
		
		List<StockItemDomain> befores = new ArrayList<>();
		List<StockItemDomain> afters = new ArrayList<>();
		List<StockItemDomain> creates = new ArrayList<>();
		List<StockItemDomain> duplicates = new ArrayList<>();
		List<StockItemDomain> updates = new ArrayList<>();
		List<StockItemDomain> removes = new ArrayList<>();
		befores.add(StockItemDomain.builder().code("code").symbol("symbol").category("before").build());
		afters.add(StockItemDomain.builder().code("code").category("after").build());
		
		service.differ(befores, afters, creates, duplicates, updates, removes);
		updates.forEach(item -> log.info("{}", item));
	}

}
