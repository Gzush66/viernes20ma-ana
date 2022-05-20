package empleado;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

	public interface EmpleadoDAO {
		
		
		
		
		public List<Empleado> getEmpleados() ;
		
		public void imprimir(ResultSet resultado);	
		
		public Empleado buscarPorDni(String dni) ;	
		
		public boolean nuevoEmpleado(Empleado empleado);
		
		public boolean borrar(String dni) ;
		
		public boolean actualizarSueldo(String dni, float sueldo) ;
		
		
		
		// public List <Empleado>getEmpleados ();  */
		
		public boolean insertar (Empleado empleado);
		
		
	
		
		
			
			
			
			

}

	
	
	
	
	
	


