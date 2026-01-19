package ud4.tarea1.act9;

public class Locomotoras extends Maquinaria{

	public String matricula;
	public int potencia;
	public int anioF;
	public Mecanicos mecanico;
	
	
	public Locomotoras(String matricula, int potencia, int anioF, Mecanicos mecanico) {
		super();
		this.matricula = matricula;
		this.potencia = potencia;
		this.anioF = anioF;
		this.mecanico = mecanico;
	}


	@Override
	public String toString() {
		return "Locomotoras [matricula=" + matricula + ", potencia=" + potencia + ", anioF=" + anioF + " Mecánico: "+mecanico+" ]";
	}
	
	
	
}
