package ud4.tarea1.act9;

public class Maquinistas extends Personal{
public String dni;
public int sueldo;
public int rango;

	/*
	public Maquinistas() {
		super();
	}
*/
	public Maquinistas(String dni, int sueldo, int rango) {
		super();
		this.dni = dni;
		this.sueldo = sueldo;
		this.rango = rango;
	}

	@Override
	public String toString() {
		return "Maquinistas [dni=" + dni + ", sueldo=" + sueldo + ", rango=" + rango + ", nombre=" + nombre + "]";
	}

	
	
}
