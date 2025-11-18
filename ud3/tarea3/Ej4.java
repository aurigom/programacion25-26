package ud3.tarea3;

import java.util.Random;
import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean acertada = false;

        System.out.println("Introduce el nº de dígitos de la clave secreta:");
        int digitos = Integer.parseInt(sc.nextLine());

        int[] claveSecreta = new int[digitos];

        
        for (int i = 0; i < claveSecreta.length; i++) {
            claveSecreta[i] = random.nextInt(5) + 1;
        }

       
        do {
            System.out.println("Introduce una combinación de " + digitos + " dígitos (del 1 al 5):");
            String combi = sc.nextLine();

            int[] combinacionJugador = new int[digitos];
            for (int i = 0; i < digitos; i++) {
                combinacionJugador[i] = combi.charAt(i) - '0';
            }

            StringBuilder pista = new StringBuilder();
            int aciertos = 0;

            for (int i = 0; i < digitos; i++) {
                int clave = claveSecreta[i];
                int intento = combinacionJugador[i];

                if (intento == clave) {
                    pista.append(" = ");
                    aciertos++;
                } else if (intento < clave) {
                    pista.append(" > ");
                } else {
                    pista.append(" < ");
                }
            }

            System.out.println("Pista:" + pista);

            
            if (aciertos == digitos) {
                acertada = true;
            }

        } while (!acertada);

       
        System.out.println("¡¡¡correcto!!! la cámara se ha abierto");

     
    }
}
