package pildorasInformaticasEjercicios;
import java.util.Scanner;

public class UsoBucleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("introduzca un nombre: ");
		String nombre= sc.nextLine();
		for (int i=1; i<=10 ; i++) {
			System.out.println("Mi nombre es "+ nombre);
		}

	}

}
