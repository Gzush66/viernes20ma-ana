import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GridBagLayoutEjemplo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridBagLayoutEjemplo frame = new GridBagLayoutEjemplo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GridBagLayoutEjemplo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new GridBagLayout());
		panelPrincipal.setBackground(Color.green);
		GridBagConstraints restricciones = new GridBagConstraints ();
		restricciones.weightx = 1; // Expandir el espacio ocupado horizontalmente

		restricciones.weighty = 1; // Expandir el espacio ocupado verticalmente

		restricciones.fill = GridBagConstraints.BOTH; // Expandir el componente

		restricciones.gridx = 0; // El area de texto empieza en la columna cero

		restricciones.gridy = 0; // El area de texto empieza en la fila cero
		
		restricciones.gridwidth = 2; // El area de texto ocupa 2 columnas.
		
		restricciones.gridheight = 2; // El area de texto ocupa 2 filas.
		
		panelPrincipal.add(new JButton("(0,0) 2x2"),restricciones);
		restricciones.gridx = 2;
		restricciones.gridy = 0;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		panelPrincipal.add(new JButton("(2,0) 1x1"), restricciones);
		restricciones.gridx = 2;
		restricciones.gridy = 1;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		panelPrincipal.add(new JButton("(2,1) 1x1"), restricciones);
		restricciones.gridx = 0;
		restricciones.gridy = 2;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		panelPrincipal.add(new JButton("(0,2) 1x1"), restricciones);

		restricciones.gridx = 1;
		restricciones.gridy = 3;
		restricciones.gridwidth = 1;
		restricciones.gridheight = 1;
		panelPrincipal.add(new JButton("(1,3) 1x1"),restricciones);
		setContentPane(panelPrincipal);
		
	}

}
