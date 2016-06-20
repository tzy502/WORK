package cn.list.astart;
import java.sql.Connection;
import java.sql.SQLException;

import cn.list.control.CountDown;
import cn.list.control.CreateDb;
import cn.list.ui.MainUi;
import cn.list.util.BusinessException;
import cn.list.util.DBUtil;
public class Start {
	public static void main(String[] args) throws InterruptedException, BusinessException {
		
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			throw new BusinessException("数据库连接错误");
		}
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
