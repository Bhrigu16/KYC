package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.model.State;
import com.backend.repository.postgres.StateRepository;

@Service
public class StateService {

	@Autowired
	StateRepository stateRepository;
	
	public List<State> getAllStates(){
		
		try {
		return (stateRepository.findAllStates());
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	public State getState(Integer Id) {
		try {
		return(stateRepository.getStateById(Id));
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
}
