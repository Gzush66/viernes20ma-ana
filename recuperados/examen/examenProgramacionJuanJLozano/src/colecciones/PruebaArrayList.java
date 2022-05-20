package colecciones;

import java.util.ArrayList;

public class PruebaArrayList {

	public static void main(String[] args) {
		
		 String[] cadenasEstatico  = new String [10];		
		 cadenasEstatico[0]="cadena1";
		 cadenasEstatico[1]="cadena2";
		 cadenasEstatico[2]="cadena3";
		 System.out.println("\n\n");
		 System.out.println("cadenasEstatico :");
		 for (int i=0; i<cadenasEstatico.length;i++) {
			 System.out.println(i+ ":\s\s"+ cadenasEstatico[i]);
		 }
		
		
		
		ArrayList <String> cadenasDinamico = new ArrayList <String>();	
		cadenasDinamico.add("cadena1");
		cadenasDinamico.add("cadena2");
		cadenasDinamico.add("cadena4");
		System.out.println();
		System.out.println("cadenasDinamico");
		cadenasDinamico.add(2,"cadena3");
		cadenasDinamico.add(2,"cadena2.5");
		cadenasDinamico.set(2,"cadena dos y medio");
		cadenasDinamico.add(5,"cadena5");
		cadenasDinamico.add(6,"cadena6");
		cadenasDinamico.add("cadena dos y medio");
		cadenasDinamico.add(4,"cadena dos y medio");
		cadenasDinamico.add(6,"cadena dos y medio");
		
		
		
		System.out.println("antes cadenas dinamico");
		for (int i=0; i<cadenasDinamico.size() ; i++) {
			System.out.println(i+ ":\s\s"+cadenasDinamico.get(i));
		}
		cadenasDinamico.remove(3);
		
		//eliminar todas las ocurrencias que cumplen la condicion
		//cadenasDinamico.removeIf(n-> n.equals("cadena dos y medio"));      
		//cadenasDinamico.remove("cadena dos y medio");
		/*para vaciar el arrayList
		cadenasDinamico.clear();
		*/
		
		boolean contiene = cadenasDinamico.contains("cadena4");
		System.out.println("contiene cadena4 : "+contiene);
		contiene=cadenasDinamico.contains("cadena8"+contiene);
		
		System.out.println("\n Primer indice de cadena dos y medio:");
		cadenasDinamico.indexOf("cadena dos y medio");
		
		
		
		System.out.println("despues cadenas dinamico");
		for (int i=0; i<cadenasDinamico.size() ; i++) {
			System.out.println(i+ ":\s\s"+cadenasDinamico.get(i));
		}
		System.out.println(cadenasDinamico);

		
	
	
	
	}

}
