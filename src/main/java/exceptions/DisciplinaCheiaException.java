package exceptions;

public class DisciplinaCheiaException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public DisciplinaCheiaException() {
		super("A turma atual se encontra cheia");
	}

}
