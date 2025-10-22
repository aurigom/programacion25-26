package ud1.tarea8;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// Un centro educativo nos ha pedido que diseñemos una aplicación
		//para calcular datos estadísticos de los alumnos.
		//Se introducirán las edades de los elumnos hasta que una de ellas sea negativa.
		//La aplicación mostrará la suma de las edades, la media, de cuántos alumnos hemos
		//introducido su edad, y cuántos alumnos son mayores de edad.
		
		Scanner sc = new Scanner (System.in);
		int edad;
		int suma =0;
		int media =0;
		int numAlumnos=0;
		int mayores =0;
		
		
		
		do {
			System.out.println("Introduzca la edad del alumno: ");
			 edad=sc.nextInt();
			 
			 
			 if(edad>0) {
				 suma+=edad;
				 numAlumnos++;
				 media=suma/numAlumnos;
				if (edad>=18) {
					 mayores++;
				}
			 }
			
		}while(
				edad>0);
		
		System.out.println("La suma de las edades es: "+suma+" la media es: "+media+
				" número de alumnos: "+numAlumnos+" El número de alumnos mayores de edad:"+mayores);
		
		
		

	}

}
