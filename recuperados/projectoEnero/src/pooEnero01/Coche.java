package pooEnero01;

public class Coche {
	// atributos
	private int velMax;
	private final  int NUMEROPUERTAS;
	private float velocidad;
	private boolean arrancado;
	//kilometro puesto a cero salido de fabrica
	private float kilometraje;
	//static kilometros de todos los coches juntos
	private static float kilometrajeFlota =0;		//de todos los coches juntos

	// contructor
	public Coche(int numeroPuertas, int velocidadMaxima,int numeropuertas) {
		this.NUMEROPUERTAS = numeropuertas;
		this.velocidad = 0;
		this.arrancado = false;
		this.velMax = velocidadMaxima;
		this.kilometraje = 0;
	
	}

	public int getVelocidadMaxima() {
		return this.velMax;
	}

	public float getVelocidad() {
		return this.velocidad;
	}

	// como tope estará la velocidad maxima
	public void setVelocidad(float velocidad) {
		if (arrancado) { // si esta arrancado, si es true

			if (velocidad > velMax) {
				this.velocidad = velMax;
			} else if (velocidad < 0) {
				this.velocidad = 0;
			} else {
				this.velocidad = velocidad;
			}
		}
	}
	
	public int getNumeroPuertas() {
		return NUMEROPUERTAS;
	}
	/*public void setNumeroPuertas() {		NO TENDRIA SENTIDO PORQUE EL NUMERO DE PUERTAS ES UNA CONSTANTE FINAL
		this.NUMEROPUERTAS=NUMEROPUERTAS;
	}*/
	
	

	public void arrancar() {
		arrancado = true;
	}

	public void parar() {
		if (arrancado) {
			arrancado = false;
			velocidad = 0;
			System.out.println("Parao");
		}
	}
	
	
	public void recorrer (float kilometros) {
		this.kilometraje += kilometros;
		Coche.kilometrajeFlota += kilometros;	// el this. da error
	}

	public void mostrarVelocidad() {
		System.out.println("Velocidad:" + velocidad);
	}

	public void acelerar(int incremento) {
		setVelocidad (velocidad + incremento);
		
	}
	
	//public float recorrer (float kilometros) {
	//	this.kilometraje += kilometros;
	//}		


	public float getkilometraje() {
		return this.kilometraje;
		
	}
	public static float getkilometrajeFlota() {		//no puede haber this, puesto que hace referencia a la clase coche en general
		return Coche.kilometrajeFlota;				//  no en forma particular
	}
	
	public void frenar(int decremento) {
		setVelocidad (velocidad - decremento);
		
	}
	
}
	






		
		//   no se pertmite un metodo setkilometraje
		//  para no poder piratear el kilometraje del vehiculo
				
	
	
/*		if (arrancado) {		//si arrancado es true
			
			if (velocidad + incremento <= velMax) {
				velocidad += incremento;
			} else {
				this.velocidad = velMax;
			}
		}
	}			*/
			
	
		/*if (arrancado) {
			velocidad -= decremento;
			if (velocidad < 0) {
				velocidad = 0;
			}
		}	
		}			*/
	
