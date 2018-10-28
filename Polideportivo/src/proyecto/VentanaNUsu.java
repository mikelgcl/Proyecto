package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaNUsu extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaNUsu frame = new VentanaNUsu();
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
	public VentanaNUsu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 366, 468);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreandoNuevoUsuario = new JLabel("Creando nuevo usuario");
		lblCreandoNuevoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCreandoNuevoUsuario.setBounds(26, 11, 258, 49);
		contentPane.add(lblCreandoNuevoUsuario);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 71, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setBounds(10, 117, 46, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(10, 163, 46, 14);
		contentPane.add(lblDni);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(10, 205, 46, 14);
		contentPane.add(lblCorreo);
		
		JLabel lblNTarjeta = new JLabel("N. Tarjeta");
		lblNTarjeta.setBounds(10, 248, 63, 14);
		contentPane.add(lblNTarjeta);
		
		JLabel lblFechaDe = new JLabel("Fecha de caducidad");
		lblFechaDe.setBounds(10, 295, 98, 14);
		contentPane.add(lblFechaDe);
		
		JLabel lblNSecreto = new JLabel("N. Secreto");
		lblNSecreto.setBounds(10, 332, 75, 14);
		contentPane.add(lblNSecreto);
		
		JButton btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaInicio nuevaVentana = new VentanaInicio(); 
				nuevaVentana.setVisible(true);
				VentanaNUsu.this.dispose();
			}
		});
		btnAtrs.setBounds(10, 395, 89, 23);
		contentPane.add(btnAtrs);
		
		JButton btnCrearUsuario = new JButton("Crear usuario");
		btnCrearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Meter aquí mensaje de "listo"
				JOptionPane.showMessageDialog(btnCrearUsuario, "Usuario creado correctamente", "", 1);
				
				VentanaInicio nuevaVentana = new VentanaInicio(); 
				nuevaVentana.setVisible(true);
				VentanaNUsu.this.dispose();
			}
		});
		btnCrearUsuario.setBounds(230, 395, 110, 23);
		contentPane.add(btnCrearUsuario);
		
		textField = new JTextField();
		textField.setBounds(118, 71, 149, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(118, 114, 149, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(118, 160, 149, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(118, 202, 149, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(118, 245, 149, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(118, 292, 149, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(118, 326, 39, 23);
		contentPane.add(passwordField);
	}
}
