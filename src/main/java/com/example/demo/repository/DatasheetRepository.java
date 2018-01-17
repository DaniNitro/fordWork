package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.model.Datasheet;

@Repository
@Transactional
public interface DatasheetRepository extends JpaRepository<Datasheet, Long> {

	@Query("select d from Datasheet d where d.engineeringCommodityName=:engineeringCommodityName and d.region=:region")
	List<Datasheet>findByEngineeringCommodityNameAndRegion(@Param("engineeringCommodityName")String engineeringCommodityName,@Param("region")String region);
}
