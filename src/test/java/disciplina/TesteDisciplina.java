package disciplina;

import Entidades.*;
import exceptions.AlunoAssociadoNaDisciplinaException;
import exceptions.DisciplinaCheiaException;
import Controle.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TesteDisciplina {
	Aluno aluno;
	Aluno aluno2;
	Disciplina disciplinaPadrao;
	Disciplina disciplinaCheia;
	Professor professor;
	Horario horario;
	AssociarAlunoDisciplina alunoDisciplina;
	AssociarProfessorDisciplina professorDisciplina;
	
	@BeforeEach
	void setUp() {
		disciplinaPadrao = new Disciplina("MAP", null, new ArrayList<Aluno>(), new ArrayList<Horario>());
		disciplinaCheia = new Disciplina("SO", null, 1, new ArrayList<Aluno>(), new ArrayList<Horario>());
		aluno = new Aluno("Arthur", 2023205847, new ArrayList<Disciplina>());
		aluno2 = new Aluno("Manoel", 2032043453, new ArrayList<Disciplina>());
	}

	@Test
	void testeCriarDisciplina() {
		assertEquals("MAP", disciplinaPadrao.getNome());
	}
	
	@Test
	void testeAdicionarAlunoNaDisciplina() throws DisciplinaCheiaException, AlunoAssociadoNaDisciplinaException {
		
		assertEquals(1, disciplinaPadrao.adicionarNovoAluno(aluno));
	}
	
	@Test
	void testeVerificarDisciplinaSemAluno() {
		assertEquals(0, disciplinaPadrao.imprimirQuantidadeAtualDeAlunos());
	}
	
	@Test
	void testeVerificarDisciplinaComAluno() throws DisciplinaCheiaException, AlunoAssociadoNaDisciplinaException {
		disciplinaPadrao.adicionarNovoAluno(aluno);
		assertEquals(1, disciplinaPadrao.imprimirQuantidadeAtualDeAlunos());
	}
	
	@Test
	void testeAdicionarHorarioNaDisciplina() {
		assertEquals(1, disciplinaPadrao.adicionarNovoHorario(horario));
	}
	
	@Test
	void testeDisciplinaCheia() throws AlunoAssociadoNaDisciplinaException {
		try {
			disciplinaCheia.adicionarNovoAluno(aluno);
			
		} catch (DisciplinaCheiaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertThrows(DisciplinaCheiaException.class, () -> disciplinaCheia.adicionarNovoAluno(aluno2));
	}
	
	@Test
	void testeVerificarMesmoAlunoNaDisciplina() throws DisciplinaCheiaException, AlunoAssociadoNaDisciplinaException {
		disciplinaPadrao.adicionarNovoAluno(aluno);
		assertThrows(AlunoAssociadoNaDisciplinaException.class, () -> disciplinaPadrao.adicionarNovoAluno(aluno));
		
	}
	
	@Test
	void testeImprimirListaDeAlunos() throws DisciplinaCheiaException, AlunoAssociadoNaDisciplinaException {
		disciplinaPadrao.adicionarNovoAluno(aluno2);
		
		assertEquals("Manoel", disciplinaPadrao.getAlunos().get(0).getNome());
		
	}

}
