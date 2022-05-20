package sietePuntoDos_DOS_empleado;

import java.io.File;
import java.io.FileWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpleadoDAOFichero implements EmpleadoDAO {
	Scanner sc = new Scanner(System.in);

	EmpleadoDAOFichero leoYescribo = new EmpleadoDAOFichero() {//EmpleadoDAOFichero
		super();
		conectarConBaseDatos();
	}
	
	
	
	
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
	
	@Override
	public boolean insertar(Empleado empleado) {
		// TODO Auto-generated method stub
		return false;
	}
	public void conectarConBaseDatos() {
		try {
			miConexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root", "");
		} catch (Exception e) {
			System.out.println("Algo falla, no hay conexion");
			e.printStackTrace();
		}
	}
	

	/*@Override
	public List<Empleado> getEmpleados() {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public void imprimirResultado(ResultSet resultado) {
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
