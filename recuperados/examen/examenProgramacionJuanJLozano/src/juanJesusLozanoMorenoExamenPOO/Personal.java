package juanJesusLozanoMorenoExamenPOO;

public class Personal extends Persona {

	
	protected int salario;
	public static int salarioMinimo=10000;
	

	
	

	Personal(String nombre,String dni,int salario,int salarioMinimo){
		super( nombre,dni);
		this.salario=salario;	
		if(salario<10000)
		{
			salario = salarioMinimo;
		}
					
	}

	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	public int getSalario() {
		return salario;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setSalario(int salario) {
		this.salario = salario;
			}
	
		@Override
			public void saludar() {
			System.out.println("Buenos dias");	
			}

}
