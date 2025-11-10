package ud3.tarea2;

import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		//  Introducir por teclado una frase palabra a palabra, 
		//	y mostrar la frase completa separando las palabras 
		//	introducidas con espacios en blanco. Terminar de leer la frase 
		//	cuando la palabra introducida sea "fin" escrita con cualquier combinación 
		//	de mayúsculas/minúsculas. La cadena "fin" no aparecerá en la frase final.
		
		Scanner sc= new Scanner (System.in);
		String frase = " ";
		String palabra;
		
		
	do {System.out.println("Introduce una palabra (escribe 'fin' para terminar): ");
	palabra = sc.nextLine();
	
	if(palabra.equalsIgnoreCase("fin")==false) {
		frase +=  palabra + " ";
	}
		
	}
	
	
	while(palabra.equalsIgnoreCase("fin")==false) ;
		
		

		System.out.println(frase + " ");
	
		
		sc.close();
		
		
		
	}

}
