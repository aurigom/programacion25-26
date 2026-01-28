package ud5.tarea1.act5;

public class Piano extends Instrumento{

	@Override
	public void interpretar() {
		System.out.println("Virgi está tocando el piano...");
			
			for (int i = 0; i < melodia.length; i++) {
				if (melodia[i]!=null) {
					System.out.println( melodia[i]+" ");
				}
			}
			
	}

}
