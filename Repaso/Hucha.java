package ud1.pruebas;

import java.util.Scanner;

public class Hucha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		final int capacidad = 80;
		int cont=0;
		Boolean llena =false;
		int veces=0;
		
		//mientras el contador (la cantidad de dinero que llevamos) sea menor a 80
		//pedirá la aportacion
		while(cont<capacidad) {
			System.out.println("Introduzca una aportacióna la hucha: ");
			int aportacion=sc.nextInt();
			
					//si la aportación más la cantidad total supera la capacidad
					// pedirá otra aportación hasta que sea válida
					while ((aportacion + cont) > capacidad) {
		                System.out.println("Esa aportación supera la capacidad de la hucha. Introduzca una cantidad válida:");
		                aportacion = sc.nextInt();
		                llena =false;
		            }
					
			//si la aportación es válida muestra ese mensaje, actualiza el contador con la nueva 
			//cantidad y actualiza el n de veces y el boolean
			System.out.println("aportacion realizada");
			llena = true;
			cont += aportacion;
            veces++;
           
		}
		
		//por último si la hucha está llena mostramos lo siguiente 
		 if (llena==true) {
             System.out.println("¡La hucha está llena!");
             System.out.println("ha rellenado la hucha "+veces+" veces y hay "+cont+" de cantidad");
         }
		
		sc.close();
	}

}
