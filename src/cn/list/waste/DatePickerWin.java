package cn.list.waste;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Locale;
import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.UIManager;

import com.eltima.components.ui.DatePicker;

public class DatePickerWin extends JFrame implements ActionListener{

	//************************************
	private DatePicker datepick;
	private static final String DefaultFormat = "yyyy-MM-dd HH:mm:ss";
	private Date date=new Date();
	private Font font=new Font("Times New Roman", Font.BOLD, 14);
	private Dimension dimension=new Dimension(177,24);
	private int[] hilightDays={1,3,5,7};
	private int[] disabledDays={4,6,5,9};
	//************************************
	
	
	private JTextField txtField;
	private JTextField valueField;
	private JButton getButton;
	/**
	 * Create the frame
	 */
	public DatePickerWin()  {
		super();
		setTitle("DatePickerTest--Shyhao");
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);//此句可保证Component位居屏幕中间
		setSize(487, 315);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//*********************************************************************

		//datepick = new DatePicker(); 全部设为默认�?
		//datepick = new DatePicker(date,null,null,null);//自定义参数�??
		//datepick = new DatePicker(date,DefaultFormat,null,dimension);//自定义参数�??
		//datepick = new DatePicker(null,DefaultFormat,null,dimension);//自定义参数�??
		//各参数含义如�?
		//参数1  设置该控件的初始值（可�?�）
		//参数2  设置日期的格�?      （可选）
		//参数3  设置该控件的字体  （可选）
		//参数3  设置该控件的大小（可选）
		//该控件继承自JComponent ，它继承了Jcomponent的属�?
		datepick = new DatePicker(date,DefaultFormat,font,dimension);//自定义参数�??
		
		//datepick.setLocation(137, 83);
		datepick.setBounds(137, 83, 177, 24);
		datepick.setHightlightdays(hilightDays, Color.red);//设置�?个月份中�?要高亮显示的日子
		datepick.setDisableddays(disabledDays);//设置�?个月份中不需要的日子，呈灰色显示
		datepick.setLocale(Locale.CHINA);//设置国家
		datepick.setTimePanleVisible(true);//设置时钟面板可见
		getContentPane().add(datepick);
		
		//*********************************************************************************

		valueField = new JTextField();
		valueField.setBounds(137, 138, 177, 21);
		getContentPane().add(valueField);

		txtField = new JTextField();
		txtField.setBounds(137, 187, 177, 21);
		getContentPane().add(txtField);

		getButton = new JButton();
		getButton.addActionListener(this);
		getButton.setText("get");
		getButton.setBounds(10, 163, 64, 23);
		getContentPane().add(getButton);

		final JLabel valueLabel = new JLabel();
		valueLabel.setText("Value");
		valueLabel.setBounds(88, 141, 43, 15);
		getContentPane().add(valueLabel);

		final JLabel txtLabel = new JLabel();
		txtLabel.setText("Txt");
		txtLabel.setBounds(96, 190, 35, 15);
		getContentPane().add(txtLabel);
		//
	}
	
	public void actionPerformed(ActionEvent e) {

		//***************************************
		Date date=(Date)datepick.getValue();
		String txt=datepick.getText();
		valueField.setText(date.toString());
		txtField.setText(txt);
		
		
		//**************************************
			
	}
	
	

	/**
	 * Launch the application
	 * 
	 * @param args
	 */
	public static void main(String args[]) {

//		try {
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");//Windows外观
//		} catch (Exception e) {}
		
		DatePickerWin frame = new DatePickerWin();
		frame.setVisible(true);

	}




}
