package ud3.tarea4;

import java.util.Scanner;

public class Barquitos {

//Crea un tablero cuadrado y asigna 
//a cada celda el carácter '\u007E' (virgulilla) 
static void creaTablero(char[][] tablero) {
	Letras(tablero);
	
	System.out.println();
	int cont=1;
	for (int i = 0; i < tablero.length; i++) {
		for (int j = 0; j < tablero.length; j++) {
			
			if (j==0) {
				System.out.print(cont+" ");	
				
			}
			
			tablero[i][j]='\u007E';
			System.out.print(tablero[i][j]);
			
	
		}
		cont++;
		System.out.println();
	}
	
}
	
 static void Letras(char [][]tablero) {
	
	 char []letritas= {' ',' ','A','B','C','D','E','F','G','H'};
	 for (int i = 0; i < letritas.length; i++) {
		System.out.print(letritas[i]);
	}
	
}

//Sitúa 8 barcos en una posición aleatoria en un
//tablero previamente creado
static void ponOchoBarcos(char[][] tablero) {
	 int barcos = 0;
	    while (barcos < 8) {
	        int x = (int)(Math.random() * 8);
	        int y = (int)(Math.random() * 8);

	        if (tablero[x][y] == '\u007E') { // si está vacío (~)
	            tablero[x][y] = 'O';
	            barcos++;
	        }
	    }
	
}

//Pinta por consola el tablero previamente creado
static void pintaTableroConBarcos(char[][] tablero) {
	System.out.println();
	Letras(tablero);
	System.out.println();
	int cont=1;
	for (int i = 0; i < tablero.length; i++) {
		for (int j = 0; j < tablero.length; j++) {
			
			if (j==0) {
				System.out.print(cont+" ");	
			}
			System.out.print(tablero[i][j]);	
		}
		cont++;
		System.out.println();
	}
	
}

//Pinta por consola el tablero pero sin mostrar las celdas con barcos ('O')
static void pintaTableroSoloHundidos(char[][] tablero) {	
	Letras(tablero);
    System.out.println();
    int cont = 1;
    for (int i = 0; i < tablero.length; i++) {
        for (int j = 0; j < tablero.length; j++) {
            if (j == 0) {System.out.print(cont + " ");}

            if (tablero[i][j] == 'O') {
                System.out.print('\u007E'); 
            } else {
                System.out.print(tablero[i][j]); 
            }
        }
        cont++;
        System.out.println();
    }

}


//Si hay un barco en el tablero, en las coordenadas (x,y)
//lo marca con una X (hundido) y devuelve true, en caso 
//contrario devuelve false
static boolean dispara(char[][] tablero, int x, int y) {	
	boolean hundido=false;
		
	if (tablero[x][y]=='O') {
		tablero[x][y]='X';
		hundido=true;
		
	}else {hundido=false;}
	
	return hundido;
			
}

//Devuelve true si queda algún barco pendiente de hundir
//y false en caso contrario
static boolean quedanBarcos(char[][] tablero) {	
	boolean quedanBarcos=false;
	
	for (int i = 0; i < tablero.length; i++) {
		for (int j = 0; j < tablero.length; j++) {
			if (tablero[i][j]=='O') {
				quedanBarcos=true;
				
			}
		}
	}
	return quedanBarcos;	

			
}
	
public static void main(String[] args) {
	
	char[][] tablero = new char[8][8];
	Scanner sc=new Scanner(System.in);
	String coordenadas;
	int coordX, coordY=0;
			
	creaTablero(tablero);
	ponOchoBarcos(tablero);
	pintaTableroConBarcos(tablero);
	
	do { 
		do { 
			System.out.print("\n------------------");
			System.out.print("\nDime coordenadas (p.e A4): ");
			coordenadas=sc.next().toLowerCase();
				System.out.println("Coordenadas no válidas");
		} while (!coordenadas.matches("^[A-Ha-h][1-8]$"));
		
		coordX=coordenadas.charAt(0);
		coordY=coordenadas.charAt(1);
		
		coordX=coordX-'a';
		coordY=coordY-'0';

		System.out.println("coordX:"+coordX);
		System.out.println("coordY:"+coordY);
		
		if (dispara(tablero,coordY-1,coordX))
			System.out.println("\n¡¡¡HUNDIDO!!!\n");
		else
			System.out.println("\n!!AGUA!!\n");
		
		pintaTableroSoloHundidos(tablero);
			
	}while (quedanBarcos(tablero));
	
	System.out.println("\n¡¡¡LO CONSEGUISTE!!!");
	
	}
}
