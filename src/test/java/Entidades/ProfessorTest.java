package Entidades;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ProfessorTest {

    @Test
    void adicionarNovaDisciplina() {
        Professor professor = new Professor("Sabrina",0,new ArrayList<>());
        Disciplina disciplina = new Disciplina("MAP",professor,null,new ArrayList<>());
        Horario horario = new Horario("Segunda","7","9");

        disciplina.adicionarNovoHorario(horario);
        disciplina.setProfessorPrincipal(professor);

        assertTrue(professor.getDisciplinas().get(0).getHorario().contains(horario));


    }

    @Test
    void imprimirHorario() {
    }
}