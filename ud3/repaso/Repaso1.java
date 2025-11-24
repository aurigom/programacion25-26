package Repaso;

import java.util.Arrays;
import java.util.Scanner;

public class Repaso1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
	
		
		char[] rellenar= new char [5];
		for (int i = 0; i < rellenar.length; i++) {
			
			System.out.println("introduce una vocal: ");
			char vocal=sc.next().charAt(0);
			
			if (vocal=='a'||vocal=='e'||vocal=='i'|| vocal == 'o'|| vocal == 'u') {
				rellenar[i]=vocal;
			}else {rellenar[i]='0';}
		}
		
		System.out.println(Arrays.toString(rellenar));
		
	}

}
