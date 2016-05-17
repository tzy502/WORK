package cn.list.control;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import cn.list.model.Event;
import cn.list.workinterface.IEvent;

public class EventManage implements IEvent {

	@Override
    public void CreateEvent(int ID) {
		// 创建新事件
		 Scanner a=new Scanner(System.in); 
		 int i=0;
		 Event event=new Event();
		 
		 System.out.print("事件名称：");
		 String name = a.nextLine();
		 event.setName(name);//事件输入
		 System.out.print("起始时间（日期-小时:分钟）：");
		 SimpleDateFormat df = new SimpleDateFormat("dd-HH:mm"); 
		 String begintimetext=a.nextLine();
		 Date begintime;
		 
//		 i=a.nextInt();
		 System.out.println("事件名称："+event.getName());
	}

	@Override
	public void AddEvent(int ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void DelEvent(int ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ModifyEvent(int ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public Event SerchEvent(int ID) {
		// TODO Auto-generated method stub
		return null;
	}
	public static void main(String[] args){
		//测试
		EventManage a=new EventManage();
		a.CreateEvent(1);
	}
}
