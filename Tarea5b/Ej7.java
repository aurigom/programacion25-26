package ud1.tarea5b;

import java.util.Scanner;

public class Ej7 {
public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// Amplía el programa anterior para que diga la nota del boletín
		//(insuficiente, suficiente, bien, notable o sobresaliente).

		
		
		System.out.println("Introduzca la primera nota");
		float nota1 = sc.nextFloat();
		
		System.out.println("Introduzca la segunda nota");
		float nota2 = sc.nextFloat();
		
		System.out.println("Introduzca la tercera nota");
		float nota3 = sc.nextFloat();
		
		
		float res = (nota1+nota2+nota3)/3;
		
		if(res>=5&&res<6) {
			System.out.println(res+"suficiente");
		}else if(res>=6&&res<7) {
			System.out.println(res+"Bien");
		}else if(res>=7&&res<=8) {
			System.out.println(res+"notable");
		}else if(res>=9&&res<=10) {
			System.out.println(res+"Sobresaliente");		
			}else if(res<5) {
				System.out.println("insuficiente");
			}
		
		
	}

}
