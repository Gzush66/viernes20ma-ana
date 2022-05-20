package seispuntoUnoUno;

import java.util.ArrayList;

public class Profesor extends Personal{

	public static final int MAX=5;
	private ArrayList<Asignatura>arrayAsignatura= new ArrayList<Asignatura>();
	
	public Profesor(String nombre, String dni, int salario) {
		super(nombre,dni,salario);				
	}	

	public void asignarAsignatura (Asignatura asignatura) {
		if (arrayAsignatura.size()<MAX) {
			arrayAsignatura.add(asignatura);
		}
	}
	public int getNumeroAsignaturas ( ) {
	return	arrayAsignatura.size();
	}
	
	public Asignatura getAsignatura(int index) {
		return arrayAsignatura.get(index);
	}
		
	
	@Override
	public String toString() {
		String aux = ("\nEl nombre del profesor es " + 
				this.nombre + ", \nsu DNI es " + 
				this.dni + ", \nsu salario es de " + 
				this.getSalario() + "\nImparte:\n");
		for(int i = 0; i < (arrayAsignatura.size()); i++) {
			aux+= i+") "+arrayAsignatura.get(i);      
			aux = aux.concat("\n");
		}
		return aux;
	}
}

	

	
		
	
		
		
		
		
		
		
			
		