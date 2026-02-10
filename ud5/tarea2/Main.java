package ud5.tarea2.act3;

public class Main {
public static void main(String[] args) {
	
	figura[] figurasGeometricas = new figura[5];
	
	figurasGeometricas[0]= new Triangulo(3.45, Color.ROJO, 4.8);
	figurasGeometricas[1]=new Cuadrado(4.5, Color.AMARILLO);
	figurasGeometricas[2]=new Cuadrado(5.5, Color.VERDE);
	figurasGeometricas[3]=new Triangulo();
	figurasGeometricas[4]=new Cuadrado();
	
	for (int i = 0; i < figurasGeometricas.length; i++) {
		System.out.println(figurasGeometricas[i]);
	}
	
	
	System.out.println(PoligonoRegular.getContadorPoligonos());
}
}
