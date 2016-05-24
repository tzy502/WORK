package cn.list.control;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import cn.list.model.Event;
import cn.list.util.BaseException;
import cn.list.util.BusinessException;
import cn.list.util.DbException;

public class EventManageText {
	@Test
	public void testCreateEvent1() throws BusinessException, DbException {
		//全部数据都有
		Date begin=new Date();
		Date end=new Date();
		EventManage test=new EventManage();
		test.CreateEvent("asd", begin, end, true, "asdfasdf", 2);
		fail("Not yet implemented");
	}
	@Test
	public void testCreateEvent2() throws BusinessException, DbException {
		//没名字
		Date begin=new Date();
		Date end=new Date();
		EventManage test1=new EventManage();


		
		try{
			test1.CreateEvent(null, begin, end, true, "asdfasdf", 2);
			
		}catch(BaseException e){
			e.printStackTrace();
		}
		fail("Not yet implemented");
		
		
		
	}	
	@Test	
	public void testCreateEven4t() throws BusinessException, DbException {
		//没起始时间
		Date begin=new Date();
		Date end=new Date();
		EventManage test2=new EventManage();

		try{
			test2.CreateEvent("AD", null, end, true, "asdfasdf", 2);
		
		}catch(BaseException e){
			e.printStackTrace();
		}
		
		
		fail("Not yet implemented");
	}		
	@Test
	public void testCreateEvent5() throws BusinessException, DbException {
		//没结束时间
		Date begin=new Date();
		Date end=new Date();
		EventManage test3=new EventManage();
		try{
			test3.CreateEvent("asdas", begin, null, true, "asdfasdf", 2);
		}catch(BaseException e){
			e.printStackTrace();
		}
		
		
		fail("Not yet implemented");
	}		
	@Test
	public void DelEventtest() throws BusinessException, DbException{
		//正常查询
		EventManage test=new EventManage();
		Event a=new Event();

		try{
			a=test.SerchEvent(1);		
		}catch(BaseException e){
			e.printStackTrace();
		}
		
		
	}
	@Test
	public void DelEventtest2() throws BusinessException, DbException{
		//如果查询id不存在
		EventManage test=new EventManage();
		Event a=new Event();
		try{
			a=test.SerchEvent(0);		
		}catch(BaseException e){
			e.printStackTrace();
		}
		
		
		
	}
	
}
