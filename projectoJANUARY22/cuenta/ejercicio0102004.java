package cuenta;

import java.util.Scanner;

public class ejercicio0102004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("CAMBIO DE PESETAS A EUROS, AYYY ESAS PESETAS, QUE DE MENOS OS ECHO");

		final float EURO=166.386f;
		int CANTIDAD;
		System.out.println("INTRODUZCA CANTIDAD DE PESETAS A CAMBIAR A EUROS:");
		Scanner sc=new Scanner (System.in);
		CANTIDAD=sc.nextInt();
			System.out.println("SU CAMBIO ES:"+(CANTIDAD/EURO)+"PESETAS");
	
	
	
	
	}

}
