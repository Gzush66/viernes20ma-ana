package juanAntoSieteDos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpleadoDAOBaseDatos implements EmpleadoDAO{
	private Connection conexion;

	public static void main(String[] args) {
		
		EmpleadoDAOBaseDatos bd = new EmpleadoDAOBaseDatos();   // Creo un objeto de tipo ConexionBD dentro de la propia clase
		bd.conectarBD();					// ConexionBD. 
		
		
		// INSERCIONES
		bd.insertar(new Empleado("Antonio", "Rodríguez Antúnez", "123456789A", 1200));
		bd.insertar(new Empleado("Pedro", "Sánchez Guitiérrez", "234567890B", 1500));
		bd.insertar(new Empleado("Dolores", "Rubio Delgado", "345678901C" , 1100)); 
		
		// IMPRIMIR EMPLEADOS
		System.out.println(bd.getEmpleados());	
		
		// BUSCAR EMPLEADO POR DNI
	    System.out.println(bd.buscar("123456789AB"));
		
		// BORRAR EMPLEADOS
	/*	System.out.println(bd.getEmpleados());	
	    System.out.println(bd.borrar("234567890B"));
		System.out.println(bd.getEmpleados()); */
		
	    // ACTUALIZAR SUELDO EMPLEADO
		// System.out.println(bd.actualizar("234567890B", 2000));
			
	}
	
	
	public EmpleadoDAOBaseDatos() {
		// TODO Auto-generated constructor stub
		conectarBaseDatos();
	}
	
	public void conectarBaseDatos() {
		try {
			conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root", "");
			System.out.println((conexion != null) ? "CONEXION OK" : "CONEXION FALLIDA");
		} catch (java.sql.SQLException sqle) {
			System.out.println("Error: " + sqle);
		}
	}
	
	
	
	
	
	 public void conectarBD() {
		String host = "localhost";
		int puerto = 3306;
		String db = "empresajava";
		String url = "jdbc:mysql://" + host + ":" + puerto + "/" + db;
		String login = "root";
		String password = "root";

		
		try {
			
			conexion = DriverManager.getConnection(url, login, password);
			System.out.println((conexion != null) ? "CONEXION OK" : "CONEXION FALLIDA");
			/*if (conexion != null) {
				System.out.println("CONEXION OK");
			}else {
				System.out.println("CONEXION FALLIDA");
			}*/
			
		} catch (java.sql.SQLException sqle) {
			System.out.println("Error: " + sqle);
		}
	}
	 
	public List<Empleado> getEmpleados(){
		ArrayList<Empleado> listaEmpleado = new ArrayList<>();
		ResultSet rs;
		try {
	/*ResultSet*/ rs = conexion.prepareStatement("SELECT * FROM empleados").executeQuery();
			 while(rs.next()) {
				 Empleado emp = new Empleado(rs.getString("nombre"), rs.getString("apellidos"), rs.getString("dni"), rs.getDouble("sueldo"));
				 listaEmpleado.add(emp);
				 
			 }
				 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaEmpleado;
		
	}
	
	
	public boolean insertar(Empleado empleado) {
		try {
			PreparedStatement ps = conexion.prepareStatement("INSERT INTO empleados	(nombre, apellidos, dni, sueldo) VALUES (?, ?, ?, ?)");
			ps.setString(1, empleado.getNombre());
			ps.setString(2, empleado.getApellidos());
			ps.setString(3, empleado.getDni());
			ps.setDouble(4, empleado.getSueldo());
			
			ps.executeUpdate();
			ps.close();
			
			return true;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return false;
		}
	
		
	}
	
	public Empleado buscar(String dni) {	
		ResultSet rs;
		try {
			rs = conexion.prepareStatement("SELECT * FROM empleados").executeQuery();
			while(rs.next()) {
				if(rs.getString("dni").equals(dni)) {
					Empleado emp = new Empleado(rs.getString("nombre"), rs.getString("apellidos"), rs.getString("dni"), rs.getDouble("sueldo"));
					 
					return emp;
				}
			 }
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
		
	}
	
	 public boolean borrar(String dni) { 
		 try {
				
			 PreparedStatement ps = conexion.prepareStatement("DELETE FROM empleados WHERE dni = ? ");
			 ps.setString(1, dni);
			 ps.executeUpdate();
			
			 return true;
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return false; 
 
	 }
	
	 
	 public boolean actualizar(String dni , double sueldo) {
		 
		 try {
				
			 PreparedStatement ps = conexion.prepareStatement("UPDATE empleados SET sueldo = ? WHERE dni = ? ");
			 ps.setDouble(1, sueldo);
			 ps.setString(2, dni);      // En cada interrogante...
			 
			 ps.executeUpdate();
			
			 return true;
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			return false; 
		 
	 }


	

	
	
	
	
	 
	
	
}
