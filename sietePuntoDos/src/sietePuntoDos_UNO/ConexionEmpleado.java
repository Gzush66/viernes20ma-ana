package sietePuntoDos_UNO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class ConexionEmpleado {

	// SHOW VARIABLES WHERE VARIABLE_NAME IN('HOSTNAME', 'PORT'), PARA AVERIGUAR
	// PUERTOS EN SQL

	Scanner sc = new Scanner(System.in);
	private Connection con;

	List<Empleado> empleados = new ArrayList<Empleado>();

	public void conectarBaseDatos() {
		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/empleados", "root", "");
			System.out.println((con != null) ? "CONEXION OK" : "CONEXION FALLIDA");
		} catch (java.sql.SQLException sqle) {
			System.out.println("Error: " + sqle);
		}

	}

	public void insertar(Empleado empleado) {
		
		try {
			PreparedStatement ps;
			String sql;
			sql = "insert into empleados(dni,nombre,apellido1,apellido2,sueldo) values(?,?,?,?,?)";
			ps = con.prepareStatement(sql);
			ps.setString(1, empleado.getDni());
			ps.setString(2, empleado.getNombre());
			ps.setString(3, empleado.getApellido1());
			ps.setString(4, empleado.getApellido2());
			ps.setFloat(5, empleado.getSueldo());
			ps.executeUpdate();
			JOptionPane.showMessageDialog(null, "Se han insertado los datos");
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error de conexión:" + e.getMessage());
		}
	}
	
	
	
	
	public List<Empleado>getEmpleados (){
		ArrayList<Empleado>listaEmpleado = new ArrayList <>();
		
		try {
			ResultSet rs;
			rs=con.prepareStatement("Select * from empleados").executeQuery();
			while (rs.next()) {
				Empleado emp = new Empleado (rs.getString("dni"),rs.getString("nombre")
						,rs.getString("apellido1"), rs.getString("apellido2"),rs.getFloat("sueldo"));
				listaEmpleado.add(emp);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return listaEmpleado;
	}

	

	public void consultar(String consulta) {// la consulta habra de ser una sentencia sql
		
		try {
			PreparedStatement sentenciaConsulta = con.prepareStatement(consulta);
			ResultSet rs;
			rs = sentenciaConsulta.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("dni") + " " + rs.getString("nombre") + " " + rs.getString("apellido1")
						+ "  " + rs.getString("apellido2") + "  " + rs.getFloat("sueldo"));

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void buscarPorDni(String dni) {
		try {
			// String consulta = "SELECT * FROM empleados where dni=? ";
			PreparedStatement stmt = con.prepareStatement("SELECT * FROM empleados where dni=? ");
			stmt.setString(1, dni);
			ResultSet rs;
			rs = stmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("dni") + " " + rs.getString("nombre") + " " + rs.getString("apellido1")
						+ "  " + rs.getString("apellido2") + "  " + rs.getFloat("sueldo"));

			}

			rs.close();
			stmt.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
	public void buscarEmpleadoPorDni(String dni) {
		
		try {
			System.out.println("busquemos empleado por dni");
			ResultSet rs;

			PreparedStatement consulta = con.prepareStatement("select * from empleados where dni=?");
			consulta.setString(1, dni);

			rs = consulta.executeQuery();
			while (rs.next()) {
				System.out.println("las coincidencias son :");
				System.out.println(rs.getString("dni") + " " + rs.getString("nombre") + " " + rs.getString("apellido1")
						+ "  " + rs.getString("apellido2") + "  " + rs.getFloat("sueldo"));

			}
		} catch (Exception e) {

		}

	}

	
	
	
	public ResultSet consultar2(String consulta) {
		System.out.println("Realizamos una consulta");
		ResultSet rs;
		try {
			PreparedStatement sentencia = con.prepareStatement(consulta);
			rs = sentencia.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getString("dni") + " " + rs.getString("nombre") + " " + rs.getString("apellido1")
				+ "  " + rs.getString("apellido2") + "  " + rs.getFloat("sueldo"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return rs;
	}

	
	
	
	public boolean ejecutar (String sentencia) {
		 try {
	    	  PreparedStatement ps = con.prepareStatement(sentencia);
	    	 	
	    	 ps.executeUpdate();
	    	  	       
	    	  	        System.out.println("sentencia ejecutada");
	    	  	        return true;
	    } catch (Exception ex) {
	        System.out.println(ex.toString());
	        return false;
	    }
	}
	
	
	
	
	 
	public boolean borrar(String dni) {
	    
	  
	    try {
	    	  PreparedStatement ps = con.prepareStatement("delete  from empleados where dni=?");
	    	  ps.setString(1, dni);	
	    	 ps.executeUpdate();
	    	  	       
	    	  	        System.out.println("elemento borrado");
	    	  	        return true;
	    } catch (Exception ex) {
	        System.out.println(ex.toString());
	        return false;
	    }
	}

	
	
	
	

	public boolean actualizar(String dni, float sueldo) {
		
		try {
			
			PreparedStatement ps = con.prepareStatement("UPDATE EMPLEADOS SET SUELDO=? WHERE DNI=?");
			ps.setFloat(1, sueldo);
			ps.setString(2, dni);
			ps.executeUpdate();
			
			ResultSet rs=ps.executeQuery();
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

}
