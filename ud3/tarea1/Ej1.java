package ud3.tarea1;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// Diseñar una función eco() a la que se le pasa como parámetro 
		//un número n, y muestra por pantalla n veces el mensaje "Eco..."

		Scanner sc = new Scanner (System.in);
		System.out.println("introduce un numero: ");
		int n = sc.nextInt();
		
		eco(n);
		
	}

	 static void eco(int n) {
				for (int i = 0; i < n; i++) {
					System.out.println("Eco...");
				}
	}

}
