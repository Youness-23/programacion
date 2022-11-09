package ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JInternalFrame;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MiVentana {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MiVentana window = new MiVentana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MiVentana() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 12));
		frame.getContentPane().setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnInsertarDatos = new JButton("Insertar datos");
		btnInsertarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnInsertarDatos.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnInsertarDatos.setForeground(Color.BLACK);
		btnInsertarDatos.setBackground(Color.WHITE);
		btnInsertarDatos.setBounds(76, 227, 128, 23);
		frame.getContentPane().add(btnInsertarDatos);
		
		JButton btnLimpiarDatos = new JButton("Limpiar datos");
		btnLimpiarDatos.setBackground(Color.WHITE);
		btnLimpiarDatos.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		btnLimpiarDatos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Se ha pulsado el boton limpiar");
				 textField.setText(null);
				 textField_1.setText(null);
				 textField_2.setText(null);
			        
			}
		});
		btnLimpiarDatos.setBounds(230, 227, 115, 23);
		frame.getContentPane().add(btnLimpiarDatos);
		
		textField = new JTextField();
		textField.setBackground(Color.MAGENTA);
		textField.setForeground(new Color(0, 0, 0));
		textField.setBounds(243, 94, 55, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(243, 125, 100, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(243, 156, 100, 20);
		frame.getContentPane().add(textField_2);
		
		JLabel lblNewLabel = new JLabel("Código departamento: ");
		lblNewLabel.setBounds(115, 97, 111, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre departamento: ");
		lblNewLabel_1.setBounds(115, 128, 115, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Localidad Departamento:");
		lblNewLabel_2.setBounds(115, 159, 120, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DATOS DE DEPARTAMENTOS");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setBounds(115, 11, 230, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(240, 230, 140));
		panel.setBounds(46, 72, 358, 129);
		frame.getContentPane().add(panel);
	}
}
