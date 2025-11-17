package ud3.tarea3;

import java.util.Scanner;

public class Ej1B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] nombres;
		nombres= new String[5];
		
		Scanner sc = new Scanner (System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("introduce un nombre");
			nombres[i]=sc.nextLine();
			
		}
	
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
		
	}

}
