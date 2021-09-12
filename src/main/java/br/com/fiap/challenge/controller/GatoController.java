package br.com.fiap.challenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.challenge.model.Gato;
import br.com.fiap.challenge.repository.GatoRepository;
import br.com.fiap.challenge.repository.UsuarioRepository;

@Controller
@RequestMapping("gato")
public class GatoController {

	@Autowired
	private GatoRepository repository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("detalhes/{id}")
	public String detalhar(@PathVariable("id") int codigo, Model model) {
		model.addAttribute("gato", repository.findById(codigo).get());
		model.addAttribute("usuario", usuarioRepository.findByGato_Codigo(codigo));
		return "gato/detalhes";
	}
	
	@GetMapping("listar")
	public String listar(Model model) {
		model.addAttribute("gatos", repository.findAll());
		return "gato/lista";
	}
	
	@GetMapping("cadastrar")
	public String cadastrar(Gato gato) {
		return "gato/form";
	}

	@PostMapping("cadastrar")
	public String cadastrar(Gato gato, RedirectAttributes redirect) {
		repository.save(gato);
		redirect.addFlashAttribute("msg", "Cadastrado!");
		return "redirect:/gato/cadastrar";
	}
	
}
