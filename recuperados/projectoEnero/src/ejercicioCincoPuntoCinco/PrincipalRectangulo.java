package ejercicioCincoPuntoCinco;

import ejercicioPOOcincopuntouno1.Coordenada2D;

public class PrincipalRectangulo {

	public static void main(String[] args) {

		Coordenada2D[] rectangulo01 = { new Coordenada2D(0, 0), new Coordenada2D(5, 5) };

		Coordenada2D[] rectangulo02 = { new Coordenada2D(2, 3), new Coordenada2D(7, 9) };

		Rectangulo uno = new Rectangulo(rectangulo01);

		Rectangulo dos = new Rectangulo(rectangulo02);

		System.out.println(uno);

		System.out.println(dos);

	}

}
