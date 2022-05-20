package juanAntoSieteDos;


import java.util.List;




public interface EmpleadoDAO {
	
	
	 List<Empleado> getEmpleados();
	 
	 boolean insertar(Empleado empleado);
	
	 
	 Empleado buscar(String dni);
	 
	 
	 
	 boolean borrar (String dni);
	 
	 boolean actualizar(String dni, double sueldo);
	 
	 
	 
	 
		  
		
}
