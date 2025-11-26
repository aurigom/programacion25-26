package ud3.tarea4;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		// Escribe un programa que pida 8 palabras y las almacene en un array. 
		//Acontinuación, las palabras correspondientes a colores se deben almacenar 
		//alcomienzo y las que no son colores a continuación. 
		//Puedes utilizar tantos arraysauxiliares como quieras. 
		//Los colores que conoce el programa deben estar enotro array y son los siguientes: 
		//verde, rojo, azul, amarillo, naranja, rosa, negro,blanco y morado
		
		Scanner sc = new Scanner (System.in);
	
		String[]palabras=new String[7];
		String[] colores = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
		
		for (int i = 0; i < palabras.length; i++) {
			System.out.println("introduce la "+i+1+" palabra: ");
			 palabras[i] = sc.nextLine();
			
		}
		
		for (int i = 0; i < palabras.length; i++) {
			for (int j = 0; j < colores.length; j++) {
				if (palabras[i].equals(colores[i])) {
					
				}
			}
		}
		
		
}}
