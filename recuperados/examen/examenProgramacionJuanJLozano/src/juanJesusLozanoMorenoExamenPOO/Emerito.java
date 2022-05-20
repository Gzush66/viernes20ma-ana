package juanJesusLozanoMorenoExamenPOO;

public class Emerito extends Profesor implements Conferenciante {
	/*
	 * private String nombre; private String dni; private float salario;
	 */

	Emerito(String nombre, String dni, int salario, Asignatura codigo, Asignatura titulo) {
		super(nombre, dni, salario, codigo, titulo);
	}

	array[] doyclase = new array[];

	public void designarAsignatura () {
		for (int i=0;i<3;i++) {
			array[i]doyclase=new array[Asignatura.titulo] ;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public float getSalario() {
		return salario;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public void saludar() {
		System.out.println("Buenos dias");
	}

	@Override
	public void charlar() {
		System.out.println("Voy a dar una conferencia sobre: " + Asignatura.titulo + " y sobre la otra asignatura "
				+ Asignatura.titulo);

	}

}
