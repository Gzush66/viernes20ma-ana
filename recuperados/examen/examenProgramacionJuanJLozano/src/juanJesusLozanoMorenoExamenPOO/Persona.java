package juanJesusLozanoMorenoExamenPOO;

public abstract class Persona {
	
	 protected String nombre;
	 protected String dni;
	
	public  Persona(String nombre, String dni){
		 this.nombre=nombre;
		 this.dni=dni;
	 }
	
	
	public String getNombre() {
		return nombre;
	}

	public String getDni() {
		return dni;
	}

	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	
	abstract void saludar();
	
	

}
