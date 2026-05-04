package kr.andold.stock.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kr.andold.stock.domain.ResultDataGoKr.PriceEtfDomain;
import kr.andold.stock.service.DataGoKrService;
import kr.andold.stock.service.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class ResultDataGoKrTest {
	@BeforeEach
	public void before() {
		log.info(Utility.HR);
	}

	@Test
	public void  parseIntTest() {
		Integer.parseInt("36");
		Integer.parseInt("3672");
		Integer.parseInt("367290");
		Integer.parseInt("36729036");
		Integer.parseInt("367290367");
		Integer.parseInt("3672903674");
	}

	@Test
	public void  parseResultPriceEtfTest() {
		String text = Utility.readClassPathFile("sample/datagokretfprice.txt", "UTF8");
		log.info("{}", Utility.ellipsis(text, 128, 32));
		ResultDataGoKr.ResultPriceEtf result = Utility.parseJsonLine(text, ResultDataGoKr.ResultPriceEtf.class);
		assertThat(result != null);
		log.info("{}", result.getResponse().getHeader());
		List<PriceEtfDomain> list = result.getResponse().getBody().getItems().getItem();
		for (int cx = 0, sizex = list.size(); cx < sizex; cx++) {
			ResultDataGoKr.PriceEtfDomain item = list.get(cx);
			PriceDomain p = DataGoKrService.toPriceDomain(item);
			if (Utility.samples(cx, sizex, 9)) {
				log.info("{}/{} {}", cx, sizex, item);
				log.info("{}/{} {}", cx, sizex, p);
			}
		}
	}

}
