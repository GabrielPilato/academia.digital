package funtec.academia.digital.service;

import funtec.academia.digital.entity.Aluno;
import funtec.academia.digital.entity.AvaliacaoFisica;
import funtec.academia.digital.entity.form.AlunoForm;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IAlunoService {

	Aluno create(AlunoForm form);

	Aluno get(Long id);

	void delete(Long id);

	List<Aluno> getAll(String dataDeNascimento);
	
	List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
	
	


}
