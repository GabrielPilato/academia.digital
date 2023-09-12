package funtec.academia.digital.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import funtec.academia.digital.entity.Aluno;
import funtec.academia.digital.entity.Matricula;
import funtec.academia.digital.entity.form.MatriculaForm;
import funtec.academia.digital.repository.AlunoRepository;
import funtec.academia.digital.repository.MatriculaRepository;
import funtec.academia.digital.service.IMatriculaService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Service
public class MatriculaServiceImpl implements IMatriculaService{
	
	 @Autowired
	  private MatriculaRepository matriculaRepository;

	  @Autowired
	  private AlunoRepository alunoRepository;

	  @Override
	  public Matricula create(MatriculaForm form) {
	    Matricula matricula = new Matricula();
	    Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

	    matricula.setAluno(aluno);

	    return matriculaRepository.save(matricula);
	  }

	  @Override
	  public Matricula get(Long id) {
	    return matriculaRepository.findById(id).get();
	  }

	  @Override
	  public List<Matricula> getAll(String bairro) {

	    if(bairro == null){
	      return matriculaRepository.findAll();
	    }else{
	      return matriculaRepository.findAlunosMatriculadosBairro(bairro);
	    }

	  }

	  @Override
	  public void delete(Long id) {}

}
