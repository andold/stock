package kr.andold.stock.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.domain.ResultDataGoKr;
import kr.andold.utils.Utility;
import kr.andold.utils.persist.CrudList;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DataGoKrService {
	@Autowired private ItemService itemService;
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

	public static PriceDomain toPriceDomain(ResultDataGoKr.PriceEtfDomain domain) {
		return PriceDomain.builder()
				.code(domain.getSrtnCd())
				.base(Utility.parseDateTime(domain.getBasDt()))
				.closing(domain.getClpr())
				.market(domain.getMkp())
				.high(domain.getHipr())
				.low(domain.getLopr())
				.volume(domain.getTrqu())
				.build();
	}

	public static PriceDomain toPriceDomain(ResultDataGoKr.PriceCompanyDomain domain) {
		return PriceDomain.builder()
				.code(domain.getSrtnCd())
				.base(Utility.parseDateTime(domain.getBasDt()))
				.closing(domain.getClpr())
				.market(domain.getMkp())
				.high(domain.getHipr())
				.low(domain.getLopr())
				.volume(domain.getTrqu())
				.build();
	}

	public CrudList<PriceDomain> putPrice(List<PriceDomain> list) {
		return priceService.put(list);
	}

	public static ItemDomain toItemDomain(ResultDataGoKr.ItemDomain domain) {
		return ItemDomain.builder()
				.code(domain.getSrtnCd())
				.isinCode(domain.getIsinCd())
				.symbol(domain.getItmsNm())
				.type(domain.getMrktCtg())
				.build();
	}

	public CrudList<ItemDomain> putItem(List<ItemDomain> list) {
		return itemService.put(list);
	}

}
