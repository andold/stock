package kr.andold.stock.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import kr.andold.stock.entity.DividendHistoryEntity;
import kr.andold.stock.param.DividendHistoryParam;

@Repository
public interface DividendHistoryRepository extends JpaRepository<DividendHistoryEntity, Integer> {
	final String QUERY_SEARCH_PARAM	=	""
			+ "	SELECT	x"
			+ "		FROM	DividendHistoryEntity x"
			//	codes
			+ "		WHERE	("
			+ "				:#{#param.codes}	IS NULL"
			+ "			OR	x.code				IN	:#{#param.codes}"
			//	start time
			+ "		)	AND	("
			+ "				:#{#param.code}	IS NULL"
			+ "			OR	x.code		=	:#{#param.code}"
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
	List<DividendHistoryEntity> search(@Param("param") DividendHistoryParam param);

}
