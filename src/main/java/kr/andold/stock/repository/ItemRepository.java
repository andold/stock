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
			+ "		FROM	ItemEntity x	LEFT JOIN DividendEntity	y ON y.code	=	x.code"
			//	keyword
			+ "		WHERE	("
			+ "				:#{#param.keyword}	IS NULL"
			+ "			OR	:#{#param.keyword}	=	''"
			+ "			OR	x.symbol	LIKE	CONCAT('%', :#{#param.keyword}, '%')"
			+ "			OR	x.code		LIKE	CONCAT('%', :#{#param.keyword}, '%')"
			+ "			OR	x.category	LIKE	CONCAT('%', :#{#param.keyword}, '%')"
			//	etf
			+ "		)	AND	("
			+ "				:#{#param.etf}	IS NULL"
			+ "			OR	x.etf		=	:#{#param.etf}"
			//	type
			+ "		)	AND	("
			+ "				:#{#param.type}	IS NULL"
			+ "			OR	x.type		=	:#{#param.type}"
			//	ipoDate
			+ "		)	AND	("
			+ "				:#{#param.ipoDate}	IS NULL"
			+ "			OR	x.ipoDate	>=	:#{#param.ipoDate}"
			//	updated
			+ "		)	AND	("
			+ "				:#{#param.updated}	IS NULL"
			+ "			OR	x.updated	>=	:#{#param.updated}"
			//	priceEarningsRatio
			+ "		)	AND	("
			+ "				:#{#param.priceEarningsRatio}				IS NULL"
			+ "			OR	y.priceEarningsRatio						>	:#{#param.priceEarningsRatio}"
			+ "			OR	(y.dividend / y.currentPrice * 100)			>	:#{#param.priceEarningsRatio}"
			+ "			OR	(y.dividend1YAgo / y.currentPrice * 100)	>	:#{#param.priceEarningsRatio}"
			+ "			OR	(y.dividend2YAgo / y.currentPrice * 100)	>	:#{#param.priceEarningsRatio}"
			+ "			OR	(y.dividend3YAgo / y.currentPrice * 100)	>	:#{#param.priceEarningsRatio}"
			+ "			OR	x.priority									<	8"
			//	flexable
			+ "		)"
			+ "	ORDER BY	x.priority ASC, y.priceEarningsRatio DESC"
			;

	@Query(value = QUERY_SEARCH_PARAM, nativeQuery = false)
	List<ItemEntity> search(@Param("param") ItemParam param);

	@Query(value = QUERY_SEARCH_PARAM, nativeQuery = false)
	Page<ItemEntity> search(@Param("param") ItemParam param, Pageable pageable);

}