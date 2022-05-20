package pildorasInformaticasEjercicios;
import javax.swing.*;
import java.util.Scanner;
public class PesoIdeal {

	public static void main(String[] args) {

// usando un bucle do while
		//usando JOptionPane
		
		String genero="";
		do {
			genero=JOptionPane.showInputDialog("introduce tu genero (H / M) :");
			
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		//el operador && obliga a que se tengan que cumplir las dos condiciones a a la vez
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduzca la altura :"));
		int pesoIdeal=0;
		if(genero.equalsIgnoreCase("H")) {
			pesoIdeal=altura-110;
		}
		else if (genero.equalsIgnoreCase("M")) {
			pesoIdeal=altura-120;
		}
		System.out.println("Tu peso ideal es  "+ pesoIdeal +" kilos");

	}

}
