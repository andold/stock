package kr.andold.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import kr.andold.stock.entity.DividendHistoryEntity;

@Repository
public interface DividendHistoryRepository extends JpaRepository<DividendHistoryEntity, Integer>, JpaSpecificationExecutor<DividendHistoryEntity> {

}
