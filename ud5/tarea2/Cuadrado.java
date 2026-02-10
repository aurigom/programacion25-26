package ud5.tarea2.act3;

public class Cuadrado extends PoligonoRegular {

	public Cuadrado(double lado, Color color) {
		super(lado, color);
		
	}
	
	public Cuadrado() {
		super();
		
	}
	
	public double getArea() {
		return lado*lado;
		
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado +" color= "+color+"]";
	}

	
	
}
