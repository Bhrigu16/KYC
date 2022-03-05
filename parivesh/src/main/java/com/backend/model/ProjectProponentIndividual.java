package com.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Entity
@Table(name="ProjectProponentIndividual",schema="master")
@PrimaryKeyJoinColumn(referencedColumnName = "Id")
public class ProjectProponentIndividual extends user{

	private String name_of_Entity;
	
	//private String name_of_Contact_Person;
	
	private long landline_No;
	
	@Column(name = "pan_no", nullable = false)
	@Pattern(regexp = "[A-Z]{3}P[A-Z]{1}[0-9]{4}[A-Z]{1}")
	private String pan;
	
	private String website;
}