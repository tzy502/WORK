package cn.list.workinterface;

import java.util.Date;
import java.util.List;
import java.sql.SQLException;

import cn.list.model.Event;
import cn.list.util.BusinessException;
import cn.list.util.DbException;

public interface IEvent {
	public void CreateEvent(String Name,Date BeginTime,Date EndTime,boolean Hint,String describe,int level)throws BusinessException, DbException;
	//建立事件
	public void AddEvent(Event event)throws DbException;
	//新建
	public void DelEvent(Event event)throws BusinessException,DbException, SQLException;
	//删除
	public void ModifyEvent(Event event,Event newevent)throws BusinessException, DbException, SQLException ;
	//修改
	public Event SerchEvent(int ID)throws BusinessException, DbException;
	//查找
	public Event SerchHintEvent()throws BusinessException, DbException;
	//查找要提示的事件		
	public List<Event> LoadEventOrderbyID() throws BusinessException, DbException; 
	//遍历 按id
	public List<Event> LoadEventOrderbyEndtime() throws BusinessException, DbException; 
	//遍历按结束时间
	public List<Event> LoadEventOrderbyBegintime() throws BusinessException, DbException; 
	//遍历按起始时间
	public void ClearEvent()throws BusinessException, DbException, SQLException; 
	//清空
	public void CompleteEvent(Event event)throws BusinessException, DbException, SQLException ;
	//事件完成
	

}
