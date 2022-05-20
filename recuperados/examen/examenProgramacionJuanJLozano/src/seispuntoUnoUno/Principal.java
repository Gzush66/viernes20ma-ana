package seispuntoUnoUno;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {

		Profesor saturnino = new Profesor ("Saturnino", "12345A", 23000);
		Profesor gerardo = new Profesor("Gerardo","12346A",23500);
		Profesor ana = new Profesor ("Ana","12347A",22500);
		Asignatura biologia=new Asignatura("biologia","bio012");
		Asignatura lengua=new Asignatura ("lengua","len012");
		Asignatura matematicas=new Asignatura("asignatura","mat012");
		ana.asignarAsignatura(matematicas);
		ana.asignarAsignatura(biologia);
		ana.asignarAsignatura(biologia);
		saturnino.asignarAsignatura(matematicas);
		saturnino.asignarAsignatura(lengua);
		gerardo.asignarAsignatura(lengua);
		System.out.println(ana);
		System.out.println(gerardo);
		System.out.println(saturnino);
		System.out.println(biologia);
		
		
		
		
		
			
	}
}
