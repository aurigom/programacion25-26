package ud4.tarea2.act2;

public class PilaTabla {

	private int[] pila = new int[5];
	
	private int elemento;
	private int cont=0;

	public PilaTabla() {

		this.pila = pila;
		this.elemento = elemento;
	}

	public int[] getPila() {
		return pila;
	}

	public void setPila(int[] pila) {
		this.pila = pila;
	}

	public int getElemento() {
		return elemento;
	}

	public void setElemento(int elemento) {
		this.elemento = elemento;
	}
	
	public void apilar(int elemento) {
		
		for (int i = 0; i <= cont; i++ ) {
			
				pila[cont]=elemento;
		}

		cont++;	
	}
	
	public void desapilar(int elemento) {
		for (int i = 0; i < cont ; i++) {
			if (pila[i]==elemento) {
				pila[i]=0;
			}			
		}
		cont--;
	}
	
	public void cima() {
		for (int i = 0; i < 1; i++) {
			if (pila[i]!=0) {
				System.out.println(pila[i]);
			}
		}
	}
	
}
