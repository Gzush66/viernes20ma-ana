
package ejercicioPOOcincopuntouno2;

import java.util.Scanner;

public class Persona {
	Scanner sc = new Scanner(System.in);

	private String nombre;
	private String apellidos;
	private String dni;
	private int edad;

	private int gente = 0;
	public static int sumaEdades = 0;
	public static int sumaPersonas = 0;
	public static int edadMedia = 0;

	public Persona(String nombre, String apellidos, String dni, int edad) { // 1234
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
		sumaPersonas();
		sumarEdad();
		edadMedia();
	}

	public Persona(String nombre, String apellidos, String dni) { // 1230

		this(nombre, apellidos, dni, 0);
		
	}

	public Persona(String nombre, String apellidos) { // 1200
		this(nombre, apellidos, null, 0);
		
	}

	public Persona(String nombre) { // 1000
		this(nombre, null, null, 0);
		
	}

	public Persona(String nombre, String dni, int edad) { // 1034
		this(nombre, apellidos, null, 0);
		
		
	}

	public Persona(String nombre, int edad) { // 1004
		this(nombre,  null, 0);
		
	}

	// sumar edades
	public void sumarEdad() { // cada vez que se cree una persona, hago el computo
		Persona.sumaEdades += edad; // de edades
	}
	// sumar personas

	public static void sumaPersonas() {
		Persona.sumaPersonas++;
	}

	public static void edadMedia() {
		Persona.edadMedia = (Persona.sumaEdades) / Persona.sumaPersonas;

	}

	public void setNombre(String nombre) { // cada vez que se cree un nombre, o sea una persona
		this.nombre = nombre; // se añade una persona al computo
		sumaPersonas(); // presupongo que lo minimo que tiene un individuo
	} // es un nombre

	public String getNombre() {
		return nombre;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDni() {
		return dni;
	}

	public void setEdad(int edad) { // cada vez que se añada una edad, se suma
		this.edad = edad;
		sumarEdad();
	}

	public int getEdad() {
		return edad;
	}

	public String toString() {
		String aux = ("");
		aux = aux.concat("\n Hay " + sumaPersonas + " personas, lo que da una edad media de  " + edadMedia);
		aux = aux.concat("\n" + this.nombre + "\s\s" + this.apellidos + "\s\s" + "con DNI " + this.dni + " y con  "
				+ this.edad + " años.\n (no) es mayor de edad. Su edad dista de la media "
				+ ((Persona.edadMedia) - (this.edad)));

		return aux;
	}

}
