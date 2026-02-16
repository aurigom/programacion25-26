package ud5.examen;

public class Comparsa extends AgrupacionOficial {

	//atributos
	private static final int MAX_INTEGRANTES = 20;
	private String nombre;
	private String autor;
	private String autorMusica;
	private String autorLetras;
	private String tipo;
	private String empresa;
	private Integer puntos;

	
	
	//constructor
	
	public Comparsa(String nombre, String autor, String autorMusica, String autorLetras, String tipo, String empresa,
			Integer puntos) {
		super(nombre, autor, autorMusica, autorLetras, tipo, puntos, MAX_INTEGRANTES);
		this.nombre= nombre;
		this.autor= autor;
		this.autorMusica=autorMusica;
		this.autorLetras=autorLetras;
		this.tipo=tipo;
		this.puntos=puntos;
		this.empresa = empresa;
	}
	
	//getters para los compare/To
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
		return "Cantando la presentación de la comparsa "+this.nombre;
	}
	@Override
	public String mostrar_tipo() {
		// TODO Apéndice de método generado automáticamente
		return "La comparsa "+this.nombre+" va de "+this.tipo;
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
		return "Comparsa [nombre=" + nombre + ", autor=" + autor + ", autorMusica=" + autorMusica + ", autorLetras="
				+ autorLetras + ", tipo=" + tipo + ", empresa=" + empresa + ", puntos=" + puntos + "]";
	}
	
	
	
}
