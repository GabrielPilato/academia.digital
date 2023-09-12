package funtec.academia.digital.entity;

import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_matriculas")
public class Matricula {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "aluno_id")
private Aluno aluno;

private LocalDateTime dataDaMatricula = LocalDateTime.now();

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public Aluno getAluno() {
	return aluno;
}

public void setAluno(Aluno aluno) {
	this.aluno = aluno;
}

public LocalDateTime getDataDaMatricula() {
	return dataDaMatricula;
}

public void setDataDaMatricula(LocalDateTime dataDaMatricula) {
	this.dataDaMatricula = dataDaMatricula;
}


}