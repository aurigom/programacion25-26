package ud1.pruebas;

import java.util.Scanner;

public class mayorEdad {

	public static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		
		System.out.println("introduce tu edad");
		int edad = sc.nextInt();
		
		if (edad>=18) {
			System.out.println("Eres mayor de edad");
			}else if (edad<=3) {System.out.println("bebé");
				} else if(edad<=16 && edad >=12) {
					System.out.println("Es un adolescente");
					}else {System.out.println("no clasificado");}
				
	}

}


