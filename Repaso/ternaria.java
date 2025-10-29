package ud1.pruebas;

import java.util.Scanner;

public class ternaria {
public static Scanner sc= new Scanner (System.in);

	public static void main(String[] args) {
		// comprobar si es mayor de edad con operaciones ternarias

		System.out.println("Introduce tu edad: ");
		int edad = sc.nextInt();
		
		boolean pasa = (edad>=18) ? true : false;
		
		
	if (pasa) {
		System.out.println("adelante");
		}		else {
			System.out.println("No puede pasar");
			}
	
	
	}

}
