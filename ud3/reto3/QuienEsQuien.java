package ud3.reto3;

import java.util.Random;
import java.util.Scanner;

public class QuienEsQuien {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] objetos = {
                "charmander", "piplup", "snivy"
        };

        String[][] caracteristicas = {
                { "rojo", "fuego", "dragon" },
                { "azul", "agua", "pinguino" },
                { "verde", "planta", "serpiente" }
        };

        
        int personaje = rand.nextInt(objetos.length);

        System.out.println("=== adivina adivinanza ===");
        System.out.println("Di una característica o si crees que lo sabes intenta adivinar");
        System.out.println();
        boolean terminar=false;
        
        while (!terminar) {
            System.out.print("Introduce una pregunta o intenta adivinar: ");
            String intento = sc.nextLine().toLowerCase();

            
            if (intento.equals(objetos[personaje])) {
                System.out.println("Correcto, lo adivinaste!!!");
                terminar=true;
            }else {
            	 
                comprobarRespuesta(intento, objetos, caracteristicas, personaje);
            }

           
            
        }

      
    }

    static void comprobarRespuesta(String intento, String[] objetos, String[][] caracteristicas, int personaje) {
    	boolean acertada = false;
        
        for (int i = 0; i < caracteristicas[personaje].length; i++) {
            if (intento.equals(caracteristicas[personaje][i])) {
                acertada = true;
               
            }
          
        }
        if (acertada) {
			System.out.println("si.");
		}else {
			System.out.println("no.");
		}

        
    }

    

}
