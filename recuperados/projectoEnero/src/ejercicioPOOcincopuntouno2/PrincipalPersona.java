package ejercicioPOOcincopuntouno2;

import java.util.Scanner;

public class PrincipalPersona {

	public static void main(String[] args) {

		// Scanner sc= new Scanner (System.in);

		Persona jesus = new Persona("jesus", "lozano", "551212D", 55);
		Persona anatonio = new Persona("anatonio", "gonzalez", "888888f", 31);
		Persona mariela = new Persona("mariela", "garcia", "45454545M", 38);
		Persona alvaro = new Persona("alvaro", "jarapa", "444444r", 55);

		System.out.println(jesus);
		System.out.println(anatonio);
		System.out.println(mariela);
		System.out.println(alvaro);
		System.out.println();

		System.out.println("el numero de personas es " + Persona.sumaPersonas);

		/*
		 * 
		 * System.out.println("Introduzca nombre :"); String nombre= sc.nextLine();
		 * 
		 * System.out.println("Introduzca apellidos :"); String apellidos=
		 * sc.nextLine();
		 * 
		 * System.out.println("Introduzca DNI :"); String dni= sc.nextLine();
		 * 
		 * System.out.println("Introduzca edad :"); int edad = sc.nextInt ();
		 * 
		 * Persona p1= new Persona("nombre","apellidos","dni",edad);
		 * 
		 * System.out.println(p1);
		 * 
		 * 
		 */

	}

}
