package ud5.tarea2.act3;

public abstract class PoligonoRegular implements figura {

	protected double lado;
	public Color color;
	private static int contadorPoligonos;
	
	
	
	public PoligonoRegular(double lado, Color color) {
		this.lado = lado;
		this.color=color;
		contadorPoligonos++;
	}

	public PoligonoRegular() {
		this.lado = 10; 
		this.color = Color.AZUL;
		contadorPoligonos++; 
		}

	public static int getContadorPoligonos() {
		return contadorPoligonos;
	}

}
