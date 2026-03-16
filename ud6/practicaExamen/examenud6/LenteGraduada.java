package ud6.examen.uribe;

public class LenteGraduada extends Lente {

	private TipoProblema problema;
	private double gradoCorreccion;
	
	
	public LenteGraduada(char posicion, TipoProblema problema, double gradoCorreccion) {
		super(posicion);
		this.problema=problema;
		this.gradoCorreccion=gradoCorreccion;
	}


	@Override
	public String toString() {
		return "LenteGraduada [problema=" + problema + ", gradoCorreccion=" + gradoCorreccion + "]";
	}

//implementación metodo abtracto clase lente
	@Override
	public void dimeTipoLente() {
		System.out.println("La lente es graduada");
		
	}
	
	
	
}
