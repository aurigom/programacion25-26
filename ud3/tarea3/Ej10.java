package ud3.tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej10 {
public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// Escribir la función rellenaPares() a 
		// la que se le pasa como parámetro una tabla unidimensional 
		// que debe rellenar de la siguiente forma:
		// se leerá por teclado una serie de números, guardando en la tabla 
		// los pares hasta que esté llena, e ignorando los impares. 
		// La función tiene que devolver la cantidad de impares desechados.


		int pares[]=new int[4];
		
		int impares=rellenaPares(pares);
		
	
		System.out.println("pares: "+Arrays.toString(pares));
		System.out.println("impares introducidos: "+impares);
		
		
	}

	 static int rellenaPares(int []pares) {
		 int contPares=0;
		 int contNum=0;
		 
		 while(contPares<pares.length) {
				System.out.println("Introduce un número: ");
				int num=sc.nextInt();
				
				if (num%2==0) {
					
					pares[contPares]=num;
					contPares++;
				}else {
					contNum++;
				}
				
				
				
				}
		return contNum;
		
	}

}
