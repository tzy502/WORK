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
	//正常运行
	Event event=new Event();
	EventManage test=new EventManage();
	@Test
	public void testCreateEvent() throws BusinessException, DbException  {
		Date begindate=new Date();
		Date enddate=new Date();
		enddate.setYear(2020);

			test.CreateEvent("单元测试样例", begindate, enddate, true,"仅仅是测试", 1);

	}
	@Test
	public void testCreateEvent1()  {
		//缺少名字
		Date begindate=new Date();
		Date enddate=new Date();
		enddate.setYear(2020);
		try {
			test.CreateEvent(null, begindate, enddate, true,"仅仅是测试", 1);
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
		//缺少起始时间
		Date begindate=new Date();
		Date enddate=new Date();
		enddate.setYear(2020);
		try {
			test.CreateEvent("单元测试样例", null, enddate, true,"仅仅是测试", 1);
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
		//缺少结束时间
		Date begindate=new Date();
		Date enddate=new Date();
		enddate.setYear(2020);
		try {
			test.CreateEvent("单元测试样例", begindate, null, true,"仅仅是测试", 1);
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
		//时间之前
		Date begindate=new Date();
		Date enddate=new Date();
		try {
			test.CreateEvent("单元测试样例", begindate, enddate, true,"仅仅是测试", 1);
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
		//正常查询
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
		//找不到
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
		//ID找不到
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
		//缺少名字
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
		//起始时间和结束时间一样
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
