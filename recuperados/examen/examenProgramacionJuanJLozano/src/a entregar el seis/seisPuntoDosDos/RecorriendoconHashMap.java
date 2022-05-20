package seisPuntoDosDos;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class RecorriendoconHashMap {
	public static void main(String[] args) {

		HashMap<Character, Integer> recorrer = new HashMap<>();
		Scanner scString = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);

		System.out.println("Introduzca una palabra :");
		String myString = scString.nextLine();
		for (int x = 0; x < myString.length(); x++) { // saco las letras y las meto en un arraylist sacaletras //
			char letra = myString.charAt(x);
			if (recorrer.keySet().contains(letra)) {
				recorrer.put(letra, recorrer.get(letra) + 1);// actualizamos el valor de la key, machacando el  va																
			} else {
				recorrer.put(letra, 1);// como la letra no coincide, se añade al hashmap y se le da valor 1,es la
			}					// primera
		}

			for (Character aux : recorrer.keySet()) {
				System.out.println("la letra  :" + aux + " se repite :" + (recorrer.get(aux)*100)/myString.length() +"%"     );
				
			}
			
			

		

	}
}

/*
 * string text = "hola mundo";
 * 
 * char c = text.charAt(3);
 * 
 * System.out.println(c); //output: a
 * 
 */