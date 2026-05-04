package kr.andold.stock.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kr.andold.stock.service.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
class ResultDataGoKrTest {
	@BeforeEach
	public void before() {
		log.info(Utility.HR);
	}

	@Test
	public void  parseResultPriceEtfTest() {
		String text = Utility.readClassPathFile("sample/datagokretfprice.txt", "UTF8");
		log.info("{}", Utility.ellipsis(text, 128, 32));
		ResultDataGoKr.ResultPriceEtf result = Utility.parseJsonLine(text, ResultDataGoKr.ResultPriceEtf.class);
		assertThat(result != null);
		log.info("{}", result.getResponse().getHeader());
	}

}
