package ud5.tarea1.act7;

import ud5.tarea1.act7.Caja.Unidades;

public class Principal {

	public static void main(String[] args) {
		
		Caja caja1= new Caja(2, 1, 3, Unidades.M);
		CajaCarton carton1 = new CajaCarton(2, 1, 3, 1);
		CajaCarton carton2= new CajaCarton(2,1,3,3);
		CajaCarton carton3= new CajaCarton(2,1,3,3);
		
		//caja normal
		System.out.println("El volumen de la caja 1 es de: "+caja1.getVolumen());
		System.out.println("Caja 1: "+caja1.toString());
		
		//caja carton
		System.out.println();
		System.out.println("Caja cartón 1 volumen: "+carton1.getVolumen());
		System.out.println("Caja cartón 1 superficie: "+carton1.superficieCajacarton());
		System.out.println("Caja cartón 1: "+caja1.toString());
		
		//superficie total 
		System.out.println();
		System.out.println("Superficie total cajas cartón: "+CajaCarton.getSuperficieT());

	}

}
