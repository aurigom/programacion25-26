package ud6.practicaEx;

public class Manager {

	protected String nombre;
	protected String tlf;
	
	public Manager(String nombre, String tlf) {
		this.nombre = nombre;
		this.tlf = tlf;
	}

	public String getNombre() {
		return nombre;
	}



	public String getTlf() {
		return tlf;
	}

	@Override
	public String toString() {
		return "Manager [nombre=" + nombre + ", tlf=" + tlf + "]";
	}

	
	
}
