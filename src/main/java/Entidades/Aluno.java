package Entidades;

import java.util.List;

public class Aluno extends Usuario {
	
	
	public Aluno(String nome, int matricula, List<Disciplina> disciplina) {
		super(nome, matricula, disciplina);
	}
	
	public int adicionarNovaDisciplinaParaAluno(Disciplina disciplina) {
		if(this.getDisciplinas().add(disciplina)) {
			
			disciplina.adicionarNovoAluno(this);
			return 1;
		}
		return 0;
	}
}
