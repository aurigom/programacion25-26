package ud4.tarea1.act10;

import java.util.Scanner;

public class Principal {
public static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		System.out.println("Introduzca la hora:");
		int hora = sc.nextInt();
		
		System.out.println("Introduzca los minutos:");
		int minutos = sc.nextInt();
		
		System.out.println("Introduzca los segundos");
		int segundos = sc.nextInt();
		
		Hora hora1 = new Hora(hora, minutos, segundos);

		System.out.println("Introduzca la cantidad de segundos a sumar: ");
		int n = sc.nextInt();
		
		hora1.suma(n);
		
		System.out.println(hora1.toString());
	}

}
