package kr.andold.stock.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.param.ItemParam;
import kr.andold.utils.Utility;
import kr.andold.utils.persist.CrudList;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class ItemServiceTest {
	@Autowired
	private ItemService service;

	@Test
	public void testCrawl() {
		CrudList<ItemDomain> result = service.crawl(ItemParam.builder().code("069500").type("ETF").build());
		log.info("{}", Utility.toStringJsonPretty(result));
	}

}
