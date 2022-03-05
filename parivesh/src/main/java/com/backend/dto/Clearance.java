package com.backend.dto;

import lombok.Data;

@Data
public class Clearance {
	private boolean EnvironmentClearance;
	private boolean WildlifeClearance;
	private boolean ForestClearance;
	private boolean CRZClearance;
}
