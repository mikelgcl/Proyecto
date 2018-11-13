package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Canvas;
import javax.swing.UIManager;

public class VentanaInicio extends JFrame {

	private JPanel contentPane;
	private JTextField txtHolaQueTal;
	public static JTextField textUsuario;
	public static JPasswordField textContraseña;
	private ArrayList<Usuario> usuarios;

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
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPolideportivoDeusto_1 = new JLabel("      Polideportivo Deusto");
		lblPolideportivoDeusto_1.setForeground(Color.WHITE);
		lblPolideportivoDeusto_1.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblPolideportivoDeusto_1.setBounds(0, 0, 406, 75);
		contentPane.add(lblPolideportivoDeusto_1);
		
		JButton lblPolideportivoDeusto = new JButton("");
		lblPolideportivoDeusto.setEnabled(false);
		lblPolideportivoDeusto.setBackground(SystemColor.textHighlight);
		lblPolideportivoDeusto.setForeground(Color.WHITE);
		lblPolideportivoDeusto.setFont(new Font("Gadugi", Font.BOLD, 32));
		lblPolideportivoDeusto.setBounds(0, 0, 434, 75);
		contentPane.add(lblPolideportivoDeusto);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(157, 100, 108, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblUsuario.setForeground(SystemColor.textHighlight);
		lblUsuario.setBounds(70, 103, 77, 14);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblContrasea.setForeground(SystemColor.textHighlight);
		lblContrasea.setBounds(70, 134, 77, 14);
		contentPane.add(lblContrasea);
		
		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.setForeground(new Color(0, 0, 0));
		btnEntrar.setBackground(UIManager.getColor("Button.background"));
		btnEntrar.addActionListener(new ActionListener() {
			
			//Login
			public void actionPerformed(ActionEvent e) {
			
				String pass = new String(textContraseña.getPassword());
				String usuarioTxt = textUsuario.getText();
				boolean encontrado = false;
				for(Usuario usuario: usuarios) {

					if (usuario.getNombre().equals(usuarioTxt) && usuario.getContrasenya().equals(pass)) {
						encontrado = true;
						VentanaOpcion nuevaVentana = new VentanaOpcion(); 
						nuevaVentana.setVisible(true);
						VentanaInicio.this.dispose();
						
						
					}
				}
				if(!encontrado) {
					JOptionPane.showMessageDialog(btnEntrar, "Usuario o contraseña incorrectos");
				}
				
			
			}
		});
		btnEntrar.setBounds(157, 168, 108, 20);
		contentPane.add(btnEntrar);
		
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
		
		// Carga de usuario
		usuarios = BDatos.cargar();
		
		//Hora
		/*Calendar calendario = new GregorianCalendar();
		int hora, minutos, segundos;
		hora =calendario.get(Calendar.HOUR_OF_DAY);
		minutos = calendario.get(Calendar.MINUTE);
		segundos = calendario.get(Calendar.SECOND);
		System.out.println(hora + ":" + minutos + ":" + segundos);*/
		

		
		
	}
}
