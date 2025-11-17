package ud3.tarea3;

import java.util.Scanner;

public class Ej1 {
public static void main(String[] args) {
	
	
	// Diseñar un programa que solicite al usuario 5 números decimales.
	//A continuación, debe mostrar los números en el mismo orden en que se han introducido.
	int[] numeros;
	numeros= new int[5];
	
	Scanner sc = new Scanner (System.in);
	System.out.println("Introduce un numero");
	numeros[0]=sc.nextInt();
	
	System.out.println("Introduce un numero");
	numeros[1]=sc.nextInt();
	
	System.out.println("Introduce un numero");
	numeros[2]=sc.nextInt();
	
	System.out.println("Introduce un numero");
	numeros[3]=sc.nextInt();
	
	System.out.println("Introduce un numero");
	numeros[4]=sc.nextInt();
	
	for (int i = 0; i < numeros.length; i++) {
		System.out.println(numeros[i]);
	}
	
	
}
}
