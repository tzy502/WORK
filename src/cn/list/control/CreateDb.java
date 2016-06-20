package cn.list.control;

import java.sql.Connection;
import java.sql.SQLException;

import cn.list.util.DBUtil;

public class CreateDb {
	public  CreateDb() throws SQLException  {
		Connection conn=null;
		conn=DBUtil.getConnection();
		String sql="CREATE database work ";
		java.sql.PreparedStatement pst=conn.prepareStatement(sql);
		pst.close();
		sql=" CREATE TABLE [dbo].[Event]("
			+ " 	[ID] [int] NOT NULL,"
			+ " 	[Name] [varchar](50) NOT NULL,"
			+ " 	[BeginTime] [datetime] NOT NULL,"
			+ " 	[EndTime] [datetime] NOT NULL,"
			+ " 	[Hint] [bit] NOT NULL,"
			+ " 	[Complete] [bit] NOT NULL,"
			+ " 	[describe] [varchar](300) NULL,"
			+ " 	[level] [int] NOT NULL,"
			+ " 	[del] [bit] NOT NULL,"
			+ " 	[change] [bit] NOT NULL,"
			+ "  CONSTRAINT [PK_Event] PRIMARY KEY CLUSTERED "
			+ " ("
			+ " 	[ID] ASC"
			+ " )WITH (PAD_INDEX  = OFF, IGNORE_DUP_KEY = OFF) ON [PRIMARY]"
			+ " ) ON [PRIMARY]";
		pst=conn.prepareStatement(sql);
		pst.execute();
		pst.close();	
	}
}
