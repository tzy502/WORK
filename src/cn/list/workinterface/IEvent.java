package cn.list.workinterface;

import java.sql.Date;

import cn.list.model.Event;

public interface IEvent {
	public void CreateEvent(String Name,Date BeginTime,Date EndTime,boolean Hint,String Place,String Character,String describe,int level);
	public void AddEvent(Event event);
	public void DelEvent(int ID);
	public void ModifyEvent(int ID);
	public Event SerchEvent(int ID);
}
