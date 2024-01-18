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

import kr.andold.stock.domain.DividendHistoryDomain;
import kr.andold.stock.domain.ItemDomain;
import kr.andold.stock.domain.PriceDomain;
import kr.andold.stock.service.Utility;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class StockParam {
	private List<InnerItemParam> items;
	private List<InnerDividendHistoryParam> histories;
	private List<InnerPriceParam> prices;

	@Data
	public static class InnerItemParam {
		private String symbol;
		private String code;
		private Integer priority;
		private Float priceEarningsRatio;
		private Integer volumeOfListedShares;
		private String type;
		private String category;
		private Date ipoOpen;
		private Date ipoClose;

		public static InnerItemParam of(ItemDomain domain) {
			InnerItemParam param = new InnerItemParam();
			BeanUtils.copyProperties(domain, param);
			return param;
		}

		public ItemDomain toDomain() {
			ItemDomain domain = new ItemDomain();
			BeanUtils.copyProperties(this, domain);
			return domain;
		}

	}

	@Data
	public static class InnerDividendHistoryParam {
		private String code;
		private Date base;
		private Date pay;
		private Integer dividend;

		public static InnerDividendHistoryParam of(DividendHistoryDomain domain) {
			InnerDividendHistoryParam param = new InnerDividendHistoryParam();
			BeanUtils.copyProperties(domain, param);
			return param;
		}

		public DividendHistoryDomain toDomain() {
			DividendHistoryDomain domain = new DividendHistoryDomain();
			BeanUtils.copyProperties(this, domain);
			return domain;
		}

	}

	@Data
	public static class InnerPriceParam {
		private String code;
		private Date base;
		private Integer closing; // 종가
		private Integer market; // 시가
		private Integer high; // 고가
		private Integer low; // 저가
		private Integer volume; // 거래량

		public static InnerPriceParam of(PriceDomain domain) {
			InnerPriceParam param = new InnerPriceParam();
			BeanUtils.copyProperties(domain, param);
			return param;
		}

		public PriceDomain toDomain() {
			PriceDomain domain = new PriceDomain();
			BeanUtils.copyProperties(this, domain);
			return domain;
		}

	}

	@Override
	public String toString() {
		return Utility.toStringJsonPretty(this);
	}

	public StockParam(List<ItemDomain> items, List<DividendHistoryDomain> histories, List<PriceDomain> prices) {
		this.items = new ArrayList<>();
		for (ItemDomain item : items) {
			this.items.add(InnerItemParam.of(item));
		}

		this.histories = new ArrayList<>();
		for (DividendHistoryDomain item : histories) {
			this.histories.add(InnerDividendHistoryParam.of(item));
		}

		this.prices = new ArrayList<>();
		for (PriceDomain item : prices) {
			this.prices.add(InnerPriceParam.of(item));
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
