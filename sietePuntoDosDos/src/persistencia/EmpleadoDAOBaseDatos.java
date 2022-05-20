package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import empleados.Empleado;

public class EmpleadoDAOBaseDatos {

	Scanner sc = new Scanner(System.in);
	Connection miConexion;

	public void conectarConBaseDatos() {
		try {
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root", "");
		} catch (Exception e) {
			System.out.println("Algo falla, no hay conexion");
			e.printStackTrace();
		}
	}

	public ResultSet consultar(String consulta) {
		ResultSet resultado;
		try {
			PreparedStatement sentencia = miConexion.prepareStatement(consulta);
			resultado = sentencia.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return resultado;
	}

	public boolean ejecutar(String cambio) {
		try {
			PreparedStatement sentencia = miConexion.prepareStatement(cambio);
			int totalRows = sentencia.executeUpdate(); // devuelve el n�mero de tuplas modificadas
			System.out.println("Se han modificado: " + totalRows + " tuplas");
			sentencia.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public void imprimirResultado(ResultSet resultado) {
		try {
			System.out.println("\nDNI\tNOMBRE\tTAPELLIDO1\tTAPELLIDO2");
			System.out.println("--------------------------------");
			while (resultado.next()) {
				System.out.println(resultado.getString("dni") + "\t" + resultado.getString("nomnbre") + "\t"
						+ resultado.getString("apellido1") + "\t" + resultado.getString("apelllido2") + "\t"
						+ resultado.getString("apellildo2") + "\t" + resultado.getString("sueldo") + "\t");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ResultSet buscarEmpleadoPorDni() {
		ResultSet resultadoB = null;
		System.out.println("vamos a buscar un empleado por el dni .");

		try {

			System.out.println("Que dni quiere buscar?Introduzca DNI :");
			String dni = sc.nextLine();

			PreparedStatement sentenciaBusqueda = miConexion.prepareStatement("select * from empleados where dni=?");
			sentenciaBusqueda.setString(1, dni);

			resultadoB = sentenciaBusqueda.executeQuery();// ejecutar y recorrer
			while (resultadoB.next()) {
				System.out.println(resultadoB.getString(1) + "  " + resultadoB.getString(2) + "  "
						+ resultadoB.getString(3) + "  " + resultadoB.getDouble(4));

			}
		} catch (Exception e) {

		}
		return resultadoB;
	}
	
	public Empleado buscarPorDNIydevuelvoEmpleado(String dni) {
		ResultSet resultadoB = null;
		System.out.println("vamos a buscar un empleado por el dni .");

		try {

			System.out.println("Que dni quiere buscar?Introduzca DNI :");
			String dni1 = sc.nextLine();

			PreparedStatement sentenciaBusqueda = miConexion.prepareStatement("select * from empleados where dni=?");
			sentenciaBusqueda.setString(1, dni1);

			resultadoB = sentenciaBusqueda.executeQuery();// ejecutar y recorrer
			while (resultadoB.next()) {
				System.out.println(resultadoB.getString(1) + "  " + resultadoB.getString(2) + "  "
						+ resultadoB.getString(3) + "  " + resultadoB.getString(4)+ resultadoB.getDouble(5));
				Empleado buscadoPorDni = new Empleado(dni1, resultadoB.getString(2), resultadoB.getString(3), resultadoB.getString(4),resultadoB.getDouble(5)); 
				return buscadoPorDni;
			}
		} catch (Exception e) {

		}
		return null;
		
	}
	

	public boolean insertarEmpleado(Empleado empleado) {// opto por pedir por teclado los datos e insertarlos a la base de datos

		try {
			/*System.out.println("Procedemos a insertar valores:");
			System.out.println("Introduce el dni :");
			String dni = sc.nextLine();
			System.out.println("Introduce el nombre :");
			String name = sc.nextLine();
			System.out.println("Introduce primer apellido :");
			String surname1 = sc.nextLine();
			System.out.println("Introduce segundo apellido");
			String surname2 = sc.nextLine();
			System.out.println("Y por ultimo, introduce el sueldo :");
			double salary = sc.nextDouble();*/
			// 2. preparar consulta sql, insertando los parametros
			PreparedStatement sentenciaInsertar = miConexion.prepareStatement(
					"INSERT INTO EMPLEADOS (dni,nombre,apellido1,apellido2,sueldo)" + "values (?,?,?,?,?)");
			// 3.ESTABLECER LOS PARAMETROS DE CONSULTA
			sentenciaInsertar.setString(1, dni); // para la primera interrrogacion, el primer parametro
			sentenciaInsertar.setString(2, name);
			sentenciaInsertar.setString(3, surname1);// para el segundo parametro
			sentenciaInsertar.setString(4, surname2);
			sentenciaInsertar.setDouble(5, salary);

			// 4.EJECUTAR Y RECORRER LA CONSULTA
			sentenciaInsertar.executeUpdate();// crea una tabla donde se almacenan los resultados de la
												// consulta
			// sql

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Parece que hay un error, no conecta !!!");

		}
		return false;

	}
	
	
	public boolean insertarDatosSinPedirlos(String dni, String name, String surname1, String surname2, Double salary) {// opto por pedir por teclado los datos e insertarlos a la base de datos

		try {
			
			// 2. preparar consulta sql, insertando los parametros
			PreparedStatement sentenciaInsertar = miConexion.prepareStatement(
					"INSERT INTO EMPLEADOS (dni,nombre,apellido1,apellido2,sueldo)" + "values (?,?,?,?,?)");
			// 3.ESTABLECER LOS PARAMETROS DE CONSULTA
			sentenciaInsertar.setString(1, dni); // para la primera interrrogacion, el primer parametro
			sentenciaInsertar.setString(2, name);
			sentenciaInsertar.setString(3, surname1);// para el segundo parametro
			sentenciaInsertar.setString(4, surname2);
			sentenciaInsertar.setDouble(5, salary);

			// 4.EJECUTAR Y RECORRER LA CONSULTA
			sentenciaInsertar.executeUpdate();// crea una tabla donde se almacenan los resultados de la
												// consulta
			// sql

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Parece que hay un error, no conecta !!!");

		}
		return false;

	}
	

	public boolean borrar() {// analogo al metodo buscar, pero en la sentencia sql, usamos delete
		System.out.println("introduzca el dni a borrar:");
		String dni = sc.nextLine();
		ResultSet resultadoBorrar;
		try {

			PreparedStatement sentenciaBorrar = miConexion.prepareStatement("delete * from empleados where dni=?");
			sentenciaBorrar.setString(1, dni);

			resultadoBorrar = sentenciaBorrar.executeQuery();// ejecutar y recorrer
			while (resultadoBorrar.next()) {
				System.out.println(resultadoBorrar.getString(1) + "  " + resultadoBorrar.getString(2) + "  "
						+ resultadoBorrar.getString(3) + "  " + resultadoBorrar.getDouble(4));
				return true;

			}
		} catch (Exception e) {

		}
		// return false;
		return false;

	}

	public boolean actualizar() {
		ResultSet rs;

		System.out.println("A que empleado quiere modificar el sueldo, indroduzca su DNI :");
		String idToModify = sc.nextLine();
		System.out.println("Introduzca el incremento que quiere modificar :");
		double sueldoMas = sc.nextDouble();

		try {
			PreparedStatement sentenciaU = miConexion
					.prepareStatement("UPDATE EMPLEADOS SET SUELDO=SUELDO+? WHERE DNI=?");

			sentenciaU.setString(1, idToModify);
			sentenciaU.setDouble(2, sueldoMas);
			rs = sentenciaU.executeQuery();
			while (rs.next()) {
				return true;
			}

		} catch (Exception e) {
		}
		return false;

	}

	public List<Empleado> getEmpleados() {
		List<Empleado> empleados = new ArrayList<>();
		ResultSet resultado;
		try {
			PreparedStatement consultaLlenar = miConexion
					.prepareStatement("select dni,nombre,apellido1,apellido2,sueldo from empleados");
			resultado = consultaLlenar.executeQuery();
			while (resultado.next()) {
				String dni = resultado.getString(2);
				String nombre = resultado.getString(3);
				String apelllido1 = resultado.getString(4);
				String apellido2 = resultado.getString(5);
				double sueldo = resultado.getDouble(6);
				Empleado aux = new Empleado(dni, nombre, apelllido1, apellido2, sueldo);
				empleados.add(aux);

			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return empleados;

	}

}
