package animales;

public class Gato extends Animal{
	
	private String raza;
	
	public Gato(Sexo sexo, String raza) {
		//si no se invoca ningún constructor padre
		//en la primera linea
		//entonces se invoca al constructor
		//por defecto del padre (0 argumentos)
		
		//en este caso invocamos a otro constructor
		//del padre (con 1 argumento)
		super(sexo);
		
		System.out.println("constructor de gato");
		
		//inciamos los atributos de la clase hijo
		//el padre acaba de iniciar los suyos
		//con la llamada a super()
		this.raza = raza;
		
	}
	
	@Override
	public String toString() {
		return super.toString() ;
		
	}
}
