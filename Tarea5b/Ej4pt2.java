package ud1.tarea5b;

import java.util.Scanner;

public class Ej4pt2 {
public static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// Vamos a ampliar uno de los ejercicios de la relación 
		//anterior para considerar las horas extras. 
		//Escribe un programa que calcule el salario semanal de un trabajador 
		//teniendo en cuenta que las horas ordinarias (40 primeras horas de
		//trabajo) se pagan a 12 euros la hora. 
		//A partir de la hora 41, se pagan a 16 euros la hora.

		final int horasNormales = 40; 
		
		System.out.println("Por favor, introduzca el número de horas trabajadas durante la semana:");
		int horasTrabajadas = sc.nextInt();
		int i=0;
		int salario=horasTrabajadas *12;
		int horasExt = horasTrabajadas - horasNormales;
		do {
			
			if(horasTrabajadas <= horasNormales) {
			
				salario= horasTrabajadas *12;
			
				
	
			}else if(horasTrabajadas >=40) {
				
				
				salario = (horasNormales*12) + (horasExt*16);

			}
			
			i++;
			
		}while(horasTrabajadas>i);
			
		System.out.println("Su salario es de: "+ salario+ " euros");
	}
	
}
