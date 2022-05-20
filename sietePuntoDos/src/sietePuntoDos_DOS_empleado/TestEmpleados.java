package sietePuntoDos_DOS_empleado;


import persistencia.EmpleadoDAOBaseDatos;

public class TestEmpleados {

	public static void main(String[] args) {
		
		TestEmpleados testerPaco = new TestEmpleados ();
		GestionEmpleados gestor = new GestionEmpleados();
		EmpleadoDAOBaseDatos empleadoDAOmanolo = new EmpleadoDAOBaseDatos() ;
		
		
		
		
		Empleado emp01 = new Empleado("123456789A", "Antonio", "Rodríguez", "Antúnez", 1200.0f);
		Empleado emp02 = new Empleado("234567890B", "Pedro", "Sánchez"," Gutiérrez", 1500.0f);
		Empleado emp03 = new Empleado("345678901C", " Dolores"," Rubio" ,"Delgado ",1100.0f);
		
		
		
		Empleado emp04 = new Empleado("6666","Anatonio","Antunez","Alcina",1025.3f);
		Empleado emp05 = new Empleado("8888","Macario","Paredes","Marquez",1285.3f);
		Empleado emp06 = new Empleado( "9999","jesus","Lozano","Moreno", 1000f);
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
		 * el objeto gestor procede de la clase GestionEmpleados, y se hace cargo de todos 
		 * los metodos que se han declarado en dicha clase
		 */
		gestor.conectar();
		gestor.nuevoEmpleado(emp01);
		gestor.nuevoEmpleado(emp02);
		gestor.nuevoEmpleado(emp03);
		
		/*
		 * el objeto empleadoDAOmanolo procede de la clase EmpleadoDAOBaseDatos, y puede perfectamente
		 * hacer funcionar los metodos que se han declarado en su clase
		 * Pero esos mismos metodos se han usado como base para la clase GestionEmpleados, asi que
		 * sera Gestor quien los dirija
		 * 
		 * de igual forma pudiera haber una clase NominasDAOBaseDatos, que llevara las nominas, y habria un objeto 
		 * de esa clase que puediera manejar los metodos que hubiese en dicha clase
		 * 
		 * pero seguiria siendo gestor  capaz de manejar a las dos clases la de empleados y la de nominas
		 * 
		 * es notorio el avance, aunque se ha tardado en llegar a ese conocimiento
		 * 
		 * 
		 * 
		 * 
		 */
		/*
		 * 
		 // es por lo que estos procedimientos lo hace gestor
		  * 
				empleadoDAOmanolo.conectarConBaseDatos();
				empleadoDAOmanolo.insertarEmpleado(emp01);
				empleadoDAOmanolo.insertarEmpleado(emp02);
		
		*/
		
		
	
		
		/*
		 * 
		 */
		
		
		gestor.getEmpleados();
		
		/*
		 * 
		 */
		gestor.imprimirconFOREmpleados();
		
		/*
		 * 2. 	Insertar el empleado "Juan Pérez García, 456789012D, 1800€"
				Comprueba que se ha insertado en la base de datos.
		 */
		gestor.insertarPidiendoDatos();
		
		
		Empleado otroMas = new Empleado (" 456789012D","Juan"," Pérez"," García", 1800f);
		gestor.insertarEmpleado(otroMas);
		
		
		gestor.getEmpleadopcionTeDoyDNi("456789012D");	//comprobamos si se ha añadido
	
	/*
	 * 3.	 Elimina el empleado con DNI "123456789A"
			Comprueba que ha sido eliminado
				 */
		
		gestor.borrarPorDni("123456789A");
		
		gestor.getEmpleadopcionTeDoyDNi("987654321Z");
		
		
		
		
		/*
		 * 4. Elimina el empleado con DNI "987654321Z"
Comprueba que no se ha realizado la operación (false)
		 */
		gestor.borrarPorDni("987654321Z");
		
		
		
		/*
		 * 5. 		Modifica el sueldo del empleado con DNI "456789012D" para que sea de 2100€.
					Comprueba que ha sido modificado en la base de datos.
		 * 
		 */
		
		gestor.modificarSueldo("456789012D",2100f);
		
		
	}
}
