package ud4.act8;

public class Principal {

	public static void main(String[] args) {
		
		Bombilla bombilla1 = new Bombilla();
		Bombilla bombilla2 = new Bombilla();
		Bombilla bombilla3 = new Bombilla();
		
		System.out.println("Bombilla 1 encender");
		bombilla1.encender();
		bombilla1.mostrarInfo();
		System.out.println();
		
		
		System.out.println("Bombilla 1 apagar");
		bombilla1.apagar();
		bombilla1.mostrarInfo();
		System.out.println();
		
		System.out.println("Bombilla 2 encender");
		bombilla2.encender();
		bombilla2.mostrarInfo();
		System.out.println();
		
		
		System.out.println("fusible cortado");
		Bombilla.fusionFusible();
		System.out.println();
		
		
		System.out.println("Bombilla 1: ");
		bombilla1.mostrarInfo();
		System.out.println("Bombilla 2: ");
		bombilla2.mostrarInfo();
		System.out.println("Bombilla 3: ");
		bombilla3.mostrarInfo();
		System.out.println();

		System.out.println("fusible arreglado");
		Bombilla.arreglarFusible();
		System.out.println();
		
		
		System.out.println("Bombilla 1: ");
		bombilla1.mostrarInfo();
		System.out.println("Bombilla 2: ");
		bombilla2.mostrarInfo();
		System.out.println("Bombilla 3: ");
		bombilla3.mostrarInfo();
		
		
	}

}
