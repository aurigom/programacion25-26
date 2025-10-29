package ud1.pruebas;

import java.util.Scanner;


public class PruebaSwitch {

	public static void main(String[] args) {
	

		System.out.println("introduce el mes: ");
		Scanner sc = new Scanner (System.in);
		String mes = sc.next().toLowerCase();
		
		
		switch (mes) {
		case "enero","febrero","diciembre":
			System.out.println("invierno");
			break;
	
			
		case "marzo","abril","mayo":
			System.out.println("Primavera");
			break;
			
		case "junio","julio","agosto":
			System.out.println("verano");
			break;
			
		case "septiembre","octubre","noviembre":
			System.out.println("otoño");
			break;
			
		
			
		default: System.out.println("error");
			break;
		}
		
	}

}
