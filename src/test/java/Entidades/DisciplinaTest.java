package Entidades;

import static org.junit.jupiter.api.Assertions.*;

class DisciplinaTest {



    @org.junit.jupiter.api.Test
    void turmaCheia() {
        Aluno arthur = new Aluno("Arthur",0,null);
        Aluno manoel = new Aluno("manoel",0,null);
        Aluno nidlan = new Aluno("nidlan",0,null);
        Aluno sabrina = new Aluno("sabrina",0,null);
        Aluno scherer = new Aluno("scherer",0,null);
        Aluno chaves = new Aluno("chaves",0,null);

        Disciplina disciplina = new Disciplina();
        disciplina.setQuantidadeMaximaDeAlunos(5);

        assertEquals(1,disciplina.adicionarNovoAluno(arthur));
        assertEquals(1,disciplina.adicionarNovoAluno(nidlan));
        assertEquals(1,disciplina.adicionarNovoAluno(manoel));
        assertEquals(1,disciplina.adicionarNovoAluno(sabrina));
        assertEquals(1,disciplina.adicionarNovoAluno(scherer));
        assertEquals(0,disciplina.adicionarNovoAluno(chaves));//não houve a adição do chaves
    }

    @org.junit.jupiter.api.Test
    void verificarCorretude() {
        Aluno arthur = new Aluno("Arthur",0,null);
        Aluno manoel = new Aluno("manoel",0,null);

        Aluno nidlan = new Aluno("nidlan",0,null);
        Horario horario1 = new Horario("Segunda","7","9");
        Horario horario2 = new Horario("Quarta","11","13");

        Disciplina disciplina = new Disciplina();
        disciplina.setQuantidadeMaximaDeAlunos(5);
        disciplina.adicionarNovoHorario(horario1);
        disciplina.adicionarNovoHorario(horario2);


        assertEquals(1,disciplina.adicionarNovoAluno(arthur));
        assertEquals(1,disciplina.adicionarNovoAluno(nidlan));
        assertEquals(1,disciplina.adicionarNovoAluno(manoel));

        assertTrue(disciplina.listaDeAlunos.contains(arthur));
        assertTrue(disciplina.listaDeAlunos.contains(manoel));
        assertTrue(disciplina.listaDeAlunos.contains(nidlan));
        assertTrue(disciplina.getHorario().contains(horario1));

    }

    @org.junit.jupiter.api.Test
    void imprimirQuantidadeAtualDeAlunos() {
        Aluno arthur = new Aluno("Arthur",0,null);
        Aluno manoel = new Aluno("manoel",0,null);
        Aluno nidlan = new Aluno("nidlan",0,null);

        Disciplina disciplina = new Disciplina();
        disciplina.setQuantidadeMaximaDeAlunos(5);

        assertEquals(1,disciplina.adicionarNovoAluno(arthur));
        assertEquals(1,disciplina.adicionarNovoAluno(nidlan));
        assertEquals(1,disciplina.adicionarNovoAluno(manoel));
        assertEquals(3,disciplina.imprimirQuantidadeAtualDeAlunos());
    }
}