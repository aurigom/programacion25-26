package ud5.tarea2.act3;

public class Triangulo extends PoligonoRegular {

	private double altura;
	
	public Triangulo(double lado, Color color, double altura) {
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
	
	

}
