package ud5.examen;

import java.util.Comparator;

public class CompAutor implements Comparator <Agrupacion>{
//comparar por autor
	@Override
	public int compare(Agrupacion o1, Agrupacion o2) {

		return 	o1.getAutor().compareTo(o2.getAutor()); }

}
