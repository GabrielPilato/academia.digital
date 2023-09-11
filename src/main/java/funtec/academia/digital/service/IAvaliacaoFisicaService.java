package funtec.academia.digital.service;

import java.util.List;

import funtec.academia.digital.entity.AvaliacaoFisica;
import funtec.academia.digital.entity.form.AvaliacaoFisicaForm;
import funtec.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;



public interface IAvaliacaoFisicaService {

	  AvaliacaoFisica create(AvaliacaoFisicaForm form);

	  AvaliacaoFisica get(Long id);


	  List<AvaliacaoFisica> getAll();


	  AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

	  void delete(Long id);
	
}
