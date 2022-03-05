package com.backend.service;

import java.security.SecureRandom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.backend.exceptions.UserAlreadyExistException;
import com.backend.model.MailContent;
import com.backend.model.ProjectProponentIndividual;
import com.backend.repository.postgres.UserRegistrationRepository;


@Service
public class UserService {

	@Autowired
	private UserRegistrationRepository<ProjectProponentIndividual> userRegistrationRepository;
	
	@Autowired
    private KafkaTemplate<String, MailContent> kafkaTemplate;

    private static final String TOPIC = "TestTopic";
	
	public String addUserRegistration(ProjectProponentIndividual individual) {
		individual.setPassword(generateRandomPassword(7));
		
		if(userRegistrationRepository.findRecordByPan(individual.getPan()).isPresent()) {
			throw new UserAlreadyExistException("User Already exist in the registration process.");
		} else {			
			userRegistrationRepository.save(individual);
			MailContent ob1=new MailContent();
			ob1.setSubject("Subject...........");
			ob1.setEntityType("Senior");
			ob1.setPassword(individual.getPassword());
			ob1.setRecieverMail(individual.getEmail());
			
			//Kafka Producer  Publishes the Object on the Topic
			kafkaTemplate.send(TOPIC,ob1);
		}
		return "success";
	}
	
	public String generateRandomPassword(int len) {
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < len; i++) {
			int randomIndex = random.nextInt(chars.length());
			sb.append(chars.charAt(randomIndex));
		}
		return sb.toString();
	}
}
