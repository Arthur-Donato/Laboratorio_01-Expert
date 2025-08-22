package Controle;
import Entidades.*;

public class AssociarAlunoDisciplina {
	
	private Aluno aluno;
	private Disciplina disciplina;
	
	
	public AssociarAlunoDisciplina() {
		
	}
	
	
	public int adicionarNovaDisciplinaParaAluno(Aluno aluno, Disciplina disciplina) {
		if(aluno.getDisciplinas().add(disciplina)) {
			if(disciplina.getAlunos().contains(aluno)) {
				return 2;
			}
			return 1;
		}
		
		return 0;
	}

}
