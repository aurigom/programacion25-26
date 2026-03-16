package ud6.examen.uribe;

public abstract class Gafa implements Promocion{

	private int ide ;
	private Montura montura;
	private Lente lenteizq;
	private Lente lentedrch;
	private double coste;
	private  double precio;

	
	public Gafa( Montura montura, Lente lenteizq, Lente lentedrch, double coste, double precio) {
		this.montura = montura;
		this.lenteizq = lenteizq;
		this.lentedrch = lentedrch;
		this.coste = coste;
		this.precio = precio;
		
	}


	public int getIde() {
		return ide;
	}



	public Montura getMontura() {
		return montura;
	}



	public Lente getLenteizq() {
		return lenteizq;
	}



	public Lente getLentedrch() {
		return lentedrch;
	}



	public double getCoste() {
		return coste;
	}



	public  double getPrecio() {
		return precio;
	}


	//setter necesario para aplicar descuento
	public void setPrecio(double precio) {
		this.precio = precio;
	}



	@Override
	public String toString() {
		return "Gafa [ide=" + ide + ", montura=" + montura + ", lenteizq=" + lenteizq + ", lentedrch=" + lentedrch
				+ ", coste=" + coste + ", precio=" + precio +  "]";
	}

	
	
	
	
}
