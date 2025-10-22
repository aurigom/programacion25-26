package ud1.tarea5b;

import java.util.Scanner;

public class Ej2 {
public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// Realiza un programa que pida una hora por teclado y que muestre
		// luego buenos días, buenas tardes o buenas noches según la hora.
		//Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. 
		//respectivamente. Sólo se tienen en cuenta las
		//horas, los minutos no se deben introducir por teclado.
		
		System.out.println("Introduzca la hora: ");
		int hora=sc.nextInt();
		
		if (hora>=6 && hora<=12) {
			System.out.println("Buenos días");
		}else if(hora>=13 && hora<=20) {
			System.out.println("Buenas tardes");
		}else if(hora>=21 || hora<=5) {
			System.out.println("Buenas noches");
		}
		

	}

}
