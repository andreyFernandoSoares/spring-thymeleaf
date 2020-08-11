package br.com.andrey.listavip.models;

public class Mensagem {
	
	String destinatario;
	String corpo;
	String topico;
	
	public Mensagem(){
		
	}
	
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public String getCorpo() {
		return corpo;
	}
	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}
	public String getTopico() {
		return topico;
	}
	public void setTopico(String topico) {
		this.topico = topico;
	}
}
