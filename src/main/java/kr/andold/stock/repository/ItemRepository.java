package kr.andold.stock.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import kr.andold.stock.entity.ItemEntity;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, Integer>, JpaSpecificationExecutor<ItemEntity> {
	Optional<ItemEntity> findOneByCode(String code);

}
