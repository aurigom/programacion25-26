package ud6.practicaEx;

import java.util.ArrayList;
import java.util.List;

public class Artista implements Comparable<Artista>{

	protected String nombreArt;
	public enum Estilo{
		POP, ROCK, INDIE
	} ;
	 
	protected double cache;
	Manager manager;
	List<Musicos> musicos = new ArrayList();
	

	public Artista(String nombreArt, Estilo estilo, double cache, Manager manager) {
		this.nombreArt = nombreArt;

		this.cache = cache;
		this.manager = manager;

	}

	public void addMusico(Musicos musico) {
		
		musicos.add(musico);
		
	}
	
	public void delMusico(Musicos musico) {
		musicos.remove(musico);
		
	}
	
	public void imprimeMusico() {
		
		for(Musicos m : musicos) {
			System.out.println(m);
		}
		
	}


	@Override
	public int compareTo(Artista o) {
		return this.nombreArt.compareTo(o.nombreArt);
	    
		
	}

	@Override
	public String toString() {
		return "Artista [nombreArt=" + nombreArt + ", cache=" + cache + ", manager=" + manager + ", musicos=" + musicos
				+ "]";
	}
	
	
	
	
	
}
