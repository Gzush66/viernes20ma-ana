package juanAntoSieteDos;

public class Empleado {

	private String dni;
	private String nombre;
	private String apellidos;
	
	private float sueldo;

//constructor normal
	public Empleado(String dni, String nombre, String apellidos,  float sueldo) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		
		this.sueldo = sueldo;
	}

//constructor con un solo apellido, para el ingles
	public Empleado(String dni, String nombre, String apellido1, double sueldo) {
		super();
	}

	public String toCSV() {
		return this.dni + " " + this.nombre + " " + this.apellidos + " "  + this.sueldo;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	
	/**
	 * @return the sueldo
	 */
	public float getSueldo() {
		return sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + " " 
				+ ", sueldo=" + sueldo + "]";
	}

}
