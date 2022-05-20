import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class OtraHolaMundo extends JFrame implements ActionListener {
	public static void main(String[] args) {
		
		
		
		OtraHolaMundo ventana = new OtraHolaMundo();
		ventana.setVisible(true);
	}

	private JPanel panelPrincipal;
	private JButton incrementarUno;
	private int contador;
	private JLabel lblIncrementar;
	private JButton incrementar10;
	private JButton cambiaColor;
	

	public OtraHolaMundo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		panelPrincipal = new JPanel();
		panelPrincipal.setLayout(new BorderLayout());
		
		incrementarUno = new JButton("IncrementoUNO");
		panelPrincipal.add(incrementarUno, BorderLayout.SOUTH);
		incrementarUno.addActionListener(this);
		
		incrementar10 = new JButton("incrementar10");
		panelPrincipal.add(incrementar10, BorderLayout.NORTH);
		incrementar10.addActionListener(this);
		
		
		cambiaColor = new JButton("cambiaColor");
		panelPrincipal.add(cambiaColor, BorderLayout.WEST);
		cambiaColor.addActionListener(this);
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		int height = toolkit.getScreenSize().height - 500;
		int width = toolkit.getScreenSize().width - 500;
		setPreferredSize(new Dimension(width, height));
		pack();
		setLocationRelativeTo(null);
		
		

		setContentPane(panelPrincipal);
		
	lblIncrementar = new JLabel("lblIncrementar");
	lblIncrementar.setHorizontalAlignment(SwingConstants.CENTER);
		panelPrincipal.add(lblIncrementar, BorderLayout.CENTER);
		
		cambiaColor = new JButton("cambiaColor");
		panelPrincipal.add(cambiaColor, BorderLayout.WEST);
		
		
		
		setVisible(true);
		contador = 0;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		switch (e.getActionCommand()) {
		case "incrementar 1":
			gestionarPulsacionBotonIncremento1();
		break;
		case "incrementar 2":
			gestionarPulsacionbotonIncrementar10();
		break;
		}
		
		
		
		}
	
	public void gestionarPulsacionbotonIncrementar10() {
		contador +=10;
		lblIncrementar.setText("contador: "+contador);
		lblIncrementar.setText("contador: "+contador);
		System.out.println(contador);
		if(contador%2 == 0) {
		panelPrincipal.setBackground(Color.red);
		incrementarUno.setForeground(Color.GREEN);
		} else {
		panelPrincipal.setBackground(Color.yellow);
		}
	}
	
	

	public void gestionarPulsacionBotonIncremento1() {
		contador ++;
		//escrtibo en el label el valor de contador
		lblIncrementar.setText("contador: "+contador);
		System.out.println(contador);
		if(contador%2 == 0) {
		panelPrincipal.setBackground(Color.GREEN);
		incrementarUno.setForeground(Color.red);
		} else {
		panelPrincipal.setBackground(Color.yellow);
		}
	}
}