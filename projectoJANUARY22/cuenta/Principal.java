package cuenta;

public class Principal {

	public static void main(String[] args) {
		
		Dinero d1 = new Dinero(100,"EUR");
		Dinero d2 = new Dinero(50,"DOL");
		
		
		System.out.println("Antes \md1");
		//d1.sumar(d2);
		//System.out.println("Despues de operar d1 tiene  "+d1.toString() + "DOL");
				/*
		Dinero d1 = new Dinero(100,"EUR");	//SON DOS OBJETOS NO SE PUEDEN SUMAR COMO SI FUERAN VARIABLES
		//d1.doblar();
		System.out.println("Al principio d1 tiene "+ d1.obtenerCantidad() + " EUR");
		
		Dinero d2 = new Dinero(100,"DOL");
		System.out.println("Al principio d2 tiene "+ d1.obtenerCantidad() + " DOL");
		
		//d1.sumar(d2);	//con el metodo sumar sumo los dos objetos d1 y d2
		//System.out.println(" Despues de suma d1 tiene " + d1.obtenerCantidad() + " EUR");
		System.out.println("Al principio d2 tiene "+ d2.obtenerCantidad() + " DOL");
		
		d1.restar(d2);
		System.out.println("Despues de resta d1 tiene "+ d1.obtenerCantidad() + "EUR");
		System.out.println("Despues de resta d2 tiene "+ d2.obtenerCantidad() + "DOL");
		*/
		
	}

}










/*
public class Principal {

	public static final String AZUL = "\033[34m";
	public static final String BLANCO = "\033[37m";
	
	public static void main(String[] args) {
		
		Dinero d1 = new Dinero (100, "EUR");
		//d1.doblar();
		
		System.out.print ("\n" + "Al principio d1 tiene " +AZUL +d1.obtenerCantidad() +BLANCO +" EUR" +"\n");
		
		Dinero d2 = new Dinero (100, "DOL");
		System.out.print ("\n" + "Al principio d2 tiene " +AZUL +d2.obtenerCantidad() +BLANCO +" DOL" +"\n");
		
		d1.restar(d2);
		//d1.obtenerCantidad();
		System.out.print ("\n" + "Luego de restar d1 tiene " +AZUL +d1.obtenerCantidad() +BLANCO +" EUR" +"\n");
		System.out.print ("\n" + "Luego de restar d2 tiene " +AZUL +d2.obtenerCantidad() +BLANCO +" DOL" +"\n");
			
	}

}*/
