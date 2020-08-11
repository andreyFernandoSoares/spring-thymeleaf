package br.com.andrey.listavip.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import br.com.andrey.listavip.models.Mensagem;

@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender javaMailSender;
	
	public void enviar(Mensagem msg) {
		System.out.println("Enviando Email...");
		SimpleMailMessage mensagem = new SimpleMailMessage();
		mensagem.setFrom("xanderpg22@gmail.com");
		mensagem.setTo(msg.getDestinatario());
		mensagem.setSubject(msg.getTopico());
		mensagem.setText(msg.getCorpo());
		javaMailSender.send(mensagem);
		System.out.println("Enviado!");
	}
}
