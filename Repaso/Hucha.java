package Repaso;

import java.util.Scanner;

public class Hucha {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		final int CAPACIDAD=80;
		Boolean llena=false;
		int saldo=0;
		int veces =0;
		
		int aportacion;
		
		
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
		
		
		
	}

}
