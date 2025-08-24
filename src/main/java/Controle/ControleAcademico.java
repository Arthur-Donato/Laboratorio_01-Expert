package Controle;

import java.util.ArrayList;
import java.util.List;

import Entidades.*;

public class ControleAcademico {
	AssociarHorarioDisciplina horarioDisciplina;
	AssociarAlunoDisciplina alunoDisciplina;
	AssociarProfessorDisciplina professorDisciplina;

	public ControleAcademico() {
		horarioDisciplina = new AssociarHorarioDisciplina();
		alunoDisciplina = new AssociarAlunoDisciplina();
		professorDisciplina = new AssociarProfessorDisciplina();
	}

	public void criarInstancias_E_SaidasDoPrograma() throws Exception {
		// CRIANDO INSTANCIAS DE HORARIO
		Horario primeiroHorario = new Horario("Segunda-Feira", "7hrs", "9hrs");
		Horario segundoHorario = new Horario("Quarta-Feira", "9hrs", "11hrs");
		Horario terceiroHorario = new Horario("Terca-Feira", "7hrs", "9hrs");
		Horario quartoHorario = new Horario("Quinta-Feira", "9hrs", "11hrs");

		// CRIANDO INSTANCIAS DE PROFESSORES E ALUNOS

		Professor primeiroProfessor = new Professor("Sabrina", 192939239, new ArrayList<Disciplina>());
		Professor segundoProfessor = new Professor("Dunfrey", 1234213347, new ArrayList<Disciplina>());
		Aluno primeiroAluno = new Aluno("Arthur", 202302203, new ArrayList<Disciplina>());
		Aluno segundoAluno = new Aluno("Manoel", 2023201203, new ArrayList<Disciplina>());
		Aluno terceiroAluno = new Aluno("Nidlan", 202394394, new ArrayList<Disciplina>());

		// CRIANDO INSTANCIAS DE DISCIPLINAS

		Disciplina map = new Disciplina("Metodos avancados de programacao", null, 60,
				new ArrayList<Aluno>(), new ArrayList<Horario>());
		Disciplina so = new Disciplina("Sistemas Operacionais", null, 60, new ArrayList<Aluno>(),
				new ArrayList<Horario>());
		Disciplina esw = new Disciplina("Engenharia de Software", null, 60, new ArrayList<Aluno>(),
				new ArrayList<Horario>());
		
		horarioDisciplina.adicionarHorarioParaDisciplina(map, primeiroHorario);
		horarioDisciplina.adicionarHorarioParaDisciplina(map, segundoHorario);
		horarioDisciplina.adicionarHorarioParaDisciplina(so, terceiroHorario);
		horarioDisciplina.adicionarHorarioParaDisciplina(so, quartoHorario);
		horarioDisciplina.adicionarHorarioParaDisciplina(esw, primeiroHorario);
		horarioDisciplina.adicionarHorarioParaDisciplina(esw, quartoHorario);
		
		alunoDisciplina.adicionarNovaDisciplinaParaAluno(primeiroAluno, esw);
		alunoDisciplina.adicionarNovaDisciplinaParaAluno(primeiroAluno, map);
		alunoDisciplina.adicionarNovaDisciplinaParaAluno(segundoAluno, so);
		alunoDisciplina.adicionarNovaDisciplinaParaAluno(segundoAluno, map);
		alunoDisciplina.adicionarNovaDisciplinaParaAluno(terceiroAluno, esw);
		alunoDisciplina.adicionarNovaDisciplinaParaAluno(terceiroAluno, so);
		
		professorDisciplina.adicionarProfessorNaDisciplina(primeiroProfessor, map);
		professorDisciplina.adicionarProfessorNaDisciplina(segundoProfessor, so);
		
		System.out.println("a) As disciplinas do professor(a) " + primeiroProfessor.getNome() + " sao: ");
		List<String> nomeDasDisciplinasProfessor = professorDisciplina.imprimirListaDeDisciplinasProfessor(primeiroProfessor);
		for(String nome : nomeDasDisciplinasProfessor ) {
			System.out.println(nome);
		}
		System.out.println();

		System.out.println("b) Os horarios do professor(a) " + primeiroProfessor.getNome() + " sao: ");
		System.out.println(professorDisciplina.imprimirHorarioDoProfessor(primeiroProfessor));

		System.out.println("c) Os alunos da Disciplina " + map.nome + " sao: ");
		List<Aluno> listaDeAlunos = map.imprimirListaDeAlunos();
		for(Aluno aluno : listaDeAlunos) {
			System.out.println(aluno.getNome());
		}

		System.out.println("d) As disciplinas do aluno(a) " + primeiroAluno.getNome() + " sao: ");
		List<String> nomeDasDisciplinas = alunoDisciplina.imprimirListaDeDisciplinas(primeiroAluno);
		for(String nome : nomeDasDisciplinas) {
			System.out.println(nome);
		}
		System.out.println();

		System.out.println("e) O horario do aluno(a) " + primeiroAluno.getNome() + " sao: ");
		System.out.println(alunoDisciplina.imprimirHorarioDoAluno(primeiroAluno));
		System.out.println();

		System.out.println("f) A quantidade de alunos na turma de " + map.getNome() + " sao: "
				+ map.imprimirQuantidadeAtualDeAlunos());
		System.out.println();
		
		System.out.println("f)A quantidade de alunos na turma de " + so.getNome() + " sao: "
				+ so.imprimirQuantidadeAtualDeAlunos());
		System.out.println();
		
		
	}



}
