package Main;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Coach coach = new Coach("Ariel");
		
		Participante a = new Participante("a", "a", 21);
		a.addGeneroMusicalPref("Rock");
		a.addGeneroMusicalPref("Cumbia");
		//a.addGeneroMusicalPref("Electro");
		a.addIdioma("Ingles");
		a.addIdioma("Espanol");
		a.addInstrumento("Flauta");
		a.addInstrumento("Piano");
		
		Participante b = new Participante("b", "b", 23);
		b.addGeneroMusicalPref("Rock");
		b.addGeneroMusicalPref("Electro");
		b.addIdioma("Ingles");
		b.addIdioma("Espanol");
		b.addInstrumento("Flauta");
		b.addInstrumento("Guitarra");
		
		Participante c = new Participante("c", "c", 25);
		c.addGeneroMusicalPref("Rock");
		c.addGeneroMusicalPref("Metal");
		c.addIdioma("Ingles");
		c.addIdioma("Espanol");
		c.addInstrumento("Saxo");
		c.addInstrumento("Guitarra");
		
		Participante d = new Participante("d", "d", 22);
		d.addGeneroMusicalPref("Rock");
		d.addGeneroMusicalPref("Metal");
		d.addIdioma("Ingles");
		d.addIdioma("Espanol");
		d.addIdioma("Portugues");
		d.addInstrumento("Bateria");
		d.addInstrumento("Violin");
		
		
		Participante e = new Participante("e", "e", 26);
		e.addGeneroMusicalPref("Reggaeton");
		e.addGeneroMusicalPref("Metal");
		e.addIdioma("Espanol");
		e.addIdioma("Italiano");
		e.addInstrumento("Bateria");
		e.addInstrumento("Guitarra");
		
		coach.addParticipanteAlEquipo(a);
		coach.addParticipanteAlEquipo(b);
		coach.addParticipanteAlEquipo(c);
		coach.addParticipanteAlEquipo(d);
		coach.addParticipanteAlEquipo(e);
		
		System.out.println(coach.toString());
		System.out.println(coach.getInstrumentosEquipo());
		System.out.println(coach.getIdiomasEquipo());
		System.out.println(coach.getGenerosPrefEquipo());
		System.out.println(coach.promedioEdadEquipo());
		
		Criterio c1 = new CriterioPorGenero("Clasico"); 
		System.out.println(coach.buscarParticipante(c1)); //Criterios working!
		
		System.out.println("-------------------------------");
		
		//Coach Exigente
		CoachExigente coach1 = new CoachExigente("Coach Exigente", c1);
		
		coach1.addParticipanteAlEquipo(a);
		System.out.println(coach1.toString());
		System.out.println("No cumple el criterio, no lo agrega a su equipo");
		
		coach1.addParticipanteAlEquipo(d);
		System.out.println(coach1.toString());
		System.out.println("Cumple el criterio, lo agrega a su equipo");
		
		//-----------------------------------------------------
		
		
		Banda palmeras = new Banda("Palmeras");
		palmeras.addHijo(a);
		palmeras.addHijo(b);
		
		
		Banda palmeritas = new Banda("Palmeritas");
		palmeritas.addHijo(c);
		palmeritas.addHijo(d);
		
		palmeras.addHijo(palmeritas);
		
		System.out.println(palmeras.toString());
		System.out.println(palmeras.calcularCantParticipantes());
		System.out.println(palmeras.calcularGenerosPref()); //Tienen en comun Rock
		
		System.out.println(palmeritas.calcularGenerosPref()); //Tienen en comun Rock y Metal

		
		
	}

}