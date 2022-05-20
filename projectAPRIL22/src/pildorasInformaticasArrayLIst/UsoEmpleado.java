package pildorasInformaticasArrayLIst;

import java.util.ArrayList;

public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado listaEmpleados[]=new Empleado[3];
		listaEmpleados[0]=new Empleado("Ana",45,2500);
		listaEmpleados[1]=new Empleado("Antonio",55,2000.23);
		listaEmpleados[2]=new Empleado("Maria",25,2600);*/
		
		ArrayList<Empleado>listaEmpleados=new ArrayList<Empleado>();
		listaEmpleados.add(new Empleado("Ana",45,2500));
		listaEmpleados.add(new Empleado("Antonio",55,2000));
		listaEmpleados.add(new Empleado("Ana",45,2500));
		listaEmpleados.add(new Empleado("Maria",25,2600));
		listaEmpleados.add(new Empleado("Marta",45,2900));
		listaEmpleados.add(new Empleado("Carlos",41,1200));
		listaEmpleados.trimToSize();
		listaEmpleados.add(new Empleado("Angra",454,2500));
		listaEmpleados.add(new Empleado("Antodfnio",55,20200));
		listaEmpleados.add(new Empleado("Añlpna",45,2500));
		
		System.out.println("el array list tiene "+listaEmpleados.size()+"  componentes");
		
		for (Empleado e : listaEmpleados) {
			System.out.println(e.dameDatos());
		}

	}

}
