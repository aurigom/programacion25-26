package ud4.tarea1.act9;

public class Mecanicos extends Personal {

	public String tlf;
	public Especialidad especialidad;
	
	public Mecanicos(String tlf, Especialidad especialidad) {
		super();
		this.tlf = tlf;
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Mecanicos [tlf=" + tlf + ", especialidad=" + especialidad + ", nombre=" + nombre + "]";
	}
	
	
}
