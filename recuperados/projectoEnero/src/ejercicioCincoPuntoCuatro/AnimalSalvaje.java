package ejercicioCincoPuntoCuatro;

public abstract class AnimalSalvaje implements Carnivoro {

	protected OrdenAnimal tipo; // carnivoro o herbivoro
	protected String name; // nombre del animal
	protected float weight; // peso
	protected boolean bipedo = false; // lo considero cuadrupedo

	protected int vital = 10; // partimos de maxima vitalidad
	protected int clean = 4; // partimos de maxima limpieza

	public AnimalSalvaje(String name, OrdenAnimal tipo, float weight, boolean bipedo, int clean) {
		this.tipo = tipo;
		this.name = name;
		this.weight = weight;
		this.bipedo = bipedo; // si false=cuadrupedo
		this.clean = clean;
		this.vital = 10;
	}

	public void dormir() {
		if ((this.vital >= 2)) {
			System.out.println("...zZzzZzZzZz...");
		}
	}

	public void nutrir() {
		if ((this.vital) >= 5) {
			System.out.println("...ñam.ñam.ñam...");
		}
	}

	public void atacar(AnimalSalvaje presa) {
		if (this.tipo.equals(OrdenAnimal.CARNIVORO)) {
			System.out.println("\n" + this.name + " ha atacado a " + presa.name);
			System.out.println(this.name + " tiene de vida inicial  " + this.vital
					+ "  y de limpieza inicial esta con nivel :" + this.clean);
			System.out.println(presa.name + " tiene de vida inicial  " + presa.vital
					+ "  y de limpieza inicial tiene nivel : " + presa.clean);

			if (this.weight > (presa.weight) * 4) {
				presa.vital = 0;
				this.clean = this.clean - 1;
				presa.clean = presa.clean - 1;
			} else if (this.weight > (presa.weight) * 2) {
				presa.vital = presa.vital - 6;
				this.clean = this.clean - 1;
				presa.clean = presa.clean - 1;
			} else if (this.weight >= (presa.weight)) {
				presa.vital = presa.vital - 3; // presa pierde vitalidad 3 niveles
				this.clean = this.clean - 1;
				presa.clean = presa.clean - 1;
			} else if (this.weight < (presa.weight)) { // peso menor a la presa
				presa.vital = presa.vital - 1; // la presa disminuye vitalidad 1
				this.clean = this.clean - 1; // me ensucio 1 nivel
				this.vital = this.vital - 2; // pierdo vitalidad 2 niveles
				presa.vital = presa.vital - 1; // presa pierde vitalidad 1 nivel
				presa.clean = presa.clean - 1; // presa se ensucia 1 nivel
			}
			System.out.println(this.name + "tiene de vida final " + this.vital
					+ "  y de limpieza final esta con nivel :" + this.clean);
			System.out.println(presa.name + "  tiene de vida final " + presa.vital
					+ " y de limpieza final tiene nivel : " + presa.clean);
			if (presa.equals(OrdenAnimal.CARNIVORO)) {
				presa.atacar(this);
			}
		}
	}

	public abstract void aseo();
}
