package kr.andold.stock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.andold.stock.entity.DividendEntity;

@Repository
public interface StockRepository extends JpaRepository<DividendEntity, Integer> {

}
