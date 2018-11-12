package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

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
				VentanaComprar.this.dispose();
			}
		});
		button.setBounds(10, 11, 55, 39);
		contentPane.add(button);
		
		JButton btnRaquetaTenis = new JButton("Raqueta tenis");
		btnRaquetaTenis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(btnRaquetaTenis, "Raqueta de tenis alquilada correctamente", "Alquilar", 1);
			}
		});
		btnRaquetaTenis.setBounds(65, 180, 138, 23);
		contentPane.add(btnRaquetaTenis);
		
		JButton btnRaquetaPdel = new JButton("Raqueta p\u00E1del");
		btnRaquetaPdel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnRaquetaTenis, "Raqueta de pádel alquilada correctamente", "Alquilar", 1);
			}
		});
		btnRaquetaPdel.setBounds(351, 180, 138, 23);
		contentPane.add(btnRaquetaPdel);
		
		JButton btnBalnFtbol = new JButton("Bal\u00F3n f\u00FAtbol");
		btnBalnFtbol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnRaquetaTenis, "Balón de fútbol alquilado correctamente", "Alquilar", 1);
			}
		});
		btnBalnFtbol.setBounds(65, 339, 138, 23);
		contentPane.add(btnBalnFtbol);
		
		JButton btnBalnBaloncesto = new JButton("Bal\u00F3n baloncesto");
		btnBalnBaloncesto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(btnRaquetaTenis, "Pelota de baloncesto alquilada correctamente", "Alquilar", 1);
			}
		});
		btnBalnBaloncesto.setBounds(351, 339, 138, 23);
		contentPane.add(btnBalnBaloncesto);
		
		JLabel lblNewLabel = new JLabel("     Precio /n foto /n Desc");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Mikel\\git\\polideportivo2\\Polideportivo\\images\\raket (2).jpg"));
		lblNewLabel.setBounds(65, 74, 138, 99);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("     Precio /n foto /n Desc");
		label.setIcon(new ImageIcon("C:\\Users\\Mikel\\git\\polideportivo2\\Polideportivo\\images\\pala-padel-enebe-rsx-carbon-evo (2).jpg"));
		label.setBounds(351, 74, 138, 99);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("     Precio /n foto /n Desc");
		label_1.setIcon(new ImageIcon("C:\\Users\\Mikel\\git\\polideportivo2\\Polideportivo\\images\\1441988783_165642_1442161238_sumario_normal (1).jpg"));
		label_1.setBounds(65, 229, 138, 99);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("     Precio /n foto /n Desc");
		label_2.setIcon(new ImageIcon("C:\\Users\\Mikel\\git\\polideportivo2\\Polideportivo\\images\\20171127140647-18041-web (1).jpg"));
		label_2.setBounds(351, 229, 138, 99);
		contentPane.add(label_2);
	}

}
