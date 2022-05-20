package ejercicioCincoPuntoCuatro;

public class Mamifero extends AnimalSalvaje implements Herbivoro {

	private Pelo pelo;

	public Mamifero(String name, OrdenAnimal tipo, float weight, boolean bipedo, int clean, Pelo pelo) {

		super(name, tipo, weight, bipedo, clean);
		this.pelo = pelo;
	}

	@Override
	public void aseo() {

		System.out.println(this.clean);
		if (this.pelo.getLargo().equals(LongitudPelo.LARGO)) {
			clean = clean + 1;
		}
		if (LongitudPelo.CORTO == this.pelo.getLargo()) {
			clean = clean + 2;
		}
		if (LongitudPelo.SINPELO == this.pelo.getLargo()) {
			clean = clean + 3;
		}
		System.out.println(this.clean);
	}

	// quizas seria mejor poner atacar en el padre AnimalSalvaje
	// con todo lo que conlleva, hay que trasladar esos atributos alli tambien

	@Override
	public void escarbar() {
		if (this.pelo.getLargo().equals(LongitudPelo.LARGO)) {
			clean = clean + 3;
		}
		if (this.pelo.getLargo().equals(LongitudPelo.CORTO)) {
			clean = clean + 2;
		}
		if (this.pelo.getLargo().equals(LongitudPelo.SINPELO)) {
			clean = clean + 1;
		}
	}

}
