package ud5.tarea2.act3;

public abstract class PoligonoRegular implements figura {

	protected double lado;
	public String color;
	private static int contadorPoligonos;
	
	
	
	public PoligonoRegular(double lado, String color) {
		this.lado = lado;
		this.color=color;
		contadorPoligonos++;
	}

	public PoligonoRegular() {
		this.lado = 10; 
		this.color = color;
		contadorPoligonos++; 
		}

	public static int getContadorPoligonos() {
		return contadorPoligonos;
	}

}
