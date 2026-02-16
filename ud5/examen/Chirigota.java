package ud5.examen;

public class Chirigota extends AgrupacionOficial implements Callejera{

	//atributos
	
	private String nombre;
	private String autor;
	private String autorMusica;
	private String autorLetras;
	private String tipo;
	private int numCuples;
	private Integer puntos;
	private static final int MAX_INTEGRANTES=15;
	
	
	
	//constructor
	public Chirigota(String nombre, String autor, String autorMusica, String autorLetras, String tipo, int numCuples, Integer puntos) {
		super(nombre, autor, autorMusica, autorLetras, tipo, puntos, MAX_INTEGRANTES);
		this.nombre= nombre;
		this.autor= autor;
		this.autorMusica=autorMusica;
		this.autorLetras=autorLetras;
		this.tipo=tipo;
		this.puntos=puntos;
		this.numCuples = numCuples;
		

	}
	
	//getters para los comparable/comparator
	
	public Integer getPuntos() {
		return puntos;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getAutor() {
		return autor;
	}
	
	//implementamos los metodos heredados
	public String cantar_la_presentacion() {
		return "Cantando la presentación de la chirigota"+this.nombre;
		
		
	}

	public String mostrar_tipo() {
		return "La chirigota "+this.nombre+" va de "+this.tipo;
		
	}

	@Override
	public String caminito_del_falla() {
		// TODO Apéndice de método generado automáticamente
		return "El cuarteto "+this.nombre+" va caminito del falla ";
	}

	@Override
	public String amo_a_escuchar() {
		
		return "Amo a escucha la chirigota "+this.nombre;
	}

	//compareTo por nombre
	@Override
	public int compareTo(Agrupacion o) {
		// TODO Apéndice de método generado automáticamente
		return 	this.getNombre().compareTo(o.getNombre());
	}

	@Override
	public String toString() {
		return "Chirigota [nombre=" + nombre + ", autor=" + autor + ", autorMusica=" + autorMusica + ", autorLetras="
				+ autorLetras + ", tipo=" + tipo + ", numCuples=" + numCuples + ", puntos=" + puntos + "]";
	}
	
	

}
