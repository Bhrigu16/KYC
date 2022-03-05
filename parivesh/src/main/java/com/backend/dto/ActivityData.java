package com.backend.dto;

import java.util.List;

import com.backend.model.ThresholdParameter;

import lombok.Data;

@Data
public class ActivityData {
	private long activityId;
	private long subActivityId;
	private String activity;
	private String subactivity;
	private List<Threshold> threshold;
		
}
