package ud1.pruebas;


import java.util.Scanner;

public class forClave {
public static Scanner sc = new Scanner (System.in);

public static void main(String[] args) {
	// pide la contraseña hasta que sea correcta

	String contrasenia = "kiko";
	boolean correcta=false;
	int i=3;
	
	do {
	System.out.println("introduce la clave");
	String clave = sc.next();
	correcta = (clave.equals(contrasenia))?true:false;
	
	if(correcta) {
		System.out.println("Correcto");
	}else {
		i--;
		System.out.println("le quedan: "+i+" intentos");
	}
	
	}while(!correcta && i>0);
	
}

}
