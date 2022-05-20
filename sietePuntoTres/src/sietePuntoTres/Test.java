package empleado;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import persistencia.EmpleadoDAOBaseDatos;

//import persistencia.EmpleadoDAOBaseDatos;



public class Test {

	public static void main(String[] args) {

		List<Empleado> getEmpleados = new ArrayList<Empleado>();

		Empleado e1 = new Empleado("0010", "Manuel", "Gomez", "Lindo", 1350.50f);
		Empleado e2 = new Empleado("0011", "Abenamar", "Gomez", "Lindo", 1350.50f);
		Empleado e3 = new Empleado("0012", "Maria ", "Bermudez", "Castro", 1475.75f);
		Empleado e5 = new Empleado("5246", "Hellen ", "Smith", "Muñoz", 894.90f);
		Empleado e6 = new Empleado("7556", "Willian", "Taylor", "Muñoz", 1540.05f);
		Empleado e7 = new Empleado("7120", "Jose  ", "Iglesias", "Sanchez", 1980f);
		Empleado e8 = new Empleado("5512", "Ignacio", "Millan", "Grass", 2125.30f);
		Empleado e9 = new Empleado("7556", "William", "Wallace", "Ortiz", 875.25f);
		Empleado e4 = new Empleado("121212", "antonio", "romero", "Caraballo", 1125f);

		getEmpleados.add(e8);
		getEmpleados.add(e7);
		getEmpleados.add(e6);
		getEmpleados.add(e5);
		getEmpleados.add(e4);
		getEmpleados.add(e3);
		getEmpleados.add(e2);
		getEmpleados.add(e1);
		getEmpleados.add(e9);

		EmpleadoDAO joe = new EmpleadoDAOBaseDatos();

		EmpleadoDAO other = new EmpleadoDAOFichero();

		
		joe.insertar(e1);
		joe.insertar(e2);
		joe.insertar(e3);
		joe.insertar(e4);
		joe.insertar(e5);
		joe.insertar(e6);
		joe.insertar(e7);
		joe.insertar(e8);
		joe.insertar(e9);
		
		joe.buscarPorDni("6666");
		
		
		joe.buscarPorDni("7120");
		
		
		Empleado e20= new Empleado("7521", "Manolin", "Manolete", "Muriel", 2200.50f);
		joe.nuevoEmpleado(e20);
		
		joe.actualizarSueldo("7521",120.00f);
		

		//Scanner sc = new Scanner(System.in);
		//Scanner scString = new Scanner(System.in);

		//Connection miConexion;
		((EmpleadoDAOBaseDatos) joe).conectarConBaseDatos();
		
		
		

	}

}
















/*
 * public List<Empleado> getEmpleados() { return joe.getEmpleados();
 * 
 * }
 * 
 * public void imprimirs(List<Empleado> empleados) { for (Empleado aux :
 * empleados) { System.out.println(aux); } }
 * 
 * public boolean nuevoEmpleado(Empleado empleado) { return
 * joe.insertar(empleado); }
 * 
 * public boolean borrarEmpleado(Empleado empleado) { return
 * joe.borrar(empleado.getDni()); }
 * 
 * public boolean borrarPorDni(String dni) { return joe.borrar(dni); }
 * 
 * public boolean modificarSueldo(String dni, float incrementoSueldo) { return
 * joe.actualizarSueldo(dni, incrementoSueldo);
 * 
 * }
 */
