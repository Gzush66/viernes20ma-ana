
package ejercicioCincoPuntoCinco;

import ejercicioPOOcincopuntouno1.Coordenada2D;

public class Rectangulo {

	private Coordenada2D[] coordenadaRectangulo;

	public Rectangulo(Coordenada2D[] arrayAusar) {
		this.coordenadaRectangulo = arrayAusar;

	}

	public Coordenada2D getCoordenadaRectangulo(int indice) {
		return coordenadaRectangulo[indice];
	}

	
	public int Perimetro() {
		return ((getCoordenadaRectangulo(1).getX() - getCoordenadaRectangulo(0).getX())
				+ (getCoordenadaRectangulo(1).getY() - getCoordenadaRectangulo(0).getY())) * 2;
	}

	public int area() {
		return ((coordenadaRectangulo[0].getX() - coordenadaRectangulo[1].getX())
				* (coordenadaRectangulo[0].getY() - coordenadaRectangulo[1].getY()));
	}

	@Override
	public String toString() {
		String aux = ("\n\nEstos son los puntos, la esquina superior  : " + coordenadaRectangulo[0].getX() + " y "
				+ coordenadaRectangulo[0].getY());
		aux = aux.concat("\n y la esquina opuesta " + getCoordenadaRectangulo(1).getY() + " y "
				+ getCoordenadaRectangulo(1).getY());
		aux = aux.concat("\n\n el perimetro del rectangulo será :" + this.Perimetro());
		aux = aux.concat("\n\n el area del rectangulo será  :" + this.area());

		return aux;
	}

}
