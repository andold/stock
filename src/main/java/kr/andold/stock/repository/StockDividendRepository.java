package kr.andold.stock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import kr.andold.stock.entity.StockDividendEntity;
import kr.andold.stock.param.StockDividendParam;

@Repository
public interface StockDividendRepository extends JpaRepository<StockDividendEntity, Integer> {
	final String QUERY_SEARCH_PARAM	=	""
			+ "	SELECT	x"
			+ "		FROM	StockDividendEntity	x"
			//	codes
			+ "		WHERE	("
			+ "				:#{#param.codes}	IS NULL"
			+ "			OR	x.code				IN	:#{#param.codes}"
			//	updated
			+ "		)	AND	("
			+ "				:#{#param.updated}	IS NULL"
			+ "			OR	x.updated	>=	:#{#param.updated}"
			//	flexable
			+ "		)"
			+ "	ORDER BY	x.code ASC"
			;

	@Query(value = QUERY_SEARCH_PARAM, nativeQuery = false)
	List<StockDividendEntity> search(@Param("param") StockDividendParam param);

}
