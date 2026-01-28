package ud5.tarea1.act5;


public class Campana extends Instrumento {

	@Override
	public void interpretar() {
		System.out.println("Jorgito está tocando la campana...");
		for (int i = 0; i < melodia.length; i++) {
			if (melodia[i]!=null) {
				System.out.println(melodia[i]+" ");
			}
		}
		
	}

	
	
}
