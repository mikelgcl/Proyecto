package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaInicio extends JFrame {

	private JPanel contentPane;
	private JTextField txtHolaQueTal;
	public static JTextField textUsuario;
	public static JPasswordField textContraseña;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaInicio frame = new VentanaInicio();
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
	public VentanaInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(157, 100, 108, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(70, 103, 77, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(70, 134, 77, 14);
		contentPane.add(lblContrasea);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaOpcion nuevaVentana = new VentanaOpcion(); 
				nuevaVentana.setVisible(true);
				VentanaInicio.this.dispose();
			}
		});
		btnEntrar.setBounds(157, 162, 108, 20);
		contentPane.add(btnEntrar);
		
		JLabel lblPolideportivoDeusto = new JLabel("Polideportivo Deusto");
		lblPolideportivoDeusto.setFont(new Font("Gadugi", Font.BOLD, 26));
		lblPolideportivoDeusto.setBounds(85, 11, 296, 54);
		contentPane.add(lblPolideportivoDeusto);
		
		textContraseña = new JPasswordField();
		textContraseña.setBounds(157, 131, 108, 20);
		contentPane.add(textContraseña);
		
		JButton btnNuevoUsuario = new JButton("Nuevo Usuario");
		btnNuevoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				VentanaNUsu nuevaVentana = new VentanaNUsu(); 
				nuevaVentana.setVisible(true);
				VentanaInicio.this.dispose();
				
			}
		});
		btnNuevoUsuario.setBounds(307, 227, 117, 23);
		contentPane.add(btnNuevoUsuario);
		
		
		
		
	}
	

	
}
