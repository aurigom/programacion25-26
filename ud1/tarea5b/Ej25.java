package ud1.tarea5b;

import java.util.Scanner;

public class Ej25 {

	public static void main(String[] args) {
		// Realiza un programa que calcule el precio de un desayuno. 
		//El programa preguntará primero qué ha tomado el usuario de comer: 
		//palmera, donut o pitufo. La palmera vale 1.40 € y el donut 1 €. En caso de tomar pitufo,
		//el programa debe preguntar además si era con aceite o con tortilla; el primero vale 1’20 € 
		//y el segundo 1’60 €. Por último se pregunta por la bebida: zumo o café a 1’50 y 1’20 respectivamente.
		
		Scanner sc = new Scanner (System.in);
	
		final float precioPalmera = 1.40f;
		final float precioDonut = 1f;
		final float aceite = 1.20f;
		final float tortilla = 1.60f;
		final float zumo = 1.50f;
		final float cafe = 1.20f;
		
		float precioTotal = 0;
		String complementoPitufo =null;
		
		float precioComida=0f;
		float precioBebida=0f;
		
		
		System.out.println("¿Qué ha tomado de comer? (palmera, donut o pitufo)");
		String comida = sc.next().toLowerCase();
		
		
		switch (comida) {
		case "palmera": {
			precioTotal+=precioPalmera;
			
			precioComida+=precioPalmera;
			break;
		}
		
		case "donut": {
			precioTotal+=precioDonut;
			precioComida+=precioDonut;
			break;
		}
		
		case "pitufo": {

			System.out.println("¿Con qué se ha tomado el pitufo? (aceite o tortilla)");
			complementoPitufo=sc.next().toLowerCase();
			
			if (complementoPitufo.equals("aceite")) {
				precioTotal+=aceite;
				precioComida+=aceite;
			}else if (complementoPitufo.equals("tortilla")) {
				precioTotal+=tortilla;
				precioComida+=tortilla;
			}
				
			
			break;
		}
		
		default:
			System.out.println("error");
		}
		
		
		System.out.println("¿Qué ha tomado de beber? (zumo o café)");
		String bebida = sc.next().toLowerCase();
		
		switch (bebida) {
		case "zumo": {
			
			precioTotal+=zumo;
			precioBebida+=zumo;
			
			break;
		}
		
		case "cafe": {
			
			precioTotal+=cafe;
			precioBebida+=cafe;
			
			break;
		}
		default:
			System.out.println("error");
		}
		
		if (comida.equals("pitufo")) {
			System.out.println(comida+" con "+complementoPitufo+" = "+precioComida);
			System.out.println(bebida+" = "+precioBebida);
			System.out.println("Precio Total= "+precioTotal);
		}else{
			System.out.println(comida +" = "+precioComida);
			System.out.println(bebida+ " = "+precioBebida);
			System.out.println("Precio Total= "+precioTotal);
		}

	}

}
