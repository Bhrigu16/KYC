package com.backend.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.Data;

@Data
@Entity
@Table(name="state",schema="master")
public class State implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable = false,unique = true)
	private Integer code;
	
	@JsonManagedReference
	@OneToMany(mappedBy="state", targetEntity = District.class,fetch = FetchType.LAZY)
	private List<District> districtlist=new ArrayList<>();

	@Column(nullable=false)
	private Integer version;
	
	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false,length = 2)
	private String census_code_2001;
	
	@Column(nullable = false,length = 4)
	private String census_code_2011;
	
	@Column(nullable = false)
	private char state_ut_flag;
	
	@Column(nullable = false)
	private boolean is_active;
	
	@Column(nullable = false)
	private boolean is_deleted;
	
	@Column(nullable = false)
	private Long created_by;
	
	@Column(nullable = false)
	private Date created_on;
	
	@Column(nullable = false)
	private Long updated_by;
	
	@Column(nullable = false)
	private Date updated_on;

	
	}