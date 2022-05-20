/*package sietePuntoDos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class ConexionBDEmpleados {

	private Connection conexion;

	public void conectarBD() {
		String host = "localhost";
		int puerto = 3306;
		String db = "BaseDatosEmpleado";
		String url = "jdbc:mysql://" + host + ":" + puerto + "/" + db;
		String login = "root";
		String password = "";

		try {
			
			conexion = DriverManager.getConnection(url, login, password);
			System.out.println((conexion != null) ? "CONEXION OK" : "CONEXION FALLIDA");			
			
		} catch (java.sql.SQLException sqle) {
			System.out.println("Error: " + sqle);
		}
	}

	public ResultSet consultar(String consulta) {
		ResultSet resultado;
		try {
			PreparedStatement sentencia = conexion.prepareStatement(consulta);
			resultado = sentencia.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
		return resultado;
	}

	public boolean ejecutar(String cambio) {
		try {
			PreparedStatement sentencia = conexion.prepareStatement(cambio);
			int totalRows = sentencia.executeUpdate(); // devuelve el n�mero de tuplas modificadas
			System.out.println("Se han modificado: " + totalRows + " tuplas");
			sentencia.close();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public void imprimirResultado(ResultSet resultado) {
		try {
			System.out.println("\nNOMBRE\tID");
			System.out.println("--------------------------------");
			while (resultado.next()) {
				System.out.println(resultado.getString("nombre")+ "\t" +
						+ resultado.getInt("id") + "\t" + resultado.getString ("dni")+ resultado.getString("sueldo"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}*/