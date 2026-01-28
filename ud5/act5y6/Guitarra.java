package ud5.tarea1.act5;

public class Guitarra extends Instrumento{
	@Override
	public void interpretar() {
		System.out.println("Lucas está tocando la guitarra...");
			
			for (int i = 0; i < melodia.length; i++) {
				if (melodia[i]!=null) {
					System.out.println( melodia[i]+" ");
				}
			}
	}
}
