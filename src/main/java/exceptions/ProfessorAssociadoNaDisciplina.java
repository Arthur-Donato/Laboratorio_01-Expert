package exceptions;

public class ProfessorAssociadoNaDisciplina extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProfessorAssociadoNaDisciplina() {
		super("O professor ja esta associado a essa disciplina!");
	}

}
