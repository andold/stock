package kr.andold.stock.domain;

import java.net.URLDecoder;
import org.springframework.beans.BeanUtils;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import kr.andold.stock.entity.DividendEntity;
import kr.andold.stock.service.Utility;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class DividendDomain extends DividendEntity {
	private String etc;

	public DividendDomain(String code, String currentPrice,
		String baseMonth, String dividend, String priceEarningsRatio, String dividendPayoutRatio,
		String roe, String per, String pbr,
		String dividend1YAgo, String dividend2YAgo, String dividend3YAgo) {
		super(null,
			code, parseInteger(currentPrice, null),

			Utility.parseDateTime(baseMonth == null ? null : baseMonth.replaceAll("배당수익률l", "")),
			parseInteger(dividend, null),
			parseFloat(priceEarningsRatio, null),
			parseFloat(dividendPayoutRatio, null),

			parseFloat(roe, null),
			parseFloat(per, null),
			parseFloat(pbr, null),

			parseInteger(dividend1YAgo, null),
			parseInteger(dividend2YAgo, null),
			parseInteger(dividend3YAgo, null),

			null, null
		);
	}

	private static Integer parseInteger(String string, Integer defaultValue) {
		if (string == null) {
			return defaultValue;
		}

		try {
			return Integer.parseInt(string.replaceAll("[,주원]", ""));
		} catch (NumberFormatException e) {
			log.trace("NumberFormatException:: {} {}", string, e.getLocalizedMessage());
		}

		return defaultValue;
	}

	private static Float parseFloat(String string, Float defaultValue) {
		if (string == null) {
			return defaultValue;
		}

		try {
			return Float.parseFloat(string.replaceAll("[,]", ""));
		} catch (NumberFormatException e) {
			log.trace("NumberFormatException:: {} {}", string, e.getLocalizedMessage());
		}

		return defaultValue;
	}

	@Override
	public String toString() {
		return Utility.toStringJson(this);
	}

	public void setTitle(String string, String... args) {
		StringBuffer stringBuffer = new StringBuffer("");
		if(string != null) {
			stringBuffer.append(string.replaceAll("[　\n\"]+", " ").trim());
		}
		
		if(args == null || args.length == 0) {
			setTitle(new String(stringBuffer).trim());
			return;
		}
		
		for (String arg : args) {
			if(arg == null || arg.trim().isEmpty()) {
				continue;
			}
			
			stringBuffer.append(" ");
			stringBuffer.append(arg.replaceAll("[　]+", "").trim());
		}

		setTitle(new String(stringBuffer).trim());
	}

	public static DividendDomain of(String string) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.setSerializationInclusion(Include.NON_NULL);
		objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
		objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		try {
			return objectMapper.readValue(string, DividendDomain.class);
		} catch (Exception e) {
			try {
				return objectMapper.readValue(URLDecoder.decode(string, "UTF-8"), DividendDomain.class);
			} catch (Exception f) {
				log.error("Exception:: - {}", e.getLocalizedMessage());
				log.error("Exception:: - {}", f.getLocalizedMessage());
			}
		}

		return null;
	}

	public static DividendDomain of(DividendEntity entity) {
		DividendDomain domain = new DividendDomain();
		BeanUtils.copyProperties(entity, domain);
		return domain;
	}

	public String key() {
		return String.format("%s", getCode());
	}

	public DividendEntity toEntity() {
		DividendEntity entity = new DividendEntity();
		BeanUtils.copyProperties(this, entity);
		return entity;
	}

	public int compare(DividendDomain you) {
		int compared = Utility.compare(key(), you.key());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getCode(), you.getCode());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getCurrentPrice(), you.getCurrentPrice());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getBaseMonth(), you.getBaseMonth());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getDividend(), you.getDividend());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getPriceEarningsRatio(), you.getPriceEarningsRatio());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getDividendPayoutRatio(), you.getDividendPayoutRatio());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getRoe(), you.getRoe());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getPer(), you.getPer());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getPbr(), you.getPbr());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getDividend1YAgo(), you.getDividend1YAgo());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getDividend2YAgo(), you.getDividend2YAgo());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getDividend3YAgo(), you.getDividend3YAgo());
		if (compared != 0) {
			return compared;
		}

		return 0;
	}

}
