package exceptions;

public class UsuarioSemDisciplinasException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UsuarioSemDisciplinasException() {
		super("O professor nao ministra nenhuma disciplina!");
	}

}
