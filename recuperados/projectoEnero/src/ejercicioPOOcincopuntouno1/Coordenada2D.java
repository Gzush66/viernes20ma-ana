package ejercicioPOOcincopuntouno1;

public class Coordenada2D {

	// definimos los puntos x e y
	private int x;
	private int y;

	// metodo constructor
	public Coordenada2D(int x, int y) {
		this.x = x;
		this.y = y;
	}

	// getter
	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	// setter
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	// metodo suma
	public void sumarPuntos(Coordenada2D puntoaSumar) {
		setX(this.x + puntoaSumar.x);
		setY(this.y + puntoaSumar.y);
	}

	// metodo resta
	public void restarPuntos(Coordenada2D puntoaRestar) {
		this.setX(this.x - puntoaRestar.x);
		this.setY(this.y - puntoaRestar.y);
	}

	@Override
	public String toString() {
		String aux = "(" + this.x + "," + this.y + ")";

		return aux;
	}

}
