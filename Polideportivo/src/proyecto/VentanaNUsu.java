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
import java.awt.SystemColor;

public class VentanaNUsu extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textDNI;
	private JTextField textCorreo;
	private JTextField textNum;
	private JTextField textCad;
	private JPasswordField textSecret;
	private JPasswordField textContrasenya;

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
		setBounds(100, 100, 360, 484);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCreandoNuevoUsuario = new JLabel("Creando nuevo usuario");
		lblCreandoNuevoUsuario.setForeground(SystemColor.window);
		lblCreandoNuevoUsuario.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblCreandoNuevoUsuario.setBounds(20, 22, 298, 49);
		contentPane.add(lblCreandoNuevoUsuario);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(33, 119, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblApellidos = new JLabel("Contrase\u00F1a");
		lblApellidos.setBounds(33, 162, 75, 14);
		contentPane.add(lblApellidos);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(33, 203, 46, 14);
		contentPane.add(lblDni);
		
		JLabel lblCorreo = new JLabel("Correo");
		lblCorreo.setBounds(33, 240, 46, 14);
		contentPane.add(lblCorreo);
		
		JLabel lblNTarjeta = new JLabel("N. Tarjeta");
		lblNTarjeta.setBounds(33, 277, 63, 14);
		contentPane.add(lblNTarjeta);
		
		JLabel lblFechaDe = new JLabel("F. de caducidad");
		lblFechaDe.setBounds(33, 318, 98, 14);
		contentPane.add(lblFechaDe);
		
		JLabel lblNSecreto = new JLabel("N. Secreto");
		lblNSecreto.setBounds(33, 356, 75, 14);
		contentPane.add(lblNSecreto);
		
		JButton btnAtrs = new JButton("Atr\u00E1s");
		btnAtrs.setBackground(SystemColor.textHighlight);
		btnAtrs.setForeground(SystemColor.window);
		btnAtrs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaInicio nuevaVentana = new VentanaInicio(); 
				nuevaVentana.setVisible(true);
				VentanaNUsu.this.dispose();
			}
		});
		btnAtrs.setBounds(27, 395, 98, 23);
		contentPane.add(btnAtrs);
		
		JButton btnCrearUsuario = new JButton("Crear usuario");
		btnCrearUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//Crear el nuevo usuario
				String dnia="";
				String numc="";
				String fecha="";
				String cor="";
				String nom="";
				String con="";
				String num="";
				
				if (nom.length()<=20) {
					nom = textNombre.getText();
				} else {
					JOptionPane.showInputDialog("Nombre inferior a 20 caracteres");
				}
			 
				if (con.length()<=45) {
				 con = textContrasenya.getText();
				} else {
					JOptionPane.showInputDialog("Contraseña inferior a 45");
				}
				
				if(dnia.length()<=10) {
				  dnia = textDNI.getText();
				}else {
					JOptionPane.showInputDialog("Dni inferior a 10 caracteres");
				}
				
				if (cor.length()<=45) {
					 cor = textCorreo.getText();
				}else {
					JOptionPane.showInputDialog("Correo inferior a 40 caracteres");
				}
				
				if (num.length()<=16) {
					num = textNum.getText();
				} else {
					JOptionPane.showInputDialog("NUmero inferior a 16 digitos");
				}
				
				
				if (numc.length()<=3) {
				numc = textSecret.getText();
				}else {
					JOptionPane.showInputDialog("Fecha inferior a 999");
				}
				
				if (Integer.parseInt(fecha)<=311299) {
					 fecha = textCad.getText();
				}else {
					JOptionPane.showInputDialog("Fecha inferior a 311299");
				}
				
				
				
				
				Usuario usua = new Usuario(nom, con, dnia, cor, num, numc, fecha);
				System.out.println(usua);
				BDatos.nuevoUsuario(usua);
				
			
				
				VentanaInicio nuevaVentana = new VentanaInicio(); 
				nuevaVentana.setVisible(true);
				VentanaNUsu.this.dispose();
			}
		});
		btnCrearUsuario.setBounds(135, 395, 183, 23);
		contentPane.add(btnCrearUsuario);
		
		textNombre = new JTextField();
		textNombre.setBounds(133, 116, 149, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textDNI = new JTextField();
		textDNI.setBounds(133, 200, 149, 20);
		contentPane.add(textDNI);
		textDNI.setColumns(10);
		
		textCorreo = new JTextField();
		textCorreo.setBounds(133, 237, 149, 20);
		contentPane.add(textCorreo);
		textCorreo.setColumns(10);
		
		textNum = new JTextField();
		textNum.setBounds(133, 274, 149, 20);
		contentPane.add(textNum);
		textNum.setColumns(10);
		
		textCad = new JTextField();
		textCad.setBounds(133, 315, 149, 20);
		contentPane.add(textCad);
		textCad.setColumns(10);
		
		textSecret = new JPasswordField();
		textSecret.setBounds(133, 352, 39, 23);
		contentPane.add(textSecret);
		
		textContrasenya = new JPasswordField();
		textContrasenya.setBounds(133, 159, 149, 20);
		contentPane.add(textContrasenya);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(0, 0, 350, 93);
		contentPane.add(btnNewButton);
		setLocationRelativeTo(null);
		
	}
}
