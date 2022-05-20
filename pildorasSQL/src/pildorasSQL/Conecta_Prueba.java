package pildorasSQL;
import java.sql.*;

public class Conecta_Prueba {

	public static void main(String[] args) {
		// SIGUIENDO LAS INSTRUCCIONES DEL VIDEO REALIZAMOS LA CONEXION A UNA BASE DATOS EN MYSQL LLAMADA PRODUCTOS, 
		// CON UNAS COLUMNAS NOMBRE ARTICULO,CODIGOARTICULO Y PRECIO
		
		//crear la conexion, la creamos dentro del try
		
		try {
			//1.-CREAR LA CONEXION
			Connection miConexion=DriverManager.getConnection("jdbd:mysql://localhost:3306/pruebas","root","");
			//2.-CREAR OBJETO STATEMENT
			Statement miStatement=miConexion.createStatement();
			//3.-EJECUTAR
			ResultSet miResultSet =miStatement.executeQuery("SELECT * FROM PRODUCTOS");//LE HACEMOS UNA CONSULTA SQL
			//4.-RECORRER EL RESULTSET, LEERLO
			while(miResultSet.next()) {//mientras haya un registro mas de mis resultados
				System.out.println(miResultSet.getString("NOMBREARTICULO")+" "+miResultSet.getString("CODIGOARTICULO")
				+" "+miResultSet.getString("PRECIO"));
			}
			
			
			
			
		}catch(Exception e) {
			//si hubiese un error en la conexion imprime este mensaje de error
			System.out.println("No conecta !!!");
			e.printStackTrace();
			
			
		}

	}

}
