package ud4.tarea1.act9;

public class JefesEstacion extends Personal {

	public String dni;

	public JefesEstacion(String dni) {
		super();
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "JefesEstacion [dni=" + dni + ", nombre=" + nombre + "]";
	}
	
	
	
}
