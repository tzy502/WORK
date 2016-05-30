package cn.list.control;

import java.util.Date;

import cn.list.ui.MainUi;
import cn.list.util.BusinessException;
import cn.list.util.DbException;
//这个也不要复制下去！！！！！！！！！！！！！
//这个也不要复制下去！！！！！！！！！！！！！
//这个也不要复制下去！！！！！！！！！！！！！
//这个也不要复制下去！！！！！！！！！！！！！
//这个也不要复制下去！！！！！！！！！！！！！
public class Fortest {
	public static void main(String[] args) throws BusinessException, DbException {
		Date begin=new Date();
		Date end=new Date();
		end.setYear(2020);
		EventManage test=new EventManage();
		for(int i=1;i<10;i++)
			test.CreateEvent("测试样例"+i, begin, end, true, "这只是一个测试", 2);
		
}
	public static void test() throws BusinessException, DbException {
		Date begin=new Date();
		Date end=new Date();
		end.setYear(2020);
		EventManage test=new EventManage();
		for(int i=1;i<320;i++)
			test.CreateEvent("测试样例"+i, begin, end, true, "这只是一个测试", 2);
		
}
}
