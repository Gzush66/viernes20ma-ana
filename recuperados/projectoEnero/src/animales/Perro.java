package animales;

public  class Perro extends Animal implements Mascota{
	
	
	String raza;
	float peso;
	int edad;
	public Perro (Sexo sexo, String raza, int edad ,float peso) {
		super (sexo);
		this.raza=raza;
		this.edad=edad;
		this.peso=peso;
	}
	
	
	
	public String getRaza() {
		return this.raza;
	}
	
	public int getEdad() {
		return this.edad;
	}
	public float getPeso() {
		return this.peso;
	}
	public void jugar() {
	System.out.println("tirame la pelotita");
	}
	@Override
	public String toString() {		
		String aux =("\n Sexo: "+this.sexo+ "\n");
		aux = aux.concat("\n Raza:  "+this.raza+"\n");
		aux = aux.concat("\n Edad: "+this.edad);
		aux = aux.concat("\n Peso: "+ this.peso);
		
		return aux;
		
		
	
	/* no logro introducir super en toString, por eso lo hago por la cuenta de la vieja
	 *  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *
	 *      @Override                                                               * *
	 *    public String toString() {                                                * *
	 *	return super.toString() +
	 *	String aux =("\n\nSexo: "+this.sexo+ "\n");
		aux = aux.concat("\n Raza:  "+this.raza+"\n");
		aux = aux.concat("\n Edad: "+this.edad);
		aux = aux.concat("\n Peso: "+ this.peso);
		
		return aux;
	
	 * */
	 
	
				
	}
}
