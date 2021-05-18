package com.dolar.flow.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dolar.flow.models.Acessos;
import com.dolar.flow.models.Dolar;
import com.dolar.flow.repository.AcessoRepository;
import com.dolar.flow.repository.DolarRepository;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/dolar")
public class DolarController  {

	@Autowired
	DolarRepository dolarRepository;
	@Autowired
	AcessoRepository acessoRepository;
	
	@GetMapping("/info")
	public List<Dolar> retornarTudo(){
		
		
		
		return dolarRepository.ListarTudo();
	}
	
	@GetMapping("/acessos")
	public List<Acessos> retornarTudoAcesso(){
		
		
		
		return acessoRepository.ListarAcessos();
	}
	
	
}
