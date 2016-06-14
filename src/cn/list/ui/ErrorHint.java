package cn.list.ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import cn.list.model.Event;

public class ErrorHint {
	private JFrame frame;
	  public void ErrorHintUI(String str) {
		frame = new JFrame("´íÎó£¡£¡£¡");
		frame.setBounds(100, 100, 210, 140);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel hint = new JLabel(str);
		hint.setVerticalAlignment(SwingConstants.CENTER);
		hint.setBounds(10, 10, 174, 58);
		frame.getContentPane().add(hint);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.setBounds(47, 68, 93, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.setVisible(false);
			}	
		});
		frame.setVisible(true);
	}
}
