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
import java.awt.SystemColor;

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
		setBounds(100, 100, 555, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
	
		JButton button = new JButton("Atrás");
		button.setBackground(SystemColor.textHighlight);
		button.setForeground(SystemColor.text);
		button.setBounds(20, 381, 84, 23);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaOpcion nuevaVentana = new VentanaOpcion();
				nuevaVentana.setVisible(true);
				VentanaInfo.this.dispose();
			}
		});
		contentPane.setLayout(null);
		
		JLabel lblInformacin = new JLabel("Informaci\u00F3n");
		lblInformacin.setForeground(SystemColor.window);
		lblInformacin.setFont(new Font("Tahoma", Font.PLAIN, 44));
		lblInformacin.setBounds(24, 0, 389, 85);
		contentPane.add(lblInformacin);
		contentPane.add(button);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(20, 96, 496, 274);
		contentPane.add(scrollPane);
		
		//Esto es lo que falla
		JTextPane txtpnAaa = new JTextPane();
		txtpnAaa.setText("Este m\u00F3dulo le permitir\u00E1 a\u00F1adir un m\u00F3dulo texto de gran tama\u00F1o. Este m\u00F3dulo ocupar\u00E1 dos columnas. Usted puede utilizar este m\u00F3dulo para los textos de presentaci\u00F3n, art\u00EDculos y textos largos.Para a\u00F1adir un m\u00F3dulo Texto grande a su sitio, vaya al icono A\u00F1adir un m\u00F3dulo, situado en la barra de herramientas del editor, y haga clic en el icono Texto grande.Este m\u00F3dulo le permitir\u00E1 a\u00F1adir un m\u00F3dulo texto de gran tama\u00F1o. Este m\u00F3dulo ocupar\u00E1 dos columnas. Usted puede utilizar este m\u00F3dulo para los textos de presentaci\u00F3n, art\u00EDculos y textos largos.Para a\u00F1adir un m\u00F3dulo Texto grande a su sitio, vaya al icono A\u00F1adir un m\u00F3dulo, situado en la barra de herramientas del editor, y haga clic en el icono Texto grande.Este m\u00F3dulo le permitir\u00E1 a\u00F1adir un m\u00F3dulo texto de gran tama\u00F1o. Este m\u00F3dulo ocupar\u00E1 dos columnas. Usted puede utilizar este m\u00F3dulo para los textos de presentaci\u00F3n, art\u00EDculos y textos largos.Para a\u00F1adir un m\u00F3dulo Texto grande a su sitio, vaya al icono A\u00F1adir un m\u00F3dulo, situado en la barra de herramientas del editor, y haga clic en el icono Texto grande.Este m\u00F3dulo le permitir\u00E1 a\u00F1adir un m\u00F3dulo texto de gran tama\u00F1o. Este m\u00F3dulo ocupar\u00E1 dos columnas. Usted puede utilizar este m\u00F3dulo para los textos de presentaci\u00F3n, art\u00EDculos y textos largos.Para a\u00F1adir un m\u00F3dulo Texto grande a su sitio, vaya al icono A\u00F1adir un m\u00F3dulo, situado en la barra de herramientas del editor, y haga clic en el icono Texto grande.Este m\u00F3dulo le permitir\u00E1 a\u00F1adir un m\u00F3dulo texto de gran tama\u00F1o. Este m\u00F3dulo ocupar\u00E1 dos columnas. Usted puede utilizar este m\u00F3dulo para los textos de presentaci\u00F3n, art\u00EDculos y textos largos.Para a\u00F1adir un m\u00F3dulo Texto grande a su sitio, vaya al icono A\u00F1adir un m\u00F3dulo, situado en la barra de herramientas del editor, y haga clic en el icono Texto grande.Este m\u00F3dulo le permitir\u00E1 a\u00F1adir un m\u00F3dulo texto de gran tama\u00F1o. Este m\u00F3dulo ocupar\u00E1 dos columnas. Usted puede utilizar este m\u00F3dulo para los textos de presentaci\u00F3n, art\u00EDculos y textos largos.Para a\u00F1adir un m\u00F3dulo Texto grande a su sitio, vaya al icono A\u00F1adir un m\u00F3dulo, situado en la barra de herramientas del editor, y haga clic en el icono Texto grande.Este m\u00F3dulo le permitir\u00E1 a\u00F1adir un m\u00F3dulo texto de gran tama\u00F1o. Este m\u00F3dulo ocupar\u00E1 dos columnas. Usted puede utilizar este m\u00F3dulo para los textos de presentaci\u00F3n, art\u00EDculos y textos largos.Para a\u00F1adir un m\u00F3dulo Texto grande a su sitio, vaya al icono A\u00F1adir un m\u00F3dulo, situado en la barra de herramientas del editor, y haga clic en el icono Texto grande.Este m\u00F3dulo le permitir\u00E1 a\u00F1adir un m\u00F3dulo texto de gran tama\u00F1o. Este m\u00F3dulo ocupar\u00E1 dos columnas. Usted puede utilizar este m\u00F3dulo para los textos de presentaci\u00F3n, art\u00EDculos y textos largos.Para a\u00F1adir un m\u00F3dulo Texto grande a su sitio, vaya al icono A\u00F1adir un m\u00F3dulo, situado en la barra de herramientas del editor, y haga clic en el icono Texto grande.Este m\u00F3dulo le permitir\u00E1 a\u00F1adir un m\u00F3dulo texto de gran tama\u00F1o. Este m\u00F3dulo ocupar\u00E1 dos columnas. Usted puede utilizar este m\u00F3dulo para los textos de presentaci\u00F3n, art\u00EDculos y textos largos.Para a\u00F1adir un m\u00F3dulo Texto grande a su sitio, vaya al icono A\u00F1adir un m\u00F3dulo, situado en la barra de herramientas del editor, y haga clic en el icono Texto grande.Este m\u00F3dulo le permitir\u00E1 a\u00F1adir un m\u00F3dulo texto de gran tama\u00F1o. Este m\u00F3dulo ocupar\u00E1 dos columnas. Usted puede utilizar este m\u00F3dulo para los textos de presentaci\u00F3n, art\u00EDculos y textos largos.Para a\u00F1adir un m\u00F3dulo Texto grande a su sitio, vaya al icono A\u00F1adir un m\u00F3dulo, situado en la barra de herramientas del editor, y haga clic en el icono Texto grande.");
		scrollPane.setViewportView(txtpnAaa);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setEnabled(false);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setBounds(0, 0, 539, 85);
		contentPane.add(btnNewButton);
		setLocationRelativeTo(null);
	
	}
}