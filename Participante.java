package Main;

import java.util.ArrayList;


public class Participante extends ElementoAbs{
	
	private String nombre;
	private String apellido;
	private int edad;
	private ArrayList<String> generosMusicalesPref;
	private ArrayList<String> idiomas;
	private ArrayList<String> instrumentos;
	
	public Participante(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.generosMusicalesPref = new ArrayList<String>();
		this.idiomas = new ArrayList<String>();
		this.instrumentos = new ArrayList<String>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public ArrayList<String> getGenerosMusicalesPref() {
		ArrayList<String> copy = (ArrayList<String>) this.generosMusicalesPref;
		return copy;
	}

	public void addGeneroMusicalPref(String generoMusicalPref) {
		this.generosMusicalesPref.add(generoMusicalPref);
	}

	public ArrayList<String> getIdiomas() {
		ArrayList<String> copy = (ArrayList<String>) this.idiomas;
		return copy;
	}

	public void addIdioma(String idioma) {
		this.idiomas.add(idioma);
	}

	public ArrayList<String> getInstrumentos() {
		ArrayList<String> copy = (ArrayList<String>) this.instrumentos;
		return copy;
	}

	public void addInstrumento(String instrumento) {
		this.instrumentos.add(instrumento);
	}

	@Override
	public String toString() {
		return "Participante [nombre=" + nombre + ", apellido=" + apellido
				+ ", edad=" + edad + ", generosMusicalesPref="
				+ generosMusicalesPref + ", idiomas=" + idiomas
				+ ", instrumentos=" + instrumentos + "]";
	}

	@Override
	public int calcularEdad() {
		return this.getEdad();
	}

	@Override
	public ArrayList<String> calcularGenerosPref() {
		return this.getGenerosMusicalesPref(); 
	}

	@Override
	public int calcularCantParticipantes() {
		return 1;
	}

	@Override
	public int calcularCantVecesGenero(String genero) {
		if(this.getGenerosMusicalesPref().contains(genero))return 1;
		else return 0;
	}
	
	

}
