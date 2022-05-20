package ejercicioPOOcincopuntouno3;

import ejercicioPOOcincopuntouno1.Coordenada2D;

public class PrincipalRectangulo {

	public static void main(String[] args) {

		Coordenada2D esquinaSuperior1 = new Coordenada2D(0, 0);
		Coordenada2D esquinaOpuesta1 = new Coordenada2D(5, 5);

		Rectangulo uno = new Rectangulo(esquinaSuperior1, esquinaOpuesta1);

		System.out.println(uno);

		Coordenada2D esquinaSuperior2 = new Coordenada2D(2, 3);
		Coordenada2D esquinaOpuesta2 = new Coordenada2D(7, 9);
		Rectangulo dos = new Rectangulo(esquinaSuperior2, esquinaOpuesta2);
		System.out.println(dos);

	}
}