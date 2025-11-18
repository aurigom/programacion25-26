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
		int [] tabla1 = new int [6];
		int [] tabla2 = new int [6];
			
		//recorremos el bucle 6 veces pidiendo cada vez un num y guardandolo en i
		  System.out.println("introduce 6 números para rellenar la primera tabla: ");
	        for (int i = 0; i < tabla1.length; i++) {
	            System.out.print("Tabla1:");
	            tabla1[i] = sc.nextInt();
	        }
			
		//igual con el segundo
	        System.out.println("introduce 6 números para rellenar la segunda tabla: ");
	        for (int i = 0; i < tabla2.length; i++) {
	            System.out.print("Tabla2: ");
	            tabla2[i] = sc.nextInt();
	        }
			
	    //odernamos las dos tablas y las imprimimos
			Arrays.sort(tabla1);
	        Arrays.sort(tabla2);
		
		System.out.println("tabla 1 en orden: "+Arrays.toString(tabla1));
		System.out.println("tabla 2 en orden: "+Arrays.toString(tabla2));
		
		
		 int[] fusion = new int[12]; //tabla para almacenar las otras dos
		 int i = 0; //para movernos por la primera tabla
		 int j= 0; //para movernos por la segunda tabla
		 int k = 0; //para movernos por la tabla fusión
		 
		 
		 //mientras la i sea menor que la tabla1 y la j menor que la 2 
		 //compara la posición de la tabla1 con la de la tabla2 y si es menor la almacena en la posición correspondente de fusión
		 //incrementamos la i 
		 while (i < tabla1.length && j < tabla2.length) {
	            if (tabla1[i] <= tabla2[j]) {
	                fusion[k] = tabla1[i];
	                i++;
	                
	      // si no es menor almacenamos la posición de la tabla 2 en fusión e incrementamos la j
	            } else {
	                fusion[k] = tabla2[j];
	                j++;
	            }
	       
	            k++;
	        }
		
		 
		 
		 System.out.println("fusión: " + Arrays.toString(fusion));

		 
	}

}
