import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class FlowLayourEjemplo extends JFrame {
	
	// ejemplo de uso de flow Layout

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlowLayourEjemplo frame = new FlowLayourEjemplo();
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
	public FlowLayourEjemplo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);

		JPanel panelSuperior = new JPanel(new FlowLayout (FlowLayout.LEFT));
		panelSuperior.setBackground(Color.cyan);
		panelSuperior.add(new JButton("Sup.1"));
		panelSuperior.add(new JButton("Sup.2"));
		panelSuperior.add(new JButton("Sup.3"));
		panelSuperior.add(new JButton("Sup.4"));
		setContentPane(panelSuperior);
		setVisible(true);
	}

}
