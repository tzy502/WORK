package cn.list.model;

import java.sql.Date;

public class DataChange {
	//这个也不要复制下去！！！！！！！！！！！！！
	//这个也不要复制下去！！！！！！！！！！！！！
	//这个也不要复制下去！！！！！！！！！！！！！
	//这个也不要复制下去！！！！！！！！！！！！！
	//这个也不要复制下去！！！！！！！！！！！！！
	
	//java.util.Date curDate = new java.util.Date();//新建一个util类型的date
	//java.sql.Date date = new java.sql.Date(curDate.getTime());//进行日期的转换
	public java.sql.Date UtilChangSql(java.util.Date UtilData){
		java.sql.Date sqldate=new java.sql.Date(UtilData.getTime());
		return sqldate;
	}
	public java.util.Date SQlChangeUtil(java.sql.Date SqlDate){
		java.util.Date Utildate=new java.sql.Date(SqlDate.getTime());
		
		return Utildate;
	}
	

}
