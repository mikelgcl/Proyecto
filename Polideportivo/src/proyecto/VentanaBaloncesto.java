package proyecto;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JRadioButton;

public class VentanaBaloncesto extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaBaloncesto frame = new VentanaBaloncesto();
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
	public VentanaBaloncesto() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 340);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblReservaDeInstalaciones = new JLabel("Reserva de instalaciones");
		lblReservaDeInstalaciones.setForeground(SystemColor.text);
		lblReservaDeInstalaciones.setFont(new Font("Tahoma", Font.BOLD, 37));
		lblReservaDeInstalaciones.setBounds(22, 34, 459, 42);
		contentPane.add(lblReservaDeInstalaciones);
		
		JLabel lblActividadBaloncesto = new JLabel("Baloncesto");
		lblActividadBaloncesto.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblActividadBaloncesto.setBounds(22, 115, 160, 27);
		contentPane.add(lblActividadBaloncesto);
		
		JLabel lblElijaUnaFecha = new JLabel("Elija una hora:");
		lblElijaUnaFecha.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblElijaUnaFecha.setBounds(22, 143, 225, 27);
		contentPane.add(lblElijaUnaFecha);
		
		JButton btnNewButton = new JButton("Atr\u00E1s");
		btnNewButton.setForeground(SystemColor.controlLtHighlight);
		btnNewButton.setBackground(SystemColor.textHighlight);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaPistas nuevaVentana = new VentanaPistas();
				nuevaVentana.setVisible(true);
				VentanaBaloncesto.this.dispose();
			}
		});
		btnNewButton.setBounds(22, 263, 68, 23);
		contentPane.add(btnNewButton);
		
		JLabel label_6 = new JLabel("18:00");
		label_6.setBounds(447, 181, 45, 23);
		contentPane.add(label_6);
		
		JLabel label = new JLabel("8:00");
		label.setBounds(45, 181, 45, 23);
		contentPane.add(label);
		
		JLabel label_5 = new JLabel("16:00");
		label_5.setBounds(380, 181, 45, 23);
		contentPane.add(label_5);
		
		JLabel label_4 = new JLabel("12:00");
		label_4.setBounds(313, 181, 45, 23);
		contentPane.add(label_4);
		
		JLabel label_3 = new JLabel("11:00");
		label_3.setBounds(246, 181, 45, 23);
		contentPane.add(label_3);
		
		JLabel label_2 = new JLabel("10:00");
		label_2.setBounds(179, 181, 45, 23);
		contentPane.add(label_2);
		
		JLabel label_1 = new JLabel("9:00");
		label_1.setBounds(112, 181, 45, 23);
		contentPane.add(label_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.setEnabled(false);
		btnNewButton_1.setBackground(SystemColor.textHighlight);
		btnNewButton_1.setBounds(0, 0, 539, 105);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setBackground(SystemColor.scrollbar);
		btnNewButton_2.setEnabled(false);
		btnNewButton_2.setBounds(22, 181, 68, 23);
		contentPane.add(btnNewButton_2);
		
		JButton button = new JButton("");
		button.setBackground(SystemColor.controlShadow);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button.setEnabled(false);
		button.setBounds(89, 181, 68, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("");
		button_1.setBackground(SystemColor.scrollbar);
		button_1.setEnabled(false);
		button_1.setBounds(424, 181, 68, 23);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("");
		button_2.setBackground(SystemColor.scrollbar);
		button_2.setEnabled(false);
		button_2.setBounds(156, 181, 68, 23);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("");
		button_3.setBackground(SystemColor.controlShadow);
		button_3.setEnabled(false);
		button_3.setBounds(223, 181, 68, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("");
		button_4.setBackground(SystemColor.scrollbar);
		button_4.setEnabled(false);
		button_4.setBounds(290, 181, 68, 23);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("");
		button_5.setBackground(SystemColor.controlShadow);
		button_5.setEnabled(false);
		button_5.setBounds(357, 181, 68, 23);
		contentPane.add(button_5);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Libre");
		rdbtnNewRadioButton.setBounds(22, 211, 68, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnLibre = new JRadioButton("Libre");
		rdbtnLibre.setBounds(89, 211, 68, 23);
		contentPane.add(rdbtnLibre);
		
		
		JRadioButton rdbtnLibre_1 = new JRadioButton("Libre");
		rdbtnLibre_1.setBounds(156, 211, 68, 23);
		contentPane.add(rdbtnLibre_1);
		
		JRadioButton rdbtnLibre_2 = new JRadioButton("Libre");
		rdbtnLibre_2.setBounds(223, 211, 68, 23);
		contentPane.add(rdbtnLibre_2);
		
		JRadioButton rdbtnLibre_3 = new JRadioButton("Libre");
		rdbtnLibre_3.setBounds(290, 211, 68, 23);
		contentPane.add(rdbtnLibre_3);
		
		JRadioButton rdbtnLibre_4 = new JRadioButton("Libre");
		rdbtnLibre_4.setBounds(357, 211, 68, 23);
		contentPane.add(rdbtnLibre_4);
		
		JRadioButton rdbtnLibre_5 = new JRadioButton("Libre");
		rdbtnLibre_5.setBounds(424, 211, 68, 23);
		contentPane.add(rdbtnLibre_5);
		setLocationRelativeTo(null);
		
		
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()==true) {
					rdbtnNewRadioButton.setText("Ocupada");
				}else {
					rdbtnNewRadioButton.setText("Libre");
				}
			
				
			}
		});
		rdbtnLibre.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdbtnLibre.isSelected()==true) {
					rdbtnLibre.setText("Ocupada");
				}else {
					rdbtnLibre.setText("Libre");
				}
			
				
			}
		});
		
		rdbtnLibre_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdbtnLibre_1.isSelected()==true) {
					rdbtnLibre_1.setText("Ocupada");
				}else {
					rdbtnLibre_1.setText("Libre");
				}
			
				
			}
		});
		
		rdbtnLibre_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdbtnLibre_2.isSelected()==true) {
					rdbtnLibre_2.setText("Ocupada");
				}else {
					rdbtnLibre_2.setText("Libre");
				}
			
				
			}
		});
		
		rdbtnLibre_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdbtnLibre_3.isSelected()==true) {
					rdbtnLibre_3.setText("Ocupada");
				}else {
					rdbtnLibre_3.setText("Libre");
				}
			
				
			}
		});
		
		rdbtnLibre_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdbtnLibre_4.isSelected()==true) {
					rdbtnLibre_4.setText("Ocupada");
				}else {
					rdbtnLibre_4.setText("Libre");
				}
			
				
			}
		});
		rdbtnLibre_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdbtnLibre_5.isSelected()==true) {
					rdbtnLibre_5.setText("Ocupada");
				}else {
					rdbtnLibre_5.setText("Libre");
				}
			
				
			}
		});
		
		
	
	}
	
}
