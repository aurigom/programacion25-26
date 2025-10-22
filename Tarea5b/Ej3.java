package ud1.tarea5b;

import java.util.Scanner;

public class Ej3 {
public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// Escribe un programa en que dado un número del
		// 1 a 7 escriba el correspondiente nombre del día de la semana.
		
		System.out.println("Introduzca un número del 1 al 7");
		int num = sc.nextInt();
		
		if(num<1 || num >7) {
			System.out.println("Error, introduzca de nuevo el número, entre 1 y 7");
		}
		
		if (num==1) {
			System.out.println("Lunes");
		}else if(num==2) {
			System.out.println("Martes");
		}else if(num==3) {
			System.out.println("Miércoles");
		}else if(num==4) {
			System.out.println("Jueves");
		}else if(num==5) {
			System.out.println("Viernes");
		}else if(num==6) {
			System.out.println("Sábado");
		}else if(num==7) {
			System.out.println("Domingo");
		}
		
	}

}
