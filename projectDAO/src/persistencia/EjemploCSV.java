package persistencia;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import empleado.Empleado;

public class EjemploCSV {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);		

			ArrayList<Empleado> al = getEmpleados(sc);
			File f = new File("./prueba.csv");
			try (FileWriter fw = new FileWriter(f);) {
				for (Empleado empleado : al) {
					fw.write(empleado.toCSV() + "\n");
				}
			} catch (Exception e) {
				System.out.println("Se ha producido un error");

			}

	}

		
		public static ArrayList<Empleado> getEmpleados(Scanner sc) {
			ArrayList<Empleado> al = new ArrayList<Empleado>();
			String dni;
			String nombre;
			String apellido1;
			String apellido2;
			float sueldo;
			Empleado e;
			do {
				System.out.println("DNI: ");
				dni = sc.nextLine();
				if (!dni.equalsIgnoreCase("FIN")) {
					System.out.println("NOMBRE: ");
					nombre = sc.nextLine();
					System.out.println("APELLIDO1:");
					apellido1 = sc.nextLine();
					System.out.println("APELLIDO2: ");
					apellido2 = sc.nextLine();
					System.out.println("SUELDO: ");
					sueldo = sc.nextFloat();
					e = new Empleado(dni, nombre, apellido1, apellido2, sueldo);
					al.add(e);

				}
			} while (!dni.equalsIgnoreCase("FIN"));
			return al;

		}
		
	}


