package cn.list.waste;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;

public class FinishHint1 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FinishHint1 window = new FinishHint1();
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
	public FinishHint1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 310, 195);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u4EFB\u52A1\u5B8C\u6210\uFF01");
		lblNewLabel.setFont(new Font("宋体", Font.BOLD, 30));
		lblNewLabel.setBounds(70, 10, 160, 49);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("\u63A5\u4E0B\u6765\u7684\u4EFB\u52A1\u662F ");
		lblNewLabel_1.setFont(new Font("宋体", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 61, 148, 31);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel eventname = new JLabel("New label");
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
		String sdate=sdf.format(date);
		
		JLabel Begintime = new JLabel(sdate);
		Begintime.setFont(new Font("宋体", Font.BOLD, 14));
		Begintime.setBounds(122, 90, 162, 31);
		frame.getContentPane().add(Begintime);
	}
}
