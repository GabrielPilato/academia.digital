package funtec.academia.digital.service.impl;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import funtec.academia.digital.entity.Aluno;
import funtec.academia.digital.entity.AvaliacaoFisica;
import funtec.academia.digital.entity.form.AlunoForm;
import funtec.academia.digital.repository.AlunoRepository;
import funtec.academia.digital.service.IAlunoService;



@Service
public class AlunoServiceImpl implements IAlunoService{
	
	@Autowired //chamando o repository
	public AlunoRepository repository;
	
	@Override
	public Aluno create(AlunoForm form) { 
		Aluno aluno = new Aluno();
		aluno.setNome(form.getNome());
		aluno.setCpf(form.getCpf());
		aluno.setBairro(form.getBairro());
		aluno.setDataDeNascimento(form.getDataDeNascimento());
	 return repository.save(aluno); 
	 } 
	
	@Override
	public Aluno get(Long id) { 
	 return null; 
	 } 
	
	@Override
	public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id)
	{
		repository.findById(id).get();
		return null;
	}
	
	@Override
	public List<Aluno> getAll(String dataDeNascimento) {

	    if(dataDeNascimento == null) {
	      return repository.findAll();
	    } else {
	      LocalDate localDate = LocalDate.parse(dataDeNascimento, DateTimeFormatter.ofPattern("dd/MM/YYYY"));
	      return repository.findByDataDeNascimento(localDate);
	    }

	  }
	
	//@Override
	//public Aluno update(Long id, AlunoUpdateForm formUpdate) { 
	//return null; 
	//}
	
	@Override
	public void delete(Long id) { 
	 
	 } 
	
	
	} 

