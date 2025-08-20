package Entidades;

import java.util.List;

public abstract class Usuario {
    protected String nome;
    protected int matricula;
    protected List<Disciplina> disciplinas;

    
    
    public Usuario(String nome, int matricula, List<Disciplina> disciplina) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.disciplinas = disciplina;
	}



	public List<Disciplina> getDisciplinas() {
        return null;
    }



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getMatricula() {
		return matricula;
	}



	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}



	public List<Disciplina> getDisciplina() {
		return disciplinas;
	}



	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplinas = disciplina;
	}
	
	public int adicionarNovaDisciplina(Disciplina disciplina) {
		if(this.disciplinas.add(disciplina)) {
			return 1;
		}
		return 0;
	}
	
	public void imprimirListaDeDisciplinas() {
		for(Disciplina d : this.disciplinas) {
			System.out.print(d.nome + ", ");
		}
	}

}
