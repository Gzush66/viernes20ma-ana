package pildorasInformaticasEjercicios;

import java.util.Scanner;

public class Bucle002 {
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("ve introduciendo numeros y pulsando INTRO");
		System.out.println("para terminar, introduce un numero negativo");
		int numeroIntroducido=0;
		int cuentaNumeros=0;
		int suma=0;
		while(numeroIntroducido>=0){
			numeroIntroducido=sc.nextInt();
			cuentaNumeros++;
			suma+=numeroIntroducido;//es lo mismos que suma=suma+numeroIntroducido
			System.out.println("suma="+suma+" \n numero introducido= "+numeroIntroducido);
		}
		
		System.out.println("Has introducido"+(cuentaNumeros-1)+"numeros positivos.");
		System.out.println("la suma total de ellos es :"+(suma-numeroIntroducido));
		}
}



