package Main;

public class CriterioPorEdadMayor extends Criterio {

private int edad;
	
	public CriterioPorEdadMayor(int edad) {
		this.edad = edad;
	}

	@Override
	public boolean cumple(Participante p) {
		return p.getEdad() > edad;
	}

}
