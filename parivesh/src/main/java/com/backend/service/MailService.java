package com.backend.service;

import java.security.SecureRandom;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.backend.model.MailContent;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class MailService {

	@Autowired
	private JavaMailSender javaMailSender;

	@Autowired
	private TemplateService templateService;

	@KafkaListener(topics = "TestTopic", groupId = "group_id")
    public void consume(String message) {
		ObjectMapper mapper=new ObjectMapper();
		try {
			MailContent content=mapper.readValue(message, MailContent.class);
			sendMail(content);
		} catch (JsonProcessingException | MessagingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Consumed message:::::::::::::::::::: " + message);
    }
	
	public void sendMail(MailContent mailContent) throws MessagingException {
		MimeMessage msg = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(msg, true);
		helper.setTo(mailContent.getRecieverMail());
		helper.setSubject(mailContent.getSubject());
		helper.setText(templateService.parseThymeleafTemplate(mailContent), true);
		javaMailSender.send(msg);

	}

}
