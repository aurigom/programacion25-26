package ud1.tarea5b;

import java.util.Scanner;

public class Ej5 {
	public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		//Realiza un programa que resuelva una ecuación de primer grado (del tipo ax+b = 0).
	
	
	System.out.println("Este programa resuelve ecuaciones de primer grado del tipo ax + b = 0");
	
	System.out.println("Por favor, introduzca el valor de a: ");
	float a = sc.nextFloat();
	
	
	System.out.println("Ahora introduzca el valor de b: ");
	float b = sc.nextFloat();
	
	float res = -b / a;
	
	if(a==0) {
		System.out.println("Esta ecuación no tiene una solución real");
	}
	
	System.out.println("El resultado es: "+ res);
	
	}

}


