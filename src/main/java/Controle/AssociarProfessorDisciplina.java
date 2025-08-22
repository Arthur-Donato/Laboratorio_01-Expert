package Controle;

import Entidades.*;

public class AssociarProfessorDisciplina {
	
	public AssociarProfessorDisciplina() {
		
	}
	
	public int adicionarProfessorNaDisciplina(Professor professor, Disciplina disciplina) {
		if(disciplina.getProfessorPrincipal() == null) {
			disciplina.setProfessorPrincipal(professor);
			professor.getDisciplinas().add(disciplina);
			return 1;
		}
		return 0;
	}
}
