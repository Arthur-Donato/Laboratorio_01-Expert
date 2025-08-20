package Entidades;

import java.util.List;

public class Disciplina {
	
    public String nome;
    public Professor professorPrincipal;
    private int quantidadeMaximaDeAlunos;
    public List<Aluno> alunos;
    private List<Horario> horario;

    
    public Disciplina(String nome, Professor professorPrincipal, int quantidadeMaximaDeAlunos, List<Aluno> alunos, List<Horario> horario) {
		super();
		this.nome = nome;
		this.professorPrincipal = professorPrincipal;
		this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
		this.alunos = alunos;
		this.horario = horario;
	}
    
	public Disciplina(String nome, Professor professor, List<Aluno> listaDeAlunos, List<Horario> horario) {
    	this.nome = nome;
    	this.professorPrincipal = professor;
    	this.alunos = listaDeAlunos;
    	this.horario = horario;
    }
    public Disciplina() {}

    
    
    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Professor getProfessorPrincipal() {
		return professorPrincipal;
	}

	public void setProfessorPrincipal(Professor professorPrincipal) {
		this.professorPrincipal = professorPrincipal;
	}

	public int getQuantidadeMaximaDeAlunos() {
		return quantidadeMaximaDeAlunos;
	}

	public void setQuantidadeMaximaDeAlunos(int quantidadeMaximaDeAlunos) {
		this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Horario> getHorario() {
		return this.horario;
	}

	public void setHorario(List<Horario> horario) {
		this.horario = horario;
	}

	public void imprimirListaDeAlunos() {
    	for(Aluno aluno: this.alunos) {
    		System.out.print(aluno.nome + ", ");
    	}
    }
    
    public int imprimirQuantidadeAtualDeAlunos() {
    	if(this.alunos.equals(null)) {
    		return 0;
    	}
    	return this.alunos.size();
    }

}
