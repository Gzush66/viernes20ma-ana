package pooEnero01;


public class Coche {

	private boolean estaArrancado;
	private float velocidad;
	private int velMax;
	private float kilometraje;
	
	//static: de todos los coches juntos 
	private static float kilometrajeFlota = 0; 
	
	//final: constante, solo se le da valor al principio una vez
	private final int NUM_PUERTAS;
	
	//Constructor
	public Coche(int velMax, int numPuertas) {		
		this.estaArrancado = false;
		this.velocidad = 0;
		this.velMax = velMax;
		this.kilometraje = 0;		
		this.NUM_PUERTAS = numPuertas;
		//la siguiente línea daría error xq es final
		//y solo se puede dar valor una sola vez
		//this.NUM_PUERTAS = 6; 
	}	
	
	public int getNumPuertas() {
		return NUM_PUERTAS;
	}
	//setNumPuertas no tendría sentido porque es final
	//y no nos dejaría cambiarle el valor
	
	
	public int getVelMax() {
		return this.velMax;
	}
	
	public float getVelocidad() {
		return this.velocidad;
	}
	
	//como mucho la pongo en el valor velMax y como min 0
	public void setVelocidad(float velocidad) {
		if (estaArrancado) {
			if (velocidad > velMax) {
				this.velocidad = velMax;
			} else if (velocidad < 0) {
				this.velocidad = 0;
			} else {
				this.velocidad = velocidad;
			}
		}k
		
	}
	
	
	

	//methods
	public void arrancar() {
		estaArrancado = true;
	}
	
	public void parar() {
		estaArrancado = false;
		velocidad = 0;
	}
	
	public void acelerar(float incremento) {
		setVelocidad(this.velocidad+incremento);
	}

	public void frenar(float decremento) {
		setVelocidad(this.velocidad-decremento);
	}
	
	public float getKilometraje() {
		return this.kilometraje;		
	}
	
	//se pone static porque se llamará a nivel de clase
	//no de objeto desde main: Coche.getKilometrajeFlota()
	public static float getKilometrajeFlota() {
		return Coche.kilometrajeFlota;		
	}
	
	//no se permite un metodo setKilometraje para 
	//no cambiar de manera ilegal los km recorridos
	
	public void recorrer(float kilometros) {
		this.kilometraje += kilometros;
		//se cambia tambien el atributo a nivel de clase
		Coche.kilometrajeFlota += kilometros;
	}
	
	public void mostrarVelocidad() {
		System.out.println(
			"La velocidad es "+ velocidad +"km/h");
	}
	
	

}	
	
	
