package exceptions;

public class HorarioAssociadoParaDisciplina extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public HorarioAssociadoParaDisciplina() {
		super("Ja existe um horario para essa disciplina!");
		
	}

}
