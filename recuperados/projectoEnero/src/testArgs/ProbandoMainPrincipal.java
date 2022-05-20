package testArgs;

public class ProbandoMainPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	
		switch (args [0]) {
		case "-r":
			System.out.println("Borrado recursivo");
			break;
		case "-f":
			System.out.println("Borrado forzado");		
		}
		System.out.println("del fichero <"+args[1]+">");*/

		final String NEGRO = "\033[30m";
			final String ROJO = "\033[31m";
			final String VERDE = "\033[32m";
			final String AMARILLO = "\033[33m";
			final String AZUL = "\033[34m";
			final String PURPURA = "\033[35m";
			final String CYAN = "\033[36m";
			final String WHITE = "\033[37m";
		
			System.out.println(VERDE+"hello world"
					);
		System.out.println(AZUL+"EL MAR ES AZUL");
	}

}
