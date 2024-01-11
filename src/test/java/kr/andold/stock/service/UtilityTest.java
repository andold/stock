package kr.andold.stock.service;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UtilityTest {

	@Test
	public void testCopyPropertiesNotNull() {
		Object source = null;
		Object target = null;
		Utility.copyPropertiesNotNull(source, target);
		log.info("{} {}", source, target);
	}

}
