package cn.list.ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class UI {
	static final int x=600;
	static final int y=600;
	public static void UI (){
		JFrame jf=new JFrame ("text");
			jf.setSize(x, y);
		//	jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			jf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			//����ok

			JTabbedPane tp =new JTabbedPane();
			jf.setContentPane(tp);
			//�в㿪ʼ
			JPanel contentPene1 =new JPanel();			//�����в�ok		
			JPanel contentPene2 =new JPanel();			//��ѡ��ť�в�ok
			JPanel contentPene3 =new JPanel();			//��ѡ�в�ok
			JPanel contentPene4 =new JPanel();			//��ť�в�ok
			//�в�over
			tp.addTab("p1", contentPene1);
			tp.setEnabledAt(0,true);
			tp.setTitleAt(0,"����");
			tp.addTab("p2", contentPene2);
			tp.setEnabledAt(1,true);
			tp.setTitleAt(1,"��ѡ");
			tp.addTab("p3", contentPene3);
			tp.setEnabledAt(2,true);
			tp.setTitleAt(2,"��ѡ");
			tp.addTab("p4", contentPene4);
			tp.setEnabledAt(3,true);
			tp.setTitleAt(3,"��ѡ");
	//		tp.setPreferredSize(new Dimension(100,200));
			tp.setTabPlacement(JTabbedPane.LEFT);
			tp.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
			
			
			
			//���ֿ�ʼ
		
			//����over
			//,"North"
			
//����ʼ        
			
			
			//���ֿ�ʼ
			
			JLabel label =new JLabel("��ӭ����");
			contentPene1.add(label);
			contentPene1.setBackground(Color.WHITE);
			//����over
			
			
			//��ѡ��ť��ʼ

			ButtonGroup bg=new ButtonGroup();
			JRadioButton jr1=new JRadioButton("on");
			JRadioButton jr2=new JRadioButton("off",true);
			bg.add(jr1);
			bg.add(jr2);
			//BorderLayout lay1 =new BorderLayout();
		//contentPene2.setLayout(lay);
		//	contentPene2.setLayout(new BorderLayout());
			contentPene2.add(jr1);
			contentPene2.add(jr2);
			//��ѡover
			
			//��ѡ��ʼ
			JCheckBox jc1=new JCheckBox("��һ");
			JCheckBox jc2=new JCheckBox("�ܶ�");
			JCheckBox jc3=new JCheckBox("����");
			JCheckBox jc4=new JCheckBox("����");
			JCheckBox jc5=new JCheckBox("����");
			JCheckBox jc6=new JCheckBox("����");
			JCheckBox jc7=new JCheckBox("����");
			contentPene3.setLayout(new FlowLayout());
			contentPene3.add(jc1);
			contentPene3.add(jc2);
			contentPene3.add(jc3);
			contentPene3.add(jc4);
			contentPene3.add(jc5);
			contentPene3.add(jc6);
			contentPene3.add(jc7);
			
			
			//��ѡover
			
			
			//��ť��ʼ

			JButton b1=new JButton("yes");
			JButton b2=new JButton("no");
			
			contentPene4.add(b1);
			contentPene4.add(b2);
			contentPene4.setBackground(Color.white);
			b1.setToolTipText("ȷ��");
			b1.setFont(new Font("����",Font.BOLD, 16));
			b2.setToolTipText("ȡ��");
		//	b1.setBorder(BorderFactory.createLineBorder(Color.red));
			//��ťover
			
			
			
			
			
			
			
			
			
		//�˵�	
			JMenuBar menu=new JMenuBar();
			jf.setJMenuBar(menu);
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


			

			
			jf.setVisible(true);
		}
	}




/*		
GridBagConstraints constraints1=new GridBagConstraints();

constraints1.fill=GridBagConstraints.NONE;
constraints1.anchor=GridBagConstraints.EAST;
constraints1.weightx=10;
constraints1.weighty=10;
buttonui.add(b1);
buttonui.add(b2);
buttonui.add(b3);
add(jf1,b1,constraints1,4,6,10,10);
add(jf1,b2,constraints1,2,7,10,10);
add(jf1,b3,constraints1,1,8,10,10);
*/


/*
jf.setLayout(lay);
p.add(contentPene1,"c1");
p.add(contentPene2,"c2");
p.add(contentPene3,"c3");
p.add(contentPene4,"c4");
p1.add(last);
p1.add(c1);
p1.add(c2);
p1.add(c3);
p1.add(c4);
p1.add(next);
jf.add(p1);
jf.add(p);

c1.addActionListener(new ActionListener(){

	
	public void actionPerformed(ActionEvent e) {
		card.show(p, "c1");
		
	}
	
});
c2.addActionListener(new ActionListener(){

	
	public void actionPerformed(ActionEvent e) {
		card.show(p, "c2");
		
	}
	
});
c3.addActionListener(new ActionListener(){

	
	public void actionPerformed(ActionEvent e) {
		card.show(p, "c3");
		
	}
	
});
c4.addActionListener(new ActionListener(){

	
	public void actionPerformed(ActionEvent e) {
		card.show(p, "c4");
		
	}
	
});
last.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e) {
		card.previous(p);
		
	}
	
	
});
next.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e) {
		card.next(p);
		
	}
	
	
});

*/