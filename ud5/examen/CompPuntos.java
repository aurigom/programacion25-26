package ud5.examen;

import java.util.Comparator;

public class CompPuntos implements Comparator <AgrupacionOficial> {
//comparar por puntos
	@Override
	public int compare(AgrupacionOficial o1, AgrupacionOficial o2) {
		
		return o1.getPuntos().compareTo(o2.getPuntos());
	}

}
