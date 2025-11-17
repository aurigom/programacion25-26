package ud3.tarea3;

import java.util.Random;
import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		// Juego: La cámara secreta. El jugador especifica el número de dígitos 
		//de la clave secreta. La aplicación genera de forma aleatoria, 
		//una combinación secreta de n dígitos del 1 al 5 
		//(siendo n la longitud indicada anteriormente por el usuario).
		//El jugador introduce ahora una combinación de prueba. 
		//En cada intento se mostrará como pista, para cada dígito, 
		//si es mayor menor o igual que el correspondiente de la combinación secreta.
		
		Scanner sc = new Scanner (System.in);
		Random random = new Random();
		Boolean acertada=false;
		
		int [] numeros;
		
		System.out.println("introduce el nº de dígitos de la clave secreta");
		int digitos = sc.nextInt();
		
		numeros= new int[digitos];
		
		 for (int i = 0; i < numeros.length; i++) {
	            numeros[i] = random.nextInt(numeros.length);  
	        }
		 
		 do {
			 
			 System.out.println("introduce una combinación: ");
			 String combinacion=sc.nextLine();
			 char[] combi;
			 combi= combinacion.toCharArray();
			 
			 
			 
			 
		 }while(acertada!=false);
		 

	}

}
