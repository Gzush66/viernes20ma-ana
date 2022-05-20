package pildorasInformaticasEjercicios;

public class Ejemplo_Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double acumulado;
		double interes=0.10;//es un interes del 10%
	
		double[][]saldo= new double [6][5];
		
		for( int i=0;i<6;i++) {	//recorremos la primera dimension 
			saldo [i][0]=10000;	//almacenamos en la primera dimension el saldo inicial
			acumulado=10000;	//se ira incrementando paulatinamente
			
			for (int j=1;j<5;j++) {	//no lepongo desde 0 porque ya el primer valor en 0 se ha asignado antes, no necesito recorrer j igual a 0
				acumulado=acumulado+(acumulado*interes);//le voy sumando el acumulado con su interes generado
				saldo[i][j]=acumulado;//mete el acumulado en la posicion correspondiente del array
			}
			interes= interes+ 0.01;//voy incrementando el interes año a año
		}
//ahora los bucles para leer la matriz
		for (int z=0;z<6;z++) {
			System.out.println();//linea en blanco
			for (int h=0;h<5;h++) {
				System.out.printf("%1.2f",saldo[z][h]);//imprimimos con formato de dos decimales
				
				System.out.println();
			}
		}
	}

}
