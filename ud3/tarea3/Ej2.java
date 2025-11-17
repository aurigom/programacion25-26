package ud3.tarea3;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// Escribir una aplicación que solicite al usuario cuántos números desea introducir. 
		// A continuación, se introducirá por teclado esa cantidad de números enteros,
		// y por último, los mostrará en el orden inverso al introducido.
		
		Scanner sc = new Scanner (System.in);
		int[] numeros ;
		
		
		System.out.println("Cuantos nº desea introducir?");
		int cantidad = sc.nextInt();
		numeros= new int[cantidad];
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("introduce un numero: ");
			 numeros[i] =sc.nextInt();
		}
		for (int i = numeros.length - 1; i >=0; i--) {
			System.out.println(numeros[i]);
		}
		
	}

}
