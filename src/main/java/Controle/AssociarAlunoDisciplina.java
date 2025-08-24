package Controle;

import java.util.ArrayList;
import java.util.List;

import Entidades.*;
import exceptions.*;

public class AssociarAlunoDisciplina {
	
	public AssociarAlunoDisciplina() {
		
	}
	
	
	public int adicionarNovaDisciplinaParaAluno(Aluno aluno, Disciplina disciplina) throws AlunoAssociadoNaDisciplinaException{
		if(aluno.getDisciplinas().contains(disciplina) || disciplina.getAlunos().contains(aluno)) {
			throw new AlunoAssociadoNaDisciplinaException();
		}
		else {
			if(aluno.getDisciplinas().add(disciplina) && disciplina.getAlunos().add(aluno)) {
				return 1;
			}
		}
		
		return 0;
	}
	
	public List<String> imprimirListaDeDisciplinas(Aluno aluno) throws UsuarioSemDisciplinasException{
		if(aluno.getDisciplinas().size() == 0) {
			throw new UsuarioSemDisciplinasException();
		}
		List<String> nomeDasDisciplinas = new ArrayList<>();
		for(Disciplina d : aluno.getDisciplinas()) {
			nomeDasDisciplinas.add(d.getNome());
		}
		
		return nomeDasDisciplinas;
	}
	
	public StringBuilder imprimirHorarioDoAluno(Aluno aluno) throws UsuarioSemDisciplinasException{
		if(aluno.getDisciplinas().size() == 0) {
			throw new UsuarioSemDisciplinasException();
		}
		StringBuilder sb = new StringBuilder();
		for(Disciplina d : aluno.getDisciplinas()) {
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
