package sietePuntoDos_UNO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class PrincipalEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		Empleado e01 = new Empleado ("1111M","Manolo","Martin","Macias",1200f);
		Empleado e02 = new Empleado ("2222G","Miguel","Mateo","Aleman",1250.5f);
		Empleado e03 = new Empleado ("3333K","Andres","Perez","Encina",1125.3f);
		Empleado e04 = new Empleado ("4444K","Andres","Perez","Encina",1125.3f);
		Empleado e05 = new Empleado ("5555","Andres","Perez","Encina",1125.3f);
		Empleado e06 = new Empleado ("6666","Anatonio","Antunez","Alcina",1025.3f);
		Empleado e07 = new Empleado ("7777","Angel","Torres","Gomez",1000f);
		Empleado e08 = new Empleado ("8888","Macario","Paredes","Marquez",1285.3f);
		Empleado e09 = new Empleado ( "9999","jesus","Lozano","Moreno", 1000f);

		
		

		
		
		
		
		
		
		

		/*
		 * conectamos con la base de datos, creamos un objeto conectaDo
		 */
		ConexionEmpleado conectaDO = new ConexionEmpleado();

		
		
		conectaDO.conectarBaseDatos();
		/*
		 * ***  1.- conectar
		 */
		
		
		conectaDO.getEmpleados();
		/*
		 * ***  2.- insertar datos
		 * 
		 */
		
		
		conectaDO.insertar(e01);
		conectaDO.insertar(e08);
		conectaDO.insertar(e07);
		conectaDO.insertar(e06);
		conectaDO.insertar(e05);
		conectaDO.insertar(e04);
		conectaDO.insertar(e03);
		conectaDO.insertar(e02);
		conectaDO.insertar(e09);
		
		/*
		 * *** 3.- buscar		 
		 */
		
		conectaDO.consultar2("select * from empleados where nombre='Angel'");//******funciona
		conectaDO.buscarEmpleadoPorDni("5555");
		conectaDO.buscarPorDni("6666");//****tambien funciona
		conectaDO.consultar("select * from empleados where dni='1111'");
		
		/*
		 * *** 4 .- borrar		 
		 */
		conectaDO.borrar("1111");
		
		
		
		/*
		 * *** 5.- actualizar		 * 
		 */
		conectaDO.actualizar("6666",2200f);
		conectaDO.ejecutar("select * from empleado where sueldo='2200f'");
		conectaDO.buscarEmpleadoPorDni("2222");
		
		
		/*
		 * 
		 * ***  borrar datos de la tabla
		 */
		
		
		//conectaDO.ejecutar("delete from empleados ");
		
		
		
		

	}

}
