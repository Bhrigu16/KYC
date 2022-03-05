package com.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.model.District;
import com.backend.repository.postgres.DistrictRepository;


@Service
public class DistrictService {

	@Autowired
	DistrictRepository districtRepository;
	
	public List<District> getAllDistricts(){
		
		try {
		return (districtRepository.findAllDistricts());
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
	
	public List<District> getDistrictByCode(Integer Code) {
		try {
		return(districtRepository.findAllDistrictsByStateCode(Code));
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		return null;
	}
}
