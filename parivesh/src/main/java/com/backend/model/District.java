package com.backend.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;

@Data
@Entity
@Table(name="district",schema="master")
public class District implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@Column(nullable = false)
	private Integer code;

	private Integer state_code;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonBackReference
	@JoinColumn(name = "state_code",referencedColumnName="code", insertable = false, updatable = false)
	private State state;

	@Column(nullable = false)
	private String name;
	
	@Column(nullable = false,length = 2)
	private String census_code_2001;
	
	@Column(nullable = false,length = 4)
	private String census_code_2011;
	
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