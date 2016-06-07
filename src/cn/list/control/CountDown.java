package cn.list.control;

import java.util.Date;
import java.util.List;

import cn.list.model.Event;
import cn.list.util.BusinessException;
import cn.list.util.DbException;

public class CountDown implements Runnable {
	public long time=1;
	Event event;
	Event newevent;
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
			List<Event> allEvent=null;
			while(eventmanage.isadd==false){
				//Ëø
			}
			try {
				allEvent=eventmanage.LoadEvent();
			} catch (BusinessException | DbException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			for(i=0;i<=allEvent.size();i++){
				if(allEvent.get(i).isComplete()==false&&allEvent.get(i).isDel()==false&&allEvent.get(i).isHint()==true)
					break;
				System.out.println(i);
			}
//			if(i>allEvent.size()){
//				break;
//			}
				
			for(j=0+1;j<=allEvent.size();j++){
				if(allEvent.get(j).isComplete()==false&&allEvent.get(j).isDel()==false&&allEvent.get(j).isHint()==true)
					break;
				System.out.println(j);
			}
//			if(j>allEvent.size()){
//				break;
//			}
//				
			long end=allEvent.get(i).getEndTime().getTime();
			Date date=new Date();
			long now=date.getTime();
			time=(end-now)/1000;
			//µ¹¼ÆÊ±
			while (true)
			{
				if(time<=0){
					break;
				}
				System.out.println(allEvent.get(i).getName()+"»¹Ê££º " + time + " Ãë");
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

