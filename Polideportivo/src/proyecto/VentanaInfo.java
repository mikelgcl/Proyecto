package proyecto;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Scrollbar;

import javax.swing.JTextPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

public class VentanaInfo extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaComprar frame = new VentanaComprar();
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
	public VentanaInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		JButton button = new JButton("<<<");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaOpcion nuevaVentana = new VentanaOpcion();
				nuevaVentana.setVisible(true);
				VentanaInfo.this.dispose();
			}
		});
		button.setBounds(10, 11, 55, 39);
		contentPane.add(button);
		
		JLabel lblPrueb = new JLabel("Informaci\u00F3n \u00FAtil sobre reserva de pistas y alquiler de productos:");
		lblPrueb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPrueb.setBounds(10, 52, 394, 32);	
		contentPane.add(lblPrueb);
		
		
		JTextPane txtpnBastaConQue = new JTextPane();
		txtpnBastaConQue.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtpnBastaConQue.setText("Basta con que el arrendatario optante, dentro del plazo estipulado, manifieste su decisi\u00F3n de llevar a cabo la compra notificando su voluntad positiva en este sentido al concedente. Esa manifestaci\u00F3n pueda ser t\u00E1cita si no se concreta una forma espec\u00EDfica para hacerla efectiva, aunque si se pacta una habr\u00E1 que estar a lo pactado. Lo m\u00E1s normal es pactar que se haga mediante acta notarial. Pero l\u00F3gicamente, la manifestaci\u00F3n debe ser clara, de modo que la Jurisprudencia ha entendido que la simple designaci\u00F3n de una notar\u00EDa por el arrendatario no ser\u00EDa suficiente. Ser\u00E1, l\u00F3gicamente, el convenido por las partes. En ausencia de plazo para el ejercicio de la opci\u00F3n, cualquiera de las partes pueden pedir al Juez que Basta con que el arrendatario optante, dentro del plazo estipulado, manifieste su decisi\u00F3n de llevar a cabo la compra notificando su voluntad positiva en este sentido al concedente. Esa manifestaci\u00F3n pueda ser t\u00E1cita si no se concreta una forma espec\u00EDfica para hacerla efectiva, aunque si se pacta una habr\u00E1 que estar a lo pactado. Lo m\u00E1s normal es pactar que se haga mediante acta notarial. Pero l\u00F3gicamente, la manifestaci\u00F3n debe ser clara, de modo que la Jurisprudencia ha entendido que la simple designaci\u00F3n de una notar\u00EDa por el arrendatario no ser\u00EDa suficiente. Ser\u00E1, l\u00F3gicamente, el convenido por las partes. En ausencia de plazo para el ejercicio de la opci\u00F3n, cualquiera de las partes pueden pedir al Juez que sea este quien lo fije. Si bien, en defecto de plazo, la Jurisprudencia suele apuntar el plazo fijado para el arrendamiento con exclusi\u00F3n de las pr\u00F3rrogas legales y t\u00E1citas. Ser\u00E1, l\u00F3gicamente, el convenido por las partes. En ausencia de plazo para el ejercicio de la opci\u00F3n, cualquiera de las partes pueden pedir al Juez que sea este quien lo fije. Si bien, en defecto de plazo, la Jurisprudencia suele apuntar el plazo fijado para el arrendamiento con exclusi\u00F3n de las pr\u00F3rrogas legales y t\u00E1citas. Ser\u00E1, l\u00F3gicamente, el convenido por las partes. En ausencia de plazo para el ejercicio de la opci\u00F3n, cualquiera de las partes pueden pedir al Juez que sea este quien lo fije. Si bien, en defecto de plazo, la Jurisprudencia suele apuntar el plazo fijado para el arrendamiento con exclusi\u00F3n de las pr\u00F3rrogas legales y t\u00E1citas.Basta con que el arrendatario optante, dentro del plazo estipulado, manifieste su decisi\u00F3n de llevar a cabo la compra notificando su voluntad positiva en este sentido al concedente.  sea este quien lo fije. Si bien, en defecto de plazo, la Jurisprudencia suele apuntar el plazo fijado para el arrendamiento con exclusi\u00F3n de las pr\u00F3rrogas legales y t\u00E1citas. Ser\u00E1, l\u00F3gicamente, el convenido por las partes. En ausencia de plazo para el ejercicio de la opci\u00F3n, cualquiera de las partes pueden pedir al Juez que sea este quien lo fije. Si bien, en defecto de plazo, la Jurisprudencia suele apuntar el plazo fijado para el arrendamiento con exclusi\u00F3n de las pr\u00F3rrogas legales y t\u00E1citas. Ser\u00E1, l\u00F3gicamente, el convenido por las partes. En ausencia de plazo para el ejercicio de la opci\u00F3n, cualquiera de las partes pueden pedir al Juez que sea este quien lo fije. Si bien, en defecto de plazo, la Jurisprudencia suele apuntar el plazo fijado para el arrendamiento con exclusi\u00F3n de las pr\u00F3rrogas legales y t\u00E1citas.Basta con que el arrendatario optante, dentro del plazo estipulado, manifieste su decisi\\u00F3n de llevar a cabo la compra notificando su voluntad positiva en este sentido al concedente.  ");
		//txtpnBastaConQue.setBounds(10, 94, 501, 278);
		JScrollPane barra= new JScrollPane(txtpnBastaConQue);
		barra.setBounds(31, 95, 484, 276);
		contentPane.add(barra);
	
	}
}