package departamento;

public class PrincipalDepartamento {

	

		public static void main(String[] args) {
			
			/*probar a cambiar el orden de creacion de los
			 * 4 objetos para que se siga conservando 
			 * la consistencia (que los datos aparezcan 
			 * correctos tanto en Empleados como en Departamentos) 
			 */
			
			
			
			//le pasamos null como director xq todavia no hay ningún
			//empleado creado
			Departamento fol = new Departamento("FOL", null);
			Empleado elon = new Empleado("Elon Musk", fol);
			
			/*
			Tiene que haber consistencia en los datos:
			Si creo un Empleado con un departamento entonces 
			tengo que actualizar manualmente la info en el otro
			sentido: asigno al departamento ese empleado
			y en este caso lo asigno tambien como director 
			*/
			fol.setEmpleado(elon);
			fol.setDirector(elon);
			
			Departamento infor = new Departamento("Informática", elon);
			
			
			Empleado steve = new Empleado("Steve Wozniak", infor);
			//para que haya consistencia de info entre ambas clases
			//tengo que actualizar infor manualmente
			infor.setEmpleado(steve);
			
		//	System.out.println(infor);
		//	System.out.println(fol);
		//	System.out.println(elon);
		//	System.out.println(steve);
			
			
			//estas tres son la misma forma de recurrir a una posicion de memoria imprimien lo mismo
			
		//	System.out.println( fol.getEmpleado() );
		//	System.out.println( fol.getDirector() );					
		//	System.out.println( elon.getDepartamento().getEmpleado() );
			
			
		}

	}
