package cn.list.control;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import cn.list.model.Event;
import cn.list.util.BaseException;
import cn.list.util.BusinessException;
import cn.list.util.DbException;

public class EventManageText {
	public void testCreateEvent1() throws BusinessException, DbException {
		//ȫ�����ݶ���
		Date begin=new Date();
		Date end=new Date();
		EventManage test=new EventManage();
		test.CreateEvent("��������", begin, end, true, "��ֻ��һ������", 2);
		fail("Not yet implemented");
	}
	
	public void testCreateEvent2() throws BusinessException, DbException {
		//û����
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
		
	public void testCreateEven4t() throws BusinessException, DbException {
		//û��ʼʱ��
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
	
	public void testCreateEvent5() throws BusinessException, DbException {
		//û����ʱ��
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
	public void SearchEventtest() throws BusinessException, DbException{
		//������ѯ
		EventManage test=new EventManage();
		Event a=new Event();

		try{
			a=test.SerchEvent(4);	
			System.out.println(a.getID());
			System.out.println(a.getName());
			System.out.println(a.getBeginTime());
			System.out.println(a.getEndTime());
			System.out.println(a.getDescribe());
			System.out.println(a.getLevel());
			System.out.println(a.isHint());
			System.out.println(a.isDel());
			System.out.println(a.isComplete());
		}catch(BaseException e){
			e.printStackTrace();
		}
		
		
	}
	
	public void DelEventtest2() throws BusinessException, DbException{
		//�����ѯid������
		EventManage test=new EventManage();
		Event a=new Event();
		try{
			a=test.SerchEvent(0);		
		}catch(BaseException e){
			e.printStackTrace();
		}

		
	}

}
