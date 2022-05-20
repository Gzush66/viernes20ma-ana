package juanJesusLozanoMorenoExamenPOO;

import java.util.ArrayList;

public class Profesor extends Personal {
	
	
	//private final static int NUM_ASIG_PROF = 3;


	ArrayList<String> asignatura=new ArrayList<String>();
	

	public Profesor(String nombre, String dni, String salario) {
		this(nombre, dni, salario);
	}

	public Asignatura getAsignatura(int index) {
		return this.asignatura[index];
	}

	public void setAsignatura(Asignatura asignatura, int index) {
		this.asignatura[index] = asignatura;
	}

	public void impartir(Asignatura titulo, Asignatura codigo) {

	}

	@Override
	public void saludar() {
		System.out.println("Buenos dias");
	}

	@Override
	public String toString() {
		String aux = ("\n El nombre del profesor es" + this.nombre + ",\n su DNI ES" + this.dni + "\n su salario es de "
				+ this.getSalario() + "\n Imparte :\n");
		for (int i = 0; i < (asignaturas.length); i++) {
			aux += i + ")" + asignaturas[i];
			aux = aux.concat("\n");
		}
		return aux;
	}

}
