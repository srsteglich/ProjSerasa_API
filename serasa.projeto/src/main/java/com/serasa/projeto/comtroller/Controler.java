package com.serasa.projeto.comtroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.serasa.projeto.modelo.Clinica;
import com.serasa.projeto.repositorio.RepositorioClinica;

@Controller
public class Controler {
	
	@Autowired
	private RepositorioClinica repositorioClinica;
		    
	@GetMapping("ola")
	@ResponseBody
	public String olaSerasa() {
		return " Olá, Serasa.... Sou Sérgio R. Steglich ";
	}
	
	  
	@GetMapping("clinicas")
	@ResponseBody
	public List<Clinica> listar() {	
		return repositorioClinica.findAll();
	}
	
	
	
}
