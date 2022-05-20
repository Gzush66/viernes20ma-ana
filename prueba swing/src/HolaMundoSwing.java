import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class HolaMundoSwing extends JFrame implements ActionListener {
	public static void main(String[] args) {
		HolaMundoSwing ventana = new HolaMundoSwing();
		ventana.setVisible(true);
	}

	private JPanel panelPrincipal;
	private JButton btnHolaMundo;
	private int contador;

	public HolaMundoSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BorderLayout());
		btnHolaMundo = new JButton("Hola Mundo");
		panelPrincipal.add(btnHolaMundo, BorderLayout.SOUTH);

		btnHolaMundo.addActionListener(this);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height - 200;
		int width = toolkit.getScreenSize().width - 400;
		setPreferredSize(new Dimension(width, height));
		pack();
		setLocationRelativeTo(null);
		
		

		setContentPane(panelPrincipal);
		setVisible(true);
		
		contador = 0;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		contador ++;
		System.out.println(contador);
		if(contador%2 == 0) {
		panelPrincipal.setBackground(Color.GREEN);
		btnHolaMundo.setForeground(Color.red);
		} else {
		panelPrincipal.setBackground(Color.yellow);
		}
		}
}