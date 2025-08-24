package exceptions;

public class AlunoAssociadoNaDisciplinaException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AlunoAssociadoNaDisciplinaException() {
		super("O aluno ja esta associado a essa disciplina!");
	}

}
