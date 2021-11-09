package Main;

import java.util.ArrayList;

public class Banda extends ElementoAbs{
	
	private String nombre;
	private ArrayList<ElementoAbs> elems;
	
	public Banda(String nombre) {
		this.nombre = nombre;
		this.elems = new ArrayList<ElementoAbs>();
	}

	public void addHijo(ElementoAbs e){
		elems.add(e);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	
	@Override
	public int calcularEdad() {
		int promedio = 0;
		for(ElementoAbs e : elems){
			promedio += e.calcularEdad();
		}
		return promedio / elems.size();
	}

	@Override
	public ArrayList<String> calcularGenerosPref() {
		ArrayList<String> listaRepetidos = new ArrayList<String>(); //Repetidos ([Rock, Cumbia] , [Rock,Reggaeton])
		ArrayList<String> listaInterseccion = new ArrayList<String>(); //Sin repetidos
		
		for(ElementoAbs e : elems){
			listaRepetidos.addAll(e.calcularGenerosPref()); 
		}
		
		for(String i : listaRepetidos){ 
			if(this.calcularCantParticipantes() == this.calcularCantVecesGenero(i) && !listaInterseccion.contains(i)){
				listaInterseccion.add(i);
			}
		}
		return listaInterseccion;	
	}
	
	@Override
	public int calcularCantParticipantes() {
		int totalParticipantes = 0;
		for(ElementoAbs e : elems){
			totalParticipantes += e.calcularCantParticipantes();
		}
		return totalParticipantes;
	}

	@Override
	public String toString() {
		return "Banda [nombre=" + nombre + ", elems=" + elems + "]";
	}

	@Override
	public int calcularCantVecesGenero(String genero) {
		int cantVecesGeneroTotal = 0;
		for(ElementoAbs e : elems){
			cantVecesGeneroTotal += e.calcularCantVecesGenero(genero);
		}
		return cantVecesGeneroTotal;
	}
	

}
