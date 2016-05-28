package cn.list.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;                                                                                                                                                                                                                                                                               
import javax.swing.JLayeredPane;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JToolBar;
import javax.swing.RootPaneContainer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import cn.list.control.EventManage;
import cn.list.control.Fortest;
import cn.list.model.Event;
import cn.list.ui.*;
import cn.list.util.BusinessException;
import cn.list.util.DbException;
import cn.list.waste.ToDolistamain;

import javax.swing.JTextPane;
import javax.swing.JTable;
public class MainUi {
	
	private JFrame frame;
	private JTable table;
	public JTable table_1;
	//
	Object tblEventData[][];
	List<Event> allEvent=null;
	DefaultTableModel tabStepModel=new DefaultTableModel();
	Vector<Vector<Object>> eventData = new Vector<Vector<Object>>();
	Vector<String> columnNames = new Vector<String>();
	/**
	 * @wbp.parser.entryPoint
	 */
	public void load(){
		columnNames.add("ID");
		columnNames.add( "\u59D3\u540D");
		columnNames.add("\u8D77\u59CB\u65F6\u95F4");
		columnNames.add("\u7ED3\u675F\u65F6\u95F4");
		columnNames.add("\u63CF\u8FF0");
		columnNames.add("\u662F\u5426\u63D0\u793A");
		columnNames.add("\u4F18\u5148\u7EA7");
		EventManage load =new EventManage();
		try {
			allEvent=load.LoadEvent();
		} catch (BusinessException | DbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(allEvent!=null)
		{
			for(int i=0;i<allEvent.size();i++)
			{
					Event event=allEvent.get(i);
					if(event.isDel()==false&&event.isComplete()==false)
					{
						Vector<Object> eventVdate = new Vector<Object>();
						eventVdate.add(event.getID());
						eventVdate.add(event.getName());
						eventVdate.add(event.getBeginTime());
						eventVdate.add(event.getEndTime());
						eventVdate.add(event.getDescribe());
						eventVdate.add(event.isHint());
						eventVdate.add(event.getLevel());
						eventData.add(eventVdate);
					}
			}
		}
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainUi window = new MainUi();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public MainUi() {
		initialize();
	}
	
	public void initialize() {
		frame = new JFrame("timetable");
		frame.setBounds(200, 200, 450, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.EAST);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 10, 0};
		gbl_panel.rowHeights = new int[]{10, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{1.0, 0.0, 1.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton b1 = new JButton("\u65B0\u5EFA");
		GridBagConstraints gbc_b1 = new GridBagConstraints();
		gbc_b1.insets = new Insets(0, 0, 5, 5);
		gbc_b1.gridx = 4;
		gbc_b1.gridy = 2;
		panel.add(b1, gbc_b1);
		JButton btnNewButton_1 = new JButton("修改");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 4;
		gbc_btnNewButton_1.gridy = 3;
		panel.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("删除");

		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 4;
		gbc_btnNewButton_2.gridy = 4;
		panel.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("清空");
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 4;
		gbc_btnNewButton_3.gridy = 5;
		panel.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JPanel panel_4 = new JPanel();
		GridBagConstraints gbc_panel_4 = new GridBagConstraints();
		gbc_panel_4.gridwidth = 3;
		gbc_panel_4.insets = new Insets(0, 0, 5, 5);
		gbc_panel_4.fill = GridBagConstraints.BOTH;
		gbc_panel_4.gridx = 0;
		gbc_panel_4.gridy = 6;
		panel.add(panel_4, gbc_panel_4);
		
		JButton button = new JButton("\u6DFB\u52A0\u6D4B\u8BD5\u6570\u636E");
		GridBagConstraints gbc_button = new GridBagConstraints();
		gbc_button.insets = new Insets(0, 0, 5, 5);
		gbc_button.gridx = 4;
		gbc_button.gridy = 6;
		panel.add(button, gbc_button);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.SOUTH);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{47, 0, 0, 0, 0, 10, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0, 20, 0, 0, 36, 0, 0, 10, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 1.0, 0.0, 0.0, 1.0, 1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);

		JButton btnNewButton_4 = new JButton("\u751F\u6210\u4FBF\u7B7E");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 1;
		gbc_btnNewButton_4.gridy = 3;
		panel_1.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("\u4FBF\u7B7E\u7BA1\u7406");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_5.gridx = 2;
		gbc_btnNewButton_5.gridy = 3;
		panel_1.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("\u8BBE\u7F6E");
		GridBagConstraints gbc_btnNewButton_6 = new GridBagConstraints();
		gbc_btnNewButton_6.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_6.gridx = 3;
		gbc_btnNewButton_6.gridy = 3;
		panel_1.add(btnNewButton_6, gbc_btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("  \u5173\u4E8E  ");
		GridBagConstraints gbc_btnNewButton_7 = new GridBagConstraints();
		gbc_btnNewButton_7.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_7.gridx = 4;
		gbc_btnNewButton_7.gridy = 3;
		panel_1.add(btnNewButton_7, gbc_btnNewButton_7);
		
		JPanel panel_3 = new JPanel();
		GridBagConstraints gbc_panel_3 = new GridBagConstraints();
		gbc_panel_3.gridwidth = 8;
		gbc_panel_3.gridheight = 5;
		gbc_panel_3.insets = new Insets(0, 0, 5, 0);
		gbc_panel_3.fill = GridBagConstraints.BOTH;
		gbc_panel_3.gridx = 0;
		gbc_panel_3.gridy = 4;
		panel_1.add(panel_3, gbc_panel_3);
		
		JPanel panel_2 = new JPanel();
		GridBagConstraints gbc_panel_2 = new GridBagConstraints();
		gbc_panel_2.gridwidth = 8;
		gbc_panel_2.fill = GridBagConstraints.BOTH;
		gbc_panel_2.gridx = 0;
		gbc_panel_2.gridy = 9;
		panel_1.add(panel_2, gbc_panel_2);
		
		
		
		
		
		JTabbedPane tp = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tp, BorderLayout.CENTER);
		JPanel contentPene1 =new JPanel();			//文字中层ok		
		contentPene1.setBackground(Color.WHITE);
		JPanel contentPene4 =new JPanel();			//按钮中层ok
		//中层over
		this.load();
		table_1=new JTable(eventData, columnNames);
		JScrollPane scrollPane = new JScrollPane(table_1);
		scrollPane.setBackground(Color.white);
		tp.addTab("按优先级显示", null, scrollPane, null);
		
		tp.addTab("p1", contentPene1);
		contentPene1.setLayout(new BorderLayout(0, 0));
		
		JTextPane txtpnAsdfasfd = new JTextPane();
		txtpnAsdfasfd.setText("asdfasfd");
		contentPene1.add(txtpnAsdfasfd, BorderLayout.NORTH);
		tp.setEnabledAt(0,true);
		tp.setTitleAt(1," 按日显示  ");

//		tp.setPreferredSize(new Dimension(100,200));
		tp.setTabPlacement(JTabbedPane.TOP);
		tp.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		tp.addTab("按星期显示", null, scrollPane_1, null);
		


		JMenuBar menu=new JMenuBar();
		frame.setJMenuBar(menu);
		JMenu m1=new JMenu("file");
		JMenu m2=new JMenu("edit");
		JMenu m3=new JMenu("help");
		menu.add(m1);
		menu.add(m2);
		menu.add(m3);
		JMenuItem mi1=new JMenuItem("new");
		JMenuItem mi2=new JMenuItem("open");
		JMenuItem mi3=new JMenuItem("close");
		JMenuItem mi4=new JMenuItem("save");
		JMenuItem mi5=new JMenuItem("save as");
		JMenuItem mi6=new JMenuItem("quit");
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);	
		m1.addSeparator();
		m1.add(mi4);
		m1.add(mi5);
		m1.addSeparator();
		m1.add(mi6);
		mi1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				ToDolistamain b=new ToDolistamain();
				b.todilist();
				
			}
		});
		frame.setVisible(true);
		//以下是按键触发事件
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				NewEventUi a=new NewEventUi();
				a.newEventui();
				
			}
		});
		btnNewButton_1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{	
				
				ModifyEventUi a=new ModifyEventUi();
				EventManage load =new EventManage();	
				int selectRows=table_1.getSelectedRow();
				if(selectRows==-1)
					try {
						throw new BusinessException("必须选中一个事件");
					} catch (BusinessException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				int eventid=(int) table_1.getValueAt(selectRows, 0) ;
				
				Event event = null;
				try {
					event = load.SerchEvent(eventid);
				} catch (BusinessException | DbException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				a.ModifyEventUi(event);
			}	
		});
		btnNewButton_2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				DelEventUi a=new DelEventUi();
				EventManage load =new EventManage();	
				int selectRows=table_1.getSelectedRow();
				if(selectRows==-1)
					try {
						throw new BusinessException("必须选中一个事件");
					} catch (BusinessException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				int eventid=(int) table_1.getValueAt(selectRows, 0) ;
				
				Event event = null;
				try {
					event = load.SerchEvent(eventid);
				} catch (BusinessException | DbException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				a.DelEventUi(event);
			}	
		});
		btnNewButton_3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				ClearEventUi a=new ClearEventUi();
				a.ClearEventUi();
			}	
		});
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				Fortest a=new Fortest();
				try {
					a.test();
				} catch (BusinessException | DbException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}	
		});
		
	}

}
