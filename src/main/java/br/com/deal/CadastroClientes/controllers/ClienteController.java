package br.com.deal.CadastroClientes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.deal.CadastroClientes.models.Cliente;
import br.com.deal.CadastroClientes.repository.ClienteRepository;

@Controller
public class ClienteController {
	
	@Autowired
	private ClienteRepository repository;
	
	@RequestMapping(value="/cadastrarCliente",method=RequestMethod.GET)
	public String form() {
		return "cliente/formCliente";
	}
	
	@RequestMapping(value="/cadastrarCliente",method=RequestMethod.POST)
	public String form(Cliente cliente) {
		
		repository.save(cliente);
		
		return "redirect:/cadastrarCliente";
	}

}
