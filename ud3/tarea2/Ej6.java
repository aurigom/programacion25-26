package ud3.tarea2;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bienvenido a ACIERTA LA CONTRASEÑA!!");
        System.out.print("jugador nº 1, introduzca la contraseña: ");
        String contrasenia = sc.nextLine();

        System.out.println("pistas para el jugador nº 2:");
        System.out.println("número de caracteres: " + contrasenia.length());
        System.out.println("primera letra: " + contrasenia.charAt(0));
        //si la longitud es 4, el último caracter sería el 3 ya que empieza en 0, por eso para 
        //obtener el último caracter se le resta uno a la longitud
        System.out.println("ultima letra: " + contrasenia.charAt(contrasenia.length() - 1));

    
        System.out.print("turno del jugador nº 2, intente adivinar la contraseña ");
        String intento = sc.nextLine();

  
        if (intento.equals(contrasenia)) {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto, era " + contrasenia);
        }

    }
}
