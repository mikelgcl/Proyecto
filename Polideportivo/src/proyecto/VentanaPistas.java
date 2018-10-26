package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class VentanaPistas extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPistas frame = new VentanaPistas();
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
	public VentanaPistas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 555, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("<<<");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaOpcion nuevaVentana = new VentanaOpcion(); 
				nuevaVentana.setVisible(true);
				VentanaPistas.this.dispose();
			}
		});
		btnNewButton.setBounds(10, 11, 55, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaBaloncesto nuevaVentana = new VentanaBaloncesto();
				nuevaVentana.setVisible(true);
				VentanaPistas.this.dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Mikel\\Documents\\balon.png"));
		btnNewButton_1.setBounds(58, 109, 98, 98);
		contentPane.add(btnNewButton_1);
		
		JButton btnFtbol = new JButton("");
		btnFtbol.setIcon(new ImageIcon("C:\\Users\\Mikel\\Downloads\\icons8-f\u00FAtbol-100.png"));
		btnFtbol.setBounds(222, 109, 98, 98);
		contentPane.add(btnFtbol);
		
		JButton btnFutbol = new JButton("");
		btnFutbol.setIcon(new ImageIcon("C:\\Users\\Mikel\\Downloads\\icons8-jugador-de-f\u00FAtbol-americano-100.png"));
		btnFutbol.setBounds(384, 109, 98, 98);
		contentPane.add(btnFutbol);
		
		JButton btnAtletismo = new JButton("");
		btnAtletismo.setIcon(new ImageIcon("C:\\Users\\Mikel\\Documents\\pole-vault.png"));
		btnAtletismo.setBounds(384, 265, 98, 98);
		contentPane.add(btnAtletismo);
		
		JButton btnTenis = new JButton("");
		btnTenis.setIcon(new ImageIcon("C:\\Users\\Mikel\\Documents\\tenis.png"));
		btnTenis.setBounds(222, 265, 98, 98);
		contentPane.add(btnTenis);
		
		JButton btnPadel = new JButton("");
		btnPadel.setIcon(new ImageIcon("C:\\Users\\Mikel\\Documents\\cycling-road.png"));
		btnPadel.setBounds(58, 265, 98, 98);
		contentPane.add(btnPadel);
	}

}
