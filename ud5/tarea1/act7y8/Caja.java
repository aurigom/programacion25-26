package ud5.tarea1.act7;

public class Caja {

	protected final double ANCHO;
	protected final double FONDO;
	protected final double ALTO;
	
	public enum Unidades {CM, M}

	public Caja(double ANCHO, double FONDO, double ALTO, Unidades u) {
		this.ANCHO = ANCHO;
		this.FONDO = FONDO;
		this.ALTO = ALTO;

	}
	
	public double getVolumen() {
	
		double volumen = ALTO*ANCHO*FONDO;
		
		return volumen;
		
	}
	
	public String toString() {
	
	
	return "Ancho: "+this.ANCHO+" Alto: "+this.ALTO+" Fondo: "+this.FONDO+
			" volumen: "+getVolumen();
		
	}
	
}
