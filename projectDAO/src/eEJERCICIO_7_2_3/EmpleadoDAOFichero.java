package eEJERCICIO_7_2_3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import empleado.Empleado;


/** VERSION 3.0.1
 * @author Jesus
 *
 */
public class EmpleadoDAOFichero implements EmpleadoDAO{
	
	
	
/**		metodo que escribe dentro  
 * 		
 * 
 *
 */
	
	
	/**metodo que inserta en el array
	 *
	 */
	@Override
	public ArrayList<Empleado> getEmpleados() {
		
		ArrayList<Empleado> listaEmpleados = new ArrayList<>();
		
		
		

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
	
	

/**		escribe en el archivo csv
 * que se encuentra en el mismo directorio
 *
 */
public boolean insertar(Empleado empleado) {
	// TODO Auto-generated method stub

	try {
		FileWriter fichero = new FileWriter("empleados.csv", true);

		fichero.write(empleado.getNombre() + "," + empleado.getApellido1() + "," +empleado.getApellido2() + ","+ empleado.getDni() + ","
				+ empleado.getSueldo() + "\n");
		fichero.close();

	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	return false;
}



	

	
	


	

	@Override
	public boolean borrar(String dni) {
		// TODO Auto-generated method stub
		return false;
	}

	

	@Override
	public boolean actualizar(String dni, float sueldo) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void imprimir(ResultSet resultado) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public boolean actualizarSueldo(String dni, float sueldo) {
		// TODO Auto-generated method stub
		return false;
	}


	


	@Override
	public empleado.Empleado buscar(String dni) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
