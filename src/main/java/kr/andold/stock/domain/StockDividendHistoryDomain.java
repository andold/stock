package kr.andold.stock.domain;

import java.util.Date;

import org.springframework.beans.BeanUtils;

import kr.andold.stock.entity.StockDividendHistoryEntity;
import kr.andold.stock.service.Utility;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class StockDividendHistoryDomain extends StockDividendHistoryEntity implements CommonBlockDomain<StockDividendHistoryDomain, StockDividendHistoryEntity> {

	@Override
	public StockDividendHistoryEntity toEntity() {
		StockDividendHistoryEntity entity = new StockDividendHistoryEntity();
		BeanUtils.copyProperties(this, entity);
		return entity;
	}

	@Override
	public int compare(StockDividendHistoryDomain domain) {
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

	public StockDividendHistoryDomain(String code, String base, String pay, String dividend) {
		setCode(code);
		setBase(Utility.parseDateTime(base));
		setPay(Utility.parseDateTime(pay));
		setDividend(Utility.parseInteger(dividend, 0));
		Date now = new Date();
		setUpdated(now);
		setCreated(now);
	}

	public static StockDividendHistoryDomain of(StockDividendHistoryEntity entity) {
		StockDividendHistoryDomain domain = new StockDividendHistoryDomain();
		BeanUtils.copyProperties(entity, domain);
		return domain;
	}

}
