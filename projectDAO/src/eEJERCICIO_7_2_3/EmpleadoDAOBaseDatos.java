package eEJERCICIO_7_2_3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import empleado.Empleado;

public class EmpleadoDAOBaseDatos implements EmpleadoDAO {

	Scanner sc = new Scanner(System.in);
	private Connection miConexion;

	EmpleadoDAOBaseDatos() {
		super();
		conectarConBaseDatos();

	}

	/**
	 * 	creo el metodo main aqui para poder probar los distintos metodos
	 * 
	 * se han creado dos objetos de EmpleadoDao, con las funcionalidades de sus clases hijas
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmpleadoDAOBaseDatos database = new EmpleadoDAOBaseDatos();
		

		EmpleadoDAO dao1 = new EmpleadoDAOFichero();
		
		
		EmpleadoDAO dao2 = new EmpleadoDAOBaseDatos ();
		
		
		

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

		database.insertar(e1);
		database.insertar(e2);
		database.insertar(e3);
		database.insertar(e4);
		database.insertar(e5);
		database.insertar(e6);
		database.insertar(e7);
		database.insertar(e8);
		database.insertar(e9);

		dao1.insertar(e8);

		dao1.insertar(e1);
		dao1.insertar(e2);
		dao1.insertar(e3);
		dao1.insertar(e4);
		dao1.insertar(e5);

		dao1.getEmpleados();
		
		dao2.insertar(e8);
		dao2.buscar("5512");
		dao2.borrar("5512");

		database.buscar("6666");

		database.buscar("7120");

		Empleado e20 = new Empleado("7521", "Manolin", "Manolete", "Muriel", 2200.50f);

		database.insertar(e20);

		database.actualizarSueldo("7521", 120.00f);
		dao1.insertar(e20);

	}

	/** conexion a la base de datos
	 * 
	 * este metodo se ha implementado en el mismo contrusctor del objeto de la clase
	 * 
	 */
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

	/** busca en la base de datos por el campo dni
	 *
	 */
	public Empleado buscar(String dni) {

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

	/** inserta en la base de datos
	 *
	 */
	public boolean insertar(Empleado empleado) {
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

	/**		actualiza el sueldo incrementandolo 
	 *
	 */
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

	/**		borra mediante una sentencia sql
	 *
	 */
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

	@Override
	public void imprimir(ResultSet resultado) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean actualizar(String dni, float sueldo) {
		// TODO Auto-generated method stub
		return false;
	}

}
