package examenUd3;

import java.util.Scanner;

public class Ej2 {
public static Scanner sc = new Scanner (System.in);
    
    public static void main(String[] args) {
        String[][] encuesta = new String[500][3];

        rellenaEncuesta(encuesta);
        muestraResultados(encuesta);

        System.out.print("introduce codigo postal para calcular media: ");
        int codigoPostal=sc.nextInt();
        System.out.print("introduce sexo (M/F): ");
        char sexo=sc.next().charAt(0);

        int media=calculaMediaEdad(encuesta, sexo, codigoPostal);
        System.out.println("la media de edad asociada al CP "+codigoPostal+" y sexo "+sexo+" es: "+media);
        }
    
    // rellenar la encuesta hasta que se introduzca fin
    static void rellenaEncuesta(String[][] encuesta) {
        int i = 0;
        //mientras que i sea menor que la longitud de la encuesta se ejecutará lo siguiente
        while (i < encuesta.length) {
            System.out.print("introduce codigo postal (o 'fin' para terminar): ");
            String codigoPostal=sc.nextLine();

            //comparamos el código postal con la palabra fin para ver si hay que terminar el programa
            //si es así metemos un break; que saldrá del while
            if (codigoPostal.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.print("introduce edad: ");
            String edad = sc.nextLine();

            System.out.print("introduce sexo (M/F): ");
            String sexo = sc.nextLine();

            //guardamos los datos en las posiciones del array
            // en la columna 0 el codigo postal, en la 1 la edad y en la 2 el sexo
            encuesta[i][0] =codigoPostal;    
            encuesta[i][1] = edad;  
            encuesta[i][2] =sexo;  
            
            //incrementamos la i para que salga del bucle cuando haya hecho 500 
            i++;
        }
    }
    
 // mostramos los resultados de la encuesta
    static void muestraResultados(String[][] encuesta) {
        System.out.println("--- Resultados de la encuesta ---");
        //recorremos el array y si la primera columna no es null imprimiremos los resultados
        // si dejamos valores sin rellenar y no comprobamos que no sean null solo imprimirá los null
        for (int i = 0; i < encuesta.length; i++) {
            if (encuesta[i][0] != null) {
                System.out.println("código Postal: " + encuesta[i][0] +", edad: " + encuesta[i][1] +", sexo: " + encuesta[i][2]);
            }
        }
    }
    
    static int calculaMediaEdad(String[][] encuesta, char sexo, int codigoPostal) {
    	//creamos la variable de suma y establecemos un contados para calcular la media
        int suma=0;
        int contador=0;

        //recoremos el array
        for (int i = 0; i < encuesta.length; i++) {
          
        	//pasamos a int el codigo postal y la edad y el sexo a mayúsculas
                int CP = Integer.parseInt(encuesta[i][0]);
                int edad = Integer.parseInt(encuesta[i][1]);
                char sexo1 = encuesta[i][2].toUpperCase().charAt(0);

                if (CP == codigoPostal && sexo1 == Character.toUpperCase(sexo)) {
                	//vamos sumando las edades e incrementando el contador
                    suma += edad;
                    contador++;
                }
            }
        int res = suma/contador;

        return res;
    }


    }

