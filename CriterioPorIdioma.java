package Main;

public class CriterioPorIdioma extends Criterio {

private String idioma;
	
	public CriterioPorIdioma(String idioma) {
		this.idioma = idioma;
	}
	

	@Override
	public boolean cumple(Participante p) {
		return p.getIdiomas().contains(this.idioma);
	}

}