package Main;


public class CriterioPorGenero extends Criterio {

private String genero;
	
	public CriterioPorGenero(String genero) {
		this.genero = genero;
	}
	

	@Override
	public boolean cumple(Participante p) {
		return p.getGenerosMusicalesPref().contains(this.genero);
	}
}
