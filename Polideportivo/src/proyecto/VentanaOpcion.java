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
import java.awt.Font;

public class VentanaOpcion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaOpcion frame = new VentanaOpcion();
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
	public VentanaOpcion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Reserva");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPistas nuevaVentana = new VentanaPistas(); 
				nuevaVentana.setVisible(true);
				VentanaOpcion.this.dispose();
			}
		});
		btnNewButton.setBounds(89, 91, 117, 115);
		contentPane.add(btnNewButton);
		
		JButton btnComprarProductos = new JButton("Comprar productos");
		btnComprarProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaComprar nuevaVentana = new VentanaComprar();
				nuevaVentana.setVisible(true);
				VentanaOpcion.this.dispose();
			}
		});
		btnComprarProductos.setBounds(336, 91, 117, 115);
		contentPane.add(btnComprarProductos);
		
		JButton btnDarDeAlta = new JButton("Dar de alta");
		btnDarDeAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaAlta nuevaVentana = new VentanaAlta();
				nuevaVentana.setVisible(true);
				VentanaOpcion.this.dispose();
			}
		});
		btnDarDeAlta.setBounds(89, 238, 117, 115);
		contentPane.add(btnDarDeAlta);
		
		JButton btnNuevoUsuario = new JButton("Nuevo usuario");
		btnNuevoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaNuevo nuevaVentana = new VentanaNuevo();
				nuevaVentana.setVisible(true);
				VentanaOpcion.this.dispose();
			}
		});
		btnNuevoUsuario.setBounds(336, 238, 117, 115);
		contentPane.add(btnNuevoUsuario);
		
		JLabel lblElijeUnaOperacin = new JLabel("Elije una operaci\u00F3n");
		lblElijeUnaOperacin.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblElijeUnaOperacin.setBounds(23, 25, 339, 37);
		contentPane.add(lblElijeUnaOperacin);
	}

}
