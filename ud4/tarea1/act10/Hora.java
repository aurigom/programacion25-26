package ud4.tarea1.act10;

public class Hora {

	private int hora;
	private int minuto; 
	private int segundo;
	
	public Hora(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

	public int getSegundo() {
		return segundo;
	}

	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}
	
	public void suma(int n) {
		
		segundo= segundo+n;
		
		while(segundo>=60) {
			segundo= segundo - 60;
			minuto++;
		}
		
		while(minuto>= 60) {
			minuto= minuto-60;
			hora++;
		}
		
		
	}

	@Override
	public String toString() {
		return "Hora [hora=" + hora + ", minuto=" + minuto + ", segundo=" + segundo + "]";
	}
	
	
	
	
}
