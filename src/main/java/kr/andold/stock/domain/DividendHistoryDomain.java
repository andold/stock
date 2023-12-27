package kr.andold.stock.domain;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import kr.andold.stock.entity.DividendHistoryEntity;
import kr.andold.stock.service.Utility;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class DividendHistoryDomain extends DividendHistoryEntity implements CommonBlockDomain<DividendHistoryDomain, DividendHistoryEntity> {

	@Override
	public DividendHistoryEntity toEntity() {
		DividendHistoryEntity entity = new DividendHistoryEntity();
		BeanUtils.copyProperties(this, entity);
		return entity;
	}

	@Override
	public int compare(DividendHistoryDomain domain) {
		return key().compareTo(domain.key());
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
