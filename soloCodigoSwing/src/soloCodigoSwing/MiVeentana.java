package soloCodigoSwing;

public class MiVeentana {

	import java.awt.BorderLayout;
	import java.awt.EventQueue;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.border.EmptyBorder;
	import javax.swing.JButton;
	import java.awt.Color;
	import java.awt.Font;
	import javax.swing.JCheckBox;
	import javax.swing.JSlider;
	import javax.swing.JTable;
	import javax.swing.BoxLayout;
	import java.awt.GridLayout;
	import com.jgoodies.forms.layout.FormLayout;
	import com.jgoodies.forms.layout.ColumnSpec;
	import com.jgoodies.forms.layout.RowSpec;

	public class FramePrueba extends JFrame {

		private JPanel contenedor;

		/**
		 * Launch the application.
		 */
		public static void main(String[] args) {
			
						FramePrueba frame = new FramePrueba();
						frame.setVisible(true);
					
		}

		/**
		 * Create the frame.
		 */
		public FramePrueba() {
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 450, 300);
			contenedor = new JPanel();
			contenedor.setBackground(Color.CYAN);
			contenedor.setForeground(Color.RED);
			contenedor.setBorder(new EmptyBorder(45, 60, 60, 100));
			contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.X_AXIS));
			setContentPane(contenedor);
			
			
			JButton myBoton = new JButton("Pulse");
			myBoton.setForeground(Color.BLUE);
			myBoton.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 17));
			myBoton.setBackground(Color.PINK);
			contenedor.add(myBoton);
		}

	}
