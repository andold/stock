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
import kr.andold.stock.param.ItemParam;
import kr.andold.utils.persist.CrudList;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DataGoKrService {
	// KRX에 상장된 종목에 대한 정보조회
	public static final String URL_GET_ITEM_INFO = "https://apis.data.go.kr/1160100/service/GetKrxListedInfoService/getItemInfo?resultType=json";
	// 주가 회사
	private static final String URL_GET_STOCK_PRICE_INFO = "https://apis.data.go.kr/1160100/service/GetStockSecuritiesInfoService/getStockPriceInfo?resultType=json";
	//	주가 ETF
	private static final String URL_GET_ETF_PRICE_INFO = "https://apis.data.go.kr/1160100/service/GetSecuritiesProductInfoService/getETFPriceInfo?resultType=json";

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

	public static String read(String url) {
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
				.closing(Integer.parseInt(domain.getClpr()))
				.market(Integer.parseInt(domain.getMkp()))
				.high(Integer.parseInt(domain.getHipr()))
				.low(Integer.parseInt(domain.getLopr()))
				.volume(Long.parseLong(domain.getTrqu()))
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
		List<String> isinCodes = new ArrayList<>();
		for (DividendHistoryDomain dividend : dividends) {
			String isinCode = dividend.getIsinCode();
			if (isinCode == null || isinCode.isBlank()) {
				log.warn("{} 『isinCode:{}』putDividendHistoryDomain(『#{}』)", Utility.indentMiddle(), dividend, Utility.size(dividends));
				continue;
			}

			isinCodes.add(isinCode);
		}

		List<ItemDomain> items = itemService.search(ItemParam.builder().isinCodes(isinCodes).build());
		Map<String, String> map = new HashMap<>();
		for (ItemDomain item: items) {
			map.put(item.getIsinCode(), item.getCode());
		}
		for (DividendHistoryDomain dividend : dividends) {
			String isinCode = dividend.getIsinCode();
			String code = map.get(isinCode);
			if (code == null || code.isBlank()) {
				log.warn("{} putDividendHistoryDomain(『#{}』) - 『{}:{}』『{}』", Utility.indentMiddle(), Utility.size(dividends), isinCode, code, dividend);
				CrawlItemDetailDataGoKrCompanyJob.regist(JobService.getQueue3(), isinCode);
				dividend.setCode("");
			} else {
				dividend.setCode(code);
			}
		}

		return dividendHistoryService.put(dividends);
	}

	// KRX에 상장된 종목에 대한 정보조회
	public static List<ItemDomain> getItemInfo(String code, String isinCode, ZonedDateTime zdt) {
		log.info("{} 종목정보::getItemInfo(『{}』, 『{}』)", Utility.indentStart(), code, zdt);

		List<ItemDomain> items = new ArrayList<>();
		for (int cx = 0; cx < NUMBER_OF_PAGES; cx++) {
			String url = String.format("%s&serviceKey=%s&numOfRows=%d&pageNo=%d", URL_GET_ITEM_INFO, DataGoKrService.getServiceKey(), NUMBER_OF_ROWS, cx + 1);
			if (code == null && isinCode == null) {
				url = String.format("%s&beginBasDt=%s", url, zdt.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
			} else {
				url = String.format("%s&basDt=%s", url, zdt.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
			}
			if (code != null && !code.isBlank()) {
				url = String.format("%s&likeSrtnCd=%s", url, code);
			}
			if (isinCode != null && !isinCode.isBlank()) {
				url = String.format("%s&isinCd=%s", url, isinCode);
			}
			log.debug("{} 『{}/{}』종목정보::getItemInfo(『{}』, 『{}』) - 『{}』", Utility.indentMiddle(), cx, NUMBER_OF_PAGES, code, zdt, url);

			String html = DataGoKrService.read(url);
			log.debug("{} 『{}/{}』종목정보::getItemInfo(『{}』, 『{}』) - 『{}』", Utility.indentMiddle(), cx, NUMBER_OF_PAGES, code, zdt, Utility.ellipsis(html, 128, 32));

			ResultDataGoKr.ResultItem result = Utility.parseJsonLine(html, ResultDataGoKr.ResultItem.class);
			List<ResultDataGoKr.ItemDomain> list = result.getResponse().getBody().getItems().getItem();
			if (list == null || list.isEmpty()) {
				break;
			}

			for (int cy = 0, sizey = list.size(); cy < sizey; cy++) {
				ResultDataGoKr.ItemDomain item = list.get(cy);
				ItemDomain domain = DataGoKrService.toItemDomain(item);
				items.add(domain);
				if (Utility.samples(cy,  sizey, 6)) {
					// 디버그
					log.debug("{} 『{}/{}:{}/{}』종목정보::getItemInfo(『{}』, 『{}』) - 『{}』", Utility.indentMiddle(), cx, NUMBER_OF_PAGES, cy, sizey, code, zdt, Utility.ellipsis(html, 128, 32));
				}
			}

			if (result.getResponse().getBody().getNumOfRows() < NUMBER_OF_ROWS) {
				break;
			}
		}

		log.info("{} 『#{}』종목정보::getItemInfo(『{}』, 『{}』)", Utility.indentEnd(), Utility.size(items), code, zdt);
		return items;
	}

	public static List<PriceDomain> getStockPriceInfo(String code, ZonedDateTime zdt) {
		log.info("{} 주식시세::getStockPriceInfo(『{}』, 『{}』)", Utility.indentStart(), code, zdt);
		long started = System.currentTimeMillis();

		List<PriceDomain> prices = new ArrayList<>();
		for (int cx = 0; cx < NUMBER_OF_PAGES; cx++) {
			String url = String.format("%s&serviceKey=%s&numOfRows=%d&pageNo=%d&beginBasDt=%s", URL_GET_STOCK_PRICE_INFO, DataGoKrService.getServiceKey(), NUMBER_OF_ROWS, cx + 1, zdt.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
			if (code != null && !code.isBlank()) {
				url = String.format("%s&likeSrtnCd=%s", url, code);
			}
			log.debug("{} 『{}/{}』주식시세::getStockPriceInfo(『{}』, 『{}』) - 『{}』", Utility.indentMiddle(), cx, NUMBER_OF_PAGES, code, zdt, url);

			String html = read(url);
			log.debug("{} 『{}/{}』주식시세::getStockPriceInfo(『{}』)- 『{}』", Utility.indentMiddle(), cx, NUMBER_OF_PAGES, zdt, Utility.ellipsis(html, 128, 64));
			ResultDataGoKr.ResultPriceCompany result = Utility.parseJsonLine(html, ResultDataGoKr.ResultPriceCompany.class);
			if (result == null) {
				log.debug("{} 『NULL:{}/{}』주식시세::getStockPriceInfo(『{}』, 『{}』)", Utility.indentMiddle(), cx, NUMBER_OF_PAGES, code, zdt);
				break;
			}

			List<ResultDataGoKr.PriceCompanyDomain> list = result.getResponse().getBody().getItems().getItem();
			if (list == null || list.isEmpty()) {
				log.debug("{} 『BLANK:{}/{}』주식시세::getStockPriceInfo(『{}』, 『{}』)", Utility.indentMiddle(), cx, NUMBER_OF_PAGES, code, zdt);
				break;
			}
			for (int cy = 0, sizey = list.size(); cy < sizey; cy++) {
				ResultDataGoKr.PriceCompanyDomain item = list.get(cy);
				PriceDomain price = DataGoKrService.toPriceDomain(item);
				prices.add(price);
				if (Utility.samples(cy, sizey, 6)) {
					log.debug("{} 『{}/{}:{}/{}:{}』주식시세::getStockPriceInfo(『{}』, 『{}』)", Utility.indentMiddle(), cy, sizey, cx, NUMBER_OF_PAGES, price, code, zdt);
				}
			}
			if (result.getResponse().getBody().getNumOfRows() < NUMBER_OF_ROWS) {
				break;
			}
		}

		log.info("{} 『#{}』주식시세::getStockPriceInfo(『{}』, 『{}』)", Utility.indentEnd(), Utility.size(prices), code, zdt, Utility.toStringPastTimeReadable(started));
		return prices;
	}

	public static List<PriceDomain> getETFPriceInfo(String code, ZonedDateTime zdt) {
		log.info("{} 주식시세::getETFPriceInfo(『{}』, 『{}』)", Utility.indentStart(), code, zdt);
		long started = System.currentTimeMillis();

		List<PriceDomain> prices = new ArrayList<>();
		for (int cx = 0; cx < NUMBER_OF_PAGES; cx++) {
			String url = String.format("%s&serviceKey=%s&numOfRows=%d&pageNo=%d&beginBasDt=%s", URL_GET_ETF_PRICE_INFO, DataGoKrService.getServiceKey(), NUMBER_OF_ROWS, cx + 1, zdt.format(DateTimeFormatter.ofPattern("yyyyMMdd")));
			if (code != null && !code.isBlank()) {
				url = String.format("%s&likeSrtnCd=%s", url, code);
			}
			log.debug("{} 주식시세::getETFPriceInfo(『{}』, 『{}』) - 『{}/{}』『{}』", Utility.indentMiddle(), code, zdt, cx, NUMBER_OF_PAGES, url);

			String html = read(url);
			log.debug("{} 주식시세::getETFPriceInfo(『{}』)- 『{}』", Utility.indentMiddle(), zdt, Utility.ellipsis(html, 128, 64));
			ResultDataGoKr.ResultPriceCompany result = Utility.parseJsonLine(html, ResultDataGoKr.ResultPriceCompany.class);
			if (result == null) {
				log.debug("{} 『NULL』주식시세::getETFPriceInfo(『{}』, 『{}』) - 『{}/{}』", Utility.indentMiddle(), code, zdt, cx, NUMBER_OF_PAGES);
				break;
			}

			List<ResultDataGoKr.PriceCompanyDomain> list = result.getResponse().getBody().getItems().getItem();
			if (list == null || list.isEmpty()) {
				log.debug("{} 『BLANK』주식시세::getETFPriceInfo(『{}』, 『{}』) - 『{}/{}』", Utility.indentMiddle(), code, zdt, cx, NUMBER_OF_PAGES);
				break;
			}
			for (int cy = 0, sizey = list.size(); cy < sizey; cy++) {
				ResultDataGoKr.PriceCompanyDomain item = list.get(cy);
				PriceDomain price = DataGoKrService.toPriceDomain(item);
				prices.add(price);
				if (Utility.samples(cy, sizey, 6)) {
					log.debug("{} 『{}/{}:{}/{}:{}』주식시세::getETFPriceInfo(『{}』, 『{}』)", Utility.indentMiddle(), cy, sizey, cx, NUMBER_OF_PAGES, price, code, zdt);
				}
			}
			if (result.getResponse().getBody().getNumOfRows() < NUMBER_OF_ROWS) {
				break;
			}
		}

		log.info("{} 『#{}』주식시세::getETFPriceInfo(『{}』, 『{}』)", Utility.indentEnd(), Utility.size(prices), code, zdt, Utility.toStringPastTimeReadable(started));
		return prices;
	}

}
