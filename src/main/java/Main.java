
import java.util.ArrayList;
import java.util.List;

import Entidades.*;

public class Main {
    public static void main(String[] args) {
    	
    	//CRIANDO HORARIOS PARA AS DISCIPLINAS
    	Horario primeiroHorario = new Horario("Segunda-Feira", "7hrs", "9hrs");
    	Horario segundoHorario = new Horario("Quarta-Feira", "9hrs", "11hrs");
    	Horario terceiroHorario = new Horario("Terca-Feira", "7hrs", "9hrs");
    	Horario quartoHorario = new Horario("Quinta-Feira", "9hrs", "11hrs");
    	
    	List<Horario> horario1 = new ArrayList<Horario>();
    	horario1.add(primeiroHorario);
    	horario1.add(segundoHorario);
    	
    	List<Horario> horario2 = new ArrayList<Horario>();
    	horario2.add(terceiroHorario);
    	horario2.add(quartoHorario);
    	
    	//CRIANDO USUARIOS PARA O SISTEMA(ALUNO E PROFESSOR)
    	
    	Professor primeiroProfessor= new Professor("Sabrina", 192939239, new ArrayList<Disciplina>());
    	Aluno primeiroAluno = new Aluno("Arthur", 202302203, new ArrayList<Disciplina>());
    	Aluno segundoAluno = new Aluno("Manoel", 2023201203, new ArrayList<Disciplina>());
    	
    	List<Aluno> listaDeAlunos = new ArrayList<>();
    	listaDeAlunos.add(primeiroAluno);
    	listaDeAlunos.add(segundoAluno);
  
    	//CRIANDO DISCIPLINAS
    	Disciplina map = new Disciplina("MAP", primeiroProfessor, 60, listaDeAlunos, horario1);
    	Disciplina so = new Disciplina("SO", primeiroProfessor, 60, listaDeAlunos, horario2);
    	
    	
    	System.out.println("Os alunos da Disciplina " + map.nome + " sao: ");
    	map.imprimirListaDeAlunos();
    	System.out.println();
    	
    	
    	primeiroProfessor.adicionarNovaDisciplina(map);
    	primeiroProfessor.adicionarNovaDisciplina(so);
    	
    	
    	System.out.println("As disciplinas do professor(a) "+ primeiroProfessor.getNome() + " sao: ");
    	primeiroProfessor.imprimirListaDeDisciplinas();
    	System.out.println();
    	
    	System.out.println("Os horarios do professor(a) "+ primeiroProfessor.getNome() + " sao: ");
    	primeiroProfessor.imprimirHorario();
    	System.out.println();
    	
    	
    	System.out.println("A quantidade de alunos na turma de " + map.getNome() + " sao: " + map.imprimirQuantidadeAtualDeAlunos());
    	System.out.println("A quantidade de alunos na turma de " + so.getNome() + " sao: " + so.imprimirQuantidadeAtualDeAlunos());
    	System.out.println();
    	
    	
    	primeiroAluno.adicionarNovaDisciplina(so);
    	primeiroAluno.adicionarNovaDisciplina(map);
    	
    	segundoAluno.adicionarNovaDisciplina(so);
    	
    	System.out.print("As disciplinas do aluno(a) "+ primeiroAluno.getNome() + " sao: ");
    	primeiroAluno.imprimirListaDeDisciplinas();
    	System.out.println();
    	
    	
    	System.out.print("As disciplinas do aluno(a) "+ segundoAluno.getNome() + " sao: ");
    	segundoAluno.imprimirListaDeDisciplinas();
    	System.out.println();
    	
    	
    }
}