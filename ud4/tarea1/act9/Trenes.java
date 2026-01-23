package ud4.tarea1.act9;

import java.util.Arrays;

public class Trenes extends Maquinaria{

	public Locomotoras locomotora;
	public Vagones[]vagones = new Vagones[5];
	public Maquinistas maquinistas ;
	private int numVagones; //indica cuántos vagones hay realmente en el tren

	//creamos un tren con locomotora y maquinista
	public Trenes(Locomotoras locomotora, Maquinistas maquinistas) {
		super();
		this.locomotora = locomotora;

		this.maquinistas = maquinistas;
	    this.vagones = new Vagones[5]; // creamos el tamaño del array 
        this.numVagones = 0; //al principio no tiene vagones
	
	}



	public boolean rellenarVagones(Vagones vagon) {
	//	comprobamos si hay hueco en el array
		 if (numVagones < vagones.length) {
	            vagones[numVagones] = vagon; //añadimos el vagon en la primera posicion libre
	            numVagones++; //aumentamos el numero de vagones
	            return true;
	        }else {
	        return false;}
		}
	
	
	public boolean retirarVagones(Vagones vagon) {
		if (numVagones > 0) { //si hay al menos un vagon
            numVagones--; //restamos un vagon
            vagones[numVagones] = null; // y ponemos esa posición como null para quitar ese tren
            return true;
        }else {
        return false;}
		
	}


	@Override
	public String toString() {
		return "Trenes [locomotora=" + locomotora.getMatricula() + 
				", vagones=" + Arrays.toString(vagones) + 
				", maquinistas="
				+ maquinistas.getNombre() +  "]";
	}
	
	
	
}
