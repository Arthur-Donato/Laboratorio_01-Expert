package Entidades;

import java.util.List;

public class Aluno extends Usuario {
	
	
	public Aluno(String nome, int matricula, List<Disciplina> disciplina) {
		super(nome, matricula, disciplina);
	}
	
	public int adicionarNovaDisciplina(Disciplina disciplina) {
		if(this.disciplinas.add(disciplina)) {
			
			disciplina.adicionarNovoAluno(this);
			return 1;
		}
		return 0;
	}
}
