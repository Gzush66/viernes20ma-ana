package pildorasSQL;
import java.sql.*;


public class ConsultaPreparada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			//1.crear la conexion
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:1521/empleados","jesus","jesus");
			//2. preparar consulta sql, insertando los parametros
			PreparedStatement miSentencia = miConexion.prepareStatement("Select nombre,apellido1,apellido2 from empleados"+
			"where dni= ? AND NOMBRE = ?");
			//3.ESTABLECER LOS PARAMETROS DE CONSULTA
			miSentencia.setDouble(1,2000); // para la primera interrrogacion, el primer parametro
			miSentencia.setString(2,"Abenamar"); // para el segundo parametro
			//4.EJECUTAR Y RECORRER LA CONSULTA
			ResultSet rs = miSentencia.executeQuery();//crea una tabla donde se almacenan los resultados de la consulta sql
			while(rs.next()) {
				System.out.println(rs.getString(1) +" "+ rs.getString(2) +" "+ rs.getString(3) +" "+ rs.getDouble(4));
			}
			rs.close();//se ha recorrido, borramos de la memoria la tabla con los resultados
			
			
			
			
			// 5 vamos a reutilizar el codigo para mas consultas, solo habremos de cambiar los campos
			
			System.out.println();
			System.out.println("ejecucion de segunda consulta\n");
			miSentencia.setDouble(1,1120); // para la primera interrrogacion, el primer parametro
			miSentencia.setString(2,"Jose"); // para el segundo parametro			
			//4.EJECUTAR Y RECORRER LA CONSULTA
			 rs = miSentencia.executeQuery();//crea una tabla donde se almacenan los resultados de la consulta sql
			while(rs.next()) {
				System.out.println(rs.getString(1) +" "+ rs.getString(2) +" "+ rs.getString(3) +" "+ rs.getDouble(4));
			}
			rs.close();
		
		
		
		}catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
