package ud5.tarea1.act7;

public class CajaCarton extends Caja{


	public int etiqueta;
	public static double superficieT=0;
	
	
	//cada vez que se crea una instancia de cajaCarton
	//se aumenta el "contador"
	/*cuando calculamos la superficie de UNA caja se suma a superficie. 
	 * */
	public CajaCarton(double ANCHO, double FONDO, double ALTO, int etiqueta) {
		super(ANCHO, FONDO, ALTO, Unidades.CM);
		// TODO Auto-generated constructor stub
		this.etiqueta=etiqueta;
		
		superficieT+=superficieCajacarton();
	}

	public double getVolumen() {
		double volumen=(ANCHO*ALTO*FONDO)*0.8;
		return volumen;
	}
	
	
	public double superficieCajacarton() {
		double superficie=2*(ANCHO*ALTO+ANCHO*FONDO+ALTO*FONDO);
		
		return superficie;
		
	}
	
	public static double getSuperficieT() {
		return superficieT;
	}
	
	public String toString() {
		
		
		return "Ancho: "+this.ANCHO+" Alto: "+this.ALTO+" Fondo: "+this.FONDO+
				" volumen: "+getVolumen()+" Superficie: "+superficieCajacarton();
			
		}
	
}
