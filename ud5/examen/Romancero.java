package ud5.examen;

public class Romancero extends Agrupacion implements Callejera{
//atributos

	private String nombre;
	private String autor;
	private String autorMusica;
	private String autorLetras;
	private String tipo;
	private String tematicaCartelon;
	
	//constructor
	
	public Romancero(String nombre, String autor, String autorMusica, String autorLetras, String tipo,
			String tematicaCartelon) {
		super(nombre, autor, autorMusica, autorLetras, tipo);
		this.nombre= nombre;
		this.autor= autor;
		this.autorMusica=autorMusica;
		this.autorLetras=autorLetras;
		this.tipo=tipo;
		
		this.tematicaCartelon = tematicaCartelon;
	}

	
	//getters
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
		return "Cantando la presentación del romancero "+this.nombre;
	}

	@Override
	public String mostrar_tipo() {
		// TODO Apéndice de método generado automáticamente
		return "El romancero "+this.nombre+" va de "+this.tipo;
	}

	@Override
	public String amo_a_escuchar() {
		// TODO Apéndice de método generado automáticamente
		return "Amo a escucha el romancero "+this.nombre;
	}
	
	//comparar por nombre

	@Override
	public int compareTo(Agrupacion o) {
		
		return 	this.getNombre().compareTo(o.getNombre());
	}



	@Override
	public String toString() {
		return "Romancero [nombre=" + nombre + ", autor=" + autor + ", autorMusica=" + autorMusica + ", autorLetras="
				+ autorLetras + ", tipo=" + tipo + ", tematicaCartelon=" + tematicaCartelon + "]";
	}
	

}
