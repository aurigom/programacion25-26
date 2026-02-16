package ud5.examen;



public class Main {

	public static void main(String[] args) {
		
		Coro c1 = new Coro(" coro corrillo", "Ana Uribe", "Héctor Llano", "Lucas Gil", "abuelas", 3, 6, 30);
		Chirigota ch1 = new Chirigota(" chirigorra", "Jorge Limón", "Virginia Castro", "Naiara Susan", "politicos", 4, 45);
		Comparsa co1 = new Comparsa(" compadre", "Diego de Isla", "José Chivite", "Martín Rodríguez", "futbolistas", "HermanasManitas S.L", 34);
		Cuarteto cu1 = new Cuarteto(" 4babys", "Javier Delgado", "Caridad Uribe", "Ruben Llano", "películas", 4, 56);
		Romancero r1 = new Romancero(" elgitanico","Noelia Lama", "Carmen Gómez", "Jose Uribe", "princesas", "tematica1");
		
		
		System.out.println("_______________________________________________");
		System.out.println("Cantar la presentacion");
		System.out.println("________________________________________________");
		System.out.println(c1.cantar_la_presentacion());
		System.out.println(ch1.cantar_la_presentacion());
		System.out.println(co1.cantar_la_presentacion());
		System.out.println(cu1.cantar_la_presentacion());
		System.out.println(r1.cantar_la_presentacion());
		
		
		System.out.println("_______________________________________");
		System.out.println("Mostrar Tipo");
		System.out.println("_______________________________________");
		System.out.println(c1.mostrar_tipo());
		System.out.println(ch1.mostrar_tipo());
		System.out.println(co1.mostrar_tipo());
		System.out.println(cu1.mostrar_tipo());
		System.out.println(r1.mostrar_tipo());
		
		
		System.out.println("________________________________________________");
		System.out.println("Caminito del falla");
		System.out.println("________________________________________________");
		System.out.println(c1.caminito_del_falla());
		System.out.println(ch1.caminito_del_falla());
		System.out.println(co1.caminito_del_falla());
		System.out.println(cu1.caminito_del_falla());

		

		System.out.println("________________________________________________");
		System.out.println("amo a escuchar");
		System.out.println("________________________________________________");
		System.out.println(ch1.amo_a_escuchar());
		System.out.println(cu1.amo_a_escuchar());
		System.out.println(r1.amo_a_escuchar());
		
		
		System.out.println("________________________________________________");
		System.out.println("Inscribir agrupacion");
		System.out.println("________________________________________________");
		c1.inscribir_agrupacion(c1);
		cu1.inscribir_agrupacion(ch1);
		
		System.out.println("________________________________________________");
		System.out.println("Eliminar agrupacion");
		System.out.println("________________________________________________");
		c1.eliminar_agrupacion(c1);
		cu1.eliminar_agrupacion(ch1);
		
		/*
		System.out.println("________________________________________________");
		System.out.println("ordenacion");
		System.out.println("________________________________________________");
		c1.ordenar_por_puntos(); */
		
		System.out.println("________________________________________________");
		System.out.println("Total agrupaciones");
		System.out.println("________________________________________________");
		c1.inscribir_agrupacion(c1);
		cu1.inscribir_agrupacion(ch1);
		System.out.println(c1.getTotalAgrupaciones());
		
		System.out.println(ch1.compareTo(r1));

		
	}

}
