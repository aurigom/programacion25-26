package ud1.pruebas;

import java.util.Scanner;

public class Login {
public static Scanner sc=new Scanner (System.in);
	
public static void main(String[] args) {
		
		String secreta = "kiko";
		
		System.out.println("Introduzca la contraseña: ");
		String contrasenia = sc.next();
		
		boolean correcta = (contrasenia.equals(secreta))?true:false;
		
		if (correcta) {
			System.out.println("contraseña correcta");
		}else {
			System.out.println("contraseña incorrecta");
		}
		
	}

}