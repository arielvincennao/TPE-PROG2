package Main;

import java.util.ArrayList;
import java.util.Collections;


public class Coach {
	
	private String nombre;
	private ArrayList<Participante> equipo;
	//private Banda equipo;
	
	
	public Coach(String nombre) {
		this.nombre = nombre;
		this.equipo = new ArrayList<Participante>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Participante> getEquipo() {
		ArrayList<Participante> copy = (ArrayList<Participante>) this.equipo;
		return copy;
	}

	public void addParticipanteAlEquipo(Participante p) {
		if(!this.equipo.contains(p)){
			this.equipo.add(p);
		}
	}

	
	public ArrayList<String> getInstrumentosEquipo() {
		ArrayList<String> instrumentosTotales = new ArrayList<String>();
		
		for(Participante i : this.getEquipo()){
			instrumentosTotales.addAll(i.getInstrumentos());
		}
		
		return this.listaSinRepetir(instrumentosTotales); //Sin repetidos 
	}
	
	public ArrayList<String> getIdiomasEquipo() {
		ArrayList<String> idiomasTotales = new ArrayList<String>();
		
		for(Participante i : this.getEquipo()){
			idiomasTotales.addAll(i.getIdiomas());
		}
		
		return this.listaSinRepetir(idiomasTotales); //Sin repetidos
		
	}
	
	public ArrayList<String> getGenerosPrefEquipo() {
		ArrayList<String> generosPrefTotales = new ArrayList<String>();
		
		for(Participante i : this.getEquipo()){
			generosPrefTotales.addAll(i.getGenerosMusicalesPref());
		}
		
		Collections.sort(generosPrefTotales);
		
		return this.listaSinRepetir(generosPrefTotales); //Sin repetidos y ordenados alfabetiamente
		
	}
	
	public double promedioEdadEquipo(){
		double total = 0;
		for(Participante i : this.getEquipo()){
			total += i.getEdad();
		}
		return total/this.getEquipo().size();
	}
	
	
	public ArrayList<String> listaSinRepetir(ArrayList<String> t){
		ArrayList<String> listaSinRep = new ArrayList<String>();
		for(String j : t){
			if(!listaSinRep.contains(j)){
				listaSinRep.add(j);
			}
		}	
		return listaSinRep;
	}
	
	public ArrayList<Participante> buscarParticipante(Criterio c){
		ArrayList<Participante> res = new ArrayList<Participante>();
		for(Participante i : this.getEquipo()){
			if(c.cumple(i)){
				res.add(i);
			}
		}
		return res;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Coach [nombre=" + nombre + ", equipo=" + equipo + "]";
	}

	
}
