package cn.list.control;

import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cn.list.util.*;
import cn.list.model.Event;
import cn.list.workinterface.IEvent;

public class EventManage implements IEvent {

	@Override
	public void CreateEvent(String Name,Date BeginTime,Date EndTime,boolean Hint,String Place,String Character,String describe,int level) throws BusinessException, DbException {
		// 创建新事件

		if(Name==null){
			throw new BusinessException("必须写名字");
		}
		if(BeginTime==null){
			throw new BusinessException("必须写起始时间");
		}
		if(EndTime==null){
			throw new BusinessException("必须写结束时间");
		}				
		Event event=new Event();
		event.setName(Name);
		event.setBeginTime(BeginTime);
		event.setEndTime(EndTime);
		event.setHint(Hint);
		event.setComplete(false);
		event.setPlace(Place);
		event.setCharacter(Character);
		event.setDescribe(describe);
		event.setLevel(level);
		event.setDel(false);
		event.setChange(false);
		EventManage a=new EventManage();
		a.AddEvent(event);
		
	}
		
	

	@Override
	public void AddEvent(Event event) throws DbException {
		// TODO Auto-generated method stub

		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			String sql="INSERT INTO [work].[dbo].[Event] ([Name],[BeginTime],[EndTime],[Hint],[Complete],[Place],"
					+ "[Character],[describe],[level],[del],[change]) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
			java.sql.PreparedStatement pst=conn.prepareStatement(sql);
			java.sql.ResultSet rs=pst.executeQuery();
			pst.setString(1,event.getName());
			pst.setDate(2, event.getBeginTime());
			pst.setDate(3,event.getEndTime());
			if(event.isHint()==true){
				pst.setInt(4, 1);
			}
			else{
				pst.setInt(4, 0);
			}
			if(event.isComplete()==true){
				pst.setInt(5, 1);
			}
			else{
				pst.setInt(5, 0);
			}
			pst.setString(6,event.getPlace());
			pst.setString(7,event.getCharacter());
			pst.setString(8,event.getDescribe());
			pst.setInt(9,event.getLevel());
			pst.setInt(10,0);
			pst.setInt(11,0);
			rs.close();
			pst.execute();
			pst.close();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new DbException(e);
		}
		finally{
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	@Override
	public Event SerchEvent(int ID) throws BusinessException, DbException {
		List<Event> TotalEvent=new ArrayList<Event>();
		Connection conn=null;
		try {
			conn=DBUtil.getConnection();
			String sql="SELECT [ID],[Name],[BeginTime],[EndTime],[Hint],[Complete],[Place],[Character],[describe],[level],[del],[change]"
						+"FROM [work].[dbo].[Event]"+
						"where id=?";
			java.sql.PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1,ID);
			java.sql.ResultSet rs=pst.executeQuery();
			if(!rs.next()) throw new BusinessException("不存在");
			while(rs.next()){				
				Event event=new Event();
				/*
				 * 填充去
				 * */
				
				return event;
			}
			rs.close();
			pst.execute();
			pst.close();
			

		} catch (SQLException e) {
			e.printStackTrace();
			throw new DbException(e);
		}
		finally{
			if(conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return null;
	}
	@Override
	public void DelEvent(Event event) throws BusinessException, DbException, SQLException {
		// TODO Auto-generated method stub
		EventManage a=new EventManage();
		if(a.SerchEvent(event.getID())==null){
			//抛出错误
		}
		else{
			Connection conn=null;
				conn=DBUtil.getConnection();
				String sql="UPDATE [work].[dbo].[Event]SET [del] = 1 WHERE id=1";
				java.sql.PreparedStatement pst=conn.prepareStatement(sql);
				pst.setInt(1,event.getID());
				java.sql.ResultSet rs=pst.executeQuery();
				rs.close();
				pst.execute();
				pst.close();			
		}	

	}

	@Override
	public void ModifyEvent(Event event,Event newevent) {
		// TODO Auto-generated method stub
		List<Event> TotalEvent=new ArrayList<Event>();
		if(TotalEvent.size()==0)
		{
			
		}
			//抛出一场
		else for(int i=0;i<=TotalEvent.size();i++)
		{
			Event event1=new Event();
			event1=TotalEvent.get(i);
			if(event1.getID()==event.getID()){
				//TotalEvent.set(i, element)
			}	
		}
	}


	public static void main(String[] args){
		//测试
		EventManage a=new EventManage();
	//	a.CreateEvent(1);
	}
}
