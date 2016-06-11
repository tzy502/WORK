package cn.list.astart;
import cn.list.control.CountDown;
import cn.list.ui.MainUi;
public class Start {
	public static void main(String[] args) throws InterruptedException {
		CountDown cd=new CountDown();
		Thread t = new Thread(cd);
		//t.start();
		MainUi start = new MainUi(); 
	//	start.initialize();
		
		
}
	
}
