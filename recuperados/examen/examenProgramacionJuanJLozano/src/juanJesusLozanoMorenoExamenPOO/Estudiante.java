package juanJesusLozanoMorenoExamenPOO;

public class Estudiante extends Persona{
	
	
	
	public  Asignatura[] asignatura;

	Estudiante(String nombre, String dni, Asignatura[] asignatura) {
		super( nombre, dni);
		this.asignatura=asignatura;
	}
	
	public Asignatura[] getAsignatura() {
		return this.asignatura;
	}
	
	
	
	
	//antes tenia puesto el override y me ha obligado a quitarlo
	@Override
	public void  saludar()  {
		System.out.println("Hola");		
	}
	
	@Override
	public String toString() {
		String aux=("nombre del estudiante :"+this.getNombre());
	aux+=("dni del estudiante :"+this.getDni()+"\n"+
		"las asignaturas son"+this.asignatura);
	return aux;
			
	}
	
	
	

}
