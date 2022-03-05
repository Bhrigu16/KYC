package com.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.State;
import com.backend.service.StateService;

@RestController
@RequestMapping("/kyc/")
public class StateController {

	@Autowired
	StateService stateService;
	
	@GetMapping("/getstates")
	public List<State> getStates() {
		List<State> stateList= stateService.getAllStates();
		return stateList;
	}
	
	@GetMapping("/getstateById")
	public State getStateById(@RequestParam Integer Id) {
		return (stateService.getState(Id));
	}
}