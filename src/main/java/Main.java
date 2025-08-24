
import Controle.*;

public class Main {
    public static void main(String[] args) {
    	
    	ControleAcademico controleAcademico = new ControleAcademico();
    	try {
    		controleAcademico.criarInstancias_E_SaidasDoPrograma();
    	}
    	catch(Exception e ) {
    		System.out.println("Ocorreu algum erro inesperado!");
    	}
    	
    	
    	
    }
}