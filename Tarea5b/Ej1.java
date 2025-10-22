package ud1.tarea5b;

import java.util.Scanner;

public class Ej1 {
public static Scanner sc = new Scanner (System.in); 
	public static void main(String[] args) {
		
		// Escribe un programa que pida por teclado un día de la semana
		// y que diga qué asignatura toca a primera hora ese día.
		
		 System.out.println("Introduzca el día de la semana a consultar: ");
		 String diaSemana= sc.nextLine();
		 
		 if(diaSemana.equals("Lunes")) {
			 System.out.println("Programación");
		 }else if(diaSemana.equals("Martes")) {
			 System.out.println("Entornos de desarrollo");
		 }else if(diaSemana.equals("Miércoles")) {
			 System.out.println("IPE");
		 }else if(diaSemana.equals("Jueves")) {
			 System.out.println("IPE");
		 }else if(diaSemana.equals("Viernes")) {
			 System.out.println("Bases de Datos");
		 } else {
			 System.out.println("ERROR, vuelva a introducir el día, con la primera letra en mayúsuclas"
			 		+ " y sin faltas de ortografía");
		 }
		

	}

}
