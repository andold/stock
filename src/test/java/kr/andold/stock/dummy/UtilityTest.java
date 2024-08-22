package kr.andold.stock.dummy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Test;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UtilityTest {
	@Test
	public void test() throws IOException {
		String filename = "/proc/net/dev";
		String content = new String(Files.readAllBytes(Paths.get(filename)));
		for (String line : content.split("\n")) {
			log.info(line.strip().replaceAll("[\\s]+", "\t\t"));
		}
	}

	@Test
	public void testCopyPropertiesNotNull() {
		Object source = null;
		Object target = null;
		Utility.copyPropertiesNotNull(source, target);
		log.info("{} {}", source, target);
	}

}
