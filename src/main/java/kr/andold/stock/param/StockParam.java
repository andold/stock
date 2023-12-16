package kr.andold.stock.param;

import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import kr.andold.stock.domain.StockDividendDomain;
import kr.andold.stock.domain.StockDividendHistoryDomain;
import kr.andold.stock.domain.StockItemDomain;
import kr.andold.stock.domain.StockPriceDomain;
import kr.andold.stock.service.Utility;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StockParam {
	private List<ItemParam> items;
	private List<DividendParam> dividends;
	private List<DividendHistoryParam> histories;
	private List<PriceParam> prices;

	@Data
	public static class ItemParam {
		private String symbol;
		private String code;
		private Integer priority;
		private Integer volumeOfListedShares;
		private Boolean etf;
		private String type;
		private String category;
		private Date ipoDate;

		public static ItemParam of(StockItemDomain domain) {
			ItemParam param = new ItemParam();
			BeanUtils.copyProperties(domain, param);
			return param;
		}

		public StockItemDomain toDomain() {
			StockItemDomain domain = new StockItemDomain();
			BeanUtils.copyProperties(this, domain);
			return domain;
		}

	}

	@Data
	public static class DividendParam {
		private String code;
		private Integer currentPrice;
		private Integer dividend;
		private Float priceEarningsRatio;
		private Float dividendPayoutRatio;
		private Integer dividend1YAgo;
		private Integer dividend2YAgo;
		private Integer dividend3YAgo;

		public static DividendParam of(StockDividendDomain domain) {
			DividendParam param = new DividendParam();
			BeanUtils.copyProperties(domain, param);
			return param;
		}

		public StockDividendDomain toDomain() {
			StockDividendDomain domain = new StockDividendDomain();
			BeanUtils.copyProperties(this, domain);
			return domain;
		}

	}

	@Data
	public static class DividendHistoryParam {
		private String code;
		private Date base;
		private Date pay;
		private Integer dividend;

		public static DividendHistoryParam of(StockDividendHistoryDomain domain) {
			DividendHistoryParam param = new DividendHistoryParam();
			BeanUtils.copyProperties(domain, param);
			return param;
		}

		public StockDividendHistoryDomain toDomain() {
			StockDividendHistoryDomain domain = new StockDividendHistoryDomain();
			BeanUtils.copyProperties(this, domain);
			return domain;
		}

	}

	@Data
	public static class PriceParam {
		private String code;
		private Date base;
		private Integer closing; // 종가
		private Integer market; // 시가
		private Integer high; // 고가
		private Integer low; // 저가
		private Integer volume; // 거래량

		public static PriceParam of(StockPriceDomain domain) {
			PriceParam param = new PriceParam();
			BeanUtils.copyProperties(domain, param);
			return param;
		}

		public StockPriceDomain toDomain() {
			StockPriceDomain domain = new StockPriceDomain();
			BeanUtils.copyProperties(this, domain);
			return domain;
		}

	}

	@Override
	public String toString() {
		return Utility.toStringJsonPretty(this);
	}

	public StockParam(List<StockItemDomain> items, List<StockDividendDomain> dividends, List<StockDividendHistoryDomain> histories, List<StockPriceDomain> prices) {
		this.items = new ArrayList<>();
		for (StockItemDomain item : items) {
			this.items.add(ItemParam.of(item));
		}

		this.dividends = new ArrayList<>();
		for (StockDividendDomain item : dividends) {
			this.dividends.add(DividendParam.of(item));
		}

		this.histories = new ArrayList<>();
		for (StockDividendHistoryDomain item : histories) {
			this.histories.add(DividendHistoryParam.of(item));
		}

		this.prices = new ArrayList<>();
		for (StockPriceDomain item : prices) {
			this.prices.add(PriceParam.of(item));
		}

	}

	public static StockParam of(String text) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			return objectMapper.readValue(text, StockParam.class);
		} catch (Exception e) {
			try {
				return objectMapper.readValue(URLDecoder.decode(text, "UTF-8"), StockParam.class);
			} catch (Exception f) {
				e.printStackTrace();
				f.printStackTrace();
			}
		}

		return null;
	}

}
