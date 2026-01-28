package ud5.tarea1.act5;

public class Bajo extends Instrumento {
	@Override
	public void interpretar() {
		System.out.println("Ana está tocando el bajo...");
			
			for (int i = 0; i < melodia.length; i++) {
				if (melodia[i]!=null) {
					System.out.println( melodia[i]+" ");
				}
			}
}}
