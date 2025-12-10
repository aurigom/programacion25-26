package ud3.reto;
import java.util.Scanner;
//COMPLETAR ANA
//Excepción propia
class GordoException extends Exception {
	public GordoException(String mensaje) {
		   super(mensaje);
		}
	
}
public class LoteriaEquipo1 {	
	//COMPLETAR ROCIO
	//devuelve un array de tamaño numBolas con todos los números del sorteo
	public static int[] creaBomboNumeros(int numBolas) {
		int [] numerosBolas = new int [99999];
		int num = 00000;
		for(int i = 0; i < numerosBolas.length; i++) {
			num++;
		}
					
		System.out.println("Bombo de números creado...");
		
		return numerosBolas;
				
	}
	
	//COMPLETAR ANA
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
		
		for (int i = 13; i < bomboPremios.length; i++) {
			bomboPremios[i]="pedrea";
		}
				
		// un tercer premio
		// dos cuartos premios
		// 8 quintos premios
		// el resto hasta completar 1.807 premios son "pedrea"
		
		System.out.println("Bombo de premios creado...");
		return bomboPremios;
	}
	
	//COMPLETAR ROCIO
	//devuelve un numero al azar del bombo de números, que será objeto de un premio.
	//Si un número ya ha salido, no debe volver a salir
	public static int dameNumero(int[] bombo) {
		
		int numAgraciado = (int) (Math.random()*bombo.length);
		int numPremiado;
		// si el número ya había salido, generamos otro al azar
		
		
		// marcamos el número que ha salido con -1 para que no vuelva a salir
		
		if (bombo[numAgraciado] != -1) {
			numPremiado = bombo[numAgraciado];
			bombo[numAgraciado] = -1;
			}
		else {
			while(bombo[numAgraciado] == -1) {
				numAgraciado = (int) (Math.random()*bombo.length);}
			numPremiado = bombo[numAgraciado];
		}
				
		return numAgraciado;
		
	}
	
	//COMPLETAR ROCIO
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
				bombo[indicePremiado] = "nada";
		}
		// si el premio ya había salido, generamos otro al azar
				
		// marcamos el premio que ha salido		
				
		return premio;
	}
	
	//COMPLETAR ANA
	//Comprueba si un décimo ha sido agraciado y en tal caso indica por consola el premio
	//Ejemplo: "Agraciado con: pedrea"
	public static String heSidoAgraciado(String[] numerosSorteo, String[] premiosSorteo, String miDecimo){
		String premio="Número no premiado"; //valor por defecto
		boolean esPremiado=false;
		int j =0;
		for (int i = 0; i < numerosSorteo.length; i++) {
			if (numerosSorteo[i].equals(miDecimo)&&!premiosSorteo[i].equals("nada")) {
				return premiosSorteo[i];				
			}
			
		}
		/*
		vamos comparando cada posición del array (ej i=23408) con el décimo introducido
		se compara con el equals si no es “nada” el premio
		si se cumplen las dos devolvemos ese premio , sino devolverá “número no premiado”
*/
				
		return premio;
		
	}
	
	//COMPLETAR ROCIO Y ANA
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
			}else {
				
				//primero se llama a heSidoAgraciado para comprobar si el decimo esta premiado
				//heSidoAgraciado devuelve el tipo de premio o si no es premio
				
				miPremio = heSidoAgraciado(numerosSorteo, premiosSorteo, miDecimo);
				
				//si el premio es igual a la cadena lanza la excepción del gordo
				if (miPremio.equals("PRIMER PREMIO")) {
					throw new GordoException("¡¡A celebrar, te ha tocado el Gordo!!");
					
					//si el premio no es igual a “numero no premiado” muestra el premio que es
				}else if(!miPremio.equals("Numero no premiado")) {
					System.out.println("Agraciado con: "+miPremio);
				}
				
			}
		}	}
			
		
		//Compruebo si me ha tocado la lotería
		
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
				
			
		} 	//COMPLETAR ROCIO Y ANA (capturar excepción propia)
		
		catch (GordoException e) {
	         System.out.println(e.getMessage());
				}
			catch (Exception e) {
			System.out.println("Error:"+e.getMessage());
			}  finally {
				System.out.println("\nSorteo finalizado");			
			}		
	}
}
