package pooEnero01;


public class PrincipalAntonio {

	public static void main(String[] args){
		
		//Pasamos al constructos la vel max y el num de puertas
		Coche fiat = new Coche(180, 4);
		Coche ferrari = new Coche(280, 2);
		
		fiat.arrancar();
		fiat.acelerar(100);
		fiat.acelerar(100);
		System.out.println("Vel Fiat: "+ 
				fiat.getVelocidad() + " km/h");
		
		ferrari.arrancar();
		ferrari.acelerar(250);
		ferrari.frenar(100);
		System.out.println("Vel Ferrari: "+ 
				ferrari.getVelocidad() +" km/h\n");
		
		
		//probamos ahora los métodos de recorrer km
		fiat.recorrer(100);
		fiat.recorrer(25);		
		System.out.println("el fiat ha recorrido "+
				fiat.getKilometraje() +" km");
		
		ferrari.recorrer(50);
		ferrari.recorrer(8);		
		System.out.println("el ferrari ha recorrido "+
				ferrari.getKilometraje() +" km");
		
		System.out.println("La flota entera ha recorrido "+
				Coche.getKilometrajeFlota() +" km");

			
	}

}