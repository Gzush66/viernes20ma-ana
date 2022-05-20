package seispuntoUnoUno;

import java.util.ArrayList;

public class Estudiante extends Persona{
	
	ArrayList<Asignatura>arrayAsignatura= new ArrayList<Asignatura>();
	
	
	Estudiante(String nombre, String dni) {
		super( nombre, dni);		
	}
	
	public void asignarAsignatura (Asignatura asignatura) {
		arrayAsignatura.add(asignatura);
		
	}
	public int getNumeroAsignaturas ( ) {
	return	arrayAsignatura.size();
	}
	
	public Asignatura getAsignatura(int index) {
		return arrayAsignatura.get(index);
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
		"las asignaturas son");
		for(int i = 0; i < (arrayAsignatura.size()); i++) {
			aux+= i+") "+arrayAsignatura.get(i);      
			aux = aux.concat("\n");
		}
	return aux;
			
	}
	
	
	

}
