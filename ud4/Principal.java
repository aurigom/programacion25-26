package ud4.tarea1;

public class Principal {
	
	    public static void main(String[] args) {
	      
	        CuentaCorriente miCuenta = new CuentaCorriente("Ana Uribe", "4224567D");

	        //estado inicial
	        miCuenta.mostrarInformacion();

	        // ingreso
	        miCuenta.ingresarDinero(1000);

	        // retirada válida
	        miCuenta.sacarDinero(60); 

	        // retirada invalida
	        miCuenta.sacarDinero(980); // -40 (dentro del límite de -50)

	        // retirada supera el límite
	        miCuenta.sacarDinero(100); 

	        // estado final
	        miCuenta.mostrarInformacion();
	    }
	}

