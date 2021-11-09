package Main;

import java.util.ArrayList;
//import java.util.ArrayList;


public abstract class ElementoAbs {

	//private ArrayList<Coach> coaches;
	public abstract int calcularEdad();
	
	public abstract ArrayList<String> calcularGenerosPref();
	
	public abstract int calcularCantVecesGenero(String genero);
	
	public abstract int calcularCantParticipantes();
	
}
