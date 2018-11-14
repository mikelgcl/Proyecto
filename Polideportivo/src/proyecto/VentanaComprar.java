package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import images.I;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Font;

public class VentanaComprar extends JFrame {

	private JPanel contentPane;

	
	//Comentario prueba
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
	public VentanaComprar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 417, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Atrás");
		button.setBackground(SystemColor.textHighlight);
		button.setForeground(SystemColor.window);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaOpcion nuevaVentana = new VentanaOpcion();
				nuevaVentana.setVisible(true);
				VentanaComprar.this.dispose();
			}
		});
		
		JLabel lblNewLabel_1 = new JLabel("Alquiler de productos");
		lblNewLabel_1.setForeground(SystemColor.text);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel_1.setBounds(29, 11, 406, 61);
		contentPane.add(lblNewLabel_1);
		button.setBounds(29, 385, 80, 23);
		contentPane.add(button);
		
		JButton btnRaquetaTenis = new JButton("Raqueta tenis");
		btnRaquetaTenis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(btnRaquetaTenis, "Raqueta de tenis alquilada correctamente", "Alquilar", 1);
			}
		});
		btnRaquetaTenis.setBounds(29, 217, 138, 23);
		contentPane.add(btnRaquetaTenis);
		
		JButton btnRaquetaPdel = new JButton("Raqueta p\u00E1del");
		btnRaquetaPdel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnRaquetaTenis, "Raqueta de pádel alquilada correctamente", "Alquilar", 1);
			}
		});
		btnRaquetaPdel.setBounds(229, 217, 138, 23);
		contentPane.add(btnRaquetaPdel);
		
		JButton btnBalnFtbol = new JButton("Bal\u00F3n f\u00FAtbol");
		btnBalnFtbol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnRaquetaTenis, "Balón de fútbol alquilado correctamente", "Alquilar", 1);
			}
		});
		btnBalnFtbol.setBounds(29, 351, 138, 23);
		contentPane.add(btnBalnFtbol);
		
		JButton btnBalnBaloncesto = new JButton("Bal\u00F3n baloncesto");
		btnBalnBaloncesto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnRaquetaTenis, "Pelota de baloncesto alquilada correctamente", "Alquilar", 1);
			}
		});
		btnBalnBaloncesto.setBounds(229, 351, 138, 23);
		contentPane.add(btnBalnBaloncesto);
		
		JLabel lblNewLabel = new JLabel("     Precio /n foto /n Desc");
		lblNewLabel.setIcon(new ImageIcon(I.class.getResource("raket (2).jpg")));
		lblNewLabel.setBounds(29, 118, 138, 99);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("     Precio /n foto /n Desc");
		label.setIcon(new ImageIcon(I.class.getResource("pala-padel-enebe-rsx-carbon-evo (2).jpg")));
		label.setBounds(229, 118, 138, 99);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("     Precio /n foto /n Desc");
		label_1.setIcon(new ImageIcon(I.class.getResource("1441988783_165642_1442161238_sumario_normal (1).jpg")));
		label_1.setBounds(29, 251, 138, 99);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("     Precio /n foto /n Desc");
		label_2.setIcon(new ImageIcon(I.class.getResource("20171127140647-18041-web (1).jpg")));
		label_2.setBounds(229, 251, 138, 99);
		contentPane.add(label_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(0, 0, 548, 87);
		contentPane.add(btnNewButton);
		setLocationRelativeTo(null);
	}

}
