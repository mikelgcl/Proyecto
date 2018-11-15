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
import java.awt.SystemColor;
import javax.swing.UIManager;

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
		setBounds(100, 100, 540, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Reserva");
		btnNewButton.setBackground(UIManager.getColor("Button.background"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPistas nuevaVentana = new VentanaPistas(); 
				nuevaVentana.setVisible(true);
				VentanaOpcion.this.dispose();
			}
		});
		
		JLabel lblElijeUnaOperacin = new JLabel("Elije una operaci\u00F3n");
		lblElijeUnaOperacin.setForeground(SystemColor.window);
		lblElijeUnaOperacin.setFont(new Font("Tahoma", Font.PLAIN, 40));
		lblElijeUnaOperacin.setBounds(35, 11, 356, 69);
		contentPane.add(lblElijeUnaOperacin);
		btnNewButton.setBounds(35, 128, 131, 115);
		contentPane.add(btnNewButton);
		
		JButton btnComprarProductos = new JButton("Alquilar producto");
		btnComprarProductos.setBackground(UIManager.getColor("Button.background"));
		btnComprarProductos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaComprar nuevaVentana = new VentanaComprar();
				nuevaVentana.setVisible(true);
				VentanaOpcion.this.dispose();
			}
		});
		btnComprarProductos.setBounds(190, 128, 138, 115);
		contentPane.add(btnComprarProductos);
		
		JButton btnDarDeAlta = new JButton("Informaci\u00F3n");
		btnDarDeAlta.setBackground(UIManager.getColor("Button.background"));
		btnDarDeAlta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaInfo nuevaVentana = new VentanaInfo();
				nuevaVentana.setVisible(true);
				VentanaOpcion.this.dispose();
			}
		});
		btnDarDeAlta.setBounds(353, 128, 134, 115);
		contentPane.add(btnDarDeAlta);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setBounds(0, 0, 524, 96);
		contentPane.add(btnNewButton_1);
		setLocationRelativeTo(null);
	}

}
