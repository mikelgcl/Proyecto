package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;

public class VentanaPistas extends JFrame {

	private JPanel contentPane;
	private ArrayList<Pista> pistas;

	/**
	 * Launch the application.
	 */
	

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
		
		JButton btnNewButton = new JButton("Atrás");
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
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 39));
		lblNewLabel.setForeground(SystemColor.window);
		lblNewLabel.setBounds(10, 11, 355, 77);
		contentPane.add(lblNewLabel);
		btnNewButton.setBounds(10, 343, 98, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Baloncesto");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BDatos.cargarPista();
				Pista pistaB = null;
				for(Pista pista:pistas) {
					if(pista.getNombre().equals("baloncesto")) {
						pistaB = pista;
					}
				}
				VentanaBaloncesto nuevaVentana = new VentanaBaloncesto(pistaB);
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
				BDatos.cargarPista();
				Pista pistaF = null;
				for(Pista pista:pistas) {
					if(pista.getNombre().equals("futbol")) {
						pistaF = pista;
					}
				}
				VentanaFutbol nuevaVentana = new VentanaFutbol(pistaF);
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
				BDatos.cargarPista();
				Pista pistaT = null;
				for(Pista pista:pistas) {
					if(pista.getNombre().equals("tenis")) {
						pistaT = pista;
					}
				}
				VentanaTenis nuevaVentana = new VentanaTenis(pistaT);
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
				BDatos.cargarPista();
				Pista pistaP2 = null;
				for(Pista pista:pistas) {
					if(pista.getNombre().equals("padel2")) {
						pistaP2 = pista;
					}
				}
				VentanaPadel2 nuevaVentana = new VentanaPadel2(pistaP2);
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
				BDatos.cargarPista();
				Pista pistaP = null;
				for(Pista pista:pistas) {
					if(pista.getNombre().equals("padel")) {
						pistaP = pista;
					}
				}
				VentanaPadel nuevaVentana = new VentanaPadel(pistaP);
				nuevaVentana.setVisible(true);
				VentanaPistas.this.dispose();
			}
		});
		btnTenis.setBounds(136, 232, 104, 98);
		contentPane.add(btnTenis);
		
		JButton btnPadel = new JButton("Tenis 2");
		btnPadel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BDatos.cargarPista();
				Pista pistaT2 = null;
				for(Pista pista:pistas) {
					if(pista.getNombre().equals("tenis2")) {
						pistaT2 = pista;
					}
				}
				VentanaTenis2 nuevaVentana = new VentanaTenis2(pistaT2);
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
		
		JButton reset = new JButton("RESETEAR PISTAS");
		reset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				BDatos.resetPistas();
				BDatos.cargarPista();
				JOptionPane.showMessageDialog(reset, "Las pistas se han reseteado correctamente");
				
				VentanaPistas.this.dispose();
				VentanaOpcion nuevaVentana = new VentanaOpcion(); 
				nuevaVentana.setVisible(true);
				
			}
		});
		reset.setForeground(new Color(255, 255, 255));
		reset.setFont(new Font("Tahoma", Font.BOLD, 13));
		reset.setBackground(new Color(255, 0, 0));
		reset.setBounds(136, 343, 229, 23);
		contentPane.add(reset);
		if (VentanaInicio.vale.getNombre().equals("admin")) {
			reset.setVisible(true);
		} else {
			reset.setVisible(false);
		}
		
		setLocationRelativeTo(null);
		
		// Cargamos reservas
		pistas = BDatos.cargarPista();
	}

}
