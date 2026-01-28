package ud5.tarea1.act5;

public class Bateria extends Instrumento{
	@Override
	public void interpretar() {
		System.out.println("Héctor está tocando la batería...");
			
			for (int i = 0; i < melodia.length; i++) {
				if (melodia[i]!=null) {
					System.out.println( melodia[i]+" ");
				}
			}
}}
