package Main;

import java.util.ArrayList;


public class Cancion {

	private String titulo;
	private String idioma;
	private ArrayList<String> generosMusicales;
	private ArrayList<String> instrumentosNecesarios;
	
	public Cancion(String titulo, String idioma) {
		this.titulo = titulo;
		this.idioma = idioma;
		this.generosMusicales = new ArrayList<String>();
		this.instrumentosNecesarios = new ArrayList<String>();
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public ArrayList<String> getGenerosMusicales() {
		ArrayList<String> copy = (ArrayList<String>) this.generosMusicales;
		return copy;
	}

	public void addGeneroMusical(String generoMusical) {
		this.generosMusicales.add(generoMusical);
	}
	
	public ArrayList<String> getInstrumentosNecesarios() {
		ArrayList<String> copy = (ArrayList<String>) this.instrumentosNecesarios;
		return copy;
	}

	public void addInstrumentoNecesario(String instrumento) {
		this.instrumentosNecesarios.add(instrumento);
	}
	
	
}