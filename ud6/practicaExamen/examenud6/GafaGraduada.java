package ud6.examen.uribe;

public class GafaGraduada extends Gafa{
	
	public GafaGraduada( Montura montura, Lente lenteizq, Lente lentedrch, double coste, double precio) {
		super( montura, lenteizq, lentedrch, coste, precio);
		
	}

	@Override
	public String toString() {
		return "GafaGraduada [Ide=" + getIde() + ", Montura=" + getMontura() + ", Lenteizq="
				+ getLenteizq() + ", Lentedrch=" + getLentedrch() + ", Coste=" + getCoste() + ", Precio="
				+ getPrecio() + ", Tipo=" +  "]";
	}

	//se cambia el precio con el setter al 50%
	@Override
	public void aplicaDescuento() {
		
		setPrecio((getPrecio() *50/100));
		
		
	}

	
	
}
