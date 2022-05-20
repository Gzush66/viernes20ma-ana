package departamentoUML;

public class Departamento {
	
	
	private String nombre;
	
	private Empleado empleado;
	private Empleado director;
	
	
	
	
	public Departamento (String nombre , Empleado director) {
	this.nombre= nombre;
	this.empleado = null;
	this.director = director;
	}
	
	
	@Override
	public String toString() {
		String nombreDir = "<vacio>";
		if (this.director != null) {
			nombreDir = this.director.getNombre();
		}
		String aux = (".....................");
		aux = aux.concat("\n DEPARTAMENTO:  "+this.nombre);
		aux = aux.concat("\n Empleado:  "+this.empleado);
		aux = aux.concat("\n Director:  "+nombreDir);
		aux = aux.concat("\n");
		return aux;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	} 
	public void setEmpleado(Empleado empleado) {
		this.empleado=empleado;
	}
	
	public void setDirector(Empleado empleado) {
		this.empleado= director;	
	}
	
	
	public String getNombre() {
		return this.nombre;
	}
	public Empleado    getEmpleado(Empleado empleado) {
		return this.empleado;
	}
	public Empleado getDirector (Empleado empleado) {
		return this.director;
	}
}
