package cn.list.ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import cn.list.control.EventManage;
import cn.list.util.BusinessException;
import cn.list.util.DbException;

public class ClearEventUi {

	private JFrame frame;
	public void ClearEventUi() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 200);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("是否清空？");
		lblNewLabel.setFont(new Font("SimSun", Font.BOLD, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(70, 23, 161, 37);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("确定");
		btnNewButton.setBounds(35, 120, 93, 23);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				EventManage eventManage=new EventManage();
				try {
					eventManage.ClearEvent();
				} catch (BusinessException | DbException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				frame.setVisible(false);
			}	
		});
		JButton btnNewButton_1 = new JButton("\u53D6\u6D88");
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{

				frame.setVisible(false);
			}	
		});	
		
		btnNewButton_1.setBounds(171, 120, 93, 23);
		frame.getContentPane().add(btnNewButton_1);
		frame.setVisible(true);
}}
