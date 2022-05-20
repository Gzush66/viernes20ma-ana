package empleado;

import java.io.File;
import java.sql.Connection;
import java.io.FileWriter;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpleadoDAOFichero implements EmpleadoDAO {
	Scanner sc = new Scanner(System.in);
	Connection miConexion;

	
	/**
	 *   en el constructor ya conecta con la base de datos
	 */
	public EmpleadoDAOFichero() {
		super();
		conectarConBaseDatos();
	}

	
	
	/**metodo conectar con la base de datos
	 * se llama en el constructor, asi el objeto creado de por si tiene conexion
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
	
	

	/**
	 * @param sc
	 * @return
	 */
	public ArrayList<Empleado> getEmpleados(Scanner sc) {
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
	
	/** metodo para crear el archivo CSV, los datos con SCANNER
	 * @param sc insertando a traves de teclado
	 */
	public void crearCSV(Scanner sc) {

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



	@Override
	public List<Empleado> getEmpleados() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
