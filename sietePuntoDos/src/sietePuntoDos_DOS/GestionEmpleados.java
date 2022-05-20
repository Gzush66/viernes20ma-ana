package sietePuntoDos_DOS;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import persistencia.EmpleadoDAOBaseDatos;


public class GestionEmpleados {

		
		public  static EmpleadoDAOBaseDatos joe = new EmpleadoDAOBaseDatos();
		 
		 
		 
		 public static void conectar() {
				joe.conectarBaseDatos();
			}
		 
		 public static List<Empleado> getEmpleados() {
				 return joe.devuelvoListaEmpleados();
				
			}
		 
		 
		 /**
		 * @param dni 	no devuelve, solo imprime por pantalla el empleado
		 * 				al que corresponda el dni
		 */
		public static void empleadoDni (String dni) {
			 joe.buscarPorDni(dni);
			
		 }
		 
		 public static void imprimir () {
			 joe.imprimir();
		 }
		 
		 /**
		 * @param dni   Se introduce dni y borra el empleado 
		 * 				con dicho dni
		 */
		public static void borrar(String dni) {
			 joe.borrar(dni);
		 }
		
		 
			public static boolean nuevoEmpleado(Empleado empleado) {
				return joe.insertar(empleado);
			}
			 
			/* boolean modificarSueldo(String dni, double sueldo): modifica el sueldo del empleado y modifica la base de datos.
			 */
			
			/**
			 * 			ha habido problemas con modificar sueldo poniendo dni y variacion
			 * 			en los argumentos, opto por pedir los datos en el metodo
			 */
			public static void tocarElSueldo () {
				joe.modificarSueldo();
			}
			
			
			
			
			
			public static void main(String[] args) {	
				List<Empleado> getEmpleados = new ArrayList<>();
			
			Empleado e1 = new Empleado("0010","Manuel","Gomez","Lindo",1350.50);
			Empleado e2 = new Empleado("0011","Abenamar","Gomez","Lindo",1350.50);
			Empleado e3 = new Empleado("0012", "Maria ","Bermudez","Castro",1475.75);
			Empleado e4 = new Empleado ("1246","Marcelo","Arias","Cañete",1113.25);
			Empleado e5 = new Empleado ("5246","Hellen ","Smith","Muñoz",894.90);
			Empleado e6 = new Empleado ("7556","Willian","Taylor","Muñoz",1540.05);
			Empleado e7 = new Empleado ("7120","Jose  ","Iglesias","Sanchez",1980);
			Empleado e8 = new Empleado ("5512","Ignacio","Millan","Grass",2125.30);
			Empleado e9 = new Empleado ("7556","William","Wallace","Ortiz",875.25);
		
			getEmpleados.add(e8);
			getEmpleados.add(e7);
			getEmpleados.add(e6);
			getEmpleados.add(e5);
			getEmpleados.add(e4);
			getEmpleados.add(e3);
			getEmpleados.add(e2);
			getEmpleados.add(e1);
			getEmpleados.add(e9);
			
		
			
	/*
	 *  2. 	Insertar el empleado "Juan Pérez García, 456789012D, 1800€"
				Comprueba que se ha insertado en la base de datos.		
	 */
			Empleado otroMas = new Empleado (" 456789012D","Juan"," Pérez"," García", 1800f);
			
			nuevoEmpleado(otroMas); 
			
			
			empleadoDni("456789012D");	//comprobamos si se ha añadido
			
			
			/*
			 *  3.	 Elimina el empleado con DNI "123456789A"
				Comprueba que ha sido eliminado
					 */
			
			borrar("123456789A");
			
			empleadoDni("123456789A");
			
			
			
			/*
			 * 4. Elimina el empleado con DNI "987654321Z"
	Comprueba si  se ha realizado la operación (false)
			 */
			borrar("987654321Z");
			empleadoDni("987654321Z");
			
			
			
			/*
			 * 5. 	Modifica el sueldo del empleado con DNI "456789012D" para que sea de 2100€.
					Comprueba que ha sido modificado en la base de datos.
			 * 
			 */
			
			tocarElSueldo();
			empleadoDni("456789012D");
			
	
}
	
}
		
		
			
		
			
		
		
		
		
		
	
			
		

		
		
		
		
		


