package ud3.reto;
import java.util.Scanner;
//Excepción propia
class GordoException extends Exception {
	public GordoException(String mensaje) {
		   super(mensaje); 
		}
	// COMPLETAR ANA
}


public class Consolidada {	

	//devuelve un array de tamaño numBolas con todos los números del sorteo
	public static int[] creaBomboNumeros(int numBolas) {
		int [] numerosBolas = new int [99999];
		return numerosBolas;
		
		
		
		//COMPLETAR ROCIO
	}
	
	//devuelve un array de tamaño numPremios con todos los premios del sorteo
	public static String[] creaBomboPremios(int numPremios) {
String[] bomboPremios = new String[numPremios];
		
		bomboPremios[0]="PRIMER PREMIO";  // gordo de navidad
		bomboPremios[1]="SEGUNDO PREMIO";	// un segundo premio
		bomboPremios[2]="TERCER PREMIO";
		
		bomboPremios[3]="CUARTO PREMIO";
		bomboPremios[4]="CUARTO PREMIO";
		
		bomboPremios[5]="QUINTO PREMIO";
		bomboPremios[6]="QUINTO PREMIO";
		bomboPremios[7]="QUINTO PREMIO";
		bomboPremios[8]="QUINTO PREMIO";
		bomboPremios[9]="QUINTO PREMIO";
		bomboPremios[10]="QUINTO PREMIO";
		bomboPremios[11]="QUINTO PREMIO";
		bomboPremios[12]="QUINTO PREMIO";
		
		for (int i = 12; i < bomboPremios.length; i++) {
			bomboPremios[i]="pedrea";
		}
		//COMPLETAR ANA
		
		// un tercer premio
		// dos cuartos premios

		// 8 quintos premios

		// el resto hasta completar 1.807 premios son "pedrea"
		
		System.out.println("Bombo de premios creado...");
		return bomboPremios;
	}
	
	//devuelve un numero al azar del bombo de números, que será objeto de un premio.
	//Si un número ya ha salido, no debe volver a salir
	public static int dameNumero(int[] bombo) {
		
		int numAgraciado = (int) (Math.random()*bombo.length);

		// si el número ya había salido, generamos otro al azar
		
		//COMPLETAR ROCIO
		
		for (int i = 0; i < bombo.length; i++) {
		if(bombo[i]!=-1) {
			bombo[i]=numAgraciado;
			bombo[numAgraciado]=-1;}
			
		}
		// marcamos el número que ha salido con -1 para que no vuelva a salir
		return numAgraciado;
		
	}
	
	//Rocío Cortés
	//devuelve un premio al azar del bombo de premios
	//Si un premio ya ha salido, no debe volver a salir
	public static String damePremio(String[] bombo) {
		
		String premio;
		int [] salidos = new int [bombo.length];
		
		int indicePremiado = (int) (Math.random()*bombo.length);
		
		
		if (bombo[indicePremiado] != "nada") {
			premio = bombo[indicePremiado];
			bombo[indicePremiado] = "nada";
			}
		else {
			while(bombo[indicePremiado].equals("nada")) {
				indicePremiado = (int) (Math.random()*bombo.length);}
				premio = bombo[indicePremiado];
		}
		// si el premio ya había salido, generamos otro al azar
		//COMPLETAR ROCIO
		
		// marcamos el premio que ha salido
		
				
		return premio;
	}
	
	
	//Comprueba si un décimo ha sido agraciado y en tal caso indica por consola el premio
	//Ejemplo: "Agraciado con: pedrea"
	public static String heSidoAgraciado(String[] numerosSorteo, String[] premiosSorteo, String miDecimo){
		String premio="Número no premiado"; //valor por defecto
		boolean esPremiado=false;
		int j =0;
		for (int i = 0; i < numerosSorteo.length; i++) {
			if (numerosSorteo.equals(miDecimo)&&premiosSorteo[j]!="nada") {
				esPremiado=true;
			}
			j++;
		}
		
		if ( esPremiado ==true) {
			System.out.println();
		}
		
		return premio;
		//COMPLETAR ANA 
	}
	
	//Rocío
	//Implementa un bucle para comprobar, haciendo uso del método heSidoAgraciado, si nuestro décimo tiene o no premio
	// Debe comprobar que se introducen exactamente 5 dígitos entre el 0 y el 9, por ejemplo 04544
	// Al introducir fin, finaliza la comprobación de décimos
	public static void compruebaDecimos(String[] numerosSorteo, String[] premiosSorteo) throws GordoException{
		Scanner sc=new Scanner(System.in);	
		String miDecimo;
		String miPremio="";
		boolean terminarDeComprobar=false;
		boolean numeroValido=false;
		
		System.out.println("\nCOMPROBACION DE DECIMOS:");
		
		while (!terminarDeComprobar) {
			System.out.println("\nIntroduxca los 5 digitos de su décimo (fin para terminar)");
			miDecimo = sc.next().toLowerCase();
			
			if(miDecimo.equals("fin")) {
				terminarDeComprobar = true;
			}
			else if (miDecimo.length() != 5) {
				System.out.println("formato incorrecto");
			}else if(miDecimo.equals("PRIMER PREMIO")) {
				throw new GordoException("¡¡A celebrar, te ha tocado el Gordo!!");
			}
		}	
			

		
		//Compruebo si me ha tocado la lotería
		//COMPLETAR ROCIO
		
	}
				
	public static void main(String[] args) {
		
		final int MAX_NUMEROS=100000; // números del sorteo
		final int MAX_PREMIOS=1807;   // premios del sorteo
		
		int numeroAgraciado; //número que sale del bombo
		String premio=""; //premio que sale del bombo
		
				
		int[] bomboBolas = new int[MAX_NUMEROS];
		String[] bomboPremios = new String[MAX_PREMIOS];
		String[] listaNumerosSorteo = new String[MAX_PREMIOS]; // lista oficial de números que han salido en el sorteo
		String[] listaPremiosSorteo = new String[MAX_PREMIOS]; // lista oficial de premios que han salido en el sorteo
		
		try {
		
			//Creamos los bombos con sus bolas
			bomboBolas=creaBomboNumeros(MAX_NUMEROS);		
			bomboPremios=creaBomboPremios(MAX_PREMIOS);
			
			//Mostramos el listado completo de números premiados
			System.out.println("\nLISTADO OFICIAL DE PREMIOS:\n");
		
			int j=0;
			for (int i=0;i<MAX_PREMIOS;i++) {
				//Sacamos un número del bombo y lo rellenamos con ceros a la izquierda
				numeroAgraciado=dameNumero(bomboBolas);
				String numeroFormateado=String.format("%05d",numeroAgraciado);
			
				//Sacamos un premio del bombo
				premio=damePremio(bomboPremios);
				
				//Añado el número a la lista oficial del sorteo en la posición j
				listaNumerosSorteo[j]=numeroFormateado;
				
				//Añado el premio a la lista oficial del sorteo en la posición j
				listaPremiosSorteo[j]=premio;
				
				//COMPLETAR ANA
				
				j++;
				
				System.out.println("Numero:"+numeroFormateado+" agraciado con: "+premio);		
			}
		
			compruebaDecimos(listaNumerosSorteo, listaPremiosSorteo);
				
			
		} 	//COMPLETAR (capturar excepción propia)
		
		catch (GordoException e) {
	         System.out.println("¡¡A celebrar, te ha tocado el Gordo!!" + e.getMessage());
				}
			catch (Exception e) {
			System.out.println("Error:"+e.getMessage());
			}  finally {
				System.out.println("\nSorteo finalizado");			
			}		
	}
}

