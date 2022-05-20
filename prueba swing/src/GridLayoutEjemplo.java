import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class GridLayoutEjemplo extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridLayoutEjemplo frame = new GridLayoutEjemplo();
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
	public GridLayoutEjemplo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(9, 5, 45, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		JPanel panelPrincipal = new JPanel(); panelPrincipal.setLayout(new
				GridLayout(3,2,10,10));
				// 3 - filas, 2 - columnas, 10 - espaciado horizontal, 10 -

				//espaciado vertical

				panelPrincipal.setBackground(Color.yellow);
				panelPrincipal.add(new JButton("1.1"));
				panelPrincipal.add(new JButton("1.2"));
				panelPrincipal.add(new JButton("2.1"));
				panelPrincipal.add(new JButton("2.2"));
				panelPrincipal.add(new JButton("3.1"));
				panelPrincipal.add(new JButton("1.1"));
				panelPrincipal.add(new JButton("1.2"));
				panelPrincipal.add(new JButton("2.1"));
			
				setContentPane(panelPrincipal);
		
	}

}
