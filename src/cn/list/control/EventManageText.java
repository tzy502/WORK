package cn.list.control;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import cn.list.model.Event;
import cn.list.util.BusinessException;
import cn.list.util.DbException;

public class EventManageText {
	public static void main(String[] args) throws BusinessException, DbException{
		//����
		EventManageText a=new EventManageText();
		
		a.DelEventtest2();
		
	//	a.CreateEvent(1);
	}
	@Test
	public void testCreateEvent1() throws BusinessException, DbException {
		//ȫ�����ݶ���
		Date begin=new Date();
		Date end=new Date();
		EventManage test=new EventManage();
		test.CreateEvent("asd", begin, end, true, "asdfasdf", "dsafadsf", "asdfasdf", 2);
		fail("Not yet implemented");
	}
	public void testCreateEvent2() throws BusinessException, DbException {
		//û����
		Date begin=new Date();
		Date end=new Date();
		EventManage test=new EventManage();
		test.CreateEvent(null, begin, end, true, "asdfasdf", "dsafadsf", "asdfasdf", 2);
		fail("Not yet implemented");
	}	
	public void testCreateEvent3() throws BusinessException, DbException {
		//û����
		Date begin=new Date();
		Date end=new Date();
		EventManage test=new EventManage();
		test.CreateEvent(null, begin, end, true, "asdfasdf", "dsafadsf", "asdfasdf", 2);
		fail("Not yet implemented");
	}		
	public void testCreateEven4t() throws BusinessException, DbException {
		//û��ʼʱ��
		Date begin=new Date();
		Date end=new Date();
		EventManage test=new EventManage();
		test.CreateEvent("AD", null, end, true, "asdfasdf", "dsafadsf", "asdfasdf", 2);
		fail("Not yet implemented");
	}			
	public void testCreateEvent5() throws BusinessException, DbException {
		//û����ʱ��
		Date begin=new Date();
		Date end=new Date();
		EventManage test=new EventManage();
		test.CreateEvent("asdas", begin, null, true, "asdfasdf", "dsafadsf", "asdfasdf", 2);
		fail("Not yet implemented");
	}			
	public void DelEventtest() throws BusinessException, DbException{
		//������ѯ
		EventManage test=new EventManage();
		Event a=new Event();
		a=test.SerchEvent(1);
	}
	public void DelEventtest2() throws BusinessException, DbException{
		//�����ѯid������
		EventManage test=new EventManage();
		Event a=new Event();
		a=test.SerchEvent(0);
		
		
	}
	
}
