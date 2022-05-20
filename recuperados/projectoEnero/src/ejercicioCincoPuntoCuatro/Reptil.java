package ejercicioCincoPuntoCuatro;

public class Reptil extends AnimalSalvaje {

	private Tama�oEscama escama;

	public Reptil(String name, OrdenAnimal tipo, float weight, boolean bipedo, int clean, Tama�oEscama escama) {
		super(name, tipo, weight, bipedo, clean);
		this.escama = escama;

	}

	
	
	public void aseo() {
		System.out.println(this.clean);
		if (this.escama.equals(Tama�oEscama.GRANDE)) {
			clean = clean + 2;
		}
		if (this.escama.equals(Tama�oEscama.PEQUE�A)) {
			clean = clean + 1;
		}
		System.out.println(this.clean);
	}

}
