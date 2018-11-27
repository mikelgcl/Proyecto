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
		setBounds(100, 100, 417, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Atr�s");
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
		button.setBounds(29, 424, 80, 23);
		contentPane.add(button);
		
		JButton btnRaquetaTenis = new JButton("Raqueta tenis");
		btnRaquetaTenis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if (Integer.parseInt(VentanaInicio.vale.getDinero()) >= 5) {
						BDatos.alquilarProducto(5);
						JOptionPane.showMessageDialog(btnRaquetaTenis, "Producto alquilado correctamente", "Alquilar", 1);
					} else {
						JOptionPane.showMessageDialog(btnRaquetaTenis, "No tienes fondos", "Alquilar", 1);
					}
				} catch (Exception e) {
					System.out.println("Error al alquilar producto");
				}
			}
		});
		btnRaquetaTenis.setBounds(29, 234, 138, 23);
		contentPane.add(btnRaquetaTenis);
		
		JButton btnRaquetaPdel = new JButton("Raqueta p\u00E1del");
		btnRaquetaPdel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (Integer.parseInt(VentanaInicio.vale.getDinero()) >= 4) {
						BDatos.alquilarProducto(4);
						JOptionPane.showMessageDialog(btnRaquetaTenis, "Producto alquilado correctamente", "Alquilar", 1);
					} else {
						JOptionPane.showMessageDialog(btnRaquetaTenis, "No tienes fondos", "Alquilar", 1);
					}
				} catch (Exception c) {
					System.out.println("Error al alquilar producto");
				}
			}
		});
		btnRaquetaPdel.setBounds(229, 234, 138, 23);
		contentPane.add(btnRaquetaPdel);
		
		JButton btnBalnFtbol = new JButton("Bal\u00F3n f\u00FAtbol");
		btnBalnFtbol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (Integer.parseInt(VentanaInicio.vale.getDinero()) >= 4) {
						BDatos.alquilarProducto(4);
						JOptionPane.showMessageDialog(btnRaquetaTenis, "Producto alquilado correctamente", "Alquilar", 1);
					} else {
						JOptionPane.showMessageDialog(btnRaquetaTenis, "No tienes fondos", "Alquilar", 1);
					}
				} catch (Exception f) {
					System.out.println("Error al alquilar producto");
				}
			}
		});
		btnBalnFtbol.setBounds(29, 390, 138, 23);
		contentPane.add(btnBalnFtbol);
		
		JButton btnBalnBaloncesto = new JButton("Bal\u00F3n baloncesto");
		btnBalnBaloncesto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (Integer.parseInt(VentanaInicio.vale.getDinero()) >= 3) {
						BDatos.alquilarProducto(3);
						JOptionPane.showMessageDialog(btnRaquetaTenis, "Producto alquilado correctamente", "Alquilar", 1);
					} else {
						JOptionPane.showMessageDialog(btnRaquetaTenis, "No tienes fondos", "Alquilar", 1);
					}
				} catch (Exception g) {
					System.out.println("Error al alquilar producto");
				}
			}
		});
		btnBalnBaloncesto.setBounds(229, 390, 138, 23);
		contentPane.add(btnBalnBaloncesto);
		
		JLabel lblNewLabel = new JLabel("     Precio /n foto /n Desc");
		lblNewLabel.setIcon(new ImageIcon(I.class.getResource("raket (2).jpg")));
		lblNewLabel.setBounds(29, 105, 138, 99);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("     Precio /n foto /n Desc");
		label.setIcon(new ImageIcon(I.class.getResource("pala-padel-enebe-rsx-carbon-evo (2).jpg")));
		label.setBounds(229, 105, 138, 99);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("     Precio /n foto /n Desc");
		label_1.setIcon(new ImageIcon(I.class.getResource("1441988783_165642_1442161238_sumario_normal (1).jpg")));
		label_1.setBounds(29, 268, 138, 99);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("     Precio /n foto /n Desc");
		label_2.setIcon(new ImageIcon(I.class.getResource("20171127140647-18041-web (1).jpg")));
		label_2.setBounds(229, 268, 138, 99);
		contentPane.add(label_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(0, 0, 548, 87);
		contentPane.add(btnNewButton);
		
		JLabel lblPrecio = new JLabel("Precio: 5 \u20AC");
		lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrecio.setBounds(29, 209, 80, 23);
		contentPane.add(lblPrecio);
		
		JLabel lblPrecio_1 = new JLabel("Precio: 4 \u20AC");
		lblPrecio_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrecio_1.setBounds(229, 209, 80, 23);
		contentPane.add(lblPrecio_1);
		
		JLabel lblPrecio_3 = new JLabel("Precio: 3 \u20AC");
		lblPrecio_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrecio_3.setBounds(229, 367, 80, 23);
		contentPane.add(lblPrecio_3);
		
		JLabel lblPrecio_2 = new JLabel("Precio: 4 \u20AC");
		lblPrecio_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPrecio_2.setBounds(29, 367, 80, 23);
		contentPane.add(lblPrecio_2);
		setLocationRelativeTo(null);
	}
}
