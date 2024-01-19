package kr.andold.stock.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import kr.andold.stock.entity.PriceEntity;
import kr.andold.stock.param.PriceParam;

@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, Integer> {
	final String QUERY_SEARCH_PARAM	=	""
			+ "	SELECT	x"
			+ "		FROM	PriceEntity x"
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
			//	codes
			+ "		)	AND	("
			+ "				:#{#param.codes}	IS NULL"
			+ "			OR	x.code				IN	:#{#param.codes}"
			// flag
			+ "		)	AND	("
			+ "				:#{#param.flag}	IS NULL"
			+ "			OR	x.flag > 0"
			//	updated
			+ "		)	AND	("
			+ "				:#{#param.updated}	IS NULL"
			+ "			OR	x.updated	>=	:#{#param.updated}"
			+ "		)"
			+ "	ORDER BY	x.code ASC, x.base DESC"
			;

	@Query(value = QUERY_SEARCH_PARAM, nativeQuery = false)
	List<PriceEntity> search(@Param("param") PriceParam param);

	@Modifying
	@Query("	DELETE"
			+ "		FROM PriceEntity	x"
			+ "	WHERE"
			+ "			x.base < :date"
			+ "		AND	(x.flag	IS	NULL	OR	x.flag	=	0)")
	int purge(@Param("date") Date date);

}
