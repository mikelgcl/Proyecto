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
	

	/**
	 * Create the frame.
	 */
	public VentanaInfo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
	
		JButton button = new JButton("Atr�s");
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
		txtpnAaa.setEditable(false);
		txtpnAaa.setText("Polideportivo Deusto\r\n" + 
				"\r\n" + 
				"El polideportivo Deusto est� situado en la Universidad de Deusto, a menos de 15 minutos del metro y muy cercano al reconocido museo Guggheim. Las instalaciones del polideportivo son de gran calidad y muy bien cuidadas, haciendo as� un lugar perfecto para practicar su deporte preferido.\r\n" + 
				"Pistas\r\n" + 
				"El deportivo dispone de varias pistas y campos para practicar un deporte espec�fico. La reserva de pistas se puede hacer a trav�s de ventana reservas. Cada hora de reserva cuesta 10� y se pueden reservar tantas horas se quiera si no est�n ocupadas.\r\n" + 
				"Lista de pistas\r\n" + 
				"-Campo de futbol: Campo perfecto para practicar futbol 7 o futbol 11. Dispone de vestuarios propios de gran tama�o y de gran seguridad.\r\n" + 
				"-Pista de tenis: Hay dos pistas de tenis par reservar, bien cuidadas. Una est� al aire libre y otra tiene techo cubierto para as� poder jugar en los d�as de mal tiempo.\r\n" + 
				"-Campo de baloncesto: Es una pista cubierta de madera con aforo para partidos en los campeonatos. Tambi�n tiene vestuarios propios.\r\n" + 
				"-Pistas de p�del: est�n en frente de las e tenis. Las dos est�n cubiertas y son del tama�o suficiente para poder jugar 2vs2.\r\n" + 
				"Alquiler de equipamiento\r\n" + 
				"Si no tienes material para poder practicar un deporte, el deportivo pone a disposici�n un servicio de alquiler de equipamiento.\r\n" + 
				"Raquetas: Cada raqueta tiene un costo de 5 � y se puede utilizar mientras este en el polideportivo. Las raquetas son de tama�o est�ndar y de poco peso para que cualquier persona pueda utilizarla.\r\n" + 
				"Raquetas de p�del: Cada raqueta tiene un costo de 4 � y se puede utilizar mientras este en el polideportivo. Las raquetas son de tama�o est�ndar y de poco peso para que cualquier persona pueda utilizarla.\r\n" + 
				"Bal�n de futbol: El bal�n de futbol se puede alquilar por 4� y solo se pude utilizar en el campo de futbol. Los balones son de gran calidad y de perfecto tama�o para poder jugar a cualquier tipo de futbol.\r\n" + 
				"Bal�n de baloncesto: El bal�n de baloncesto se puede alquilar por 3� y solo se pude utilizar en el campo de baloncesto. Los balones son de gran calidad y tambi�n pueden ser utilizados en los campeonatos;\r\n" + 
				"Localizaci�n\r\n" + 
				"\r\n" + 
				"Unibertsitate Etorb., 24, 48007 Bilbo, Bizkaia\r\n" + 
				"Atenci�n al cliente \r\n" + 
				"Dir�jase al propio polideportivo para aclarar problemas o contacte con el polideportivo por email.\r\n" + 
				"");
		scrollPane.setViewportView(txtpnAaa);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setEnabled(false);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setBounds(0, 0, 539, 85);
		contentPane.add(btnNewButton);
		setLocationRelativeTo(null);
	
	}
}