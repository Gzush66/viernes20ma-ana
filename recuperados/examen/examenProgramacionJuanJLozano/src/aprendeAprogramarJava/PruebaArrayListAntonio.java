package aprendeAprogramarJava;

import java.util.ArrayList;

public class pruebaArrayList {

	public static void main(String[] args) {

		String [] cadenasEstatico = new String[10];
		cadenasEstatico[0]="cadena1";
		cadenasEstatico[1]=new String("cadena2");
		cadenasEstatico[2]=new String("cadena3");
		
		System.out.println("cadenasEstatico:");
		for(int i=0; i<cadenasEstatico.length; i++) {
			System.out.println(i+":"+cadenasEstatico[i]);
		}
			
				
		ArrayList<String> cadenasDinamico = new ArrayList<String>();
		cadenasDinamico.add("cadena1");
		cadenasDinamico.add("cadena2");
		cadenasDinamico.add("cadena4");
		
		cadenasDinamico.add(2, "cadena3");
		cadenasDinamico.add(2, "cadena2.5");

		cadenasDinamico.set(2, "cadena2 y medio");
		
		cadenasDinamico.add(5, "cadena5");

		cadenasDinamico.add ("cadena2 y medio"); //lo añado al final
		cadenasDinamico.add (4,"cadena2 y medio"); 
		
		
		System.out.println("\nANTES cadenasDinamico:" +cadenasDinamico.size());
		for(int i=0; i<cadenasDinamico.size(); i++) {
			System.out.println(i+":"+cadenasDinamico.get(i));
		}

		//eliminar todas las ocurrencias que cumplen la condicion
		//cadenasDinamico.removeIf(n-> n.equals("cadena2 y medio"));
		//cadenasDinamico.clear();
		boolean contiene = cadenasDinamico.contains("cadena4");
		System.out.println("contiene cadena4:"+contiene);
		contiene = cadenasDinamico.contains("cadena8");
		System.out.println("contiene cadena8:"+contiene);
		
		System.out.println("\nPrimer indice de cadena2 y medio:"+
				cadenasDinamico.indexOf("cadena2 y medio") );
		

		System.out.println("\nUltimo indice de cadena2 y medio:"+
				cadenasDinamico.lastIndexOf("cadena2 y medio") );
		
		System.out.println("\nDESPUES cadenasDinamico:"+cadenasDinamico.size());
		for(int i=0; i<cadenasDinamico.size(); i++) {
			System.out.println(i+":"+cadenasDinamico.get(i));
		}
		
		ArrayList<String> listaAuxiliar = new ArrayList<>();
		listaAuxiliar.add("cadena2 y medio");
		listaAuxiliar.add("cadena1");
		cadenasDinamico.removeAll(listaAuxiliar);
		
		
		System.out.println("\nDESPUES cadenasDinamico:"+cadenasDinamico.size());
		for(int i=0; i<cadenasDinamico.size(); i++) {
			System.out.println(i+":"+cadenasDinamico.get(i));
		}
		
	}

}