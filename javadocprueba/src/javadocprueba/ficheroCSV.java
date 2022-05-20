
	package javadocprueba;

	import java.io.BufferedReader;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Arrays;

	
	
	
	public class ficheroCSV {
		private final static String SEPARADOR = ",";
		private final static String COMILLAS = "\"";

		public static void main(String[] args) {
			BufferedReader lectorCSV = null;
			try {
				lectorCSV = new BufferedReader(new FileReader("./datos.csv"));
				String linea = lectorCSV.readLine();
				while (null != linea) {
					String[] campos = linea.split(SEPARADOR);
					campos = eliminarComillasEnExtremos(campos);
					String[] nombreCampos = { "NOMBRE", "EDAD", "CIUDAD", "AÑO" };
					for (int i = 0; i < campos.length; i++) {
						 System.out.println( nombreCampos[i] + ": "+ campos[i]);
					}
					System.out.println("");
					// System.out.println(Arrays.toString(campos));
					linea = lectorCSV.readLine();
				}
				lectorCSV.close();
			} catch (Exception e) {
				System.out.println("Error al leer: ");
				e.printStackTrace();
			}
			
			//si queremos separar con punto tenemos que usar '\'
			//porque el punto es un caracter especial en expresiones regulares
			String linea = "nombre.edad.ciudad.año";
			System.out.println("RESULTADO DE SEPARAR CON PUNTO:");
			String[] campos = linea.split("\\.");
			for(String campo : campos) {
				System.out.println(campo);
			}
		}

		private static String[] eliminarComillasEnExtremos(String[] campos) {
			String result[] = new String[campos.length];
	// ^" es una expresion regular que indica que la cadena empieza por "
	// "$ es una expresion regular que indica que la cadena termina por "
			for (int i = 0; i < result.length; i++) {
				result[i] = campos[i].replaceAll("^" + COMILLAS, "").replaceAll(COMILLAS + "$", "");
			}

			return result;
		}
	}