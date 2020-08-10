package br.com.andrey.listavip.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.andrey.listavip.models.Convidado;
import br.com.andrey.listavip.repositories.ConvidadoRepository;

@Controller
@RequestMapping("/")
public class ConvidadoController {
	
	@Autowired
	private ConvidadoRepository cr;
	
	@GetMapping
	public String index() {
		return "index";
	}
	
	@GetMapping("lista")
	public String lista(Model model) {
		model.addAttribute("convidados", cr.findAll());
		return "lista";
	}
	
	@PostMapping("lista")
	public String gravar(@RequestParam("nome") String nome,
					     @RequestParam("email") String email,
					     @RequestParam("telefone") String telefone,
					     Model model) {
		
		Convidado conv = new Convidado(nome, email, telefone);
		cr.save(conv);
		model.addAttribute("convidados", cr.findAll());
		return "lista";
	}
}
