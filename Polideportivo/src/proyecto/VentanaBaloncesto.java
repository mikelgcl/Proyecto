package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaBaloncesto extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaBaloncesto frame = new VentanaBaloncesto();
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
	public VentanaBaloncesto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Mikel\\Downloads\\icons8-jugador-de-f\u00FAtbol-americano-100.png"));
		lblNewLabel.setBounds(10, 101, 98, 100);
		contentPane.add(lblNewLabel);
		
		JLabel lblReservaDeInstalaciones = new JLabel("Reserva de instalaciones");
		lblReservaDeInstalaciones.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblReservaDeInstalaciones.setBounds(10, 48, 240, 42);
		contentPane.add(lblReservaDeInstalaciones);
		
		JLabel lblActividadBaloncesto = new JLabel("Actividad: Baloncesto");
		lblActividadBaloncesto.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblActividadBaloncesto.setBounds(130, 136, 160, 27);
		contentPane.add(lblActividadBaloncesto);
		
		JLabel lblElijaUnaFecha = new JLabel("Elija una fecha:");
		lblElijaUnaFecha.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblElijaUnaFecha.setBounds(10, 212, 225, 27);
		contentPane.add(lblElijaUnaFecha);
		
		JButton btnNewButton = new JButton("<<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPistas nuevaVentana = new VentanaPistas();
				nuevaVentana.setVisible(true);
				VentanaBaloncesto.this.dispose();
			}
		});
		btnNewButton.setBounds(10, 11, 68, 27);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\mikelgc\\Pictures\\Screenshots\\Captura de pantalla (42).png"));
		lblNewLabel_1.setBounds(10, 236, 519, 150);
		contentPane.add(lblNewLabel_1);
	}
}
