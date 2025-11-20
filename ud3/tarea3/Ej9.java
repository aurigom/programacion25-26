package ud3.tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej9 {

	public static void main(String[] args) {
		// Definir una función que tome como parámetros dos tablas, 
		//la primera con 6 números de una apuesta de la primitiva, 
		//y la segunda con los 6 números de la combinación ganadora. 
		//La función devolverá el número de aciertos.
		
		Scanner sc = new Scanner (System.in);
		int [] loteria = {1,2,3,4,5};
		int [] ganadora = {1,2,3,6,7};
		int [] ultima = new int [5];
		comparacion(loteria, ganadora, ultima);
		System.out.println(Arrays.toString(ultima));
		
		
		

	}

	 static int[] comparacion(int []loteria, int [] ganadora, int[] ultima) {
		int k=0; // la k para movernos por la combinación final
		for (int i = 0; i < loteria.length; i++) { // i para movernos por la primera combinación que es la nuestra
			
			for (int j = 0; j < ganadora.length; j++) { //j para movernos por la ganadora
				if (loteria[i]==ganadora[j]) { //si la posición i de la nuestra es igual a la j de la ganadora guardamos la i en la k 
					ultima[k]=loteria[i];
				}
			}
			 k++; //incrementamos la k para pasar a la siguiente posición de la última combinación

		}
		 
		 return ultima;
		
		
	}

}
