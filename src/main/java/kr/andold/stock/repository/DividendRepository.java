package kr.andold.stock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import kr.andold.stock.entity.DividendEntity;
import kr.andold.stock.param.DividendParam;

@Repository
public interface DividendRepository extends JpaRepository<DividendEntity, Integer> {
	final String QUERY_SEARCH_PARAM	=	""
			+ "	SELECT	x"
			+ "		FROM	DividendEntity	x"
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
	List<DividendEntity> search(@Param("param") DividendParam param);

}
