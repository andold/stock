package kr.andold.stock.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import kr.andold.stock.entity.ItemEntity;
import kr.andold.stock.param.ItemParam;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Integer> {
	final String QUERY_SEARCH_PARAM	=	""
			+ "	SELECT	x"
			+ "		FROM	ItemEntity	x"
			//	keyword
			+ "		WHERE	("
			+ "				:#{#param.keyword}	IS NULL"
			+ "			OR	:#{#param.keyword}	=	''"
			+ "			OR	x.symbol	LIKE	CONCAT('%', :#{#param.keyword}, '%')"
			+ "			OR	x.code		LIKE	CONCAT('%', :#{#param.keyword}, '%')"
			+ "			OR	x.category	LIKE	CONCAT('%', :#{#param.keyword}, '%')"
			//	type
			+ "		)	AND	("
			+ "				:#{#param.type}	IS NULL"
			+ "			OR	x.type		=	:#{#param.type}"
			//	ipoOpen
			+ "		)	AND	("
			+ "				:#{#param.ipoOpen}	IS NULL"
			+ "			OR	x.ipoOpen	>=	:#{#param.ipoOpen}"
			//	updated
			+ "		)	AND	("
			+ "				:#{#param.updated}	IS NULL"
			+ "			OR	x.updated	>=	:#{#param.updated}"
			//	priceEarningsRatio
			+ "		)	AND	("
			+ "				:#{#param.priceEarningsRatio}	IS NULL"
			+ "			OR	x.priceEarningsRatio			>	:#{#param.priceEarningsRatio}"
			+ "			OR	x.priority						<	8"
			//	flexable
			+ "		)"
			+ "	ORDER BY	x.priority ASC, x.priceEarningsRatio DESC, x.symbol ASC, x.code ASC"
			;

	@Query(value = QUERY_SEARCH_PARAM, nativeQuery = false)
	List<ItemEntity> search(@Param("param") ItemParam param);

	@Query(value = QUERY_SEARCH_PARAM, nativeQuery = false)
	Page<ItemEntity> search(@Param("param") ItemParam param, Pageable pageable);

}
