package kr.andold.stock.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.ItemDomain;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ItemServiceTest {
	@Autowired
	private ItemService service;

	@Test
	public void testPrepareUpdate() {
		ItemDomain before = ItemDomain.builder().code("before").category("before").build();
		ItemDomain after = ItemDomain.builder().code("after").category("after").build();
		service.prepareUpdate(before, after);
		log.info("{} {}", before, after);
		
		List<ItemDomain> befores = new ArrayList<>();
		List<ItemDomain> afters = new ArrayList<>();
		List<ItemDomain> creates = new ArrayList<>();
		List<ItemDomain> duplicates = new ArrayList<>();
		List<ItemDomain> updates = new ArrayList<>();
		List<ItemDomain> removes = new ArrayList<>();
		befores.add(ItemDomain.builder().code("code").symbol("symbol").category("before").build());
		afters.add(ItemDomain.builder().code("code").category("after").build());
		
		service.differ(befores, afters, creates, duplicates, updates, removes);
		updates.forEach(item -> log.info("{}", item));
	}

}
