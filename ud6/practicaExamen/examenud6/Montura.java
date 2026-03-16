package ud6.examen.uribe;

public class Montura {

	private String marca;
	private MaterialMontura material;
	private String color;
	
	public Montura(String marca,  String color, MaterialMontura material) {
		this.marca = marca;
		this.material = material;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Montura [marca=" + marca + ", material=" + material + ", color=" + color + "]";
	}
	
	
	
}
