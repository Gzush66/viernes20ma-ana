package pildorasSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ModificaBBDD {

	public static void main(String[] args) {
		try {
			//1.-creo conexion
			Connection miConexion=DriverManager.getConnection("jdbc:mysql://localhost:1521/empleados","jesus","jesus");
			//2.-creo el Statement
			Statement miStatement = miConexion.createStatement();
			// DEPENDIENDO DE QUE QUERAMOS ASI SELECCIONAMOS EL STRING
			// INSERTAR DATOS, CREO UN STRING CON LA INSTRUCCION EN SQL PARA INTRODUCIR VALOR
			String instruccionSql = "INSERT INTO EMPLEADOS (dni,nombre,apellido1,apellido2,sueldo) values ('0011','Abenamar','Gomez','Lindo',1350.50)";
			// ACTUALIZAR DATOS, CREO UN STRING CON UN UPDATE
			String instruccionSql1 = "UPDATE empleados SET SUELDO=SUELDO+250 WHERE SUELDO<2000";
			// ELIMINAR DATOS, CREO UN DELETE
			String instruccionSql2 = "Delete from empleados where nombre = 'Abenamar'";
			
			miStatement.executeUpdate(instruccionSql);
			System.out.println("datos insertados correctamente");
			
			
			
		}catch (Exception e) {
			//si hubiese un error en la conexion imprimo un mensaje de error
			System.out.println("Parece que hay un erro, no conecta !!!");
			e.printStackTrace();			
			}		
	}
}
