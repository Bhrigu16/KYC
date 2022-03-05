package com.backend.repository.postgres;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.backend.model.ProjectProponentIndividual;
import com.backend.model.user;
import com.google.common.base.Optional;

public interface UserRegistrationRepository<T extends user> extends JpaRepository<T, Integer> {

	@Query(value = "Select p from ProjectProponentIndividual p where pan_no = ?1")
	public Optional<ProjectProponentIndividual> findRecordByPan(String pan);
}
