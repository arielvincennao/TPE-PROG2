package Main;


public class CoachExigente extends Coach {

	private Criterio c;

	public CoachExigente(String nombre, Criterio c) {
		super(nombre);
		super.getEquipo();
		this.c = c;
	}

	public Criterio getC() {
		return c;
	}

	public void setC(Criterio c) {
		this.c = c;
	}
	
	public void addParticipanteAlEquipo(Participante p) {
		if(this.getC().cumple(p)){
			super.addParticipanteAlEquipo(p);
		}
	}
	
	
}