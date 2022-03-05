package com.backend.dto;

import java.util.Date;

import lombok.Data;

@Data
public class Threshold {
	private Integer id;
	private Integer activity_id;
	private Integer subactivity_id;
	private String name;
	private int unit;
	private String val;
	private int capacity;
	private String threshold_unit;
	private String data_type;
	private String rendering_type;
	private String regex;
	private Date created_on;
	private Long created_by;
	private Date updated_on;
	private Long updated_by;
	private boolean is_active;
	private boolean is_deleted;
	private String unit_name;
	private boolean required;
	private String description;
}
