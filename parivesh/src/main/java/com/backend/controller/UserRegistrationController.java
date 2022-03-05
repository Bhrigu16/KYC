package com.backend.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.GenCodeMaster;
import com.backend.model.ProjectProponentIndividual;
import com.backend.repository.postgres.GenCodeMasterRepository;
import com.backend.service.UserService;


@RestController
@RequestMapping("/user")
public class UserRegistrationController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private GenCodeMasterRepository genCodeMasterRepository;
	
	@GetMapping("/registrationTypes")
	public List<GenCodeMaster> getRegistrationTypes() {
		return genCodeMasterRepository.findAllByParentGrp("REGISTRATION_TYPE");
	}
	
	@PostMapping("/registerUser")
	public String registerUser(@RequestBody @Valid ProjectProponentIndividual individual){
		System.out.println(individual.toString());
		return userService.addUserRegistration(individual);
	}
}
