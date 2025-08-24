package Controle;

import java.util.ArrayList;
import java.util.List;

import Entidades.*;
import exceptions.*;

public class AssociarProfessorDisciplina {
	
	public AssociarProfessorDisciplina() {
		
	}
	
	public int adicionarProfessorNaDisciplina(Professor professor, Disciplina disciplina) throws ProfessorAssociadoNaDisciplina{
		if(disciplina.getProfessorPrincipal() != null) {
			throw new ProfessorAssociadoNaDisciplina();
		}
		else {
				disciplina.setProfessorPrincipal(professor);
				return 1;
			}
		}
	
	public List<String> imprimirListaDeDisciplinasProfessor(Professor professor) throws UsuarioSemDisciplinasException{
		if(professor.getDisciplinas().size() == 0) {
			throw new UsuarioSemDisciplinasException();
		}
		List<String> nomeDasDisciplinas = new ArrayList<>();
		for(Disciplina d : professor.getDisciplinas()) {
			nomeDasDisciplinas.add(d.getNome());
		}
		
		return nomeDasDisciplinas;
	}
	
	public StringBuilder imprimirHorarioDoProfessor(Professor professor) throws UsuarioSemDisciplinasException{
		if(professor.getDisciplinas().size() == 0) {
			throw new UsuarioSemDisciplinasException();
		}
		StringBuilder sb = new StringBuilder();
		for(Disciplina d : professor.getDisciplinas()) {
			for(Horario h : d.getHorario()) {
				sb.append(h.getDiaSemana());
	            sb.append(", ");
	            sb.append(h.getHoraInicial());
	            sb.append("-");
	            sb.append(h.getHoraFinal());
	            sb.append("\n");
			}
		}
		
		return sb;
	}
}
