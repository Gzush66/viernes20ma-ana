package ejercicioCincoPuntoCuatro;

public class Reptil extends AnimalSalvaje {

	private TamañoEscama escama;

	public Reptil(String name, OrdenAnimal tipo, float weight, boolean bipedo, int clean, TamañoEscama escama) {
		super(name, tipo, weight, bipedo, clean);
		this.escama = escama;

	}

	
	
	public void aseo() {
		System.out.println(this.clean);
		if (this.escama.equals(TamañoEscama.GRANDE)) {
			clean = clean + 2;
		}
		if (this.escama.equals(TamañoEscama.PEQUEÑA)) {
			clean = clean + 1;
		}
		System.out.println(this.clean);
	}

}
