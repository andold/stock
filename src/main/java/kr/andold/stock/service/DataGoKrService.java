package kr.andold.stock.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.domain.ResultDataGoKr.PriceCompanyDomain;
import kr.andold.stock.domain.ResultDataGoKr.PriceEtfDomain;
import kr.andold.utils.Utility;
import kr.andold.utils.persist.CrudList;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DataGoKrService {
	@Autowired private PriceService priceService;

	@Getter private static String serviceKey;
	@Value("${application.service.key.apis.data.go.kr}")
	public void setServiceKey(String value) {
		log.info("{} setServiceKey(『{}』)", Utility.indentMiddle(), value);
		serviceKey = value;
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

	public PriceDomain toPriceDomain(PriceEtfDomain item) {
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

	public PriceDomain toPriceDomain(PriceCompanyDomain item) {
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

	public CrudList<PriceDomain> putPrice(List<PriceDomain> prices) {
		return priceService.put(prices);
	}

}
