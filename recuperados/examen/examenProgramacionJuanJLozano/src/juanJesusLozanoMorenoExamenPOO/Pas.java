package juanJesusLozanoMorenoExamenPOO;

public class Pas extends Personal {
	
	private String nombre;
	private String dni;
	private float salario;
	Especialidad esecialidad;
	
	Pas(String nombre,String dni,int salario,Especialidad especialidad){
		super(nombre,dni, salario);	
		this.esecialidad=especialidad;
	}
	
	public String getNombre () {
		return nombre;
	}
	public String getDni() {
		return dni;
	}
	public float getSalario() {
		return salario;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public void setDni (String dni) {
		this.dni=dni;
	}
	public void setSalario(float salario) {
		this.salario=salario;
	}
	
	@Override
	public void  saludar()  {
		System.out.println("Buenos dias");
		
	}
	

}
