package departamentoUML;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Departamento fol = new Departamento ("fol" , null);
		Empleado elon = new Empleado ("Elon Musk", fol);
		
		// para que haya consistencia  tengo que actualizar fol
		// tengo que actualizar fol manualmente
		fol.setEmpleado(elon);
		
		
		Departamento infor = new Departamento ("informatica" , elon);
		
		
		Empleado steve = new Empleado ("steve Wozniak", infor);
		// para que haya consistencia  tengo que actualizar fol
				// tengo que actualizar fol manualmente
		
		infor.setEmpleado(steve);
		
	
		
		System.out.println(infor);
		
	
		
		System.out.println(fol);
		
		System.out.println(elon);
		
		System.out.println(steve);
		
		

	}

}
