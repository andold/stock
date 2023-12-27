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
	public int compare(PriceDomain domain) {
		return key().compareTo(domain.key());
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

}
