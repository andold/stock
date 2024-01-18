package kr.andold.stock.domain;

import org.springframework.beans.BeanUtils;

import kr.andold.stock.entity.PriceEntity;
import kr.andold.stock.service.Utility;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class PriceDomain extends PriceEntity implements CommonBlockDomain<PriceDomain, PriceEntity> {
	@Override
	public String toString() {
		return Utility.toStringJson(this);
	}

	@Override
	public PriceEntity toEntity() {
		PriceEntity entity = new PriceEntity();
		BeanUtils.copyProperties(this, entity);
		return entity;
	}

	@Override
	public int compare(PriceDomain you) {
		int compared = Utility.compare(getCode(), you.getCode());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getBase(), you.getBase());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getClosing(), you.getClosing());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getMarket(), you.getMarket());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getHigh(), you.getHigh());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getLow(), you.getLow());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getVolume(), you.getVolume());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getFlag(), you.getFlag());
		if (compared != 0) {
			return compared;
		}

		return 0;
	}

	@Override
	public int compareIfNotNull(PriceDomain before) {
		int compared = Utility.compare(getCode(), before.getCode());
		if (compared != 0) {
			return compared;
		}

		if (getBase() != null) {
			compared = Utility.compare(getBase(), before.getBase());
			if (compared != 0) {
				return compared;
			}
		}

		if (getClosing() != null) {
			compared = Utility.compare(getClosing(), before.getClosing());
			if (compared != 0) {
				return compared;
			}
		}

		if (getMarket() != null) {
			compared = Utility.compare(getMarket(), before.getMarket());
			if (compared != 0) {
				return compared;
			}
		}

		if (getHigh() != null) {
			compared = Utility.compare(getHigh(), before.getHigh());
			if (compared != 0) {
				return compared;
			}
		}

		if (getLow() != null) {
			compared = Utility.compare(getLow(), before.getLow());
			if (compared != 0) {
				return compared;
			}
		}

		if (getVolume() != null) {
			compared = Utility.compare(getVolume(), before.getVolume());
			if (compared != 0) {
				return compared;
			}
		}

		if (getFlag() != null) {
			compared = Utility.compare(getFlag(), before.getFlag());
			if (compared != 0) {
				return compared;
			}
		}

		return 0;
	}

	@Override
	public String key() {
		return String.format("%s.%tF", getCode(), getBase());
	}

	public static PriceDomain of(PriceEntity entity) {
		PriceDomain domain = new PriceDomain();
		BeanUtils.copyProperties(entity, domain);
		return domain;
	}

	/*
	 * bit 0 ~ 3: reserved bit 5: 32, week 주대표 bit 6: 64, month 월대표 bit 7: 128, year
	 * 연대표 bit 8: 256, 특정일, 배당일 등
	 */
	public void setFlagWeek(boolean b) {
		int mask = 32;
		Integer flag = getFlag() == null ? 0 : getFlag();
		if (b) {
			setFlag(flag | mask);
		} else {
			setFlag(flag & ~mask);
		}
	}

	public void setFlagMonth(boolean b) {
		int mask = 64;
		Integer flag = getFlag() == null ? 0 : getFlag();
		if (b) {
			setFlag(flag | mask);
		} else {
			setFlag(flag & ~mask);
		}
	}

	public void setFlagYear(boolean b) {
		int mask = 128;
		Integer flag = getFlag() == null ? 0 : getFlag();
		if (b) {
			setFlag(flag | mask);
		} else {
			setFlag(flag & ~mask);
		}
	}

	public void setFlagSpecial(boolean b) {
		int mask = 256;
		Integer flag = getFlag() == null ? 0 : getFlag();
		if (b) {
			setFlag(flag | mask);
		} else {
			setFlag(flag & ~mask);
		}
	}

}
