package kr.andold.stock;

import java.io.File;
import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kr.andold.stock.service.Utility;
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

	@Test
	public void parseExcelHtml() throws IOException {
		String fullPath = String.format("%s/Downloads/%s", System.getProperty("user.home"), "배당내역상세.xls");
		File file = new File(fullPath);
		Document doc = Jsoup.parse(file);
		log.info(Utility.extractStringFromHtmlElement(doc));
	}

}
