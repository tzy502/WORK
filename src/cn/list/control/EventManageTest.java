package cn.list.control;

import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import cn.list.model.Event;
import cn.list.util.BusinessException;
import cn.list.util.DbException;

public class EventManageTest {
	//��������
	Event event=new Event();
	EventManage test=new EventManage();
	@Test
	public void testCreateEvent() throws BusinessException, DbException  {
		Date begindate=new Date();
		Date enddate=new Date();
		enddate.setYear(2020);

			test.CreateEvent("��Ԫ��������", begindate, enddate, true,"�����ǲ���", 1);

	}
	@Test
	public void testCreateEvent1()  {
		//ȱ������
		Date begindate=new Date();
		Date enddate=new Date();
		enddate.setYear(2020);
		try {
			test.CreateEvent(null, begindate, enddate, true,"�����ǲ���", 1);
		} catch (BusinessException e) {
			e.printStackTrace();
		} catch (DbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		fail("Not yet implemented");
	}
	@Test
	public void testCreateEvent2()  {
		//ȱ����ʼʱ��
		Date begindate=new Date();
		Date enddate=new Date();
		enddate.setYear(2020);
		try {
			test.CreateEvent("��Ԫ��������", null, enddate, true,"�����ǲ���", 1);
		} catch (BusinessException e) {
			e.printStackTrace();
		} catch (DbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		fail("Not yet implemented");
	}	
	@Test
	public void testCreateEvent3()  {
		//ȱ�ٽ���ʱ��
		Date begindate=new Date();
		Date enddate=new Date();
		enddate.setYear(2020);
		try {
			test.CreateEvent("��Ԫ��������", begindate, null, true,"�����ǲ���", 1);
		} catch (BusinessException e) {
			e.printStackTrace();
		} catch (DbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		fail("Not yet implemented");
	}	
	@Test
	public void testCreateEvent4()  {
		//ʱ��֮ǰ
		Date begindate=new Date();
		Date enddate=new Date();
		try {
			test.CreateEvent("��Ԫ��������", begindate, enddate, true,"�����ǲ���", 1);
		} catch (BusinessException e) {
			e.printStackTrace();
		} catch (DbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		fail("Not yet implemented");
	}	
	

	@Test
	public void testSerchEvent() {
		//������ѯ
		try {
			Event event =test.SerchEvent(1);
			System.out.println(event.getID());
			System.out.println(event.getName());
			System.out.println(event.getBeginTime());
			System.out.println(event.getEndTime());
			System.out.println(event.getDescribe());
			
		} catch (BusinessException e) {
			e.printStackTrace();
		} catch (DbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testSerchEvent1() {
		//�Ҳ���
		try {
			test.SerchEvent(0);
		} catch (BusinessException e) {
			e.printStackTrace();
		} catch (DbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fail("Not yet implemented");
	}

	@Test
	public void testLoadEvent() {
		try {
			test.LoadEvent();
		} catch (BusinessException e) {
			e.printStackTrace();
		} catch (DbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Test
	public void testModifyEvent() throws SQLException {
		event.setID(1);
		event.setName("test");
		Date begindate=new Date();
		Date enddate=new Date();
		enddate.setYear(2020);
		event.setBeginTime(begindate);
		event.setEndTime(enddate);
		event.setDescribe("213");
		Event newevent=new Event();
		newevent.setID(1);
		event.setName("test1");
		event.setBeginTime(begindate);
		enddate.setYear(2030);
		event.setEndTime(enddate);
		event.setDescribe("213");		
		
		try {
			test.ClearEvent();
		} catch (BusinessException e) {
			e.printStackTrace();
		} catch (DbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testModifyEvent1() throws SQLException {
		//ID�Ҳ���
		event.setID(0);
		event.setName("test");
		Date begindate=new Date();
		Date enddate=new Date();
		enddate.setYear(2020);
		event.setBeginTime(begindate);
		event.setEndTime(enddate);
		event.setDescribe("213");
		Event newevent=new Event();
		newevent.setID(1);
		event.setName("test1");
		event.setBeginTime(begindate);
		enddate.setYear(2030);
		event.setEndTime(enddate);
		event.setDescribe("213");		
		
		try {
			test.ClearEvent();
		} catch (BusinessException e) {
			e.printStackTrace();
		} catch (DbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fail("Not yet implemented");
	}
	@Test
	public void testModifyEvent2() throws SQLException {
		//ȱ������
		event.setID(1);
		event.setName("test");
		Date begindate=new Date();
		Date enddate=new Date();
		enddate.setYear(2020);
		event.setBeginTime(begindate);
		event.setEndTime(enddate);
		event.setDescribe("213");
		Event newevent=new Event();
		newevent.setID(1);
		event.setName("test1");
		event.setBeginTime(begindate);
		enddate.setYear(2030);
		event.setEndTime(enddate);
		event.setDescribe("213");		
		
		try {
			test.ClearEvent();
		} catch (BusinessException e) {
			e.printStackTrace();
		} catch (DbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fail("Not yet implemented");
	}
	@Test
	public void testModifyEvent3() throws SQLException {
		//��ʼʱ��ͽ���ʱ��һ��
		event.setID(1);
		event.setName("test");
		Date begindate=new Date();
		Date enddate=new Date();
		enddate.setYear(2020);
		event.setBeginTime(begindate);
		event.setEndTime(enddate);
		event.setDescribe("213");
		Event newevent=new Event();
		newevent.setID(1);
		event.setName("test1");
		event.setBeginTime(begindate);
		enddate.setYear(2030);
		event.setEndTime(begindate);
		event.setDescribe("213");		
		
		try {
			test.ClearEvent();
		} catch (BusinessException e) {
			e.printStackTrace();
		} catch (DbException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fail("Not yet implemented");
	}
	@Test
	public void testClearEvent() throws SQLException {
		
			try {
				test.ClearEvent();
			} catch (BusinessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DbException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}



}
