package ud6.examen.uribe;

public class GafaSol extends Gafa {

	private Proveedor proveedor;
	
	public GafaSol( Montura montura, Lente lenteizq, Lente lentedrch, double coste, double precio, Proveedor proveedor) {
		super( montura, lenteizq, lentedrch, coste, precio);
		this.proveedor= proveedor;
	}

	@Override
	public String toString() {
		return "GafaSol [proveedor=" + proveedor + ", Ide=" + getIde() + ", Montura=" + getMontura()
				+ ", Lenteizq=" + getLenteizq() + ", Lentedrch=" + getLentedrch() + ", Coste="
				+ getCoste() + ", Precio=" + getPrecio() +  "]";
	}

	//con el setter le cambiamos el precio al 20%
	@Override
	public void aplicaDescuento() {
	
			setPrecio((getPrecio() *20/100));
		

	}

	
	
}
