package ud5.examen;

public abstract class Agrupacion extends COAC implements Comparable <Agrupacion>{

	//declaramos los atributos
	public String nombre;
	protected String autor;
	protected String autorMusica;
	protected String autorLetras;
	protected String tipo;
	
	//constructor
	public Agrupacion(String nombre, String autor, String autorMusica, String autorLetras, String tipo) {
		this.nombre=nombre;
		this.autor=autor;
		this.autorMusica=autorMusica;
		this.autorLetras=autorLetras;
		this.tipo=tipo;
		
	}
	

// getter para comparar
	public String getNombre() {
		return nombre;
	}

	public String getAutor() {
		return autor;
	}

	//metodos abstractos  que s eimplementaran en las otras clases
	public abstract String cantar_la_presentacion();
	
	public abstract String mostrar_tipo();



	@Override
	public String toString() {
		return "Agrupacion [nombre=" + nombre + ", autor=" + autor + ", autorMusica=" + autorMusica + ", autorLetras="
				+ autorLetras + ", tipo=" + tipo + "]";
	}
	
	
	
}
