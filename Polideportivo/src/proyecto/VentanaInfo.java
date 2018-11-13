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
import javax.swing.ScrollPaneConstants;

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
		
	
		JButton button = new JButton("Atrás");
		button.setBounds(10, 11, 72, 39);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaOpcion nuevaVentana = new VentanaOpcion();
				nuevaVentana.setVisible(true);
				VentanaInfo.this.dispose();
			}
		});
		contentPane.setLayout(null);
		contentPane.add(button);
		
		JLabel lblPrueb = new JLabel("Informaci\u00F3n \u00FAtil sobre reserva de pistas y alquiler de productos:");
		lblPrueb.setBounds(10, 52, 394, 32);
		lblPrueb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		contentPane.add(lblPrueb);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 83, 519, 303);
		contentPane.add(scrollPane);
		
		JTextPane txtpnAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa = new JTextPane();
		txtpnAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa.setText("Este m\u00F3dulo le permitir\u00E1 a\u00F1adir un m\u00F3dulo texto de gran tama\u00F1o. Este m\u00F3dulo ocupar\u00E1 dos columnas. Usted puede utilizar este m\u00F3dulo para los textos de presentaci\u00F3n, art\u00EDculos y textos largos.Para a\u00F1adir un m\u00F3dulo Texto grande a su sitio, vaya al icono A\u00F1adir un m\u00F3dulo, situado en la barra de herramientas del editor, y haga clic en el icono Texto grande.Este m\u00F3dulo le permitir\u00E1 a\u00F1adir un m\u00F3dulo texto de gran tama\u00F1o. Este m\u00F3dulo ocupar\u00E1 dos columnas. Usted puede utilizar este m\u00F3dulo para los textos de presentaci\u00F3n, art\u00EDculos y textos largos.Para a\u00F1adir un m\u00F3dulo Texto grande a su sitio, vaya al icono A\u00F1adir un m\u00F3dulo, situado en la barra de herramientas del editor, y haga clic en el icono Texto grande.Este m\u00F3dulo le permitir\u00E1 a\u00F1adir un m\u00F3dulo texto de gran tama\u00F1o. Este m\u00F3dulo ocupar\u00E1 dos columnas. Usted puede utilizar este m\u00F3dulo para los textos de presentaci\u00F3n, art\u00EDculos y textos largos.Para a\u00F1adir un m\u00F3dulo Texto grande a su sitio, vaya al icono A\u00F1adir un m\u00F3dulo, situado en la barra de herramientas del editor, y haga clic en el icono Texto grande.Este m\u00F3dulo le permitir\u00E1 a\u00F1adir un m\u00F3dulo texto de gran tama\u00F1o. Este m\u00F3dulo ocupar\u00E1 dos columnas. Usted puede utilizar este m\u00F3dulo para los textos de presentaci\u00F3n, art\u00EDculos y textos largos.Para a\u00F1adir un m\u00F3dulo Texto grande a su sitio, vaya al icono A\u00F1adir un m\u00F3dulo, situado en la barra de herramientas del editor, y haga clic en el icono Texto grande.Este m\u00F3dulo le permitir\u00E1 a\u00F1adir un m\u00F3dulo texto de gran tama\u00F1o. Este m\u00F3dulo ocupar\u00E1 dos columnas. Usted puede utilizar este m\u00F3dulo para los textos de presentaci\u00F3n, art\u00EDculos y textos largos.Para a\u00F1adir un m\u00F3dulo Texto grande a su sitio, vaya al icono A\u00F1adir un m\u00F3dulo, situado en la barra de herramientas del editor, y haga clic en el icono Texto grande.Este m\u00F3dulo le permitir\u00E1 a\u00F1adir un m\u00F3dulo texto de gran tama\u00F1o. Este m\u00F3dulo ocupar\u00E1 dos columnas. Usted puede utilizar este m\u00F3dulo para los textos de presentaci\u00F3n, art\u00EDculos y textos largos.Para a\u00F1adir un m\u00F3dulo Texto grande a su sitio, vaya al icono A\u00F1adir un m\u00F3dulo, situado en la barra de herramientas del editor, y haga clic en el icono Texto grande.Este m\u00F3dulo le permitir\u00E1 a\u00F1adir un m\u00F3dulo texto de gran tama\u00F1o. Este m\u00F3dulo ocupar\u00E1 dos columnas. Usted puede utilizar este m\u00F3dulo para los textos de presentaci\u00F3n, art\u00EDculos y textos largos.Para a\u00F1adir un m\u00F3dulo Texto grande a su sitio, vaya al icono A\u00F1adir un m\u00F3dulo, situado en la barra de herramientas del editor, y haga clic en el icono Texto grande.Este m\u00F3dulo le permitir\u00E1 a\u00F1adir un m\u00F3dulo texto de gran tama\u00F1o. Este m\u00F3dulo ocupar\u00E1 dos columnas. Usted puede utilizar este m\u00F3dulo para los textos de presentaci\u00F3n, art\u00EDculos y textos largos.Para a\u00F1adir un m\u00F3dulo Texto grande a su sitio, vaya al icono A\u00F1adir un m\u00F3dulo, situado en la barra de herramientas del editor, y haga clic en el icono Texto grande.Este m\u00F3dulo le permitir\u00E1 a\u00F1adir un m\u00F3dulo texto de gran tama\u00F1o. Este m\u00F3dulo ocupar\u00E1 dos columnas. Usted puede utilizar este m\u00F3dulo para los textos de presentaci\u00F3n, art\u00EDculos y textos largos.Para a\u00F1adir un m\u00F3dulo Texto grande a su sitio, vaya al icono A\u00F1adir un m\u00F3dulo, situado en la barra de herramientas del editor, y haga clic en el icono Texto grande.Este m\u00F3dulo le permitir\u00E1 a\u00F1adir un m\u00F3dulo texto de gran tama\u00F1o. Este m\u00F3dulo ocupar\u00E1 dos columnas. Usted puede utilizar este m\u00F3dulo para los textos de presentaci\u00F3n, art\u00EDculos y textos largos.Para a\u00F1adir un m\u00F3dulo Texto grande a su sitio, vaya al icono A\u00F1adir un m\u00F3dulo, situado en la barra de herramientas del editor, y haga clic en el icono Texto grande.");
		scrollPane.setViewportView(txtpnAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa);
	
	}
}