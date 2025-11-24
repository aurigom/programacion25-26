package Repaso;

import java.util.Scanner;

public class P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner (System.in);
		char letra;
		
		do {
			System.out.println("introduzca una letra: ");
			 letra = sc.nextLine().toLowerCase().charAt(0);
		} while (letra!='p');

	}

}
