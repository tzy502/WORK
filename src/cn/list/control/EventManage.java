package cn.list.control;

import java.sql.Connection;
import java.util.Date;
import java.sql.SQLException;
import java.sql.Timestamp;
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
	public void CreateEvent(String Name,Date BeginTime,Date EndTime,boolean Hint,String describe,int level) throws BusinessException, DbException {
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
//		if(BeginTime.before(EndTime)==false)
//		{
//			throw new BusinessException("结束必须在起始时间之前");
//		}
		
		
		Event event=new Event();
		event.setName(Name);
		event.setBeginTime(BeginTime);
		event.setEndTime(EndTime);
		event.setHint(Hint);
		event.setComplete(false);
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
			int id=0;
			String sql="select count(*) from [Event]";
			java.sql.PreparedStatement pst=conn.prepareStatement(sql);
			java.sql.ResultSet rs=pst.executeQuery();
			while(rs.next())
			{
				id=rs.getInt(1)+1;
			}
			rs.close();
			pst.close();
			
			
			
			 sql="INSERT INTO [work].[dbo].[Event] ([ID],[Name],[BeginTime],[EndTime],[Hint],[Complete],"
					+ "[describe],[level],[del],[change]) VALUES(?,?,?,?,?,?,?,?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setInt(1, id);
			pst.setString(2,event.getName());
			pst.setTimestamp(3, new Timestamp(event.getBeginTime().getTime()));
			pst.setTimestamp(4, new Timestamp(event.getEndTime().getTime()));
			if(event.isHint()==true){
				pst.setInt(5, 1);
			}
			else{
				pst.setInt(5, 0);
			}
				pst.setInt(6, 0);
			pst.setString(7,event.getDescribe());
			pst.setInt(8,event.getLevel());
			pst.setInt(9,0);
			pst.setInt(10,0);
		//	rs.close();
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
		int hint;
		int complete;
		int del;
		try {
			conn=DBUtil.getConnection();
			String sql="SELECT [ID],[Name],[BeginTime],[EndTime],[Hint],[Complete],[describe],[level],[del]"
						+"FROM [work].[dbo].[Event]"+
						"where id=?";
			java.sql.PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1,ID);
			java.sql.ResultSet rs=pst.executeQuery();
			if(!rs.next()) 
				throw new BusinessException("不存在");	
			Event event=new Event();	
			event.setName(rs.getString(2));
			java.sql.Date beginendtime=rs.getDate(3);
			java.util.Date begin=new java.util.Date(beginendtime.getTime());
			event.setBeginTime(begin);
			java.sql.Date sqlendtime=rs.getDate(4);
			java.util.Date end=new java.util.Date(sqlendtime.getTime());
			event.setEndTime(end);
			hint=rs.getInt(5);
			if (hint==0){
				event.setHint(false);
			}
			else{
				event.setHint(true);
			}
			complete=rs.getInt(6);
			if (complete==0){
				event.setComplete(false);
			}
			else{
				event.setComplete(true);
			}
			event.setDescribe(rs.getString(7));
			event.setLevel(rs.getInt(8));
			del=rs.getInt(9);
			if (del==0){
				event.setComplete(false);
			}
			else{
				event.setComplete(true);
			}
		
			rs.close();
			pst.execute();
			pst.close();
			return event;

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
	public void DelEvent(Event event) throws BusinessException, DbException, SQLException {
		// TODO Auto-generated method stub
		EventManage a=new EventManage();
		if(a.SerchEvent(event.getID())!=null){
			Connection conn=null;
			conn=DBUtil.getConnection();
			String sql="UPDATE [work].[dbo].[Event]SET [del] = 1 WHERE id=?";
			java.sql.PreparedStatement pst=conn.prepareStatement(sql);		
			pst.setInt(1,event.getID());
			java.sql.ResultSet rs=pst.executeQuery();
			rs.close();
			pst.execute();
			pst.close();	
		}

	}

	@Override
	public void ModifyEvent(Event event,Event newevent)throws BusinessException, DbException, SQLException  {
		// TODO Auto-generated method stub
		EventManage a=new EventManage();
		if(a.SerchEvent(event.getID())!=null){
			Connection conn=null;
			conn=DBUtil.getConnection();
			String sql="UPDATE [work].[dbo].[Event]SET [del] = 1 WHERE id=?";
			java.sql.PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1,event.getID());
			java.sql.ResultSet rs=pst.executeQuery();
			
			
			
			
			
			
			
			rs.close();
			pst.execute();
			pst.close();	
		}
	}



	@Override
	public List<Event> LoadEvent(int ID) throws BusinessException, DbException {
		List<Event> TotalEvent=new ArrayList<Event>();
		Connection conn=null;
		int hint;
		int complete;
		int del;
		try {
			conn=DBUtil.getConnection();
			String sql="SELECT [ID],[Name],[BeginTime],[EndTime],[Hint],[Complete],[describe],[level],[del]"
						+"FROM [work].[dbo].[Event]"+
						"where id=?";
			java.sql.PreparedStatement pst=conn.prepareStatement(sql);
			pst.setInt(1,ID);
			java.sql.ResultSet rs=pst.executeQuery();
			if(!rs.next()) 
				throw new BusinessException("不存在");				
			while(rs.next()){
				Event event=new Event();	
				event.setName(rs.getString(2));
				java.sql.Date beginendtime=rs.getDate(3);
				java.util.Date begin=new java.util.Date(beginendtime.getTime());
				event.setBeginTime(begin);
				java.sql.Date sqlendtime=rs.getDate(4);
				java.util.Date end=new java.util.Date(sqlendtime.getTime());
				event.setEndTime(end);
				hint=rs.getInt(5);
				if (hint==0){
					event.setHint(false);
				}
				else{
					event.setHint(true);
				}
				complete=rs.getInt(6);
				if (complete==0){
					event.setComplete(false);
				}
				else{
					event.setComplete(true);
				}
				event.setDescribe(rs.getString(7));
				event.setLevel(rs.getInt(8));
				del=rs.getInt(9);
				if (del==0){
					event.setComplete(false);
				}
				else{
					event.setComplete(true);
				}
				TotalEvent.add(event);
			
			}
			
			rs.close();
			pst.execute();
			pst.close();	

				
			return TotalEvent;

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

	public void ClearEvent()throws BusinessException, DbException, SQLException {
		
		Connection conn=null;
		conn=DBUtil.getConnection();
		String sql="DELETE FROM [work].[dbo].[Event] ";
		java.sql.PreparedStatement pst=conn.prepareStatement(sql);		
		pst.execute();
		pst.close();	
	

			
	} 
}
