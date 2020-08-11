package br.com.andrey.listavip.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.andrey.listavip.models.Convidado;
import br.com.andrey.listavip.models.Mensagem;
import br.com.andrey.listavip.repositories.ConvidadoRepository;

@Service
public class ConvidadoService {
	
	@Autowired
	ConvidadoRepository cr;
	
	@Autowired
	EmailService emailService;
	
	public List<Convidado> lista(){
		return (List<Convidado>) cr.findAll();
	}
	
	public void salvar(Convidado conv) {
		cr.save(conv);
		enviarEmail(conv);
	}
	
	public void enviarEmail(Convidado conv) {
		Mensagem msg = new Mensagem();
		msg.setDestinatario(conv.getEmail());
		msg.setTopico("Festinha VIP do Diddy");
		msg.setCorpo("Você foi convidado pra festinha vip meu parsa ta na lista braba");
		emailService.enviar(msg);
	}
}
