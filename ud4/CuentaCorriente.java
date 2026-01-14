package ud4.tarea1;

public class CuentaCorriente {

	    // Atributos
	    private double saldo;
	    private double limiteDescubierto;
	    public String nombre;
	    private String dni;

	    // Constructor: Crea la cuenta 
	    public CuentaCorriente(String nombre, String dni) {
	        this.nombre = nombre;
	        this.dni = dni;
	        this.saldo = 0; 
	        this.limiteDescubierto = -50; 
	    }

	 
	    public boolean sacarDinero(double cantidad) {
	        // Verificamos si el saldo resultante es mayor o igual al límite
	        if (this.saldo - cantidad >= limiteDescubierto) {
	            this.saldo -= cantidad;
	            System.out.println("Retirada realizada con éxito.");
	            return true;
	        } else {
	            System.out.println("Operación fallida: El importe excede su límite de descubierto (-50€).");
	            return false;
	        }
	    }


	    public void ingresarDinero(double cantidad) {
	        if (cantidad > 0) {
	            this.saldo += cantidad;
	            System.out.println("Se han ingresado " + cantidad + "€.");
	        } else {
	            System.out.println("error");
	        }
	    }

	   public void mostrarInformacion() {
	        System.out.println("--- Información de la Cuenta ---");
	        System.out.println("Titular: " + nombre);
	        System.out.println("DNI: " + dni);
	        System.out.println("Saldo: " + saldo);
	        System.out.println("Límite descubierto: " + limiteDescubierto);
	
	    }
	}

