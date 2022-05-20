package animales;


public class PrincipalAnimal {
	public static void main(String[] args) {
		
		//public Perro (Sexo sexo, String raza, int edad ,float peso) {
		
		Gato felix = new Gato(Sexo.MACHO, "siamés");
		System.out.println(felix);
		Gato isidoro = new Gato(Sexo.MACHO, "pitbull");
		System.out.println(isidoro);
		Gato topacio = new Gato(Sexo.HEMBRA,"romano");
		System.out.println(topacio);
		Perro pluto= new Perro(Sexo.MACHO, "galgo",3,15f);
		System.out.println(pluto);
		Perro xana = new Perro(Sexo.HEMBRA, "bodeguero ratonero",8,12f);
		System.out.println(xana);
				
	}
	
}
