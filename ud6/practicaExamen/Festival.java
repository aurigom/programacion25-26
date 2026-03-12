package ud6.practicaEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import ud6.practicaEx.Artista.Estilo;

public class Festival {

	protected String nombreFestival;
	protected int CP;
	private static int totalArtistas =0;
	
	List<Artista> artistas = new ArrayList<>();
	
	Map <Estilo, List<Artista>> musikos = new HashMap<>();

	public Festival(String nombreFestival, int CP) {
		this.nombreFestival = nombreFestival;
		this.CP = CP;
	} 
	
	
	public void inscribeArtista(Estilo estilo, Artista artista) {
		artistas.add(artista);
		
		musikos.put(estilo, new ArrayList<>());
		musikos.get(estilo).add(artista);
		totalArtistas++;
	}
	
	public int cuantosInscritos() {
		return totalArtistas;
	}
	
	public void artistasInscritos() {

		Collections.sort(artistas);
		for(Artista a : artistas) {
			System.out.println(a);
		}
	}
	
	public void cargarArtistas() {
		
	}
	
	public void guardarArtistas() {
		
	}
	
	
	
	
}
