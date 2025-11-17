package ud3.ejemplos;

public class Repaso1Plantilla {
	public static void main(String[] args) {
		
		System.out.println(funcion1("bonito","DIA"));
		System.out.println(funcion2("Bonito","Dia"));
		System.out.println(funcion3('5',"2"));
	}

	
	//	funcion1("bonito","Dia") devuelve "Bonito dia"
	//  Todo a minúsculas y la primera letra en mayúsculas
	
	static char[] funcion1(String cad1, String cad2) {
		String concatenadas;
		char[] resultado;
		
		cad1 = cad1.toLowerCase();
        cad2 = cad2.toLowerCase();
        
         concatenadas = cad1 + " " + cad2;
        
         resultado= concatenadas.toCharArray();
         resultado[0]= Character.toUpperCase(concatenadas.charAt(0));
		
		return resultado;
	}
	
	
	//	funcion2("Bonito","Dia") devuelve "DIA BONITO"
	//  Todo a mayúsculas
	
	static char[] funcion2(String cad1, String cad2) {
		String concatenadas;
		char[] resultado;

		//las ponemos las dos en mayusculas
		cad1 = cad1.toUpperCase();
        cad2 = cad2.toUpperCase();
        
        //las unimos con un espacio en el medio en el orden que queremos
        concatenadas=cad2 + " "+cad1;
        resultado = concatenadas.toCharArray();	
        
		return resultado;
	}
	
	
	//Devuelve la suma de los dos argumentos que recibe
	static int funcion3(char car, String cad) {
		int resultado;
		
		//pasamos el char y el string a int con sus funciones y hacemos la suma
		int num1=Character.getNumericValue(car);
		
		int num2= Integer.parseInt(cad);
		resultado=num1+num2;
		
		return resultado;
	}
	
}