package aprendeAprogramarJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
//import java.util.Map.Entry;

public class PruebaHashMap {

	public static void main(String [] args) {
		
		HashMap<String, String> diccionario = new HashMap<>();
		
		diccionario.put("partido", "match");
		diccionario.put("gato", "cat");		
		diccionario.put("cerilla", "match");
		diccionario.put("mesa","table");
		diccionario.put("lapiz","pen");

		System.out.println("Datos iniciales");
		System.out.println(diccionario);
		
		
		diccionario.put("partido", "splitted");			
		System.out.println("\nNo puede haber claves repetidas, se actualiza el valor");
		System.out.println(diccionario);
		
		System.out.println("\nLa clave gato devuelve:"+ 
							diccionario.get("gato") );
				
		String valorDevuelto = diccionario.remove("cerilla");
		System.out.println("\nDespues de borrado con la clave cerilla");
		System.out.println(diccionario);	
		
		diccionario.remove("partido","splitted");
		System.out.println("\nDespues de eliminar partido:");
		System.out.println(diccionario);	
		

		System.out.println("\n\nRellenamos otra vez con datos iniciales");
		diccionario.put("partido", "match");
		diccionario.put("gato", "cat");		
		diccionario.put("cerilla", "match");
		System.out.println(diccionario);	
		
		System.out.println("\nLas claves son: " + diccionario.keySet() );
		
		//transformo el conjunto de claves a una ArrayList 
		//para poder recorrerla con indices como conocemos 
		ArrayList<String> miLista = new ArrayList<>(diccionario.keySet());
		
		//ya podemos recorrelo con un indice con el for que conocemos

		System.out.println("\nImpresion con for");
		for (int i =0; i<miLista.size(); i++) {
			String clave = miLista.get(i);
			String valor = diccionario.get(clave);
			System.out.println(i+") Clave:" + clave + ", valor: " + valor );
		}
		
		//RECORDATORIO DE USO BUCLE FOREACH mas abajo
		//en realidad podemos ahorrarnos crear el indice (y el ArrayList) 
		//para ello debemos imprimirlo con un foreach  
		//(recomendable!! el foreach es tu amigo para las colecciones ;D )
		System.out.println("\nImpresion con foreach y keySet()");
		for (String clave : diccionario.keySet()) {
		    String valor = diccionario.get(clave);
		    System.out.println("Clave: " + clave + ", valor: " + valor);
		}
		
		//otra forma de recorrerlo con Entry (cada pareja de valores)
		System.out.println("\nImpresion con foreach y entrySet()");
		for(Entry<String,String> pareja : diccionario.entrySet()) {
			String clave = pareja.getKey();
			String valor = pareja.getValue();
			System.out.println("Clave: " + clave + ", valor: " + valor);
		}
		
		//RECORDATORIO DE USO BUCLE FOREACH
		int[] array = {4,5,8,9,1,10,2};
		//USO FOREACH: for(tipoContenido nombreVar : nombreArray)
		System.out.println("\nContenido de array con foreach:");
		for(int entero : array)
		{
			System.out.println(entero);
		}		
		System.out.println("\nContenido de arrayList con foreach:");		
		ArrayList<Integer> al = new ArrayList<>();
		al.add(4);
		al.add(5);
		al.add(8);
		al.add(9);
		al.add(1);
		al.add(10);
		al.add(3);
		for(Integer ii : al) {
			System.out.println(ii);
		}		
		
	}
	
}