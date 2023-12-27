package kr.andold.stock.domain;

import org.springframework.beans.BeanUtils;

import kr.andold.stock.entity.ItemEntity;
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
public class ItemDomain extends ItemEntity {
	private String reserved;

	public ItemDomain(String symbol, String code, String dividendCycle, String volumeOfListedShares, Boolean etf,
			String type, String category, String ipoDate) {
		super(null, symbol, code, null, dividendCycle, Utility.parseInteger(volumeOfListedShares, null), etf, type, category,
				Utility.parseDateTime(ipoDate), null, null);
	}

	public void setSymbol(String string, String... args) {
		StringBuffer stringBuffer = new StringBuffer("");
		if (string != null) {
			stringBuffer.append(string.replaceAll("[　\n\"]+", " ").trim());
		}

		if (args == null || args.length == 0) {
			setSymbol(new String(stringBuffer).trim());
			return;
		}

		for (String arg : args) {
			if (arg == null || arg.trim().isEmpty()) {
				continue;
			}

			stringBuffer.append(" ");
			stringBuffer.append(arg.replaceAll("[　]+", "").trim());
		}

		setSymbol(new String(stringBuffer).trim());
	}

	public void setVolumeOfListedShares(String string) {
		setVolumeOfListedShares(parseInteger(string, null));
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

	public void setCategory(String string, String... args) {
		StringBuffer stringBuffer = new StringBuffer("");
		if (string != null) {
			stringBuffer.append(string.replaceAll("[\s\"]+", "").strip());
		}

		if (args == null || args.length == 0) {
			setCategory(new String(stringBuffer).strip());
			return;
		}

		for (String arg : args) {
			if (arg == null || arg.trim().isEmpty()) {
				continue;
			}

			stringBuffer.append(" ");
			stringBuffer.append(arg.replaceAll("[\s\"]+", "").strip());
		}

		setCategory(new String(stringBuffer).trim());
	}

	@Override
	public String toString() {
		return String.format("%s %s", getCode(), getSymbol());
	}

	public static ItemDomain of(ItemEntity entity) {
		ItemDomain domain = new ItemDomain();
		BeanUtils.copyProperties(entity, domain);
		return domain;
	}

	public String key() {
		if (getCode() != null) {
			return getCode();
		}

		return getSymbol();
	}

	public int compare(Object domain) {
		ItemDomain you = (ItemDomain) domain;
		int compared = Utility.compare(getCode(), you.getCode());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getSymbol(), you.getSymbol());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getDividendCycle(), you.getDividendCycle());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getVolumeOfListedShares(), you.getVolumeOfListedShares());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getEtf(), you.getEtf());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getType(), you.getType());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getCategory(), you.getCategory());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getIpoDate(), you.getIpoDate());
		if (compared != 0) {
			return compared;
		}

		return 0;
	}

	public ItemEntity toEntity() {
		ItemEntity entity = new ItemEntity();
		BeanUtils.copyProperties(this, entity);
		return entity;
	}

}
