package juanAntoSieteDos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class EmpleadoDAOFichero implements EmpleadoDAO {

	@Override
	public List<Empleado> getEmpleados() {
		
		List<Empleado> listaEmpleados = new ArrayList<>();
		
		
		

		File fichero = new File("empleados.csv");

		try {
			Scanner lector = new Scanner(fichero); 
			
			while(lector.hasNextLine()) {
			 String[] campos = lector.nextLine().split(",");
			 
			  Empleado emp = new Empleado(campos[0], campos[1], campos[2], Double.valueOf(campos[3]));
			  
			  listaEmpleados.add(emp);
			  
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		return listaEmpleados;
		
	}
		
		
		
			

		

	@Override
	public boolean insertar(Empleado empleado) {
		// TODO Auto-generated method stub

		try {
			FileWriter fichero = new FileWriter("empleados.csv", true);

			fichero.write(empleado.getNombre() + "," + empleado.getApellidos() + "," + empleado.getDni() + ","
					+ empleado.getSueldo() + "\n");
			fichero.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public Empleado buscar(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean borrar(String dni) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actualizar(String dni, double sueldo) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {
		EmpleadoDAOFichero emp = new EmpleadoDAOFichero();

		// emp.insertar(new Empleado("Joel", "Quiros Jimenez", "434445335E", 5000));
		// emp.insertar(new Empleado("Angel", "Del Valle Torres", "34343434T", -3000));
		
		System.out.println(emp.getEmpleados());
		

	}







	

}
