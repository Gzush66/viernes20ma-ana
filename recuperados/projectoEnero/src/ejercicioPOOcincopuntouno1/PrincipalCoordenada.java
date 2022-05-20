package ejercicioPOOcincopuntouno1;

public class PrincipalCoordenada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coordenada2D pto1 = new Coordenada2D(5, 0);
		Coordenada2D pto2 = new Coordenada2D(10, 10);
		Coordenada2D pto3 = new Coordenada2D(-3, 7);

		System.out.println("\n tenemos estos puntos: \n" + "\n" + pto1 + "\n" + pto2 + "\n" + pto3 + "\n\n");

		System.out.println("\n Sumaremos :" + pto2 + " y " + pto3);
		pto2.sumarPuntos(pto3);
		System.out.println(pto2);

		System.out.println("\n Restaremos :" + pto1 + " y " + pto3);
		pto1.restarPuntos(pto3);
		System.out.println(pto1);
	}

}
