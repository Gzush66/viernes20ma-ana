package pildorasInformaticasEjercicios;

import javax.swing.JOptionPane;

public class Comprueba_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean arroba= false;
		boolean punto= false;
		int cuentarrobas=0;
		int cuentapuntos=0;
		String mail=JOptionPane.showInputDialog("introduce mail");
		for (int i=0;i<mail.length();i++) {
			if (mail.charAt(i)=='@') {
				arroba=true;
				cuentarrobas++;
			}
			if (mail.charAt(i)=='.') {
				punto=true;
				cuentapuntos++;
			}
		}
		if (arroba==true && cuentarrobas==1) {
			System.out.println("Es correcto");
		}
		else {
			System.out.println("No es correcto");
		}

	}

}
