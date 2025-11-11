package ud3.tarea2;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("introduce tu nombre y apellidos: ");
        String nombre = sc.nextLine();
        
        String vocales = "[AEIOUaeiouÁÉÍÓÚáéíóú]";
        
        //reemplazamos las vocales por una cadena vacia
        String noVocales = nombre.replaceAll(vocales, "");
      
        System.out.println("nombre sin vocales: " + noVocales);

       
    }
}
