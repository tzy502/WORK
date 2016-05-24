package cn.list.waste;

import javax.swing.*;

import java.awt.*;
public class ToDolistamain extends JPanel {
	static final int x=500;
	static final int y=500;
	public void add(JFrame jf1,Component c,GridBagConstraints constraints, int x,int y,int width,int h,int w ){
		//GridBagConstraints方法将添加空间到容器中
		constraints.gridx=x;
		constraints.gridy=y;
		constraints.gridwidth=width;
		constraints.gridheight=h;//该方法设置组件水平的拉伸幅度，如果为0就说明不拉伸，不为0就随着窗口增大进行拉伸，0到1之间
		constraints.gridwidth=w;//该方法设置组件垂直的拉伸幅度，如果为0就说明不拉伸，不为0就随着窗口增大进行拉伸，0到1之间
		//jf1.getContentPane().
	//	layout.setConstraints(constraints, c)
	}
	
	
	
	public void todilist(){
		JFrame jf1=new JFrame ("时间表");
		jf1.setSize(x, y);
		jf1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		//jf1.setBackground(Color.red);
		//顶层ok
        GridBagLayout layout = new GridBagLayout();
        jf1.setLayout(layout);
        //设置网络布局
        //按钮open
		JPanel buttonui=new JPanel();			//按钮中层ok
		JButton b1=new JButton("新建");
		JButton b2=new JButton("修改");
		JButton b3=new JButton("删除");
		b1.setToolTipText("新建一个安排");
		b2.setToolTipText("对安排进行修改");
		b3.setToolTipText("删除这个安排");
		jf1.add(b1);
		//jf1.add(b2);
	//	jf1.add(b3);
		
		//	b1.setBorder(BorderFactory.createLineBorder(Color.red));
		//按钮over
		//布局开始
        GridBagConstraints s= new GridBagConstraints();//定义一个GridBagConstraints，
        //是用来控制添加进的组件的显示位置
        s.fill = GridBagConstraints.BOTH;
      //该方法是为了设置如果组件所在的区域比组件本身要大时的显示情况
        s.gridwidth=1;//该方法是设置组件水平所占用的格子数，如果为0，就说明该组件是该行的最后一个
        s.weightx = 0;//该方法设置组件水平的拉伸幅度，如果为0就说明不拉伸，不为0就随着窗口增大进行拉伸，0到1之间
        s.weighty=0;//该方法设置组件垂直的拉伸幅度，如果为0就说明不拉伸，不为0就随着窗口增大进行拉伸，0到1之间
        layout.setConstraints(b1, s);//设置组件

		
		
		
		
		//菜单	
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


