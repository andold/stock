package kr.andold.stock.domain;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import kr.andold.stock.entity.DividendHistoryEntity;
import kr.andold.utils.Utility;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class DividendHistoryDomain extends DividendHistoryEntity implements CommonBlockDomain<DividendHistoryDomain, DividendHistoryEntity> {
	@Override
	public DividendHistoryEntity toEntity() {
		DividendHistoryEntity entity = new DividendHistoryEntity();
		BeanUtils.copyProperties(this, entity);
		return entity;
	}

	@Override
	public int compare(DividendHistoryDomain you) {
		int compared = Utility.compare(getCode(), you.getCode());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getBase(), you.getBase());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getPay(), you.getPay());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getDividend(), you.getDividend());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getPriceBase(), you.getPriceBase());
		if (compared != 0) {
			return compared;
		}

		compared = Utility.compare(getPriceClosing(), you.getPriceClosing());
		if (compared != 0) {
			return compared;
		}

		return 0;
	}

	@Override
	public int compareIfNotNull(DividendHistoryDomain before) {
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

		if (getPay() != null) {
			compared = Utility.compare(getPay(), before.getPay());
			if (compared != 0) {
				return compared;
			}
		}

		if (getDividend() != null) {
			compared = Utility.compare(getDividend(), before.getDividend());
			if (compared != 0) {
				return compared;
			}
		}

		if (getPriceBase() != null) {
			compared = Utility.compare(getPriceBase(), before.getPriceBase());
			if (compared != 0) {
				return compared;
			}
		}

		if (getPriceClosing() != null) {
			compared = Utility.compare(getPriceClosing(), before.getPriceClosing());
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

	@Override
	public String toString() {
		return Utility.toStringJson(this);
	}

	public DividendHistoryDomain(String code, String base, String pay, String dividend) {
		setCode(code);
		setBase(Utility.parseDateTime(base));
		setPay(Utility.parseDateTime(pay));
		setDividend(Utility.parseInteger(dividend, 0));
		Date now = new Date();
		setUpdated(now);
		setCreated(now);
	}

	public static DividendHistoryDomain of(DividendHistoryEntity entity) {
		DividendHistoryDomain domain = new DividendHistoryDomain();
		BeanUtils.copyProperties(entity, domain);
		return domain;
	}

}
