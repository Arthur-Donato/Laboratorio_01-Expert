package Controle;

import Entidades.*;
import exceptions.*;

public class AssociarHorarioDisciplina {
	
	public AssociarHorarioDisciplina() {
		
	}
	
	public int adicionarHorarioParaDisciplina(Disciplina disciplina, Horario horario) throws HorarioAssociadoParaDisciplina{
		if(disciplina.getHorario().contains(horario) && disciplina.getHorario().size() < 2) {
			throw new HorarioAssociadoParaDisciplina();
		}
		else {
			if(disciplina.getHorario().add(horario)) {
				return 1;
			}
			return 0;
		}
	}

}
