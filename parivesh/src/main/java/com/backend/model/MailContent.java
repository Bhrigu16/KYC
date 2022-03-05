package com.backend.model;

import lombok.Data;

@Data
public class MailContent {

	private String subject;
	private String recieverMail;
	private String password;
	private String url;
	private String entityType;
}
