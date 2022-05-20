package sietePuntoDos_ProbandoUNO;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalEmpleadoDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		

		List <Employee>getEmpleados= new ArrayList <Employee>();
		
		Employee e1 = new Employee("0010","Manuel","Gomez","Lindo",1350.50);
		Employee e2 = new Employee("0011","Abenamar","Gomez","Lindo",1350.50);
		Employee e3 = new Employee("0012", "Maria ","Bermudez","Castro",1475.75);
		Employee e4 = new Employee ("1246","Marcelo","Arias","Cañete",1113.25);
		Employee e5 = new Employee ("5246","Hellen ","Smith","Muñoz",894.90);
		Employee e6 = new Employee ("7556","Willian","Taylor","Muñoz",1540.05);
		Employee e7 = new Employee ("7120","Jose  ","Iglesias","Sanchez",1980);
		Employee e8 = new Employee ("5512","Ignacio","Millan","Grass",2125.30);
		Employee e9 = new Employee ("7556","William","Wallace","Ortiz",875.25);
		
		
		getEmpleados.add(e8);
		getEmpleados.add(e7);
		getEmpleados.add(e6);
		getEmpleados.add(e5);
		getEmpleados.add(e4);
		getEmpleados.add(e3);
		getEmpleados.add(e2);
		getEmpleados.add(e1);
		getEmpleados.add(e9);
		
		
		/*
		 * List<Empleado> getEmpleados(): consulta la lista completa de empleados y la devuelve
		 */
		
		for (Employee i:getEmpleados) {
			System.out.println("\tDni : "+i.getDni()+"\tNombre : "+i.getNombre()+"\t\tApellidos : "
		+i.getApellido1()+" "+ i.getApellido2());
		}
		
		
		Connexion_Empleados conectaDo= new Connexion_Empleados ();
		
		conectaDo.conectarConBaseDatos();
		
		/*
		 * boolean insertar(Empleado empleado): inserta un empleado en la base de datos y devuelve true si se
consiguió insertar.
		 */
		conectaDo.insertarDatos();
		
		/*
		 * Empleado buscar(String dni): devuelve un empleado a partir de su DNI, buscándolo en la base de datos, o
null si no lo encuentra.
		 */
		System.out.println("Que dni quiere buscar?Introduzca DNI :");
		
		conectaDo.buscarEmpleadoPorDni(sc.nextLine());
		
		/*
		 * boolean borrar(String dni): borra un empleado a partir de su DNI devolviendo true, o false si no es posible.
		 */
		System.out.println("Introduzca el DNI a borrar :");
		conectaDo.borrar(sc.nextLine());
		
		/*
		 * boolean actualizar(String dni , double sueldo): modifica el sueldo de un empleado y devuelve true, o false si
no es posible.	
		 */
		System.out.println("A que empleado quiere modificar el sueldo, indroduzca su DNI :");
		String idToModify=sc.nextLine();
		System.out.println("Introduzca el incremento que quiere modificar :");
		Double increase = sc.nextDouble();
		conectaDo.actualizar(idToModify,increase);
		
			
		}
}
		
		
		
		
		


