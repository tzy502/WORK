package cn.list.astart;
import java.sql.SQLException;

import cn.list.control.CountDown;
import cn.list.control.CreateDb;
import cn.list.ui.MainUi;
public class Start {
	public static void main(String[] args) throws InterruptedException {
		try {
			CreateDb db=new CreateDb();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CountDown cd=new CountDown();
		Thread t = new Thread(cd);
		t.start();
		MainUi start = new MainUi(); 
	//	start.initialize();
		
		
}
	
}
