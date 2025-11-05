package ud3.tarea1;

import java.util.Scanner;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		System.out.println("-----------------------");
		System.out.println("Introduce una opción:");
		System.out.println("1. calcular el área ");
		System.out.println("2. calcular el volumen ");
		System.out.println("-----------------------");
		int opcion =sc.nextInt();
	
		System.out.print("Introduce el radio del cilindro: ");
        double radio = sc.nextDouble();

        System.out.print("Introduce la altura del cilindro: ");
        double altura = sc.nextDouble();
        
        
        if (opcion == 1) {
            System.out.printf("El área del cilindro es: %.2f\n", calculo(opcion, radio, altura));
        } else if (opcion == 2) {
            System.out.printf("El volumen del cilindro es: %.2f\n",calculo(opcion, radio, altura));
        } else {
            System.out.println("Opción no válida.");
        }

		
	}

	 static double calculo(int opcion, double radio, double altura) {
		double resultado =0;
		switch (opcion) {
		case 1:
			resultado = 2*2.14*radio*(altura+radio);
			break;
		case 2:
			double cuadrado = radio*radio;
			resultado = 2.14*cuadrado*altura;
			break;
		default:
			break;
		}
		return resultado;
		
	}

}
