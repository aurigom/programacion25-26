package ud1.pruebas;

import java.util.Scanner;

public class ternaria2 {
	public static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
		// comrpobar String e Int con operación ternaria

	System.out.println("Introduce tu edad: ");	
	Byte edad=sc.nextByte();
	boolean mayor = (edad>=18)?true:false;
	
	System.out.println("Introduce tu Ciudad: ");	
	String lugar = sc.next();
	boolean ciudad = (lugar.equals("Sevilla"))?true:false;
	
	if (ciudad && mayor) {
		System.out.println("Puedes pasar");
	}else {
		System.out.println("No puedes pasar");
	}
	

}

}
