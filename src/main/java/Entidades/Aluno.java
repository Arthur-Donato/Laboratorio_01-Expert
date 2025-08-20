package Entidades;

import java.util.List;

public class Aluno extends Usuario {
	
	
	public Aluno(String nome, int matricula, List<Disciplina> disciplina) {
		super(nome, matricula, disciplina);
	}
}
