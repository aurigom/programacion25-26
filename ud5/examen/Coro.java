package ud5.examen;

public class Coro extends AgrupacionOficial{

	//atributos
	private String nombre;
	private String autor;
	private String autorMusica;
	private String autorLetras;
	private String tipo;
	private int numBandurrias;
	private int numGuitarras;
	private Integer puntos;
	private static final int MAX_INTEGRANTES = 40;
	
	
	//constructor
	
	public Coro(String nombre, String autor, String autorMusica, String autorLetras, String tipo, int numBandurrias, int numGuitarras,
			Integer puntos) {
		super(nombre, autor, autorMusica, autorLetras, tipo, puntos, MAX_INTEGRANTES);
		this.nombre= nombre;
		this.autor= autor;
		this.autorMusica=autorMusica;
		this.autorLetras=autorLetras;
		this.tipo=tipo;
		this.puntos=puntos;
		this.numBandurrias = numBandurrias;
		this.numGuitarras = numGuitarras;
	}
	
	//getters
	public Integer getPuntos() {
		return puntos;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getAutor() {
		return autor;
	}
	
	//metodos heredados
	@Override
	public String cantar_la_presentacion() {
		return "Cantando la presentación del coro"+this.nombre;
		
		
	}

	@Override
	public String mostrar_tipo() {
		return "El coro "+this.nombre+" va de "+this.tipo;
		
	}



	@Override
	public String caminito_del_falla() {
		// TODO Apéndice de método generado automáticamente
		return "El cuarteto "+this.nombre+" va caminito del falla ";
	}

//comparar por nombre

	@Override
	public int compareTo(Agrupacion o) {
		// TODO Apéndice de método generado automáticamente
		return 	this.getNombre().compareTo(o.getNombre());
	}

	@Override
	public String toString() {
		return "Coro [nombre=" + nombre + ", autor=" + autor + ", autorMusica=" + autorMusica + ", autorLetras="
				+ autorLetras + ", tipo=" + tipo + ", numBandurrias=" + numBandurrias + ", numGuitarras=" + numGuitarras
				+ ", puntos=" + puntos + "]";
	}

	
}
