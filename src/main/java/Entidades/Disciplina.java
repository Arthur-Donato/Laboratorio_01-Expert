package Entidades;

import java.util.ArrayList;
import java.util.List;

import exceptions.AlunoAssociadoNaDisciplinaException;
import exceptions.DisciplinaCheiaException;

public class Disciplina {
	
    public String nome;
    public Professor professorPrincipal;
	private int quantidadeMaximaDeAlunos;
    public List<Aluno> listaDeAlunos;
    private List<Horario> horario;

    
    public Disciplina(String nome, Professor professorPrincipal, int quantidadeMaximaDeAlunos, List<Aluno> alunos, List<Horario> horario) {
		super();
		this.nome = nome;
		this.professorPrincipal = professorPrincipal;
		this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
		this.listaDeAlunos = alunos;
		this.horario = horario;
	}
    
	public Disciplina(String nome, Professor professor, List<Aluno> listaDeAlunos, List<Horario> horario) {
    	this.nome = nome;
    	this.professorPrincipal = professor;
    	this.quantidadeMaximaDeAlunos = 60;
    	this.listaDeAlunos = listaDeAlunos;
    	this.horario = horario;
    }
	
    public Disciplina() {
		this.listaDeAlunos = new ArrayList<Aluno>();
		this.horario = new ArrayList<Horario>();
	}

    public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getProfessorPrincipal() {
		return this.professorPrincipal;
	}

	public void setProfessorPrincipal(Professor professorPrincipal) {
		this.professorPrincipal = professorPrincipal;
		professorPrincipal.getDisciplinas().add(this);
	}

	public int getQuantidadeMaximaDeAlunos() {
		return this.quantidadeMaximaDeAlunos;
	}

	public void setQuantidadeMaximaDeAlunos(int quantidadeMaximaDeAlunos) {
		this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
	}


	public List<Aluno> getAlunos() {
		return this.listaDeAlunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.listaDeAlunos = alunos;
	}
	
	public List<Horario> getHorario() {
		return this.horario;
	}

	public void setHorario(List<Horario> horario) {
		this.horario = horario;
	}
	
	public int adicionarNovoHorario(Horario horario) {
		if(this.horario.add(horario)) {
			return 1;
		}
		return 0;
	}
	
	public int adicionarNovoAluno(Aluno aluno) throws DisciplinaCheiaException, AlunoAssociadoNaDisciplinaException{
		if(this.imprimirQuantidadeAtualDeAlunos() >= this.quantidadeMaximaDeAlunos) {
			throw new DisciplinaCheiaException();
		}
		if(this.listaDeAlunos.contains(aluno)) {
			throw new AlunoAssociadoNaDisciplinaException();
		}
		this.listaDeAlunos.add(aluno);
		return 1;
		
	}

	public List<Aluno> imprimirListaDeAlunos() {
		List<Aluno> listaDeAlunos = new ArrayList<>();
    	for(Aluno aluno: this.listaDeAlunos) {
    		listaDeAlunos.add(aluno);
    	}
    	
    	return listaDeAlunos;
    	
    }
    
    public int imprimirQuantidadeAtualDeAlunos() {
		if(this.listaDeAlunos==null){
			return 0;
		}
    	return this.listaDeAlunos.size();
    }

}
