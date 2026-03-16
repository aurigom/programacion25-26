package ud6.examen.uribe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Optica {

	private String nombre;
	private String CIF;
	private static int gafasTotales=0;
	private static double precioTotalTipo=0;
	
	
	List<GafaSol> gafaSol;
	Map<TipoGafa, Set<Gafa>> gafas ;

	public Optica(String nombre, String cIF) {
		this.nombre = nombre;
		CIF = cIF;
		gafas = new HashMap<>();

	}
	
	//introducimos el tipo e inicializamos el hashset
	//en base al tipo metemos la gafa en el set
	//aumentamos el contador 
	public void addGafa(TipoGafa tipo, Gafa g) {
		
		gafas.put(tipo, new HashSet<>());
		gafas.get(tipo).add(g);
		
		gafasTotales++;
		
		
		
	}
	
	public void delGafas(Gafa g) {
		
		gafas.remove(g);
		gafasTotales--;
		
	}
	
	
	public int cuantasGafas() {
		return gafasTotales;
			
	}
	
	public void gafasByProveedor() {
		gafaSol = new ArrayList<>();
	//intento de ordenar las gafas de sol mediante los prveedores por una lista de gafas de sol
	//	Collections.sort(gafaSol);
		
		//he dejado que solo imprima el mapa aunque no lo ordene
	for(TipoGafa g : gafas.keySet()) {
		
		System.out.println(gafas.get(g) + "valores: "+gafas.values());
	}
		
	}
	
	//va recorriendo en base al tipo y va sumando al contador el precio de dicho tipo
	public void costeGafasByTipo(TipoGafa tipo) {
		
		for(Gafa g : gafas.get(tipo)) {
			precioTotalTipo += g.getPrecio();
			System.out.println(precioTotalTipo);
		}
	}
	
	//si el precio es menor que el coste decuelve el coste, sino el precio
	public double damePrecioGafa(Gafa g) {

		if (g.getPrecio()<g.getCoste()) {
			System.out.println("precio tras descuento");
			return g.getCoste();
		}
		System.out.println("precio tras descuento");
		
		
		return g.getPrecio();
	}

	@Override
	public String toString() {
		return "Optica [nombre=" + nombre + ", CIF=" + CIF + ", gafas=" + gafas + "]";
	}
	
	
	
	
	
}
