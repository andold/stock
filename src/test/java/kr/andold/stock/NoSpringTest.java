package kr.andold.stock;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Set;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kr.andold.stock.domain.ResultDataGoKr;
import kr.andold.stock.service.Utility;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NoSpringTest {
	@BeforeEach
	public void before() {
		log.info(Utility.HR);
	}

	@Test
	public void  formatDoubleTest() {
		log.info("소수점 둘째 자리까지 표시 {:.2f}", Math.random());
		log.info("소수점 둘째 자리까지 표시 {%.2f}", Math.random());
		if (Arrays.asList(1, 2, 3, 4, 5).contains(3)) {
			log.info("포함 {}", Set.of(1, 2, 3, 4, 5));
		}
		if (Set.of(1, 2, 3, 4, 5).contains(3)) {
			log.info("포함 {}", Set.of(1, 2, 3, 4, 5));
		}
	}

	@Test
	public void  truncateTest() {
		log.info("{}", ZonedDateTime.now().minusYears(1).withDayOfMonth(1).withMonth(1).truncatedTo(ChronoUnit.DAYS));
	}

	@Test
	public void  classNameTest() {
		String str = "Hello";
		log.info("{}", str.getClass().getName());
		log.info("{}", this.getClass().getName());
	}

	@Test
	public void regularExpressionLineFirstTest() {
		String origin = "A0123";
		log.info("{} {}", origin, origin.replaceFirst("^A", ""));
	}

	public String read(String url) {
		try {
	        URI uri = URI.create(url);  // URI.create()는 자동으로 인코딩합니다.
	        HttpClient client = HttpClient.newHttpClient();
	        HttpRequest request = HttpRequest.newBuilder()
	                .uri(uri)
	                .GET()
	                .build();
	        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
	        if (response.statusCode() == 200) {
	            String responseBody = response.body();
	            return responseBody;
	        }	
		} catch (Exception e) {
			return "Exception";
		}

		return "";
	}

	@Test
	public void parseJsonTest() {
		String text = Utility.readClassPathFile("sample/items.json");
		ResultDataGoKr.ResultItem result = Utility.parseJsonLine(text, ResultDataGoKr.ResultItem.class);
		log.info("{}", result);
		log.info("{}", result.getResponse().getBody().getItems().getItem());
	}

	@Test
	public void parseInteger() {
		log.info("{}", Integer.parseInt("1.0".replaceAll("\\.[0-9]+", "")));
	}

	@Test
	public void parseExcelHtml() throws IOException {
		String string = Utility.readClassPathFile("배당내역상세.xls", "UTF-8");
		Document doc = Jsoup.parse(string);
		log.info(Utility.extractStringFromHtmlElement(doc));
	}

}
