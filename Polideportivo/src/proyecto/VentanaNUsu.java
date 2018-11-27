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
import java.awt.Color;

public class VentanaNUsu extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textDNI;
	private JTextField textCorreo;
	private JTextField textNum;
	private JTextField textCad;
	private JPasswordField textSecret;
	private JPasswordField textContrasenya;
	private boolean errores;

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
		
		JLabel errorNombre = new JLabel("Entre 1 y 20 car\u00E1cteres ");
		errorNombre.setForeground(Color.RED);
		errorNombre.setFont(new Font("Tahoma", Font.PLAIN, 10));
		errorNombre.setBounds(135, 102, 215, 14);
		contentPane.add(errorNombre);
		errorNombre.setVisible(false);
		
		JLabel errorContrasenya = new JLabel("Entre 1 y 45 car\u00E1cteres ");
		errorContrasenya.setForeground(Color.RED);
		errorContrasenya.setFont(new Font("Tahoma", Font.PLAIN, 10));
		errorContrasenya.setBounds(135, 144, 215, 14);
		contentPane.add(errorContrasenya);
		errorContrasenya.setVisible(false);
		
		JLabel errorDni = new JLabel("10 car\u00E1cteres");
		errorDni.setForeground(Color.RED);
		errorDni.setFont(new Font("Tahoma", Font.PLAIN, 10));
		errorDni.setBounds(135, 186, 215, 14);
		contentPane.add(errorDni);
		errorDni.setVisible(false);
		
		JLabel errorCorreo = new JLabel("Correo no v\u00E1lido");
		errorCorreo.setForeground(Color.RED);
		errorCorreo.setFont(new Font("Tahoma", Font.PLAIN, 10));
		errorCorreo.setBounds(133, 222, 215, 14);
		contentPane.add(errorCorreo);
		errorCorreo.setVisible(false);
		
		JLabel errorNumTar = new JLabel("C\u00F3digo num\u00E9rico de 16 car\u00E1cteres");
		errorNumTar.setForeground(Color.RED);
		errorNumTar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		errorNumTar.setBounds(133, 259, 215, 14);
		contentPane.add(errorNumTar);
		errorNumTar.setVisible(false);
		
		JLabel errorCadTar = new JLabel("C\u00F3digo num\u00E9rico de 6 car\u00E1cteres");
		errorCadTar.setForeground(Color.RED);
		errorCadTar.setFont(new Font("Tahoma", Font.PLAIN, 10));
		errorCadTar.setBounds(133, 296, 215, 23);
		contentPane.add(errorCadTar);
		errorCadTar.setVisible(false);
		
		JLabel errorNumSec = new JLabel("C\u00F3digo num\u00E9rico de 3 car\u00E1cteres");
		errorNumSec.setForeground(Color.RED);
		errorNumSec.setFont(new Font("Tahoma", Font.PLAIN, 10));
		errorNumSec.setBounds(135, 333, 215, 23);
		contentPane.add(errorNumSec);
		errorNumSec.setVisible(false);
		
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
				String din="";
				
				if (textNombre.getText().length()<=20 && textNombre.getText().length()>0) {
					nom = textNombre.getText();
					errorNombre.setVisible(false);
				} else {
					errorNombre.setVisible(true);
					
				}
			 
				if (textContrasenya.getText().length()<=45 && textContrasenya.getText().length()>0) {
				 con = textContrasenya.getText();
				 errorContrasenya.setVisible(false);
				} else {
					errorContrasenya.setVisible(true);
				}
				
				if(textDNI.getText().length()==10) {
				  dnia = textDNI.getText();
				  errorDni.setVisible(false);
				}else {
					errorDni.setVisible(true);
					
				}
				
				if (textCorreo.getText().length()<=45 && textCorreo.getText().length()>=6) {
					 cor = textCorreo.getText();
					 errorCorreo.setVisible(false);
				}else {
					errorCorreo.setVisible(true);
					
				}
				
				if (textNum.getText().length()==16) {
					num = textNum.getText();
					errorNumTar.setVisible(false);
				} else {
					errorNumTar.setVisible(true);
					
				}
				
				
				if (textSecret.getText().length()==3) {
				numc = textSecret.getText();
				errorNumSec.setVisible(false);
				}else {
					errorNumSec.setVisible(true);
				}
				
				if (textCad.getText().length() == 6 ) {
					fecha = textCad.getText();
					errorCadTar.setVisible(false);
				} else {
					errorCadTar.setVisible(true);
					
				}
				
				din = "500";
				
				errores = false;
				
				
				
				
				if (textSecret.getText().length() == 3 && textCad.getText().length() == 6 && textNum.getText().length()==16 
						&& textCorreo.getText().length()<=45 && textCorreo.getText().length()>=6 && textDNI.getText().length()==10
						&& textContrasenya.getText().length()<=45 && textContrasenya.getText().length()>0 
						&& textNombre.getText().length()<=20 && textNombre.getText().length()>0) {
					Usuario usua = new Usuario(nom, con, dnia, cor, num, numc, fecha, din);
					System.out.println(usua);
					BDatos.nuevoUsuario(usua);
					
					JOptionPane.showMessageDialog(btnCrearUsuario, "El usuario se ha creado correctamente");
					VentanaInicio nuevaVentana = new VentanaInicio(); 
					nuevaVentana.setVisible(true);
					VentanaNUsu.this.dispose();
				} else {
					System.out.println("arregla los errores");
				}
					
				
					
				
				
			}
		});
		
		btnCrearUsuario.setBounds(135, 395, 183, 23);
		
		contentPane.add(btnCrearUsuario);
		setLocationRelativeTo(null);
		
		
	}
}
