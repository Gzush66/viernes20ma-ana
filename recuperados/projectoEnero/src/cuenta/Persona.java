package cuenta;

public class Persona {
	
	//declaramos los atributos
		private String nombre;
		private int edad;
		
	/*	private tipoAtributo nombreAtributo;
		
		public tipoAtributo getNombreAtributo() {
			return this.nombreAtributo;
			
		}*/
		

		//constructor
	public Persona(String nombre, int edad) {
		this.nombre=nombre;
		this.edad=edad;
	}
	
	public   void      setEdad(int edad)	{		//metodo que incrementa  la edad, la define con SET
		if (edad >=0 && edad <= 100) {				//  ponemos unos limites a ese cambio en la edad
		this.edad = edad;			
		}
	}
	public void setNombre (String nombre) {		//metodo que cambia el nombre
		 this.nombre = nombre;
	}
	
	
	
	public String getNombre() {		//getter, define el nombre
		return this.nombre;
	}
	public int getEdad () {		//getter define la edad
		return this.edad;
	}
	
	
	
}