package ud4.tarea2.act2;

public class PilaTabla {

private Integer[]Pila;
private Integer cont;

public PilaTabla() {

	this.Pila = new Integer[5];
	this.cont = 0;
}

public void apilar(Integer elemento) {
	
	if (cont<Pila.length) {
		Pila[cont]=elemento;
		cont++;
	}else {
		System.out.println("La pila está llena");
	}
	
}

public void desapilar() {
	if (cont==0) {
		System.out.println("la pila ya está vacía");
	}else {
		cont--;
		Pila[cont]=null;
	}
}

public void cima() {
	System.out.println("el elemento en la cima es: "+Pila[cont-1]);
}


	
}
