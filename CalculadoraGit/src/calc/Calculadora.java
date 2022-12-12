package calc;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.AbstractListModel;

public class Calculadora {
	
	int primer_operador,segundo_operador,resultado;
	
	String string;

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JList list;
	private final Action action = new SwingAction();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
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
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(28, 107, 79, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.setAction(action);
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.print(resultado);
			}
		});
		btnNewButton_14.setBounds(248, 107, 32, 23);
		frame.getContentPane().add(btnNewButton_14);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(159, 107, 79, 23);
		frame.getContentPane().add(textField_1);
		
		string+=resultado;
		
		JLabel lblNewLabel = new JLabel(string);
		lblNewLabel.setBackground(new Color(0, 0, 160));
		lblNewLabel.setBounds(314, 97, 86, 42);
		frame.getContentPane().add(lblNewLabel);
		
		list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"+", "-", "*", "/"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setToolTipText("");
		list.setBounds(136, 124, 1, 1);
		frame.getContentPane().add(list);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
