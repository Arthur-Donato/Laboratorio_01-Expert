package Entidades;

public class Horario {

    private String diaSemana;
    private String horaInicial;
    private String horaFinal;
    
    //Obrigatoriamente tem que ter essas informações para criar um horario
	public Horario(String diaSemana, String horaInicial, String horaFinal) {
		super();
		this.diaSemana = diaSemana;
		this.horaInicial = horaInicial;
		this.horaFinal = horaFinal;
	}
	
	public String getDiaSemana() {
		return diaSemana;
	}
	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}
	public String getHoraInicial() {
		return horaInicial;
	}
	public void setHoraInicial(String horaInicial) {
		this.horaInicial = horaInicial;
	}
	public String getHoraFinal() {
		return horaFinal;
	}
	public void setHoraFinal(String horaFinal) {
		this.horaFinal = horaFinal;
	}
	
	public void imprimirHorario() {
		System.out.println(diaSemana + " " + horaInicial + " "  + horaFinal);
	}

}
