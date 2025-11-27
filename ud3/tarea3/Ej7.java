package ud3.tarea3;

import java.util.Scanner;

public class Ej7 {
public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// Queremos desarrollar una aplicación que nos ayude a gestionar las 
		//notas de un centro educativo. Cada clase está compuesta por 5 alumnos. 
		//Se pide leer las notas (números enteros) de cada uno de los alumnos en 
		//el primer trimestre, luego, las del segundo, y luego, las del tercero. 
		//Debemos mostrar, al final, la nota media del grupo en cada trimestre, y 
		//la media del alumno que se encuentra en la posición pos (que se lee por teclado). 
		//(Podéis hacerlo usando 3 vectores -uno por trimestre-, o usando una matriz bidimensional 
		//en la que las filas sean los trimestres y las columnas los alumnos).
		
		
		
		final int ALUMNOS = 5;
		final int TRIMESTRES=3;
		int cont =0;
		
		int [][]notas= {
				{6,8,10,4,2},
				{9,7,4,2,5},
				{8,6,6,3,8}
		};
		
		
		System.out.println("----------NOTAS----------");
		for (int i = 0; i < TRIMESTRES; i++) {
			for (int j = 0; j < ALUMNOS; j++) {
				System.out.print(notas[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();

		
		
		mediaTrimestre(notas, ALUMNOS, TRIMESTRES);
		mediaAlumno(notas, TRIMESTRES);
		
		
		
		
		
		
	}

	private static void mediaAlumno(int[][] notas, int TRIMESTRES) {
		System.out.println("Introduzca el alumno del que quiere saber la media: ");
		int pos = sc.nextInt();
		
		int notaA=0;
		
		for (int i = 0; i < TRIMESTRES; i++) {
			for (int j = pos; j <= pos; j++) {
				notaA+=notas[i][j];
			}
		}
		
		System.out.println("La media del alumno "+pos+" es de: ");
		int mediaAlumno=notaA/TRIMESTRES;
		System.out.println(mediaAlumno);
		
		
		
	}

	private static void mediaTrimestre(int[][] notas, int ALUMNOS, int tRIMESTRES) {
		int nota=0;
		
		System.out.println("--------MEDIA GRUPO 1t-------");
		for (int i = 0; i < 1; i++) {
			for (int j = 0; j < ALUMNOS; j++) {
				nota+=notas[i][j];
				
			}
		}
		
		int mediaGrupo=nota/ALUMNOS;
		System.out.println(mediaGrupo);
		
		
		nota=0;
		System.out.println("--------MEDIA GRUPO 2t-------");
		for (int i = 1; i < 2; i++) {
			for (int j = 0; j < ALUMNOS; j++) {
				nota+=notas[i][j];
				
			}
		}
		
		
		mediaGrupo=nota/ALUMNOS;
		System.out.println(mediaGrupo);
		
		nota=0;
		System.out.println("--------MEDIA GRUPO 3t-------");
		for (int i = 2; i < 3; i++) {
			for (int j = 0; j < ALUMNOS; j++) {
				nota+=notas[i][j];
				
			}
		}
		
		
		mediaGrupo=nota/ALUMNOS;
		System.out.println(mediaGrupo);


		
	}

}
