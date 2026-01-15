package ud4.act8;

public class Bombilla {

	private static boolean fusibleGeneral=true;
	
	private boolean encendida;
	
	public Bombilla() {
		this.encendida=false;
	}
	
	
	public void encender() {
		
		encendida=true;
	}
	
	
	public void apagar() {
		encendida=false;
	}
	
	public static void fusionFusible() {
		
		fusibleGeneral=false;
		
	}
	
	public static void arreglarFusible() {
		
		fusibleGeneral=true;
		
	}
	
	
	public void mostrarInfo() {
		
		if (fusibleGeneral==true && encendida==true) {
			System.out.println("Está encendida");
		}else {
			System.out.println("Está apagada");
		}
		
	}
	
	
	
}
