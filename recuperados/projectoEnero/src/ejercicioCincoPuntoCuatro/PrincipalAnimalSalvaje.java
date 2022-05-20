package ejercicioCincoPuntoCuatro;

public class PrincipalAnimalSalvaje {

	public static void main(String[] args) {

		Mamifero elefante = new Mamifero("Elefante", OrdenAnimal.HERBIVORO, 200, false, 4,
				new Pelo(LongitudPelo.SINPELO, FormaPelo.LISO, "gris"));
		Mamifero toro = new Mamifero("toro", OrdenAnimal.HERBIVORO, 800, false, 4,
				new Pelo(LongitudPelo.CORTO, FormaPelo.LISO, "negro"));
		Mamifero orangutan = new Mamifero("orangutan", OrdenAnimal.HERBIVORO, 100, true, 4,
				new Pelo(LongitudPelo.LARGO, FormaPelo.LISO, "negro"));
		Mamifero tigre = new Mamifero("tigre", OrdenAnimal.CARNIVORO, 400, false, 4,
				new Pelo(LongitudPelo.CORTO, FormaPelo.LISO, "marron"));
		Mamifero leon = new Mamifero("leon", OrdenAnimal.CARNIVORO, 500, false, 4,
				new Pelo(LongitudPelo.LARGO, FormaPelo.LISO, "negro"));

		Reptil dragonkomodo = new Reptil("dragonkmodo", OrdenAnimal.CARNIVORO, 200, false, 4, TamañoEscama.GRANDE);

		Reptil cocodrilo = new Reptil("cocodrilo", OrdenAnimal.CARNIVORO, 400, false, 4, TamañoEscama.GRANDE);

		// elefante.dormir();
		// elefante.escarbar();

		// orangutan.dormir();
		// orangutan.escarbar();

		// toro.dormir();
		// toro.escarbar();

		// tigre.dormir();
		tigre.atacar(leon);
		tigre.atacar(elefante);

		// dragonkomodo.nutrir();
		// dragonkomodo.dormir();
		dragonkomodo.atacar(orangutan);

		cocodrilo.atacar(orangutan);
		// cocodrilo.dormir();

		// leon.nutrir();
		// leon.escarbar();
		// leon.dormir();

	}

}
