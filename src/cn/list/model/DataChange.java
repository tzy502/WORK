package cn.list.model;

import java.sql.Date;

public class DataChange {
	//���Ҳ��Ҫ������ȥ��������������������������
	//���Ҳ��Ҫ������ȥ��������������������������
	//���Ҳ��Ҫ������ȥ��������������������������
	//���Ҳ��Ҫ������ȥ��������������������������
	//���Ҳ��Ҫ������ȥ��������������������������
	
	//java.util.Date curDate = new java.util.Date();//�½�һ��util���͵�date
	//java.sql.Date date = new java.sql.Date(curDate.getTime());//�������ڵ�ת��
	public java.sql.Date UtilChangSql(java.util.Date UtilData){
		java.sql.Date sqldate=new java.sql.Date(UtilData.getTime());
		return sqldate;
	}
	public java.util.Date SQlChangeUtil(java.sql.Date SqlDate){
		java.util.Date Utildate=new java.sql.Date(SqlDate.getTime());
		
		return Utildate;
	}
	

}
