package ud1.tarea5b;

import java.util.Scanner;

public class Ej6 {
public static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		//Realiza un programa que calcule la media de tres notas que se solicitarán al usuario.
		
		
		System.out.println("Introduzca la primera nota");
		float nota1 = sc.nextFloat();
		
		System.out.println("Introduzca la segunda nota");
		float nota2 = sc.nextFloat();
		
		System.out.println("Introduzca la tercera nota");
		float nota3 = sc.nextFloat();
		
		
		float res = (nota1+nota2+nota3)/3;
		
		System.out.println("La media es de "+res);
		
	}

}
