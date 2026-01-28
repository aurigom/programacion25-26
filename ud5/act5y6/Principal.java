package ud5.tarea1.act5;

import ud5.tarea1.act5.Instrumento.Notas;

public class Principal {

	public static void main(String[] args) {
		
		Piano piano = new Piano();
		Campana campana = new Campana();
		Bateria bateria = new Bateria();
		Bajo bajo = new Bajo();
		Guitarra guitarra = new Guitarra();

		
		guitarra.add(Notas.LA);
		guitarra.add(Notas.LA);
		guitarra.add(Notas.SI);
		guitarra.add(Notas.LA);
		guitarra.add(Notas.SOL);
		guitarra.add(Notas.FA);
		guitarra.interpretar();
		
		piano.add(Notas.LA);
		piano.add(Notas.LA);
		piano.add(Notas.SI);
		piano.add(Notas.LA);
		piano.add(Notas.SOL);
		piano.add(Notas.FA);
		
		
		piano.interpretar();
		
		campana.add(Notas.LA);
		campana.add(Notas.LA);
		campana.add(Notas.SI);
		campana.add(Notas.LA);
		campana.add(Notas.SOL);
		campana.add(Notas.FA);
		
		campana.interpretar();
		
		bateria.add(Notas.LA);
		bateria.add(Notas.LA);
		bateria.add(Notas.SI);
		bateria.add(Notas.LA);
		bateria.add(Notas.SOL);
		bateria.add(Notas.FA);
		
		bateria.interpretar();
		
	
		
		
		bajo.add(Notas.LA);
		bajo.add(Notas.LA);
		bajo.add(Notas.SI);
		bajo.add(Notas.LA);
		bajo.add(Notas.SOL);
		bajo.add(Notas.FA);
		
		bajo.interpretar();
		
	}

}
