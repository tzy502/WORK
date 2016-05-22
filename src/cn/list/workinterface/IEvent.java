package cn.list.workinterface;

import java.sql.Date;

import cn.list.model.Event;
import cn.list.util.BusinessException;
import cn.list.util.DbException;

public interface IEvent {
	public void CreateEvent(String Name,Date BeginTime,Date EndTime,boolean Hint,String Place,String Character,String describe,int level)throws BusinessException, DbException;
	public void AddEvent(Event event)throws DbException;
	public void DelEvent(Event event);
	public void ModifyEvent(Event event,Event newevent);
	public Event SerchEvent(Event event);
}
