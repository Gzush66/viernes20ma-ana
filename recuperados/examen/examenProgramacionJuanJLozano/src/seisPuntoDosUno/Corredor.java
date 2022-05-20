package seisPuntoDos;

public class Corredor {

	private Integer dorsal;
	private String nombre;

	public Corredor(Integer dorsal, String nombre) {
		this.dorsal = dorsal;
		this.nombre = nombre;
		
	}

	public Integer getDorsal() {
		return dorsal;
	}

	public void setDorsal(Integer dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		String aux = ("\nEl nombre del corredor  es " + this.nombre + ", \n y corre con el dorsal : " + this.dorsal);
		return aux;
	}

}
