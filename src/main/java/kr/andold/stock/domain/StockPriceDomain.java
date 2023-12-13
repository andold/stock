package kr.andold.stock.domain;

import org.springframework.beans.BeanUtils;

import kr.andold.stock.entity.StockPriceEntity;
import kr.andold.stock.service.Utility;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper = true)
public class StockPriceDomain extends StockPriceEntity implements CommonBlockDomain<StockPriceDomain, StockPriceEntity> {
	@Override
	public String toString() {
		return Utility.toStringJson(this);
	}

	@Override
	public StockPriceEntity toEntity() {
		StockPriceEntity entity = new StockPriceEntity();
		BeanUtils.copyProperties(this, entity);
		return entity;
	}

	@Override
	public int compare(StockPriceDomain domain) {
		return key().compareTo(domain.key());
	}

	@Override
	public String key() {
		return String.format("%s.%tF", getCode(), getBase());
	}

	public static StockPriceDomain of(StockPriceEntity entity) {
		StockPriceDomain domain = new StockPriceDomain();
		BeanUtils.copyProperties(entity, domain);
		return domain;
	}

}
