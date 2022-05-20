package pooYoutube;

public class Coche {		//se han encapsulado poniendole el private, asi no se puede modificar
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	
	
	public Coche() {	//metodo constructor, damos caracteristicas a Coche
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso=500;	
	}
	public String dime_largo() {				//metodo getter
		return "El largo del coche es "+largo;//estoy dentro de la misma clase por lo que me puede dar el largo
	}
}
