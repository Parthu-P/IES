package com.parthu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.parthu.entity.IESEntity;

@Repository
public interface IESRepo extends JpaRepository<IESEntity, Integer> {

	@Query(name="select * from ies where name like :value")
	public List<IESEntity> findByName(@Param("value") String value);
}
