package Entidades;

import java.util.List;

public abstract class Usuario {
    private String nome;
    private int matricula;
    private List<Disciplina> disciplinas;

    
    
    public Usuario(String nome, int matricula, List<Disciplina> disciplina) {
		super();
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
	
	public int adicionarNovaDisciplina(Disciplina disciplina) {
		if(this.disciplinas.add(disciplina)) {
			return 1;
		}
		return 0;
	}
	
	public void imprimirListaDeDisciplinas() {
		for(Disciplina d : this.getDisciplinas()) {
			System.out.println(d.nome);
		}
	}
	
	public void imprimirHorario() {
		for(Disciplina d : this.getDisciplinas()) {
			for(Horario h : d.getHorario()) {
				h.imprimirHorario();
				System.out.println(d.getNome());
			}
		}
	}

}
