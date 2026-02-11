package ud5.tarea2.act3;

public class Triangulo extends PoligonoRegular implements Comparable<Triangulo>{

	private double altura;
	
	public Triangulo(double lado, String color, double altura) {
		super(lado, color);
		this.altura=altura;		
	}
	
	public Triangulo() {
		super();
		this.altura=10;		
	}
	
	@Override
	public double getArea() {
		
		return lado*altura/2;
	}

	@Override
	public String toString() {
		return "Triangulo [altura=" + altura + ", lado=" + lado + " color= "+color+"]";
	}

	@Override
	public int compareTo(Triangulo o) {
		
		return this.lado < o.lado ? 1 : this.lado > o.lado ? -1 : 0;
	}
	
	

}
