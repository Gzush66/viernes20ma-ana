package pooEnero01;

public class Coche {

	private int velocidadMaxima;
	private int numeroPuertas;
	private float velocidad;
	private boolean arrancado;

	public Coche(int numeroPuertas, int velocidadMaxima) {
		this.numeroPuertas = numeroPuertas;
		this.velocidad = 0;
		this.arrancado = false;
		this.velocidadMaxima = velocidadMaxima;
	}

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

	public void mostrarVelocidad() {
		System.out.println("Velocidad:" + velocidad);
	}

	public void acelerar(int incremento) {
		if (arrancado) {
			if (velocidad + incremento <= velocidadMaxima) {
				velocidad += incremento;
			} else {
				this.velocidad = velocidadMaxima;
			}
		}
	}

	public void frenar(int decremento) {
		if (arrancado) {
			velocidad -= decremento;
			if (velocidad < 0) {
				velocidad = 0;
			}

		}
	}

}
