package ud4.tarea1.act9;

public class Trenes extends Maquinaria{

	public Locomotoras locomotora;
	public int[]vagones = new int[5];
	public Mecanicos mecanico ;
	
	
	
	public Trenes(Locomotoras locomotora, int[] vagones, Mecanicos mecanico) {
		super();
		this.locomotora = locomotora;
		this.vagones = vagones;
		this.mecanico = mecanico;
	}



	public void rellenarVagones() {
		for (int i = 0; i < vagones.length; i++) {
			
		}
	}
	
	
	
}
