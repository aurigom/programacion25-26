package ud3.tarea2;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce la primera palabra: ");
		String palabra1 = sc.nextLine();
		System.out.println("Introduce la segunda palabra: ");
		String palabra2 = sc.nextLine();
	
		
		if (palabra1.length()<palabra2.length()) {
			System.out.println("La palabra más corta es: "+palabra1);
		} else if (palabra2.length()<palabra1.length()) {
			System.out.println("La palabra más corta es: "+palabra2);
		} else {
			System.out.println("Las dos palabras tienen la misma longitud.");
		}

		
	}

}
