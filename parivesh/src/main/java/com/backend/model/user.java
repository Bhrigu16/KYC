package com.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.Data;
@Data
@Entity
@Table(name="user",schema="master")
@Inheritance(strategy=InheritanceType.JOINED)
public class user {
	//Common Fields in User-Registration :: Address   State/UT        Email-ID    Mobile NoDistrict    PIN Code .
	//Fields in Admin : First Name Last Name  Employee ID     E-MailId    Mobile Number

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;

	@Column(name="name")
	@NotEmpty(message = "Name can not be empty")
	private String name;
	
	@Column(name="address")
	@NotEmpty(message = "Address can not be empty")
	private String address;
	
	@Column(name="email")
	@Email(message = "Email can not be empty")
	private String email;
	
	@Column(name="mobile")
	@Pattern(regexp = "^(\\+91[\\-\\s]?)?[0]?(91)?[6789]\\d{9}$")
	private String mobile;
	
	@Column(name="state_ut")
	@NotEmpty(message = "state can not be empty")
	private String state_ut;
	
	@Column(name="district")
	@NotEmpty(message = "District can not be empty")
	private String district;
	
	@Column(name="pincode")
	@Pattern(regexp = "^[1-9]{1}[0-9]{2}[0-9]{3}$")
	private String pincode;
	
	@Column(name="password")
	private String password;
	
	@Column(name="is_active")
	private boolean is_active;
	
	@Column(name="is_delete")
	private boolean is_delete;
	
	@Column(name="security_question")
	private String security_question;
	
	@Column(name="security_answer")
	private String security_answer;

}
