package cn.list.workinterface;

import java.util.Date;
import java.util.List;
import java.sql.SQLException;

import cn.list.model.Event;
import cn.list.util.BusinessException;
import cn.list.util.DbException;

public interface IEvent {
	public void CreateEvent(String Name,Date BeginTime,Date EndTime,boolean Hint,String describe,int level)throws BusinessException, DbException;
	//�����¼�
	public void AddEvent(Event event)throws DbException;
	//�½�
	public void DelEvent(Event event)throws BusinessException,DbException, SQLException;
	//ɾ��
	public void ModifyEvent(Event event,Event newevent)throws BusinessException, DbException, SQLException ;
	//�޸�
	public Event SerchEvent(int ID)throws BusinessException, DbException;
	//����
	public Event SerchHintEvent()throws BusinessException, DbException;
	//����Ҫ��ʾ���¼�		
	public List<Event> LoadEventOrderbyID() throws BusinessException, DbException; 
	//���� ��id
	public List<Event> LoadEventOrderbyEndtime() throws BusinessException, DbException; 
	//����������ʱ��
	public List<Event> LoadEventOrderbyBegintime() throws BusinessException, DbException; 
	//��������ʼʱ��
	public void ClearEvent()throws BusinessException, DbException, SQLException; 
	//���
	public void CompleteEvent(Event event)throws BusinessException, DbException, SQLException ;
	//�¼����
	

}
