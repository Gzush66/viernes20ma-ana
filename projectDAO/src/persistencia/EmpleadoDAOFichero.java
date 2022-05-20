package persistencia;

import java.io.BufferedWriter;
import java.io.File;
import java.sql.Connection;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import empleado.Empleado;
import empleado.EmpleadoDAO;

/**
 * @author Jesus
 *
 */
public class EmpleadoDAOFichero implements EmpleadoDAO {
	Scanner sc = new Scanner(System.in);
	Connection miConexion;

	
	/**
	 *   en el constructor ponemos la conexion a la base de datos
	 */
	public EmpleadoDAOFichero() {
		super();
		conectarConBaseDatos();
	}

	/**
	 * metodo conexta a BD empleado
	 */
	public void conectarConBaseDatos() {
		try {
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root", "");
		} catch (Exception e) {
			System.out.println("Algo falla, no hay conexion");
			e.printStackTrace();
		}
	}
	

	public ArrayList<Empleado> getEmpleados() {
		ArrayList<Empleado> empleados = new ArrayList<>();
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
	
	
	
	
	
	public void crearCSV(Scanner sc) {

		ArrayList<Empleado> al = getEmpleados();
		File f = new File("./prueba.csv");
		try (FileWriter fw = new FileWriter(f);) {
			for (Empleado empleado : al) {
				fw.write(empleado.toCSV() + "\n");
			}
		} catch (Exception e) {
			System.out.println("Se ha producido un error");

		}

	}
	
	
	
	/** INSERTAR EN BASE DE DATOS
	 * se van pidiendo los datos
	 * por teclado	 *
	 */
	@Override
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
	
	

	
	@Override
	public void imprimir(ResultSet resultado) {
		// TODO Auto-generated method stub

	}

	@Override
	public Empleado buscarPorDni(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean nuevoEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean borrar(String dni) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actualizarSueldo(String dni, float sueldo) {
		// TODO Auto-generated method stub
		return false;
	}




	

}
