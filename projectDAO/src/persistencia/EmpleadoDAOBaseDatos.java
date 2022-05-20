package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import empleado.EmpleadoDAO;

import empleado.Empleado;

public class EmpleadoDAOBaseDatos implements EmpleadoDAO {

	Scanner sc = new Scanner(System.in);
	Connection miConexion;

	public EmpleadoDAOBaseDatos() {
		super();
		conectarConBaseDatos();
	}

	public void conectarConBaseDatos() {
		try {
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root", "");
		} catch (Exception e) {
			System.out.println("Algo falla, no hay conexion");
			e.printStackTrace();
		}
	}
	
	
	
	public List<Empleado> getEmpleados() {
		List<Empleado> empleados = new ArrayList<>();
		ResultSet resultado;
		try {
			PreparedStatement consultaLlenar = miConexion
					.prepareStatement("select dni,nombre,apellido1,apellido2,sueldo from empleados");
			resultado = consultaLlenar.executeQuery();
			while (resultado.next()) {
				String dni = resultado.getString("dni");
				String nombre = resultado.getString("nombre");
				String apellido1 = resultado.getString("apellido1");
				String apellido2 = resultado.getString("apellido2");
				float sueldo = resultado.getFloat("sueldo");
				Empleado aux = new Empleado(dni, nombre, apellido1, apellido2, sueldo);
				empleados.add(aux);

			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return empleados;

	}

	
	
	
	public void imprimir(ResultSet resultado) {
		try {
			System.out.println("\nDNI\tNOMBRE\tTAPELLIDO1\tTAPELLIDO2");
			System.out.println("--------------------------------");
			while (resultado.next()) {
				System.out.println(resultado.getString("dni") + "\t" + resultado.getString("nomnbre") + "\t"
						+ resultado.getString("apellido1") + "\t" + resultado.getString("apelllido2") + "\t"
						+ resultado.getString("apellildo2") + "\t" + resultado.getFloat("sueldo") + "\t");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public ResultSet imprimirConsultarTodo() {
		String consulta=" select * from emleados";
		ResultSet rs;
		try {
			PreparedStatement sentencia = miConexion.prepareStatement(consulta);
			rs = sentencia.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("dni") + " " + rs.getString("nombre") + " " + rs.getString("apellido1")
				+ "  " + rs.getString("apellido2") + "  " + rs.getFloat("sueldo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return rs;
	}
	
	
	
	
	

	public void consultar(String consulta) {// la consulta habra de ser una sentencia sql
		try {
			PreparedStatement sentenciaConsulta = miConexion.prepareStatement(consulta);
			ResultSet rs;
			rs = sentenciaConsulta.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("dni") + " " + rs.getString("nombre") + " " + rs.getString("apellido1")
						+ "  " + rs.getString("apellido2") + "  " + rs.getFloat("sueldo"));
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	/*public boolean ejecutar(String sentencia) {
		try {
			PreparedStatement ps = miConexion.prepareStatement(sentencia);

			ps.executeUpdate();

			System.out.println("sentencia ejecutada");
			return true;
		} catch (Exception ex) {
			System.out.println(ex.toString());
			return false;
		}
	}*/

	public Empleado buscarPorDni(String dni) {

		try {
			PreparedStatement stmt = miConexion.prepareStatement("SELECT * FROM empleados where dni=? ");
			stmt.setString(1, dni);
			ResultSet rs;
			rs = stmt.executeQuery();
			while (rs.next()) {
				Empleado aux = new Empleado(rs.getString("dni"), rs.getString("nombre"), rs.getString("apellido1"),
						rs.getString("apellido2"), rs.getFloat("sueldo"));

				System.out.println("se ha encontrado esta coincidencia :");
				System.out.println(rs.getString("dni") + " " + rs.getString("nombre") + " " + rs.getString("apellido1")
						+ "  " + rs.getString("apellido2") + "  " + rs.getFloat("sueldo"));

				return aux;

			}

			rs.close();
			stmt.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/*public Empleado buscarPorDNIydevuelvoEmpleado(String dni) {
		ResultSet resultadoB = null;
		System.out.println("vamos a buscar un empleado por el dni .");

		try {

			PreparedStatement sentenciaBusqueda = miConexion.prepareStatement("select * from empleados where dni=?");
			sentenciaBusqueda.setString(1, dni);

			resultadoB = sentenciaBusqueda.executeQuery();// ejecutar y recorrer
			while (resultadoB.next()) {
				System.out.println(resultadoB.getString(1) + "  " + resultadoB.getString(2) + "  "
						+ resultadoB.getString(3) + "  " + resultadoB.getString(4) + resultadoB.getFloat(5));
				Empleado buscadoPorDni = new Empleado(dni, resultadoB.getString(2), resultadoB.getString(3),
						resultadoB.getString(4), resultadoB.getFloat(5));
				return buscadoPorDni;
			}
		} catch (Exception e) {

		}
		return null;

	}*/

	public boolean nuevoEmpleado(Empleado empleado) {
		try {

			PreparedStatement sentenciaInsertar = miConexion.prepareStatement(
					"INSERT INTO EMPLEADOS (dni,nombre,apellido1,apellido2,sueldo)" + "values (?,?,?,?,?)");

			sentenciaInsertar.setString(1, empleado.getDni());
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
	
	
	
	public boolean borrar(String dni) {

		try {
			PreparedStatement ps = miConexion.prepareStatement("delete  from empleados where dni=?");
			ps.setString(1, dni);
			ps.executeUpdate();

			System.out.println("elemento borrado");
			return true;
		} catch (Exception ex) {
			System.out.println(ex.toString());
			return false;
		}
	}
	
	
	public boolean actualizarSueldo(String dni, float sueldo) {

		try {

			PreparedStatement ps = miConexion.prepareStatement("UPDATE EMPLEADOS SET SUELDO=? WHERE DNI=?");
			ps.setFloat(1, sueldo);
			ps.setString(2, dni);
			ps.executeUpdate();

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("se ha incrementado el sueldo ");

				System.out.println(rs.getString("dni") + " " + rs.getString("nombre") + " " + rs.getString("apellido1")
						+ "  " + rs.getString("apellido2") + "  " + rs.getFloat("sueldo"));
				return true;
			}

		} catch (Exception e) {
		}
		return false;

	}
	



	/*public boolean insertarConDatos() {// opto por pedir por teclado los datos e insertarlos a la base de datos
		System.out.println("INTRODUZCA DNI :");
		String dni = sc.nextLine();
		System.out.println("INTRODUZCA NOMBRE :");
		String name = sc.nextLine();
		System.out.println("INSTRODUZCA PRIMER APELLLIDO :");
		String surname1 = sc.nextLine();
		System.out.println("INTRODUZCA SEGUNDO APELLIDO :");
		String surname2 = sc.nextLine();
		System.out.println("INTRODUZCA EL SUELDO :");
		Float salary = sc.nextFloat();
		try {

			// 2. preparar consulta sql, insertando los parametros
			PreparedStatement sentenciaInsertar = miConexion.prepareStatement(
					"INSERT INTO EMPLEADOS (dni,nombre,apellido1,apellido2,sueldo)" + "values (?,?,?,?,?)");
			// 3.ESTABLECER LOS PARAMETROS DE CONSULTA
			sentenciaInsertar.setString(1, dni); // para la primera interrrogacion, el primer parametro
			sentenciaInsertar.setString(2, name);
			sentenciaInsertar.setString(3, surname1);// para el segundo parametro
			sentenciaInsertar.setString(4, surname2);
			sentenciaInsertar.setFloat(5, salary);

			sentenciaInsertar.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Parece que hay un error, no conecta !!!");

		}
		return false;

	}*/

	/*public boolean insertarTeDoyDatos(String dni, String name, String surname1, String surname2, float salary) {

		try {

			// 2. preparar consulta sql, insertando los parametros
			PreparedStatement sentenciaInsertar = miConexion.prepareStatement(
					"INSERT INTO EMPLEADOS (dni,nombre,apellido1,apellido2,sueldo)" + "values (?,?,?,?,?)");
			// 3.ESTABLECER LOS PARAMETROS DE CONSULTA
			sentenciaInsertar.setString(1, dni); // para la primera interrrogacion, el primer parametro
			sentenciaInsertar.setString(2, name);
			sentenciaInsertar.setString(3, surname1);// para el segundo parametro
			sentenciaInsertar.setString(4, surname2);
			sentenciaInsertar.setFloat(5, salary);

			sentenciaInsertar.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Parece que hay un error, no conecta !!!");

		}
		return false;

	}*/

	

	

	public boolean actualizar() {// para comprobar que no puede funcionar, usa un query, no un update en el
									// execute
		ResultSet rs;

		System.out.println("A que empleado quiere modificar el sueldo, indroduzca su DNI :");
		String idToModify = sc.nextLine();
		System.out.println("Introduzca el incremento que quiere modificar :");
		float sueldoMas = sc.nextFloat();

		try {

			PreparedStatement sentenciaU = miConexion
					.prepareStatement("UPDATE EMPLEADOS SET SUELDO=SUELDO+? WHERE DNI=?");
			sentenciaU.setString(1, idToModify);
			sentenciaU.setFloat(2, sueldoMas);
			rs = sentenciaU.executeQuery();
			while (rs.next()) {
				return true;
			}

		} catch (Exception e) {
		}
		return false;

	}

	/*public List<Empleado> getEmpleados() {
		List<Empleado> empleados = new ArrayList<>();
		ResultSet resultado;
		try {
			PreparedStatement consultaLlenar = miConexion
					.prepareStatement("select dni,nombre,apellido1,apellido2,sueldo from empleados");
			resultado = consultaLlenar.executeQuery();
			while (resultado.next()) {
				String dni = resultado.getString("dni");
				String nombre = resultado.getString("nombre");
				String apellido1 = resultado.getString("apellido1");
				String apellido2 = resultado.getString("apellido2");
				float sueldo = resultado.getFloat("sueldo");
				Empleado aux = new Empleado(dni, nombre, apellido1, apellido2, sueldo);
				empleados.add(aux);

			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return empleados;

	}*/

	@Override
	public boolean insertar(Empleado empleado) {
		// TODO Auto-generated method stub
		return false;
	}

}
