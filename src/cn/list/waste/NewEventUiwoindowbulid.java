package cn.list.waste;

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
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class NewEventUiwoindowbulid {

	private JFrame frame;
	private JPanel north;
	private JLabel label;
	private JPanel south;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JButton btnNewButton_1;
	private JTextField nametext;
	private JTextField begintimetext;
	private JTextField endtimetext;
	private JLabel level;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewEventUiwoindowbulid window = new NewEventUiwoindowbulid();
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
	public NewEventUiwoindowbulid() {
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
		label.setFont(new Font("SimSun", Font.BOLD, 30));
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
		
		JPanel Center = new JPanel();
		frame.getContentPane().add(Center, BorderLayout.CENTER);
		Center.setLayout(null);
		
		JLabel name = new JLabel("\u540D\u79F0");
		name.setBounds(10, 8, 54, 15);
		Center.add(name);
		
		nametext = new JTextField();
		nametext.setBounds(74, 8, 284, 21);
		Center.add(nametext);
		nametext.setColumns(10);
		
		JLabel begintime = new JLabel("\u8D77\u59CB\u65F6\u95F4");
		begintime.setBounds(10, 38, 54, 15);
		Center.add(begintime);
		
		JLabel endtime = new JLabel("\u7ED3\u675F\u65F6\u95F4");
		endtime.setBounds(10, 68, 54, 15);
		Center.add(endtime);
		
		begintimetext = new JTextField();
		begintimetext.setBounds(74, 38, 284, 21);
		Center.add(begintimetext);
		begintimetext.setColumns(10);
		
		endtimetext = new JTextField();
		endtimetext.setBounds(74, 68, 284, 21);
		Center.add(endtimetext);
		endtimetext.setColumns(10);
		
		level = new JLabel("\u4F18\u5148\u7EA7");
		level.setBounds(10, 98, 54, 15);
		Center.add(level);
		
		JPanel leveljpane = new JPanel();
		leveljpane.setBounds(74, 90, 150, 24);
		Center.add(leveljpane);
		leveljpane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton one = new JRadioButton("1");
		leveljpane.add(one);
		
		JRadioButton two = new JRadioButton("2");
		leveljpane.add(two);
		
		JRadioButton three = new JRadioButton("3");
		leveljpane.add(three);
		
		JRadioButton four = new JRadioButton("4");
		leveljpane.add(four);
		ButtonGroup levelBG=new ButtonGroup();
		levelBG.add(one);
		levelBG.add(two);
		levelBG.add(three);
		levelBG.add(four);
		
		JLabel label_1 = new JLabel("\u662F\u5426\u63D0\u793A");
		label_1.setBounds(10, 128, 54, 15);
		Center.add(label_1);
		
		JPanel noticepanel = new JPanel();
		noticepanel.setBounds(73, 118, 89, 24);
		Center.add(noticepanel);
		noticepanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton noticeyes = new JRadioButton("\u662F");
		noticepanel.add(noticeyes);
		
		JRadioButton noticeno = new JRadioButton("\u5426");
		noticepanel.add(noticeno);
		ButtonGroup repeat=new ButtonGroup();	
		repeat.add(noticeyes);
		repeat.add(noticeno);
		
		JLabel notice = new JLabel("\u63D0\u793A\u65B9\u5F0F");
		notice.setBounds(172, 128, 54, 15);
		Center.add(notice);
		
		JComboBox noticecomboBox = new JComboBox();
		noticecomboBox.setBounds(236, 125, 120, 21);
		Center.add(noticecomboBox);
		
		JLabel describe = new JLabel("\u63CF\u8FF0");
		describe.setBounds(10, 159, 54, 15);
		Center.add(describe);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 184, 338, 90);
		Center.add(scrollPane);
		
		JTextArea describetextArea = new JTextArea();
		describetextArea.setLineWrap(true);
		describetextArea.setWrapStyleWord(true); 
		scrollPane.setViewportView(describetextArea);
		
		
		
		
	}
}
