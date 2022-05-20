package antonioJava;



public class Principal {

	public static void main(String[] args) {
		Dinero d1 = new Dinero(100); //100 eur, llamada al segundo constructor
		Dinero d2 = new Dinero(50,"DOL");
		
		//probamos la suma
		System.out.println ("ANTES DE SUMAR:\nd1: " + d1.toString()+ "\nd2: "+d2.toString());		
		d1.sumar(d2);
		System.out.println ("DESPUES DE SUMAR:\nd1: "+ d1.toString()+ "\nd2: "+d2.toString()+"\n");
		
		//probamos la comparación
		if(d1.esMayor(d2)) {
			System.out.println("d1 > d2");
		}
		else {
			System.out.println("d1 <= d2");
		}

		//probamos doblar
		System.out.println ("ANTES DE DOBLAR:\nd1: " + d1.toString()+ "\nd2: "+d2.toString());	
		d1.doblar();
		d2.doblar();
		System.out.println ("DESPUES DE DOBLAR:\nd1: "+ d1.toString()+ "\nd2: "+d2.toString()+"\n");

		//probamos la resta
		System.out.println ("ANTES DE RESTAR:\nd1: " + d1.toString()+ "\nd2: "+d2.toString());		
		d1.restar(d2);
		System.out.println ("DESPUES DE RESTAR:\nd1: "+ d1.toString()+ "\nd2: "+d2.toString()+"\n");			
	}

}