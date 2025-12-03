package examenUd3;

import java.util.Scanner;

// creamos la excepción propia 
class DNIInvalidoException extends Exception {
    public DNIInvalidoException(String mensaje) {
        super(mensaje);
    }
}

public class Ej1 {
public static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
    	
    	//un try catch para capturar la excepción
        try {
            
        	//intentamos leer el dni y mostrarlo
            String dni = leerDNI();
            System.out.println("dni valido: "+dni.toUpperCase());

            // cambiamos el numero que haya en la posición 3 por un 9
            String dniCambiado = cambiarDigito(dni, 3, '9');
            System.out.println("DNI modificado: "+dniCambiado);

        } catch (DNIInvalidoException e) {
            // capturamos la excepcion y mostramos el mensaje
            System.out.println(e.getMessage());
        }
    }

    // leer y validar el dni
    static String leerDNI() throws DNIInvalidoException {
      
        System.out.print("Introduce el DNI (8 números y una letra): ");
        String dni=sc.nextLine();

        // validamos el dni
        // ^ marca el inicio, [0-9]{8} numeros del 0 al 9 y 8 digitos, [a-zA-Z] → una letra cualquiera en mayus o minus
        //$ marca el final
        if (!dni.matches("^[0-9]{8}[a-zA-Z]$")) {
            throw new DNIInvalidoException("Formato de DNI inválido. Debe ser 8 números y una letra.");
        }

        return dni;
    }

    
    
    // cambiar un dígito y poner letra en mayúscula
    static String cambiarDigito(String dni, int posicion, char nuevoValor) throws DNIInvalidoException {

    	    // obtenemos el caracter actual en la posición indicada
    	    char actual= dni.charAt(posicion - 1);

    	    // reemplazamos ese carácter por el nuevo
    	    String nuevoDni=dni.replace(actual, nuevoValor);
    	    /* replace cambia cada vez que encuentra el valor actual por lo que si se repite lo volverá a cambiar aunque 
    	     * no esté en esa posición, sé que es un fallo pero no sé como arreglarlo
    	     */
    	        	    
    	    // la última letra siempre en mayúscula
    	    nuevoDni=nuevoDni.substring(0, 8) + Character.toUpperCase(nuevoDni.charAt(8));

    	    return nuevoDni;
    	
    }
}
