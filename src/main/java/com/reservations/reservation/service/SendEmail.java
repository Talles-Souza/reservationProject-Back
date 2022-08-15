package com.reservations.reservation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class SendEmail {

	@Autowired
	private JavaMailSender sendMail;
	
	public SendEmail (JavaMailSender sendmail) {
		this.sendMail = sendmail;
	}
	
	public void send (String from, String title, String content) {
		System.out.println("Login realizado com sucesso");
		
		var mensage = new SimpleMailMessage() ;
		
		mensage.setText(from);
		mensage.setText(title);
		mensage.setText(content);
		sendMail.send(mensage);
		System.out.println("Email enviado com sucesso");
		
	}
}
