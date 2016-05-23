package cn.list.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JButton;

public class NewEventUi {

	private JFrame frame;
	private JPanel north;
	private JLabel label;
	private JPanel south;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_1;
	private JPanel center;
	private JLabel lblNewLabel_2;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewEventUi window = new NewEventUi();
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
	public NewEventUi() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		north = new JPanel();
		frame.getContentPane().add(north, BorderLayout.NORTH);
		
		label = new JLabel("\u65B0\u5EFA");
		north.add(label);
		
		south = new JPanel();
		frame.getContentPane().add(south, BorderLayout.SOUTH);
		south.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		btnNewButton = new JButton("新建");
		south.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("     ");
		south.add(lblNewLabel_1);
		
		btnNewButton_1 = new JButton("取消");
		south.add(btnNewButton_1);
		
		center = new JPanel();
		frame.getContentPane().add(center, BorderLayout.CENTER);
		
		lblNewLabel_2 = new JLabel("New label");
		center.add(lblNewLabel_2);
		
		textField = new JTextField();
		center.add(textField);
		textField.setColumns(10);
	}

}
