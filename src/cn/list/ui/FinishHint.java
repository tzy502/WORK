package cn.list.ui;

import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import cn.list.model.Event;

public class FinishHint {
	private JFrame frame;
	public void FinishHintUi(Event event) {
		frame = new JFrame("完成");
		frame.setBounds(100, 100, 310, 195);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u4EFB\u52A1\u5B8C\u6210\uFF01");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 30));
		lblNewLabel.setBounds(70, 10, 160, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u63A5\u4E0B\u6765\u7684\u4EFB\u52A1\u662F ");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 61, 148, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel eventname = new JLabel(event.getName());
		eventname.setFont(new Font("宋体", Font.BOLD, 18));
		eventname.setBounds(168, 61, 127, 31);
		frame.getContentPane().add(eventname);
		
		JButton btnNewButton = new JButton("\u786E\u5B9A");
		btnNewButton.setBounds(95, 123, 93, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel label = new JLabel("\u5F00\u59CB\u65F6\u95F4\u662F ");
		label.setFont(new Font("宋体", Font.BOLD, 18));
		label.setBounds(10, 88, 148, 31);
		frame.getContentPane().add(label);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		String sdate=sdf.format(event.getBeginTime());
		
		JLabel Begintime = new JLabel(sdate);
		Begintime.setFont(new Font("宋体", Font.BOLD, 14));
		Begintime.setBounds(122, 90, 162, 31);
		frame.getContentPane().add(Begintime);
		frame.setVisible(true);
	}
}
