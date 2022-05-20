package sietePuntoDos_ProbandoUNO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Connexion_Empleados {
	Scanner sc = new Scanner(System.in);
	Connection miConexion;

	// me da error la conexion, lo he probado con oracle y con el oracledeveloper
	// SHOW VARIABLES WHERE VARIABLE_NAME IN('HOSTNAME', 'PORT'), PARA AVERIGUAR
	// PUERTOS EN SQL

	public void conectarConBaseDatos() {
		try {
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root", "");
		} catch (Exception e) {
			System.out.println("Algo falla, no hay conexion");
			e.printStackTrace();
		}
	}

	/*
	 * public ResultSet consultar(String consulta) {// la consulta habra de ser una
	 * sentencia sql ResultSet resultadoC; try { PreparedStatement sentenciaConsulta
	 * = miConexion.prepareStatement(consulta); resultadoC =
	 * sentenciaConsulta.executeQuery(); } catch (SQLException e) {
	 * e.printStackTrace(); return null; } return resultadoC; }
	 */

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
			System.out.println("\nNOMBRE\tID");
			System.out.println("--------------------------------");
			while (resultado.next()) {
				System.out.println(resultado.getString("nombre") + "\t" + +resultado.getInt("id") + "\t");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * *Empleado buscar(String dni): devuelve un empleado a partir de su DNI,
	 * buscándolo en la base de datos, o null si no lo encuentra.
	 */
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

	/*
	 * boolean insertar(Empleado empleado): inserta un empleado en la base de datos
	 * y devuelve true si se consiguió insertar
	 */
	public boolean insertarDatos() {// opto por pedir por teclado los datos e insertarlos a la base de datos

		try {
			System.out.println("Procedemos a insertar valores:");
			System.out.println("Introduce el dni :");
			String dni = sc.nextLine();
			System.out.println("Introduce el nombre :");
			String name = sc.nextLine();
			System.out.println("Introduce primer apellido :");
			String surname1 = sc.nextLine();
			System.out.println("Introduce segundo apellido");
			String surname2 = sc.nextLine();
			System.out.println("Y por ultimo, introduce el sueldo :");
			float salary = sc.nextFloat();
			// 2. preparar consulta sql, insertando los parametros
			PreparedStatement sentenciaInsertar = miConexion.prepareStatement(
					"INSERT INTO EMPLEADOS (dni,nombre,apellido1,apellido2,sueldo)" + "values (?,?,?,?,?)");
			// 3.ESTABLECER LOS PARAMETROS DE CONSULTA
			sentenciaInsertar.setString(1, dni); // para la primera interrrogacion, el primer parametro
			sentenciaInsertar.setString(2, name);
			sentenciaInsertar.setString(3, surname1);// para el segundo parametro
			sentenciaInsertar.setString(4, surname2);
			sentenciaInsertar.setFloat(5, salary);

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
	
	
	

	/*
	 * boolean borrar(String dni): borra un empleado a partir de su DNI devolviendo
	 * true, o false si no es posible.
	 */
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
	
	
	
	
	

	/*
	 * boolean actualizar(String dni , double sueldo): modifica el sueldo de un
	 * empleado y devuelve true, o false si no es posible
	 */
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
	
	
	List<Employee>getEmpleado(){
		List<Employee>getEmpleado= new ArrayList <>();
		ResultSet resultado;
		try {
			PreparedStatement consultaLlenar = miConexion.prepareStatement("select dni,nombre,apellido1,apellido2,sueldo from empleados" );
			resultado = consultaLlenar.executeQuery();
			while(resultado.next()) {
				String dni= resultado.getString(2);
				String nombre=resultado.getString(3);
				String apelllido1=resultado.getString(4);
				String apellido2=resultado.getString(5);
				double sueldo= resultado.getDouble(6);
				Employee aux=new Employee (apellido2, apellido2, apellido2, sueldo);
				getEmpleado.add(aux);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return getEmpleado;
		
		
	}
	

}
