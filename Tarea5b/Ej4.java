package ud1.tarea5b;

import java.util.Scanner;

public class Ej4 {
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
		
	
		
		int salario; 

		//si las horas trabajadas son menores o iguales a la jornada normal 
		//el salario es horax12, al precio normal
		if(horasTrabajadas <= horasNormales) {
			
			salario= horasTrabajadas *12;
			
			System.out.println("Su salario es de: "+ salario +" euros");
			
			//si las horas trabajadas son superiores a 40, se calcula el salario con las horas extra
			//(horas trabajadas menos la jornada normal)
			//multiplicando las horas extra por 16, las normales por doce y multiplicando
		}else if(horasTrabajadas >=40) {
			
			int horasExt = horasTrabajadas - horasNormales;
			salario = (horasNormales*12) + (horasExt*16);
			System.out.println("Su salario es de: "+ salario+ " euros");
		}
		
	}

}
