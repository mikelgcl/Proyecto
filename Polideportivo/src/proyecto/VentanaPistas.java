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
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;

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
		setBounds(100, 100, 392, 416);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Atr�s");
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setForeground(SystemColor.window);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaOpcion nuevaVentana = new VentanaOpcion(); 
				nuevaVentana.setVisible(true);
				VentanaPistas.this.dispose();
			}
		});
		
		JLabel lblNewLabel = new JLabel("Reserva de pistas");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 39));
		lblNewLabel.setForeground(SystemColor.window);
		lblNewLabel.setBounds(21, 11, 326, 77);
		contentPane.add(lblNewLabel);
		btnNewButton.setBounds(10, 343, 98, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Baloncesto");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaBaloncesto nuevaVentana = new VentanaBaloncesto();
				nuevaVentana.setVisible(true);
				VentanaPistas.this.dispose();
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Mikel\\Documents\\balon.png"));
		btnNewButton_1.setBounds(10, 109, 104, 98);
		contentPane.add(btnNewButton_1);
		
		JButton btnFtbol = new JButton("F\u00FAtbol");
		btnFtbol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaFutbol nuevaVentana = new VentanaFutbol();
				nuevaVentana.setVisible(true);
				VentanaPistas.this.dispose();
				
			}
		});
		btnFtbol.setIcon(new ImageIcon("C:\\Users\\Mikel\\Downloads\\icons8-f\u00FAtbol-100.png"));
		btnFtbol.setBounds(136, 109, 104, 98);
		contentPane.add(btnFtbol);
		
		JButton btnFutbol = new JButton("Tenis 1");
		btnFutbol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaTenis nuevaVentana = new VentanaTenis();
				nuevaVentana.setVisible(true);
				VentanaPistas.this.dispose();
			}
		});
		btnFutbol.setIcon(new ImageIcon("C:\\Users\\Mikel\\Downloads\\icons8-jugador-de-f\u00FAtbol-americano-100.png"));
		btnFutbol.setBounds(262, 109, 104, 98);
		contentPane.add(btnFutbol);
		
		JButton btnAtletismo = new JButton("P\u00E1del 2");
		btnAtletismo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				VentanaPadel2 nuevaVentana = new VentanaPadel2();
				nuevaVentana.setVisible(true);
				VentanaPistas.this.dispose();
			}
		});
		btnAtletismo.setIcon(new ImageIcon("C:\\Users\\Mikel\\Documents\\pole-vault.png"));
		btnAtletismo.setBounds(262, 232, 104, 98);
		contentPane.add(btnAtletismo);
		
		JButton btnTenis = new JButton("P\u00E1del 1");
		btnTenis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPadel2 nuevaVentana = new VentanaPadel2();
				nuevaVentana.setVisible(true);
				VentanaPistas.this.dispose();
			}
		});
		btnTenis.setBounds(136, 232, 104, 98);
		contentPane.add(btnTenis);
		
		JButton btnPadel = new JButton("Tenis 2");
		btnPadel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaTenis2 nuevaVentana = new VentanaTenis2();
				nuevaVentana.setVisible(true);
				VentanaPistas.this.dispose();
			}
		});
		btnPadel.setIcon(new ImageIcon("C:\\Users\\Mikel\\Documents\\cycling-road.png"));
		btnPadel.setBounds(10, 232, 104, 98);
		contentPane.add(btnPadel);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(SystemColor.textHighlight);
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setBounds(0, 0, 376, 98);
		contentPane.add(btnNewButton_2);
		setLocationRelativeTo(null);
	}

}
