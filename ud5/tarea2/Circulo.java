package ud5.tarea2.act3;

public class Circulo implements figura{

	private double radio;
	
	
	
	public Circulo(double radio) {
		this.radio = radio;
	}

	public Circulo() {
		this.radio = 10;
	}


	@Override
	public double getArea() {
		
		return 3.14*(radio*radio);
	}



	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	
	
}
