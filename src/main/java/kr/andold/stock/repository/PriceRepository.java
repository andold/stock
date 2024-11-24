package kr.andold.stock.repository;

import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import kr.andold.stock.entity.PriceEntity;

@Repository
public interface PriceRepository extends JpaRepository<PriceEntity, Integer>, JpaSpecificationExecutor<PriceEntity> {
	@Modifying
	@Query("	DELETE"
			+ "		FROM PriceEntity	x"
			+ "	WHERE"
			+ "			x.base < :date"
			+ "		AND	(x.flag	IS	NULL	OR	x.flag	=	0)")
	int purge(@Param("date") Date date);

}
