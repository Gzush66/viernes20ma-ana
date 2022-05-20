package sietePuntoDos_DOS;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.List;
import java.util.Objects;

public class Empleado {

	private String dni;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private double sueldo;
//constructor normal
	public Empleado(String dni, String nombre, String apellido1, String apellido2, double sueldo) {
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

	public String getApellido1() {
		return apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	/**
	 * @return the sueldo
	 */
	public double getSueldo() {
		return sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellido1 +" "+apellido2+ ", sueldo=" + sueldo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(apellido1,apellido2, dni, nombre, sueldo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return Objects.equals(apellido1, other.apellido2) && Objects.equals(dni, other.dni)
				&& Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(sueldo) == Double.doubleToLongBits(other.sueldo);
	}

}
