package colecciones;
import java.util.HashMap;


public class HashMapExample {

	public static void main(String[]args) {
		
		
		HashMap<String,String>diccionario = new HashMap<>();
		
		diccionario.put("cerilla", "match");
		diccionario.put("gato","cat");
		diccionario.put("partido","match");
		System.out.println(diccionario);
		
		diccionario.put("partido","splitted");
		
		System.out.println(diccionario);
		
		System.out.println("la clave gato devuelve: "+diccionario.get("gato"));
		System.out.println(diccionario);
		
		String valorDevuelto = diccionario.remove("cerilla");
		System.out.println(diccionario);
		System.out.println("valor devuelto"+ valorDevuelto);
		
		diccionario.remove("partido","splitted");
		//System.out.println("despues de eliminar partido"+diccionario);
		
		
		
		
		System.out.println("las claves son :  "+diccionario.keySet());
		String []miLista = diccionario.keySet().toArray();
		
		

	}

}
