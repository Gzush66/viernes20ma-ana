import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class CombinarLayoutsEjemplo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CombinarLayoutsEjemplo frame = new CombinarLayoutsEjemplo();
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
	public CombinarLayoutsEjemplo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		
		JPanel panelIzquierdo = new JPanel();
		panelIzquierdo.setLayout(new GridLayout(0,2,15,15));
		
		panelIzquierdo.setBackground(Color.blue);
		panelIzquierdo.setBorder(new EmptyBorder(5,5,5,5)); //margenes
		panelIzquierdo.add(new JButton("izquierda_1"));
		panelIzquierdo.add(new JButton("izquierda_2"));
		panelIzquierdo.add(new JButton("izquierda_3"));
		
		JLabel lblNewLabel = new JLabel("New label");
		panelIzquierdo.add(lblNewLabel);
		panelIzquierdo.add(new JButton("izquierda_4"));
		
		JPanel panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BorderLayout());
		panelPrincipal.setBackground(Color.red);
		panelPrincipal.setBorder(new EmptyBorder(5,5,5,5)); //margenes
		
		JButton miboton = new JButton ("centro");
		panelPrincipal.add(new JButton("centro"),BorderLayout.CENTER);
		panelPrincipal.add(new JButton("derecha"),BorderLayout.EAST);
		panelPrincipal.add(new JButton("arriba"),BorderLayout.NORTH);
		panelPrincipal.add(new JButton("abajo"),BorderLayout.WEST);
		panelPrincipal.add(panelIzquierdo,BorderLayout.SOUTH);
		setContentPane(panelPrincipal);
	}

}
