package Repaso;

import java.util.Scanner;

public class Hucha2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		final int CAPACIDAD=80;
		Boolean llena=false;
		int saldo=0;
		int veces =0;
		int vecesR=0;
		int aportacion;
		int opcion;
		
		do {
		
		System.out.println("introduce una opcion:");
		System.out.println("---------------------");
		System.out.println("1. Ingresar dinero");
		System.out.println("2. Retirar dinero");
		System.out.println("---------------------");
		 opcion=sc.nextInt();
		
		
		switch (opcion) {
		case 1:
			
			while (llena==false) {
				System.out.println("introduce dinerito: ");
				aportacion=sc.nextInt();
				
				if (aportacion+saldo<CAPACIDAD) {
					System.out.println("dinerito introducido");
					veces++;
					saldo+=aportacion;
				}else if(aportacion+saldo>CAPACIDAD) {
					System.out.println("no tanto dinerito");
				}else if (saldo+aportacion==CAPACIDAD) {
					llena=true;
					System.out.println("hucha llenaa!!!");
				}
				
			}
			
			break;
			
		case 2:
			
			System.out.println("introduce el dinero a retirar: ");
			int retirar=sc.nextInt();
			
			saldo-=retirar;
			vecesR++;
			
			

		default:
			break;
		}
		
		} while (opcion==1||opcion==2);

	}

}
