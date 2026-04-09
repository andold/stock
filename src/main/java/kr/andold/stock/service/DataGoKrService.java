package kr.andold.stock.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.domain.ResultDataGoKr;
import kr.andold.stock.domain.ResultDataGoKr.DividendDomain;
import kr.andold.stock.domain.ResultDataGoKr.ItemDetailDomain;
import kr.andold.stock.job.CrawlItemDetailDataGoKrCompanyJob;
import kr.andold.utils.Utility;
import kr.andold.utils.persist.CrudList;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DataGoKrService {
	// 주식시세
	public static final String URL_GET_STOCK_PRICE_INFO = "https://apis.data.go.kr/1160100/service/GetStockSecuritiesInfoService/getStockPriceInfo?resultType=json";

	private static final int NUMBER_OF_ROWS = 1024 * 8;
	private static final int NUMBER_OF_PAGES = 4;

	@Autowired private DividendHistoryService dividendHistoryService;
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
		String srtnCd = domain.getSrtnCd();
		return ItemDomain.builder()
				.code(srtnCd == null ? "" : srtnCd.replaceFirst("^A", ""))
				.isinCode(domain.getIsinCd())
				.symbol(domain.getItmsNm())
				.type(domain.getMrktCtg())
				.build();
	}

	public static ItemDomain toItemDomain(ItemDetailDomain domain) {
		return ItemDomain.builder()
				.code(domain.getItmsShrtnCd())
				.isinCode(domain.getIsinCd())
				.symbol(domain.getIsinCdNm())
				.volumeOfListedShares(domain.getIssuStckCnt())
				.ipoOpen(Utility.parseDateTime(domain.getLstgDt()))
				.ipoClose(Utility.parseDateTime(domain.getLstgAbolDt()))
				.build();
	}

	public CrudList<ItemDomain> putItem(List<ItemDomain> list) {
		return itemService.put(list);
	}

	public static DividendHistoryDomain toDividendHistoryDomain(DividendDomain domain) {
		return DividendHistoryDomain.builder()
				.isinCode(domain.getIsinCd())
				.name(domain.getIsinCdNm())
				.base(Utility.parseDateTime(domain.getDvdnBasDt()))
				.pay(Utility.parseDateTime(domain.getCashDvdnPayDt()))
				.dividend(Math.round(domain.getStckGenrDvdnAmt()))
				.build();
	}

	public CrudList<DividendHistoryDomain> putDividendHistoryDomain(List<DividendHistoryDomain> dividends) {
		List<ItemDomain> items = itemService.search(null);
		Map<String, String> map = new HashMap<>();
		for (ItemDomain item: items) {
			map.put(item.getIsinCode(), item.getCode());
		}
		for (DividendHistoryDomain dividend : dividends) {
			String isinCode = dividend.getIsinCode();
			String code = map.get(isinCode);
			if (code == null) {
				log.warn("{} putDividendHistoryDomain(『#{}』) - 『{}:{}』『{}』", Utility.indentMiddle(), Utility.size(dividends), isinCode, code, dividend);
				CrawlItemDetailDataGoKrCompanyJob.regist(JobService.getQueue3(), isinCode);
				dividend.setCode("");
			} else {
				dividend.setCode(code);
			}
		}
		return dividendHistoryService.put(dividends);
	}

	public List<PriceDomain> getStockPriceInfo(String code, ZonedDateTime zdt) {
		log.info("{} 주식시세::getStockPriceInfo(『{}』, 『{}』)", Utility.indentStart(), code, zdt);
		long started = System.currentTimeMillis();

		List<PriceDomain> prices = new ArrayList<>();
		for (int cx = 0; cx < NUMBER_OF_PAGES; cx++) {
			String url = String.format("%s&serviceKey=%s&numOfRows=%d&pageNo=%d&beginBasDt=%s", URL_GET_STOCK_PRICE_INFO, DataGoKrService.getServiceKey(), NUMBER_OF_ROWS, cx + 1, zdt.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
			if (code != null && !code.isBlank()) {
				url = String.format("%s&likeSrtnCd=%s", url, code);
			}
			log.debug("{} 주식시세::getStockPriceInfo(『{}』, 『{}』) - 『{}/{}』『{}』", Utility.indentMiddle(), code, zdt, cx, NUMBER_OF_PAGES, url);

			String html = read(url);
			log.debug("{} 주식시세::getStockPriceInfo(『{}』)- 『{}』", Utility.indentMiddle(), zdt, Utility.ellipsis(html, 128, 64));
			ResultDataGoKr.ResultPriceCompany result = Utility.parseJsonLine(html, ResultDataGoKr.ResultPriceCompany.class);
			if (result == null) {
				log.debug("{} 『NULL』주식시세::getStockPriceInfo(『{}』, 『{}』) - 『{}/{}』", Utility.indentMiddle(), code, zdt, cx, NUMBER_OF_PAGES);
				break;
			}

			List<ResultDataGoKr.PriceCompanyDomain> list = result.getResponse().getBody().getItems().getItem();
			if (list == null || list.isEmpty()) {
				log.debug("{} 『BLANK』주식시세::getStockPriceInfo(『{}』, 『{}』) - 『{}/{}』", Utility.indentMiddle(), code, zdt, cx, NUMBER_OF_PAGES);
				break;
			}
			for (int cy = 0, sizey = list.size(); cy < sizey; cy++) {
				ResultDataGoKr.PriceCompanyDomain item = list.get(cy);
				PriceDomain price = DataGoKrService.toPriceDomain(item);
				prices.add(price);
				if (Math.random() < (16.0 / sizey)) {
					log.debug("{} 『{}』주식시세::getStockPriceInfo(『{}』, 『{}』) - 『{}/{}』『{}/{}』", Utility.indentMiddle(), price, code, zdt, cx, NUMBER_OF_PAGES, cy, sizey);
				}
			}
		}

		log.info("{} 『#{}』주식시세::getStockPriceInfo(『{}』, 『{}』)", Utility.indentEnd(), Utility.size(prices), code, zdt, Utility.toStringPastTimeReadable(started));
		return prices;
	}

}
