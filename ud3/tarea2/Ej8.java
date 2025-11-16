package ud3.tarea2;

import java.util.Scanner;

public class Ej8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la frase:");
        String frase = sc.nextLine();

        final String INICIO = "Javalín, javalón";
        final String FIN = "javalén, len, len";

        String mensajeTraducido = "";
        boolean esJavalandia = false;

        // comprobamos que empieza con la muletilla
        if (frase.startsWith(INICIO)) {
            esJavalandia = true;

            // reemplazamos la inical con una cadena vacía
            mensajeTraducido = frase.replace(INICIO, "").trim();
        }

        // si termina con la muletilla
        else if (frase.endsWith(FIN)) {
            esJavalandia = true;

            // Quitamos la final
            mensajeTraducido = frase.replace(FIN, "").trim();
        }

        // Resultado
        if (esJavalandia) {
            System.out.println("es idioma Javalandia.");
            System.out.println("mensaje sin muletillas:");
            System.out.println(mensajeTraducido);
        } else {
            System.out.println("La frase no está en idioma de Javalandia.");
        }
    }
}
