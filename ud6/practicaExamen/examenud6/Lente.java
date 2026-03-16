package ud6.examen.uribe;

public abstract class Lente {

	private char posicion;

	public Lente(char posicion) {
		this.posicion = posicion;
	}
	
	//abstracto para implementarlo en las otras dos clases y que diga el tipo de cada una
	public abstract void dimeTipoLente();
	
}
