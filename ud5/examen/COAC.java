package ud5.examen;

import java.util.Arrays;

public abstract class COAC {

	//atributos
	private AgrupacionOficial[] agrupaciones;
	private final int MAX_AGRUPACIONES=40;
	private int numAgrupaciones;
	private static int totalAg;
	
	//constructor
	public COAC() {
		
		this.agrupaciones = new AgrupacionOficial[MAX_AGRUPACIONES];
		this.numAgrupaciones = 0;
		this.totalAg=0;
	}



//si el numero de agrupaciones es menor al maximo se añade la agrupacion en el indice del contador
	// se aumenta el contador y se imprime un mensaje en cualquier caso y aumentamos el total de agrupaciones
	public void inscribir_agrupacion(AgrupacionOficial agrupacion) {
		
	if (numAgrupaciones<MAX_AGRUPACIONES) {
		agrupaciones[numAgrupaciones]=agrupacion;
		numAgrupaciones++;
		System.out.println("Agrupación inscrita");
		totalAg++;
	}else {System.out.println("Ya hay demasiadas agrupaciones");}
		
		
	}
	
	//recorre el array y si una posicion coincide con la agrupacion que se le ha pasado
	//como parametro se pone dicha posicion como null y disminuimos el total de agrupaciones
	public boolean eliminar_agrupacion(AgrupacionOficial agrupacion) {
		boolean eliminado=false;
		for (int i = 0; i < agrupaciones.length; i++) {
			if (agrupaciones[i]==agrupacion) {
				agrupaciones[i]=null;
				eliminado=true;
				totalAg--;
				System.out.println("agrupación eliminada");
			}else {eliminado=false; }
		}
		
		return eliminado;
		
	}
	
	//ordenar el array e imprimir
	public void ordenar_por_puntos() {
		Arrays.sort(agrupaciones);
		for (int i = 0; i < agrupaciones.length; i++) {
			System.out.println(agrupaciones[i]);
		}
		
		
	}
	
	
	public int getTotalAgrupaciones() {
		return totalAg;
	}




	@Override
	public String toString() {
		return "COAC [agrupaciones=" + Arrays.toString(agrupaciones) + ", MAX_AGRUPACIONES=" + MAX_AGRUPACIONES
				+ ", numAgrupaciones=" + numAgrupaciones + "]";
	}
	
	
	
}
