package ud5.examen;

public abstract class AgrupacionOficial extends Agrupacion{
	//extiende de agrupacion
	
	//atributos
	protected String nombre;
	protected String autor;
	protected String autorMusica;
	protected String autorLetras;
	protected String tipo;
	protected Integer puntos;
	private static int totalIntegrantes=0;
	 final int MAX_INTEGRANTES;

	 //constructor con atributos heredados tambien
	public AgrupacionOficial(String nombre, String autor, String autorMusica, String autorLetras, String tipo, Integer puntos, int MAX_INTEGRANTES) {
		super(nombre, autor, autorMusica, autorLetras, tipo);
		this.puntos=puntos;// TODO Apéndice de constructor generado automáticamente
		this.MAX_INTEGRANTES = 0;
	}

	//getter para la comparacion
	public Integer getPuntos() {
		return puntos;
	}
	
	//insertar integrantes, si caben se suma el total de integrantes
	public  void insertar_integrantes(Integrante i) {
		if (totalIntegrantes < MAX_INTEGRANTES) {
			totalIntegrantes++;
		}
		
	}

	//obtener total de integrantes
	public int getIntegrantes() {
		return totalIntegrantes;
	}
	
	
	public boolean eliminar_integrante(Integrante i) {
		return false;}
	
	public abstract String caminito_del_falla();

	@Override
	public String toString() {
		return "AgrupacionOficial [nombre=" + nombre + ", autor=" + autor + ", autorMusica=" + autorMusica
				+ ", autorLetras=" + autorLetras + ", tipo=" + tipo + ", puntos=" + puntos + ", MAX_INTEGRANTES="
				+ MAX_INTEGRANTES + "]";
	}
	
	
	
}
