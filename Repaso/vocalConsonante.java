package ud1.pruebas;

import java.util.Scanner;

public class vocalConsonante {
public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("introduzca una letra: ");
		char letra =sc.next().toLowerCase().charAt(0);
		
		
		switch (letra) {
		case 'a','e','i','o','u': {
			System.out.println("vocal");
			break;}
			
		case 'b','c','d','f','g','h','j','k','l','m','n','ñ','p','q','r','s','t','v','w','x','y','z': {
			System.out.println("consonante");
			break;
		}
		default: System.out.println("error");
		
		}

		
		
		
	}

}
