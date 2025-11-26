package ud3.tarea4;

import java.util.Scanner;

public class Ej1 {

	public static void main(String[] args) {
		// Escribe un programa que rellene un array de 100 elementos con números
		//en-teros aleatorios comprendidos entre 0 y 500 (ambos incluidos). 
		//A continuaciónel programa mostrará el array y preguntará si el 
		//usuario quiere destacar elmáximo o el mínimo. Seguidamente se volverá a 
		//mostrar el array escribiendoel número destacado entre dobles asteriscos.
		
		Scanner sc = new Scanner (System.in);
		
		int cantidad = 100;
		int num[]=new int[cantidad];
		
		for (int i = 0; i < num.length; i++) {
			
			num[i]= (int) (Math.random()*501);
			
			
		}

		for (int i = 0; i < num.length; i++) {
			
			System.out.print(num[i]+" , ");
			
			
		}
		System.out.println();
		System.out.println(" que opción quiere destacar: (1 – mínimo, 2 – máximo): ");
		int opcion = sc.nextInt();
		int min =num[0];
		int max=0;
		
		switch (opcion) {
		case 1:
			for (int i = 0; i < num.length; i++) {
				if (num[i]<min) {
					min=num[i];
					
				}
				
			}
			
			for (int i = 0; i < num.length; i++) {
				if (min==num[i]) {
					System.out.print(" * "+num[i]+" * ,");
				}else {
					System.out.print(num[i]+" , ");
				}
				
			}
			break;
		case 2:
			for (int i = 0; i < num.length; i++) {
				if (num[i]>max) {
					max=num[i];
					
				}
				
			}
			
			for (int i = 0; i < num.length; i++) {
				if (max==num[i]) {
					System.out.print(" * "+num[i]+" * ,");
				}else {
					System.out.print(num[i]+" , ");
				}
				
			}
			break;
		default:
			break;
		}
      

	}

}
