package ud3.tarea2;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		//  Diseñar una actividad que pida al usuario que 
		//introduzca una frase por teclado e indique cuántos espacios en blanco tiene.
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una frase: ");
		String frase = sc.nextLine();
		
		int contador = 0;
		
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == ' ') {
				contador++;
			}
		}
		
		System.out.println("La frase tiene " + contador + " espacios en blanco.");

}}
