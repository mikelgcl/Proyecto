package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;

public class VentanaAlta extends JFrame {

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
	public VentanaAlta() {
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
				VentanaAlta.this.dispose();
			}
		});
		button.setBounds(10, 11, 55, 39);
		contentPane.add(button);
		
		JLabel lblPrueba = new JLabel("Prueba");
		lblPrueba.setFont(new Font("Tahoma", Font.PLAIN, 36));
		lblPrueba.setBounds(212, 131, 297, 134);
		contentPane.add(lblPrueba);
	}

}