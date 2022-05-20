package pildorasSQL;

import javax.swing.JOptionPane;

public class ProbandoSalidaPantalla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = JOptionPane.showInputDialog("INTRODUCE TU NOMBRE:");
		//JOptionPane.showInputDialog
		
		int edad = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE TU EDAD:"));
		// Integer.parseInt(JOptionPane.showInputDialog
		
		System.out.println("\n\tHola "+ nombre + " tienes "+ edad + " años.");
		
				double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingresa el valor de a"));
		System.out.println("\n\tHola "+ nombre + " tienes que pagar  "+ precio + " pesos");
		
				String input = JOptionPane.showInputDialog(null,"Por favor ingrese el subtotal: ");
		
		/*int seleccion = JOptionPane.showOptionDialog(
				   unComponentePadre,
				   "Seleccione opcion", 
				   "Selector de opciones",
				   JOptionPane.YES_NO_CANCEL_OPTION,
				   JOptionPane.QUESTION_MESSAGE,
				   unIcono,    // null para icono por defecto.
				   new Object[] { "opcion 1", "opcion 2", "opcion 3" },   // null para YES, NO y CANCEL
				   "opcion 1");

				if (seleccion != -1)
				   System.out.println("seleccionada opcion " + (seleccion + 1));
		*/
	}

}
