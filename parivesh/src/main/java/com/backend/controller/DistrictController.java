package com.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.backend.model.District;
import com.backend.service.DistrictService;

@RestController
@RequestMapping("/kyc/")
public class DistrictController {

	@Autowired
	DistrictService districtService;
	
	@GetMapping("/getdistricts")
	public List<District> getStates() {
		List<District> districtList= districtService.getAllDistricts();
		return districtList;
	}
	
	@GetMapping("/getdistrictbyCode")
	public List<District> getSubactivityById(@RequestParam Integer state_code) {
		return (districtService.getDistrictByCode(state_code));
	}
	
}
