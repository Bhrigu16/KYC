package com.backend.repository.postgres;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.model.District;

@Repository
public interface DistrictRepository extends JpaRepository<District, Integer>{

	@Query("SELECT d from District d where d.is_active='true' and d.is_deleted='false' order by name")
    List<District> findAllDistricts();
	
	@Query("SELECT d from District d where d.is_active='true' and d.is_deleted='false' and d.state_code=?1 order by name")
    List<District> findAllDistrictsByStateCode(Integer id);
	
}
