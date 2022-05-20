package pildorasInformaticasEjercicios;

import java.util.Scanner;

public class Bucle003 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		int i = 1;
		do {
		System.out.println(i);
		i++;
		} while (i < 11);
		
		
		int numero;
		do {
			System.out.print("Dime un número: ");
			System.out.println("Quiere Vd. continuar");
			/*Te invito a que realices una modificación sobre este último ejemplo. Después de pedir
un número, haz que el programa diga ¿Quiere continuar? (s/n). Si el usuario introduce
una s o una S, el programa deberá continuar pidiendo números.

			String respuesta=sc.nextLine();
	*/
			numero = sc.nextInt();
			if (numero % 2 == 0) {// comprueba si el número introducido es par
			System.out.println("Qué bonito es el " + numero);
			} else {
			System.out.println("No me gustan los números impares, adiós.");
			}
			} while (numero % 2 == 0);//si el resto de la division por 2 es 0, digamos, es par
			}
			}
	
		
		
		
		
	


