package ud3.tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		//Leer una serie de 6 enteros que se almacenarán en una tabla 
		//que hay que ordenar y mostrar. Hacer lo mismo con otra serie de 6 
		//enteros. A continuación, fusionar las dos tablas en una tercera, 
		//de forma que los 12 números sigan ordenados. 
		//Fusionar significa copiar en el orden correcto para que los datos
		//resultantes continúen ordenados sin necesidad de volver a realizar una ordenación.
		
		Scanner sc = new Scanner (System.in);
		int [] tabla1 = new int [5];
		
			
			for (int i = 0; i < tabla1.length; i++) {
				System.out.println("introduce un número: ");
				int num=sc.nextInt();
				tabla1[i]=sc.nextInt();
			}
			
		
	
		
		System.out.println(Arrays.toString(tabla1));

	}

}
