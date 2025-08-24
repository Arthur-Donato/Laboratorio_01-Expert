package Entidades;

import java.util.List;

public abstract class Usuario {
    private String nome;
    private int matricula;
    private List<Disciplina> disciplinas;

    
    
    public Usuario(String nome, int matricula, List<Disciplina> disciplina) {
		this.nome = nome;
		this.matricula = matricula;
		this.disciplinas = disciplina;
	}
	public Usuario(){}


	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return this.matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	public List<Disciplina> getDisciplinas() {
        return this.disciplinas;
    }
	
	public void setDisciplinas(List<Disciplina> disciplina) {
		this.disciplinas = disciplina;
	}

}
