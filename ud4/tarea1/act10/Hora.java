package ud4.tarea1.act10;

import java.util.Scanner;


public class Hora {
	
	
	private int hora;
	private int n;
	private int minuto;
	
	
	
	public Hora( ) {
		this.hora = hora;
		this.n = n;
		this.minuto = minuto;
	}



	public int getHora() {
		return hora;
	}



	public void setHora(int hora) {
		this.hora = hora;
	}



	public int getN() {
		return n;
	}



	public void setN(int n) {
		this.n = n;
	}



	public int getMinuto() {
		return minuto;
	}



	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}



	public void suma(int hora, int minuto, int n) {
		
		if (n>60) {
			this.minuto+=n;
		}
		
		if (minuto>60) {
			this.hora+=minuto;
		}
		
	}



	@Override
	public String toString() {
		return "Hora [hora=" + hora +", minuto=" + minuto +  ", n=" + n + "]";
	}
	
	
}
