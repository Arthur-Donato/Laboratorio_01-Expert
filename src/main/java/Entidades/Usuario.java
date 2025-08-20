package Entidades;

import java.util.List;

public abstract class Usuario {
    private String nome;
    private int matricula;
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
		return this.disciplinas;
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
			System.out.println(d.nome);
		}
	}
	
	public void imprimirHorario() {
		for(Disciplina d : this.disciplinas) {
			for(Horario h : d.getHorario()) {
				h.imprimirHorario();
			}
		}
	}

}
