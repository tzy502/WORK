package cn.list.control;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import cn.list.model.Event;
import cn.list.ui.FinishHint;
import cn.list.util.BusinessException;
import cn.list.util.DbException;

public class CountDown implements Runnable {
	public long time=1;
	Event Nextevent;
	Event HintEvent;
	EventManage eventmanage =new EventManage();
	public CountDown(){

//		long end=event.getEndTime().getTime();
//		System.out.println(event.getEndTime());
//		Date date=new Date();
//		System.out.println(date);
//		long a=date.getTime();
//		time=end-a;
//		time=time/1000;
//		System.out.println(time);
	}
	
	@Override
	public void run() {
		int i=0;
		int j=0;
		while(true){
			HintEvent=null;
			try {
				HintEvent=eventmanage.SerchHintEvent();
			} catch (BusinessException | DbException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			while(HintEvent==null){
				//锁线程暂停5秒
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			long end=HintEvent.getEndTime().getTime();
			Date date=new Date();
			long now=date.getTime();
			time=(end-now)/1000;
			//倒计时
			while (true)
			{
				if(time<=0){
					try {
						eventmanage.CompleteEvent(HintEvent);
					} catch (BusinessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (DbException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					//缺少个调用结束的界面
					
					try {
						Nextevent=eventmanage.SerchHintEvent();
					} catch (BusinessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (DbException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(Nextevent==null){
						break;
					}
					FinishHint finishhint =new FinishHint();
					finishhint.FinishHintUi(Nextevent);
					
					
					
					
					
					
					break;
				}
				System.out.println(HintEvent.getName()+"还剩： " + time + " 秒");
				time--;
				try
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}
			}

		}

	}
		
}

