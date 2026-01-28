package ud5.tarea1.act5;


public abstract class Instrumento {

	Notas [] melodia;
	int cont;
	public enum Notas{DO,RE,MI, FA, SOL, LA, SI, DOM;}
	
	
	public Instrumento() {
		this.melodia = new Notas[100];
		this.cont = 0;
	}
	
	public void add(Notas notaNueva) {
		
		if (cont<100) {
			melodia[cont]=notaNueva;
			cont++;
		}else {
			System.out.println("La melodía está completa");
		}
		
	}
	
	public abstract void interpretar();
	
	
	
}
