package javaConEjemplosPOO;

public class GatoSimple {

	String color, raza, sexo;	//atributos
	
	GatoSimple (String s){	//constructor
		this.sexo=s;
	}
	String getSexo() {	//getter
		return this.sexo;
	}
	
	void maulla() {
		System.out.println("Miauu");
		}
	void ronronea() {
		System.out.println("mrrrr");
	}
	void come(String comida) {
		if (comida.equals("pescado")) {
			System.out.println("Hmmiauhh gracias ");
			
		}else {
			System.out.println("Lo siento, tan solo como pescado");
		}
	}	
		
		void peleaCon (GatoSimple contrincante) {
			if (this.sexo.equals(("hembra"))) {
				System.out.println("no me gusta pelear");
				} else {
					if (contrincante.getSexo().equals("hembra")) {
						System.out.println("no peleo contra gatitas");
					}else {
						System.out.println("aqui que te vas a enterar");
					}
				}
			
		
	}
	
	
	
}
