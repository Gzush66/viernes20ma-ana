package pooEnero01;

public class principal {

	public static void main(String[] args) {
		
	
		Coche renault = new Coche(4, 180);
		renault.arrancar();
		renault.acelerar(180);
		renault.acelerar(81); // se pasa y pone la maxima
		renault.frenar(180);
		renault.mostrarVelocidad();
		renault.parar();
		Coche kia = new Coche(4,200);
		kia.arrancar();
		kia.acelerar(100);
		kia.acelerar(300);
		kia.frenar(100);
		kia.mostrarVelocidad();
		kia.parar();
		
	
		coche fiat =new Coche(180,4);
		
		
		coche ferrari = new Coche (200,2);

	fiat.recorrer (100);
	fiat.recorrer (25);
	system.out.println ("el ferrari ha recorrido "+ferrari.getkilometraje() + "km");
}
}
