package cn.list.workinterface;

import java.util.Date;
import java.util.List;
import java.sql.SQLException;

import cn.list.model.Event;
import cn.list.util.BusinessException;
import cn.list.util.DbException;

public interface IEvent {
	public void CreateEvent(String Name,Date BeginTime,Date EndTime,boolean Hint,String describe,int level)throws BusinessException, DbException;
	public void AddEvent(Event event)throws DbException;
	public void DelEvent(Event event)throws BusinessException,DbException, SQLException;
	public void ModifyEvent(Event event,Event newevent)throws BusinessException, DbException, SQLException ;
	public Event SerchEvent(int ID)throws BusinessException, DbException;
	public List<Event> LoadEvent(int ID) throws BusinessException, DbException; 
}
