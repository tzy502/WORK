package cn.list.waste;

import javax.swing.*;

import java.awt.*;
public class ToDolistamain extends JPanel {
	static final int x=500;
	static final int y=500;
	public void add(JFrame jf1,Component c,GridBagConstraints constraints, int x,int y,int width,int h,int w ){
		//GridBagConstraints��������ӿռ䵽������
		constraints.gridx=x;
		constraints.gridy=y;
		constraints.gridwidth=width;
		constraints.gridheight=h;//�÷����������ˮƽ��������ȣ����Ϊ0��˵�������죬��Ϊ0�����Ŵ�������������죬0��1֮��
		constraints.gridwidth=w;//�÷������������ֱ��������ȣ����Ϊ0��˵�������죬��Ϊ0�����Ŵ�������������죬0��1֮��
		//jf1.getContentPane().
	//	layout.setConstraints(constraints, c)
	}
	
	
	
	public void todilist(){
		JFrame jf1=new JFrame ("ʱ���");
		jf1.setSize(x, y);
		jf1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//jf1.setBackground(Color.red);
		//����ok
        GridBagLayout layout = new GridBagLayout();
        jf1.setLayout(layout);
        //�������粼��
        //��ťopen
		JPanel buttonui=new JPanel();			//��ť�в�ok
		JButton b1=new JButton("�½�");
		JButton b2=new JButton("�޸�");
		JButton b3=new JButton("ɾ��");
		b1.setToolTipText("�½�һ������");
		b2.setToolTipText("�԰��Ž����޸�");
		b3.setToolTipText("ɾ���������");
		jf1.add(b1);
		//jf1.add(b2);
	//	jf1.add(b3);
		
		//	b1.setBorder(BorderFactory.createLineBorder(Color.red));
		//��ťover
		//���ֿ�ʼ
        GridBagConstraints s= new GridBagConstraints();//����һ��GridBagConstraints��
        //������������ӽ����������ʾλ��
        s.fill = GridBagConstraints.BOTH;
      //�÷�����Ϊ���������������ڵ�������������Ҫ��ʱ����ʾ���
        s.gridwidth=1;//�÷������������ˮƽ��ռ�õĸ����������Ϊ0����˵��������Ǹ��е����һ��
        s.weightx = 0;//�÷����������ˮƽ��������ȣ����Ϊ0��˵�������죬��Ϊ0�����Ŵ�������������죬0��1֮��
        s.weighty=0;//�÷������������ֱ��������ȣ����Ϊ0��˵�������죬��Ϊ0�����Ŵ�������������죬0��1֮��
        layout.setConstraints(b1, s);//�������

		
		
		
		
		//�˵�	
		JMenuBar menu=new JMenuBar();
		jf1.setJMenuBar(menu);
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
		

		
		
		jf1.setVisible(true);
	}
	
	
	
}


