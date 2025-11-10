package ud3.tarea1;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		//  Diseñar una  función a la que se le pasen dos enteros y muestre todos los números comprendidos entre ellos.
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduzca un numero: ");
		int n= sc.nextInt();
		System.out.println("Introduzca otro número: ");
		int n2=sc.nextInt();
		
		entre(n, n2);
		
	}

	 static void entre(int n, int n2) {
		for (int i = n; i < n2; i++) {
			System.out.println(i);
		}
		
	}

}
