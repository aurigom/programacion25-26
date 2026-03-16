package ud6.examen.uribe;

public class LenteSinGraduar extends Lente {

	private ColorLente color;
	
	public LenteSinGraduar(char posicion, ColorLente color) {
		super(posicion);
		this.color=color;

	}

	@Override
	public String toString() {
		return "LenteSinGraduar [color=" + color + "]";
	}

	//implementación del método abstracto de lente
	@Override
	public void dimeTipoLente() {
		System.out.println("La lente no es graduada");
		
	}

	
	
}
