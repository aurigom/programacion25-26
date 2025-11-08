package ud3.tarea1;

import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		// Repetir el ejercicio anterior con una versión que calcule 
		//el máximo de 3 números. Piensa un poco, no hagas el algoritmo de comparación de los 3 números desde cero.
		
		Scanner sc = new Scanner (System.in);
		System.out.println("introduce un numero: ");
		int num = sc.nextInt();
		System.out.println("introduce otro número: ");
		int num2 = sc.nextInt();
		System.out.println("introduce otro número");
		int num3 = sc.nextInt();
		
		mayor(num, num2, num3);
		
		
		
	}

	 static void mayor(int num1, int num2, int num3) {
		
		if (num1>num2) {
			mayor2(num1,num3);
		
		}else {
			mayor3(num2,num3);
		}
	}

	  static void mayor3(int num2, int num3) {
		if (num2>num3) {
			System.out.println("El mayor es "+num2);
		}else {
			System.out.println("El mayor es "+num3);
		}
		
	}

	static void mayor2(int num1, int num3) {
		if (num1>num3) {
			System.out.println("El mayor es "+num1);
		}else {
			System.out.println("El mayor es "+num3);
		}
		
	}
	 
	 

}
