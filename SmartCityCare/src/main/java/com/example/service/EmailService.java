package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender sendMail;
	
	public void sendEmailForNewRegistration(String email) 
	{
		SimpleMailMessage message = new SimpleMailMessage();
		
		message.setFrom("omkargadakh4699@gmail.com");
		message.setTo(email);
		message.setSubject("Registration Mail.....Successfully Registered");
		message.setText("Thank You for Registering With Us! Welcome to Smart Health Care Portal"
				+ "Wishing You A Great Health From Chiman Dange");
		sendMail.send(message);
	}
	}

