package pildorasInformaticas;
import java.util.Scanner;


public class DiaSemanaAleatorio {

	public static void main(String[] args) {
		//for (int i=1;i<=7;i++){
			int dia = (int)(Math.random()*7) + 1;
				//System.out.println(dia);
				
				switch(dia) {
				case 1:
				System.out.println("lunes");
				break;
				case 2:
				System.out.println("martes");
				break;
				case 3:
				System.out.println("miércoles"); break;
				case 4:
				System.out.println("jueves");
				break;
				case 5:
				System.out.println("viernes");
				break;
				case 6:
				System.out.println("sábado");
				break;
				case 7:
				System.out.println("domingo");
				break;
				default:
				}
		
	}

}

