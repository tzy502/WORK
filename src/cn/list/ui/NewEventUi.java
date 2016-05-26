package cn.list.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Locale;

import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.eltima.components.ui.DatePicker;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;

import cn.list.control.EventManage;
import cn.list.util.BusinessException;
import cn.list.util.DbException;

import javax.swing.JRadioButton;
import java.awt.Font;
import javax.swing.JTextPane;
import javax.swing.JList;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class NewEventUi {

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
	private DatePicker datepickbegintime;
	private DatePicker datepickendtime;
	private static final String DefaultFormat = "yyyy-MM-dd HH:mm:ss";
	private Font font=new Font("Times New Roman", Font.BOLD, 14);
	private Dimension dimension=new Dimension(177,24);
	public  void newEventui() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 400);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		
//		begintimetext = new JTextField();
//		begintimetext.setBounds(74, 38, 284, 21);
//		Center.add(begintimetext);
//		begintimetext.setColumns(10);
//		
		
		Date date=new Date();
		datepickbegintime = new DatePicker(date,DefaultFormat,font,dimension);
		datepickbegintime.setBounds(74, 38, 284, 21);
		datepickbegintime.setLocale(Locale.CHINA);
		datepickbegintime.setTimePanleVisible(true);
		Center.add(datepickbegintime);
		
//		endtimetext = new JTextField();
//		endtimetext.setBounds(74, 68, 284, 21);
//		Center.add(endtimetext);
//		endtimetext.setColumns(10);
		
		datepickendtime = new DatePicker(date,DefaultFormat,font,dimension);
		datepickendtime.setBounds(74, 68, 284, 21);
		datepickendtime.setLocale(Locale.CHINA);
		datepickendtime.setTimePanleVisible(true);
		Center.add(datepickendtime);
		
		
		level = new JLabel("\u4F18\u5148\u7EA7");
		level.setBounds(10, 98, 54, 15);
		Center.add(level);
		
		JPanel leveljpane = new JPanel();
		leveljpane.setBounds(74, 90, 150, 24);
		Center.add(leveljpane);
		leveljpane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		final JRadioButton one = new JRadioButton("1");
		one.setSelected(true);
		leveljpane.add(one);
		
		final JRadioButton two = new JRadioButton("2");
		leveljpane.add(two);
		
		final JRadioButton three = new JRadioButton("3");
		leveljpane.add(three);
		
		final JRadioButton four = new JRadioButton("4");
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
		
		final JRadioButton noticeyes = new JRadioButton("\u662F");
		noticeyes.setSelected(true);
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
		
		final JTextArea describetextArea = new JTextArea();
		describetextArea.setLineWrap(true);
		describetextArea.setWrapStyleWord(true); 
		scrollPane.setViewportView(describetextArea);
		frame.setVisible(true);
		//新建的事件
		btnNewButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				String DefaultFormat = "yyyy-MM-dd HH:mm:ss";
				String name =nametext.getText();
				Date begin=(Date)datepickbegintime.getValue();
				Date end=(Date)datepickendtime.getValue();
				boolean hint;
				if(noticeyes.isSelected()==true)
					hint=true;
				else
					hint=false;	
				int level = 0;
				if(one.isSelected()==true)
					level=1;
				if(two.isSelected()==true)
					level=2;
				if(three.isSelected()==true)
					level=3;
				if(four.isSelected()==true)
					level=4;
				String describe=describetextArea.getText();
				EventManage a=new EventManage();
				try {
					a.CreateEvent(name, begin, end, hint, describe, level);
				} catch (BusinessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (DbException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				frame.setVisible(false);
				}	
			}
		});
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				frame.setVisible(false);
			}	
		});	
	}
}

