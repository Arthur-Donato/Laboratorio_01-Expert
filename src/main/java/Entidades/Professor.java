package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Professor extends Usuario {

	public Professor(String nome, int matricula, List<Disciplina> disciplinas) {
		super(nome, matricula, disciplinas);
	}
	public Professor() {
		this.setDisciplinas(new ArrayList<>());
	}

	public int adicionarNovaDisciplina(Disciplina disciplina) {
		if(this.getDisciplinas().add(disciplina)) {
			disciplina.setProfessorPrincipal(this);
			return 1;
		}
		return 0;
	}

}
