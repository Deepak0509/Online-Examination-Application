package com.examportalbackend.services.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;


@Service
public class EmailService {

	
	@Autowired
	private JavaMailSender mailsender;

	public void sendmail(String toEmail, String subject, int i) {
		// TODO Auto-generated method stub
		SimpleMailMessage m= new SimpleMailMessage();
		m.setFrom("p.rahul223344@gmail.com");
		m.setTo(toEmail);
		m.setText(Integer.toString(i));
		m.setSubject(subject);
		
	 
		
		mailsender.send(m);
		System.out.println("Email Sent Successsfully....");
	}
}