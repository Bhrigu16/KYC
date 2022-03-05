package com.backend.repository.postgres;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.backend.model.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer>{

	@Query("SELECT s from State s where s.is_active='true' and s.is_deleted='false' order by name")
    List<State> findAllStates();
	
	@Query("SELECT s from State s where s.is_active='true' and s.is_deleted='false' and s.id=?1 order by name")
    State getStateById(Integer id);
}
