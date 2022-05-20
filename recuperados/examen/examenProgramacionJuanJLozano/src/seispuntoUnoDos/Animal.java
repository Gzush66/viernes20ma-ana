package seispuntoUnoDos;

public class Animal implements Comparable<Animal> {
	private String especie;
	private String nombre;

	public Animal(String nombre, String especie) {
		this.nombre = nombre;
		this.especie = especie;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int compareTo(Animal animal) {
		return this.nombre.compareTo(animal.getNombre());
	}

	@Override
	public String toString() {
		String aux = ("\nEl nombre del animal  es " + this.nombre + ", \n y es un : " + this.especie);
		return aux;
	}

}
