package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import sietePuntoDos_DEFINITIVO.Empleado;

public class EmpleadoDAOBaseDatos {
	
	Scanner sc = new Scanner(System.in);
	Connection miConexion;

	
	public EmpleadoDAOBaseDatos(){
		super();
		conectarBaseDatos();
	}
	
	
	public void conectarBaseDatos() {
		try {
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root", "");
			System.out.println((miConexion != null) ? "CONEXION OK" : "CONEXION FALLIDA");
		} catch (java.sql.SQLException sqle) {
			System.out.println("Error: " + sqle);
		}
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
	
	
	public List<Empleado> devuelvoListaEmpleados() {
		ArrayList<Empleado> listaEmpleado = new ArrayList<>();

		try {
			ResultSet rs;
			rs = miConexion.prepareStatement("Select * from empleados").executeQuery();
			while (rs.next()) {
				Empleado empleado = new Empleado(rs.getString("dni"), rs.getString("nombre"), rs.getString("apellido1"),
						rs.getString("apellido2"), rs.getFloat("sueldo"));
				listaEmpleado.add(empleado);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return listaEmpleado;
	}
	
	public boolean insertar(Empleado empleado) {
		try {
			PreparedStatement ps;
			String sql;
			sql = "insert into empleados(dni,nombre,apellido1,apellido2,sueldo) values(?,?,?,?,?)";
			ps = miConexion.prepareStatement(sql);
			ps.setString(1, empleado.getDni());
			ps.setString(2, empleado.getNombre());
			ps.setString(3, empleado.getApellido1());
			ps.setString(4, empleado.getApellido2());
			ps.setDouble(5, empleado.getSueldo());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Se han insertado los datos");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
		}
		return true;
	}

	
	
	
	
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
			double salary = sc.nextDouble();
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
	
	
	
	
	
	
	public void buscarPorDni(String dni) {
		try {

			PreparedStatement stmt = miConexion.prepareStatement("SELECT * FROM empleados where dni=? ");
			stmt.setString(1, dni);
			ResultSet rs;
			rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("dni") + " " + rs.getString("nombre") + " " + rs.getString("apellido1")
						+ "  " + rs.getString("apellido2") + "  " + rs.getFloat("sueldo"));
			}
			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public ResultSet imprimir() {
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

	
	
	
	public void actualizar(String dni, double incrementoSueldo) {
		try {
			PreparedStatement ps = miConexion.prepareStatement("UPDATE EMPLEADOS SET SUELDO=? WHERE DNI=?");
			ps.setDouble(1, incrementoSueldo);
			ps.setString(2, dni);
			ps.executeUpdate();

			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				System.out.println("se ha incrementado el sueldo ");

				System.out.println(rs.getString("dni") + " " + rs.getString("nombre") + " " + rs.getString("apellido1")
						+ "  " + rs.getString("apellido2") + "  " + rs.getDouble("sueldo"));
				return;
			}

		} catch (Exception e) {
		}
	
	}

	
	
	
	

	public boolean ejecutar(String sentencia) {
		try {
			PreparedStatement ps = miConexion.prepareStatement(sentencia);

			ps.executeUpdate();

			System.out.println("sentencia ejecutada");
			return true;
		} catch (Exception ex) {
			System.out.println(ex.toString());
			return false;
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
	
	public boolean modificarSueldo() {
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
				System.out.println("se ha incrementado el sueldo ");

				System.out.println(rs.getString("dni") + " " + rs.getString("nombre") + " " + rs.getString("apellido1")
						+ "  " + rs.getString("apellido2") + "  " + rs.getDouble("sueldo"));
				return true;
			}

		} catch (Exception e) {
		}
		return false;

	}
	
	List<Empleado>getEmpleado(){
		List<Empleado>getEmpleado= new ArrayList <>();
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
				Empleado aux=new Empleado (apellido2, apellido2, apellido2, sueldo);
				getEmpleado.add(aux);
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return getEmpleado;
		
		
	}


	


	

}

/*
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
*/

/*
 * public ResultSet consultar(String consulta) {
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
*/