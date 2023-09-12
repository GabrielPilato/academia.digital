package funtec.academia.digital.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import funtec.academia.digital.entity.Aluno;
import funtec.academia.digital.entity.AvaliacaoFisica;
import funtec.academia.digital.entity.form.AlunoForm;
import funtec.academia.digital.service.impl.AlunoServiceImpl;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
	
	
	
	@Autowired
	private AlunoServiceImpl service;
	
	@PostMapping
	public Aluno create (@Valid @RequestBody AlunoForm form)
	{
		return service.create(form);
	}
	
	@GetMapping("/avaliacoes/{id}")
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id)
	{
		return service.getAllAvaliacaoFisicaId(id);
	}

	@GetMapping
	public List<Aluno> getAll (@RequestParam(value = "dataDeNascimento",
													 required = false) String dataDeNascimento)
	{
		return service.getAll(dataDeNascimento);
		
	} 
	
}
