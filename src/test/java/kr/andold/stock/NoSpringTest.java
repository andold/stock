package kr.andold.stock;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.domain.ResultDataGoKr;
import kr.andold.stock.domain.ResultDataGoKr.DividendDomain;
import kr.andold.stock.service.DataGoKrService;
import kr.andold.stock.service.Utility;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NoSpringTest {
	public static final String BASE_URL = "http://apis.data.go.kr/1160100/service/GetStocIssuInfoService_V2/getItemBasiInfo_V2?pageNo=1&numOfRows=16&resultType=json";
	public static final String SERVICE_KEY = "O9RZosIDyY7W71otFMrTAVDzMEB91E%2F4FqvShmAqEqHvbwvhrdA8kLjN%2Bz2e5KSgxzwAW36fjrPl3Um%2Fda%2FbKA%3D%3D";

	// 주가지수시세
	public static final String URL_STOCK_INDEX_PRICE = "https://apis.data.go.kr/1160100/service/GetMarketIndexInfoService/getStockMarketIndex?resultType=json&pageNo=1";
	// 파생상품지수시세
	public static final String URL_DERIVE_PRODUCT_INDEX_PRICE = "https://apis.data.go.kr/1160100/service/GetMarketIndexInfoService/getDerivationProductMarketIndex?pageNo=1&resultType=json";
	public static final String URL_STOCK_PRICE = "https://apis.data.go.kr/1160100/service/GetStockSecuritiesInfoService/getStockPriceInfo?resultType=json&pageNo=1";
	// ETF시세
	public static final String URL_ETF_PRICE = "https://apis.data.go.kr/1160100/service/GetSecuritiesProductInfoService/getETFPriceInfo?resultType=json";
	// 배당정보조회
	public static final String URL_DIVIDEND = "http://apis.data.go.kr/1160100/service/GetStocDiviInfoService/getDiviInfo?resultType=json";
	// KRX에 상장된 종목에 대한 정보조회
	public static final String URL_ITEM = "https://apis.data.go.kr/1160100/service/GetKrxListedInfoService/getItemInfo?resultType=json";

	// ETF시세
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ResultPriceEtf {
		private ResultDataGoKr.ResponseDomain<ResultDataGoKr.PriceEtfDomain> response;
	}
	
	// 파생상품지수시세
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ResultPriceDeriveProductIndex {
		private ResultDataGoKr.ResponseDomain<ResultDataGoKr.DeriveProductIndexDomain> response;
	}
	
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ResultPriceStockIndex {
		private ResultDataGoKr.ResponseDomain<ResultDataGoKr.PriceStockIndexDomain> response;
	}
	
	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public static class ResultPriceStock {
		private ResultDataGoKr.ResponseDomain<ResultDataGoKr.PriceStockDomain> response;
	}
	
	@BeforeEach
	public void before() {
		log.info(Utility.HR);
	}

	@Test
	public void regularExpressionLineFirstTest() {
		String origin = "A0123";
		log.info("{} {}", origin, origin.replaceFirst("^A", ""));
	}

	// KRX에 상장된 종목에 대한 정보조회
	@Test
	public void itemTest() {
		int numOfRows = 1024 * 8;
		int pageNo = 1;
		ZonedDateTime oneWeekAgo = ZonedDateTime.now().minusWeeks(1);
		ZonedDateTime start = oneWeekAgo;

//		String url = String.format("%s&isinCd=KR7000100008&serviceKey=%s&numOfRows=%d&pageNo=%d&beginBasDt=%s", URL_ITEM, SERVICE_KEY, numOfRows, pageNo, start.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
		String url = String.format("%s&serviceKey=%s&numOfRows=%d&pageNo=%d&beginBasDt=%s", URL_ITEM, SERVICE_KEY, numOfRows, pageNo, start.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
		log.info(url);
		String html = read(url);
		log.info(Utility.ellipsisEscape(html, 256, 128));
		ResultDataGoKr.ResultItem result = Utility.parseJsonLine(html, ResultDataGoKr.ResultItem.class);
//		log.info("result: {}", result);
		log.info(Utility.HR);
		List<ResultDataGoKr.ItemDomain> list = result.getResponse().getBody().getItems().getItem();
		for (int cx = 0, sizex = list.size(); cx < sizex; cx++) {
			ResultDataGoKr.ItemDomain item = list.get(cx);
			ItemDomain domain = DataGoKrService.toItemDomain(item);
			if (item.getItmsNm().contains("포스코")) {
				// 디버그
				log.info("{} CrawlItemLatestDataGoKrCompanyJob::main(『{}』)- 『{}』『{}』", Utility.indentMiddle(), start, item, domain);
			}
//			log.info("{}/{} {}", cx, sizex, item);
//			log.info("{}/{} {}", cx, sizex, domain);
		}
	}

	// 배당정보조회
	@Test
	public void dividendTest() {
		int numOfRows = 4;
		int pageNo = 1;
		String url = String.format("%s&serviceKey=%s&numOfRows=%d&pageNo=%d", URL_DIVIDEND, SERVICE_KEY, numOfRows, pageNo);
		log.info(url);
		String html = read(url);
		log.info(Utility.ellipsisEscape(html, 256, 128));
		ResultDataGoKr.ResultDividend result = Utility.parseJsonLine(html, ResultDataGoKr.ResultDividend.class);
		log.info("result: {}", result);
		log.info(Utility.HR);
		List<ResultDataGoKr.DividendDomain> list = result.getResponse().getBody().getItems().getItem();
		for (int cx = 0, sizex = list.size(); cx < sizex; cx++) {
			ResultDataGoKr.DividendDomain item = list.get(cx);
			DividendHistoryDomain p = toDividendHistoryDomain(item);
			if (p.getDividend() <= 0) {
				continue;
			}
//			log.info("{}/{} {}", cx, sizex, item);
			log.info("{}/{} {}", cx, sizex, p);
		}
	}

	// ETF시세
	@Test
	public void etfPriceTest() {
		int numOfRows = 8;
		int pageNo = 1024;
		String url = String.format("%s&beginBasDt=20250612&serviceKey=%s&numOfRows=%d&pageNo=%d", URL_ETF_PRICE, SERVICE_KEY, numOfRows, pageNo);
		log.info(url);
		String html = read(url);
		log.info(Utility.ellipsisEscape(html, 128, 64));
		ResultPriceEtf price = Utility.parseJsonLine(html, ResultPriceEtf.class);
		log.info(Utility.HR);
		List<ResultDataGoKr.PriceEtfDomain> list = price.getResponse().getBody().getItems().getItem();
		for (int cx = 0, sizex = list.size(); cx < sizex; cx++) {
			ResultDataGoKr.PriceEtfDomain item = list.get(cx);
			PriceDomain p = toPriceDomain(item);
			log.info("{}/{} {}", cx, sizex, item);
			log.info("{}/{} {}", cx, sizex, p);
		}
	}

	private DividendHistoryDomain toDividendHistoryDomain(DividendDomain item) {
		return DividendHistoryDomain.builder()
				.isinCode(item.getIsinCd())
				.name(item.getIsinCdNm())
				.base(Utility.parseDateTime(item.getDvdnBasDt()))
				.pay(Utility.parseDateTime(item.getCashDvdnPayDt()))
				.dividend(Math.round(item.getStckGenrDvdnAmt()))
				.build();
	}

	public PriceDomain toPriceDomain(ResultDataGoKr.PriceEtfDomain item) {
		return PriceDomain.builder()
				.code(item.getSrtnCd())
				.base(Utility.parseDateTime(item.getBasDt()))
				.closing(item.getClpr())
				.market(item.getMkp())
				.high(item.getHipr())
				.low(item.getLopr())
				.volume(item.getTrqu())
				.build();
	}

	// 파생상품지수시세
	@Test
	public void deriveProductIndexPriceTest() {
		int numOfRows = 1024 * 16;
		String url = String.format("%s&basDt=20250613&serviceKey=%s&numOfRows=%d", URL_DERIVE_PRODUCT_INDEX_PRICE, SERVICE_KEY, numOfRows);
		log.info(url);
		String html = read(url);
		log.info(Utility.ellipsisEscape(html, 128, 64));
		ResultPriceStock price = Utility.parseJsonLine(html, ResultPriceStock.class);
		log.info(Utility.HR);
		List<ResultDataGoKr.PriceStockDomain> list = price.getResponse().getBody().getItems().getItem();
		for (int cx = 0, sizex = list.size(); cx < sizex; cx++) {
			ResultDataGoKr.PriceStockDomain item = list.get(cx);
			if (item.getMrktCtg().equalsIgnoreCase("KOSDAQ")) {
				continue;
			}

			log.info("{}/{} {}", cx, sizex, item);
		}
	}

	@Test
	public void priceStockTest() {
		int numOfRows = 1024 * 16;
		String url = String.format("%s&basDt=20250613&serviceKey=%s&numOfRows=%d", URL_STOCK_PRICE, SERVICE_KEY, numOfRows);
		log.info(url);
		String html = read(url);
		log.info(Utility.ellipsisEscape(html, 128, 64));
		ResultPriceStock price = Utility.parseJsonLine(html, ResultPriceStock.class);
		log.info(Utility.HR);
		List<ResultDataGoKr.PriceStockDomain> list = price.getResponse().getBody().getItems().getItem();
		for (int cx = 0, sizex = list.size(); cx < sizex; cx++) {
			ResultDataGoKr.PriceStockDomain item = list.get(cx);
			if (item.getMrktCtg().equalsIgnoreCase("KOSDAQ")) {
				continue;
			}

			log.info("{}/{} {}", cx, sizex, item);
		}
	}

	// 주가지수시세
	@Test
	public void priceStockIndexTest() {
		int numOfRows = 1024 * 16;
		String url = String.format("%s&basDt=20250613&serviceKey=%s&numOfRows=%d", URL_STOCK_INDEX_PRICE, SERVICE_KEY, numOfRows);
		log.info(url);
		String html = read(url);
		log.info(Utility.ellipsis(html, 64, 64));
		ResultPriceStockIndex price = Utility.parseJsonLine(html, ResultPriceStockIndex.class);
		log.info(Utility.HR);
		List<ResultDataGoKr.PriceStockIndexDomain> list = price.getResponse().getBody().getItems().getItem();
		for (int cx = 0, sizex = list.size(); cx < sizex; cx++) {
			ResultDataGoKr.PriceStockIndexDomain item = list.get(cx);
//			if (item.getMrktCtg().equalsIgnoreCase("KOSDAQ")) {
//				continue;
//			}

			log.info("{}/{} {}", cx, sizex, item);
		}
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
	public void openApiDataGoKr() throws IOException {
		@SuppressWarnings("deprecation")
		URL url = new URL(String.format("%s&serviceKey=%s", BASE_URL, SERVICE_KEY));
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("GET");
        int responseCode = connection.getResponseCode();
        log.info("responseCode {}", responseCode);

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        StringBuffer stringBuffer = new StringBuffer();
        String inputLine;

        while ((inputLine = bufferedReader.readLine()) != null)  {
            stringBuffer.append(inputLine);
        }
        bufferedReader.close();

        String response = stringBuffer.toString();
        log.info(response);

	}

	@Test
	public void openApiDataGoKr1() throws IOException, InterruptedException {
        String url = String.format("%s&serviceKey=%s", BASE_URL, SERVICE_KEY);
        // 1. URI 객체 생성 (URL 인코딩)
        URI uri = URI.create(url);  // URI.create()는 자동으로 인코딩합니다.

        // 2. HttpClient 생성
        HttpClient client = HttpClient.newHttpClient();

        // 3. HttpRequest 생성
        HttpRequest request = HttpRequest.newBuilder()
                .uri(uri)
                .GET() // GET 요청 설정
                .build();

        // 4. 요청 보내고 응답 받기
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // 5. 응답 처리
        if (response.statusCode() == 200) {
            String responseBody = response.body();
            log.info("응답 {}", responseBody);
    		ResultDataGoKr.ResultItem result = Utility.parseJsonLine(responseBody, ResultDataGoKr.ResultItem.class);
            log.info("result {}", result);
        } else {
            log.info("실패 {}", response.statusCode());
        }	
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
