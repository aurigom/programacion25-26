package ud4.tarea1.act9;

class Vagones extends Maquinaria {

	public int capacidadMax;
	public int capacidadActual;
	public int tipoMercancia;
	
	
	
	public Vagones(int capacidadMax, int capacidadActual, int tipoMercancia) {
		super();
		this.capacidadMax = capacidadMax;
		this.capacidadActual = capacidadActual;
		this.tipoMercancia = tipoMercancia;
	}



	@Override
	public String toString() {
		return "Vagones [capacidadMax=" + capacidadMax + ", capacidadActual=" + capacidadActual + ", tipoMercancia="
				+ tipoMercancia + "]";
	}
	
	
	
}
