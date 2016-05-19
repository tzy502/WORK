package cn.list.control;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import cn.list.model.Event;
import cn.list.workinterface.IEvent;

public class EventManage implements IEvent {

	@Override
	public void CreateEvent(String Name,Date BeginTime,Date EndTime,boolean Hint,String Place,String Character,String describe,int level) {
		// 创建新事件

		Event event=new Event();
		event.setName(Name);
		event.setBeginTime(BeginTime);
		event.setEndTime(EndTime);
		event.setHint(Hint);
		event.setComplete(false);
		event.setPlace(Place);
		event.setCharacter(Character);
		event.setDescribe(describe);
		event.setLevel(level);
		event.setDel(false);
		event.setChange(false);
		EventManage a=new EventManage();
		a.AddEvent(event);
		
	}
		
	

	@Override
	public void AddEvent(Event event) {
		// TODO Auto-generated method stub
		int i;
		//
		List<Event> TotalEvent=new ArrayList<Event>();
		if(TotalEvent.size()==0){
			TotalEvent.add(event);
		}
		else
			for(i=1;i<=TotalEvent.size();i++)
			{
				Event a=new Event();
				Event b=new Event();
				a=TotalEvent.get(i);
				b=TotalEvent.get(i+1);
//				if((a.getBeginTime()<event.getBeginTime()) and (b.getBeginTime()>event.getBeginTime()))
//				{
//					TotalEvent.add(i+1, event);
//				}
			}
			
	}
	@Override
	public Event SerchEvent(int ID) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void DelEvent(int ID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void ModifyEvent(int ID) {
		// TODO Auto-generated method stub

	}


	public static void main(String[] args){
		//测试
		EventManage a=new EventManage();
	//	a.CreateEvent(1);
	}
}
