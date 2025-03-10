package kr.andold.stock.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import jakarta.persistence.criteria.Predicate;
import kr.andold.stock.entity.DividendHistoryEntity;
import kr.andold.stock.param.DividendHistoryParam;

public class DividendHistorySpecification {

	public static Specification<DividendHistoryEntity> searchWith(DividendHistoryParam param) {
		return ((root, query, builder) -> {
	        List<Predicate> predicates = new ArrayList<>();
	        if (param.getStart() != null) {
	            predicates.add(builder.greaterThanOrEqualTo(root.get("base"), param.getStart()));
	        }
	        if (param.getEnd() != null) {
	            predicates.add(builder.lessThan(root.get("base"), param.getEnd()));
	        }
	        if (param.getUpdated() != null) {
	            predicates.add(builder.greaterThanOrEqualTo(root.get("updated"), param.getUpdated()));
	        }
	        if (param.getCode() != null) {
	            predicates.add(builder.equal(root.get("code"), param.getCode()));
	        }
	        if (param.getCodes() != null && !param.getCodes().isEmpty()) {
	            predicates.add(builder.in(root.get("code")).value(param.getCodes()));
	        }

	        return builder.and(predicates.toArray(new Predicate[0]));
		});
	}

}
