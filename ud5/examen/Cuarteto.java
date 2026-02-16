package ud5.examen;

public class Cuarteto extends AgrupacionOficial implements Callejera, Comparable<Agrupacion>{
//atributos
	private String nombre;
	private String autor;
	private String autorMusica;
	private String autorLetras;
	private String tipo;
	private int numMiembros;
	private Integer puntos;
	private static final int MAX_INTEGRANTES=4;
	
	//constructor
	
	public Cuarteto(String nombre, String autor, String autorMusica, String autorLetras, String tipo, int numMiembros,
			Integer puntos) {
		super(nombre, autor, autorMusica, autorLetras, tipo, puntos, MAX_INTEGRANTES);
		this.nombre= nombre;
		this.autor= autor;
		this.autorMusica=autorMusica;
		this.autorLetras=autorLetras;
		this.tipo=tipo;
		this.puntos=puntos;
		this.numMiembros = numMiembros;

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
		// TODO Apéndice de método generado automáticamente
		return "Cantando la presentación del cuarteto "+this.nombre;
	}

	@Override
	public String mostrar_tipo() {
		// TODO Apéndice de método generado automáticamente
		return "El cuarteto "+this.nombre+" va de "+this.tipo;
	}

	@Override
	public String caminito_del_falla() {
		// TODO Apéndice de método generado automáticamente
		return "El cuarteto "+this.nombre+" va caminito del falla ";
	}

	@Override
	public String amo_a_escuchar() {
		// TODO Apéndice de método generado automáticamente
		return "Amo a escucha el cuarteto "+this.nombre;
	}

	//comparar por nombre
	@Override
	public int compareTo(Agrupacion o) {
		
		return 	this.getNombre().compareTo(o.getNombre());
	}

	@Override
	public String toString() {
		return "Cuarteto [nombre=" + nombre + ", autor=" + autor + ", autorMusica=" + autorMusica + ", autorLetras="
				+ autorLetras + ", tipo=" + tipo + ", numMiembros=" + numMiembros + ", puntos=" + puntos + "]";
	}
	
	

}
