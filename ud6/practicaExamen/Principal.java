package ud6.practicaEx;

import ud6.practicaEx.Artista.Estilo;

public class Principal {

	public static void main(String[] args) {
		
		Musicos m1 = new Musicos("musiko1", 30);

		Musicos m2 = new Musicos("musiko2", 32);
		
		Festival f1 = new Festival("Electrolunch", 41927);
		
		Manager ma1 = new Manager("manager1", "+34 610924804");
		
		Artista a1 = new Artista("arctic monkeys", Estilo.INDIE, 10000, ma1);
		
		Artista a2 = new Artista("the strokes", Estilo.INDIE, 1200, ma1);
		
		Artista a3 = new Artista("britney spears", Estilo.POP, 1100, ma1);
		
		Artista a4 = new Artista("ariana grande", Estilo.POP, 12000, ma1);
		
		System.out.println("------------añadir musicos--------------");
		System.out.println();
		
		a1.addMusico(m1);
		a1.addMusico(m2);
		a3.addMusico(m2);
		a3.addMusico(m1);
		a1.imprimeMusico();
		
		System.out.println();
		System.out.println("------------borrar musico 2 -------------");
		System.out.println();
		
		a1.delMusico(m2);
		a1.imprimeMusico();
		
		a1.addMusico(m2);
		
		System.out.println();
		System.out.println("--------Datos músico-------");
		System.out.println("Edad: "+m1.getEdad());
		System.out.println("Nombre: "+m1.getNombreArt());
		
		System.out.println();
		System.out.println("--------Datos Manager-------");
		System.out.println("Edad: "+ma1.getTlf());
		System.out.println("Nombre: "+ma1.getNombre());
		
		System.out.println();
		System.out.println("------- inscribir artista y leer info de los mismos -----------");
	
		f1.inscribeArtista(Estilo.INDIE, a1);
		f1.inscribeArtista(Estilo.INDIE, a2);
		f1.inscribeArtista(Estilo.POP, a3);
		System.out.println(	f1.cuantosInscritos());
		f1.inscribeArtista(Estilo.POP, a4);
		System.out.println(f1.cuantosInscritos());
		f1.artistasInscritos();

		
	
	
		
	}

}
