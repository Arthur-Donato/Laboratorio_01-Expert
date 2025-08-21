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
    void imprimirListaDeAlunos() {

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