package cn.list.control;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import cn.list.model.Event;
import cn.list.util.BusinessException;
import cn.list.util.DbException;

public class EventManageText {
	public static void main(String[] args) throws BusinessException, DbException{
		//测试
		EventManageText a=new EventManageText();
		
		a.DelEventtest2();
		
	//	a.CreateEvent(1);
	}
	@Test
	public void testCreateEvent1() throws BusinessException, DbException {
		//全部数据都有
		Date begin=new Date();
		Date end=new Date();
		EventManage test=new EventManage();
		test.CreateEvent("asd", begin, end, true, "asdfasdf", "dsafadsf", "asdfasdf", 2);
		fail("Not yet implemented");
	}
	public void testCreateEvent2() throws BusinessException, DbException {
		//没名字
		Date begin=new Date();
		Date end=new Date();
		EventManage test=new EventManage();
		test.CreateEvent(null, begin, end, true, "asdfasdf", "dsafadsf", "asdfasdf", 2);
		fail("Not yet implemented");
	}	
	public void testCreateEvent3() throws BusinessException, DbException {
		//没名字
		Date begin=new Date();
		Date end=new Date();
		EventManage test=new EventManage();
		test.CreateEvent(null, begin, end, true, "asdfasdf", "dsafadsf", "asdfasdf", 2);
		fail("Not yet implemented");
	}		
	public void testCreateEven4t() throws BusinessException, DbException {
		//没起始时间
		Date begin=new Date();
		Date end=new Date();
		EventManage test=new EventManage();
		test.CreateEvent("AD", null, end, true, "asdfasdf", "dsafadsf", "asdfasdf", 2);
		fail("Not yet implemented");
	}			
	public void testCreateEvent5() throws BusinessException, DbException {
		//没结束时间
		Date begin=new Date();
		Date end=new Date();
		EventManage test=new EventManage();
		test.CreateEvent("asdas", begin, null, true, "asdfasdf", "dsafadsf", "asdfasdf", 2);
		fail("Not yet implemented");
	}			
	public void DelEventtest() throws BusinessException, DbException{
		//正常查询
		EventManage test=new EventManage();
		Event a=new Event();
		a=test.SerchEvent(1);
	}
	public void DelEventtest2() throws BusinessException, DbException{
		//如果查询id不存在
		EventManage test=new EventManage();
		Event a=new Event();
		a=test.SerchEvent(0);
		
		
	}
	
}
