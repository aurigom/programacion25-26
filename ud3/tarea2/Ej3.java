package ud3.tarea2;

import java.util.Scanner;

public class Ej3 {
		
		public static void main(String[] args) {
			//Diseñar un programa que pida una frase al usuario, e indique si el carácter de la posición central es o no un espacio

			Scanner sc = new Scanner (System.in);
			System.out.println("Introduce una frase: ");
			String frase = sc.nextLine();
			
			
			if (frase.charAt(frase.length()/2)==' ') {
				System.out.println("El caracter central es un caracter en blanco");
			}else {
				System.out.println("no es un caracter en blanco");
			}
			
		
			
		}
		
		
	}


