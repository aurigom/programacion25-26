package ud6.practicaEx;

public class Musicos {

	protected String nombreArt;
	protected int edad;
	
	public Musicos(String nombreArt, int edad) {
		this.nombreArt = nombreArt;
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Musicos [nombreArt=" + nombreArt + ", edad=" + edad + "]";
	}

	public String getNombreArt() {
		return nombreArt;
	}

	
	public int getEdad() {
		return edad;
	}


	
	
	
}
