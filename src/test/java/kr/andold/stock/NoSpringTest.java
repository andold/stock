package kr.andold.stock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kr.andold.utils.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NoSpringTest {
	@BeforeEach
	public void before() {
		log.info(Utility.HR);
	}

	@Test
	public void parseInteger() {
		log.info("{}", Integer.parseInt("1.0".replaceAll("\\.[0-9]+", "")));
	}

}
