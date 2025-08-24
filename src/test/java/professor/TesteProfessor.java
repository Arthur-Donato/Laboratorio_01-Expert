package professor;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Controle.AssociarProfessorDisciplina;
import Entidades.Professor;
import Entidades.Aluno;
import Entidades.Disciplina;
import Entidades.Horario;
import exceptions.ProfessorAssociadoNaDisciplina;
import exceptions.UsuarioSemDisciplinasException;

class TesteProfessor {
	Professor professor;
	Disciplina disciplina;
	Horario horario;
	AssociarProfessorDisciplina professorDisciplina;
	
	@BeforeEach
	public void setUp() {
		professor  = new Professor("Sabrina", 2023208559, new ArrayList<Disciplina>());
		disciplina = new Disciplina("MAP", null, new ArrayList<Aluno>(), new ArrayList<Horario>());
		horario = new Horario("Segunda-Feira", "7hrs", "9hrs");
		professorDisciplina = new AssociarProfessorDisciplina();
	}
	@Test
	public void testeProfessorCriado() {
		assertEquals("Sabrina", professor.getNome());
	}
	
	@Test
	void adicionarDisciplinaParaProfessor() {
		int resultado = 0;
		try {
			resultado = professorDisciplina.adicionarProfessorNaDisciplina(professor, disciplina);
		} catch (ProfessorAssociadoNaDisciplina e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		assertEquals(resultado, 1);
	}
	
	@Test
	void repetirDisciplinaParaProfessor() {
		try {
			professorDisciplina.adicionarProfessorNaDisciplina(professor, disciplina);
		} catch (ProfessorAssociadoNaDisciplina e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertThrows(ProfessorAssociadoNaDisciplina.class, () ->professorDisciplina.adicionarProfessorNaDisciplina(professor, disciplina));
		
	}
	
	@Test
	void verificarDisciplinasDeProfessor() throws ProfessorAssociadoNaDisciplina {
		professorDisciplina.adicionarProfessorNaDisciplina(professor, disciplina);
		assertEquals("MAP", professor.getDisciplinas().get(0).getNome());
	}
	
	
	@Test
	void verificarHorarioProfessor() throws ProfessorAssociadoNaDisciplina, UsuarioSemDisciplinasException{
		professorDisciplina.adicionarProfessorNaDisciplina(professor, disciplina);
		disciplina.getHorario().add(horario);
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(horario.getDiaSemana());
        sb.append(", ");
        sb.append(horario.getHoraInicial());
        sb.append("-");
        sb.append(horario.getHoraFinal());
        sb.append("\n");
        
        StringBuilder stringFinal = professorDisciplina.imprimirHorarioDoProfessor(professor);
        
        assertEquals(sb.toString(), stringFinal.toString());
	}
	
	@Test
	void verificarProfessorSemDisciplina() {
		assertEquals(0, professor.getDisciplinas().size());
	}
	
	@Test
	void verificarImprimirListaDeDisciplinasSemDisciplina() {
		assertThrows(UsuarioSemDisciplinasException.class, () -> professorDisciplina.imprimirListaDeDisciplinasProfessor(professor));
	}
	
	@Test
	void verificarImprimirHorarioAlunoSemDisciplina() {
		assertThrows(UsuarioSemDisciplinasException.class, () -> professorDisciplina.imprimirHorarioDoProfessor(professor));
	}

}
