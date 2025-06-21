package kr.andold.stock.domain;

import org.springframework.beans.BeanUtils;

import kr.andold.stock.entity.ItemEntity;
import kr.andold.utils.Utility;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class ItemDomain extends ItemEntity implements CommonBlockDomain<ItemDomain, ItemEntity> {
	@Getter @Setter
	private String reserved;

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

	@Override
	public int compare(ItemDomain domain) {
		ItemDomain you = (ItemDomain) domain;
		int compared = Utility.compare(getCode(), you.getCode());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getSymbol(), you.getSymbol());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getPriority(), you.getPriority());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getPriceEarningsRatio(), you.getPriceEarningsRatio());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getVolumeOfListedShares(), you.getVolumeOfListedShares());
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

		compared = Utility.compare(getIpoOpen(), you.getIpoOpen());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getIpoClose(), you.getIpoClose());
		if (compared != 0) {
			return compared;
		}

		return 0;
	}

	@Override
	public int compareIfNotNull(ItemDomain before) {
		int compared = Utility.compare(getCode(), before.getCode());
		if (compared != 0) {
			return compared;
		}

		if (getSymbol() != null) {
			compared = Utility.compare(getSymbol(), before.getSymbol());
			if (compared != 0) {
				return compared;
			}
		}

		if (getIsinCode() != null) {
			compared = Utility.compare(getIsinCode(), before.getIsinCode());
			if (compared != 0) {
				return compared;
			}
		}

		if (getPriority() != null) {
			compared = Utility.compare(getPriority(), before.getPriority());
			if (compared != 0) {
				return compared;
			}
		}

		if (getPriceEarningsRatio() != null) {
			compared = Utility.compareFloat(getPriceEarningsRatio(), before.getPriceEarningsRatio(), 0.000001f);
			if (compared != 0) {
				return compared;
			}
		}

		if (getVolumeOfListedShares() != null) {
			compared = Utility.compare(getVolumeOfListedShares(), before.getVolumeOfListedShares());
			if (compared != 0) {
				return compared;
			}
		}

		if (getType() != null) {
			compared = Utility.compare(getType(), before.getType());
			if (compared != 0) {
				return compared;
			}
		}

		if (getCategory() != null) {
			compared = Utility.compare(getCategory(), before.getCategory());
			if (compared != 0) {
				return compared;
			}
		}

		if (getIpoOpen() != null) {
			compared = Utility.compare(getIpoOpen(), before.getIpoOpen());
			if (compared != 0) {
				return compared;
			}
		}

		if (getIpoClose() != null) {
			compared = Utility.compare(getIpoClose(), before.getIpoClose());
			if (compared != 0) {
				return compared;
			}
		}

		return 0;
	}

	public ItemEntity toEntity() {
		ItemEntity entity = new ItemEntity();
		BeanUtils.copyProperties(this, entity);
		return entity;
	}

}
