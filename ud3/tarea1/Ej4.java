package ud3.tarea1;

import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// Diseñar una función que reciba como parámetros dos números enteros y que devuelva el mayor de los dos.

		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce un número: ");
		int num = sc.nextInt();
		System.out.println("Introduce otro número: ");
		int num2 = sc.nextInt();
		
		int mayor=0;
		
		
		System.out.println(mayor(num,num2, mayor));
	}

	 static int mayor(int num1, int num2, int mayor) {
		 
		 if (num1>num2) {
			mayor = num1;
		}else if(num2>num1){
			mayor = num2;
		}
		return mayor;
	}

}
