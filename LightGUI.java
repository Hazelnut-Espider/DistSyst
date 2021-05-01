package grpc.caihts.lightcontrol;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JSlider;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.List;
import java.awt.Canvas;
import java.awt.Panel;

public class LightGUI extends LightControlServer implements ActionListener {

	private JFrame frame;
//	Calendar today = Calendar.getInstance();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LightGUI window = new LightGUI();
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
	public LightGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.YELLOW);
		frame.setBounds(100, 100, 697, 447);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("SMART HOME CONTROL");
		lblNewLabel.setForeground(Color.YELLOW);
		lblNewLabel.setFont(new Font("Yu Gothic", Font.BOLD, 20));
		lblNewLabel.setBounds(213, 10, 258, 33);
		frame.getContentPane().add(lblNewLabel);
		
		// button command of lights ON
		JButton btnNewButton = new JButton("ON ");
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Light Mode " + btnNewButton.getText());
			}
		});
		btnNewButton.setBounds(99, 77, 97, 64);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1_1 = new JButton("OPEN");
		btnNewButton_1_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Door Mode " + btnNewButton_1_1.getText());
			}
		});
		btnNewButton_1_1.setForeground(Color.BLUE);
		btnNewButton_1_1.setBounds(99, 265, 97, 61);
		frame.getContentPane().add(btnNewButton_1_1);
		
		// button command of lights OFF
		JButton btnOff = new JButton("OFF");
		btnOff.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Light Mode " + btnOff.getText());
			}
		});
		btnOff.setForeground(Color.RED);
		btnOff.setBounds(499, 77, 97, 64);
		frame.getContentPane().add(btnOff);
		
		JLabel lblNewLabel_1 = new JLabel("FRONT-DOOR");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		lblNewLabel_1.setBounds(277, 266, 117, 62);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("LIGHT");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(311, 80, 50, 62);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		// Button command Door-Front CLOSE
		JButton btnNewButton_1_1_1 = new JButton("CLOSE");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Heater Mode " + btnNewButton_1_1_1.getText());
			}
		});
		btnNewButton_1_1_1.setForeground(Color.RED);
		btnNewButton_1_1_1.setBounds(499, 265, 97, 61);
		frame.getContentPane().add(btnNewButton_1_1_1);
		
		// Button command Heater Off
		JButton btnOff_1 = new JButton("OFF");
		btnOff_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Heater Mode " + btnOff_1.getText());
			}
		});
		btnOff_1.setForeground(Color.RED);
		btnOff_1.setBounds(499, 169, 97, 64);
		frame.getContentPane().add(btnOff_1);
		
		// Button command Heater ON
		JButton btnNewButton_1 = new JButton("ON ");
		btnNewButton_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "Heater Mode " + btnNewButton_1.getText());
			}
		});
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setBounds(99, 169, 97, 64);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("HEATER");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		lblNewLabel_1_1_1.setBounds(298, 172, 74, 62);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
//		int year = today.get(Calendar.YEAR);
//		int month = today.get(Calendar.MONTH);
//		int day = today.get(Calendar.DAY_OF_MONTH);
//		int hour = today.get(Calendar.HOUR_OF_DAY);
//		int min = today.get(Calendar.MINUTE);
//		System.out.printf(" %02d/%02d/%d ", day, (month + 1), year + "\r\n\r\n %02d/%02d ", hour, min);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		
	}
}
