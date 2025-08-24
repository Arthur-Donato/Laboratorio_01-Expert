package Aluno;

import Entidades.*;
import exceptions.AlunoAssociadoNaDisciplinaException;
import exceptions.UsuarioSemDisciplinasException;
import Controle.*;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteAluno {
	private Aluno aluno;
	private Disciplina disciplina;
	private Horario horario;
	private AssociarAlunoDisciplina alunoDisciplina;
	
	@BeforeEach
	public void setUp() {
		aluno  = new Aluno("Arthur", 2023208559, new ArrayList<Disciplina>());
		disciplina = new Disciplina("MAP", null, new ArrayList<Aluno>(), new ArrayList<Horario>());
		horario = new Horario("Segunda-Feira", "7hrs", "9hrs");
		alunoDisciplina = new AssociarAlunoDisciplina();
	}
	@Test
	public void testeAlunoCriado() {
		assertEquals("Arthur", aluno.getNome());
	}
	
	@Test
	void adicionarDisciplinaParaAluno() {
		int resultado = 0;
		try {
			resultado = alunoDisciplina.adicionarNovaDisciplinaParaAluno(aluno, disciplina);
		} catch (AlunoAssociadoNaDisciplinaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(resultado, 1);
	}
	
	@Test
	void repetirDisciplinaParaAluno() {
		try {
			alunoDisciplina.adicionarNovaDisciplinaParaAluno(aluno, disciplina);
		} catch (AlunoAssociadoNaDisciplinaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertThrows(AlunoAssociadoNaDisciplinaException.class, () -> alunoDisciplina.adicionarNovaDisciplinaParaAluno(aluno, disciplina));
		
	}
	
	@Test
	void verificarDisciplinasDeAluno() throws AlunoAssociadoNaDisciplinaException {
		alunoDisciplina.adicionarNovaDisciplinaParaAluno(aluno, disciplina);
		assertEquals("MAP", aluno.getDisciplinas().get(0).getNome());
	}
	
	
	@Test
	void verificarHorarioAluno() throws AlunoAssociadoNaDisciplinaException, UsuarioSemDisciplinasException{
		alunoDisciplina.adicionarNovaDisciplinaParaAluno(aluno, disciplina);
		disciplina.getHorario().add(horario);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(horario.getDiaSemana());
        sb.append(", ");
        sb.append(horario.getHoraInicial());
        sb.append("-");
        sb.append(horario.getHoraFinal());
        sb.append("\n");
        
        StringBuilder stringFinal = alunoDisciplina.imprimirHorarioDoAluno(aluno);
        
        assertEquals(sb.toString(), stringFinal.toString());
	}
	
	@Test
	void verificarAlunoSemDisciplina() {
		assertEquals(0, aluno.getDisciplinas().size());
	}
	
	@Test
	void verificarImprimirListaDeDisciplinasSemDisciplina() {
		assertThrows(UsuarioSemDisciplinasException.class, () -> alunoDisciplina.imprimirListaDeDisciplinas(aluno));
	}
	
	@Test
	void verificarImprimirHorarioAlunoSemDisciplina() {
		assertThrows(UsuarioSemDisciplinasException.class, () -> alunoDisciplina.imprimirHorarioDoAluno(aluno));
	}

}
