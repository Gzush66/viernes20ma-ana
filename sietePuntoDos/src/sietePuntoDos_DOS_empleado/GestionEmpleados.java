package sietePuntoDos_DOS_empleado;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import persistencia.EmpleadoDAOBaseDatos;

public class GestionEmpleados {

	Scanner sc = new Scanner(System.in);
	Scanner scString = new Scanner(System.in);

	private List<Empleado> empleados = new ArrayList<>();
	protected EmpleadoDAO joe = new EmpleadoDAOBaseDatos();
	EmpleadoDAO e = new EmpleadoDAOBaseDatos ();
	
	
	
	
	
	public boolean insertarEmpleado(Empleado empleado) {
		try {
			
			PreparedStatement sentenciaInsertar = miConexion.prepareStatement(
					"INSERT INTO EMPLEADOS (dni,nombre,apellido1,apellido2,sueldo)" + "values (?,?,?,?,?)");
		
			sentenciaInsertar.setString(1,empleado.getDni()); 
			sentenciaInsertar.setString(2, empleado.getNombre());
			sentenciaInsertar.setString(3, empleado.getApellido1());
			sentenciaInsertar.setString(4, empleado.getApellido2());
			sentenciaInsertar.setFloat(5, empleado.getSueldo());
			
			sentenciaInsertar.executeUpdate();
			return true;

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Parece que hay un error, no conecta !!!");

		}
		return false;

	}
	
	

	

	public boolean insertarEmpleado(Empleado empleado) {
		return joe.insertarEmpleado(empleado);
	}

	

	}

	public List<Empleado> getEmpleados() {
		empleados = joe.getEmpleados();
		return empleados;
	}

	public void imprimirconFOREmpleados() {
		for (Empleado aux : empleados) {
			System.out.println(aux);
		}
	}

	public Empleado getEmpleadoOpcionPideDNI() {
		System.out.println("introduzca el dni a buscar:");
		String dniBuscar = sc.nextLine();
		if (empleados.contains(dniBuscar)) {
			return empleados.get(0);
		} else if (empleados.get(0) == null) {
			joe.buscarPorDNIydevuelvoEmpleado(dniBuscar);// recurro al metodo que devuelva empleado
		}
		return null;

	}

	public Empleado getEmpleadopcionTeDoyDNi(String dni) {
		if (empleados.contains(dni)) {
			return empleados.get(0);
		} else if (empleados.get(0) == null) {
			joe.buscarPorDni(dni);
		}
		return null;

	}

	/*
	 * boolean nuevoEmpleado(Empleado empleado): inserta un empleado a la lista de
	 * empleados y lo guarda en la base de datos.
	 */
	public boolean nuevoEmpleado(Empleado empleado) {
		return joe.insertarEmpleado(empleado);
	}

	/*
	 * boolean borrarEmpleado(String dni): elimina un empleado de la lista y lo
	 * borra de la base de datos. Si el empleado no está en la lista, lo busca en la
	 * base de datos. En caso de no existir, devuelve false
	 */
	public boolean borrarEmpleado(Empleado empleado) {
		return joe.borrar(empleado.getDni());

	}

	public boolean borrarPorDni(String dni) {
		return joe.borrar(dni);
	}

	/*
	 * boolean modificarSueldo(String dni, double sueldo): modifica el sueldo del
	 * empleado y modifica la base de datos.
	 */
	public boolean modificarSueldo(String dni, float incrementoSueldo) {
		return joe.actualizar();
	}

}
