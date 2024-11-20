package kr.andold.stock.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;

import jakarta.persistence.criteria.Predicate;
import kr.andold.stock.entity.ItemEntity;
import kr.andold.stock.param.ItemParam;

public class ItemSpecification {
	public static Specification<ItemEntity> searchWith(ItemParam param) {
		return ((root, query, builder) -> {
	        List<Predicate> predicates = new ArrayList<>();
	        if (StringUtils.hasText(param.getKeyword())) {
	            predicates.add(builder.or(
	            		builder.like(root.get("symbol"), "%" + param.getKeyword() + "%")
	            		, builder.like(root.get("code"), "%" + param.getKeyword() + "%")
	            		, builder.like(root.get("type"), "%" + param.getKeyword() + "%")
	            		, builder.like(root.get("category"), "%" + param.getKeyword() + "%")
        		));
	        }
	        if (param.getPriority() != null) {
	            predicates.add(builder.greaterThanOrEqualTo(root.get("priority"), param.getPriority() * 4));
	            predicates.add(builder.lessThan(root.get("priority"), (param.getPriority() + 1) * 4));
	        }
	        if (StringUtils.hasText(param.getType())) {
	            predicates.add(builder.equal(builder.lower(root.get("base")), param.getType().toLowerCase()));
	        }
	        if (param.getIpoOpen() != null) {
	            predicates.add(builder.greaterThanOrEqualTo(root.get("ipoOpen"), param.getIpoOpen()));
	        }
	        if (param.getUpdated() != null) {
	            predicates.add(builder.greaterThanOrEqualTo(root.get("updated"), param.getUpdated()));
	        }
	        if (param.getPriceEarningsRatio() != null) {
	            predicates.add(builder.or(
	            		builder.greaterThan(root.get("priceEarningsRatio"), param.getPriceEarningsRatio())
	            		, (builder.lessThan(root.get("priority"), 8))
        		));
	        }

	        return builder.and(predicates.toArray(new Predicate[0]));
		});
	}

}
