package ud5.tarea2.act3;

import java.util.Arrays;

public class Main {
public static void main(String[] args) {
	
	figura[] figurasGeometricas = new figura[5];
	
	figurasGeometricas[0]= new Triangulo(3.45, "Rojo", 4.8);
	figurasGeometricas[1]=new Cuadrado(4.5, "Azul");
	figurasGeometricas[2]=new Cuadrado(5.5, "Amarillo");
	figurasGeometricas[3]=new Triangulo();
	figurasGeometricas[4]= new Triangulo(5.45, "Verde", 4.8);
	
	Triangulo[] triangulos = new Triangulo[3];
	
	triangulos[0]=new Triangulo(4.0, "Amarillo", 6);
	triangulos[1]=new Triangulo(6.0, "Verde", 5);
	triangulos[2]=new Triangulo(6.0, "Rojo", 5);
	
	for (int i = 0; i < figurasGeometricas.length; i++) {
		System.out.println(figurasGeometricas[i]);
	}
	
	
	System.out.println(PoligonoRegular.getContadorPoligonos());
	System.out.println();
	
	/*
	System.out.println("Comparación dos triangulos: ");
	System.out.println(figurasGeometricas[0].equals(figurasGeometricas[4]));
	*/
	
	System.out.println();
	System.out.println("Orden por lado--------------------");
	Arrays.sort(triangulos);
	System.out.println(Arrays.toString(triangulos));
	
	
	
	System.out.println();
	System.out.println("Orden alfabético por color--------------------");
	TrianguloColorComparator compTrianguloColor = new TrianguloColorComparator();
	Arrays.sort(triangulos, compTrianguloColor);
	System.out.println(Arrays.toString(triangulos));
	
}
}
