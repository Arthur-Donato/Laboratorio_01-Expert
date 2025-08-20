package Entidades;

import java.util.List;

public class Professor extends Usuario {

	public Professor(String nome, int matricula, List<Disciplina> disciplinas) {
		super(nome, matricula, disciplinas);
	}
	
	public void imprimirHorario() {
		for(Disciplina d : this.disciplinas) {
			for(Horario h : d.getHorario()) {
				h.imprimirHorario();
			}
		}
	}
}
