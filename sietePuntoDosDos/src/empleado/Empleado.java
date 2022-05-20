package empleado;



public class Empleado {
	
	private String dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private float sueldo;
//constructor normal
	public Empleado(String dni, String nombre, String apellido1, String apellido2, float sueldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.sueldo = sueldo;
	}
//constructor con un solo apellido, para el ingles
	public Empleado(String dni, String nombre, String apellido1, double sueldo) {		
		super();
	}
	
	
	
	public String toCSV() {
		return this.dni+" "+this.nombre+" "+this.apellido1+" "+this.apellido2+" "+this.sueldo;
	}
	
	

	
	
	public String getDni() {
		return dni;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	
	public float getSueldo() {
		return sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellido1 +" "+apellido2+ ", sueldo=" + sueldo + "]";
	}

	
	

}


