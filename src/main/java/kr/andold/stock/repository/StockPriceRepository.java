package kr.andold.stock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import kr.andold.stock.entity.StockPriceEntity;
import kr.andold.stock.param.StockPriceParam;

@Repository
public interface StockPriceRepository extends JpaRepository<StockPriceEntity, Integer> {
	final String QUERY_SEARCH_PARAM	=	""
			+ "	SELECT	x"
			+ "		FROM	StockPriceEntity x"
			//	code
			+ "	WHERE	("
			+ "				:#{#param.code}	IS NULL"
			+ "			OR	x.code			=	:#{#param.code}"
			//	start time
			+ "		)	AND	("
			+ "				:#{#param.start}	IS NULL"
			+ "			OR	x.base		>=	:#{#param.start}"
			//	end time
			+ "		)	AND	("
			+ "				:#{#param.end}	IS NULL"
			+ "			OR	x.base		<	:#{#param.end}"
			//	updated
			+ "		)	AND	("
			+ "				:#{#param.updated}	IS NULL"
			+ "			OR	x.updated	>=	:#{#param.updated}"
			+ "		)"
			+ "	ORDER BY	x.code ASC, x.base DESC"
			;

	@Query(value = QUERY_SEARCH_PARAM, nativeQuery = false)
	List<StockPriceEntity> search(@Param("param") StockPriceParam param);

}
