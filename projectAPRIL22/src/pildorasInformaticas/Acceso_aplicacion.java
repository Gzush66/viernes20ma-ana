package pildorasInformaticas;
import javax.swing.*;
public class Acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String clave="Juan";//el programa toma clave juan
		String pass= "";//almacena una cadena vacia
		while (clave.equals(pass)==false) {//mientras la clave sea diferente que la ocntrase�a
			pass=JOptionPane.showInputDialog("introduzca la contrase�a, por  favor");;//me preguntaras por la contrase�a
			// y se almacena en la variable pass
			if (clave.equals(pass)==false) {
				System.out.println("contrase�a incorrecta");
				
			}
		}
		System.out.println("contrase�a correcta, acceso permitido");//solo cuando la pass que demos sea juan, esto es igual a clave

	}

}
