package eEJERCICIO_7_2_3;


	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;

import empleado.Empleado;

		public interface EmpleadoDAO {
			

				/**		version 3.0.0
				 * @author Jesus
				 *
				 */
			
			
			public List<Empleado> getEmpleados() ;
			
			public boolean insertar (Empleado empleado);
			
			public Empleado buscar(String dni) ;	
			
			public boolean borrar(String dni) ;
			
			
			public void imprimir(ResultSet resultado);	
			
			public boolean actualizarSueldo(String dni, float sueldo) ;

			boolean actualizar(String dni, float sueldo);

			
			
				
				
				

	}
